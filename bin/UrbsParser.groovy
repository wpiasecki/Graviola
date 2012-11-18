/**
 * Script para parsear os horarios de onibus disponíveis no site da urbs, 
 * jogá-los nas classes de modelo definidas, e processá-las usando XStream
 * O site da urbs é parseado usando a própria URL do Java suavizada com 
 * NekoHtml.
 * 
 * Validar com amostras:
 * [  ] Bom retiro/puc
 * [  ] Cabral osório
 * [  ] Jd. das graças
 * [  ] Tingui
 * [  ] ctba/independencia
 * [  ] ctba/posto paris
 * [  ] pedro moro
 * 
 * Curiosidade: java ocupou em média 1.3% de CPU durante o processamento; 
 * depende da latencia de rede
 */

import groovy.transform.*
import java.text.SimpleDateFormat
import java.sql.Time
import com.thoughtworks.xstream.XStream


nekoParser = new org.cyberneko.html.parsers.SAXParser()
nekoParser.setProperty( 'http://cyberneko.org/html/properties/default-encoding', 'UTF-8' )


def xmlParser(String url) {
  new XmlParser(nekoParser).parse url
}


urbsSelect = xmlParser "http://www.urbs.curitiba.pr.gov.br/" breadthFirst() find { 
	it.getClass() == Node && 
	it.name().toString().endsWith('SELECT') &&
	it.@name == 'linha'
}


@ToString
class Onibus {
	String nome
	String codigo
	List<Ponto> pontos = []
}

enum TipoDia { 
	DIA_UTIL("Dia útil"), SABADO("Sábado"), DOMINGO("Domingo")
	private String descricao
	private TipoDia(String s) { descricao = s }
	static TipoDia findByDescricao(String descricao) {
		switch (descricao) {
			case ["SÁBADO", "SABADO"]: return SABADO
			case "DOMINGO": return DOMINGO
			case ["DIA ÚTIL", 'DIA UTIL']: return DIA_UTIL
		}
	}
}

@ToString
class Ponto {
	String nome
	TipoDia tipoDia
	String validoAPartirDe
	List<Time> horarios = []
}

def timeFormat = new SimpleDateFormat('HH:mm')
def urbsUrl = "http://www.urbs.curitiba.pr.gov.br/horario-de-onibus/codigo"
def onibusList = []

def codigosLinhasUrbs = urbsSelect.OPTION.collect { it.@value.toString() }

def curr = { System.currentTimeMillis() }

codigosLinhasUrbs.eachWithIndex { codigoOnibus, index ->
	
	def t0 = curr()
	
	def onibus = new Onibus(codigo:codigoOnibus)
	onibusList << onibus
	
	def urlBusao = urbsUrl.replace('codigo', codigoOnibus)
	
	def html = xmlParser urlBusao
	
	def mainDiv = html.breadthFirst().find { 
		it.getClass() == Node && 
		it.name().toString().endsWith('DIV') &&
		it.@id == 'main'
	}
	
	def nomeBusaoDiv = mainDiv.breadthFirst().find { it.@class == 'clearfix margin-big-top width96' }
	onibus.nome = nomeBusaoDiv.H2.text()
	
	def pontoHorarioDivs = mainDiv.breadthFirst().findAll { 
		it.@class == 'bg-white round-bl-60 width96 margin-medium-top clearfix' 
	}
	
	pontoHorarioDivs.each { pontoHorarioDiv ->
		def nomePonto = pontoHorarioDiv.DIV.H3.text().replace( 'Ponto: ', '' )
		def dataTipoDia = pontoHorarioDiv.DIV.P.text().replace( 'Válido a partir de: ', '' ).split( '-' )
		def tipoDia = TipoDia.findByDescricao( dataTipoDia[1].trim() )
		def validoAPartirDe = dataTipoDia[0].trim() // dateFormat.parse( dataTipoDia[0] )
		def horarios = []
		
		def ponto = new Ponto(nome:nomePonto, validoAPartirDe: validoAPartirDe, tipoDia: tipoDia, horarios: horarios)
		onibus.pontos << ponto
		
		pontoHorarioDiv.DIV.UL.LI.each { li ->
			def dataHorario = timeFormat.parse(li.text())
			ponto.horarios << new Time(dataHorario.time)
		}
	}
	
	println "${onibus.nome} processado em ${curr() - t0}ms. Processado ${index + 1} de ${codigosLinhasUrbs.size()}"
	
}


println onibusList.join("\n")

def xstream = new XStream()
xstream.alias( 'HorariosOnibus', List.class )
xstream.alias( 'Horario', Time.class )

def nomeArquivo = "linhasUrbs_${curr()}.xml"
new File(nomeArquivo).write xstream.toXML( onibusList )
println "${nomeArquivo} gravado com sucesso"



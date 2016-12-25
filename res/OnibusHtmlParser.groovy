import com.thoughtworks.xstream.XStream
import java.sql.Time
import java.text.SimpleDateFormat
@Grab('net.sourceforge.nekohtml:nekohtml:1.9.22')
import org.cyberneko.html.parsers.SAXParser

class OnibusHtmlParser {
    def urbsUrl
    def qtdeLinhas
    def contaLinhas = 0
  
  def nekoParser = { 
    def neko = new org.cyberneko.html.parsers.SAXParser()
    neko.setProperty( 'http://cyberneko.org/html/properties/default-encoding', 'UTF-8' ) 
    neko
  }()


  def xmlParser(String url) {
    new XmlParser(nekoParser).parse url
  }
  
  
  def curr = { System.currentTimeMillis() }
  
  
  def obterHorarioDaPagina(codigoOnibus) {
    def onibusList = []
    def t0 = curr()
	
	  def onibus = new Onibus(codigo : codigoOnibus)
	  onibusList << onibus
	
	  def urlBusao = urbsUrl + "/$codigoOnibus"
	  
	  def html = xmlParser urlBusao
	
	  def mainDiv = html.breadthFirst().find { 
		  it.getClass() == Node && 
		  it.name().toString().endsWith('DIV') &&
		  it.@id == 'main'
	  }
	  
	  assert mainDiv
	
	  def nomeBusaoDiv = mainDiv.breadthFirst().find { 
	    it.getClass() != String && it.@class == "clearfix margin-big-top width96"
	  }
	  
	  onibus.nome = nomeBusaoDiv.H2.text()[6..-1]
	  
	  def pontoHorarioDivs = mainDiv.breadthFirst().findAll { 
		  it.getClass() != String && it.@class == 'bg-white round-bl-60 width96 margin-medium-top clearfix' 
	  }
	
	  def timeFormat = new SimpleDateFormat('HH:mm')
	  pontoHorarioDivs.each { pontoHorarioDiv ->
		  def nomePonto = pontoHorarioDiv.DIV.H3.text().replace( 'Ponto: ', '' )
		  def dataTipoDia = pontoHorarioDiv.DIV.P.text().trim().replace( 'Válido a partir de: ', '' )[0..9]
		  def tipoDia = TipoDia.findByDescricao( pontoHorarioDiv.DIV.P.B.text() )
		  def validoAPartirDe = dataTipoDia.trim() // dateFormat.parse( dataTipoDia[0] )
		  def horarios = []
		
		  def ponto = new Ponto(nome:nomePonto, validoAPartirDe: validoAPartirDe, tipoDia: tipoDia, horarios: horarios)
		  onibus.pontos << ponto
		
		  pontoHorarioDiv.DIV.UL.LI.each { li ->
			  def dataHorario = timeFormat.parse(li.text())
			  ponto.horarios << new Time(dataHorario.time)
		  }
	  }
	
	  println "${onibus.nome} processado em ${curr() - t0}ms. Processado ${++contaLinhas} de ${qtdeLinhas}"
	  
	  onibusList
  }
  
  
  def writeXml( List onibusList, fileLabel = new Date().format("yyyy-MM-dd_HH'h'mm") )
  {
    def xstream = new XStream()
    xstream.alias( 'HorariosOnibus', List.class )
    xstream.alias( 'Horario', Time.class )
    
    def nomeArquivo = "linhasUrbs_${fileLabel}.xml"
    new File(nomeArquivo).write xstream.toXML( onibusList )
    println "${nomeArquivo} gravado com sucesso"
  }
  
}

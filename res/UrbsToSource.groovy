import java.text.SimpleDateFormat

def horariosOnibus = new XmlSlurper().parse(new File("linhasUrbs_1342304988292.xml"))

def code = ''

/*
 * geração das constantes com o nome de cada onibus
 */
horariosOnibus.Onibus.each { onibus ->
	code += """
		public static final String ONIBUS${onibus.codigo} = "${onibus.nome}";"""
}
println code



/*
 * Geração do método com a listagem de linhas
 */
code = """
	public static Vector getLinhasOnibus() {
		Vector linhasOnibus = new Vector();
""" 
horariosOnibus.Onibus.each { onibus ->
	code += """
		linhasOnibus.addElement(ONIBUS${onibus.codigo});"""
}

code += """	
		return linhasOnibus;
	} """

println code 



/*
 * Geração do método para obter a linha de onibus
 */
code = """
		public static Onibus getByNome(String nome) {"""

horariosOnibus.Onibus.each { onibus ->
	code += """
		if (nome == ONIBUS${onibus.codigo}) return Onibus${onibus.codigo}.create();"""
	
}
code += """
		throw new IllegalArgumentException("Nenhum onibus com o nome " + nome);
	}"""

println code




/*
 * Geração dos objetos de modelo
 */
println "--> escrevendo arquivos de código fonte em 5 segundos..."; Thread.sleep(5000); println "escrevendo..."
 
def dateParse = new SimpleDateFormat('yyyy-MM-dd HH:mm:sss')
def dateFormat = new SimpleDateFormat('dd/MM/yyyy')
def replaceQuote = { s -> print s; def replaced = s.toString().replaceAll('"', '\"'); println "; replaced=$replaced"; replaced }

horariosOnibus.Onibus.each { onibus ->
	
	def j2meCode = """
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus${onibus.codigo} {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("${onibus.nome}");
		onibus.setCodigo("${onibus.codigo}");"""
		
	onibus.pontos.Ponto.eachWithIndex { ponto, i ->
	
		def longDate = dateParse.parse(ponto.validoAPartirDe.toString()).time
	
		j2meCode += """
		Ponto ponto$i = new Ponto();
		ponto${i}.setNome("${replaceQuote( ponto.nome )}");
		ponto${i}.setTipoDia(TipoDia.getTipoDia("${ponto.tipoDia}"));
		ponto${i}.setValidoAPartirDe("${dateFormat.format( dateParse.parse( ponto.validoAPartirDe.text() ) )}");
		onibus.getPontos().addElement(ponto${i});"""
		
		ponto.horarios.Horario.each { horario ->
			j2meCode += """
		ponto${i}.getHorarios().addElement("${horario.text()[0..4]}");"""
		}
	}
	
	j2meCode += """
		return onibus;
		}
	}"""
	
	new File("./graviola/Onibus${onibus.codigo}.java").write j2meCode
}


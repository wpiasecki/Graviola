import java.text.SimpleDateFormat

def horariosOnibus = new XmlSlurper().parse(new File("linhasUrbs_1342304988292.xml"))

/*
 * Geração do método com a listagem de linhas
 */
def code = """
	public static Vector getLinhasOnibus() {
		Vector linhasOnibus = new Vector();
""" 
horariosOnibus.Onibus.each { onibus ->
	code += """
		linhasOnibus.addElement("$onibus.nome");"""
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
		if (nome.equals("$onibus.nome")) {
			return Onibus${onibus.codigo}.create();
		}
	"""
	
}
code += """
		throw new IllegalArgumentException("Nenhum onibus com o nome " + nome);
	}"""

println code



/*
 * Geração dos objetos de modelo
 */
def dateParse = new SimpleDateFormat('yyyy-MM-dd HH:mm:sss')
def dateFormat = new SimpleDateFormat('dd/MM/yyyy')

horariosOnibus.Onibus.each { onibus ->
	
	def j2meCode = """
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus${onibus.codigo} {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("${onibus.nome}");
		onibus.setCodigo("${onibus.codigo}");"""
		
	onibus.pontos.Ponto.eachWithIndex { ponto, i ->
	
		def longDate = dateParse.parse(ponto.validoAPartirDe.toString()).time
	
		j2meCode += """
		Ponto ponto$i = new Ponto();
		ponto${i}.setNome("${ponto.nome}");
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


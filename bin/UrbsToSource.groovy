import java.text.SimpleDateFormat

def horariosOnibus = new XmlSlurper().parse new File( args[0] )

def code = '''
package br.will.graviola.service;

import java.util.Vector;

import br.will.graviola.model.*;
import br.will.graviola.model.onibus.*;
import br.will.graviola.util.StringUtil;

public class HorarioOnibusService
{
	public static Vector findLinhasByNome(String nome)
	{
		return findLinhasByNome(nome, getLinhasOnibus());
	}
	
	
	public static Vector findLinhasByNome(String nome, Vector linhas) 
	{
		Vector linhasEncontradas = new Vector();
		String nomeUpper = nome.toUpperCase();
		
		for (int i = 0; i < linhas.size(); i++) 
		{
			String linha = (String) linhas.elementAt(i);
			
			if (StringUtil.contem(nomeUpper, linha)) {
				linhasEncontradas.addElement(linha);
			}
		}
		
		return linhasEncontradas;
	}
'''

/*
 * geração das constantes com o nome de cada onibus
 */
horariosOnibus.Onibus.each { onibus ->
	code += """
	public static final String ONIBUS${onibus.codigo} = "${onibus.nome.text()[6..-1]}";"""
}



/*
 * Geração do método com a listagem de linhas
 */
code += """
	public static Vector getLinhasOnibus() {
		Vector linhasOnibus = new Vector();
""" 
horariosOnibus.Onibus.each { onibus ->
	code += """
		linhasOnibus.addElement(ONIBUS${onibus.codigo});"""
}

code += """	
		return linhasOnibus;
	} 
"""




/*
 * Geração do método para obter a linha de onibus
 */
code += """
	public static Onibus getByNome(String nome)
	{
		Onibus onibus = create( nome );
		
		HoraService service = new HoraService();
		
		for (int i = 0; i < onibus.getPontos().size(); i++)
		{
			Ponto ponto = (Ponto) onibus.getPontos().elementAt(i);
			ponto.setHorariosMarcados( service.findProximosHorarios(ponto) );
		}
		
		return onibus;
	}
	
	public static Onibus create(String nome) 
	{
"""

horariosOnibus.Onibus.each { onibus ->
	code += """
		if (nome.equals( ONIBUS${onibus.codigo} )) return Onibus${onibus.codigo}.create();"""
	
}
code += """
		throw new IllegalArgumentException("Nenhum onibus com o nome [" + nome + "]");
	}
}"""



new File("./graviola/HorarioOnibusService.java").write code

//System.exit 0



/*
 * Geração dos objetos de modelo
 */
println "--> escrevendo arquivos de código fonte em 3 segundos..."; Thread.sleep(3000); println "escrevendo..."
 
def replaceQuote = { s -> print s; def replaced = s.toString().replaceAll('\"', "'"); println "; replaced=$replaced"; replaced }

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
	
		j2meCode += """
		Ponto ponto$i = new Ponto();
		ponto${i}.setNome("${replaceQuote( ponto.nome )}");
		ponto${i}.setTipoDia(TipoDia.getTipoDia("${ponto.tipoDia}"));
		ponto${i}.setValidoAPartirDe("${ponto.validoAPartirDe}");
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
	
	new File("./graviola/onibus/Onibus${onibus.codigo}.java").write j2meCode
}


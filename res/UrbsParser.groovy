import groovy.transform.*
import java.text.SimpleDateFormat
import java.sql.Time
import com.thoughtworks.xstream.XStream
import javax.script.ScriptEngineManager

/**
 * Script para parsear os horarios de onibus disponíveis no site da urbs, 
 * jogá-los nas classes de modelo definidas, e processá-las usando XStream
 * O site da urbs é parseado usando a própria URL do Java normalizada com 
 * NekoHtml.
 * 
 * Curiosidade: java ocupou em média 1.3% de CPU durante o processamento; 
 * depende da latencia de rede
 */

class UrbsJsParser {

	static urbsUrl = "http://urbs.curitiba.pr.gov.br/horario-de-onibus"

	
	def parseSelect() {
	  new OnibusHtmlParser()
	    .xmlParser(urbsUrl)
	    .breadthFirst()
	    .find { it in Node && it.@id == "compHritLinha" }
	    .children()
	}
	
	
	static main(args) 
	{
		def urbs = new UrbsJsParser()
		
		def linhas = urbs.parseSelect()
		
		def onibusParser = new OnibusHtmlParser(urbsUrl: urbsUrl, qtdeLinhas: linhas.size())
		
		def i = 0;
		def onibusList = linhas.inject([]) { list, linha ->
		  try {
		    if (i++ < 3) list << onibusParser.obterHorarioDaPagina(linha.@value) else list
		  } catch(e) { System.err.println "Erro ao processar linha $linha" }
		}
		
		onibusParser.writeXml onibusList.flatten()
	}
	
}

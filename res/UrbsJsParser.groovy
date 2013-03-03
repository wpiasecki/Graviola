import groovy.transform.*
import java.text.SimpleDateFormat
import java.sql.Time
import com.thoughtworks.xstream.XStream
import javax.script.ScriptEngineManager


class UrbsJsParser {

	static urbsUrl = "http://urbs.curitiba.pr.gov.br/horario-de-onibus"

	def jsonArray() {
		def url = new URL(urbsUrl)

		def array = url.text.readLines().find { it.contains "var linhas = new Array" }

		array += " linhas " // especificando o retorno da linha, assim podemos tratar como código JS

		def manager = new ScriptEngineManager().getEngineByName("JavaScript")

		def json = manager.eval array

		json.collect { it }
	}
	
	
	static main(args) 
	{
		def urbs = new UrbsJsParser()
		
		def linhas = urbs.jsonArray()
		
		def onibusParser = new OnibusHtmlParser(urbsUrl: urbsUrl, qtdeLinhas: linhas.size())
		
		def onibusList = linhas.inject([]) { list, linha ->
			list << onibusParser.obterHorarioDaPagina(linha[0..2])
		}
		
		onibusParser.writeXml onibusList.flatten()
	}
	
}
import groovy.transform.*
import java.text.SimpleDateFormat
import java.sql.Time
import com.thoughtworks.xstream.XStream
import javax.script.ScriptEngineManager

urbsUrl = "http://urbs.curitiba.pr.gov.br/horario-de-onibus"

url = new URL(urbsUrl)

array = url.text.readLines().find { it.contains "var linhas = new Array" }

array += " linhas " // especificando o retorno da linha, assim podemos tratar como código JS

manager = new ScriptEngineManager().getEngineByName("JavaScript")

json = manager.eval array

linhas = json.collect { it }

onibusParser = new OnibusHtmlParser(urbsUrl: urbsUrl, qtdeLinhas: linhas.size())

onibusList = linhas.inject([]) { list, linha ->
  list << onibusParser.obterHorarioDaPagina(linha[0..2])
}

onibusParser.writeXml onibusList.flatten()

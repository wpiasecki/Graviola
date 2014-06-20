/**
 * Script para parsear os horarios de onibus disponíveis no site da urbs, 
 * jogá-los nas classes de modelo definidas, e processá-las usando XStream
 * O site da urbs é parseado usando a própria URL do Java normalizada com 
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
import java.sql.Time

def urbsUrl = "http://www.urbs.curitiba.pr.gov.br/horario-de-onibus/codigo"

def onibusParser = new OnibusHtmlParser(urlUrbs: urlUrbs)


urbsSelect = onibusParser.xmlParser "http://www.urbs.curitiba.pr.gov.br/" breadthFirst() find { 
	it.getClass() == Node && 
	it.name().toString().endsWith('SELECT') &&
	it.@name == 'linha'
}


def onibusList = []

def codigosLinhasUrbs = urbsSelect.OPTION.collect { it.@value.toString() }


codigosLinhasUrbs.eachWithIndex { codigoOnibus ->
	println "se chegou nesse ponto e não aconteceu nada é porque, bem, todo o código que estava aqui foi movido para a classe OnibusHtmlParser"
}


println onibusList.join("\n")

onibusParser.writeXml onibusList



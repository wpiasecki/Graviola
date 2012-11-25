
def HorariosOnibus1 = new XmlSlurper().parse new File(args[0])

def agostoSetembro = HorariosOnibus1.Onibus.findAll { onibus ->
  def datas = onibus.pontos.Ponto.validoAPartirDe*.text()*.split(/\//)
  datas.any { it[1] in ['11'] && it[2] == '2012' }
}

agostoSetembro.each { Ponto ->
  println "    * ${Ponto.nome}"
}
println "agostoSetembro.size()==${agostoSetembro.size()}"


println "Total de pontos 1: ${HorariosOnibus1.Onibus.pontos.Ponto.size()}"
println "Total de linhas 1: ${HorariosOnibus1.Onibus.size()}"


/*
def HorariosOnibus2 = new XmlSlurper().parse new File(args[1])
println "Total de pontos 2: ${HorariosOnibus2.Onibus.pontos.Ponto.size()}"
println "Total de linhas 2: ${HorariosOnibus2.Onibus.size()}"
*/


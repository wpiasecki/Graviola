assert args, "nenhuma base de dados informada"
def HorariosOnibus = new XmlParser().parse new File(args[0])

def writeLinhasFile = {
  file = new File("linhas.bin")
  file.write ""

  linhasTxt = [HorariosOnibus.Onibus.size()]

  HorariosOnibus.Onibus.each { onibus ->
    linhasTxt << onibus.nome.text()[6..-1]
    linhasTxt << onibus.nome.text()[0..2]
    linhasTxt << onibus.pontos.Ponto.size()
    
    onibus.pontos.Ponto.each { ponto ->
      linhasTxt << ponto.nome.text()
      linhasTxt << ponto.tipoDia.text()
      linhasTxt << ponto.validoAPartirDe.text()
      linhasTxt << ponto.horarios.Horario.collect { it.text()[0..4] }.join(" ")
    }
  }

  def lineFile = new DataOutputStream(new FileOutputStream(file))

  linhasTxt.each {
    if (it.class == Integer) {
      lineFile.writeInt it
    } else {
      lineFile.writeUTF it
    }
  }
  
  println "arquivo de linhas escrito"
}


def writePontosFile = {
  
  pontos = HorariosOnibus.Onibus.pontos.Ponto.nome*.text().unique()
    
  pontosMap = pontos.inject([:]) { mapa, ponto ->
    Set nomesLinhas = HorariosOnibus.Onibus.findAll { onibus ->
      onibus.pontos.Ponto.nome*.text().contains ponto
    }.collect { it.nome.text()[6..-1] }
    
    mapa[ponto] = nomesLinhas
    mapa
  }.sort()
  
  new File("pontos.bin").write ""
  pontosFile = new DataOutputStream( new FileOutputStream ( new File("pontos.bin") ) )
  pontosFile.writeInt pontosMap.size()
  
  pontosMap.each { ponto, listaOnibus ->
    pontosFile.writeUTF ponto
    pontosFile.writeInt listaOnibus.size()
    listaOnibus.sort().each { onibus -> pontosFile.writeUTF onibus }
  }
  
  
  println "arquivo de pontos escrito"
}

writeLinhasFile()
writePontosFile()


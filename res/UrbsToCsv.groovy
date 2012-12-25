import java.nio.*
import java.io.*

def toCsv = {
  def xml = new File(args[0])

  def HorariosOnibus = new XmlSlurper().parse xml

  def linhas = new File("linhas.csv")
  linhas.write ""
  
  HorariosOnibus.Onibus.each { onibus ->
    def nomeLinha = onibus.nome.text()[6..-1]
    
    def linhaCsv = "$nomeLinha;"
    
    onibus.pontos.Ponto.each { ponto ->
      linhaCsv += "${ponto.nome};${ponto.tipoDia};${ponto.validoAPartirDe};"
      
      ponto.horarios.Horario.each { horario ->
        linhaCsv += "${horario.text()[0..4]};"
      }
    }
    
    linhaCsv = linhaCsv.size() + ";" + linhaCsv + "\n"
    
    linhas << linhaCsv
  }
}


def montarIndice = { comTotal = false ->
  def arquivoLinhas = new File("linhas.csv")

  def indiceMapa = [:]
  def texto = arquivoLinhas.text
  
  arquivoLinhas.eachLine { linha ->
    def posicao = texto.indexOf linha
    
    if (!indiceMapa.keySet().contains(linha[9]))
      indiceMapa[ linha[9] ] = posicao
    
  }
  
  def indice = new File("indice.csv")
  indice.write ""
  def collected = indiceMapa.collect { key, value -> 
    key + ";" + value + "\n"
  }.join('')
  indice << collected.size() + "\n"
  indice << collected
  
}


toCsv()
//montarIndice( true )



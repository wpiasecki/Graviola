import java.nio.*
import java.io.*

def toJavaCsv = {
  def xml = new File(args[0])

  def HorariosOnibus = new XmlSlurper().parse xml

  def linhas = new File("Linhas.java")
  linhas.write "public class Linhas {\n"
  
  HorariosOnibus.Onibus.each { onibus ->
    def nomeLinha = onibus.nome.text()[6..-1]
    
    def linhaCsv = "$nomeLinha;"
    
    onibus.pontos.Ponto.each { ponto ->
      linhaCsv += "${ponto.nome};${ponto.tipoDia};${ponto.validoAPartirDe};"
      
      ponto.horarios.Horario.each { horario ->
        linhaCsv += "${horario.text()[0..4]};"
      }
    }
    
    linhaCsv = "  static String _" + onibus.nome.text()[0..2] + ' = "' + linhaCsv + '";\n'
    
    linhas << linhaCsv
  }
  
  linhas << "}"
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


toJavaCsv()
//montarIndice( true )



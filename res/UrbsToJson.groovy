import groovy.json.*

def urbs = new File(args[0])
def HorarioOnibus = new XmlSlurper().parse urbs

def linhas = []

HorarioOnibus.Onibus.each { onibus ->
  println "parsing ${onibus.nome}"
  def builder = new JsonBuilder()
  onibus = builder {
    nome onibus.nome.text()
    codigo onibus.codigo.text()
    
    pontos onibus.pontos.Ponto.collect { ponto ->
      [
        nome: ponto.nome.text(),
        tipoDia: ponto.tipoDia.text(),
        validoAPartirDe: ponto.validoAPartirDe.text(),
        horarios: ponto.horarios.Horario.collect { horario -> horario.text()[0..4] }
      ]
    }
  }
  
  /*
   * se pegar `onibus.toString()` ele retorna um mapa, que tem menos caracteres
   * se pegar o `builder.toString()` retorna o JSON correto, mas fica cheio de
   * aspas duplas e aumenta em 200k o tamanho do arquivo
   */
  linhas << builder.toString()
}

new File('linhas.json').withWriter {
  it.write("document.linhas=["+linhas.join(",")+"]")
}

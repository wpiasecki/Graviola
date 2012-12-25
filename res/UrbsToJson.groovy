import groovy.json.*

def urbs = new File(args[0])
def HorarioOnibus = new XmlSlurper().parse urbs

new File("linhas.json").write ""

def linhasJson = new DataOutputStream( new FileOutputStream( new File("linhas.json") ) )
linhasJson.writeUTF ""

def linhas = []

HorarioOnibus.Onibus.each { onibus ->
  def builder = new JsonBuilder()
  onibus = builder.onibus {
    nome onibus.nome.text()[6..-1]
    
    pontos onibus.pontos.Ponto.collect { ponto ->
      [ponto: [
        nome: ponto.nome.text(),
        tipoDia: ponto.tipoDia.text(),
        validoAPartirDe: ponto.validoAPartirDe.text(),
        horarios: ponto.horarios.Horario.collect { horario -> horario.text()[0..4] }
      ]]
    }
  }
  
  /*
   * se pegar `onibus.toString()` ele retorna um mapa, que tem menos caracteres
   * se pegar o `builder.toString()` retorna o JSON correto, mas fica cheio de
   * aspas duplas e aumenta em 200k o tamanho do arquivo
   */
  linhas << onibus.toString() + "\n"
}

linhas.each {
  linhasJson.writeUTF it
}

linhasJson.flush()
linhasJson.close()

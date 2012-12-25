assert args, "nenhum arquivo de fonte de dados informado"
def HorariosOnibus = new XmlParser().parse new File(args[0])

code = """package br.will.graviola.service;

public class OnibusDataSource {
  static String[][] LINHAS = {
"""

linhasString = []

HorariosOnibus.Onibus.each { onibus ->
  onibusCode = """    { "${onibus.nome.text()[6..-1]}", """
  
  pontosCode = []
  
  pontosCode << '"' + onibus.pontos.Ponto.collect { ponto ->
      [ponto: [
        nome: ponto.nome.text(),
        tipoDia: ponto.tipoDia.text(),
        validoAPartirDe: ponto.validoAPartirDe.text(),
        horarios: ponto.horarios.Horario.collect { horario -> horario.text()[0..4] }
      ]]
  } + '"'
  
  /*onibus.pontos.Ponto.each { ponto ->
    pontosCode << """ "${ponto.nome.text()}" """
  }*/
  
  onibusCode += pontosCode.join ","
  
  onibusCode += """ } 
  """
  
  linhasString << onibusCode
}
code += linhasString.join ","

code += """
  };
}"""

println code

/*
 * Transforma um XML (passado como parametro na linha de comando) em um
 * script de insert para as tabelas do graviola-android
 * SQL escrito no arquivo "graviola-android_${now}.sql"
 */


def arquivo = new File(args[0])
def HorarioOnibus = new XmlSlurper().parse arquivo

now = new Date().format("yyyy-MM-dd_HH'h'mm")

def getTipoDia(nomeTipoDia) {
    [ 'DIA_UTIL' : 1,
      'SABADO'   : 2,
      'DOMINGO'  : 3 ][nomeTipoDia]
}

def formatDate(dataString) { Date.parse('dd/MM/yyyy', dataString).format('yyyy-MM-dd') }

out = new File("graviola-android_${now}.sql")
out.write ""

out.withWriter { w ->

    def idOnibus  = 1
    def idPonto   = 1
    def idHorario = 1
    
    HorarioOnibus.Onibus.each { onibus ->
        w.write "INSERT INTO linha(_id, nome, codigo) VALUES ($idOnibus, '${onibus.nome.text()}', '${onibus.codigo.text()}');\n"
        
        onibus.pontos.Ponto.each { ponto ->
            w.write """INSERT INTO ponto(_id, nome, tipo_dia, valido_a_partir_de, linha_id) VALUES ($idPonto, '${ponto.nome}', ${getTipoDia(ponto.tipoDia.text())}, ${formatDate(ponto.validoAPartirDe.text())}, $idOnibus);\n"""
            
            ponto.horarios.Horario.each { horario ->
                w.write "INSERT INTO horario(_id, hora, ponto_id) VALUES ($idHorario, '${horario.text()[0..4]}', $idPonto);\n"
                idHorario++
            }
            
            idPonto++
        }
        
        idOnibus++
        
    }
}

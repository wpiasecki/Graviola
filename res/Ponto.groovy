import java.sql.Time

@groovy.transform.ToString
class Ponto {
	String nome
	TipoDia tipoDia
	String validoAPartirDe
	List<Time> horarios = []
}

enum TipoDia { 
	DIA_UTIL("Dia útil"), SABADO("Sábado"), DOMINGO("Domingo")
	private String descricao
	private TipoDia(String s) { descricao = s }
	static TipoDia findByDescricao(String descricao) {
		switch (descricao) {
			case ["SÁBADO", "SABADO"]: return SABADO
			case "DOMINGO": return DOMINGO
			case ["DIA ÚTIL", 'DIA UTIL']: return DIA_UTIL
		}
	}
}

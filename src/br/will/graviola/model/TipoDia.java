package br.will.graviola.model;

public class TipoDia
{
	private String nome;
	private String descricao;
	private String sigla;
	
	private TipoDia(String nome, String descricao, String sigla) {
		this.nome = nome;
		this.descricao = descricao;
		this.sigla = sigla;
	}
	
	public static TipoDia getTipoDia(String descricao) {
		if (descricao.equals("SABADO")) {
			return new TipoDia("SABADO", SABADO, "Sáb");
		} else if (descricao.equals("DOMINGO")) {
			return new TipoDia("DOMINGO", DOMINGO, "Dom");
		} else if (descricao.equals("DIA_UTIL")) {
			return new TipoDia("DIA_UTIL", DIA_UTIL, "");
		}
		throw new IllegalArgumentException("Nenhum Tipo Dia para descricao " + descricao);
	}
	
	public static final String DIA_UTIL = "Dia útil";
	public static final String SABADO = "Sábado";
	public static final String DOMINGO = "Domingo";

	public String getNome()
	{
		return nome;
	}

	public String getDescricao()
	{
		return descricao;
	}
	
	public String getSigla() 
	{
		return sigla;
	}
	
	
}

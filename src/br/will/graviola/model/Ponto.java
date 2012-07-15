package br.will.graviola.model;

import java.util.Vector;

public class Ponto
{
	private String nome;
	private TipoDia tipoDia;
	private String validoAPartirDe;
	private Vector horarios = new Vector(); // para objetos do tipo java.util.Date
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public TipoDia getTipoDia()
	{
		return tipoDia;
	}
	public void setTipoDia(TipoDia tipoDia)
	{
		this.tipoDia = tipoDia;
	}
	public String getValidoAPartirDe()
	{
		return validoAPartirDe;
	}
	public void setValidoAPartirDe(String validoAPartirDe)
	{
		this.validoAPartirDe = validoAPartirDe;
	}
	public Vector getHorarios()
	{
		return horarios;
	}
	public void setHorarios(Vector horarios)
	{
		this.horarios = horarios;
	}
	
	
}

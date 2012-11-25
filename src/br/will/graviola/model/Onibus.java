package br.will.graviola.model;

import java.util.Vector;

public class Onibus
{
	private String nome;
	private String codigo;
	protected Vector pontos = new Vector(); // para objetos do tipo br.will.graviola.Ponto
	protected Vector nomesPontos = new Vector();
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getCodigo()
	{
		return codigo;
	}
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	public Vector getPontos()
	{
		return pontos;
	}
	public void setPontos(Vector pontos)
	{
		this.pontos = pontos;
	}
	public Vector getNomesPontos()
	{
		return nomesPontos;
	}
	public void setNomesPontos(Vector nomesPontos)
	{
		this.nomesPontos = nomesPontos;
	}
	
	
}

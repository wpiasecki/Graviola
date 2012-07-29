package br.will.graviola.service.ranking;

public class LinhaCount
{
	private String linha;
	private int count;

	public LinhaCount(String linha, int count)
	{
		this.linha = linha;
		this.count = count;
	}

	public String getLinha()
	{
		return linha;
	}

	public void setLinha(String linha)
	{
		this.linha = linha;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

}

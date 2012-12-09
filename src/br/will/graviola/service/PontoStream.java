package br.will.graviola.service;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import br.will.graviola.util.StreamUtil;
import br.will.graviola.util.StringUtil;


/**
 * Classe para abstrair a complexidade de trabalhar com o stream
 * do arquivo de pontos (pontos.bin)
 * 
 * @author will
 *
 */
class PontoStream
{
	private DataInputStream in;
	private int qtdePontos;
	private boolean iniciado = false;
	
	/**
	 * Constrói um novo PontoStream e lê a quantidade de pontos
	 * disponível na base
	 * 
	 * @throws IOException
	 */
	public PontoStream() throws IOException
	{
		in = StreamUtil.dataStream("pontos.bin");
		qtdePontos = in.readInt();
	}
	
	
	/**
	 * Retorna uma lista de todos os pontos cujos nomes contenham
	 * a string de pesquisa
	 * 
	 * @param pesquisa string para filtrar os pontos
	 * @return vector de strings com nomes de pontos
	 * @throws IOException
	 */
	public Vector pesquisarPontoByDescricao(String pesquisa) throws IOException
	{
		Vector pontos = new Vector();
		pesquisa = pesquisa.toUpperCase();
		while (qtdePontos > 0)
		{
			String ponto = in.readUTF();
			if (StringUtil.contem(pesquisa, ponto)) {
				pontos.addElement(ponto);
			}
		}
		
		return pontos;
	}
	
	
	/**
	 * Obtém as linhas que param em um ponto.
	 * 
	 * @param nomePonto nome do ponto
	 * @return vector de string com os nomes das linhas
	 * @throws IOException
	 */
	public Vector getLinhasFromPonto(String nomePonto) throws IOException
	{
		while(qtdePontos > 0)
		{
			if (nomePonto.equals(getProximoPonto()))
			{
				int qtdeLinhas = in.readInt();
				
				Vector linhas = new Vector();
				for (int i = 0; i < qtdeLinhas; i++)
				{
					linhas.addElement(in.readUTF());
				}
				
				return linhas;
			}
		}
		throw new IllegalArgumentException("Nenhum ponto encontrado com o nome '"+nomePonto+"'");
	}
	
	
	/**
	 * Obtém todos os pontos
	 * 
	 * @return vector com os nomes dos pontos
	 * @throws IOException
	 */
	public Vector getPontos() throws IOException
	{
		Vector pontos = new Vector();
		while(qtdePontos > 0)
		{
			pontos.addElement(getProximoPonto());
			
			qtdePontos--;
		}
		return pontos;
	}
	
	
	/**
	 * Obtém o próximo ponto do arquivo. 
	 * Quanto não houverem mais pontos para serem lidos, será
	 * lançado um erro; fica a cargo de quem estiver usando este 
	 * método em controlar isso através do PontoStream::qtdePontos
	 * 
	 * @return string com o nome do ponto
	 * @throws IOException
	 */
	public String getProximoPonto() throws IOException
	{
		if (iniciado) 
		{
			int qtdeLinhas = in.readInt();
			
			for (int i = 0; i < qtdeLinhas; i++) {
				StreamUtil.skip(in, in.readUnsignedShort());
			}
		} 
		else iniciado = true;
		
		return in.readUTF(); // nome do ponto
	}
	
	
	/**
	 * Fecha o stream
	 */
	public void close()
	{
		try {
			in.close();
		} catch (IOException i) {
			i.printStackTrace();
			throw new RuntimeException(); 
		}
	}

	
	/**
	 * Retorna a quantidade de pontos que existem no arquivo.
	 * Pode ser chamado várias vezes
	 * 
	 * @return int
	 */
	public int getQtdePontos()
	{
		return qtdePontos;
	}

}

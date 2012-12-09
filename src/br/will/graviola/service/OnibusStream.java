package br.will.graviola.service;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;
import br.will.graviola.model.TipoDia;
import br.will.graviola.util.StreamUtil;
import br.will.graviola.util.StringUtil;

/**
 * Classe para trabalhar abstrair a complexidade de trabalhar
 * com o DataInputStream do arquivo de onibus (linhas.bin).
 * 
 * Cada nova pesquisa precisa criar um novo objeto deste, senão
 * o stream pode estar num local indefinido
 * 
 * @author will
 *
 */
class OnibusStream
{
	private DataInputStream in;
	private int quantLinhas;
	private boolean iniciado = false;

	/**
	 * Constrói um novo OnibusStream e obtém a quantidade de linhas
	 * disponíveis no arquivo
	 * 
	 * @throws IOException
	 */
	public OnibusStream() throws IOException
	{
		this.in = StreamUtil.dataStream("linhas.bin");
		quantLinhas = in.readInt();
	}

	
	/**
	 * Lê o nome da próxima linha
	 * 
	 * @return String nome da linha
	 * @throws IOException
	 */
	public String getProximoNomeOnibus() throws IOException
	{
		if (iniciado)
		{
			StreamUtil.skip(in, in.readUnsignedShort()); // codigo da linha
			int qtdePontos = in.readInt();

			for (int i = 0; i < qtdePontos; i++)
			{
				StreamUtil.skip(in, in.readUnsignedShort()); // nome do ponto
				StreamUtil.skip(in, in.readUnsignedShort()); // tipo dia
				StreamUtil.skip(in, in.readUnsignedShort()); // valido a partir de
				StreamUtil.skip(in, in.readUnsignedShort()); // horarios
			}
		} else iniciado = true;
		
		return in.readUTF();
	}


	/**
	 * Obtém um objeto onibus a partir das informações da base de dados.
	 * Só pode ser chamado uma vez.
	 * 
	 * @param linha nome da linha
	 * @return objeto onibus
	 * @throws IOException
	 */
	public Onibus getOnibus(String linha) throws IOException
	{
		while (quantLinhas > 0)
		{
			String proximaLinha = getProximoNomeOnibus();
			if (linha.equals( proximaLinha ))
			{
				Onibus onibus = new Onibus();
				onibus.setNome(linha);
				onibus.setCodigo(in.readUTF());

				int qtdePontos = in.readInt();

				Vector pontos = onibus.getPontos();

				for (int i = 0; i < qtdePontos; i++)
				{
					Ponto ponto = new Ponto();
					ponto.setNome(in.readUTF());
					ponto.setTipoDia(TipoDia.getTipoDia(in.readUTF()));
					ponto.setValidoAPartirDe(in.readUTF());
					ponto.setHorarios(StringUtil.split(in.readUTF(), " "));
					
					pontos.addElement(ponto);
				}

				return onibus;
			}
			quantLinhas--;
		}
		throw new RuntimeException("A linha com o nome '" + linha + "' não foi encontrada");
	}

	
	/**
	 * Obtém a quantidade de linhas de onibus que estão disponíveis no
	 * arquivo. Pode ser chamado várias vezes.
	 * 
	 * @return int quantidade de linhas
	 */
	public int getQuantLinhas()
	{
		return quantLinhas;
	}

	
	/**
	 * Fecha o stream de dados
	 */
	public void close()
	{
		try
		{
			in.close();
		} catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

}

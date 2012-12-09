package br.will.graviola.service;

import java.io.IOException;
import java.util.Vector;

import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;
import br.will.graviola.util.StringUtil;


/**
 * Classe de serviço que faz o meio de campo para obter
 * informações de pontos, onibus e horários
 * 
 * A estratégia desta classe é de utilizar um arquivo binário,
 * gravado com DataOutputStream em um script Groovy (UrbsToLineFile.groovy).
 * Trabalha-se com dois arquivos: pontos.bin e linhas.bin.
 * 
 * A estrutura do linhas.bin é a seguinte:
 * 
 * 1) QTDE_LINHAS (Integer) é a quantidade de linhas no arquivo
 * 2) NOME_LINHA (UTF) é a o nome da linha
 * 3) CODIGO_LINHA (UTF) é o código da linha
 * 4) QTDE_PONTOS (Integer) é a quantidade de pontos que a linha tem
 * 5) NOME_PONTO (UTF) é o nome do ponto
 * 6) TIPO_DIA (UTF) é o tipo dia do ponto
 * 7) VALIDO_PARTIR_DE (UTF) é a data a partir de quando o horário do ponto é válido
 * 8) HORARIOS (UTF) é a lista de horários separada por vírgula
 * 9) repete até acabar a QTDE_LINHAS
 * 
 * A estrutura do pontos.bin é a seguinte:
 * 
 * 1) QTDE_PONTOS (Integer) possui a quantidade de pontos do arquivo
 * 2) NOME_PONTO (UTF) possui o nome do primeiro ponto
 * 3) QTDE_LINHAS (Integer) possui a quantidade de linhas naquele ponto
 * 4) a partir do quarto dado, haverão as 'QTDE_LINHAS' de nomes de linhas de onibus
 * 5) repete o passo dois até acabar o QTDE_PONTOS
 * 
 * @author will
 *
 */
public class HorarioOnibusLineFileService implements HorarioOnibusService
{

	public Vector getLinhas()
	{
		OnibusStream stream = null;
		
		try
		{
			stream = new OnibusStream();
			Vector linhas = new Vector();
			int quantLinhas = stream.getQuantLinhas();
			
			while(quantLinhas > 0)
			{
				String nomeLinha = stream.getProximoNomeOnibus();
				linhas.addElement(nomeLinha);
				quantLinhas--;
			}
			return linhas;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		finally
		{
			if (stream != null) stream.close();
		}
	}
	
	public Vector getPontos()
	{
		try {Thread.sleep(5000); } catch(Exception e){}
		
		PontoStream stream = null;
		try
		{
			stream = new PontoStream();
			return stream.getPontos();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		finally 
		{
			if (stream != null) stream.close();
		}
	}

	
	public Vector pesquisarOnibusByNome(String pesquisa)
	{
		OnibusStream stream = null;
		
		try 
		{
			stream = new OnibusStream();
			
			int qtdeLinhas = stream.getQuantLinhas();
			
			Vector linhas = new Vector();
			
			pesquisa = pesquisa.toUpperCase();
			
			while(qtdeLinhas > 0)
			{
				String linha = stream.getProximoNomeOnibus();
				if (StringUtil.contem(pesquisa, linha))
				{
					linhas.addElement(linha);
				}
				
				qtdeLinhas--;
			}
			
			return linhas;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		finally
		{
			if (stream != null) stream.close();
		}
	}

	
	public Vector pesquisarOnibusByPonto(String ponto)
	{
		PontoStream stream = null;
		try
		{
			stream = new PontoStream();
			return stream.getLinhasFromPonto(ponto);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		finally
		{
			if (stream != null) stream.close();
		}
	}

	
	public Vector pesquisarPontosByNome(String pesquisa)
	{
		PontoStream stream = null;
		try
		{
			stream = new PontoStream();
			Vector pontos = new Vector();
			int qtdePontos = stream.getQtdePontos();
			pesquisa = pesquisa.toUpperCase();
			
			while(qtdePontos > 0)
			{
				String ponto = stream.getProximoPonto();
				if(StringUtil.contem(pesquisa, ponto))
				{
					pontos.addElement(ponto);
				}
				
				qtdePontos--;
			}
			
			return pontos;
		}
		catch (IOException i)
		{
			i.printStackTrace();
			throw new RuntimeException(i.getMessage());
		}
		finally
		{
			if (stream != null) stream.close();
		}
	}

	
	public Onibus getOnibus(String linha)
	{
		OnibusStream stream = null;
		try 
		{
			stream = new OnibusStream();
			Onibus onibus = stream.getOnibus(linha);
			
			HoraService horaService = new HoraService();
			
			Vector pontos = onibus.getPontos();
			
			for (int i = 0; i < pontos.size(); i++) {
				Ponto p = (Ponto) pontos.elementAt(i);
				p.setHorariosMarcados(horaService.findProximosHorarios(p));
			}
			
			return onibus;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		finally
		{
			if (stream != null) stream.close();
		}
	}
	
}

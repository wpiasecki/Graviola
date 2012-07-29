package br.will.graviola.service.ranking;

import java.util.Enumeration;
import java.util.Vector;

import br.will.graviola.util.CollectionUtil;

public class Ranking implements Runnable
{
	public static final int qtdeLinhasFavoritas = 3;
	public static final int tamanhoRanking = 30;
	private static boolean suportaRms = true;
	
	private String linha;
	private Vector linhasMaisUtilizadas;
	private static RecordFacade recordFacade;
	
	
	public Ranking()  
	{
		try {
			recordFacade = new RecordFacade();
		} catch (Exception e) {
			setSuportaRms( false );
		}
		
		linhasMaisUtilizadas = gerarRanking();
	}
	
	
	private Vector gerarRanking()
	{
		Vector linhasMaisUtilizadas = new Vector();
		
		if ( !isSuportaRms() ) return linhasMaisUtilizadas;
		
		try 
		{
			Vector arquivo = recordFacade.lerRegistroDeLinhasAcessadas();
			Vector linhasCountMaisUtilizados = CollectionUtil.obterMaisUtilizados(arquivo);
			
			for (Enumeration en = linhasCountMaisUtilizados.elements(); en.hasMoreElements();) 
			{
				LinhaCount linhaCount = (LinhaCount) en.nextElement();
				linhasMaisUtilizadas.addElement(linhaCount.getLinha());
			}
			
		}
		catch (Exception io) 
		{
//			System.out.println("não foi possível abrir o record store");
			setSuportaRms( false );
//			io.printStackTrace();
		}
		
		return linhasMaisUtilizadas;
	}
	
	
	public void gravar(final String linha)
	{
		new Thread( new Ranking(linha) ).start();
	}
	
	
	private Ranking(String linha) { this.linha = linha; }
	
	
	public void run() 
	{
		if ( !isSuportaRms() ) return;
		
		try 
		{
			//System.out.println("count=" + recordFacade.count());
			if (recordFacade.count() >= tamanhoRanking) {
				recordFacade.excluirRegistroMaisAntigo();
			}
			recordFacade.gravarRegistro( linha );
		} 
		catch (Exception io) 
		{
//			System.out.println("erro no RMS ao gravar registros");
			setSuportaRms( false );
//			io.printStackTrace();
		} 
		
	}

	
	public void close() 
	{
		recordFacade.close();
	}
	
	
	public synchronized static boolean isSuportaRms()
	{
		return suportaRms;
	}
	
	
	private synchronized static void setSuportaRms(boolean b)
	{
		suportaRms = b;
	}


	public Vector getLinhasMaisUtilizadas()
	{
		return linhasMaisUtilizadas;
	}
	

}

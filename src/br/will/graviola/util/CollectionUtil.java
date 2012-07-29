package br.will.graviola.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import br.will.graviola.service.ranking.LinhaCount;
import br.will.graviola.service.ranking.Ranking;

public class CollectionUtil
{
	/**
	 * Organiza uma lista contando a quantidade de vezes que acontece
	 * cada elemento.
	 * 
	 * @param list
	 * @return um Hashtable contendo como chave cada linha distinta do
	 * vector passado como parâmetro e como valor a quantidade de vezes
	 * que a linha existia na lista 
	 */
	public static Hashtable contarElementos(Vector list)
	{
		Hashtable hash = new Hashtable();
		
		for (int i = 0; i < list.size(); i++) 
		{
			Object key = list.elementAt(i);
			if ( hash.containsKey(key) ) 
			{
				Integer qtde = new Integer( ( (Integer) hash.get(key) ).intValue() + 1 );
				hash.put( key, qtde );
			}
			else
			{
				hash.put( key, new Integer(1) );
			}
		}
		
		return hash;
	}
	
	
	/**
	 * Organiza um hash em ordem decrescente. Este método considera que 
	 * cada valor do hash contém a quantidade de ocorrências da chave.
	 * Ordena utilizando um BubbleSort (ou algo similar).
	 *  
	 * @param hash Hashtable chave->valor, onde valor é um Integer com
	 * a quantidade de vezes que a chave existe
	 * @return um Vector<LinhaCount> contendo as QTDE_LINHAS_FAVORITAS 
	 * de chaves com maior valor 
	 */
	public static Vector ordenarPorValor(Hashtable hash)
	{
		Vector linhaCounts = new Vector();
		for (Enumeration en = hash.keys(); en.hasMoreElements();) {
			String key = (String) en.nextElement();
			int value = ((Integer)hash.get(key)).intValue();
			linhaCounts.addElement(new LinhaCount(key, value));
		}
		
		for (int i = 0; i < linhaCounts.size(); i++)
		{
			for (int k = 0; k < linhaCounts.size() - 1; k++)
			{
				int proximoIndice = k + 1;
				LinhaCount linhaCount = (LinhaCount) linhaCounts.elementAt(k);
				LinhaCount proximaLinhaCount = (LinhaCount) linhaCounts.elementAt( proximoIndice );
				
				if (linhaCount.getCount() > proximaLinhaCount.getCount()) 
				{
					linhaCounts.setElementAt( linhaCount, proximoIndice );
					linhaCounts.setElementAt( proximaLinhaCount, k );
				}
			}
		}
		
		return linhaCounts;
	}
	
	
	public static Vector obterUltimos(Vector vector, int qtde)
	{
		Vector ultimos = new Vector();
		for ( int i = 0; i < vector.size(); i++ ) 
		{
			ultimos.addElement(vector.elementAt(vector.size() - i - 1));
			if (ultimos.size() >= qtde) break;
		}
		return ultimos;
	}
	
	
	public static Vector obterUltimos(Vector vector) 
	{
		return obterUltimos(vector, Ranking.qtdeLinhasFavoritas);
	}
	
	
	public static Vector obterMaisUtilizados(Vector linhas)
	{
		Hashtable hash = contarElementos( linhas );
		Vector ordenados = ordenarPorValor( hash );
		Vector ultimos = obterUltimos( ordenados );
		return ultimos;
	}
	
}

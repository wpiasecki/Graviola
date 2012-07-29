package br.will.graviola.test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import br.will.graviola.service.ranking.LinhaCount;
import br.will.graviola.service.ranking.Ranking;
import br.will.graviola.util.CollectionUtil;

public class ContarLinhasTest
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.addElement("frango");
		v.addElement("marmota");
		v.addElement("frango");
		v.addElement("pato");
		v.addElement("abelha");
		v.addElement("frango");
		v.addElement("abelha");
		v.addElement("marreco");
		v.addElement("abelha");
		v.addElement("marreco");
		v.addElement("abelha");
		v.addElement("alce");
		v.addElement("tentacruel");
		v.addElement("tentacruel");
		
		Hashtable contado = CollectionUtil.contarElementos(v);
		
		for (Enumeration en = contado.keys(); en.hasMoreElements();)
		{
			Object key = en.nextElement();
			System.out.println(key + " -> " + contado.get(key));
		}
		
		System.out.println("-----------------------------");
		Vector ordenado = CollectionUtil.ordenarPorValor(contado);
		for (Enumeration en = ordenado.elements(); en.hasMoreElements();) {
			LinhaCount linhaCount = (LinhaCount) en.nextElement();
			System.out.println(linhaCount.getLinha() + " = " + linhaCount.getCount());
		}
		
		System.out.println("-----------------------------");
		Vector ultimos = CollectionUtil.obterUltimos(ordenado);
		for (Enumeration en = ultimos.elements(); en.hasMoreElements();) {
			LinhaCount linhaCount = (LinhaCount) en.nextElement();
			System.out.println(linhaCount.getLinha() + " ranked " + linhaCount.getCount());
		}
		
	}
	
}

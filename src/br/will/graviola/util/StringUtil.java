package br.will.graviola.util;

import java.util.Enumeration;
import java.util.Vector;

public class StringUtil
{
	public static boolean contem(String agulha, String palheiro)
	{
		return palheiro.indexOf(agulha) != -1;
	}
	
	
	public static int contarQuebrasDeLinha(String file)
	{
		int count = 0;
		char[] chars = file.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			char ch = chars[i];
			if (ch == '\n') count++;
		}
		return count;
	}
	
	
	public static Vector separarEmLinhas(String texto)
	{
		int indexOf = texto.indexOf("\n");
		Vector linhas = new Vector();
		while (indexOf != -1) 
		{
			String substring = texto.substring(0, indexOf);
			linhas.addElement(substring);
			texto = texto.substring(indexOf + 1);
			indexOf = texto.indexOf("\n");
			
			try {Thread.sleep(1000);} catch(Exception e) {e.printStackTrace();}
		}
		linhas.addElement(texto);
		
		return linhas;
	}
	
	
	public static String procurarLinha(String agulha, String palheiro)
	{
		Vector linhas = separarEmLinhas(palheiro);
		for (int i = 0; i < linhas.size(); i++) 
		{
			String linha = (String) linhas.elementAt(i);
			if ( contem( agulha, linha ) ) {
				return linha;
			}
		}
		return null;
	}
	
	
	public static String joinLinhas(Vector linhas) 
	{
		return join(linhas, "\n");
	}
	
	
	public static String join(Vector linhas, String join) {
		StringBuffer sb = new StringBuffer();
		for (Enumeration en = linhas.elements(); en.hasMoreElements();) 
		{
			sb.append(en.nextElement());
			sb.append(join);
		}
		return sb.toString();
	}
	
}

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
	
	
	public static Vector split(String texto, String token)
	{
		int indexOf = texto.indexOf(token);
		Vector linhas = new Vector();
		while (indexOf != -1) 
		{
			String substring = texto.substring(0, indexOf);
			linhas.addElement(substring);
			texto = texto.substring(indexOf + 1);
			indexOf = texto.indexOf(token);
		}
		
		if (!texto.equals("")) 
			linhas.addElement(texto);
		
		return linhas;
	}
	
	
	public static Vector separarEmLinhas(String texto)
	{
		return split(texto, "\n");
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
	
	
//	private static String lerEstrutura(String origem)
//	{
//		char lido;
//		
//		StringBuffer sb = new StringBuffer();
//
//		/*
//		 * o mapa pode ter estruturas aninhadas: onibus:[nome:AAA,
//		 * pontos:[ponto:[nome:B]]]
//		 */
//		int quantidadeEstruturas = 0; // o mapa pode ter estruturas aninhadas
//		boolean possuiEstruturas = false;
//		
//		for (int i = 0; i < origem.length(); i++)
//		{
//			lido = origem.charAt(i);
//
//			if (lido == '[') 
//			{ 
//				quantidadeEstruturas++;
//				possuiEstruturas = true;
//			} 
//			else if (lido == ']') 
//			{ 
//				quantidadeEstruturas--;
//			} 
//			else 
//			{
//				if (quantidadeEstruturas == 0 && lido == ',') return sb.toString();
//			}
//			
//			sb.append(lido);
//			
//			if (possuiEstruturas && quantidadeEstruturas == 0) return sb.toString();
//		}
//		
//		return sb.toString();
//	}
//	
//	
//	public static String lerCaminho(String origem, String caminho)
//	{
//		Vector path = StringUtil.split(caminho, ".");
//
//		for (int i = 0; i < path.size(); i++)
//		{
//			String atributo = (String) path.elementAt(i);
//			input = posicionarStream(input, atributo);
//			
//			/*
//			 * O stream volta nulo se tiver chego ao fim do arquivo
//			 * ou ao fim da linha
//			 */
//			if (input == null) return null;
//		}
//		return lerEstrutura(input);
//	}	
	
}

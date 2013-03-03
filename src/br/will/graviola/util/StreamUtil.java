package br.will.graviola.util;

import java.io.DataInputStream;
import java.io.IOException;

import javax.microedition.lcdui.Image;

/**
 * Classe para abstrair algumas complexidades em lidar com 
 * stream. A utilização desta classe é para trabalhar com strings
 * tipo CSV, mas não se mostrou viável. 
 * 
 * Hoje só dois métodos são utilizados.
 * 
 * @author will
 *
 */
public class StreamUtil
{
//	public static String lerLinha(InputStreamReader input)
//	{
//		return lerAte(input, (char) 10);
//	}
//
//	/**
//	 * Lê até um determinado caracter. Se o arquivo acabar, só o que foi lido até
//	 * o fim do arquivo.
//	 * 
//	 * @param input
//	 *          Stream de onde se lê os bytes
//	 * @param caracter
//	 *          caracter delimitador
//	 * @return String até o delimitador, ou o que pode ser lido até acabar o
//	 *         stream
//	 */
//	public static String lerAte(InputStreamReader input, char caracter)
//	{
//		try
//		{
//			StringBuffer sb = new StringBuffer();
//
//			int read;
//			while ((read = input.read()) != caracter)
//			{
//				if (read == -1)
//					return sb.toString();
//
//				sb.append((char) read);
//			}
//
//			return sb.toString();
//		} 
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			throw new RuntimeException("lerAte-" + e.getMessage());
//		}
//	}
//
//	
//	/**
//	 * Retorna o stream passado como parâmetro na posição certa para ler o
//	 * conteúdo do atributo passado como parâmetro.
//	 * 
//	 * @param input
//	 *          stream
//	 * @param atributo
//	 *          nome do atributo
//	 * @param sb
//	 *          o que foi lido previamente
//	 * @return o stream na posição certa para ler o atributo
//	 */
//	private static InputStreamReader posicionarStream(	InputStreamReader input, String atributo, StringBuffer sb)
//	{
//		try
//		{
//			if (sb.length() == 0)
//			{
//				char[] lidos = new char[atributo.length()];
//				input.read(lidos);
//				sb.append(lidos);
//			} 
//			else
//			{
//				sb.deleteCharAt(0);
//				int lido = input.read();
//				
//				/*
//				 * Se acabou o arquivo ou a linha e nada foi encontrado, não tem o 
//				 * que fazer, retorna null 
//				 */
//				//System.out.println("lido="+lido);
//				if (lido == -1 || lido == 10) return null;
//				
//				sb.append((char) lido);
//			}
//
//			if (sb.toString().equals(atributo))
//			{
//				return input;
//			}
//			else
//			{
//				return posicionarStream(input, atributo, sb);
//			}
//
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//			throw new RuntimeException("posicionarStream-"+e.getMessage());
//		}
//	}
//
//	
//	private static String lerEstrutura(InputStreamReader input)
//	{
//		try
//		{
//			char lido;
//			
//			if ( (lido = (char) input.read())  != ':' ) // descartamos o ":"
//				throw new RuntimeException("Não é o começo de uma estrutura (:). Lido: " + lido);
//			
//			StringBuffer sb = new StringBuffer();
//	
//			/*
//			 * o mapa pode ter estruturas aninhadas: onibus:[nome:AAA,
//			 * pontos:[ponto:[nome:B]]]
//			 */
//			int quantidadeEstruturas = 0; // o mapa pode ter estruturas aninhadas
//			boolean possuiEstruturas = false;
//			
//			while (true)
//			{
//				lido = (char) input.read();
//	
//				if (lido == '[') 
//				{ 
//					quantidadeEstruturas++;
//					possuiEstruturas = true;
//				} 
//				else if (lido == ']') 
//				{ 
//					quantidadeEstruturas--;
//				} 
//				else 
//				{
//					if (quantidadeEstruturas == 0 && lido == ',') return sb.toString();
//				}
//				
//				sb.append(lido);
//				
//				if (possuiEstruturas && quantidadeEstruturas == 0) return sb.toString();
//				if (lido == -1) return "EOF";
//				
//			}
//		} 
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			throw new RuntimeException("lerEstrutura-"+e.getMessage());
//		}
//	}
//	
//
//	public static String lerAtributo(InputStreamReader input, String atributo)
//	{
//		InputStreamReader inputPosicionado = posicionarStream(input, atributo);
//		return lerEstrutura(inputPosicionado);
//	}
//
//	
//	/**
//	 * Lê um caminho de um stream.
//	 * 
//	 * Ex.: Para um path "onibus.nome"
//	 * 
//	 * E um stream contendo
//	 * 
//	 * 425;[onibus:[nome:A. BRANCA / FAZ. RIO GRANDE, pontos:[[nome:AREIA BRANCA,
//	 * tipoDia:DIA_UTIL, validoAPartirDe:01/03/2004, horarios:[06:30]]]]]
//	 * 
//	 * O método deverá retornar somente "A. BRANCA / FAZ. RIO GRANDE" sem ler todo
//	 * o stream.
//	 * 
//	 * Não é exatamente JSON, tá mais para a sintaxe de mapa do groovy, mas como
//	 * ela poupa quase 200k em aspas duplas, acho que é uma saída melhor.
//	 * 
//	 * @param input
//	 *          stream de leitura
//	 * @param path
//	 *          caminho json
//	 * @return String com o conteúdo do caminho, ou nulo se o fim do arquivo
//	 * for alcançado
//	 */
//	public static String lerCaminho(InputStreamReader input, String caminho)
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
//
//	
//	/**
//	 * Lê um stream até chegar no atributo solicitado.
//	 * 
//	 * Ex. para um stream com
//	 * 
//	 * [onibus:[nome:A. BRANCA / FAZ. RIO GRANDE, 
//	 * 		pontos:[[ponto:[nome:AREIA BRANCA, tipoDia:DIA_UTIL, validoAPartirDe:01/03/2004, horarios:[06:30]]]]]]
//	 * 
//	 * E um atributo: "onibus.pontos.ponto"
//	 * 
//	 * será retornado o seguinte stream:
//	 * 
//	 * :[nome:AREIA BRANCA, tipoDia:DIA_UTIL, validoAPartirDe:01/03/2004, horarios:[06:30]]
//	 * 
//	 * @param input stream
//	 * @param atributo atributo onde se deseja chegar
//	 * @return o stream posicionado DEPOIS do atributo
//	 */
//	private static InputStreamReader posicionarStream(InputStreamReader input, String atributo)
//	{
//		return posicionarStream(input, atributo, new StringBuffer());
//	}
//
//	
//	public static InputStreamReader lerCaminhoLazy(InputStreamReader input, String caminho)
//	{
//		Vector path = StringUtil.split(caminho, ".");
//
//		for (int i = 0; i < path.size(); i++)
//		{
//			String atributo = (String) path.elementAt(i);
//			input = posicionarStream(input, atributo);
//		}
//		return input;
//	}
//	
//	public static InputStreamReader get(String file)
//	{
//		return new InputStreamReader(StreamUtil.class.getResourceAsStream(file));
//	}
	
	public static DataInputStream dataStream(String file)
	{
		return new DataInputStream(StreamUtil.class.getResourceAsStream("/" + file));
	}
	
	public static void skip(DataInputStream stream, long bytes) throws IOException
	{
		long bytesSkiped = stream.skip(bytes);
		if (bytesSkiped != bytes)
		{
			skip(stream, bytes - bytesSkiped);
		}
	}
	
	public static Image image(String fileName) throws IOException 
	{
		return Image.createImage(StreamUtil.class.getResourceAsStream(fileName));
	}
	
}

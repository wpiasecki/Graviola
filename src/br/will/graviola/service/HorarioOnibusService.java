package br.will.graviola.service;

import java.util.Vector;

import br.will.graviola.model.Onibus;

public interface HorarioOnibusService
{
	/**
	 * Retorna os nomes das linhas de onibus.
	 * 
	 * @return vector de strings
	 */
	public Vector getLinhas();
	
	/**
	 * Retorna os nomes dos pontos.
	 * 
	 * @return vector de strings
	 */
	public Vector getPontos();
	
	/**
	 * Retorna uma lista de nomes de linhas que contém a string
	 * passada como parâmetro
	 * 
	 * @param pesquisa filtro para os nomes das linhas
	 * @return vector de strings
	 */
	public Vector pesquisarOnibusByNome(String pesquisa);
	
	/**
	 * Retorna uma lista de linhas que param em um determinado
	 * ponto.
	 * 
	 * @param ponto nome do ponto
	 * @return vector de string
	 */
	public Vector pesquisarOnibusByPonto(String ponto);
	
	/**
	 * Pesquisa e retorna uma lista de nomes de pontos filtrados
	 * pela string passada como parâmetro
	 * 
	 * @param pesquisa String para filtrar os pontos 
	 * @return vector de string
	 */
	public Vector pesquisarPontosByNome(String pesquisa);
	
	/**
	 * Retorna um objeto ônibus com todas as informações.
	 * 
	 * @param linha nome da linha de onibus
	 * @return objeto onibus
	 */
	public Onibus getOnibus(String linha);
	
	/**
	 * Pesquisa por todas as linhas e adiciona no Adder passado
	 * como parâmetro.
	 * 
	 * O "Adder" pode ser utilizado para carregamento assíncrono,
	 * mas não deu certo nos testes que fiz. Então está aqui só
	 * para não precisar criar um vector intermediário.
	 * 
	 * @param adder interface que permite adicionar um objeto
	 * @return a thread utilizada para adicionar assincronamente
	 */
	//public Thread preencherLinhas(Adder adder);
	
}

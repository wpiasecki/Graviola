package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;

public class Comando
{
	/*
	 * comandos da lista de linhas
	 */
	static Command selecionar = new Command("Selecionar", Command.OK, 1);
	public static Command sair = new Command("Sair", Command.EXIT, 2);
	static Command procurar = new Command("Procurar", Command.ITEM, 3);
	static Command sobre = new Command("Sobre", Command.HELP, 4);
	static Command voltar = new Command("Voltar", Command.BACK, 1);
	static Command mapa = new Command("Mapa", Command.BACK, 3);
	
	
	/*
	 * comandos da pesquisa por nome da linha
	 */
	static Command pesquisar = new Command("Pesquisar", Command.OK, 1);
	static Command pesquisarLinha = new Command("Pesquisar Linhas", Command.OK, 1);
	static Command pesquisarPonto = new Command("Pesquisar Pontos", Command.OK, 1);
	
	
	/*
	 * comando para navegar nos pontos de uma linha
	 */
	public static Command pontos = new Command("Pontos", Command.OK, 2);
	
	
	/*
	 * comando para navegar no mapa
	 */
	static Command zoomIn = new Command("+ Zoom", Command.OK, 2);
	static Command zoomOut = new Command("- Zoom", Command.OK, 2);
	
}

package br.will.graviola;

import java.util.Vector;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.model.Onibus;
import br.will.graviola.service.HorarioOnibusService;
import br.will.graviola.ui.HorarioCanvas;


/**
 * Graviola MIDlet. 
 * 
 * @author will
 */
public class Graviola extends MIDlet implements CommandListener
{
	/*
	 * comandos
	 */
	private Command voltar = new Command("Voltar", Command.BACK, 1);

	
	/*
	 * comandos da lista de linhas
	 */
	private Command selecionar = new Command("Selecionar", Command.OK, 1);
	private Command sair = new Command("Sair", Command.EXIT, 2);
	private Command procurar = new Command("Procurar", Command.ITEM, 3);
	private Command sobre = new Command("Sobre", Command.HELP, 4);
	
	
	/*
	 * comandos da pesquisa por nome da linha
	 */
	private Command pesquisar = new Command("Pesquisar", Command.OK, 1);
	
	private Display display = Display.getDisplay(this);
	private List list;
	private int selectedIndex;
	
	
	protected void startApp() throws MIDletStateChangeException
	{
		DisplayableAlert da = criarTelaListaOnibus();
		da.getDisplayable().setCommandListener( this );
		display.setCurrent( da.getDisplayable() );
	}
	
	
	/**
	 * Controla o fluxo de telas de acordo com os comandos que o usuário 
	 * fizer. 
	 * Se continuar horrivel desse jeito vai ter que ir para uma classe à 
	 * parte.
	 */
	public void commandAction(Command command, Displayable displayable)
	{
		DisplayableAlert novoDisplay = null;
		
		if (command == sobre) // sobre o software
		{
			novoDisplay = criarTelaAbout();
		} 
		else if (command == sair) // sair da aplicação
		{
			destroyApp( false );
		} 
		else if (command == voltar) // voltar para listagem de onibus
		{
			novoDisplay = criarTelaListaOnibus();
		} 
		else if (command == selecionar || command.getLabel().equals("")) // selecionar linha de onibus usando o comando ou o botão OK
		{
			selectedIndex = list.getSelectedIndex();
			String onibusSelecionado = list.getString( selectedIndex );
			list = null;
			novoDisplay = criarTelaHorario( onibusSelecionado );
		} 
		else if (command == procurar) // ir para tela de pesquisa de linhas
		{
			novoDisplay = criarTelaPesquisaLinha();
		} 
		else if (command == pesquisar) // pesquisar por linhas na lista de onibus
		{
			Form form = (Form) displayable;
			String pesquisadoPeloUsuario = ( (TextField) form.get(0) ).getString();
			
			novoDisplay = criarTelaResultadoPesquisaLinha( pesquisadoPeloUsuario );
		}
		
		
		/*
		 * cada método "iniciar...()" retorna um displayable. Aqui setamos o
		 * command listener como esta classe e o Displayable como atual no
		 * display. 
		 */
		if (novoDisplay != null) 
		{
			novoDisplay.getDisplayable().setCommandListener(this); 
			
			if (novoDisplay.getAlert() != null) {
				display.setCurrent(novoDisplay.getAlert(), novoDisplay.getDisplayable());
			} else {
				display.setCurrent(novoDisplay.getDisplayable());
			}
		}
	}
	

	/**
	 * Cria canvas com o horário do onibus selecionado
	 * 
	 * tempo para realizar a busca usando '==': 2799 2732 2998 = 2843
	 * tempo para realizar a busca usando 'equals()': 3158 3121 3172 = 3150
	 * @param nome
	 * @return
	 */
	private DisplayableAlert criarTelaHorario(String nome) {
		Onibus onibus = HorarioOnibusService.getByNome(nome);
		HorarioCanvas canvas = new HorarioCanvas(onibus);
		canvas.addCommand(voltar);
		return new DisplayableAlert(canvas);
	}
	
	
	/**
	 * Cria tela com o about
	 * 
	 * @return
	 */
	private DisplayableAlert criarTelaAbout() {
		Form form = new Form("");
		form.append("-- Graviola --\n");
		form.append("Aplicativo para visualização offline dos horários de");
		form.append("onibus obtidos do site da URBS.\n");
		form.append("\n");
		form.append("---------------\n");
		form.append("Will - willpiasecki@ymail.com\n");
		form.append("---------------\n");
		form.append("Curitiba/PR - 2012");
		form.addCommand(voltar);
		return new DisplayableAlert(form);
	}
	
	
	/**
	 * Cria lista com todas as linhas de onibus
	 * 
	 * @return list
	 */
	private DisplayableAlert criarTelaListaOnibus() {
		list = new List("Linha de Ônibus", List.IMPLICIT);
		Vector linhas = HorarioOnibusService.getLinhasOnibus();
		for (int i = 0 ; i < linhas.size(); i++) {
			list.append((String) linhas.elementAt(i), null);
		}
		list.setSelectedIndex(selectedIndex, true);
		
		list.addCommand(selecionar);
		list.addCommand(procurar);
		list.addCommand(sobre);
		list.addCommand(sair);
		
		return new DisplayableAlert(list);
	}
	
	
	/**
	 * Cria o formulário de pesquisa
	 * 
	 * @return form
	 */
	public DisplayableAlert criarTelaPesquisaLinha() {
		TextField text = new TextField("Pesquisar por linhas cujo nome começa com:", "", 100, TextField.ANY);
		Form form = new Form("Pesquisar linha");
		form.addCommand(voltar);
		form.addCommand(pesquisar);
		form.append(text);
		return new DisplayableAlert(form);
	}
	
	
	/**
	 * Cria uma tela com o resultado da pesquisa feita pelo usuário
	 * 
	 * @param pesquisadoPeloUsuario string de busca do usuário
	 * @return se não houverem resultados, volta para a própria list,
	 * com todas as linhas, junto com um alert informando de que não
	 * foram encontradas linhas. Senão, retorna um list com as novas
	 * linhas.
	 */
	private DisplayableAlert criarTelaResultadoPesquisaLinha(String pesquisadoPeloUsuario) 
	{
		Vector linhasEncontradas = HorarioOnibusService.findLinhasByNome( pesquisadoPeloUsuario );
		
		DisplayableAlert da = null;
		
		/*
		 * tratamento para quando não encontramos linha com os parâmetros
		 * inseridos pelo usuário
		 */
		if (linhasEncontradas.size() == 0) 
		{
			String mensagemAlerta = "Nenhuma linha encontrada para o texto '"+pesquisadoPeloUsuario+"'. \n" +
				"Atenção: o sistema considera acentuação.";
			Alert alert = new Alert("Nenhuma linha encontrada", mensagemAlerta, null, AlertType.INFO);
			
			da = new DisplayableAlert(list, alert);
		}
		else
		{
			list = new List("Resultado da Pesquisa", List.IMPLICIT);
			da = new DisplayableAlert(list);
			
			for (int i = 0 ; i < linhasEncontradas.size(); i++) {
				list.append((String) linhasEncontradas.elementAt(i), null);
			}
			
			list.addCommand(selecionar);
			list.addCommand(voltar);
		}
		
		return da;
	}
	
	
	
	
	protected void destroyApp(boolean arg0) {
		notifyDestroyed();
	}
	
	
	protected void pauseApp() {
		// TODO Auto-generated method stub
	}

}

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

import br.will.graviola.model.Onibus;
import br.will.graviola.service.HorarioOnibusService;
import br.will.graviola.ui.HorarioCanvas;


/**
 * Graviola MIDlet. 
 * 
 * Recursos:
 * - Sábado, 14/07/2012, das 13h as 23h, duas horas de pausa
 * - Domingo, 15/07/2012, das 8h30 às 17h, duas horas de pausa
 * - Quantidade de linhas de código: 160.091, domingo, 17h18
 * 
 * TODO: scroll suave da tabela de horarios
 * 
 * @author will
 * 
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
		Displayable d = iniciarListaOnibus();
		d.setCommandListener( this );
		display.setCurrent( d );
	}
	
	
	public void commandAction(Command command, Displayable displayable)
	{
		Displayable d = null;
		boolean setDisplayable = true;
		
		if (command == sobre) // sobre o software
		{
			d = iniciarTelaAbout();
		} 
		else if (command == sair) // sair da aplicação
		{
			destroyApp(false);
		} 
		else if (command == voltar) // voltar para listagem de onibus
		{
			d = iniciarListaOnibus();
		} 
		else if (command == selecionar || command.getLabel().equals("")) // selecionar linha de onibus usando o comando ou o botão OK
		{
			selectedIndex = list.getSelectedIndex();
			String onibusSelecionado = list.getString( selectedIndex );
			list = null;
			d = iniciarTelaHorario( onibusSelecionado );
		} 
		else if (command == procurar) // ir para tela de pesquisa de linhas
		{
			d = iniciarPesquisaLinha();
		} 
		else if (command == pesquisar) // pesquisar por linhas na lista de onibus
		{
			Form form = (Form) displayable;
			String pesquisadoPeloUsuario = ( (TextField) form.get(0) ).getString();
			int indiceEncontrado = HorarioOnibusService.findIndiceByNome( pesquisadoPeloUsuario );
			
			d = iniciarListaOnibus();
			
			/*
			 * tratamento para quando não encontramos linha com os parâmetros
			 * inseridos pelo usuário
			 */
			if (indiceEncontrado == -1) 
			{
				String mensagemAlerta = "Nenhuma linha encontrada para o texto '"+pesquisadoPeloUsuario+"'. \n" +
					"Atenção: o sistema considera acentuação.";
				setDisplayable = false;
				display.setCurrent(
						new Alert("Nenhuma linha encontrada", mensagemAlerta, null, AlertType.ERROR), d);
			}
			else
			{
				List list = (List) d;
				list.setSelectedIndex(indiceEncontrado, true);
			}
			
		}
		
		
		/*
		 * cada método "iniciar...()" retorna um displayable. Aqui setamos o
		 * command listener como esta classe e o Displayable como atual no
		 * display. 
		 * 
		 * Caso uma pesquisa não tenha sido bem-sucedida, esta condição vai 
		 * alertar o usuário e, portanto, vai se encarregar de configurar o 
		 * Displayable no display.
		 */
		if (d != null) 	d.setCommandListener(this);
		
		if (setDisplayable) display.setCurrent(d);
	}
	
	
	private Displayable iniciarTelaHorario(String nome) {
		Onibus onibus = HorarioOnibusService.getByNome(nome);
		HorarioCanvas canvas = new HorarioCanvas(onibus);
		canvas.addCommand(voltar);
		return canvas;
	}
	
	
	private Displayable iniciarTelaAbout() {
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
		return form;
	}
	
	
	private Displayable iniciarListaOnibus() {
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
		
		return list;
	}
	
	
	public Displayable iniciarPesquisaLinha() {
		TextField text = new TextField("Pesquisar por linhas cujo nome começa com:", "", 100, TextField.ANY);
		
		Form form = new Form("Pesquisar linha");
		form.addCommand(voltar);
		form.addCommand(pesquisar);
		form.append(text);
		
		return form;
	}
	
	
	protected void destroyApp(boolean arg0) {
		notifyDestroyed();
	}
	
	
	protected void pauseApp() {
		// TODO Auto-generated method stub
	}

}

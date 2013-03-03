package br.will.graviola;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.ranking.Ranking;
import br.will.graviola.ui.tela.AguardeForm;
import br.will.graviola.ui.tela.Comando;
import br.will.graviola.ui.tela.ListaOnibusForm;
import br.will.graviola.ui.tela.Tela;


/**
 * Graviola MIDlet. Captura os comandos e repassa para a tela atual, 
 * que tem a responsabilidade de tratar.
 * 
 * TODO: implementar tratamento para dispositivos com pouca memória:
 * - capturar OutOfMemoryError;
 * - gravar configuração de dispositivo de baixa memória
 * em RMS diferente do ranking (graviolaRanking)
 * - iniciar o aplicativo usando a tela inicial LowMemoryPesquisaLinhaForm
 * (que só habilita algumas telas)
 * 
 * TODO: blackberry
 * 
 * @author will
 */
public class Graviola extends MIDlet implements CommandListener
{
	public static final String VERSAO = "1.6";
	
	private Display display = Display.getDisplay(this);
	
	private Tela current;

	private Displayable aguarde = new AguardeForm(null).getDisplayableAlert().getDisplayable();
	
	/**
	 * Usado pelo touchscreen para despachar o acesso a
	 * tela de pontos. Ficou uma droga por causa disso
	 */
	static Graviola instance;
	public static Graviola instance() { return instance; }
	
	protected void startApp() throws MIDletStateChangeException
	{
		instance = this;
		
		display.setCurrent(aguarde);
		
		/*
		 * raíz da árvore de telas
		 */
		current = new ListaOnibusForm(null);
//		current = new LowMemoryPesquisaLinhaForm(null);
		
		DisplayableAlert da = current.getDisplayableAlert();
		da.getDisplayable().setCommandListener( this );
		display.setCurrent( da.getDisplayable() );
	}
	
	
	/**
	 * Controla o fluxo de telas de acordo com os comandos que o 
	 * usuário fizer. 
	 * 
	 * Cada execução pode demorar e por isso é chamada uma tela de 
	 * aguarde com uma thread para disparar a tela certa quando 
	 * finalizar o carregamento
	 */
	public void commandAction(final Command command, final Displayable displayable)
	{
		if (command == Comando.sair)
		{
			destroyApp( false );
		}
		else
		{
			current = current.dispatch(command);
			
			if (current.mustWait()) 
			{
				display.setCurrent(aguarde);
				
				displayAsync(command);
			}
			else
			{
				display(command);
			}
		}
	}
	
	
	/**
	 * Configura a tela atual como o resultado do despacho do 
	 * comando enviado pelo usuário para a tela.
	 * 
	 * @param command
	 */
	private void display(Command command)
	{
		DisplayableAlert novoDisplay = current.getDisplayableAlert();
		
		Alert alert = novoDisplay.getAlert();
		Displayable displayable;
		
		/*
		 * FIXME: Este modelo permite que uma tela retorne uma nova tela. Porém,
		 * se a nova tela retornar também um Alert, o alert vai ser engolido,
		 * sendo mostrado só o da primeira tela. Pode ser necessário 
		 * enfileirar as mensagens
		 */
		if (novoDisplay.getTela() != null)
		{
			current = novoDisplay.getTela();
			displayable = current.getDisplayableAlert().getDisplayable();
		}
		else
		{
			displayable = novoDisplay.getDisplayable();
		}
		
		displayable.setCommandListener( Graviola.this );
		
		if (alert != null) 
		{
			display.setCurrent(alert, displayable);
		}
		else 
		{
			display.setCurrent(displayable);
		}
	}
	
	
	/**
	 * Configura a tela atual como o resultado do despacho do
	 * comando enviado pelo usuário para a tela. Pode ser
	 * usado de forma assíncrona, quando a tela pode demorar
	 * para carregar, como uma pesquisa
	 * 
	 * @param command
	 */
	private void displayAsync(final Command command)
	{
		/*
		 * Carregamento assíncrono, como não sabemos como a pesquisa pode
		 * demorar de um celular para outro.
		 */
		Runnable r = new Runnable() 
		{
			public void run()
			{
				display(command);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
	
	
	protected void destroyApp(boolean arg0) 
	{
		Ranking.instance().close();
		notifyDestroyed();
	}
	
	
	protected void pauseApp() {
		// TODO Auto-generated method stub
	}

}

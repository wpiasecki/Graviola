package br.will.graviola;

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
 * Graviola MIDlet. 
 * 
 * @author will
 */
public class Graviola extends MIDlet implements CommandListener
{
	public static final String VERSAO = "1.4b2";
	
	private Display display = Display.getDisplay(this);
	
	private Tela current;

	private Displayable aguarde = new AguardeForm(null).getDisplayable().getDisplayable();
	
	protected void startApp() throws MIDletStateChangeException
	{
		display.setCurrent(aguarde);
		
		current = new ListaOnibusForm(null);
		
		DisplayableAlert da = current.getDisplayable();
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
			display.setCurrent(aguarde);
			
			/*
			 * Carregamento assíncrono, como não sabemos como a pesquisa pode
			 * demorar de um celular para outro.
			 * 
			 * Só que este troço em TODAS AS TELAS tá enchendo o saco.
			 */
			Runnable r = new Runnable() 
			{
				public void run()
				{
					current = current.dispatch(command);
					
					DisplayableAlert novoDisplay = current.getDisplayable();
					
					novoDisplay.getDisplayable().setCommandListener(Graviola.this); 
					
					if (novoDisplay.getAlert() != null) 
					{
						display.setCurrent(novoDisplay.getAlert(), novoDisplay.getDisplayable());
					} 
					else 
					{
						display.setCurrent(novoDisplay.getDisplayable());
					}
					
				}
			};
			
			Thread t = new Thread(r);
			t.start();
		}
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

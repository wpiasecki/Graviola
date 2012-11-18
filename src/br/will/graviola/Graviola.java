package br.will.graviola;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.ranking.Ranking;
import br.will.graviola.ui.tela.ListaOnibusForm;
import br.will.graviola.ui.tela.UIHandler;


/**
 * Graviola MIDlet. 
 * 
 * @author will
 */
public class Graviola extends MIDlet implements CommandListener
{
	public static final String VERSAO = "1.3.0";
	
	private Display display = Display.getDisplay(this);
	
	private UIHandler current;

	
	protected void startApp() throws MIDletStateChangeException
	{
		current = new ListaOnibusForm(null);
		
		DisplayableAlert da = current.getDisplayable();
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
		current = current.dispatch(command);
		
		if (current == null) 
		{
			destroyApp( false );
		}
		else
		{
			DisplayableAlert novoDisplay = current.getDisplayable();
			
			/*
			 * cada método "iniciar...()" retorna um displayable. Aqui setamos o
			 * command listener como esta classe e o Displayable como atual no
			 * display. 
			 */
			if (novoDisplay != null) 
			{
				novoDisplay.getDisplayable().setCommandListener(this); 
				
				if (novoDisplay.getAlert() != null) 
				{
					display.setCurrent(novoDisplay.getAlert(), novoDisplay.getDisplayable());
				} 
				else 
				{
					display.setCurrent(novoDisplay.getDisplayable());
				}
			}
		}
	}
	
	
	protected void destroyApp(boolean arg0) 
	{
		Ranking.getRanking().close();
		notifyDestroyed();
	}
	
	
	protected void pauseApp() {
		// TODO Auto-generated method stub
	}

}

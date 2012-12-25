package br.will.graviola.model;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Displayable;

import br.will.graviola.ui.tela.Tela;

/**
 * Classe que representa o resultado do processamento do método 
 * Tela::getDisplayable(). Funciona similar a um render()/redirect() 
 * de frameworks como o grails, pois permite renderizar outra tela, 
 * retornar uma mensagem de erro, etc.  
 * 
 * @author will
 *
 */
public class DisplayableAlert
{
	private Displayable displayable;
	private Alert alert;
	private Tela tela;

	public DisplayableAlert() { }
	
	public DisplayableAlert(Displayable displayable)
	{
		this.displayable = displayable;
	}

	public DisplayableAlert(Displayable displayable, Alert alert)
	{
		this.displayable = displayable;
		this.alert = alert;
	}
	
	public DisplayableAlert(Tela tela, Alert alert)
	{
		this.alert = alert;
		this.tela = tela;
	}

	public Displayable getDisplayable()
	{
		return displayable;
	}

	public Alert getAlert()
	{
		return alert;
	}

	public Tela getTela()
	{
		return tela;
	}
	
}

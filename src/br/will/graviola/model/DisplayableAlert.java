package br.will.graviola.model;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Displayable;

public class DisplayableAlert
{
	private Displayable displayable;
	private Alert alert;

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

	public Displayable getDisplayable()
	{
		return displayable;
	}

	public void setDisplayable(Displayable displayable)
	{
		this.displayable = displayable;
	}

	public Alert getAlert()
	{
		return alert;
	}

	public void setAlert(Alert alert)
	{
		this.alert = alert;
	}
	
}

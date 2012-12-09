package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;

import br.will.graviola.model.DisplayableAlert;

public class AguardeForm extends Tela
{
	public AguardeForm(Tela parent)
	{
		super(parent);
	}

	public Tela dispatch(Command command)
	{
		return this;
	}

	public DisplayableAlert getDisplayable()
	{
		Form form = new Form("Aguarde");
		form.append("Por favor, aguarde...");
		return new DisplayableAlert(form);
	}

}

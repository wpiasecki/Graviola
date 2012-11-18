package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import br.will.graviola.model.DisplayableAlert;


/**
 * Cria o formulário de pesquisa
 * 
 * @return form
 */
public class PesquisaForm extends UIHandler
{
	public PesquisaForm(UIHandler parent)
	{
		super(parent);
	}

	public UIHandler dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		} 
		else if (command == Comando.pesquisar) // pesquisar por linhas na lista de onibus
		{
			Form form = (Form) getCurrent().getDisplayable();
			String pesquisadoPeloUsuario = ( (TextField) form.get(0) ).getString();
			
			return new ResultadoPesquisaForm(this, pesquisadoPeloUsuario);
		}
		
		throw new IllegalArgumentException(
				"Tela PesquisaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	
	public DisplayableAlert getDisplayable()
	{
		TextField text = new TextField("Pesquisar por linhas cujo nome começa com:", "", 100, TextField.ANY);
		Form form = new Form("Pesquisar linha");
		form.addCommand(Comando.voltar);
		form.addCommand(Comando.pesquisar);
		form.append(text);
		setCurrent( new DisplayableAlert(form) );
		return getCurrent();
	}
	
}

package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.FonteDeDados;
import br.will.graviola.service.OnibusService;


/**
 * Classe para trabalhar com dispositivos com pouca memória:
 * ao invés de apresentar a listagem de linhas e armazená-las em
 * memória, utiliza somente o formulário de pesquisa.
 *  
 * @author will
 *
 */
public class LowMemoryPesquisaLinhaForm extends Tela
{
	public LowMemoryPesquisaLinhaForm(Tela parent)
	{
		super(parent);
	}


	public Tela dispatch(Command command)
	{
		if (command == Comando.pesquisar) // pesquisar por linhas na lista de onibus
		{
			Form form = (Form) getCurrent().getDisplayable();
			final String pesquisadoPeloUsuario = ( (TextField) form.get(0) ).getString();
			
			FonteDeDados fonte = new FonteDeDados() {
				public Vector get() {
					return OnibusService.instance().pesquisarOnibusByNome(pesquisadoPeloUsuario);
				}
			};
			
			return new ResultadoPesquisaLinhaForm(this, pesquisadoPeloUsuario, fonte);
		}
		else if (command == Comando.sobre)
		{
			return new AboutForm(this);
		}
		else if (command == Comando.pesquisarPonto)
		{
			return new PesquisaPontoForm(this);
		}
		
		throw new IllegalArgumentException(
				"Tela PesquisaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	
	public DisplayableAlert getDisplayableAlert()
	{
		TextField text = new TextField("Pesquisar por linhas cujo nome começa com:", "", 100, TextField.ANY);
		Form form = new Form("Pesquisar linha");
		form.addCommand(Comando.sair);
		form.addCommand(Comando.pesquisar);
		form.addCommand(Comando.sobre);
		form.addCommand(Comando.pesquisarPonto);
		form.append(text);
		setCurrent( new DisplayableAlert(form) );
		return getCurrent();
	}

	
	public boolean mustWait()
	{
		return false;
	}

}

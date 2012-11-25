package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.FonteDeDados;
import br.will.graviola.service.HorarioOnibusService;


/**
 * Cria o formulário de pesquisa
 * 
 * @return form
 */
public class PesquisaLinhaForm extends Tela
{
	public PesquisaLinhaForm(Tela parent)
	{
		super(parent);
	}

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		} 
		else if (command == Comando.pesquisar) // pesquisar por linhas na lista de onibus
		{
			Form form = (Form) getCurrent().getDisplayable();
			final String pesquisadoPeloUsuario = ( (TextField) form.get(0) ).getString();
			
			
			FonteDeDados fonte = new FonteDeDados() {
				public Vector get() {
					return HorarioOnibusService.findLinhasByNome(pesquisadoPeloUsuario);
				}
			};
			
			
			return new ResultadoPesquisaLinhaForm(this, pesquisadoPeloUsuario, fonte);
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

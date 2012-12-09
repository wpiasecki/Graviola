package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.FonteDeDados;
import br.will.graviola.service.OnibusService;

public class ListaPontoForm extends Tela
{
	private int selectedIndex;
	
	public ListaPontoForm(Tela parent)
	{
		super(parent);
	}

	public Tela dispatch(Command command)
	{
		if (command == Comando.pesquisar)
		{
			return new PesquisaPontoForm(this);
		}
		else if (command == Comando.voltar)
		{
			return getParent();
		}
		else if (command == Comando.selecionar || command.getLabel().equals(""))
		{
			List list = (List) getCurrent().getDisplayable();
			
			selectedIndex = list.getSelectedIndex();
			
			final String pontoSelecionado = list.getString( selectedIndex );
			
			/*
			 * "Closure" para definir como a ResultadoPesquisaLinhaForm
			 * deve obter os dados
			 */
			FonteDeDados fonte = new FonteDeDados() {
				public Vector get() {
					return OnibusService.instance().pesquisarOnibusByPonto(pontoSelecionado);
				}
			};
			
			return new ResultadoPesquisaLinhaForm(this, pontoSelecionado, fonte);
		}
		
		throw new IllegalArgumentException(
				"Tela ListPontoForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	public DisplayableAlert getDisplayable()
	{
		List list = new List("Pontos", List.IMPLICIT);
		list.addCommand(Comando.pesquisar);
		list.addCommand(Comando.selecionar);
		list.addCommand(Comando.voltar);
		
		Vector pontos = OnibusService.instance().getPontos();
		for(int i = 0; i < pontos.size(); i++) {
			list.append((String) pontos.elementAt(i), null);
		}
		
		list.setSelectedIndex(selectedIndex, true);
		
		setCurrent(new DisplayableAlert(list));
		return getCurrent();
	}

}

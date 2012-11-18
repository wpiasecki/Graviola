package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;

/**
 * Tela para apresentar as listagem de pontos de uma linha
 * 
 * @author will
 *
 */
public class PontoForm extends UIHandler
{
	private Onibus onibus;

	public PontoForm(UIHandler parent, Onibus onibus)
	{
		super(parent);
		this.onibus = onibus;
	}
	

	public UIHandler dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		} 
		else 
		{
			List list = (List) getCurrent().getDisplayable();
			String ponto = list.getString( list.getSelectedIndex() );
			((HorarioForm)getParent()).setPontoSelecionado(ponto);
			return getParent();
		}
	}

	
	public DisplayableAlert getDisplayable()
	{
		List list = new List("Pontos da linha " + onibus.getNome(), List.IMPLICIT);
		Vector pontos = onibus.getPontos();
		for (int i = 0; i < pontos.size(); i++) 
		{
			Ponto ponto = (Ponto) pontos.elementAt(i);
			list.append(ponto.getNomeFormatado(), null);
		}
		
		list.addCommand(Comando.selecionar);
		list.addCommand(Comando.voltar);
		
		setCurrent(new DisplayableAlert(list));
		
		return getCurrent();
	}

}

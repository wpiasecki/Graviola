package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;

/**
 * Tela para apresentar a lista de pontos de uma linha
 * 
 * @author will
 *
 */
public class PontoForm extends Tela
{
	private Onibus onibus;
	private int pontoSelecionado;

	
	public PontoForm(Tela parent, Onibus onibus, int pontoSelecionado)
	{
		super(parent);
		this.onibus = onibus;
		this.pontoSelecionado = pontoSelecionado;
	}
	

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		} 
		else 
		{
			List list = (List) getCurrent().getDisplayable();
			((HorarioForm)getParent()).setPontoSelecionado(list.getSelectedIndex());
			return getParent();
		}
	}

	
	public DisplayableAlert getDisplayableAlert()
	{
		List list = new List("Pontos da linha " + onibus.getNome(), List.IMPLICIT);
		Vector pontos = onibus.getPontos();
		for (int i = 0; i < pontos.size(); i++) 
		{
			Ponto ponto = (Ponto) pontos.elementAt(i);
			list.append(ponto.getNomeFormatado(), null);
		}
		if (pontoSelecionado != -1) { list.setSelectedIndex(pontoSelecionado, true); }
		
		list.addCommand(Comando.selecionar);
		list.addCommand(Comando.voltar);
		
		setCurrent(new DisplayableAlert(list));
		
		return getCurrent();
	}


	public boolean mustWait()
	{
		return false;
	}

}

package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.HorarioOnibusService;
import br.will.graviola.service.ranking.Ranking;
import br.will.graviola.ui.Fonte;


/**
 * Cria lista com todas as linhas de onibus
 * 
 * @return list
 */
public class ListaOnibusForm extends UIHandler
{
	private int selectedIndex;
	
	public ListaOnibusForm(UIHandler parent)
	{
		super(parent);
		
	}

	public UIHandler dispatch(Command command)
	{
		if (command == Comando.selecionar || command.getLabel().equals("")) // selecionar linha de onibus usando o comando ou o botão OK
		{
			List list = (List) getCurrent().getDisplayable();
			selectedIndex = list.getSelectedIndex();
			String linhaSelecionada = list.getString( selectedIndex );
			list = null;
			
			Ranking.getRanking().gravar( linhaSelecionada );
			
			return new HorarioForm(this, linhaSelecionada);
		} 
		else if (command == Comando.procurar) // ir para tela de pesquisa de linhas
		{
			return new PesquisaForm(this);
		}
		else if (command == Comando.sobre) // sobre o software
		{
			return new AboutForm(this);
		}
		else if (command == Comando.sair) // sair da aplicação
		{
			return null;
		}
		
		throw new IllegalArgumentException(
				"Tela ListOnibusForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	public DisplayableAlert getDisplayable()
	{
		List list = new List("Linha de Ônibus", List.IMPLICIT);
		
		Vector linhasMaisUtilizadas = Ranking.getRanking().getLinhasMaisUtilizadas();
		for (int i = 0; i < linhasMaisUtilizadas.size() ; i++) {
			list.append( (String) linhasMaisUtilizadas.elementAt(i), null );
		}
		
		Vector linhas = HorarioOnibusService.getLinhasOnibus();
		
		for (int i = 0 ; i < linhas.size(); i++) 
		{
			String linha = (String) linhas.elementAt(i);
			list.append(linha, null);
		}
		list.setSelectedIndex(selectedIndex, true);
		
		list.addCommand(Comando.selecionar);
		list.addCommand(Comando.procurar);
		list.addCommand(Comando.sobre);
		list.addCommand(Comando.sair);
		
		for (int i = 0; i < linhasMaisUtilizadas.size(); i++) {
			list.setFont( i, Fonte.bold() );
		}
		
		setCurrent(new DisplayableAlert(list));
		
		return getCurrent();
	}

}

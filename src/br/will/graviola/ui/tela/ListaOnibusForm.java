package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.OnibusService;
import br.will.graviola.service.ranking.Ranking;
import br.will.graviola.ui.Fonte;


/**
 * Cria lista com todas as linhas de onibus
 * 
 * @return list
 */
public class ListaOnibusForm extends Tela
{
	private int selectedIndex;
	
	public ListaOnibusForm(Tela parent)
	{
		super(parent);
	}

	public Tela dispatch(Command command)
	{
		if (command == Comando.selecionar || command.getLabel().equals("")) // selecionar linha de onibus usando o comando ou o botão OK
		{
			List list = (List) getCurrent().getDisplayable();
			selectedIndex = list.getSelectedIndex();
			String linhaSelecionada = list.getString( selectedIndex );
			setCurrent(null);
			
			Ranking.instance().gravar( linhaSelecionada );
			
			return new HorarioForm(this, linhaSelecionada);
		} 
		else if (command == Comando.pesquisarLinha) // ir para tela de pesquisa de linhas
		{
			return new PesquisaLinhaForm(this);
		}
		else if (command == Comando.pesquisarPonto) // ir para tela de pesquisa de linhas
		{
			return new PesquisaPontoForm(this);
		}
		else if (command == Comando.sobre) // sobre o software
		{
			return new AboutForm(this);
		}
		else if (command == Comando.sair) // sair da aplicação
		{
			return null;
		}
		else if (command == Comando.pontos)
		{
			return new ListaPontoForm(this);
		}
		else if (command == Comando.mapa)
		{
			setCurrent(null); // lista de onibus + mapa, em memoria = OOM
			return new MapaForm(this);
		}
		
		throw new IllegalArgumentException(
				"Tela ListOnibusForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	
	public DisplayableAlert getDisplayableAlert()
	{
		/*
		 * se a lista já foi carregada, ela precisa ficar na memória
		 * para buscar a linha selecionada pelo usuário.
		 */
		if (getCurrent() == null)  
		{
			final List list = new List("Linha de Ônibus", List.IMPLICIT);
			
			Vector linhasMaisUtilizadas = Ranking.instance().getLinhasMaisUtilizadas();
			for (int i = 0; i < linhasMaisUtilizadas.size() ; i++) {
				list.append( (String) linhasMaisUtilizadas.elementAt(i), null );
			}
			
			Vector linhas = OnibusService.instance().getLinhas();
			for (int i = 0 ; i < linhas.size(); i++) {
				list.append((String) linhas.elementAt(i), null);
			}
			
			list.addCommand(Comando.selecionar);
			list.addCommand(Comando.pesquisarLinha);
			list.addCommand(Comando.pesquisarPonto);
			list.addCommand(Comando.sobre);
			list.addCommand(Comando.sair);
			list.addCommand(Comando.pontos);
//			list.addCommand(Comando.mapa);
			
			for (int i = 0; i < linhasMaisUtilizadas.size(); i++) {
				list.setFont( i, Fonte.bold() );
			}
			
			list.setSelectedIndex(selectedIndex, true);
			
			setCurrent(new DisplayableAlert(list));
		}
		return getCurrent();
	}

	public boolean mustWait()
	{
		return getCurrent() == null;
	}

}

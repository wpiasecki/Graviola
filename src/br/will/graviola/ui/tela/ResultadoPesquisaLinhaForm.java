package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.FonteDeDados;
import br.will.graviola.service.ranking.Ranking;


/**
 * Cria uma tela com o resultado da pesquisa feita pelo usuário
 * 
 * @param pesquisadoPeloUsuario string de busca do usuário
 * @return se não houverem resultados, volta para a própria list,
 * com todas as linhas, junto com um alert informando de que não
 * foram encontradas linhas. Senão, retorna um list com as novas
 * linhas.
 */
public class ResultadoPesquisaLinhaForm extends Tela
{
	private String pesquisadoPeloUsuario;
	private FonteDeDados fonteDeDados;
	
	public ResultadoPesquisaLinhaForm(Tela parent, String pesquisadoPeloUsuario, FonteDeDados dataSource)
	{
		super(parent);
		this.pesquisadoPeloUsuario = pesquisadoPeloUsuario;
		this.fonteDeDados = dataSource;
	}
	
	
	public Tela dispatch(Command command)
	{
		if (command == Comando.selecionar || command.getLabel().equals("")) // selecionar linha de onibus usando o comando ou o botão OK
		{
			List list = (List) getCurrent().getDisplayable();
			int selectedIndex = list.getSelectedIndex();
			String linhaSelecionada = list.getString( selectedIndex );
			list = null;
			
			Ranking.getRanking().gravar( linhaSelecionada );
			
			return new HorarioForm(this, linhaSelecionada);
		} 
		else if (command == Comando.voltar) 
		{
			return getParent().dispatch(command);
		}
		
		throw new IllegalArgumentException(
				"Tela ResultadoPesquisaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}
	

	public DisplayableAlert getDisplayable()
	{
		Vector linhasEncontradas = fonteDeDados.get();

		DisplayableAlert da = null;
		
		/*
		 * tratamento para quando não encontramos linha com os parâmetros inseridos
		 * pelo usuário
		 */
		if (linhasEncontradas.size() == 0)
		{
			String mensagemAlerta = "Nenhuma linha encontrada para o texto '" + pesquisadoPeloUsuario + "'. \n"
					+ "Atenção: o sistema considera acentuação.";
			Alert alert = new Alert("Nenhuma linha encontrada", mensagemAlerta, null, AlertType.INFO);

			da = new DisplayableAlert(getParent().getCurrent().getDisplayable(), alert);
		} else
		{
			List list = new List("Resultado da Pesquisa", List.IMPLICIT);
			da = new DisplayableAlert(list);

			for (int i = 0; i < linhasEncontradas.size(); i++)
			{
				list.append((String) linhasEncontradas.elementAt(i), null);
			}

			list.addCommand(Comando.selecionar);
			list.addCommand(Comando.voltar);
		}
		
		setCurrent(da);
		
		return getCurrent();
	}

}

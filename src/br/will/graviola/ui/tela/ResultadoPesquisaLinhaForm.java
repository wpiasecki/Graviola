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
	private int selectedIndex;
	
	/**
	 * Construtora padrão. Recebe uma fonte de dados, que pode ser uma
	 * pesquisa por linhas a partir de uma string ou a partir de pontos 
	 * 
	 * @param parent tela pai
	 * @param pesquisadoPeloUsuario string que o usuário pesquisou ou
	 * o nome do ponto usado para apresentar as linhas
	 * @param fonteDeDados fonte dos dados da pesquisa
	 */
	public ResultadoPesquisaLinhaForm(Tela parent, String pesquisadoPeloUsuario, FonteDeDados fonteDeDados)
	{
		super(parent);
		this.pesquisadoPeloUsuario = pesquisadoPeloUsuario;
		this.fonteDeDados = fonteDeDados;
	}
	
	
	public Tela dispatch(Command command)
	{
		if (command == Comando.selecionar || command.getLabel().equals("")) // selecionar linha de onibus usando o comando ou o botão OK
		{
			List list = (List) getCurrent().getDisplayable();
			selectedIndex = list.getSelectedIndex();
			String linhaSelecionada = list.getString( selectedIndex );
			list = null;
			
			Ranking.instance().gravar( linhaSelecionada );
			
			return new HorarioForm(this, linhaSelecionada);
		} 
		else if (command == Comando.voltar) 
		{
			Tela pai = getParent();
			
			/*
			 * Esta condicional horrível é para não retornar para formulários de 
			 * pesquisa, mas sim sempre voltar para listagens.
			 */
			if (pai.getClass() == PesquisaLinhaForm.class || pai.getClass() == PesquisaPontoForm.class) {
				return pai.dispatch(command);
			} else {
				return pai;
			}
		}
		
		throw new IllegalArgumentException(
				"Tela ResultadoPesquisaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}
	

	public DisplayableAlert getDisplayableAlert()
	{
		Vector linhasEncontradas = fonteDeDados.get();

		/*
		 * tratamento para quando não encontramos linha com os parâmetros inseridos
		 * pelo usuário
		 */
		if (linhasEncontradas.size() == 0)
		{
			String mensagemAlerta = "Nenhuma linha encontrada para o texto '" + pesquisadoPeloUsuario + "'. \n"
					+ "Atenção: o sistema considera acentuação.";
			Alert alert = new Alert("Nenhuma linha encontrada", mensagemAlerta, null, AlertType.INFO);

			return new DisplayableAlert(getParent(), alert);
		} 
		else
		{
			List list = new List("Resultado da Pesquisa", List.IMPLICIT);
			list.addCommand(Comando.voltar);

			for (int i = 0; i < linhasEncontradas.size(); i++)
			{
				list.append((String) linhasEncontradas.elementAt(i), null);
			}

			list.addCommand(Comando.selecionar);
			
			list.setSelectedIndex(selectedIndex, true);
			
			setCurrent( new DisplayableAlert(list) );
			
			return getCurrent();
		}
	}


	public boolean mustWait()
	{
		return true;
	}

}

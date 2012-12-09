package br.will.graviola.ui.tela;

import java.util.Vector;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.List;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.service.FonteDeDados;
import br.will.graviola.service.OnibusService;

/**
 * Apresenta o resultado da pesquisa de pontos efetuada pelo usuário
 * 
 * @author will
 *
 */
public class ResultadoPesquisaPontoForm extends Tela
{
	private String nomePonto;
	private int selectedIndex;
	
	public ResultadoPesquisaPontoForm(Tela parent, String nomePonto)
	{
		super(parent);
		this.nomePonto = nomePonto;
	}
	

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar)
		{
			return getParent().dispatch(command);
		}
		else if (command == Comando.selecionar || command.getLabel().equals(""))
		{
			List list = (List) getCurrent().getDisplayable();
			selectedIndex = list.getSelectedIndex();
			final String ponto = list.getString(selectedIndex);
			
			
			/*
			 * "Closure" para definir como a ResultadoPesquisaLinhaForm
			 * deve obter os dados
			 */
			FonteDeDados fonte = new FonteDeDados() {
				public Vector get() {
					return OnibusService.instance().pesquisarOnibusByPonto(ponto);
				}
			};
			
			
			return new ResultadoPesquisaLinhaForm(this, ponto, fonte);
		}
		
		throw new IllegalArgumentException(
				"Tela ResultadoPesquisaPontoForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}
	

	public DisplayableAlert getDisplayable()
	{
		List list = new List("Resultado da pesquisa por pontos", List.IMPLICIT);
		
		Vector pontos = OnibusService.instance().pesquisarPontosByNome(nomePonto);
		
		DisplayableAlert da = new DisplayableAlert(list);
		
		if (pontos.size() > 0)
		{
			for (int i = 0; i < pontos.size(); i++)
			{
				list.append((String) pontos.elementAt(i), null);
			}
			
			list.addCommand(Comando.voltar);
			list.addCommand(Comando.selecionar);
			
			list.setSelectedIndex(selectedIndex, true);
			
			setCurrent(da);
			return getCurrent();
		}
		else 
		{
			String mensagemAlerta = "Nenhum ponto encontrado com o texto '" + nomePonto + "'. \n"
					+ "Atenção: o sistema considera acentuação.";
			Alert alert = new Alert("Nenhum ponto encontrado", mensagemAlerta, null, AlertType.INFO);

			da = new DisplayableAlert(getParent().getCurrent().getDisplayable(), alert);
		}
		
		return da;
		
	}

}

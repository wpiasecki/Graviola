package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.model.Onibus;
import br.will.graviola.service.OnibusService;
import br.will.graviola.ui.HorarioCanvas;

/**
 * Cria canvas com o horário do onibus selecionado
 * 
 * tempo para realizar a busca usando '==': 2799 2732 2998 = 2843
 * tempo para realizar a busca usando 'equals()': 3158 3121 3172 = 3150
 * @param nome
 * @return
 */
public class HorarioForm extends Tela
{
	private int pontoSelecionado = -1;
	private Onibus onibus;

	public HorarioForm(Tela parent, String linha)
	{
		super(parent);
		onibus = OnibusService.instance().getOnibus( linha );
	}
	

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		}
		else if (command == Comando.pontos)
		{
			return new PontoForm(this, onibus, pontoSelecionado);
		}
		
		throw new IllegalArgumentException(
				"Tela PesquisaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}
	
	
	public DisplayableAlert getDisplayableAlert()
	{
		HorarioCanvas canvas = new HorarioCanvas(onibus, pontoSelecionado);
		canvas.addCommand( Comando.voltar );
		canvas.addCommand( Comando.pontos );
		
		return new DisplayableAlert(canvas);
	}
	
	void setPontoSelecionado(int ponto) {
		pontoSelecionado = ponto;
	}


	public boolean mustWait()
	{
		return false;
	}
	
}

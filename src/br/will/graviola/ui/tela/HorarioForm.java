package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.model.Onibus;
import br.will.graviola.service.HorarioOnibusService;
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
	private String pontoSelecionado;
	private Onibus onibus;

	public HorarioForm(Tela parent, String linha)
	{
		super(parent);
		onibus = HorarioOnibusService.getByNome( linha );
	}
	

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		}
		else if (command == Comando.pontos)
		{
			pontoSelecionado = command.getLabel();
			
			return new PontoForm(this, onibus);
		}
		
		throw new IllegalArgumentException(
				"Tela PesquisaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}
	
	
	public DisplayableAlert getDisplayable()
	{
		HorarioCanvas canvas = new HorarioCanvas(onibus, pontoSelecionado);
		this.pontoSelecionado = null;
		canvas.addCommand( Comando.voltar );
		
		canvas.addCommand( Comando.pontos );
		
		return new DisplayableAlert(canvas);
	}
	
	void setPontoSelecionado(String ponto) {
		pontoSelecionado = ponto;
	}
	
}

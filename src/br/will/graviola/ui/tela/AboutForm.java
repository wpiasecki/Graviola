package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;

import br.will.graviola.Graviola;
import br.will.graviola.model.DisplayableAlert;

public class AboutForm extends Tela
{
	public AboutForm(Tela parent)
	{
		super(parent);
	}

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar) 
		{
			return getParent();
		}
		
		throw new IllegalArgumentException(
				"Tela AboutForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	public DisplayableAlert getDisplayableAlert()
	{
		Form form = new Form("");
		form.append("-- Graviola " + Graviola.VERSAO + " --\n");
		form.append("Aplicativo para visualização offline dos horários de");
		form.append("onibus disponíveis no site da URBS.\n");
		form.append("\n");
		form.append("---------------\n");
		form.append("Este aplicativo não possui suporte, e os riscos da utilização, " +
				"incluindo eventuais danos ao aparelho, são de inteira responsabilidade " +
				"do usuário.\n");
		form.append("Este aplicativo não coleta informações pessoais (salvo as " +
				"linhas mais utilizadas para elaboração dos favoritos, restrito ao próprio " +
				"aparelho) e não efetua conexão com a internet.\n");
		form.append("---------------\n");
		form.append("Will\n");
		form.append("https://github.com/wpiasecki/Graviola/wiki/Graviola\n");
		form.append("---------------\n");
		form.append("Curitiba/PR - 2012");
		form.addCommand(Comando.voltar);
		return new DisplayableAlert(form);
	}

	public boolean mustWait()
	{
		return false;
	}

}

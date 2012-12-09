package br.will.graviola.ui.tela;

import javax.microedition.lcdui.Command;

import br.will.graviola.model.DisplayableAlert;

/**
 * Classe base para as telas.
 * 
 * A modelo de navegação funciona assim:
 * - É criado um pai pela classe midlet
 * - cada classe sabe como tratar eventos e redirecionar as 
 * chamadas para os filhos
 * - cada filho pode retornar o controle da tela para o pai
 * 
 * Considerando as classes que temos, a árvore está assim (1.4b):
 * 
 * ListaOnibusForm
 *      | 
 *      +-- HorarioForm -- PontoForm
 *      |
 *      +-- PesquisaForm --+-- ResultadoPesquisaForm -- HorarioForm -- PontoForm
 *      |
 *      +-- AboutForm
 *      |
 *      +-- ListaPontoForm --+-- PesquisaPontoForm
 *                           |              |
 *                           +-- ResultadoPesquisaPontoForm
 *                                          |
 *                                          +-- ResultadoPesquisaLinhaForm
 *                                                          |
 *                                                          +-- HorarioForm -- PontoForm
 * 
 * É possível que cada classe salve a tela que desenhou dentro da
 * sua propriedade 'current'. Isto pode ocupar bastante memória, 
 * então melhor não usar sem necessidade :-)
 * 
 * @author will
 *
 */
public abstract class Tela
{
	private Tela parent;
	private DisplayableAlert current;
	
	
	/**
	 * Cria uma nova tela com referência para a tela pai
	 * 
	 * @param parent o objeto que criou esta classe
	 */
	public Tela(Tela parent) {
		this.parent = parent;
	}
	
	
	/**
	 * Retorna o pai que criou este objeto
	 * 
	 * @return Tela pai
	 */
	protected Tela getParent()
	{
		return parent;
	}
	
	
	/**
	 * Retorna o displayable atual. Pode ser nulo, se não tiver
	 * sido salvo durante a geração, no <code>getDisplayable()</code>
	 * 
	 * @return DisplayableAlert
	 */
	protected DisplayableAlert getCurrent()
	{
		return current;
	}

	
	/**
	 * Seta a tela que foi feita pelo objeto. Isto permite que o objeto 
	 * seja alterado posteriormente, sem precisar ser gerado novamente, 
	 * mas pode ocupar bastante memória.
	 * 
	 * @param current objeto DisplayableAlert
	 */
	protected void setCurrent(DisplayableAlert current)
	{
		this.current = current;
	}

	
	/**
	 * Permite que o objeto responda a um comando.
	 * Este é o cerne da organização dos objetos; uma classe filha
	 * pode retornar uma classe neta ou retornar o controle
	 * para a classe pai. 
	 * 
	 * O objeto retornado é manipulado pela MIDlet Graviola. 
	 * 
	 * @param command comando que deve ser interpretado pelo
	 * objeto
	 * @return objeto de classe Tela. Pode ser o mesmo objeto,
	 * classe pai ou classe filha
	 */
	public abstract Tela dispatch(Command command);

	
	/**
	 * Obtém a tela que é feita por este objeto. A maior parte das
	 * telas gera o displayable do zero, a cada chamada de método.
	 * 
	 * @return objeto DisplayableAlert
	 */
	public abstract DisplayableAlert getDisplayable();
}

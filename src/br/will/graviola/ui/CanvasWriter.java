package br.will.graviola.ui;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

import br.will.graviola.model.Ponto;
import br.will.graviola.service.Drawable;

/**
 * Esta classe concentra lógica para escrever na tela tratando
 * para não escrever fora dela.
 * 
 * @author will
 *
 */
public class CanvasWriter
{
	private HorarioCanvas horarioCanvas;

	
	/*
	 * Altura de cada linha
	 */
	int lineHeight = 21;
	
	
	int posicaoLinha;
	
	
	public CanvasWriter(HorarioCanvas canvas)
	{
		this.horarioCanvas = canvas;
	}
	
	
	private Graphics g;
	
	
	/**
	 * Desenha um quadrado branco do tamanho da tela e coloca a
	 * cor de fonte para preto;
	 */
	void limparTela() 
	{
		g.setColor( Cor.branco() );
		g.fillRect( 0, 0, horarioCanvas.width, horarioCanvas.height );
		g.setColor( Cor.preto() );
	}
	
	
	/**
	 * Retorna TRUE se a posição desejada está dentro do enquadramento. Se
	 * retornar FALSE, o objeto não deve ser desenhado, pois consumirá 
	 * recursos sem mostrar nada visível em tela.
	 * 
	 * @param x posição X inicial do objeto a ser desenhado
	 * @param y posição Y inicial do objeto a ser desenhado
	 * @return TRUE, se posição estiver no enquadramento
	 */
	public boolean validarPosicaoEscrita(int x, int y) 
	{
		return y >= -lineHeight && y < horarioCanvas.height;
	}
	
	
	/**
	 * Escreve um texto no canvas se ele estiver dentro do enquadramento.
	 * 
	 * @param text texto a ser escrito
	 * @param x posição X do texto
	 * @param y posição Y do texto
	 * @return TRUE se o objeto foi desenhado
	 */
	void write(String text, int x, int y, Font fonte) 
	{
		if ( validarPosicaoEscrita(x, y) ) {
			Font oldFont = g.getFont();
			g.setFont(fonte);
			g.drawString(text, x, y, 0);
			g.setFont(oldFont);
		}
	}
	
	
	/**
	 * Método preferido para o uso: utiliza um Drawable, ou seja, uma
	 * closure analógica do Java :-P
	 * 
	 * Este método vai testar se o objeto que vai ser desenhado não
	 * extrapola os limites de linha e altura
	 * 
	 * O "0 - lineWidth" vai permitir que seja escrito um "rabicho"
	 * de texto na parte superior. Acho que deixa a interface melhor,
	 * senão coisas ficam sumindo...
	 * 
	 * @param d objeto Drawable
	 * @param x posição X do desenho
	 * @param y posição Y do desenho
	 * @return TRUE se o objeto foi desenhado
	 */
	void write(Drawable d, int x, int y, Font font) 
	{
		if ( validarPosicaoEscrita(x, y) ) 
			d.draw( g ); 
	}
	
	
	void write(Drawable d, int x, int y) 
	{
		write(d, x, y, Fonte.normal());
	}
	
	
	void write(String s, Font font) 
	{
		write(s, 0, posicaoLinha, font);
	}
	
	
	void writeln() 
	{
		posicaoLinha += lineHeight;
	}
	
	
	void writeln(String s, Font font) 
	{
		write(s, 0, posicaoLinha, font);
		writeln();
	}
	
	
	void writeln(String s) 
	{
		writeln(s, Fonte.normal());
	}
	
	
	/**
	 * Escreve um horário no canvas.
	 * 
	 * @param horaText
	 * @param x
	 * @param y
	 * @param horaDrawer
	 */
	void writeHorario(Ponto ponto, String horario, int x, int y, HoraDrawer horaDrawer) 
	{
		/*
		 * A repetição desta condicional é necessária para fins de performance.
		 * O método "getDrawer" vai buscar os horários que devem ser marcados
		 * e é custoso.
		 */
		if (validarPosicaoEscrita(x, y))
			write( horaDrawer.getDrawer(ponto, horario, x, y, horarioCanvas.tamanhoHorario, lineHeight), x, y );
	}
	
	
	public void prepare(Graphics g, int cameraPosition)
	{
		this.g = g;
		this.posicaoLinha = cameraPosition;
	}
	
	
}
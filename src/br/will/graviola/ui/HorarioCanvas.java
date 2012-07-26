package br.will.graviola.ui;

import java.util.Vector;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;
import br.will.graviola.service.Drawable;

public class HorarioCanvas extends Canvas
{
	private Onibus onibus;
	
	private boolean upPressed = false;
	private boolean downPressed = false;

	
	/*
	 * Altura de cada linha
	 */
	private int lineHeight = 21;
	
	
	/*
	 * Variáveis para guardar a posição que a "câmera" está "filmando",
	 * lembrando que a posição da câmera é negativa. 
	 * Toda a tela é desenhada sempre, e só mudamos a posição. 
	 * O que está fora do enquadramento não é desenhado ;-).
	 */
	private int cameraPosition = 0;
	private int cameraScroll = lineHeight;
	private int linesWritten = 0;
	
	
	/*
	 * referência para não precisar passar este troço toda vez para o
	 * write()
	 */
	private Graphics g;
	
	
	/*
	 * Dimensões da tela, obtido do graphics 
	 */
	private int width;
	private int height;
	
	
	/*
	 * meu nokia c3 tem 310 de width e cabem 4 horários com uma folga 
	 * para mais "meio" horário. Cada horário deve ter uns ~70. 
	 */
	int tamanhoHorario = 56;
	
	
	public HorarioCanvas(Onibus onibus) {
		this.onibus = onibus;
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
		return y >= 0 - lineHeight && y < height;
	}
	
	
	/**
	 * Escreve um texto no canvas se ele estiver dentro do enquadramento.
	 * 
	 * @param text texto a ser escrito
	 * @param x posição X do texto
	 * @param y posição Y do texto
	 * @return TRUE se o objeto foi desenhado
	 */
	private void write(String text, int x, int y, Font fonte) 
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
	private void write(Drawable d, int x, int y) 
	{
		if ( validarPosicaoEscrita(x, y) )
			d.draw( g );
	}
	
	
	/**
	 * Escreve um horário no canvas.
	 * 
	 * @param horaText
	 * @param x
	 * @param y
	 * @param horaDrawer
	 */
	private void writeHorario(Ponto ponto, String horario, int x, int y, HoraDrawer horaDrawer) 
	{
		if ( validarPosicaoEscrita(x, y) )
			write( horaDrawer.getDrawer(ponto, horario, x, y, tamanhoHorario, lineHeight), x, y );
	}
	
	
	/**
	 * Desenha um quadrado branco do tamanho da tela e coloca a
	 * cor de fonte para preto;
	 */
	private void limparTela() 
	{
		g.setColor( Cor.branco() );
		g.fillRect( 0, 0, width, height );
		g.setColor( Cor.preto() );
	}
	
	
	/*
	 * variáveis para medir performance
	 */
//	int contaT = 0;
//	long somaT = 0;
//	int quantT = 20;
	
	/**
	 * Desenha a tela com os horários
	 */
	protected void paint(Graphics g) 
	{
//		long t0 = System.currentTimeMillis();
		
		
		
		this.g = g;
		
		width = g.getClipWidth();
		height = g.getClipHeight();
		int quantosHorariosCabemNaLinha = width / tamanhoHorario;
		
		
		/*
		 * Não posso scrollar pra cima se a posição da camera for menor 
		 * que zero.
		 * Não posso scrollar pra baixo se a posição da camera mais a 
		 * altura da tela é maior ou igual ao módulo da quantidade de linhas
		 * (posições) escritas.
		 */
		if (downPressed && cameraPosition - height >= linesWritten * -1) {
			cameraPosition -= cameraScroll;
		}
		
		if (upPressed && cameraPosition < 0) { 
			cameraPosition += cameraScroll;
			if (cameraPosition > 0) cameraPosition = 0;
		}
		
		int posicaoLinha = cameraPosition;
		
		limparTela();
		
		write( onibus.getNome() + " (" + onibus.getCodigo() + ")", 0, posicaoLinha, Fonte.bold() );
		
		posicaoLinha += lineHeight;
		
		Vector pontos = onibus.getPontos();
		
		for (int i = 0; i < pontos.size(); i++ ) 
		{
			Ponto ponto = (Ponto) pontos.elementAt(i);
			write(" "+ponto.getNome()+" ("+ponto.getTipoDia().getDescricao()+")", 0, posicaoLinha, Fonte.italic());
			
			Vector horarios = ponto.getHorarios();
			int posicaoColuna = 0;
			
			
			/*
			 * para cada ponto vamos contar quantas horas foram marcadas;
			 */
			HoraDrawer horaDrawer = new HoraDrawer();
			
			for (int k = 0; k < horarios.size(); k++) 
			{
				/*
				 * Se passou da quantidade de horarios que cabem na linha, "quebramos"
				 * a linha zerando o X e incrementando o Y.
				 */
				if (k % quantosHorariosCabemNaLinha == 0) {
					posicaoLinha += lineHeight;
					posicaoColuna = 0;
				}
				
				writeHorario( ponto, (String) horarios.elementAt(k), posicaoColuna, posicaoLinha, horaDrawer );
				
				posicaoColuna += tamanhoHorario;
			}
			
			posicaoLinha += lineHeight;
		}
		
		/*
		 * a linePosition começa no negativo, por isso precisamos acrescentar 
		 * a posição da camera * -1
		 */
		linesWritten = posicaoLinha + (cameraPosition * -1);
		
		/*
		 * se não anular, ele não é garbage coletado
		 */
		this.g = null;
		
		
//		contaT++;
//		somaT += System.currentTimeMillis() - t0;
//		if (contaT % quantT == 0) {
//			System.out.println("média T para "+quantT+" execuções: " + (somaT / quantT));
//			somaT = 0;
//		}
		
		
		try { Thread.sleep( 60 ); } catch (InterruptedException ie) { throw new RuntimeException(); } 
		
		repaint();
		
	}
	
	
	protected void keyPressed(int keyCode) {
		int gameAction = getGameAction(keyCode);
		switch (gameAction) {
		case UP:
			upPressed = true;
			break;
		case DOWN:
			downPressed = true;
			break;
		}
//		repaint();
	}
	
	
	protected void keyReleased(int keyCode) {
		upPressed = false;
		downPressed = false;
//		repaint();
	}
	
}
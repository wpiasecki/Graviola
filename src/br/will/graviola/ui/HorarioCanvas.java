package br.will.graviola.ui;

import java.util.Vector;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;

public class HorarioCanvas extends Canvas
{
	private Onibus onibus;
	
	private boolean upPressed = false;
	private boolean downPressed = false;
	
	
	/*
	 * Variáveis para guardar a posição que a "câmera" está "filmando",
	 * lembrando que a posição da câmera é negativa. 
	 * Toda a tela é desenhada sempre, e só mudamos a posição. Talvez 
	 * fosse legal otimizar, deixando o que está fora do enquadramento 
	 * sem ser desenhado
	 */
	private int cameraPosition = 0;
	private int cameraScroll = 40;
	private int linesWritten = 0;
	
	
	/*
	 * referência para não precisar passar este troço toda vez para o
	 * write()
	 */
	private Graphics g;
	
	
	private int width;
	private int height;
	
	
	/*
	 * tamanho de cada linha
	 */
	private int lineWidth = 21;
	
	
	public HorarioCanvas(Onibus onibus) {
		this.onibus = onibus;
	}
	
	
	/**
	 * Escreve no canvas usando o atributo this.g (Graphics). Está 
	 * separado para concentrar a condicional para escrever ou não.
	 * 
	 * O "0 - lineWidth" vai permitir que seja escrito um "rabicho"
	 * de texto na parte superior. Acho que deixa a interface melhor,
	 * senão coisas ficam sumindo...
	 * 
	 * @param text texto a ser escrito
	 * @param x posição X do texto
	 * @param y posição Y do texto
	 */
	private void write(String text, int x, int y) {
		if ( y >= 0 - lineWidth && y < height )
			g.drawString(text, x, y, 0);
	}
	
	
	protected void paint(Graphics g) 
	{
			this.g = g;
			
			width = g.getClipWidth();
			height = g.getClipHeight();
			
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
			
			int linePos = cameraPosition;
			
			g.setColor(Cor.branco());
			g.fillRect(0, 0, width, height);
			g.setColor(Cor.preto());
			
			g.setFont(Fonte.bold());
			write(onibus.getNome() + " (" + onibus.getCodigo() + ")", 0, linePos);
			g.setFont(Fonte.normal());
			
			linePos += lineWidth;
			
			Vector pontos = onibus.getPontos();
			
			for (int i = 0; i < pontos.size(); i++ ) 
			{
				Ponto ponto = (Ponto) pontos.elementAt(i);
				g.setFont(Fonte.italic());
				write("- " + ponto.getNome() + " (" + ponto.getTipoDia().getDescricao() + ")", 0, linePos);
				g.setFont(Fonte.normal());
				
				Vector horarios = ponto.getHorarios();
				int colPos = 0;
				
				/*
				 * meu nokia c3 tem 310 de width e cabem 4 horários com
				 * uma folga para mais "meio" horário. Cada horário deve ter um 
				 * tamanho de ~70. 
				 */
				int tamanhoHorario = 56;
				int quantosHorariosCabemNaLinha = width / tamanhoHorario;
				
				for (int k = 0; k < horarios.size(); k++) 
				{
					/*
					 * Se passou da quantidade de horarios que cabem na linha, "quebramos"
					 * a linha zerando o X e incrementando o Y.
					 */
					if (k % quantosHorariosCabemNaLinha == 0) {
						linePos += lineWidth;
						colPos = 0;
					}
					
					write( (String) horarios.elementAt(k), colPos, linePos );
					colPos += tamanhoHorario;
				}
				
				linePos += lineWidth;
			}
			
			/*
			 * a linePosition começa no negativo, por isso precisamos acrescentar 
			 * a posição da camera * -1
			 */
			linesWritten = linePos + (cameraPosition * -1);
			
			/*
			 * se não anular, ele não é garbage coletado
			 */
			this.g = null;
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
		repaint();
	}
	
	
	protected void keyReleased(int keyCode) {
		upPressed = false;
		downPressed = false;
		repaint();
	}
	
}
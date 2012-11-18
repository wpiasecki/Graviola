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
	

	private CanvasWriter canvasWriter;
	
	/*
	 * meu nokia c3 tem 310 de width e cabem 4 horários com uma folga 
	 * para mais "meio" horário. Cada horário deve ter uns ~70. 
	 */
	int tamanhoHorario = 56;
	
	/*
	 * Dimensões da tela, obtido do graphics 
	 */
	int width;
	int height;
	
	/*
	 * Variáveis para guardar a posição que a "câmera" está "filmando",
	 * lembrando que a posição da câmera é negativa. 
	 * Toda a tela é desenhada sempre, e só mudamos a posição. 
	 * O que está fora do enquadramento não é desenhado ;-).
	 */
	int cameraPosition = 0;
	private int cameraScroll = 0;
	private int linesWritten = 0;
	
	private String pontoSelecionado;
	
	
	public HorarioCanvas(Onibus onibus, String pontoSelecionado) 
	{
		this.onibus = onibus;
		this.canvasWriter = new CanvasWriter(this);
		cameraScroll = canvasWriter.lineHeight;
		this.pontoSelecionado = pontoSelecionado;
	}
	
	
	public HorarioCanvas(Onibus onibus) {
		this(onibus, null);
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
		
		canvasWriter.prepare( g, cameraPosition );
		
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
		if (downPressed && cameraPosition - height >= linesWritten) {
			cameraPosition -= cameraScroll;
		}
		
		if (upPressed && cameraPosition < 0) { 
			cameraPosition += cameraScroll;
			if (cameraPosition > 0) cameraPosition = 0;
		}
		
		canvasWriter.limparTela();
		
		canvasWriter.write( onibus.getNome() + " (" + onibus.getCodigo() + ")", Fonte.bold() );
		
		Vector pontos = onibus.getPontos();
		
		for (int i = 0; i < pontos.size(); i++ ) 
		{
			Ponto ponto = (Ponto) pontos.elementAt(i);
			
			if (pontoSelecionado != null && 
					ponto.getNomeFormatado().equals(pontoSelecionado)) 
			{
				this.cameraPosition = canvasWriter.posicaoLinha * -1;
				pontoSelecionado = null;
			}
			
			canvasWriter.writeln();
			canvasWriter.writeln(" "+ponto.getNome()+" ("+ponto.getTipoDia().getDescricao()+")", Fonte.italic());
			canvasWriter.writeln(" A partir de: " + ponto.getValidoAPartirDe(), Fonte.italic());
			
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
				if (k > 0 && k % quantosHorariosCabemNaLinha == 0) {
					canvasWriter.writeln();
					posicaoColuna = 0;
				}
				
				canvasWriter.writeHorario( 
						ponto, (String) horarios.elementAt(k), posicaoColuna, canvasWriter.posicaoLinha, horaDrawer );
				
				posicaoColuna += tamanhoHorario;
				
			}
		}
		
		/*
		 * a posicao da linha começa no negativo, por isso precisamos acrescentar 
		 * a posição da camera * -1
		 * 
		 * TODO: Tem um lineHeight sendo subtraído porque em algum lugar tá sendo
		 * escrita uma linha a mais.
		 */
		linesWritten = (canvasWriter.posicaoLinha - cameraPosition - canvasWriter.lineHeight) * -1;
		
		
//		contaT++;
//		somaT += System.currentTimeMillis() - t0;
//		if (contaT % quantT == 0) {
//			System.out.println("média T para "+quantT+" execuções: " + (somaT / quantT));
//			somaT = 0;
//		}
		
		
		try { Thread.sleep( 60 ); } catch (InterruptedException ie) { throw new RuntimeException(); } 
		
		repaint();
		
	}
	
	
	protected void keyPressed(int keyCode) 
	{
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
	
	
	protected void keyReleased(int keyCode) 
	{
		upPressed = false;
		downPressed = false;
//		repaint();
	}
	
	
}
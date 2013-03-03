package br.will.graviola.ui;

import java.util.Vector;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

import br.will.graviola.Graviola;
import br.will.graviola.model.Onibus;
import br.will.graviola.model.Ponto;
import br.will.graviola.ui.effect.Touch;
import br.will.graviola.ui.tela.Comando;

public class HorarioCanvas extends Canvas
{
	private Onibus onibus;
	
	private boolean upPressed = false;
	private boolean downPressed = false;
	

	private CanvasWriter canvasWriter;
	
	
	/*
	 * meu nokia c3 tem 310 de width e cabem 4 horários com uma folga 
	 * para mais "meio" horário. Cada horário deve ter uns ~70.
	 * 
	 * Substituído pelo valor do Graphics.font. 
	 */
//	int tamanhoHorario = 56;
	int tamanhoHorario = -1;
	
	
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
	
	private int pontoSelecionado;
	
	private int distanciaEntreTelaERolagem = 6;
	
	/*
	 * Objeto para controle do touch screen
	 */
	private Touch touch;
	
	
	
	public HorarioCanvas(Onibus onibus, int pontoSelecionado) 
	{
		this.onibus = onibus;
		this.canvasWriter = new CanvasWriter(this);
		this.pontoSelecionado = pontoSelecionado;
		touch = new Touch();
	}
	
	
	public HorarioCanvas(Onibus onibus) {
		this(onibus, -1);
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
		
		cameraScroll = canvasWriter.lineHeight;
		
		
		if (tamanhoHorario == -1) 
			tamanhoHorario = g.getFont().charWidth('m') * 3;
		
		
		width = g.getClipWidth();
		height = g.getClipHeight();
		int quantosHorariosCabemNaLinha = (width - distanciaEntreTelaERolagem) / tamanhoHorario ;
		
		int posicaoPontoSelecionado = -1;
		
		/*
		 * Não devemos scrollar pra cima se a posição da camera for menor 
		 * que zero.
		 * Não devemos scrollar pra baixo se a posição da camera mais a 
		 * altura da tela é maior ou igual ao módulo da quantidade de linhas
		 * (posições) escritas.
		 */
		if (downPressed && cameraPosition - height > (linesWritten - cameraScroll)) {
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
			
			if (pontoSelecionado != -1 && i == pontoSelecionado) 
			{
				posicaoPontoSelecionado = canvasWriter.posicaoLinha;
				pontoSelecionado = -1;
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
		 * FIXME: Tem um lineHeight sendo subtraído porque em algum lugar tá sendo
		 * escrita uma linha a mais.
		 */
		if (linesWritten == 0)
		{
			//linesWritten = (canvasWriter.posicaoLinha - cameraPosition - canvasWriter.lineHeight) * -1;
			linesWritten = canvasWriter.posicaoLinha * -1;
		}
		
		if (posicaoPontoSelecionado != -1)
			cameraPosition = posicionarCanvas(canvasWriter, height, posicaoPontoSelecionado);
		
		desenharBarraDeRolagem(g);
		
		touch.desenhar(g);
		
//		contaT++;
//		somaT += System.currentTimeMillis() - t0;
//		if (contaT % quantT == 0) {
//			System.out.println("média T para "+quantT+" execuções: " + (somaT / quantT));
//			somaT = 0;
//		}
		
		
		try { Thread.sleep( 50 ); } catch (InterruptedException ie) { throw new RuntimeException(); } 
		
		repaint();
		
	}
	
	
	/**
	 * Desenha a barra de rolagem
	 * 
	 * @param g objeto Graphics
	 */
//	int index = 1;
	private void desenharBarraDeRolagem(Graphics g)
	{
		int alturaDoCanvas = linesWritten * -1;
		int alturaDaTela = g.getClipHeight();
		
		//if (alturaDaTela >= alturaDoCanvas) return;
		
		int larguraDaTela = g.getClipWidth();
		
		int tamanhoBarraDeRolagem = (int) Math.max( (alturaDaTela * alturaDaTela / alturaDoCanvas), 8 );
		int camera = cameraPosition * -1;
		int alturaNominal = alturaDaTela - tamanhoBarraDeRolagem;
		
		/*
		 * Cálculo do ponto inicial da barra de rolagem:
		 * - A altura da camera define a posição Y da barra de rolagem 
		 * proporcional à tela;
		 * - O ponto inicial da barra de rolagem deve ser calculado em relação 
		 * à tela MENOS o tamanho da própria barra;
		 * - A proporção da posição da câmera em relação ao canvas deve ser 
		 * considerada com o canvas descontando a altura de uma tela, assim,
		 * tendo um canvas com altura 1200, uma tela de 200 e uma barra de
		 * rolagem de altura 20, a posição final da câmera será no máximo 1000, 
		 * e esta posição já deve ser contada como 100% da tela scrollada.
		 * Portanto, estando em 1000, o cálculo de proporção deve utilizar
		 * um canvas de altura 1020 e uma tela de altura 180;
		 * 
		 * Ex.: para um canvas de altura 1386, uma tela de 291, uma barra de
		 * rolagem de 61, e a câmera na posição 1113, a equação será a seguinte:
		 * 1113 × (291 − 61) ÷ (1386 − 291 + 21) == 229
		 * 
		 * Há um erro de um pixel em boa parte das telas. Isso deve vir do
		 * arredondamento. Dada a natureza de pontos flutuantes no J2ME, melhor
		 * deixar assim.
		 * 
		 * Não sei porque tem que adicionar uma linha na altura da tela. Acho 
		 * que a altura do canvas já está somada sem necessidade em algum outro 
		 * lugar.
		 */
		int posicaoYBarraDeRolagem = 
				(camera * alturaNominal) / (alturaDoCanvas - alturaDaTela + canvasWriter.lineHeight);
		
		int posicaoXBarraDeRolagem = larguraDaTela - distanciaEntreTelaERolagem;
		
		int corAntiga = g.getColor();
		
		g.setColor(Cor.preto());
		
		g.fillRoundRect(
				posicaoXBarraDeRolagem, 
				posicaoYBarraDeRolagem, 
				4, // largura
				tamanhoBarraDeRolagem, 
				4, 4); // raio das bordas
		
		g.setColor(corAntiga);
		
//		if (++index % 30 == 0)
//		System.out.println("camera="+camera+
//				"; posicaoY="+posicaoYBarraDeRolagem+
//				"; alturaCanvas="+alturaDoCanvas+
//				"; alturaTela="+alturaDaTela+
//				"; tamanhoBarra="+tamanhoBarraDeRolagem
//				);
	}
	
	
	/**
	 * Posiciona o canvas em um determinado ponto
	 */
	private int posicionarCanvas(CanvasWriter writer, int alturaTela, int posicaoPontoSelecionado)
	{
		int posicao = (posicaoPontoSelecionado * -1) - writer.lineHeight;
		
		if (posicao - alturaTela < linesWritten) {
			posicao -= posicao - alturaTela - linesWritten + writer.lineHeight;
		}
		
		return posicao;
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
	}
	
	
	protected void keyReleased(int keyCode) 
	{
		upPressed = false;
		downPressed = false;
	}
	
	
	protected void pointerPressed(int x, int y) 
	{
		switch (touch.press(width, height, x, y)) {
		case Touch.SUBIR: upPressed = true; break;
		case Touch.DESCER: downPressed = true; break;
		
		/*
		 * Usado para simular um comando do usuário.
		 * TODO: Ficou uma droga; furou toda a abstração :-(
		 */
		case Touch.PONTOS: Graviola.instance().commandAction(Comando.pontos, null); break;
		}
	}
	
	
	protected void pointerReleased(int x, int y) 
	{
		upPressed = false;
		downPressed = false;
	}
	
}
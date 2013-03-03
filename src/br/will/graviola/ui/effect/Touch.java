package br.will.graviola.ui.effect;

import javax.microedition.lcdui.Graphics;

import br.will.graviola.ui.Cor;

/**
 * Cria um efeito de FadeOut, quando se clica na tela
 * 
 * @author will
 * 
 */
public class Touch
{

	/*
	 * Flag para verificar se o botão foi pressionado
	 */
	private boolean pressed = false;

	/*
	 * Contador. A tela será reescrita ITERATIONS numero de vezes, cada vez com
	 * menor intensidade.
	 */
	private int counter;
	private final int ITERATIONS = 20;

	private int funcaoAtivada;
	
	private DesenhosTouch desenhos;
	
	public int press(int width, int height, int x, int y)
	{
		pressed = true;
		counter = ITERATIONS;
		
		funcaoAtivada = funcaoPorPosicao(width, height, x, y);
		return funcaoAtivada;
	}

	
	/**
	 * Desenha alguns detalhes de onde se pode pressionar com o touch
	 * para acessar funções
	 * 
	 * @param g
	 */
	public void desenhar(Graphics g)
	{
		if (pressed)
		{
			int corAntiga = g.getColor();
			
			int width = g.getClipWidth();
			int height = g.getClipHeight();
			
			if (desenhos == null) desenhos = DesenhosTouch.desenhos(width, height);
			
			desenhos.baixo.desenhar(g, getCor(funcaoAtivada == DESCER));
			desenhos.cima.desenhar(g, getCor(funcaoAtivada == SUBIR));
			
			
			int parteDosPontos = width/4;
			g.setColor(Cor.branco());
			g.fillRoundRect(
					desenhos.ponto.x - 2, 
					desenhos.ponto.y - 8, 
					g.getFont().charWidth('m') * desenhos.ponto.texto.length(), 
					g.getFont().getHeight()+16, 4, 4);
			
			g.setColor(Cor.preto());
			g.drawRoundRect(
					desenhos.ponto.x - 2, 
					desenhos.ponto.y - 8, 
					g.getFont().charWidth('m') * desenhos.ponto.texto.length(), 
					g.getFont().getHeight()+16, 4, 4);
			
			
			g.drawString(desenhos.ponto.texto, desenhos.ponto.x, desenhos.ponto.y, Graphics.TOP | Graphics.LEFT);
			
			g.drawLine(parteDosPontos, height/2, width, height/2);
			g.drawLine(parteDosPontos, 0, parteDosPontos, height);

			if (counter-- == 0)
				pressed = false;
			
			g.setColor(corAntiga);
		}
	}
	
	
	private int getCor(boolean destaque) { 
		int cor = (destaque ? Cor.vermelho() : Cor.preto()) | counter;
		return cor;
	}
	

	/*
	 * De acordo com a posicao, podem ser efetuadas as seguintes operações:
	 * (seria bem mais legal criar classe/objeto com a função, mas aqui é
	 * Java ME, melhor pegar leve com a memoria )
	 */
	public static final int PONTOS = 1;
	public static final int SUBIR = 2;
	public static final int DESCER = 3;
	
	
	/**
	 * Retorna uma função de acordo com o local da tela pressionado.
	 * 
	 * @param g
	 * @param x
	 * @param y
	 * @return ou PONTOS, ou SUBIR ou DESCER.
	 */
	int funcaoPorPosicao(int width, int height, int x, int y)
	{
		boolean clicouNaParteDosPontos = x <= width / 4;

		if (clicouNaParteDosPontos) {
			return PONTOS;
		} 
		else
		{
			boolean clicouNaMetadeDeCima = y <= height / 2;

			return clicouNaMetadeDeCima ? SUBIR : DESCER;
		}
	}

}
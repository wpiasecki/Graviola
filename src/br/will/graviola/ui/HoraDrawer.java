package br.will.graviola.ui;

import javax.microedition.lcdui.Graphics;

import br.will.graviola.service.Drawable;
import br.will.graviola.service.HoraService;

/**
 * Esta classe concentra duas coisas: 
 * - a quantidade de horas que já foram marcadas (funcionando como um bean)
 * - a lógica para desenhar o horário na tela
 * 
 * 
 * @author will
 * 
 */
public class HoraDrawer
{
	/*
	 * quantidade de horas que devem ser destacadas
	 */
	public static final int MAXIMO_HORAS_MARCAVEIS = 4;
	
	
	private int horasDestacadas = 0;
	
	
	public boolean isProximoHorario(String horario)
	{
		if (horasDestacadas >= MAXIMO_HORAS_MARCAVEIS) 
		{
			return false;
		}
		
		if ( HoraService.isProximoHorario( horario ) ) 
		{
			horasDestacadas++;
			return true;
		}
		return false;
	}
	
	
	/**
	 * Lógica de view para dizer a cor do contorno do horário destacado.
	 * 
	 * @return código hexadecimal da cor
	 */
	public int getCor() 
	{
		switch (horasDestacadas)
		{
		case 1: return Cor.blueColumbia();
		case 2: return Cor.blueColumbia2();
		case 3: return Cor.blueColumbia3();
		case 4: return Cor.blueColumbia4();
		case 5: return Cor.blueColumbia5();
		default: return Cor.branco();
		}
	}
	
	
	/**
	 * Retorna um objeto que sabe como desenhar uma hora (destacada ou não) 
	 * no canvas.
	 * 
	 * @param horaText String com o horário
	 * @param x posição X inicial
	 * @param y posição Y inicial 
	 * @param tamanhoHorario tamanho do horário que é desenhado na tela
	 * @param lineHeight altura de cada linha
	 * @return objeto Drawable
	 */
	public Drawable getDrawer(
			final String horario, 
			final int x, 
			final int y, 
			final int tamanhoHorario, 
			final int lineHeight) 
	{
		final boolean isProximoHorario = isProximoHorario(horario);
		
		return new Drawable() 
		{
			public void draw(Graphics g) 
			{
				if ( isProximoHorario ) 
				{
					int oldColor = g.getColor();
					g.setColor( HoraDrawer.this.getCor() );
					g.drawRoundRect( x - 4, y, tamanhoHorario - 8, lineHeight - 2, 8, 8 );
					g.setColor( oldColor );
				}
				
				g.drawString( horario, x, y, 0 );
			}
		};
	}
	
}

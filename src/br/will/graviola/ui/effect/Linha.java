package br.will.graviola.ui.effect;

import javax.microedition.lcdui.Graphics;

class Linha
{
	int x1, x2, y1, y2;
	
	void desenhar(Graphics g, int cor) {
		g.setColor(cor);
		g.drawLine(x1, y1, x2, y2);
	}
	
	void deslocarHorizontal(int x) {
		x1 += x;
		x2 += x;
	}
}

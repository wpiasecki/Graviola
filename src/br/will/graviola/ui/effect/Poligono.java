package br.will.graviola.ui.effect;

import java.util.Vector;

import javax.microedition.lcdui.Graphics;

class Poligono 
{ 
	Vector linhas = new Vector();
	
	
	void desenhar(Graphics g, int cor) 
	{
		for (int i = 0; i < linhas.size(); i++)
			((Linha) linhas.elementAt(i)).desenhar(g, cor);
	}
	
	
	void deslocarHorizontal(int x) 
	{
		for (int i = 0; i < linhas.size(); i++)
			((Linha) linhas.elementAt(i)).deslocarHorizontal(x);
	}
}
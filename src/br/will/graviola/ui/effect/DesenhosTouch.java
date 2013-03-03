package br.will.graviola.ui.effect;

class DesenhosTouch
{
	Poligono cima, baixo;
	TextoPonto ponto;

	static DesenhosTouch desenhos(int width, int height)
	{
		int parteDosPontos = width / 4;
		int larguraUsavel = width - parteDosPontos;
		int alturaUsavel = height / 2;
		int tercoDeAltura = alturaUsavel / 3;

		Linha lc1 = new Linha(); // base
		lc1.x1 = larguraUsavel / 3;
		lc1.y1 = tercoDeAltura * 2;
		lc1.x2 = lc1.x1 + lc1.x1;
		lc1.y2 = lc1.y1;

		Linha lc2 = new Linha(); // lado esquerdo
		lc2.x1 = lc1.x1;
		lc2.y1 = lc1.y1;
		lc2.x2 = larguraUsavel / 2;
		lc2.y2 = tercoDeAltura;

		Linha lc3 = new Linha(); // lado direito
		lc3.x1 = lc1.x2;
		lc3.y1 = lc1.y2;
		lc3.x2 = lc2.x2;
		lc3.y2 = lc2.y2;

		Poligono cima = new Poligono();
		cima.linhas.addElement(lc1);
		cima.linhas.addElement(lc2);
		cima.linhas.addElement(lc3);
		cima.deslocarHorizontal(parteDosPontos);
		
		
		
		Poligono baixo = new Poligono();
		Linha lb1 = new Linha(); // base
		lb1.x1 = larguraUsavel / 3;
		lb1.y1 = tercoDeAltura + alturaUsavel;
		lb1.x2 = lb1.x1 * 2;
		lb1.y2 = lb1.y1;
		
		Linha lb2 = new Linha(); // lado esquerdo
		lb2.x1 = lb1.x1;
		lb2.y1 = lb1.y1;
		lb2.x2 = larguraUsavel / 2;
		lb2.y2 = tercoDeAltura * 2 + alturaUsavel;
		
		Linha lb3 = new Linha(); // lado direito
		lb3.x1 = lb1.x2;
		lb3.y1 = lb1.y2;
		lb3.x2 = lb2.x2;
		lb3.y2 = lb2.y2;
		
		
		baixo.linhas.addElement(lb1);
		baixo.linhas.addElement(lb2);
		baixo.linhas.addElement(lb3);
		baixo.deslocarHorizontal(parteDosPontos);

		TextoPonto ponto = new TextoPonto();
		ponto.texto = "Pontos";
		ponto.x = 2;
		ponto.y = height / 2;

		DesenhosTouch desenhos = new DesenhosTouch();
		desenhos.cima = cima;
		desenhos.baixo = baixo;
		desenhos.ponto = ponto;

		return desenhos;
	}

}
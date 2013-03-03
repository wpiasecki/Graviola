package br.will.graviola.ui.tela;

import java.io.IOException;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

import br.will.graviola.model.DisplayableAlert;
import br.will.graviola.util.StreamUtil;

public class MapaForm extends Tela
{
	public MapaForm(Tela parent) { 	super(parent); 	}

	public Tela dispatch(Command command)
	{
		if (command == Comando.voltar)
		{
			return getParent();
		}
		
		throw new IllegalArgumentException(
				"Tela MapaForm não sabe como lidar com o comando " + command + " ("+command.getLabel()+")");
	}

	public DisplayableAlert getDisplayableAlert()
	{
		try 
		{
			Canvas mapaCanvas = new MapaCanvas("/mapa_rit.png");
			mapaCanvas.addCommand(Comando.voltar);
			mapaCanvas.addCommand(Comando.zoomIn);
			mapaCanvas.addCommand(Comando.zoomOut);
			return new DisplayableAlert(mapaCanvas);
		}
		catch (Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public boolean mustWait()
	{
		return true;
	}
	
}


class MapaCanvas extends Canvas 
{
	private boolean upPressed;
	private boolean downPressed;
	private boolean leftPressed;
	private boolean rightPressed;
	private int posicaoX;
	private int posicaoY;
	private String fileName;
	private int scrollSize = 20;
	
	MapaCanvas(String file) throws IOException 
	{ 
		this.fileName = file;
	}
	
	private int minus(int size) {
		if (size >= 20) size -= 20;
		else if (size < 20 && size > 0) size = 0;
		return size;
	}
	
	private int plus(int size, int tamanho) {
		if ( size+scrollSize <= tamanho) size += 20;
		else if (size+scrollSize >= tamanho) size = tamanho;
		return size;
	}
	
	protected void paint(Graphics g)
	{
		Image mapa;
		try { mapa = Image.createImage(
				StreamUtil.image(fileName),
				posicaoX, 
				posicaoY, 
				g.getClipWidth(), 
				g.getClipHeight(), 
				Sprite.TRANS_NONE); }
		catch (IOException io) { throw new RuntimeException(io.getMessage()); }
		
		
		int altura = mapa.getHeight();
		int largura = mapa.getWidth();
		
		if (upPressed) posicaoY = minus(posicaoY);
		if (downPressed) posicaoY = plus(posicaoY, altura);
		if (leftPressed) posicaoX = plus(posicaoX, largura);
		if (rightPressed) posicaoX = minus(posicaoX);
		
//		g.drawRegion(mapa, // image src
//        posicaoX, // int x_src, //
//        posicaoY, // int y_src,
//        g.getClipWidth(), // int width,
//        g.getClipHeight(), // int height,
//        Sprite.TRANS_NONE, // int transform,
//        0, // int x_dest,
//        0, // int y_dest,
//        Graphics.TOP | Graphics.LEFT); // int anchor)
		
		g.drawImage(mapa, posicaoX, posicaoY, Graphics.TOP | Graphics.LEFT);
		
		try { Thread.sleep(50); } catch(Exception e) {}
		
		repaint();
	}
	
	protected void keyPressed(int keyCode) 
	{
		int gameAction = getGameAction(keyCode);
		switch (gameAction) {
		case UP: upPressed = true; break;
		case DOWN: downPressed = true; break;
		case LEFT: leftPressed = true; break;
		case RIGHT: rightPressed = true; break;
		}
	}
	
	
	protected void keyReleased(int keyCode) 
	{
		upPressed = false;
		downPressed = false;
	}
	
}
package br.will.graviola.ui;

import javax.microedition.lcdui.Font;

public class Fonte
{
	private static int SIZE = Font.SIZE_SMALL;
	
	private static Font BOLD = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM);
	private static Font ITALIC = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_ITALIC, SIZE);
	private static Font NORMAL = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, SIZE);
	
	public static Font bold()
	{
		return BOLD;
	}

	public static Font italic()
	{
		return ITALIC;
	}

	public static Font normal()
	{
		return NORMAL;
	}
}

package br.will.graviola.ui;

import javax.microedition.lcdui.Font;

public class Fonte
{
	private static Font BOLD = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM);
	private static Font ITALIC = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_ITALIC, Font.SIZE_SMALL);
	private static Font NORMAL = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL);
	
	public static Font bold() {
		return BOLD;
	}
	
	public static Font italic() {
		return ITALIC;
	}

	public static Font normal() {
		return NORMAL;
	}
}

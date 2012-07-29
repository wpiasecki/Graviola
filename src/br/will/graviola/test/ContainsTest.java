package br.will.graviola.test;

import java.util.Vector;

public class ContainsTest
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		
		v.addElement("10");
		v.addElement("11");
		v.addElement("12");
		
		System.out.println(v.contains("13"));
		System.out.println(v.contains("12"));
	}
}

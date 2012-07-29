package br.will.graviola.test;

import java.util.Enumeration;
import java.util.Vector;

import br.will.graviola.util.CollectionUtil;

public class UltimosTest
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.addElement("A");
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("C");
		v.addElement("D");
		
		
		for (Enumeration en = CollectionUtil.obterUltimos(v).elements(); en.hasMoreElements();) {
			System.out.println(en.nextElement());
		}
	}
}

package br.will.graviola.test;

import java.util.Vector;

import br.will.graviola.model.*;
import br.will.graviola.service.HorarioOnibusService;
import br.will.graviola.service.OnibusService;

public class LazyHorarioTest
{
	public static void main(String[] args)
	{
		
		Onibus o = OnibusService.instance().getOnibus("ABAETÉ");
		Vector ps = o.getPontos();
		
		for ( int i = 0; i < ps.size(); i++) {
			Ponto p = (Ponto) ps.elementAt(i);
			System.out.println(p.getHorarios());
		}
	}
}

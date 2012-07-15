
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus201 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CABRAL / BOM RETIRO");
		onibus.setCodigo("201");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("N.PECANHA,690/HENRIQUE ITIBERE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:02");
		ponto0.getHorarios().addElement("17:14");
		ponto0.getHorarios().addElement("17:25");
		ponto0.getHorarios().addElement("17:39");
		ponto0.getHorarios().addElement("17:52");
		ponto0.getHorarios().addElement("18:06");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:33");
		ponto0.getHorarios().addElement("18:46");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("19:11");
		return onibus;
		}
	}
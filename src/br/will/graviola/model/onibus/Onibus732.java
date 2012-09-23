
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus732 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("732 - CAIUA / C.COMPRIDO");
		onibus.setCodigo("732");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAIUA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:43");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:09");
		ponto0.getHorarios().addElement("17:37");
		ponto0.getHorarios().addElement("18:19");
		ponto0.getHorarios().addElement("19:03");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO COMPRIDO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:02");
		ponto1.getHorarios().addElement("07:49");
		ponto1.getHorarios().addElement("17:13");
		ponto1.getHorarios().addElement("17:55");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("19:20");
		return onibus;
		}
	}
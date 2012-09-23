
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus720 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("720 - FAZENDINHA / C. COMPRIDO");
		onibus.setCodigo("720");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAMPO COMPRIDO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:43");
		ponto0.getHorarios().addElement("06:54");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:26");
		ponto0.getHorarios().addElement("07:38");
		ponto0.getHorarios().addElement("07:51");
		ponto0.getHorarios().addElement("17:41");
		ponto0.getHorarios().addElement("17:55");
		ponto0.getHorarios().addElement("18:22");
		ponto0.getHorarios().addElement("18:37");
		ponto0.getHorarios().addElement("18:49");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CIC");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("18:02");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL FAZENDINHA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:20");
		ponto2.getHorarios().addElement("06:33");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:04");
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("07:29");
		ponto2.getHorarios().addElement("07:47");
		ponto2.getHorarios().addElement("07:59");
		ponto2.getHorarios().addElement("08:13");
		ponto2.getHorarios().addElement("17:40");
		ponto2.getHorarios().addElement("18:01");
		ponto2.getHorarios().addElement("18:15");
		ponto2.getHorarios().addElement("18:28");
		ponto2.getHorarios().addElement("18:42");
		ponto2.getHorarios().addElement("19:00");
		return onibus;
		}
	}
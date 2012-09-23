
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus594 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("594 - MENONITAS");
		onibus.setCodigo("594");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO NOVO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("25/04/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("10:10");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("13:50");
		ponto0.getHorarios().addElement("15:40");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("21:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SITES");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("25/04/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("11:05");
		ponto1.getHorarios().addElement("12:55");
		ponto1.getHorarios().addElement("14:45");
		ponto1.getHorarios().addElement("16:35");
		ponto1.getHorarios().addElement("18:25");
		ponto1.getHorarios().addElement("20:15");
		ponto1.getHorarios().addElement("22:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO NOVO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("17/01/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("13:50");
		ponto2.getHorarios().addElement("15:40");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("19:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITES");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("17/01/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("09:15");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("12:55");
		ponto3.getHorarios().addElement("14:45");
		ponto3.getHorarios().addElement("16:35");
		ponto3.getHorarios().addElement("18:25");
		ponto3.getHorarios().addElement("20:15");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO NOVO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("18/01/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("08:20");
		ponto4.getHorarios().addElement("10:10");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("13:50");
		ponto4.getHorarios().addElement("15:40");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("19:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL SITES");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("18/01/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:25");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("11:05");
		ponto5.getHorarios().addElement("12:55");
		ponto5.getHorarios().addElement("14:45");
		ponto5.getHorarios().addElement("16:35");
		ponto5.getHorarios().addElement("18:25");
		ponto5.getHorarios().addElement("20:15");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusD11 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("D11 - PLANTA DEODORO");
		onibus.setCodigo("D11");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ILHA DO SAPO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/04/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("17:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PLANTA DEODORO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/04/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("04:45");
		ponto1.getHorarios().addElement("05:09");
		ponto1.getHorarios().addElement("05:38");
		ponto1.getHorarios().addElement("05:53");
		ponto1.getHorarios().addElement("06:05");
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("07:02");
		ponto1.getHorarios().addElement("07:47");
		ponto1.getHorarios().addElement("08:15");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("09:45");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("11:20");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("12:35");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:05");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("16:25");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:51");
		ponto1.getHorarios().addElement("18:05");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:35");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("19:05");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:35");
		ponto1.getHorarios().addElement("19:50");
		ponto1.getHorarios().addElement("20:20");
		ponto1.getHorarios().addElement("20:45");
		ponto1.getHorarios().addElement("21:10");
		ponto1.getHorarios().addElement("21:35");
		ponto1.getHorarios().addElement("22:05");
		ponto1.getHorarios().addElement("22:30");
		ponto1.getHorarios().addElement("22:55");
		ponto1.getHorarios().addElement("23:20");
		ponto1.getHorarios().addElement("23:50");
		ponto1.getHorarios().addElement("00:15");
		ponto1.getHorarios().addElement("00:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRESIDIO PIRAQUARA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("09/04/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("14:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PIRAQUARA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("09/04/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("04:57");
		ponto3.getHorarios().addElement("05:21");
		ponto3.getHorarios().addElement("05:38");
		ponto3.getHorarios().addElement("05:53");
		ponto3.getHorarios().addElement("06:05");
		ponto3.getHorarios().addElement("06:20");
		ponto3.getHorarios().addElement("06:35");
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("08:00");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("09:30");
		ponto3.getHorarios().addElement("09:57");
		ponto3.getHorarios().addElement("10:35");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("11:45");
		ponto3.getHorarios().addElement("12:20");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("13:35");
		ponto3.getHorarios().addElement("14:05");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("15:30");
		ponto3.getHorarios().addElement("16:10");
		ponto3.getHorarios().addElement("16:50");
		ponto3.getHorarios().addElement("17:25");
		ponto3.getHorarios().addElement("17:51");
		ponto3.getHorarios().addElement("18:05");
		ponto3.getHorarios().addElement("18:20");
		ponto3.getHorarios().addElement("18:35");
		ponto3.getHorarios().addElement("18:50");
		ponto3.getHorarios().addElement("19:05");
		ponto3.getHorarios().addElement("19:20");
		ponto3.getHorarios().addElement("19:35");
		ponto3.getHorarios().addElement("20:05");
		ponto3.getHorarios().addElement("20:35");
		ponto3.getHorarios().addElement("21:00");
		ponto3.getHorarios().addElement("21:25");
		ponto3.getHorarios().addElement("21:50");
		ponto3.getHorarios().addElement("22:20");
		ponto3.getHorarios().addElement("22:45");
		ponto3.getHorarios().addElement("23:10");
		ponto3.getHorarios().addElement("23:35");
		ponto3.getHorarios().addElement("00:05");
		ponto3.getHorarios().addElement("00:25");
		ponto3.getHorarios().addElement("01:05");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PLANTA DEODORO");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:15");
		ponto4.getHorarios().addElement("05:45");
		ponto4.getHorarios().addElement("06:20");
		ponto4.getHorarios().addElement("06:50");
		ponto4.getHorarios().addElement("07:16");
		ponto4.getHorarios().addElement("07:45");
		ponto4.getHorarios().addElement("08:15");
		ponto4.getHorarios().addElement("08:45");
		ponto4.getHorarios().addElement("09:15");
		ponto4.getHorarios().addElement("09:45");
		ponto4.getHorarios().addElement("10:30");
		ponto4.getHorarios().addElement("11:15");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("12:45");
		ponto4.getHorarios().addElement("13:30");
		ponto4.getHorarios().addElement("14:15");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("15:45");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("17:15");
		ponto4.getHorarios().addElement("18:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL PIRAQUARA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:30");
		ponto5.getHorarios().addElement("06:00");
		ponto5.getHorarios().addElement("06:35");
		ponto5.getHorarios().addElement("07:05");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:15");
		ponto5.getHorarios().addElement("11:00");
		ponto5.getHorarios().addElement("11:45");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("13:15");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("14:45");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:15");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("17:45");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusA07 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("A07 - CTBA / TAMANDARÉ (LAMENHA)");
		onibus.setCodigo("A07");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ITAPERUCU");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("MUELLER");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:40");
		ponto1.getHorarios().addElement("06:10");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:57");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:35");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("11:05");
		ponto1.getHorarios().addElement("11:50");
		ponto1.getHorarios().addElement("12:35");
		ponto1.getHorarios().addElement("13:20");
		ponto1.getHorarios().addElement("14:05");
		ponto1.getHorarios().addElement("14:50");
		ponto1.getHorarios().addElement("15:10");
		ponto1.getHorarios().addElement("15:38");
		ponto1.getHorarios().addElement("16:20");
		ponto1.getHorarios().addElement("16:42");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:27");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:12");
		ponto1.getHorarios().addElement("18:35");
		ponto1.getHorarios().addElement("18:57");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:42");
		ponto1.getHorarios().addElement("20:05");
		ponto1.getHorarios().addElement("20:50");
		ponto1.getHorarios().addElement("21:35");
		ponto1.getHorarios().addElement("22:40");
		ponto1.getHorarios().addElement("23:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL TAMANDARE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:22");
		ponto2.getHorarios().addElement("05:50");
		ponto2.getHorarios().addElement("06:12");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("06:50");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("07:42");
		ponto2.getHorarios().addElement("08:05");
		ponto2.getHorarios().addElement("08:27");
		ponto2.getHorarios().addElement("08:50");
		ponto2.getHorarios().addElement("09:35");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("11:05");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("12:35");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("14:05");
		ponto2.getHorarios().addElement("14:55");
		ponto2.getHorarios().addElement("15:35");
		ponto2.getHorarios().addElement("15:55");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("17:05");
		ponto2.getHorarios().addElement("17:27");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:12");
		ponto2.getHorarios().addElement("18:35");
		ponto2.getHorarios().addElement("18:57");
		ponto2.getHorarios().addElement("19:20");
		ponto2.getHorarios().addElement("20:05");
		ponto2.getHorarios().addElement("20:50");
		ponto2.getHorarios().addElement("21:35");
		ponto2.getHorarios().addElement("22:35");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("RODOVIA-SAO JOAO BATISTA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:40");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("MUELLER");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("11/02/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:05");
		ponto4.getHorarios().addElement("06:50");
		ponto4.getHorarios().addElement("07:35");
		ponto4.getHorarios().addElement("08:20");
		ponto4.getHorarios().addElement("09:05");
		ponto4.getHorarios().addElement("09:50");
		ponto4.getHorarios().addElement("10:35");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("12:05");
		ponto4.getHorarios().addElement("12:50");
		ponto4.getHorarios().addElement("13:35");
		ponto4.getHorarios().addElement("14:20");
		ponto4.getHorarios().addElement("15:05");
		ponto4.getHorarios().addElement("15:50");
		ponto4.getHorarios().addElement("16:35");
		ponto4.getHorarios().addElement("17:20");
		ponto4.getHorarios().addElement("18:05");
		ponto4.getHorarios().addElement("18:50");
		ponto4.getHorarios().addElement("19:35");
		ponto4.getHorarios().addElement("20:20");
		ponto4.getHorarios().addElement("21:05");
		ponto4.getHorarios().addElement("21:50");
		ponto4.getHorarios().addElement("22:35");
		ponto4.getHorarios().addElement("23:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL TAMANDARE");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("11/02/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:20");
		ponto5.getHorarios().addElement("06:05");
		ponto5.getHorarios().addElement("06:53");
		ponto5.getHorarios().addElement("07:35");
		ponto5.getHorarios().addElement("08:20");
		ponto5.getHorarios().addElement("09:05");
		ponto5.getHorarios().addElement("09:50");
		ponto5.getHorarios().addElement("10:35");
		ponto5.getHorarios().addElement("11:20");
		ponto5.getHorarios().addElement("12:05");
		ponto5.getHorarios().addElement("12:50");
		ponto5.getHorarios().addElement("13:33");
		ponto5.getHorarios().addElement("14:20");
		ponto5.getHorarios().addElement("15:05");
		ponto5.getHorarios().addElement("15:50");
		ponto5.getHorarios().addElement("16:35");
		ponto5.getHorarios().addElement("17:20");
		ponto5.getHorarios().addElement("18:05");
		ponto5.getHorarios().addElement("18:50");
		ponto5.getHorarios().addElement("19:35");
		ponto5.getHorarios().addElement("20:20");
		ponto5.getHorarios().addElement("21:05");
		ponto5.getHorarios().addElement("21:50");
		ponto5.getHorarios().addElement("22:35");
		ponto5.getHorarios().addElement("23:15");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("MUELLER");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("12/02/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:25");
		ponto6.getHorarios().addElement("07:10");
		ponto6.getHorarios().addElement("07:55");
		ponto6.getHorarios().addElement("08:40");
		ponto6.getHorarios().addElement("09:25");
		ponto6.getHorarios().addElement("10:10");
		ponto6.getHorarios().addElement("10:55");
		ponto6.getHorarios().addElement("11:40");
		ponto6.getHorarios().addElement("12:25");
		ponto6.getHorarios().addElement("13:10");
		ponto6.getHorarios().addElement("13:55");
		ponto6.getHorarios().addElement("14:40");
		ponto6.getHorarios().addElement("15:25");
		ponto6.getHorarios().addElement("16:10");
		ponto6.getHorarios().addElement("16:55");
		ponto6.getHorarios().addElement("17:40");
		ponto6.getHorarios().addElement("18:25");
		ponto6.getHorarios().addElement("19:10");
		ponto6.getHorarios().addElement("19:55");
		ponto6.getHorarios().addElement("20:40");
		ponto6.getHorarios().addElement("21:25");
		ponto6.getHorarios().addElement("22:10");
		ponto6.getHorarios().addElement("23:05");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL TAMANDARE");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("12/02/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:40");
		ponto7.getHorarios().addElement("06:25");
		ponto7.getHorarios().addElement("07:10");
		ponto7.getHorarios().addElement("07:55");
		ponto7.getHorarios().addElement("08:40");
		ponto7.getHorarios().addElement("09:25");
		ponto7.getHorarios().addElement("10:10");
		ponto7.getHorarios().addElement("10:55");
		ponto7.getHorarios().addElement("11:40");
		ponto7.getHorarios().addElement("12:25");
		ponto7.getHorarios().addElement("13:10");
		ponto7.getHorarios().addElement("13:55");
		ponto7.getHorarios().addElement("14:40");
		ponto7.getHorarios().addElement("15:25");
		ponto7.getHorarios().addElement("16:10");
		ponto7.getHorarios().addElement("16:55");
		ponto7.getHorarios().addElement("17:40");
		ponto7.getHorarios().addElement("18:25");
		ponto7.getHorarios().addElement("19:10");
		ponto7.getHorarios().addElement("19:55");
		ponto7.getHorarios().addElement("20:40");
		ponto7.getHorarios().addElement("21:25");
		ponto7.getHorarios().addElement("22:15");
		return onibus;
		}
	}
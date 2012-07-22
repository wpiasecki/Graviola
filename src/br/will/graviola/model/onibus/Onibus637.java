
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus637 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("STA. JOANA");
		onibus.setCodigo("637");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL PINHEIRINHO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("06:03");
		ponto0.getHorarios().addElement("06:26");
		ponto0.getHorarios().addElement("06:49");
		ponto0.getHorarios().addElement("07:12");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:25");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:15");
		ponto0.getHorarios().addElement("09:40");
		ponto0.getHorarios().addElement("10:05");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("10:55");
		ponto0.getHorarios().addElement("11:20");
		ponto0.getHorarios().addElement("11:45");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("12:35");
		ponto0.getHorarios().addElement("13:00");
		ponto0.getHorarios().addElement("13:25");
		ponto0.getHorarios().addElement("13:50");
		ponto0.getHorarios().addElement("14:17");
		ponto0.getHorarios().addElement("14:44");
		ponto0.getHorarios().addElement("15:11");
		ponto0.getHorarios().addElement("15:38");
		ponto0.getHorarios().addElement("16:05");
		ponto0.getHorarios().addElement("16:32");
		ponto0.getHorarios().addElement("16:59");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:53");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:48");
		ponto0.getHorarios().addElement("19:15");
		ponto0.getHorarios().addElement("19:42");
		ponto0.getHorarios().addElement("20:09");
		ponto0.getHorarios().addElement("20:36");
		ponto0.getHorarios().addElement("21:03");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("21:57");
		ponto0.getHorarios().addElement("22:24");
		ponto0.getHorarios().addElement("22:50");
		ponto0.getHorarios().addElement("23:20");
		ponto0.getHorarios().addElement("23:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SITIO CERCADO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:17");
		ponto1.getHorarios().addElement("05:40");
		ponto1.getHorarios().addElement("06:03");
		ponto1.getHorarios().addElement("06:26");
		ponto1.getHorarios().addElement("06:49");
		ponto1.getHorarios().addElement("07:12");
		ponto1.getHorarios().addElement("07:35");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("09:40");
		ponto1.getHorarios().addElement("10:05");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("10:55");
		ponto1.getHorarios().addElement("11:20");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:10");
		ponto1.getHorarios().addElement("12:35");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:25");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("14:17");
		ponto1.getHorarios().addElement("14:44");
		ponto1.getHorarios().addElement("15:11");
		ponto1.getHorarios().addElement("15:38");
		ponto1.getHorarios().addElement("16:05");
		ponto1.getHorarios().addElement("16:32");
		ponto1.getHorarios().addElement("16:59");
		ponto1.getHorarios().addElement("17:26");
		ponto1.getHorarios().addElement("17:53");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:47");
		ponto1.getHorarios().addElement("19:15");
		ponto1.getHorarios().addElement("19:42");
		ponto1.getHorarios().addElement("20:09");
		ponto1.getHorarios().addElement("20:36");
		ponto1.getHorarios().addElement("21:03");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("21:57");
		ponto1.getHorarios().addElement("22:24");
		ponto1.getHorarios().addElement("22:50");
		ponto1.getHorarios().addElement("23:20");
		ponto1.getHorarios().addElement("23:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL PINHEIRINHO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("09/05/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:12");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:42");
		ponto2.getHorarios().addElement("08:27");
		ponto2.getHorarios().addElement("09:12");
		ponto2.getHorarios().addElement("09:57");
		ponto2.getHorarios().addElement("10:42");
		ponto2.getHorarios().addElement("11:27");
		ponto2.getHorarios().addElement("12:12");
		ponto2.getHorarios().addElement("12:57");
		ponto2.getHorarios().addElement("13:42");
		ponto2.getHorarios().addElement("14:27");
		ponto2.getHorarios().addElement("15:12");
		ponto2.getHorarios().addElement("15:57");
		ponto2.getHorarios().addElement("16:42");
		ponto2.getHorarios().addElement("17:27");
		ponto2.getHorarios().addElement("18:12");
		ponto2.getHorarios().addElement("18:57");
		ponto2.getHorarios().addElement("19:42");
		ponto2.getHorarios().addElement("20:27");
		ponto2.getHorarios().addElement("21:12");
		ponto2.getHorarios().addElement("21:57");
		ponto2.getHorarios().addElement("22:42");
		ponto2.getHorarios().addElement("23:27");
		ponto2.getHorarios().addElement("00:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITIO CERCADO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("09/05/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:50");
		ponto3.getHorarios().addElement("06:35");
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("08:05");
		ponto3.getHorarios().addElement("08:50");
		ponto3.getHorarios().addElement("09:35");
		ponto3.getHorarios().addElement("10:20");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("11:50");
		ponto3.getHorarios().addElement("12:35");
		ponto3.getHorarios().addElement("13:20");
		ponto3.getHorarios().addElement("14:05");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("15:35");
		ponto3.getHorarios().addElement("16:20");
		ponto3.getHorarios().addElement("17:05");
		ponto3.getHorarios().addElement("17:50");
		ponto3.getHorarios().addElement("18:35");
		ponto3.getHorarios().addElement("19:20");
		ponto3.getHorarios().addElement("20:05");
		ponto3.getHorarios().addElement("20:50");
		ponto3.getHorarios().addElement("21:35");
		ponto3.getHorarios().addElement("22:20");
		ponto3.getHorarios().addElement("23:05");
		ponto3.getHorarios().addElement("23:50");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL PINHEIRINHO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("10/05/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:29");
		ponto4.getHorarios().addElement("07:14");
		ponto4.getHorarios().addElement("07:59");
		ponto4.getHorarios().addElement("08:44");
		ponto4.getHorarios().addElement("09:29");
		ponto4.getHorarios().addElement("10:14");
		ponto4.getHorarios().addElement("10:59");
		ponto4.getHorarios().addElement("11:44");
		ponto4.getHorarios().addElement("12:29");
		ponto4.getHorarios().addElement("13:14");
		ponto4.getHorarios().addElement("13:59");
		ponto4.getHorarios().addElement("14:44");
		ponto4.getHorarios().addElement("15:29");
		ponto4.getHorarios().addElement("16:14");
		ponto4.getHorarios().addElement("16:59");
		ponto4.getHorarios().addElement("17:44");
		ponto4.getHorarios().addElement("18:29");
		ponto4.getHorarios().addElement("19:14");
		ponto4.getHorarios().addElement("19:59");
		ponto4.getHorarios().addElement("20:44");
		ponto4.getHorarios().addElement("21:29");
		ponto4.getHorarios().addElement("22:14");
		ponto4.getHorarios().addElement("23:00");
		ponto4.getHorarios().addElement("23:47");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL SITIO CERCADO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("10/05/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:07");
		ponto5.getHorarios().addElement("06:52");
		ponto5.getHorarios().addElement("07:37");
		ponto5.getHorarios().addElement("08:22");
		ponto5.getHorarios().addElement("09:07");
		ponto5.getHorarios().addElement("09:52");
		ponto5.getHorarios().addElement("10:37");
		ponto5.getHorarios().addElement("11:22");
		ponto5.getHorarios().addElement("12:07");
		ponto5.getHorarios().addElement("12:52");
		ponto5.getHorarios().addElement("13:37");
		ponto5.getHorarios().addElement("14:22");
		ponto5.getHorarios().addElement("15:07");
		ponto5.getHorarios().addElement("15:52");
		ponto5.getHorarios().addElement("16:37");
		ponto5.getHorarios().addElement("17:22");
		ponto5.getHorarios().addElement("18:07");
		ponto5.getHorarios().addElement("18:52");
		ponto5.getHorarios().addElement("19:37");
		ponto5.getHorarios().addElement("20:22");
		ponto5.getHorarios().addElement("21:07");
		ponto5.getHorarios().addElement("21:52");
		ponto5.getHorarios().addElement("22:37");
		ponto5.getHorarios().addElement("23:25");
		return onibus;
		}
	}
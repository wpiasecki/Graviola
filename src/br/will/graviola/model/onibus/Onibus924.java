
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus924 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("STA. FELICIDADE / STA. CÂNDIDA");
		onibus.setCodigo("924");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO ROCIO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("29/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:15");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("05:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SANTA CANDIDA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("29/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:04");
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:51");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:22");
		ponto1.getHorarios().addElement("07:38");
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("08:12");
		ponto1.getHorarios().addElement("08:26");
		ponto1.getHorarios().addElement("08:42");
		ponto1.getHorarios().addElement("09:10");
		ponto1.getHorarios().addElement("09:37");
		ponto1.getHorarios().addElement("10:04");
		ponto1.getHorarios().addElement("10:31");
		ponto1.getHorarios().addElement("10:58");
		ponto1.getHorarios().addElement("11:25");
		ponto1.getHorarios().addElement("11:52");
		ponto1.getHorarios().addElement("12:19");
		ponto1.getHorarios().addElement("12:46");
		ponto1.getHorarios().addElement("13:13");
		ponto1.getHorarios().addElement("13:40");
		ponto1.getHorarios().addElement("14:07");
		ponto1.getHorarios().addElement("14:34");
		ponto1.getHorarios().addElement("15:01");
		ponto1.getHorarios().addElement("15:29");
		ponto1.getHorarios().addElement("15:58");
		ponto1.getHorarios().addElement("16:26");
		ponto1.getHorarios().addElement("16:49");
		ponto1.getHorarios().addElement("17:07");
		ponto1.getHorarios().addElement("17:26");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:03");
		ponto1.getHorarios().addElement("18:21");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("18:58");
		ponto1.getHorarios().addElement("19:17");
		ponto1.getHorarios().addElement("19:45");
		ponto1.getHorarios().addElement("20:20");
		ponto1.getHorarios().addElement("20:57");
		ponto1.getHorarios().addElement("21:32");
		ponto1.getHorarios().addElement("22:07");
		ponto1.getHorarios().addElement("22:40");
		ponto1.getHorarios().addElement("23:12");
		ponto1.getHorarios().addElement("23:47");
		ponto1.getHorarios().addElement("00:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SANTA FELICIDADE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("29/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:10");
		ponto2.getHorarios().addElement("05:26");
		ponto2.getHorarios().addElement("05:41");
		ponto2.getHorarios().addElement("05:57");
		ponto2.getHorarios().addElement("06:12");
		ponto2.getHorarios().addElement("06:28");
		ponto2.getHorarios().addElement("06:43");
		ponto2.getHorarios().addElement("06:58");
		ponto2.getHorarios().addElement("07:14");
		ponto2.getHorarios().addElement("07:29");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:16");
		ponto2.getHorarios().addElement("08:43");
		ponto2.getHorarios().addElement("09:10");
		ponto2.getHorarios().addElement("09:37");
		ponto2.getHorarios().addElement("10:04");
		ponto2.getHorarios().addElement("10:31");
		ponto2.getHorarios().addElement("10:58");
		ponto2.getHorarios().addElement("11:25");
		ponto2.getHorarios().addElement("11:52");
		ponto2.getHorarios().addElement("12:19");
		ponto2.getHorarios().addElement("12:46");
		ponto2.getHorarios().addElement("13:13");
		ponto2.getHorarios().addElement("13:40");
		ponto2.getHorarios().addElement("14:07");
		ponto2.getHorarios().addElement("14:34");
		ponto2.getHorarios().addElement("15:01");
		ponto2.getHorarios().addElement("15:28");
		ponto2.getHorarios().addElement("15:55");
		ponto2.getHorarios().addElement("16:13");
		ponto2.getHorarios().addElement("16:31");
		ponto2.getHorarios().addElement("16:49");
		ponto2.getHorarios().addElement("17:07");
		ponto2.getHorarios().addElement("17:25");
		ponto2.getHorarios().addElement("17:45");
		ponto2.getHorarios().addElement("18:02");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("18:37");
		ponto2.getHorarios().addElement("18:55");
		ponto2.getHorarios().addElement("19:13");
		ponto2.getHorarios().addElement("19:37");
		ponto2.getHorarios().addElement("20:07");
		ponto2.getHorarios().addElement("20:39");
		ponto2.getHorarios().addElement("21:14");
		ponto2.getHorarios().addElement("21:48");
		ponto2.getHorarios().addElement("22:23");
		ponto2.getHorarios().addElement("22:57");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("00:05");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SANTA CANDIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("20/09/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:50");
		ponto3.getHorarios().addElement("06:25");
		ponto3.getHorarios().addElement("06:59");
		ponto3.getHorarios().addElement("07:32");
		ponto3.getHorarios().addElement("08:05");
		ponto3.getHorarios().addElement("08:39");
		ponto3.getHorarios().addElement("09:12");
		ponto3.getHorarios().addElement("09:45");
		ponto3.getHorarios().addElement("10:19");
		ponto3.getHorarios().addElement("10:52");
		ponto3.getHorarios().addElement("11:25");
		ponto3.getHorarios().addElement("11:59");
		ponto3.getHorarios().addElement("12:32");
		ponto3.getHorarios().addElement("13:05");
		ponto3.getHorarios().addElement("13:39");
		ponto3.getHorarios().addElement("14:12");
		ponto3.getHorarios().addElement("14:45");
		ponto3.getHorarios().addElement("15:19");
		ponto3.getHorarios().addElement("15:52");
		ponto3.getHorarios().addElement("16:25");
		ponto3.getHorarios().addElement("16:59");
		ponto3.getHorarios().addElement("17:32");
		ponto3.getHorarios().addElement("18:05");
		ponto3.getHorarios().addElement("18:55");
		ponto3.getHorarios().addElement("19:45");
		ponto3.getHorarios().addElement("20:35");
		ponto3.getHorarios().addElement("21:30");
		ponto3.getHorarios().addElement("22:15");
		ponto3.getHorarios().addElement("23:05");
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL SANTA FELICIDADE");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("20/09/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:35");
		ponto4.getHorarios().addElement("06:09");
		ponto4.getHorarios().addElement("06:42");
		ponto4.getHorarios().addElement("07:15");
		ponto4.getHorarios().addElement("07:49");
		ponto4.getHorarios().addElement("08:22");
		ponto4.getHorarios().addElement("08:55");
		ponto4.getHorarios().addElement("09:29");
		ponto4.getHorarios().addElement("10:02");
		ponto4.getHorarios().addElement("10:35");
		ponto4.getHorarios().addElement("11:09");
		ponto4.getHorarios().addElement("11:42");
		ponto4.getHorarios().addElement("12:15");
		ponto4.getHorarios().addElement("12:49");
		ponto4.getHorarios().addElement("13:22");
		ponto4.getHorarios().addElement("13:55");
		ponto4.getHorarios().addElement("14:29");
		ponto4.getHorarios().addElement("15:02");
		ponto4.getHorarios().addElement("15:35");
		ponto4.getHorarios().addElement("16:09");
		ponto4.getHorarios().addElement("16:42");
		ponto4.getHorarios().addElement("17:15");
		ponto4.getHorarios().addElement("17:49");
		ponto4.getHorarios().addElement("18:22");
		ponto4.getHorarios().addElement("18:55");
		ponto4.getHorarios().addElement("19:45");
		ponto4.getHorarios().addElement("20:35");
		ponto4.getHorarios().addElement("21:25");
		ponto4.getHorarios().addElement("22:15");
		ponto4.getHorarios().addElement("23:05");
		ponto4.getHorarios().addElement("00:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("BAIRRO ROCIO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:55");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL SANTA CANDIDA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:25");
		ponto6.getHorarios().addElement("07:15");
		ponto6.getHorarios().addElement("08:05");
		ponto6.getHorarios().addElement("08:55");
		ponto6.getHorarios().addElement("09:45");
		ponto6.getHorarios().addElement("10:35");
		ponto6.getHorarios().addElement("11:25");
		ponto6.getHorarios().addElement("12:15");
		ponto6.getHorarios().addElement("13:05");
		ponto6.getHorarios().addElement("13:55");
		ponto6.getHorarios().addElement("14:45");
		ponto6.getHorarios().addElement("15:35");
		ponto6.getHorarios().addElement("16:25");
		ponto6.getHorarios().addElement("17:15");
		ponto6.getHorarios().addElement("18:05");
		ponto6.getHorarios().addElement("18:55");
		ponto6.getHorarios().addElement("19:45");
		ponto6.getHorarios().addElement("20:35");
		ponto6.getHorarios().addElement("21:30");
		ponto6.getHorarios().addElement("22:15");
		ponto6.getHorarios().addElement("23:05");
		ponto6.getHorarios().addElement("00:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL SANTA FELICIDADE");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:35");
		ponto7.getHorarios().addElement("06:25");
		ponto7.getHorarios().addElement("07:15");
		ponto7.getHorarios().addElement("08:05");
		ponto7.getHorarios().addElement("08:55");
		ponto7.getHorarios().addElement("09:45");
		ponto7.getHorarios().addElement("10:35");
		ponto7.getHorarios().addElement("11:25");
		ponto7.getHorarios().addElement("12:15");
		ponto7.getHorarios().addElement("13:05");
		ponto7.getHorarios().addElement("13:55");
		ponto7.getHorarios().addElement("14:45");
		ponto7.getHorarios().addElement("15:35");
		ponto7.getHorarios().addElement("16:25");
		ponto7.getHorarios().addElement("17:15");
		ponto7.getHorarios().addElement("18:05");
		ponto7.getHorarios().addElement("18:55");
		ponto7.getHorarios().addElement("19:45");
		ponto7.getHorarios().addElement("20:35");
		ponto7.getHorarios().addElement("21:25");
		ponto7.getHorarios().addElement("22:15");
		ponto7.getHorarios().addElement("23:05");
		ponto7.getHorarios().addElement("00:00");
		return onibus;
		}
	}
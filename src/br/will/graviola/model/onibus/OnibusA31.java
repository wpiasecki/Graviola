
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusA31 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("A31 - JD. GRAZIELA");
		onibus.setCodigo("A31");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO JD.GRAZIELA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:15");
		ponto0.getHorarios().addElement("05:27");
		ponto0.getHorarios().addElement("05:51");
		ponto0.getHorarios().addElement("05:57");
		ponto0.getHorarios().addElement("06:09");
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:27");
		ponto0.getHorarios().addElement("06:33");
		ponto0.getHorarios().addElement("06:39");
		ponto0.getHorarios().addElement("06:51");
		ponto0.getHorarios().addElement("06:57");
		ponto0.getHorarios().addElement("07:09");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:21");
		ponto0.getHorarios().addElement("07:33");
		ponto0.getHorarios().addElement("07:39");
		ponto0.getHorarios().addElement("07:51");
		ponto0.getHorarios().addElement("07:57");
		ponto0.getHorarios().addElement("08:03");
		ponto0.getHorarios().addElement("08:25");
		ponto0.getHorarios().addElement("08:37");
		ponto0.getHorarios().addElement("09:07");
		ponto0.getHorarios().addElement("09:22");
		ponto0.getHorarios().addElement("09:52");
		ponto0.getHorarios().addElement("10:07");
		ponto0.getHorarios().addElement("10:37");
		ponto0.getHorarios().addElement("10:52");
		ponto0.getHorarios().addElement("11:22");
		ponto0.getHorarios().addElement("11:37");
		ponto0.getHorarios().addElement("12:07");
		ponto0.getHorarios().addElement("12:22");
		ponto0.getHorarios().addElement("12:52");
		ponto0.getHorarios().addElement("13:07");
		ponto0.getHorarios().addElement("13:37");
		ponto0.getHorarios().addElement("13:52");
		ponto0.getHorarios().addElement("14:22");
		ponto0.getHorarios().addElement("14:37");
		ponto0.getHorarios().addElement("15:07");
		ponto0.getHorarios().addElement("15:22");
		ponto0.getHorarios().addElement("15:52");
		ponto0.getHorarios().addElement("16:07");
		ponto0.getHorarios().addElement("16:37");
		ponto0.getHorarios().addElement("16:52");
		ponto0.getHorarios().addElement("17:21");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("17:42");
		ponto0.getHorarios().addElement("17:56");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:17");
		ponto0.getHorarios().addElement("18:24");
		ponto0.getHorarios().addElement("18:38");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("18:59");
		ponto0.getHorarios().addElement("19:06");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("19:42");
		ponto0.getHorarios().addElement("20:27");
		ponto0.getHorarios().addElement("21:12");
		ponto0.getHorarios().addElement("21:57");
		ponto0.getHorarios().addElement("22:42");
		ponto0.getHorarios().addElement("23:35");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL BARREIRINHA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:22");
		ponto1.getHorarios().addElement("05:36");
		ponto1.getHorarios().addElement("05:48");
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:12");
		ponto1.getHorarios().addElement("06:18");
		ponto1.getHorarios().addElement("06:24");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:36");
		ponto1.getHorarios().addElement("06:42");
		ponto1.getHorarios().addElement("06:48");
		ponto1.getHorarios().addElement("06:54");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:12");
		ponto1.getHorarios().addElement("07:18");
		ponto1.getHorarios().addElement("07:24");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("07:36");
		ponto1.getHorarios().addElement("07:42");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:15");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("09:30");
		ponto1.getHorarios().addElement("09:45");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("10:15");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("10:45");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:15");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("12:15");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("12:45");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("13:45");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:15");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("14:45");
		ponto1.getHorarios().addElement("15:00");
		ponto1.getHorarios().addElement("15:15");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("16:15");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("16:45");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:14");
		ponto1.getHorarios().addElement("17:21");
		ponto1.getHorarios().addElement("17:28");
		ponto1.getHorarios().addElement("17:35");
		ponto1.getHorarios().addElement("17:42");
		ponto1.getHorarios().addElement("17:49");
		ponto1.getHorarios().addElement("17:56");
		ponto1.getHorarios().addElement("18:03");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("18:17");
		ponto1.getHorarios().addElement("18:24");
		ponto1.getHorarios().addElement("18:31");
		ponto1.getHorarios().addElement("18:38");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("18:52");
		ponto1.getHorarios().addElement("18:59");
		ponto1.getHorarios().addElement("19:06");
		ponto1.getHorarios().addElement("19:13");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("19:40");
		ponto1.getHorarios().addElement("19:50");
		ponto1.getHorarios().addElement("20:05");
		ponto1.getHorarios().addElement("20:27");
		ponto1.getHorarios().addElement("20:50");
		ponto1.getHorarios().addElement("21:12");
		ponto1.getHorarios().addElement("21:35");
		ponto1.getHorarios().addElement("21:57");
		ponto1.getHorarios().addElement("22:20");
		ponto1.getHorarios().addElement("22:45");
		ponto1.getHorarios().addElement("23:10");
		ponto1.getHorarios().addElement("23:40");
		ponto1.getHorarios().addElement("00:00");
		ponto1.getHorarios().addElement("00:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("JARDIM IPE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:40");
		ponto2.getHorarios().addElement("06:03");
		ponto2.getHorarios().addElement("06:21");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:03");
		ponto2.getHorarios().addElement("07:27");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:12");
		ponto2.getHorarios().addElement("08:52");
		ponto2.getHorarios().addElement("09:37");
		ponto2.getHorarios().addElement("10:22");
		ponto2.getHorarios().addElement("11:07");
		ponto2.getHorarios().addElement("11:52");
		ponto2.getHorarios().addElement("12:37");
		ponto2.getHorarios().addElement("13:22");
		ponto2.getHorarios().addElement("14:07");
		ponto2.getHorarios().addElement("14:52");
		ponto2.getHorarios().addElement("15:37");
		ponto2.getHorarios().addElement("16:22");
		ponto2.getHorarios().addElement("17:07");
		ponto2.getHorarios().addElement("17:49");
		ponto2.getHorarios().addElement("18:10");
		ponto2.getHorarios().addElement("18:31");
		ponto2.getHorarios().addElement("18:52");
		ponto2.getHorarios().addElement("19:13");
		ponto2.getHorarios().addElement("20:04");
		ponto2.getHorarios().addElement("20:49");
		ponto2.getHorarios().addElement("21:34");
		ponto2.getHorarios().addElement("22:20");
		ponto2.getHorarios().addElement("23:05");
		ponto2.getHorarios().addElement("00:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("BAIRRO JD.GRAZIELA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("07/06/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:15");
		ponto3.getHorarios().addElement("05:30");
		ponto3.getHorarios().addElement("06:00");
		ponto3.getHorarios().addElement("06:15");
		ponto3.getHorarios().addElement("06:45");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("07:45");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:08");
		ponto3.getHorarios().addElement("09:54");
		ponto3.getHorarios().addElement("10:40");
		ponto3.getHorarios().addElement("11:26");
		ponto3.getHorarios().addElement("11:42");
		ponto3.getHorarios().addElement("12:12");
		ponto3.getHorarios().addElement("12:28");
		ponto3.getHorarios().addElement("12:58");
		ponto3.getHorarios().addElement("13:14");
		ponto3.getHorarios().addElement("13:44");
		ponto3.getHorarios().addElement("14:00");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("14:46");
		ponto3.getHorarios().addElement("15:16");
		ponto3.getHorarios().addElement("15:32");
		ponto3.getHorarios().addElement("16:02");
		ponto3.getHorarios().addElement("16:18");
		ponto3.getHorarios().addElement("16:48");
		ponto3.getHorarios().addElement("17:04");
		ponto3.getHorarios().addElement("17:34");
		ponto3.getHorarios().addElement("17:50");
		ponto3.getHorarios().addElement("18:20");
		ponto3.getHorarios().addElement("18:36");
		ponto3.getHorarios().addElement("19:06");
		ponto3.getHorarios().addElement("20:10");
		ponto3.getHorarios().addElement("21:00");
		ponto3.getHorarios().addElement("21:50");
		ponto3.getHorarios().addElement("22:40");
		ponto3.getHorarios().addElement("23:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL BARREIRINHA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("07/06/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:23");
		ponto4.getHorarios().addElement("05:38");
		ponto4.getHorarios().addElement("05:53");
		ponto4.getHorarios().addElement("06:08");
		ponto4.getHorarios().addElement("06:23");
		ponto4.getHorarios().addElement("06:38");
		ponto4.getHorarios().addElement("06:53");
		ponto4.getHorarios().addElement("07:08");
		ponto4.getHorarios().addElement("07:23");
		ponto4.getHorarios().addElement("07:38");
		ponto4.getHorarios().addElement("07:53");
		ponto4.getHorarios().addElement("08:08");
		ponto4.getHorarios().addElement("08:23");
		ponto4.getHorarios().addElement("08:38");
		ponto4.getHorarios().addElement("09:08");
		ponto4.getHorarios().addElement("09:31");
		ponto4.getHorarios().addElement("09:54");
		ponto4.getHorarios().addElement("10:17");
		ponto4.getHorarios().addElement("10:40");
		ponto4.getHorarios().addElement("11:03");
		ponto4.getHorarios().addElement("11:19");
		ponto4.getHorarios().addElement("11:34");
		ponto4.getHorarios().addElement("11:49");
		ponto4.getHorarios().addElement("12:05");
		ponto4.getHorarios().addElement("12:20");
		ponto4.getHorarios().addElement("12:35");
		ponto4.getHorarios().addElement("12:51");
		ponto4.getHorarios().addElement("13:06");
		ponto4.getHorarios().addElement("13:21");
		ponto4.getHorarios().addElement("13:37");
		ponto4.getHorarios().addElement("13:52");
		ponto4.getHorarios().addElement("14:07");
		ponto4.getHorarios().addElement("14:23");
		ponto4.getHorarios().addElement("14:38");
		ponto4.getHorarios().addElement("14:53");
		ponto4.getHorarios().addElement("15:09");
		ponto4.getHorarios().addElement("15:24");
		ponto4.getHorarios().addElement("15:39");
		ponto4.getHorarios().addElement("15:55");
		ponto4.getHorarios().addElement("16:10");
		ponto4.getHorarios().addElement("16:25");
		ponto4.getHorarios().addElement("16:41");
		ponto4.getHorarios().addElement("16:56");
		ponto4.getHorarios().addElement("17:11");
		ponto4.getHorarios().addElement("17:27");
		ponto4.getHorarios().addElement("17:42");
		ponto4.getHorarios().addElement("17:57");
		ponto4.getHorarios().addElement("18:13");
		ponto4.getHorarios().addElement("18:28");
		ponto4.getHorarios().addElement("18:43");
		ponto4.getHorarios().addElement("18:59");
		ponto4.getHorarios().addElement("19:14");
		ponto4.getHorarios().addElement("19:35");
		ponto4.getHorarios().addElement("20:10");
		ponto4.getHorarios().addElement("20:35");
		ponto4.getHorarios().addElement("21:00");
		ponto4.getHorarios().addElement("21:25");
		ponto4.getHorarios().addElement("21:50");
		ponto4.getHorarios().addElement("22:15");
		ponto4.getHorarios().addElement("22:40");
		ponto4.getHorarios().addElement("23:05");
		ponto4.getHorarios().addElement("23:30");
		ponto4.getHorarios().addElement("00:00");
		ponto4.getHorarios().addElement("00:40");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("JARDIM IPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("07/06/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:00");
		ponto5.getHorarios().addElement("05:45");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:15");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("08:45");
		ponto5.getHorarios().addElement("09:31");
		ponto5.getHorarios().addElement("10:17");
		ponto5.getHorarios().addElement("11:03");
		ponto5.getHorarios().addElement("11:57");
		ponto5.getHorarios().addElement("12:43");
		ponto5.getHorarios().addElement("13:29");
		ponto5.getHorarios().addElement("14:15");
		ponto5.getHorarios().addElement("15:01");
		ponto5.getHorarios().addElement("15:47");
		ponto5.getHorarios().addElement("16:33");
		ponto5.getHorarios().addElement("17:19");
		ponto5.getHorarios().addElement("18:05");
		ponto5.getHorarios().addElement("18:51");
		ponto5.getHorarios().addElement("19:37");
		ponto5.getHorarios().addElement("20:35");
		ponto5.getHorarios().addElement("21:25");
		ponto5.getHorarios().addElement("22:15");
		ponto5.getHorarios().addElement("23:05");
		ponto5.getHorarios().addElement("00:05");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO JD.GRAZIELA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("08/06/2008");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:00");
		ponto6.getHorarios().addElement("05:55");
		ponto6.getHorarios().addElement("06:45");
		ponto6.getHorarios().addElement("07:35");
		ponto6.getHorarios().addElement("08:25");
		ponto6.getHorarios().addElement("09:15");
		ponto6.getHorarios().addElement("10:05");
		ponto6.getHorarios().addElement("10:55");
		ponto6.getHorarios().addElement("11:45");
		ponto6.getHorarios().addElement("12:35");
		ponto6.getHorarios().addElement("13:25");
		ponto6.getHorarios().addElement("14:15");
		ponto6.getHorarios().addElement("15:05");
		ponto6.getHorarios().addElement("15:55");
		ponto6.getHorarios().addElement("16:45");
		ponto6.getHorarios().addElement("17:35");
		ponto6.getHorarios().addElement("18:25");
		ponto6.getHorarios().addElement("19:15");
		ponto6.getHorarios().addElement("20:05");
		ponto6.getHorarios().addElement("20:55");
		ponto6.getHorarios().addElement("21:45");
		ponto6.getHorarios().addElement("22:35");
		ponto6.getHorarios().addElement("23:30");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL BARREIRINHA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("08/06/2008");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:20");
		ponto7.getHorarios().addElement("05:55");
		ponto7.getHorarios().addElement("06:20");
		ponto7.getHorarios().addElement("06:45");
		ponto7.getHorarios().addElement("07:10");
		ponto7.getHorarios().addElement("07:35");
		ponto7.getHorarios().addElement("08:00");
		ponto7.getHorarios().addElement("08:25");
		ponto7.getHorarios().addElement("08:50");
		ponto7.getHorarios().addElement("09:15");
		ponto7.getHorarios().addElement("09:40");
		ponto7.getHorarios().addElement("10:05");
		ponto7.getHorarios().addElement("10:30");
		ponto7.getHorarios().addElement("10:55");
		ponto7.getHorarios().addElement("11:20");
		ponto7.getHorarios().addElement("11:45");
		ponto7.getHorarios().addElement("12:10");
		ponto7.getHorarios().addElement("12:35");
		ponto7.getHorarios().addElement("13:00");
		ponto7.getHorarios().addElement("13:25");
		ponto7.getHorarios().addElement("13:50");
		ponto7.getHorarios().addElement("14:15");
		ponto7.getHorarios().addElement("14:40");
		ponto7.getHorarios().addElement("15:05");
		ponto7.getHorarios().addElement("15:30");
		ponto7.getHorarios().addElement("15:55");
		ponto7.getHorarios().addElement("16:20");
		ponto7.getHorarios().addElement("16:45");
		ponto7.getHorarios().addElement("17:10");
		ponto7.getHorarios().addElement("17:35");
		ponto7.getHorarios().addElement("18:00");
		ponto7.getHorarios().addElement("18:25");
		ponto7.getHorarios().addElement("18:50");
		ponto7.getHorarios().addElement("19:15");
		ponto7.getHorarios().addElement("19:40");
		ponto7.getHorarios().addElement("20:05");
		ponto7.getHorarios().addElement("20:30");
		ponto7.getHorarios().addElement("20:55");
		ponto7.getHorarios().addElement("21:20");
		ponto7.getHorarios().addElement("21:45");
		ponto7.getHorarios().addElement("22:10");
		ponto7.getHorarios().addElement("22:35");
		ponto7.getHorarios().addElement("23:00");
		ponto7.getHorarios().addElement("23:30");
		ponto7.getHorarios().addElement("00:00");
		ponto7.getHorarios().addElement("00:40");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("JARDIM IPE");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("08/06/2008");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:30");
		ponto8.getHorarios().addElement("06:20");
		ponto8.getHorarios().addElement("07:10");
		ponto8.getHorarios().addElement("08:00");
		ponto8.getHorarios().addElement("08:50");
		ponto8.getHorarios().addElement("09:40");
		ponto8.getHorarios().addElement("10:30");
		ponto8.getHorarios().addElement("11:20");
		ponto8.getHorarios().addElement("12:10");
		ponto8.getHorarios().addElement("13:00");
		ponto8.getHorarios().addElement("13:50");
		ponto8.getHorarios().addElement("14:40");
		ponto8.getHorarios().addElement("15:30");
		ponto8.getHorarios().addElement("16:20");
		ponto8.getHorarios().addElement("17:10");
		ponto8.getHorarios().addElement("18:00");
		ponto8.getHorarios().addElement("18:50");
		ponto8.getHorarios().addElement("19:40");
		ponto8.getHorarios().addElement("20:30");
		ponto8.getHorarios().addElement("21:20");
		ponto8.getHorarios().addElement("22:10");
		ponto8.getHorarios().addElement("23:00");
		ponto8.getHorarios().addElement("00:05");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus050 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("050 - INTERBAIRROS V");
		onibus.setCodigo("050");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("CENTRO POLITECNICO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL FAZENDINHA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:18");
		ponto1.getHorarios().addElement("05:27");
		ponto1.getHorarios().addElement("05:36");
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("05:53");
		ponto1.getHorarios().addElement("06:02");
		ponto1.getHorarios().addElement("06:11");
		ponto1.getHorarios().addElement("06:19");
		ponto1.getHorarios().addElement("06:28");
		ponto1.getHorarios().addElement("06:37");
		ponto1.getHorarios().addElement("06:45");
		ponto1.getHorarios().addElement("06:54");
		ponto1.getHorarios().addElement("07:03");
		ponto1.getHorarios().addElement("07:11");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:29");
		ponto1.getHorarios().addElement("07:38");
		ponto1.getHorarios().addElement("07:46");
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("08:04");
		ponto1.getHorarios().addElement("08:12");
		ponto1.getHorarios().addElement("08:21");
		ponto1.getHorarios().addElement("08:38");
		ponto1.getHorarios().addElement("08:54");
		ponto1.getHorarios().addElement("09:11");
		ponto1.getHorarios().addElement("09:27");
		ponto1.getHorarios().addElement("09:44");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("10:17");
		ponto1.getHorarios().addElement("10:34");
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("11:07");
		ponto1.getHorarios().addElement("11:23");
		ponto1.getHorarios().addElement("11:40");
		ponto1.getHorarios().addElement("11:56");
		ponto1.getHorarios().addElement("12:13");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("12:46");
		ponto1.getHorarios().addElement("13:03");
		ponto1.getHorarios().addElement("13:19");
		ponto1.getHorarios().addElement("13:36");
		ponto1.getHorarios().addElement("13:52");
		ponto1.getHorarios().addElement("14:09");
		ponto1.getHorarios().addElement("14:26");
		ponto1.getHorarios().addElement("14:42");
		ponto1.getHorarios().addElement("14:59");
		ponto1.getHorarios().addElement("15:15");
		ponto1.getHorarios().addElement("15:32");
		ponto1.getHorarios().addElement("15:48");
		ponto1.getHorarios().addElement("16:05");
		ponto1.getHorarios().addElement("16:22");
		ponto1.getHorarios().addElement("16:31");
		ponto1.getHorarios().addElement("16:41");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("16:59");
		ponto1.getHorarios().addElement("17:09");
		ponto1.getHorarios().addElement("17:18");
		ponto1.getHorarios().addElement("17:28");
		ponto1.getHorarios().addElement("17:37");
		ponto1.getHorarios().addElement("17:47");
		ponto1.getHorarios().addElement("17:56");
		ponto1.getHorarios().addElement("18:06");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:25");
		ponto1.getHorarios().addElement("18:34");
		ponto1.getHorarios().addElement("18:44");
		ponto1.getHorarios().addElement("18:53");
		ponto1.getHorarios().addElement("19:02");
		ponto1.getHorarios().addElement("19:11");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:29");
		ponto1.getHorarios().addElement("19:50");
		ponto1.getHorarios().addElement("20:11");
		ponto1.getHorarios().addElement("20:32");
		ponto1.getHorarios().addElement("20:53");
		ponto1.getHorarios().addElement("21:14");
		ponto1.getHorarios().addElement("21:35");
		ponto1.getHorarios().addElement("21:56");
		ponto1.getHorarios().addElement("22:17");
		ponto1.getHorarios().addElement("22:37");
		ponto1.getHorarios().addElement("22:57");
		ponto1.getHorarios().addElement("23:17");
		ponto1.getHorarios().addElement("23:37");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL PORTAO(SENT.FAZENDIN)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:53");
		ponto2.getHorarios().addElement("06:06");
		ponto2.getHorarios().addElement("06:19");
		ponto2.getHorarios().addElement("06:28");
		ponto2.getHorarios().addElement("06:37");
		ponto2.getHorarios().addElement("06:46");
		ponto2.getHorarios().addElement("06:55");
		ponto2.getHorarios().addElement("07:04");
		ponto2.getHorarios().addElement("07:13");
		ponto2.getHorarios().addElement("07:22");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("07:39");
		ponto2.getHorarios().addElement("07:48");
		ponto2.getHorarios().addElement("07:56");
		ponto2.getHorarios().addElement("08:05");
		ponto2.getHorarios().addElement("08:18");
		ponto2.getHorarios().addElement("08:26");
		ponto2.getHorarios().addElement("08:35");
		ponto2.getHorarios().addElement("08:44");
		ponto2.getHorarios().addElement("08:52");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:06");
		ponto2.getHorarios().addElement("09:15");
		ponto2.getHorarios().addElement("09:22");
		ponto2.getHorarios().addElement("09:31");
		ponto2.getHorarios().addElement("09:44");
		ponto2.getHorarios().addElement("10:01");
		ponto2.getHorarios().addElement("10:18");
		ponto2.getHorarios().addElement("10:34");
		ponto2.getHorarios().addElement("10:51");
		ponto2.getHorarios().addElement("11:07");
		ponto2.getHorarios().addElement("11:24");
		ponto2.getHorarios().addElement("11:40");
		ponto2.getHorarios().addElement("11:57");
		ponto2.getHorarios().addElement("12:14");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("12:47");
		ponto2.getHorarios().addElement("13:03");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("13:36");
		ponto2.getHorarios().addElement("13:53");
		ponto2.getHorarios().addElement("14:10");
		ponto2.getHorarios().addElement("14:26");
		ponto2.getHorarios().addElement("14:43");
		ponto2.getHorarios().addElement("14:59");
		ponto2.getHorarios().addElement("15:16");
		ponto2.getHorarios().addElement("15:32");
		ponto2.getHorarios().addElement("15:49");
		ponto2.getHorarios().addElement("16:06");
		ponto2.getHorarios().addElement("16:23");
		ponto2.getHorarios().addElement("16:41");
		ponto2.getHorarios().addElement("16:54");
		ponto2.getHorarios().addElement("17:03");
		ponto2.getHorarios().addElement("17:12");
		ponto2.getHorarios().addElement("17:21");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("17:40");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("17:59");
		ponto2.getHorarios().addElement("18:08");
		ponto2.getHorarios().addElement("18:17");
		ponto2.getHorarios().addElement("18:27");
		ponto2.getHorarios().addElement("18:36");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("18:55");
		ponto2.getHorarios().addElement("19:04");
		ponto2.getHorarios().addElement("19:14");
		ponto2.getHorarios().addElement("19:24");
		ponto2.getHorarios().addElement("19:34");
		ponto2.getHorarios().addElement("19:44");
		ponto2.getHorarios().addElement("19:54");
		ponto2.getHorarios().addElement("20:03");
		ponto2.getHorarios().addElement("20:13");
		ponto2.getHorarios().addElement("20:21");
		ponto2.getHorarios().addElement("20:29");
		ponto2.getHorarios().addElement("20:35");
		ponto2.getHorarios().addElement("20:44");
		ponto2.getHorarios().addElement("20:59");
		ponto2.getHorarios().addElement("21:20");
		ponto2.getHorarios().addElement("21:41");
		ponto2.getHorarios().addElement("22:02");
		ponto2.getHorarios().addElement("22:23");
		ponto2.getHorarios().addElement("22:44");
		ponto2.getHorarios().addElement("23:03");
		ponto2.getHorarios().addElement("23:24");
		ponto2.getHorarios().addElement("23:44");
		ponto2.getHorarios().addElement("00:04");
		ponto2.getHorarios().addElement("00:25");
		ponto2.getHorarios().addElement("00:45");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PORTAO(SENT.OFICINAS)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:34");
		ponto3.getHorarios().addElement("05:43");
		ponto3.getHorarios().addElement("05:52");
		ponto3.getHorarios().addElement("06:01");
		ponto3.getHorarios().addElement("06:09");
		ponto3.getHorarios().addElement("06:17");
		ponto3.getHorarios().addElement("06:25");
		ponto3.getHorarios().addElement("06:33");
		ponto3.getHorarios().addElement("06:42");
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:19");
		ponto3.getHorarios().addElement("07:27");
		ponto3.getHorarios().addElement("07:36");
		ponto3.getHorarios().addElement("07:45");
		ponto3.getHorarios().addElement("07:54");
		ponto3.getHorarios().addElement("08:02");
		ponto3.getHorarios().addElement("08:11");
		ponto3.getHorarios().addElement("08:20");
		ponto3.getHorarios().addElement("08:29");
		ponto3.getHorarios().addElement("08:39");
		ponto3.getHorarios().addElement("08:56");
		ponto3.getHorarios().addElement("09:12");
		ponto3.getHorarios().addElement("09:29");
		ponto3.getHorarios().addElement("09:45");
		ponto3.getHorarios().addElement("10:02");
		ponto3.getHorarios().addElement("10:18");
		ponto3.getHorarios().addElement("10:35");
		ponto3.getHorarios().addElement("10:52");
		ponto3.getHorarios().addElement("11:08");
		ponto3.getHorarios().addElement("11:25");
		ponto3.getHorarios().addElement("11:41");
		ponto3.getHorarios().addElement("11:58");
		ponto3.getHorarios().addElement("12:14");
		ponto3.getHorarios().addElement("12:31");
		ponto3.getHorarios().addElement("12:48");
		ponto3.getHorarios().addElement("13:04");
		ponto3.getHorarios().addElement("13:21");
		ponto3.getHorarios().addElement("13:37");
		ponto3.getHorarios().addElement("13:54");
		ponto3.getHorarios().addElement("14:10");
		ponto3.getHorarios().addElement("14:27");
		ponto3.getHorarios().addElement("14:44");
		ponto3.getHorarios().addElement("15:00");
		ponto3.getHorarios().addElement("15:17");
		ponto3.getHorarios().addElement("15:33");
		ponto3.getHorarios().addElement("15:50");
		ponto3.getHorarios().addElement("16:06");
		ponto3.getHorarios().addElement("16:23");
		ponto3.getHorarios().addElement("16:40");
		ponto3.getHorarios().addElement("16:49");
		ponto3.getHorarios().addElement("16:59");
		ponto3.getHorarios().addElement("17:08");
		ponto3.getHorarios().addElement("17:17");
		ponto3.getHorarios().addElement("17:27");
		ponto3.getHorarios().addElement("17:36");
		ponto3.getHorarios().addElement("17:46");
		ponto3.getHorarios().addElement("17:55");
		ponto3.getHorarios().addElement("18:05");
		ponto3.getHorarios().addElement("18:14");
		ponto3.getHorarios().addElement("18:24");
		ponto3.getHorarios().addElement("18:33");
		ponto3.getHorarios().addElement("18:43");
		ponto3.getHorarios().addElement("18:52");
		ponto3.getHorarios().addElement("19:00");
		ponto3.getHorarios().addElement("19:09");
		ponto3.getHorarios().addElement("19:17");
		ponto3.getHorarios().addElement("19:26");
		ponto3.getHorarios().addElement("19:39");
		ponto3.getHorarios().addElement("19:45");
		ponto3.getHorarios().addElement("20:06");
		ponto3.getHorarios().addElement("20:27");
		ponto3.getHorarios().addElement("20:48");
		ponto3.getHorarios().addElement("21:09");
		ponto3.getHorarios().addElement("21:30");
		ponto3.getHorarios().addElement("21:51");
		ponto3.getHorarios().addElement("22:12");
		ponto3.getHorarios().addElement("22:33");
		ponto3.getHorarios().addElement("22:54");
		ponto3.getHorarios().addElement("23:14");
		ponto3.getHorarios().addElement("23:33");
		ponto3.getHorarios().addElement("23:52");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL V.OFICINAS");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:20");
		ponto4.getHorarios().addElement("05:40");
		ponto4.getHorarios().addElement("05:54");
		ponto4.getHorarios().addElement("06:10");
		ponto4.getHorarios().addElement("06:19");
		ponto4.getHorarios().addElement("06:28");
		ponto4.getHorarios().addElement("06:38");
		ponto4.getHorarios().addElement("06:48");
		ponto4.getHorarios().addElement("06:55");
		ponto4.getHorarios().addElement("07:02");
		ponto4.getHorarios().addElement("07:09");
		ponto4.getHorarios().addElement("07:17");
		ponto4.getHorarios().addElement("07:25");
		ponto4.getHorarios().addElement("07:35");
		ponto4.getHorarios().addElement("07:45");
		ponto4.getHorarios().addElement("07:55");
		ponto4.getHorarios().addElement("08:03");
		ponto4.getHorarios().addElement("08:12");
		ponto4.getHorarios().addElement("08:21");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("08:38");
		ponto4.getHorarios().addElement("08:47");
		ponto4.getHorarios().addElement("09:03");
		ponto4.getHorarios().addElement("09:19");
		ponto4.getHorarios().addElement("09:36");
		ponto4.getHorarios().addElement("09:52");
		ponto4.getHorarios().addElement("10:09");
		ponto4.getHorarios().addElement("10:25");
		ponto4.getHorarios().addElement("10:42");
		ponto4.getHorarios().addElement("10:58");
		ponto4.getHorarios().addElement("11:15");
		ponto4.getHorarios().addElement("11:32");
		ponto4.getHorarios().addElement("11:48");
		ponto4.getHorarios().addElement("12:05");
		ponto4.getHorarios().addElement("12:21");
		ponto4.getHorarios().addElement("12:38");
		ponto4.getHorarios().addElement("12:54");
		ponto4.getHorarios().addElement("13:11");
		ponto4.getHorarios().addElement("13:28");
		ponto4.getHorarios().addElement("13:44");
		ponto4.getHorarios().addElement("14:01");
		ponto4.getHorarios().addElement("14:17");
		ponto4.getHorarios().addElement("14:34");
		ponto4.getHorarios().addElement("14:50");
		ponto4.getHorarios().addElement("15:07");
		ponto4.getHorarios().addElement("15:24");
		ponto4.getHorarios().addElement("15:40");
		ponto4.getHorarios().addElement("15:57");
		ponto4.getHorarios().addElement("16:13");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("16:47");
		ponto4.getHorarios().addElement("17:04");
		ponto4.getHorarios().addElement("17:14");
		ponto4.getHorarios().addElement("17:24");
		ponto4.getHorarios().addElement("17:34");
		ponto4.getHorarios().addElement("17:44");
		ponto4.getHorarios().addElement("17:53");
		ponto4.getHorarios().addElement("18:02");
		ponto4.getHorarios().addElement("18:12");
		ponto4.getHorarios().addElement("18:21");
		ponto4.getHorarios().addElement("18:31");
		ponto4.getHorarios().addElement("18:40");
		ponto4.getHorarios().addElement("18:50");
		ponto4.getHorarios().addElement("18:59");
		ponto4.getHorarios().addElement("19:09");
		ponto4.getHorarios().addElement("19:18");
		ponto4.getHorarios().addElement("19:28");
		ponto4.getHorarios().addElement("19:37");
		ponto4.getHorarios().addElement("19:47");
		ponto4.getHorarios().addElement("19:56");
		ponto4.getHorarios().addElement("20:06");
		ponto4.getHorarios().addElement("20:21");
		ponto4.getHorarios().addElement("20:42");
		ponto4.getHorarios().addElement("21:03");
		ponto4.getHorarios().addElement("21:24");
		ponto4.getHorarios().addElement("21:45");
		ponto4.getHorarios().addElement("22:06");
		ponto4.getHorarios().addElement("22:27");
		ponto4.getHorarios().addElement("22:48");
		ponto4.getHorarios().addElement("23:09");
		ponto4.getHorarios().addElement("23:30");
		ponto4.getHorarios().addElement("23:50");
		ponto4.getHorarios().addElement("00:10");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("CENTRO POLITECNICO");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL FAZENDINHA");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:30");
		ponto6.getHorarios().addElement("05:47");
		ponto6.getHorarios().addElement("06:04");
		ponto6.getHorarios().addElement("06:21");
		ponto6.getHorarios().addElement("06:38");
		ponto6.getHorarios().addElement("06:55");
		ponto6.getHorarios().addElement("07:12");
		ponto6.getHorarios().addElement("07:29");
		ponto6.getHorarios().addElement("07:46");
		ponto6.getHorarios().addElement("08:03");
		ponto6.getHorarios().addElement("08:20");
		ponto6.getHorarios().addElement("08:37");
		ponto6.getHorarios().addElement("08:54");
		ponto6.getHorarios().addElement("09:11");
		ponto6.getHorarios().addElement("09:28");
		ponto6.getHorarios().addElement("09:45");
		ponto6.getHorarios().addElement("10:02");
		ponto6.getHorarios().addElement("10:19");
		ponto6.getHorarios().addElement("10:36");
		ponto6.getHorarios().addElement("10:53");
		ponto6.getHorarios().addElement("11:10");
		ponto6.getHorarios().addElement("11:27");
		ponto6.getHorarios().addElement("11:44");
		ponto6.getHorarios().addElement("12:01");
		ponto6.getHorarios().addElement("12:18");
		ponto6.getHorarios().addElement("12:35");
		ponto6.getHorarios().addElement("12:52");
		ponto6.getHorarios().addElement("13:09");
		ponto6.getHorarios().addElement("13:26");
		ponto6.getHorarios().addElement("13:43");
		ponto6.getHorarios().addElement("14:08");
		ponto6.getHorarios().addElement("14:33");
		ponto6.getHorarios().addElement("14:58");
		ponto6.getHorarios().addElement("15:23");
		ponto6.getHorarios().addElement("15:48");
		ponto6.getHorarios().addElement("16:13");
		ponto6.getHorarios().addElement("16:38");
		ponto6.getHorarios().addElement("17:03");
		ponto6.getHorarios().addElement("17:28");
		ponto6.getHorarios().addElement("17:53");
		ponto6.getHorarios().addElement("18:18");
		ponto6.getHorarios().addElement("18:43");
		ponto6.getHorarios().addElement("19:17");
		ponto6.getHorarios().addElement("19:50");
		ponto6.getHorarios().addElement("20:23");
		ponto6.getHorarios().addElement("20:57");
		ponto6.getHorarios().addElement("21:30");
		ponto6.getHorarios().addElement("22:03");
		ponto6.getHorarios().addElement("22:37");
		ponto6.getHorarios().addElement("23:12");
		ponto6.getHorarios().addElement("23:48");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL PORTAO(SENT.FAZENDIN)");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:18");
		ponto7.getHorarios().addElement("06:40");
		ponto7.getHorarios().addElement("06:58");
		ponto7.getHorarios().addElement("07:15");
		ponto7.getHorarios().addElement("07:32");
		ponto7.getHorarios().addElement("07:49");
		ponto7.getHorarios().addElement("08:06");
		ponto7.getHorarios().addElement("08:23");
		ponto7.getHorarios().addElement("08:40");
		ponto7.getHorarios().addElement("08:57");
		ponto7.getHorarios().addElement("09:14");
		ponto7.getHorarios().addElement("09:31");
		ponto7.getHorarios().addElement("09:48");
		ponto7.getHorarios().addElement("10:05");
		ponto7.getHorarios().addElement("10:22");
		ponto7.getHorarios().addElement("10:39");
		ponto7.getHorarios().addElement("10:56");
		ponto7.getHorarios().addElement("11:13");
		ponto7.getHorarios().addElement("11:30");
		ponto7.getHorarios().addElement("11:47");
		ponto7.getHorarios().addElement("12:04");
		ponto7.getHorarios().addElement("12:21");
		ponto7.getHorarios().addElement("12:38");
		ponto7.getHorarios().addElement("12:55");
		ponto7.getHorarios().addElement("13:12");
		ponto7.getHorarios().addElement("13:29");
		ponto7.getHorarios().addElement("13:48");
		ponto7.getHorarios().addElement("14:08");
		ponto7.getHorarios().addElement("14:26");
		ponto7.getHorarios().addElement("14:44");
		ponto7.getHorarios().addElement("15:09");
		ponto7.getHorarios().addElement("15:34");
		ponto7.getHorarios().addElement("15:59");
		ponto7.getHorarios().addElement("16:24");
		ponto7.getHorarios().addElement("16:49");
		ponto7.getHorarios().addElement("17:14");
		ponto7.getHorarios().addElement("17:39");
		ponto7.getHorarios().addElement("18:04");
		ponto7.getHorarios().addElement("18:29");
		ponto7.getHorarios().addElement("18:57");
		ponto7.getHorarios().addElement("19:25");
		ponto7.getHorarios().addElement("19:45");
		ponto7.getHorarios().addElement("20:10");
		ponto7.getHorarios().addElement("20:43");
		ponto7.getHorarios().addElement("21:16");
		ponto7.getHorarios().addElement("21:49");
		ponto7.getHorarios().addElement("22:23");
		ponto7.getHorarios().addElement("22:56");
		ponto7.getHorarios().addElement("23:29");
		ponto7.getHorarios().addElement("00:03");
		ponto7.getHorarios().addElement("00:36");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL PORTAO(SENT.OFICINAS)");
		ponto8.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto8.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:44");
		ponto8.getHorarios().addElement("06:01");
		ponto8.getHorarios().addElement("06:18");
		ponto8.getHorarios().addElement("06:35");
		ponto8.getHorarios().addElement("06:52");
		ponto8.getHorarios().addElement("07:09");
		ponto8.getHorarios().addElement("07:26");
		ponto8.getHorarios().addElement("07:43");
		ponto8.getHorarios().addElement("08:00");
		ponto8.getHorarios().addElement("08:17");
		ponto8.getHorarios().addElement("08:34");
		ponto8.getHorarios().addElement("08:51");
		ponto8.getHorarios().addElement("09:08");
		ponto8.getHorarios().addElement("09:25");
		ponto8.getHorarios().addElement("09:42");
		ponto8.getHorarios().addElement("09:59");
		ponto8.getHorarios().addElement("10:16");
		ponto8.getHorarios().addElement("10:33");
		ponto8.getHorarios().addElement("10:50");
		ponto8.getHorarios().addElement("11:07");
		ponto8.getHorarios().addElement("11:24");
		ponto8.getHorarios().addElement("11:41");
		ponto8.getHorarios().addElement("11:58");
		ponto8.getHorarios().addElement("12:15");
		ponto8.getHorarios().addElement("12:32");
		ponto8.getHorarios().addElement("12:49");
		ponto8.getHorarios().addElement("13:06");
		ponto8.getHorarios().addElement("13:23");
		ponto8.getHorarios().addElement("13:40");
		ponto8.getHorarios().addElement("13:57");
		ponto8.getHorarios().addElement("14:22");
		ponto8.getHorarios().addElement("14:47");
		ponto8.getHorarios().addElement("15:12");
		ponto8.getHorarios().addElement("15:37");
		ponto8.getHorarios().addElement("16:02");
		ponto8.getHorarios().addElement("16:27");
		ponto8.getHorarios().addElement("16:52");
		ponto8.getHorarios().addElement("17:17");
		ponto8.getHorarios().addElement("17:42");
		ponto8.getHorarios().addElement("18:07");
		ponto8.getHorarios().addElement("18:32");
		ponto8.getHorarios().addElement("18:57");
		ponto8.getHorarios().addElement("19:31");
		ponto8.getHorarios().addElement("20:04");
		ponto8.getHorarios().addElement("20:37");
		ponto8.getHorarios().addElement("21:11");
		ponto8.getHorarios().addElement("21:44");
		ponto8.getHorarios().addElement("22:17");
		ponto8.getHorarios().addElement("22:51");
		ponto8.getHorarios().addElement("23:25");
		ponto8.getHorarios().addElement("00:00");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL V.OFICINAS");
		ponto9.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto9.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("05:40");
		ponto9.getHorarios().addElement("06:02");
		ponto9.getHorarios().addElement("06:21");
		ponto9.getHorarios().addElement("06:38");
		ponto9.getHorarios().addElement("06:55");
		ponto9.getHorarios().addElement("07:12");
		ponto9.getHorarios().addElement("07:29");
		ponto9.getHorarios().addElement("07:46");
		ponto9.getHorarios().addElement("08:03");
		ponto9.getHorarios().addElement("08:20");
		ponto9.getHorarios().addElement("08:37");
		ponto9.getHorarios().addElement("08:54");
		ponto9.getHorarios().addElement("09:11");
		ponto9.getHorarios().addElement("09:28");
		ponto9.getHorarios().addElement("09:45");
		ponto9.getHorarios().addElement("10:02");
		ponto9.getHorarios().addElement("10:19");
		ponto9.getHorarios().addElement("10:36");
		ponto9.getHorarios().addElement("10:53");
		ponto9.getHorarios().addElement("11:10");
		ponto9.getHorarios().addElement("11:27");
		ponto9.getHorarios().addElement("11:44");
		ponto9.getHorarios().addElement("12:01");
		ponto9.getHorarios().addElement("12:18");
		ponto9.getHorarios().addElement("12:35");
		ponto9.getHorarios().addElement("12:52");
		ponto9.getHorarios().addElement("13:09");
		ponto9.getHorarios().addElement("13:26");
		ponto9.getHorarios().addElement("13:43");
		ponto9.getHorarios().addElement("14:08");
		ponto9.getHorarios().addElement("14:33");
		ponto9.getHorarios().addElement("14:58");
		ponto9.getHorarios().addElement("15:23");
		ponto9.getHorarios().addElement("15:48");
		ponto9.getHorarios().addElement("16:13");
		ponto9.getHorarios().addElement("16:38");
		ponto9.getHorarios().addElement("17:03");
		ponto9.getHorarios().addElement("17:28");
		ponto9.getHorarios().addElement("17:53");
		ponto9.getHorarios().addElement("18:18");
		ponto9.getHorarios().addElement("18:43");
		ponto9.getHorarios().addElement("19:08");
		ponto9.getHorarios().addElement("19:33");
		ponto9.getHorarios().addElement("20:07");
		ponto9.getHorarios().addElement("20:40");
		ponto9.getHorarios().addElement("21:13");
		ponto9.getHorarios().addElement("21:47");
		ponto9.getHorarios().addElement("22:20");
		ponto9.getHorarios().addElement("22:53");
		ponto9.getHorarios().addElement("23:27");
		ponto9.getHorarios().addElement("00:04");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("CENTRO POLITECNICO");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("30/09/2012");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:30");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("TERMINAL FAZENDINHA");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("30/09/2012");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("06:00");
		ponto11.getHorarios().addElement("06:35");
		ponto11.getHorarios().addElement("07:10");
		ponto11.getHorarios().addElement("07:45");
		ponto11.getHorarios().addElement("08:20");
		ponto11.getHorarios().addElement("08:55");
		ponto11.getHorarios().addElement("09:30");
		ponto11.getHorarios().addElement("10:05");
		ponto11.getHorarios().addElement("10:40");
		ponto11.getHorarios().addElement("11:15");
		ponto11.getHorarios().addElement("11:50");
		ponto11.getHorarios().addElement("12:25");
		ponto11.getHorarios().addElement("13:00");
		ponto11.getHorarios().addElement("13:35");
		ponto11.getHorarios().addElement("14:10");
		ponto11.getHorarios().addElement("14:45");
		ponto11.getHorarios().addElement("15:20");
		ponto11.getHorarios().addElement("15:55");
		ponto11.getHorarios().addElement("16:30");
		ponto11.getHorarios().addElement("17:05");
		ponto11.getHorarios().addElement("17:40");
		ponto11.getHorarios().addElement("18:15");
		ponto11.getHorarios().addElement("18:50");
		ponto11.getHorarios().addElement("19:25");
		ponto11.getHorarios().addElement("20:00");
		ponto11.getHorarios().addElement("20:35");
		ponto11.getHorarios().addElement("21:10");
		ponto11.getHorarios().addElement("21:45");
		ponto11.getHorarios().addElement("22:24");
		ponto11.getHorarios().addElement("23:04");
		Ponto ponto12 = new Ponto();
		ponto12.setNome("TERMINAL PORTAO(SENT.FAZENDIN)");
		ponto12.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto12.setValidoAPartirDe("30/09/2012");
		onibus.getPontos().addElement(ponto12);
		ponto12.getHorarios().addElement("06:17");
		ponto12.getHorarios().addElement("06:52");
		ponto12.getHorarios().addElement("07:31");
		ponto12.getHorarios().addElement("08:06");
		ponto12.getHorarios().addElement("08:41");
		ponto12.getHorarios().addElement("09:16");
		ponto12.getHorarios().addElement("09:51");
		ponto12.getHorarios().addElement("10:26");
		ponto12.getHorarios().addElement("11:01");
		ponto12.getHorarios().addElement("11:36");
		ponto12.getHorarios().addElement("12:11");
		ponto12.getHorarios().addElement("12:46");
		ponto12.getHorarios().addElement("13:21");
		ponto12.getHorarios().addElement("13:56");
		ponto12.getHorarios().addElement("14:31");
		ponto12.getHorarios().addElement("15:06");
		ponto12.getHorarios().addElement("15:41");
		ponto12.getHorarios().addElement("16:16");
		ponto12.getHorarios().addElement("16:51");
		ponto12.getHorarios().addElement("17:26");
		ponto12.getHorarios().addElement("18:01");
		ponto12.getHorarios().addElement("18:36");
		ponto12.getHorarios().addElement("19:11");
		ponto12.getHorarios().addElement("19:46");
		ponto12.getHorarios().addElement("20:21");
		ponto12.getHorarios().addElement("20:56");
		ponto12.getHorarios().addElement("21:31");
		ponto12.getHorarios().addElement("22:06");
		ponto12.getHorarios().addElement("22:41");
		ponto12.getHorarios().addElement("23:17");
		ponto12.getHorarios().addElement("23:54");
		Ponto ponto13 = new Ponto();
		ponto13.setNome("TERMINAL PORTAO(SENT.OFICINAS)");
		ponto13.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto13.setValidoAPartirDe("30/09/2012");
		onibus.getPontos().addElement(ponto13);
		ponto13.getHorarios().addElement("06:14");
		ponto13.getHorarios().addElement("06:49");
		ponto13.getHorarios().addElement("07:24");
		ponto13.getHorarios().addElement("07:59");
		ponto13.getHorarios().addElement("08:34");
		ponto13.getHorarios().addElement("09:09");
		ponto13.getHorarios().addElement("09:44");
		ponto13.getHorarios().addElement("10:19");
		ponto13.getHorarios().addElement("10:54");
		ponto13.getHorarios().addElement("11:29");
		ponto13.getHorarios().addElement("12:04");
		ponto13.getHorarios().addElement("12:39");
		ponto13.getHorarios().addElement("13:14");
		ponto13.getHorarios().addElement("13:49");
		ponto13.getHorarios().addElement("14:24");
		ponto13.getHorarios().addElement("14:59");
		ponto13.getHorarios().addElement("15:34");
		ponto13.getHorarios().addElement("16:09");
		ponto13.getHorarios().addElement("16:44");
		ponto13.getHorarios().addElement("17:19");
		ponto13.getHorarios().addElement("17:54");
		ponto13.getHorarios().addElement("18:29");
		ponto13.getHorarios().addElement("19:04");
		ponto13.getHorarios().addElement("19:39");
		ponto13.getHorarios().addElement("20:14");
		ponto13.getHorarios().addElement("20:49");
		ponto13.getHorarios().addElement("21:24");
		ponto13.getHorarios().addElement("22:00");
		ponto13.getHorarios().addElement("22:38");
		ponto13.getHorarios().addElement("23:18");
		Ponto ponto14 = new Ponto();
		ponto14.setNome("TERMINAL V.OFICINAS");
		ponto14.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto14.setValidoAPartirDe("30/09/2012");
		onibus.getPontos().addElement(ponto14);
		ponto14.getHorarios().addElement("05:40");
		ponto14.getHorarios().addElement("06:15");
		ponto14.getHorarios().addElement("06:52");
		ponto14.getHorarios().addElement("07:27");
		ponto14.getHorarios().addElement("08:02");
		ponto14.getHorarios().addElement("08:37");
		ponto14.getHorarios().addElement("09:12");
		ponto14.getHorarios().addElement("09:47");
		ponto14.getHorarios().addElement("10:22");
		ponto14.getHorarios().addElement("10:57");
		ponto14.getHorarios().addElement("11:32");
		ponto14.getHorarios().addElement("12:07");
		ponto14.getHorarios().addElement("12:42");
		ponto14.getHorarios().addElement("13:17");
		ponto14.getHorarios().addElement("13:52");
		ponto14.getHorarios().addElement("14:27");
		ponto14.getHorarios().addElement("15:02");
		ponto14.getHorarios().addElement("15:37");
		ponto14.getHorarios().addElement("16:12");
		ponto14.getHorarios().addElement("16:47");
		ponto14.getHorarios().addElement("17:22");
		ponto14.getHorarios().addElement("17:57");
		ponto14.getHorarios().addElement("18:32");
		ponto14.getHorarios().addElement("19:07");
		ponto14.getHorarios().addElement("19:42");
		ponto14.getHorarios().addElement("20:17");
		ponto14.getHorarios().addElement("20:52");
		ponto14.getHorarios().addElement("21:27");
		ponto14.getHorarios().addElement("22:02");
		ponto14.getHorarios().addElement("22:40");
		ponto14.getHorarios().addElement("23:19");
		return onibus;
		}
	}
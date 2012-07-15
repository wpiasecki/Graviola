
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus180 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("ÁGUA VERDE/ ABRANCHES");
		onibus.setCodigo("180");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("AV MARECHAL FLORIANO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:22");
		ponto0.getHorarios().addElement("05:42");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:16");
		ponto0.getHorarios().addElement("06:34");
		ponto0.getHorarios().addElement("06:52");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:46");
		ponto0.getHorarios().addElement("08:04");
		ponto0.getHorarios().addElement("08:22");
		ponto0.getHorarios().addElement("08:40");
		ponto0.getHorarios().addElement("08:58");
		ponto0.getHorarios().addElement("09:20");
		ponto0.getHorarios().addElement("09:46");
		ponto0.getHorarios().addElement("10:08");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("10:52");
		ponto0.getHorarios().addElement("11:14");
		ponto0.getHorarios().addElement("11:39");
		ponto0.getHorarios().addElement("12:04");
		ponto0.getHorarios().addElement("12:29");
		ponto0.getHorarios().addElement("12:54");
		ponto0.getHorarios().addElement("13:19");
		ponto0.getHorarios().addElement("13:44");
		ponto0.getHorarios().addElement("14:09");
		ponto0.getHorarios().addElement("14:34");
		ponto0.getHorarios().addElement("14:59");
		ponto0.getHorarios().addElement("15:24");
		ponto0.getHorarios().addElement("15:49");
		ponto0.getHorarios().addElement("16:15");
		ponto0.getHorarios().addElement("16:40");
		ponto0.getHorarios().addElement("17:04");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:46");
		ponto0.getHorarios().addElement("18:06");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("19:12");
		ponto0.getHorarios().addElement("19:48");
		ponto0.getHorarios().addElement("20:22");
		ponto0.getHorarios().addElement("20:50");
		ponto0.getHorarios().addElement("21:18");
		ponto0.getHorarios().addElement("21:46");
		ponto0.getHorarios().addElement("22:14");
		ponto0.getHorarios().addElement("22:42");
		ponto0.getHorarios().addElement("23:10");
		ponto0.getHorarios().addElement("23:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO ABRANCHES");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:04");
		ponto1.getHorarios().addElement("06:21");
		ponto1.getHorarios().addElement("06:39");
		ponto1.getHorarios().addElement("06:57");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("07:33");
		ponto1.getHorarios().addElement("07:51");
		ponto1.getHorarios().addElement("08:09");
		ponto1.getHorarios().addElement("08:27");
		ponto1.getHorarios().addElement("08:44");
		ponto1.getHorarios().addElement("09:02");
		ponto1.getHorarios().addElement("09:21");
		ponto1.getHorarios().addElement("09:45");
		ponto1.getHorarios().addElement("10:08");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("10:52");
		ponto1.getHorarios().addElement("11:15");
		ponto1.getHorarios().addElement("11:38");
		ponto1.getHorarios().addElement("12:03");
		ponto1.getHorarios().addElement("12:28");
		ponto1.getHorarios().addElement("12:53");
		ponto1.getHorarios().addElement("13:18");
		ponto1.getHorarios().addElement("13:43");
		ponto1.getHorarios().addElement("14:08");
		ponto1.getHorarios().addElement("14:33");
		ponto1.getHorarios().addElement("14:58");
		ponto1.getHorarios().addElement("15:23");
		ponto1.getHorarios().addElement("15:48");
		ponto1.getHorarios().addElement("16:13");
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:28");
		ponto1.getHorarios().addElement("17:52");
		ponto1.getHorarios().addElement("18:12");
		ponto1.getHorarios().addElement("18:32");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("19:13");
		ponto1.getHorarios().addElement("19:36");
		ponto1.getHorarios().addElement("20:10");
		ponto1.getHorarios().addElement("20:44");
		ponto1.getHorarios().addElement("21:12");
		ponto1.getHorarios().addElement("21:40");
		ponto1.getHorarios().addElement("22:08");
		ponto1.getHorarios().addElement("22:36");
		ponto1.getHorarios().addElement("23:04");
		ponto1.getHorarios().addElement("23:32");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO AGUA VERDE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:20");
		ponto2.getHorarios().addElement("05:40");
		ponto2.getHorarios().addElement("05:56");
		ponto2.getHorarios().addElement("06:12");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("06:48");
		ponto2.getHorarios().addElement("07:06");
		ponto2.getHorarios().addElement("07:24");
		ponto2.getHorarios().addElement("07:42");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:18");
		ponto2.getHorarios().addElement("08:36");
		ponto2.getHorarios().addElement("08:56");
		ponto2.getHorarios().addElement("09:26");
		ponto2.getHorarios().addElement("09:46");
		ponto2.getHorarios().addElement("10:08");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("10:52");
		ponto2.getHorarios().addElement("11:14");
		ponto2.getHorarios().addElement("11:39");
		ponto2.getHorarios().addElement("12:04");
		ponto2.getHorarios().addElement("12:29");
		ponto2.getHorarios().addElement("12:54");
		ponto2.getHorarios().addElement("13:19");
		ponto2.getHorarios().addElement("13:44");
		ponto2.getHorarios().addElement("14:09");
		ponto2.getHorarios().addElement("14:34");
		ponto2.getHorarios().addElement("14:59");
		ponto2.getHorarios().addElement("15:24");
		ponto2.getHorarios().addElement("15:49");
		ponto2.getHorarios().addElement("16:14");
		ponto2.getHorarios().addElement("16:39");
		ponto2.getHorarios().addElement("17:04");
		ponto2.getHorarios().addElement("17:22");
		ponto2.getHorarios().addElement("17:42");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:21");
		ponto2.getHorarios().addElement("18:48");
		ponto2.getHorarios().addElement("19:25");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("20:58");
		ponto2.getHorarios().addElement("21:26");
		ponto2.getHorarios().addElement("21:54");
		ponto2.getHorarios().addElement("22:22");
		ponto2.getHorarios().addElement("22:50");
		ponto2.getHorarios().addElement("23:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("RUI BARBOSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:08");
		ponto3.getHorarios().addElement("06:26");
		ponto3.getHorarios().addElement("06:44");
		ponto3.getHorarios().addElement("07:02");
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("07:38");
		ponto3.getHorarios().addElement("07:56");
		ponto3.getHorarios().addElement("08:14");
		ponto3.getHorarios().addElement("08:32");
		ponto3.getHorarios().addElement("08:50");
		ponto3.getHorarios().addElement("09:06");
		ponto3.getHorarios().addElement("09:26");
		ponto3.getHorarios().addElement("09:46");
		ponto3.getHorarios().addElement("10:10");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("10:52");
		ponto3.getHorarios().addElement("11:14");
		ponto3.getHorarios().addElement("11:39");
		ponto3.getHorarios().addElement("12:04");
		ponto3.getHorarios().addElement("12:29");
		ponto3.getHorarios().addElement("12:54");
		ponto3.getHorarios().addElement("13:19");
		ponto3.getHorarios().addElement("13:44");
		ponto3.getHorarios().addElement("14:09");
		ponto3.getHorarios().addElement("14:34");
		ponto3.getHorarios().addElement("14:59");
		ponto3.getHorarios().addElement("15:24");
		ponto3.getHorarios().addElement("15:49");
		ponto3.getHorarios().addElement("16:14");
		ponto3.getHorarios().addElement("16:38");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("17:15");
		ponto3.getHorarios().addElement("17:35");
		ponto3.getHorarios().addElement("17:55");
		ponto3.getHorarios().addElement("18:18");
		ponto3.getHorarios().addElement("18:38");
		ponto3.getHorarios().addElement("18:58");
		ponto3.getHorarios().addElement("19:18");
		ponto3.getHorarios().addElement("19:40");
		ponto3.getHorarios().addElement("20:02");
		ponto3.getHorarios().addElement("20:34");
		ponto3.getHorarios().addElement("21:06");
		ponto3.getHorarios().addElement("21:34");
		ponto3.getHorarios().addElement("22:02");
		ponto3.getHorarios().addElement("22:30");
		ponto3.getHorarios().addElement("22:58");
		ponto3.getHorarios().addElement("23:30");
		ponto3.getHorarios().addElement("00:00");
		ponto3.getHorarios().addElement("00:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("AV MARECHAL FLORIANO");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:40");
		ponto4.getHorarios().addElement("06:07");
		ponto4.getHorarios().addElement("06:34");
		ponto4.getHorarios().addElement("07:01");
		ponto4.getHorarios().addElement("07:27");
		ponto4.getHorarios().addElement("07:54");
		ponto4.getHorarios().addElement("08:21");
		ponto4.getHorarios().addElement("08:47");
		ponto4.getHorarios().addElement("09:14");
		ponto4.getHorarios().addElement("09:41");
		ponto4.getHorarios().addElement("10:07");
		ponto4.getHorarios().addElement("10:34");
		ponto4.getHorarios().addElement("11:01");
		ponto4.getHorarios().addElement("11:27");
		ponto4.getHorarios().addElement("11:54");
		ponto4.getHorarios().addElement("12:21");
		ponto4.getHorarios().addElement("12:47");
		ponto4.getHorarios().addElement("13:14");
		ponto4.getHorarios().addElement("13:41");
		ponto4.getHorarios().addElement("14:07");
		ponto4.getHorarios().addElement("14:34");
		ponto4.getHorarios().addElement("15:01");
		ponto4.getHorarios().addElement("15:27");
		ponto4.getHorarios().addElement("15:54");
		ponto4.getHorarios().addElement("16:21");
		ponto4.getHorarios().addElement("16:47");
		ponto4.getHorarios().addElement("17:14");
		ponto4.getHorarios().addElement("17:41");
		ponto4.getHorarios().addElement("18:07");
		ponto4.getHorarios().addElement("18:34");
		ponto4.getHorarios().addElement("19:01");
		ponto4.getHorarios().addElement("19:26");
		ponto4.getHorarios().addElement("19:57");
		ponto4.getHorarios().addElement("20:42");
		ponto4.getHorarios().addElement("21:20");
		ponto4.getHorarios().addElement("22:00");
		ponto4.getHorarios().addElement("22:40");
		ponto4.getHorarios().addElement("23:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("BAIRRO ABRANCHES");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:01");
		ponto5.getHorarios().addElement("06:27");
		ponto5.getHorarios().addElement("06:54");
		ponto5.getHorarios().addElement("07:21");
		ponto5.getHorarios().addElement("07:47");
		ponto5.getHorarios().addElement("08:14");
		ponto5.getHorarios().addElement("08:41");
		ponto5.getHorarios().addElement("09:07");
		ponto5.getHorarios().addElement("09:34");
		ponto5.getHorarios().addElement("10:01");
		ponto5.getHorarios().addElement("10:27");
		ponto5.getHorarios().addElement("10:54");
		ponto5.getHorarios().addElement("11:21");
		ponto5.getHorarios().addElement("11:47");
		ponto5.getHorarios().addElement("12:14");
		ponto5.getHorarios().addElement("12:41");
		ponto5.getHorarios().addElement("13:07");
		ponto5.getHorarios().addElement("13:34");
		ponto5.getHorarios().addElement("14:01");
		ponto5.getHorarios().addElement("14:27");
		ponto5.getHorarios().addElement("14:54");
		ponto5.getHorarios().addElement("15:21");
		ponto5.getHorarios().addElement("15:47");
		ponto5.getHorarios().addElement("16:14");
		ponto5.getHorarios().addElement("16:41");
		ponto5.getHorarios().addElement("17:07");
		ponto5.getHorarios().addElement("17:34");
		ponto5.getHorarios().addElement("18:01");
		ponto5.getHorarios().addElement("18:27");
		ponto5.getHorarios().addElement("18:54");
		ponto5.getHorarios().addElement("19:21");
		ponto5.getHorarios().addElement("19:45");
		ponto5.getHorarios().addElement("20:20");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("21:40");
		ponto5.getHorarios().addElement("22:20");
		ponto5.getHorarios().addElement("23:00");
		ponto5.getHorarios().addElement("23:40");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO AGUA VERDE");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:20");
		ponto6.getHorarios().addElement("05:47");
		ponto6.getHorarios().addElement("06:14");
		ponto6.getHorarios().addElement("06:41");
		ponto6.getHorarios().addElement("07:07");
		ponto6.getHorarios().addElement("07:34");
		ponto6.getHorarios().addElement("08:01");
		ponto6.getHorarios().addElement("08:27");
		ponto6.getHorarios().addElement("08:54");
		ponto6.getHorarios().addElement("09:21");
		ponto6.getHorarios().addElement("09:47");
		ponto6.getHorarios().addElement("10:14");
		ponto6.getHorarios().addElement("10:41");
		ponto6.getHorarios().addElement("11:07");
		ponto6.getHorarios().addElement("11:34");
		ponto6.getHorarios().addElement("12:01");
		ponto6.getHorarios().addElement("12:27");
		ponto6.getHorarios().addElement("12:54");
		ponto6.getHorarios().addElement("13:21");
		ponto6.getHorarios().addElement("13:47");
		ponto6.getHorarios().addElement("14:14");
		ponto6.getHorarios().addElement("14:41");
		ponto6.getHorarios().addElement("15:07");
		ponto6.getHorarios().addElement("15:34");
		ponto6.getHorarios().addElement("16:01");
		ponto6.getHorarios().addElement("16:27");
		ponto6.getHorarios().addElement("16:54");
		ponto6.getHorarios().addElement("17:21");
		ponto6.getHorarios().addElement("17:47");
		ponto6.getHorarios().addElement("18:14");
		ponto6.getHorarios().addElement("18:41");
		ponto6.getHorarios().addElement("19:07");
		ponto6.getHorarios().addElement("19:34");
		ponto6.getHorarios().addElement("20:23");
		ponto6.getHorarios().addElement("21:00");
		ponto6.getHorarios().addElement("21:40");
		ponto6.getHorarios().addElement("22:20");
		ponto6.getHorarios().addElement("23:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("RUI BARBOSA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:21");
		ponto7.getHorarios().addElement("06:47");
		ponto7.getHorarios().addElement("07:14");
		ponto7.getHorarios().addElement("07:41");
		ponto7.getHorarios().addElement("08:07");
		ponto7.getHorarios().addElement("08:34");
		ponto7.getHorarios().addElement("09:01");
		ponto7.getHorarios().addElement("09:27");
		ponto7.getHorarios().addElement("09:54");
		ponto7.getHorarios().addElement("10:21");
		ponto7.getHorarios().addElement("10:47");
		ponto7.getHorarios().addElement("11:14");
		ponto7.getHorarios().addElement("11:41");
		ponto7.getHorarios().addElement("12:07");
		ponto7.getHorarios().addElement("12:34");
		ponto7.getHorarios().addElement("13:01");
		ponto7.getHorarios().addElement("13:27");
		ponto7.getHorarios().addElement("13:54");
		ponto7.getHorarios().addElement("14:21");
		ponto7.getHorarios().addElement("14:47");
		ponto7.getHorarios().addElement("15:14");
		ponto7.getHorarios().addElement("15:41");
		ponto7.getHorarios().addElement("16:07");
		ponto7.getHorarios().addElement("16:34");
		ponto7.getHorarios().addElement("17:01");
		ponto7.getHorarios().addElement("17:27");
		ponto7.getHorarios().addElement("17:54");
		ponto7.getHorarios().addElement("18:21");
		ponto7.getHorarios().addElement("18:47");
		ponto7.getHorarios().addElement("19:14");
		ponto7.getHorarios().addElement("19:41");
		ponto7.getHorarios().addElement("20:04");
		ponto7.getHorarios().addElement("20:40");
		ponto7.getHorarios().addElement("21:20");
		ponto7.getHorarios().addElement("22:00");
		ponto7.getHorarios().addElement("22:40");
		ponto7.getHorarios().addElement("23:20");
		ponto7.getHorarios().addElement("00:00");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("AV MARECHAL FLORIANO");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:50");
		ponto8.getHorarios().addElement("06:30");
		ponto8.getHorarios().addElement("07:10");
		ponto8.getHorarios().addElement("07:50");
		ponto8.getHorarios().addElement("08:30");
		ponto8.getHorarios().addElement("09:10");
		ponto8.getHorarios().addElement("09:50");
		ponto8.getHorarios().addElement("10:30");
		ponto8.getHorarios().addElement("11:10");
		ponto8.getHorarios().addElement("11:50");
		ponto8.getHorarios().addElement("12:30");
		ponto8.getHorarios().addElement("13:10");
		ponto8.getHorarios().addElement("13:50");
		ponto8.getHorarios().addElement("14:30");
		ponto8.getHorarios().addElement("15:10");
		ponto8.getHorarios().addElement("15:50");
		ponto8.getHorarios().addElement("16:30");
		ponto8.getHorarios().addElement("17:10");
		ponto8.getHorarios().addElement("17:50");
		ponto8.getHorarios().addElement("18:30");
		ponto8.getHorarios().addElement("19:10");
		ponto8.getHorarios().addElement("19:50");
		ponto8.getHorarios().addElement("20:30");
		ponto8.getHorarios().addElement("21:10");
		ponto8.getHorarios().addElement("21:50");
		ponto8.getHorarios().addElement("22:30");
		ponto8.getHorarios().addElement("23:10");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("BAIRRO ABRANCHES");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("06:10");
		ponto9.getHorarios().addElement("06:50");
		ponto9.getHorarios().addElement("07:30");
		ponto9.getHorarios().addElement("08:10");
		ponto9.getHorarios().addElement("08:50");
		ponto9.getHorarios().addElement("09:30");
		ponto9.getHorarios().addElement("10:10");
		ponto9.getHorarios().addElement("10:50");
		ponto9.getHorarios().addElement("11:30");
		ponto9.getHorarios().addElement("12:10");
		ponto9.getHorarios().addElement("12:50");
		ponto9.getHorarios().addElement("13:30");
		ponto9.getHorarios().addElement("14:10");
		ponto9.getHorarios().addElement("14:50");
		ponto9.getHorarios().addElement("15:30");
		ponto9.getHorarios().addElement("16:10");
		ponto9.getHorarios().addElement("16:50");
		ponto9.getHorarios().addElement("17:30");
		ponto9.getHorarios().addElement("18:10");
		ponto9.getHorarios().addElement("18:50");
		ponto9.getHorarios().addElement("19:30");
		ponto9.getHorarios().addElement("20:10");
		ponto9.getHorarios().addElement("20:50");
		ponto9.getHorarios().addElement("21:30");
		ponto9.getHorarios().addElement("22:10");
		ponto9.getHorarios().addElement("22:50");
		ponto9.getHorarios().addElement("23:30");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("BAIRRO AGUA VERDE");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:30");
		ponto10.getHorarios().addElement("06:10");
		ponto10.getHorarios().addElement("06:50");
		ponto10.getHorarios().addElement("07:30");
		ponto10.getHorarios().addElement("08:10");
		ponto10.getHorarios().addElement("08:50");
		ponto10.getHorarios().addElement("09:30");
		ponto10.getHorarios().addElement("10:10");
		ponto10.getHorarios().addElement("10:50");
		ponto10.getHorarios().addElement("11:30");
		ponto10.getHorarios().addElement("12:10");
		ponto10.getHorarios().addElement("12:50");
		ponto10.getHorarios().addElement("13:30");
		ponto10.getHorarios().addElement("14:10");
		ponto10.getHorarios().addElement("14:50");
		ponto10.getHorarios().addElement("15:30");
		ponto10.getHorarios().addElement("16:10");
		ponto10.getHorarios().addElement("16:50");
		ponto10.getHorarios().addElement("17:30");
		ponto10.getHorarios().addElement("18:10");
		ponto10.getHorarios().addElement("18:50");
		ponto10.getHorarios().addElement("19:30");
		ponto10.getHorarios().addElement("20:10");
		ponto10.getHorarios().addElement("20:50");
		ponto10.getHorarios().addElement("21:30");
		ponto10.getHorarios().addElement("22:10");
		ponto10.getHorarios().addElement("22:50");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("RUI BARBOSA");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("06:30");
		ponto11.getHorarios().addElement("07:10");
		ponto11.getHorarios().addElement("07:50");
		ponto11.getHorarios().addElement("08:30");
		ponto11.getHorarios().addElement("09:10");
		ponto11.getHorarios().addElement("09:50");
		ponto11.getHorarios().addElement("10:30");
		ponto11.getHorarios().addElement("11:10");
		ponto11.getHorarios().addElement("11:50");
		ponto11.getHorarios().addElement("12:30");
		ponto11.getHorarios().addElement("13:10");
		ponto11.getHorarios().addElement("13:50");
		ponto11.getHorarios().addElement("14:30");
		ponto11.getHorarios().addElement("15:10");
		ponto11.getHorarios().addElement("15:50");
		ponto11.getHorarios().addElement("16:30");
		ponto11.getHorarios().addElement("17:10");
		ponto11.getHorarios().addElement("17:50");
		ponto11.getHorarios().addElement("18:30");
		ponto11.getHorarios().addElement("19:10");
		ponto11.getHorarios().addElement("19:50");
		ponto11.getHorarios().addElement("20:30");
		ponto11.getHorarios().addElement("21:10");
		ponto11.getHorarios().addElement("21:50");
		ponto11.getHorarios().addElement("22:30");
		ponto11.getHorarios().addElement("23:10");
		ponto11.getHorarios().addElement("23:50");
		return onibus;
		}
	}
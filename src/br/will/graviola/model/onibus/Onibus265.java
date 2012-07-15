
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus265 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("AHÚ / LOS ANGELES");
		onibus.setCodigo("265");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("AV MARECHAL FLORIANO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:41");
		ponto0.getHorarios().addElement("06:02");
		ponto0.getHorarios().addElement("06:24");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:06");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:49");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("08:31");
		ponto0.getHorarios().addElement("08:53");
		ponto0.getHorarios().addElement("09:14");
		ponto0.getHorarios().addElement("09:35");
		ponto0.getHorarios().addElement("09:56");
		ponto0.getHorarios().addElement("10:18");
		ponto0.getHorarios().addElement("10:39");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:21");
		ponto0.getHorarios().addElement("11:38");
		ponto0.getHorarios().addElement("11:57");
		ponto0.getHorarios().addElement("12:14");
		ponto0.getHorarios().addElement("12:31");
		ponto0.getHorarios().addElement("12:51");
		ponto0.getHorarios().addElement("13:12");
		ponto0.getHorarios().addElement("13:33");
		ponto0.getHorarios().addElement("13:58");
		ponto0.getHorarios().addElement("14:23");
		ponto0.getHorarios().addElement("14:48");
		ponto0.getHorarios().addElement("15:13");
		ponto0.getHorarios().addElement("15:37");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("16:24");
		ponto0.getHorarios().addElement("16:47");
		ponto0.getHorarios().addElement("17:11");
		ponto0.getHorarios().addElement("17:34");
		ponto0.getHorarios().addElement("17:53");
		ponto0.getHorarios().addElement("18:12");
		ponto0.getHorarios().addElement("18:31");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:08");
		ponto0.getHorarios().addElement("19:26");
		ponto0.getHorarios().addElement("19:44");
		ponto0.getHorarios().addElement("20:04");
		ponto0.getHorarios().addElement("20:32");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:28");
		ponto0.getHorarios().addElement("21:56");
		ponto0.getHorarios().addElement("22:23");
		ponto0.getHorarios().addElement("22:50");
		ponto0.getHorarios().addElement("23:16");
		ponto0.getHorarios().addElement("23:41");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO AHU");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:05");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("07:07");
		ponto1.getHorarios().addElement("07:28");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:11");
		ponto1.getHorarios().addElement("08:32");
		ponto1.getHorarios().addElement("08:53");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("09:36");
		ponto1.getHorarios().addElement("09:57");
		ponto1.getHorarios().addElement("10:18");
		ponto1.getHorarios().addElement("10:40");
		ponto1.getHorarios().addElement("11:01");
		ponto1.getHorarios().addElement("11:22");
		ponto1.getHorarios().addElement("11:43");
		ponto1.getHorarios().addElement("12:03");
		ponto1.getHorarios().addElement("12:22");
		ponto1.getHorarios().addElement("12:39");
		ponto1.getHorarios().addElement("12:56");
		ponto1.getHorarios().addElement("13:17");
		ponto1.getHorarios().addElement("13:38");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:23");
		ponto1.getHorarios().addElement("14:48");
		ponto1.getHorarios().addElement("15:13");
		ponto1.getHorarios().addElement("15:38");
		ponto1.getHorarios().addElement("16:02");
		ponto1.getHorarios().addElement("16:25");
		ponto1.getHorarios().addElement("16:49");
		ponto1.getHorarios().addElement("17:12");
		ponto1.getHorarios().addElement("17:36");
		ponto1.getHorarios().addElement("17:59");
		ponto1.getHorarios().addElement("18:18");
		ponto1.getHorarios().addElement("18:37");
		ponto1.getHorarios().addElement("18:56");
		ponto1.getHorarios().addElement("19:15");
		ponto1.getHorarios().addElement("19:35");
		ponto1.getHorarios().addElement("19:58");
		ponto1.getHorarios().addElement("20:26");
		ponto1.getHorarios().addElement("20:54");
		ponto1.getHorarios().addElement("21:22");
		ponto1.getHorarios().addElement("21:51");
		ponto1.getHorarios().addElement("22:21");
		ponto1.getHorarios().addElement("22:44");
		ponto1.getHorarios().addElement("23:10");
		ponto1.getHorarios().addElement("23:36");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO LOS ANGELES");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:20");
		ponto2.getHorarios().addElement("05:41");
		ponto2.getHorarios().addElement("06:03");
		ponto2.getHorarios().addElement("06:24");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:07");
		ponto2.getHorarios().addElement("07:28");
		ponto2.getHorarios().addElement("07:49");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:32");
		ponto2.getHorarios().addElement("08:53");
		ponto2.getHorarios().addElement("09:14");
		ponto2.getHorarios().addElement("09:35");
		ponto2.getHorarios().addElement("09:57");
		ponto2.getHorarios().addElement("10:18");
		ponto2.getHorarios().addElement("10:39");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:17");
		ponto2.getHorarios().addElement("11:34");
		ponto2.getHorarios().addElement("11:51");
		ponto2.getHorarios().addElement("12:08");
		ponto2.getHorarios().addElement("12:29");
		ponto2.getHorarios().addElement("12:50");
		ponto2.getHorarios().addElement("13:14");
		ponto2.getHorarios().addElement("13:38");
		ponto2.getHorarios().addElement("14:02");
		ponto2.getHorarios().addElement("14:26");
		ponto2.getHorarios().addElement("14:50");
		ponto2.getHorarios().addElement("15:14");
		ponto2.getHorarios().addElement("15:37");
		ponto2.getHorarios().addElement("16:01");
		ponto2.getHorarios().addElement("16:24");
		ponto2.getHorarios().addElement("16:48");
		ponto2.getHorarios().addElement("17:11");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("17:49");
		ponto2.getHorarios().addElement("18:08");
		ponto2.getHorarios().addElement("18:27");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:04");
		ponto2.getHorarios().addElement("19:24");
		ponto2.getHorarios().addElement("19:44");
		ponto2.getHorarios().addElement("20:12");
		ponto2.getHorarios().addElement("20:40");
		ponto2.getHorarios().addElement("21:08");
		ponto2.getHorarios().addElement("21:36");
		ponto2.getHorarios().addElement("22:04");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("22:58");
		ponto2.getHorarios().addElement("23:22");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("RUI BARBOSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("08:12");
		ponto3.getHorarios().addElement("08:33");
		ponto3.getHorarios().addElement("08:54");
		ponto3.getHorarios().addElement("09:15");
		ponto3.getHorarios().addElement("09:37");
		ponto3.getHorarios().addElement("09:58");
		ponto3.getHorarios().addElement("10:19");
		ponto3.getHorarios().addElement("10:40");
		ponto3.getHorarios().addElement("11:10");
		ponto3.getHorarios().addElement("11:29");
		ponto3.getHorarios().addElement("11:47");
		ponto3.getHorarios().addElement("12:07");
		ponto3.getHorarios().addElement("12:27");
		ponto3.getHorarios().addElement("12:46");
		ponto3.getHorarios().addElement("13:03");
		ponto3.getHorarios().addElement("13:20");
		ponto3.getHorarios().addElement("13:41");
		ponto3.getHorarios().addElement("14:03");
		ponto3.getHorarios().addElement("14:27");
		ponto3.getHorarios().addElement("14:51");
		ponto3.getHorarios().addElement("15:15");
		ponto3.getHorarios().addElement("15:38");
		ponto3.getHorarios().addElement("16:02");
		ponto3.getHorarios().addElement("16:26");
		ponto3.getHorarios().addElement("16:49");
		ponto3.getHorarios().addElement("17:21");
		ponto3.getHorarios().addElement("17:41");
		ponto3.getHorarios().addElement("18:03");
		ponto3.getHorarios().addElement("18:23");
		ponto3.getHorarios().addElement("18:42");
		ponto3.getHorarios().addElement("19:01");
		ponto3.getHorarios().addElement("19:20");
		ponto3.getHorarios().addElement("19:39");
		ponto3.getHorarios().addElement("19:58");
		ponto3.getHorarios().addElement("20:20");
		ponto3.getHorarios().addElement("20:48");
		ponto3.getHorarios().addElement("21:16");
		ponto3.getHorarios().addElement("21:44");
		ponto3.getHorarios().addElement("22:12");
		ponto3.getHorarios().addElement("22:40");
		ponto3.getHorarios().addElement("23:04");
		ponto3.getHorarios().addElement("23:30");
		ponto3.getHorarios().addElement("23:55");
		ponto3.getHorarios().addElement("00:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("AV MARECHAL FLORIANO");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:45");
		ponto4.getHorarios().addElement("06:25");
		ponto4.getHorarios().addElement("07:05");
		ponto4.getHorarios().addElement("07:45");
		ponto4.getHorarios().addElement("08:25");
		ponto4.getHorarios().addElement("09:05");
		ponto4.getHorarios().addElement("09:45");
		ponto4.getHorarios().addElement("10:25");
		ponto4.getHorarios().addElement("11:05");
		ponto4.getHorarios().addElement("11:45");
		ponto4.getHorarios().addElement("12:25");
		ponto4.getHorarios().addElement("13:05");
		ponto4.getHorarios().addElement("13:45");
		ponto4.getHorarios().addElement("14:25");
		ponto4.getHorarios().addElement("15:05");
		ponto4.getHorarios().addElement("15:45");
		ponto4.getHorarios().addElement("16:25");
		ponto4.getHorarios().addElement("17:05");
		ponto4.getHorarios().addElement("17:45");
		ponto4.getHorarios().addElement("18:25");
		ponto4.getHorarios().addElement("19:05");
		ponto4.getHorarios().addElement("19:45");
		ponto4.getHorarios().addElement("20:25");
		ponto4.getHorarios().addElement("21:05");
		ponto4.getHorarios().addElement("21:45");
		ponto4.getHorarios().addElement("22:25");
		ponto4.getHorarios().addElement("23:05");
		ponto4.getHorarios().addElement("23:45");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("BAIRRO AHU");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:05");
		ponto5.getHorarios().addElement("06:45");
		ponto5.getHorarios().addElement("07:25");
		ponto5.getHorarios().addElement("08:05");
		ponto5.getHorarios().addElement("08:45");
		ponto5.getHorarios().addElement("09:25");
		ponto5.getHorarios().addElement("10:05");
		ponto5.getHorarios().addElement("10:45");
		ponto5.getHorarios().addElement("11:25");
		ponto5.getHorarios().addElement("12:05");
		ponto5.getHorarios().addElement("12:45");
		ponto5.getHorarios().addElement("13:25");
		ponto5.getHorarios().addElement("14:05");
		ponto5.getHorarios().addElement("14:45");
		ponto5.getHorarios().addElement("15:25");
		ponto5.getHorarios().addElement("16:05");
		ponto5.getHorarios().addElement("16:45");
		ponto5.getHorarios().addElement("17:25");
		ponto5.getHorarios().addElement("18:05");
		ponto5.getHorarios().addElement("18:45");
		ponto5.getHorarios().addElement("19:25");
		ponto5.getHorarios().addElement("20:05");
		ponto5.getHorarios().addElement("20:45");
		ponto5.getHorarios().addElement("21:25");
		ponto5.getHorarios().addElement("22:05");
		ponto5.getHorarios().addElement("22:45");
		ponto5.getHorarios().addElement("23:25");
		ponto5.getHorarios().addElement("00:05");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO LOS ANGELES");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:25");
		ponto6.getHorarios().addElement("06:05");
		ponto6.getHorarios().addElement("06:45");
		ponto6.getHorarios().addElement("07:25");
		ponto6.getHorarios().addElement("08:05");
		ponto6.getHorarios().addElement("08:45");
		ponto6.getHorarios().addElement("09:25");
		ponto6.getHorarios().addElement("10:05");
		ponto6.getHorarios().addElement("10:45");
		ponto6.getHorarios().addElement("11:25");
		ponto6.getHorarios().addElement("12:05");
		ponto6.getHorarios().addElement("12:45");
		ponto6.getHorarios().addElement("13:25");
		ponto6.getHorarios().addElement("14:05");
		ponto6.getHorarios().addElement("14:45");
		ponto6.getHorarios().addElement("15:25");
		ponto6.getHorarios().addElement("16:05");
		ponto6.getHorarios().addElement("16:45");
		ponto6.getHorarios().addElement("17:25");
		ponto6.getHorarios().addElement("18:05");
		ponto6.getHorarios().addElement("18:45");
		ponto6.getHorarios().addElement("19:25");
		ponto6.getHorarios().addElement("20:05");
		ponto6.getHorarios().addElement("20:45");
		ponto6.getHorarios().addElement("21:25");
		ponto6.getHorarios().addElement("22:05");
		ponto6.getHorarios().addElement("22:45");
		ponto6.getHorarios().addElement("23:25");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("RUI BARBOSA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("26/07/2008");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:27");
		ponto7.getHorarios().addElement("07:07");
		ponto7.getHorarios().addElement("07:47");
		ponto7.getHorarios().addElement("08:27");
		ponto7.getHorarios().addElement("09:07");
		ponto7.getHorarios().addElement("09:47");
		ponto7.getHorarios().addElement("10:27");
		ponto7.getHorarios().addElement("11:07");
		ponto7.getHorarios().addElement("11:47");
		ponto7.getHorarios().addElement("12:27");
		ponto7.getHorarios().addElement("13:07");
		ponto7.getHorarios().addElement("13:47");
		ponto7.getHorarios().addElement("14:27");
		ponto7.getHorarios().addElement("15:07");
		ponto7.getHorarios().addElement("15:47");
		ponto7.getHorarios().addElement("16:27");
		ponto7.getHorarios().addElement("17:07");
		ponto7.getHorarios().addElement("17:47");
		ponto7.getHorarios().addElement("18:27");
		ponto7.getHorarios().addElement("19:07");
		ponto7.getHorarios().addElement("19:47");
		ponto7.getHorarios().addElement("20:27");
		ponto7.getHorarios().addElement("21:07");
		ponto7.getHorarios().addElement("21:47");
		ponto7.getHorarios().addElement("22:27");
		ponto7.getHorarios().addElement("23:07");
		ponto7.getHorarios().addElement("23:47");
		ponto7.getHorarios().addElement("00:27");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("AV MARECHAL FLORIANO");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:45");
		ponto8.getHorarios().addElement("06:25");
		ponto8.getHorarios().addElement("07:05");
		ponto8.getHorarios().addElement("07:45");
		ponto8.getHorarios().addElement("08:25");
		ponto8.getHorarios().addElement("09:05");
		ponto8.getHorarios().addElement("09:45");
		ponto8.getHorarios().addElement("10:25");
		ponto8.getHorarios().addElement("11:05");
		ponto8.getHorarios().addElement("11:45");
		ponto8.getHorarios().addElement("12:25");
		ponto8.getHorarios().addElement("13:05");
		ponto8.getHorarios().addElement("13:45");
		ponto8.getHorarios().addElement("14:25");
		ponto8.getHorarios().addElement("15:05");
		ponto8.getHorarios().addElement("15:45");
		ponto8.getHorarios().addElement("16:25");
		ponto8.getHorarios().addElement("17:05");
		ponto8.getHorarios().addElement("17:45");
		ponto8.getHorarios().addElement("18:25");
		ponto8.getHorarios().addElement("19:05");
		ponto8.getHorarios().addElement("19:45");
		ponto8.getHorarios().addElement("20:25");
		ponto8.getHorarios().addElement("21:05");
		ponto8.getHorarios().addElement("21:45");
		ponto8.getHorarios().addElement("22:25");
		ponto8.getHorarios().addElement("23:05");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("BAIRRO AHU");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("06:05");
		ponto9.getHorarios().addElement("06:45");
		ponto9.getHorarios().addElement("07:25");
		ponto9.getHorarios().addElement("08:05");
		ponto9.getHorarios().addElement("08:45");
		ponto9.getHorarios().addElement("09:25");
		ponto9.getHorarios().addElement("10:05");
		ponto9.getHorarios().addElement("10:45");
		ponto9.getHorarios().addElement("11:25");
		ponto9.getHorarios().addElement("12:05");
		ponto9.getHorarios().addElement("12:45");
		ponto9.getHorarios().addElement("13:25");
		ponto9.getHorarios().addElement("14:05");
		ponto9.getHorarios().addElement("14:45");
		ponto9.getHorarios().addElement("15:25");
		ponto9.getHorarios().addElement("16:05");
		ponto9.getHorarios().addElement("16:45");
		ponto9.getHorarios().addElement("17:25");
		ponto9.getHorarios().addElement("18:05");
		ponto9.getHorarios().addElement("18:45");
		ponto9.getHorarios().addElement("19:25");
		ponto9.getHorarios().addElement("20:05");
		ponto9.getHorarios().addElement("20:45");
		ponto9.getHorarios().addElement("21:25");
		ponto9.getHorarios().addElement("22:05");
		ponto9.getHorarios().addElement("22:45");
		ponto9.getHorarios().addElement("23:25");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("BAIRRO LOS ANGELES");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:25");
		ponto10.getHorarios().addElement("06:05");
		ponto10.getHorarios().addElement("06:45");
		ponto10.getHorarios().addElement("07:25");
		ponto10.getHorarios().addElement("08:05");
		ponto10.getHorarios().addElement("08:45");
		ponto10.getHorarios().addElement("09:25");
		ponto10.getHorarios().addElement("10:05");
		ponto10.getHorarios().addElement("10:45");
		ponto10.getHorarios().addElement("11:25");
		ponto10.getHorarios().addElement("12:05");
		ponto10.getHorarios().addElement("12:45");
		ponto10.getHorarios().addElement("13:25");
		ponto10.getHorarios().addElement("14:05");
		ponto10.getHorarios().addElement("14:45");
		ponto10.getHorarios().addElement("15:25");
		ponto10.getHorarios().addElement("16:05");
		ponto10.getHorarios().addElement("16:45");
		ponto10.getHorarios().addElement("17:25");
		ponto10.getHorarios().addElement("18:05");
		ponto10.getHorarios().addElement("18:45");
		ponto10.getHorarios().addElement("19:25");
		ponto10.getHorarios().addElement("20:05");
		ponto10.getHorarios().addElement("20:45");
		ponto10.getHorarios().addElement("21:25");
		ponto10.getHorarios().addElement("22:05");
		ponto10.getHorarios().addElement("22:45");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("RUI BARBOSA");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("27/07/2008");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("06:27");
		ponto11.getHorarios().addElement("07:07");
		ponto11.getHorarios().addElement("07:47");
		ponto11.getHorarios().addElement("08:27");
		ponto11.getHorarios().addElement("09:07");
		ponto11.getHorarios().addElement("09:47");
		ponto11.getHorarios().addElement("10:27");
		ponto11.getHorarios().addElement("11:07");
		ponto11.getHorarios().addElement("11:47");
		ponto11.getHorarios().addElement("12:27");
		ponto11.getHorarios().addElement("13:07");
		ponto11.getHorarios().addElement("13:47");
		ponto11.getHorarios().addElement("14:27");
		ponto11.getHorarios().addElement("15:07");
		ponto11.getHorarios().addElement("15:47");
		ponto11.getHorarios().addElement("16:27");
		ponto11.getHorarios().addElement("17:07");
		ponto11.getHorarios().addElement("17:47");
		ponto11.getHorarios().addElement("18:27");
		ponto11.getHorarios().addElement("19:07");
		ponto11.getHorarios().addElement("19:47");
		ponto11.getHorarios().addElement("20:27");
		ponto11.getHorarios().addElement("21:07");
		ponto11.getHorarios().addElement("21:47");
		ponto11.getHorarios().addElement("22:27");
		ponto11.getHorarios().addElement("23:07");
		ponto11.getHorarios().addElement("23:47");
		return onibus;
		}
	}
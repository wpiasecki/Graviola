
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus619 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("STA. RITA / CIC");
		onibus.setCodigo("619");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO SANTA RITA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("04:50");
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:10");
		ponto0.getHorarios().addElement("05:17");
		ponto0.getHorarios().addElement("05:24");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:37");
		ponto0.getHorarios().addElement("05:44");
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("05:56");
		ponto0.getHorarios().addElement("06:02");
		ponto0.getHorarios().addElement("06:08");
		ponto0.getHorarios().addElement("06:14");
		ponto0.getHorarios().addElement("06:25");
		ponto0.getHorarios().addElement("06:31");
		ponto0.getHorarios().addElement("06:37");
		ponto0.getHorarios().addElement("06:44");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("06:57");
		ponto0.getHorarios().addElement("07:04");
		ponto0.getHorarios().addElement("07:12");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:44");
		ponto0.getHorarios().addElement("07:51");
		ponto0.getHorarios().addElement("07:58");
		ponto0.getHorarios().addElement("08:05");
		ponto0.getHorarios().addElement("08:18");
		ponto0.getHorarios().addElement("08:40");
		ponto0.getHorarios().addElement("09:02");
		ponto0.getHorarios().addElement("09:24");
		ponto0.getHorarios().addElement("09:46");
		ponto0.getHorarios().addElement("10:08");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("10:52");
		ponto0.getHorarios().addElement("11:14");
		ponto0.getHorarios().addElement("11:30");
		ponto0.getHorarios().addElement("11:46");
		ponto0.getHorarios().addElement("12:03");
		ponto0.getHorarios().addElement("12:19");
		ponto0.getHorarios().addElement("12:36");
		ponto0.getHorarios().addElement("12:53");
		ponto0.getHorarios().addElement("13:10");
		ponto0.getHorarios().addElement("13:26");
		ponto0.getHorarios().addElement("13:43");
		ponto0.getHorarios().addElement("13:59");
		ponto0.getHorarios().addElement("14:21");
		ponto0.getHorarios().addElement("14:43");
		ponto0.getHorarios().addElement("15:05");
		ponto0.getHorarios().addElement("15:27");
		ponto0.getHorarios().addElement("15:49");
		ponto0.getHorarios().addElement("16:11");
		ponto0.getHorarios().addElement("16:34");
		ponto0.getHorarios().addElement("16:56");
		ponto0.getHorarios().addElement("17:19");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:41");
		ponto0.getHorarios().addElement("17:52");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:14");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("18:36");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("18:58");
		ponto0.getHorarios().addElement("19:09");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("19:31");
		ponto0.getHorarios().addElement("19:53");
		ponto0.getHorarios().addElement("20:15");
		ponto0.getHorarios().addElement("20:37");
		ponto0.getHorarios().addElement("20:58");
		ponto0.getHorarios().addElement("21:19");
		ponto0.getHorarios().addElement("21:41");
		ponto0.getHorarios().addElement("22:02");
		ponto0.getHorarios().addElement("22:23");
		ponto0.getHorarios().addElement("22:48");
		ponto0.getHorarios().addElement("23:08");
		ponto0.getHorarios().addElement("23:28");
		ponto0.getHorarios().addElement("23:48");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO RASO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("08:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CIC");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:18");
		ponto2.getHorarios().addElement("05:28");
		ponto2.getHorarios().addElement("05:38");
		ponto2.getHorarios().addElement("05:49");
		ponto2.getHorarios().addElement("05:56");
		ponto2.getHorarios().addElement("06:02");
		ponto2.getHorarios().addElement("06:09");
		ponto2.getHorarios().addElement("06:16");
		ponto2.getHorarios().addElement("06:22");
		ponto2.getHorarios().addElement("06:29");
		ponto2.getHorarios().addElement("06:36");
		ponto2.getHorarios().addElement("06:44");
		ponto2.getHorarios().addElement("06:52");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:08");
		ponto2.getHorarios().addElement("07:16");
		ponto2.getHorarios().addElement("07:22");
		ponto2.getHorarios().addElement("07:29");
		ponto2.getHorarios().addElement("07:36");
		ponto2.getHorarios().addElement("07:49");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:29");
		ponto2.getHorarios().addElement("08:51");
		ponto2.getHorarios().addElement("09:13");
		ponto2.getHorarios().addElement("09:35");
		ponto2.getHorarios().addElement("09:57");
		ponto2.getHorarios().addElement("10:19");
		ponto2.getHorarios().addElement("10:41");
		ponto2.getHorarios().addElement("11:03");
		ponto2.getHorarios().addElement("11:25");
		ponto2.getHorarios().addElement("11:47");
		ponto2.getHorarios().addElement("12:04");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("12:37");
		ponto2.getHorarios().addElement("12:53");
		ponto2.getHorarios().addElement("13:10");
		ponto2.getHorarios().addElement("13:26");
		ponto2.getHorarios().addElement("13:48");
		ponto2.getHorarios().addElement("14:10");
		ponto2.getHorarios().addElement("14:21");
		ponto2.getHorarios().addElement("14:32");
		ponto2.getHorarios().addElement("14:54");
		ponto2.getHorarios().addElement("15:16");
		ponto2.getHorarios().addElement("15:38");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("16:22");
		ponto2.getHorarios().addElement("16:44");
		ponto2.getHorarios().addElement("16:55");
		ponto2.getHorarios().addElement("17:06");
		ponto2.getHorarios().addElement("17:17");
		ponto2.getHorarios().addElement("17:28");
		ponto2.getHorarios().addElement("17:39");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:01");
		ponto2.getHorarios().addElement("18:12");
		ponto2.getHorarios().addElement("18:23");
		ponto2.getHorarios().addElement("18:34");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("18:56");
		ponto2.getHorarios().addElement("19:07");
		ponto2.getHorarios().addElement("19:18");
		ponto2.getHorarios().addElement("19:29");
		ponto2.getHorarios().addElement("19:40");
		ponto2.getHorarios().addElement("19:51");
		ponto2.getHorarios().addElement("20:02");
		ponto2.getHorarios().addElement("20:24");
		ponto2.getHorarios().addElement("20:45");
		ponto2.getHorarios().addElement("21:07");
		ponto2.getHorarios().addElement("21:28");
		ponto2.getHorarios().addElement("21:51");
		ponto2.getHorarios().addElement("22:14");
		ponto2.getHorarios().addElement("22:37");
		ponto2.getHorarios().addElement("23:00");
		ponto2.getHorarios().addElement("23:20");
		ponto2.getHorarios().addElement("23:40");
		ponto2.getHorarios().addElement("00:00");
		ponto2.getHorarios().addElement("00:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("EMPRESA KRAFT");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("14:38");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("WHB (NEW HUBNER)");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("23:08");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERM.CIC SENTIDO CAMPO ALEGRE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("07:50");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO SANTA RITA (RECOLHE)");
		ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto6.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto6);
		Ponto ponto7 = new Ponto();
		ponto7.setNome("BAIRRO SANTA RITA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("01/10/2011");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("04:50");
		ponto7.getHorarios().addElement("05:05");
		ponto7.getHorarios().addElement("05:20");
		ponto7.getHorarios().addElement("05:30");
		ponto7.getHorarios().addElement("05:40");
		ponto7.getHorarios().addElement("05:50");
		ponto7.getHorarios().addElement("06:00");
		ponto7.getHorarios().addElement("06:09");
		ponto7.getHorarios().addElement("06:18");
		ponto7.getHorarios().addElement("06:27");
		ponto7.getHorarios().addElement("06:36");
		ponto7.getHorarios().addElement("06:45");
		ponto7.getHorarios().addElement("06:54");
		ponto7.getHorarios().addElement("07:03");
		ponto7.getHorarios().addElement("07:12");
		ponto7.getHorarios().addElement("07:21");
		ponto7.getHorarios().addElement("07:30");
		ponto7.getHorarios().addElement("07:38");
		ponto7.getHorarios().addElement("07:48");
		ponto7.getHorarios().addElement("07:57");
		ponto7.getHorarios().addElement("08:10");
		ponto7.getHorarios().addElement("08:30");
		ponto7.getHorarios().addElement("08:50");
		ponto7.getHorarios().addElement("09:10");
		ponto7.getHorarios().addElement("09:30");
		ponto7.getHorarios().addElement("09:50");
		ponto7.getHorarios().addElement("10:10");
		ponto7.getHorarios().addElement("10:30");
		ponto7.getHorarios().addElement("10:50");
		ponto7.getHorarios().addElement("11:10");
		ponto7.getHorarios().addElement("11:30");
		ponto7.getHorarios().addElement("11:50");
		ponto7.getHorarios().addElement("12:10");
		ponto7.getHorarios().addElement("12:30");
		ponto7.getHorarios().addElement("12:50");
		ponto7.getHorarios().addElement("13:10");
		ponto7.getHorarios().addElement("13:30");
		ponto7.getHorarios().addElement("13:45");
		ponto7.getHorarios().addElement("14:00");
		ponto7.getHorarios().addElement("14:15");
		ponto7.getHorarios().addElement("14:30");
		ponto7.getHorarios().addElement("14:50");
		ponto7.getHorarios().addElement("15:10");
		ponto7.getHorarios().addElement("15:15");
		ponto7.getHorarios().addElement("15:30");
		ponto7.getHorarios().addElement("15:50");
		ponto7.getHorarios().addElement("16:10");
		ponto7.getHorarios().addElement("16:30");
		ponto7.getHorarios().addElement("16:50");
		ponto7.getHorarios().addElement("17:10");
		ponto7.getHorarios().addElement("17:30");
		ponto7.getHorarios().addElement("17:50");
		ponto7.getHorarios().addElement("18:10");
		ponto7.getHorarios().addElement("18:30");
		ponto7.getHorarios().addElement("18:50");
		ponto7.getHorarios().addElement("19:10");
		ponto7.getHorarios().addElement("19:30");
		ponto7.getHorarios().addElement("20:00");
		ponto7.getHorarios().addElement("20:30");
		ponto7.getHorarios().addElement("21:00");
		ponto7.getHorarios().addElement("21:30");
		ponto7.getHorarios().addElement("22:00");
		ponto7.getHorarios().addElement("22:40");
		ponto7.getHorarios().addElement("23:00");
		ponto7.getHorarios().addElement("00:00");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL CIC");
		ponto8.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto8.setValidoAPartirDe("01/10/2011");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:20");
		ponto8.getHorarios().addElement("05:40");
		ponto8.getHorarios().addElement("05:50");
		ponto8.getHorarios().addElement("06:00");
		ponto8.getHorarios().addElement("06:09");
		ponto8.getHorarios().addElement("06:18");
		ponto8.getHorarios().addElement("06:28");
		ponto8.getHorarios().addElement("06:37");
		ponto8.getHorarios().addElement("06:46");
		ponto8.getHorarios().addElement("06:55");
		ponto8.getHorarios().addElement("07:04");
		ponto8.getHorarios().addElement("07:13");
		ponto8.getHorarios().addElement("07:22");
		ponto8.getHorarios().addElement("07:31");
		ponto8.getHorarios().addElement("07:40");
		ponto8.getHorarios().addElement("08:04");
		ponto8.getHorarios().addElement("08:24");
		ponto8.getHorarios().addElement("08:40");
		ponto8.getHorarios().addElement("09:00");
		ponto8.getHorarios().addElement("09:20");
		ponto8.getHorarios().addElement("09:40");
		ponto8.getHorarios().addElement("10:00");
		ponto8.getHorarios().addElement("10:20");
		ponto8.getHorarios().addElement("10:40");
		ponto8.getHorarios().addElement("11:00");
		ponto8.getHorarios().addElement("11:20");
		ponto8.getHorarios().addElement("11:40");
		ponto8.getHorarios().addElement("12:00");
		ponto8.getHorarios().addElement("12:20");
		ponto8.getHorarios().addElement("12:40");
		ponto8.getHorarios().addElement("13:00");
		ponto8.getHorarios().addElement("13:15");
		ponto8.getHorarios().addElement("13:30");
		ponto8.getHorarios().addElement("13:45");
		ponto8.getHorarios().addElement("14:00");
		ponto8.getHorarios().addElement("14:15");
		ponto8.getHorarios().addElement("14:32");
		ponto8.getHorarios().addElement("14:45");
		ponto8.getHorarios().addElement("15:00");
		ponto8.getHorarios().addElement("15:20");
		ponto8.getHorarios().addElement("15:40");
		ponto8.getHorarios().addElement("16:00");
		ponto8.getHorarios().addElement("16:20");
		ponto8.getHorarios().addElement("16:40");
		ponto8.getHorarios().addElement("17:00");
		ponto8.getHorarios().addElement("17:20");
		ponto8.getHorarios().addElement("17:40");
		ponto8.getHorarios().addElement("18:00");
		ponto8.getHorarios().addElement("18:20");
		ponto8.getHorarios().addElement("18:40");
		ponto8.getHorarios().addElement("19:00");
		ponto8.getHorarios().addElement("19:25");
		ponto8.getHorarios().addElement("19:40");
		ponto8.getHorarios().addElement("20:00");
		ponto8.getHorarios().addElement("20:30");
		ponto8.getHorarios().addElement("21:00");
		ponto8.getHorarios().addElement("21:30");
		ponto8.getHorarios().addElement("22:05");
		ponto8.getHorarios().addElement("22:35");
		ponto8.getHorarios().addElement("23:05");
		ponto8.getHorarios().addElement("23:30");
		ponto8.getHorarios().addElement("00:30");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("WHB (NEW HUBNER)");
		ponto9.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto9.setValidoAPartirDe("01/10/2011");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("23:08");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("EMPRESA KRAFT SENT.STA.RITA");
		ponto10.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto10.setValidoAPartirDe("01/10/2011");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("14:50");
		ponto10.getHorarios().addElement("15:00");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("BAIRRO SANTA RITA (RECOLHE)");
		ponto11.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto11.setValidoAPartirDe("01/10/2011");
		onibus.getPontos().addElement(ponto11);
		Ponto ponto12 = new Ponto();
		ponto12.setNome("BAIRRO SANTA RITA");
		ponto12.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto12.setValidoAPartirDe("17/08/2008");
		onibus.getPontos().addElement(ponto12);
		ponto12.getHorarios().addElement("05:00");
		ponto12.getHorarios().addElement("05:30");
		ponto12.getHorarios().addElement("06:00");
		ponto12.getHorarios().addElement("06:30");
		ponto12.getHorarios().addElement("07:00");
		ponto12.getHorarios().addElement("07:30");
		ponto12.getHorarios().addElement("08:00");
		ponto12.getHorarios().addElement("08:30");
		ponto12.getHorarios().addElement("09:00");
		ponto12.getHorarios().addElement("09:30");
		ponto12.getHorarios().addElement("10:00");
		ponto12.getHorarios().addElement("10:30");
		ponto12.getHorarios().addElement("11:00");
		ponto12.getHorarios().addElement("11:30");
		ponto12.getHorarios().addElement("12:00");
		ponto12.getHorarios().addElement("12:30");
		ponto12.getHorarios().addElement("13:00");
		ponto12.getHorarios().addElement("13:30");
		ponto12.getHorarios().addElement("14:00");
		ponto12.getHorarios().addElement("14:30");
		ponto12.getHorarios().addElement("15:00");
		ponto12.getHorarios().addElement("15:30");
		ponto12.getHorarios().addElement("16:00");
		ponto12.getHorarios().addElement("16:30");
		ponto12.getHorarios().addElement("17:00");
		ponto12.getHorarios().addElement("17:30");
		ponto12.getHorarios().addElement("18:00");
		ponto12.getHorarios().addElement("18:30");
		ponto12.getHorarios().addElement("19:00");
		ponto12.getHorarios().addElement("19:30");
		ponto12.getHorarios().addElement("20:00");
		ponto12.getHorarios().addElement("20:30");
		ponto12.getHorarios().addElement("21:00");
		ponto12.getHorarios().addElement("21:30");
		ponto12.getHorarios().addElement("22:00");
		ponto12.getHorarios().addElement("22:40");
		ponto12.getHorarios().addElement("23:00");
		ponto12.getHorarios().addElement("00:00");
		Ponto ponto13 = new Ponto();
		ponto13.setNome("TERMINAL CIC");
		ponto13.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto13.setValidoAPartirDe("17/08/2008");
		onibus.getPontos().addElement(ponto13);
		ponto13.getHorarios().addElement("05:30");
		ponto13.getHorarios().addElement("06:00");
		ponto13.getHorarios().addElement("06:30");
		ponto13.getHorarios().addElement("07:00");
		ponto13.getHorarios().addElement("07:30");
		ponto13.getHorarios().addElement("08:00");
		ponto13.getHorarios().addElement("08:30");
		ponto13.getHorarios().addElement("09:00");
		ponto13.getHorarios().addElement("09:30");
		ponto13.getHorarios().addElement("10:00");
		ponto13.getHorarios().addElement("10:30");
		ponto13.getHorarios().addElement("11:00");
		ponto13.getHorarios().addElement("11:30");
		ponto13.getHorarios().addElement("12:00");
		ponto13.getHorarios().addElement("12:30");
		ponto13.getHorarios().addElement("13:00");
		ponto13.getHorarios().addElement("13:30");
		ponto13.getHorarios().addElement("14:00");
		ponto13.getHorarios().addElement("14:30");
		ponto13.getHorarios().addElement("15:00");
		ponto13.getHorarios().addElement("15:30");
		ponto13.getHorarios().addElement("16:00");
		ponto13.getHorarios().addElement("16:30");
		ponto13.getHorarios().addElement("17:00");
		ponto13.getHorarios().addElement("17:30");
		ponto13.getHorarios().addElement("18:00");
		ponto13.getHorarios().addElement("18:30");
		ponto13.getHorarios().addElement("19:00");
		ponto13.getHorarios().addElement("19:30");
		ponto13.getHorarios().addElement("20:00");
		ponto13.getHorarios().addElement("20:30");
		ponto13.getHorarios().addElement("21:00");
		ponto13.getHorarios().addElement("21:30");
		ponto13.getHorarios().addElement("22:00");
		ponto13.getHorarios().addElement("22:30");
		ponto13.getHorarios().addElement("23:00");
		ponto13.getHorarios().addElement("23:30");
		ponto13.getHorarios().addElement("00:30");
		Ponto ponto14 = new Ponto();
		ponto14.setNome("BAIRRO SANTA RITA (RECOLHE)");
		ponto14.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto14.setValidoAPartirDe("17/08/2008");
		onibus.getPontos().addElement(ponto14);
		return onibus;
		}
	}
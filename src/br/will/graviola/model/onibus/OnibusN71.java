
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusN71 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / C. GRANDE DO SUL");
		onibus.setCodigo("N71");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO MANDASSAIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL C.GRANDE DO SUL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:09");
		ponto1.getHorarios().addElement("05:21");
		ponto1.getHorarios().addElement("05:33");
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:09");
		ponto1.getHorarios().addElement("06:21");
		ponto1.getHorarios().addElement("06:33");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("06:57");
		ponto1.getHorarios().addElement("07:09");
		ponto1.getHorarios().addElement("07:21");
		ponto1.getHorarios().addElement("07:33");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("07:57");
		ponto1.getHorarios().addElement("08:09");
		ponto1.getHorarios().addElement("08:21");
		ponto1.getHorarios().addElement("08:33");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("08:57");
		ponto1.getHorarios().addElement("09:21");
		ponto1.getHorarios().addElement("09:45");
		ponto1.getHorarios().addElement("10:09");
		ponto1.getHorarios().addElement("10:33");
		ponto1.getHorarios().addElement("10:57");
		ponto1.getHorarios().addElement("11:21");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:09");
		ponto1.getHorarios().addElement("12:33");
		ponto1.getHorarios().addElement("12:57");
		ponto1.getHorarios().addElement("13:21");
		ponto1.getHorarios().addElement("13:45");
		ponto1.getHorarios().addElement("14:09");
		ponto1.getHorarios().addElement("14:33");
		ponto1.getHorarios().addElement("14:57");
		ponto1.getHorarios().addElement("15:21");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("16:09");
		ponto1.getHorarios().addElement("16:33");
		ponto1.getHorarios().addElement("16:57");
		ponto1.getHorarios().addElement("17:09");
		ponto1.getHorarios().addElement("17:21");
		ponto1.getHorarios().addElement("17:33");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("17:57");
		ponto1.getHorarios().addElement("18:09");
		ponto1.getHorarios().addElement("18:21");
		ponto1.getHorarios().addElement("18:33");
		ponto1.getHorarios().addElement("19:10");
		ponto1.getHorarios().addElement("19:21");
		ponto1.getHorarios().addElement("19:33");
		ponto1.getHorarios().addElement("19:45");
		ponto1.getHorarios().addElement("20:09");
		ponto1.getHorarios().addElement("20:33");
		ponto1.getHorarios().addElement("20:57");
		ponto1.getHorarios().addElement("21:15");
		ponto1.getHorarios().addElement("21:45");
		ponto1.getHorarios().addElement("22:09");
		ponto1.getHorarios().addElement("22:33");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL GUADALUPE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:21");
		ponto2.getHorarios().addElement("06:33");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:09");
		ponto2.getHorarios().addElement("07:21");
		ponto2.getHorarios().addElement("07:33");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:09");
		ponto2.getHorarios().addElement("08:33");
		ponto2.getHorarios().addElement("08:57");
		ponto2.getHorarios().addElement("09:21");
		ponto2.getHorarios().addElement("09:45");
		ponto2.getHorarios().addElement("10:09");
		ponto2.getHorarios().addElement("10:33");
		ponto2.getHorarios().addElement("10:57");
		ponto2.getHorarios().addElement("11:21");
		ponto2.getHorarios().addElement("11:45");
		ponto2.getHorarios().addElement("12:09");
		ponto2.getHorarios().addElement("12:33");
		ponto2.getHorarios().addElement("12:57");
		ponto2.getHorarios().addElement("13:21");
		ponto2.getHorarios().addElement("13:45");
		ponto2.getHorarios().addElement("14:09");
		ponto2.getHorarios().addElement("14:33");
		ponto2.getHorarios().addElement("14:57");
		ponto2.getHorarios().addElement("15:21");
		ponto2.getHorarios().addElement("15:45");
		ponto2.getHorarios().addElement("15:57");
		ponto2.getHorarios().addElement("16:09");
		ponto2.getHorarios().addElement("16:21");
		ponto2.getHorarios().addElement("16:33");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("16:57");
		ponto2.getHorarios().addElement("17:09");
		ponto2.getHorarios().addElement("17:21");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:09");
		ponto2.getHorarios().addElement("18:21");
		ponto2.getHorarios().addElement("18:33");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("18:57");
		ponto2.getHorarios().addElement("19:09");
		ponto2.getHorarios().addElement("19:21");
		ponto2.getHorarios().addElement("19:33");
		ponto2.getHorarios().addElement("19:45");
		ponto2.getHorarios().addElement("20:10");
		ponto2.getHorarios().addElement("20:33");
		ponto2.getHorarios().addElement("20:57");
		ponto2.getHorarios().addElement("21:21");
		ponto2.getHorarios().addElement("21:45");
		ponto2.getHorarios().addElement("22:12");
		ponto2.getHorarios().addElement("22:36");
		ponto2.getHorarios().addElement("23:21");
		ponto2.getHorarios().addElement("23:55");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL JD.PAULISTA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:55");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("C.GRANDE DO SUL(SANTA ROSA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:05");
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("07:05");
		ponto4.getHorarios().addElement("07:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("GUADALUPE VIA SANTA ROSA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:10");
		ponto5.getHorarios().addElement("06:55");
		ponto5.getHorarios().addElement("17:15");
		ponto5.getHorarios().addElement("18:25");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("VIA PNEU");
		ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto6.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("22:55");
		ponto6.getHorarios().addElement("00:40");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERM. PAULISTA SENT.CURITIBA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto7.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:24");
		ponto7.getHorarios().addElement("05:48");
		ponto7.getHorarios().addElement("06:00");
		ponto7.getHorarios().addElement("06:24");
		ponto7.getHorarios().addElement("06:36");
		ponto7.getHorarios().addElement("07:12");
		ponto7.getHorarios().addElement("07:36");
		ponto7.getHorarios().addElement("07:55");
		ponto7.getHorarios().addElement("08:00");
		ponto7.getHorarios().addElement("08:12");
		ponto7.getHorarios().addElement("08:24");
		ponto7.getHorarios().addElement("08:36");
		ponto7.getHorarios().addElement("08:55");
		ponto7.getHorarios().addElement("09:07");
		ponto7.getHorarios().addElement("09:12");
		ponto7.getHorarios().addElement("09:36");
		ponto7.getHorarios().addElement("10:00");
		ponto7.getHorarios().addElement("10:24");
		ponto7.getHorarios().addElement("10:48");
		ponto7.getHorarios().addElement("11:12");
		ponto7.getHorarios().addElement("11:36");
		ponto7.getHorarios().addElement("12:00");
		ponto7.getHorarios().addElement("12:24");
		ponto7.getHorarios().addElement("12:48");
		ponto7.getHorarios().addElement("13:12");
		ponto7.getHorarios().addElement("13:36");
		ponto7.getHorarios().addElement("14:00");
		ponto7.getHorarios().addElement("14:24");
		ponto7.getHorarios().addElement("14:48");
		ponto7.getHorarios().addElement("15:12");
		ponto7.getHorarios().addElement("15:36");
		ponto7.getHorarios().addElement("16:00");
		ponto7.getHorarios().addElement("16:24");
		ponto7.getHorarios().addElement("16:48");
		ponto7.getHorarios().addElement("17:12");
		ponto7.getHorarios().addElement("17:24");
		ponto7.getHorarios().addElement("17:36");
		ponto7.getHorarios().addElement("17:48");
		ponto7.getHorarios().addElement("18:00");
		ponto7.getHorarios().addElement("18:12");
		ponto7.getHorarios().addElement("18:24");
		ponto7.getHorarios().addElement("18:36");
		ponto7.getHorarios().addElement("18:48");
		ponto7.getHorarios().addElement("19:25");
		ponto7.getHorarios().addElement("19:36");
		ponto7.getHorarios().addElement("20:00");
		ponto7.getHorarios().addElement("20:15");
		ponto7.getHorarios().addElement("20:48");
		ponto7.getHorarios().addElement("21:12");
		ponto7.getHorarios().addElement("21:25");
		ponto7.getHorarios().addElement("22:00");
		ponto7.getHorarios().addElement("22:31");
		ponto7.getHorarios().addElement("22:48");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERM. PAULISTA SENT.C.GDE.SUL");
		ponto8.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto8.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:11");
		ponto8.getHorarios().addElement("05:23");
		ponto8.getHorarios().addElement("05:47");
		ponto8.getHorarios().addElement("06:11");
		ponto8.getHorarios().addElement("06:35");
		ponto8.getHorarios().addElement("06:59");
		ponto8.getHorarios().addElement("07:11");
		ponto8.getHorarios().addElement("07:23");
		ponto8.getHorarios().addElement("07:35");
		ponto8.getHorarios().addElement("07:47");
		ponto8.getHorarios().addElement("07:59");
		ponto8.getHorarios().addElement("08:11");
		ponto8.getHorarios().addElement("08:23");
		ponto8.getHorarios().addElement("08:35");
		ponto8.getHorarios().addElement("08:59");
		ponto8.getHorarios().addElement("09:23");
		ponto8.getHorarios().addElement("09:47");
		ponto8.getHorarios().addElement("10:11");
		ponto8.getHorarios().addElement("10:35");
		ponto8.getHorarios().addElement("10:59");
		ponto8.getHorarios().addElement("11:23");
		ponto8.getHorarios().addElement("11:47");
		ponto8.getHorarios().addElement("12:11");
		ponto8.getHorarios().addElement("12:35");
		ponto8.getHorarios().addElement("12:59");
		ponto8.getHorarios().addElement("13:23");
		ponto8.getHorarios().addElement("13:47");
		ponto8.getHorarios().addElement("14:11");
		ponto8.getHorarios().addElement("14:35");
		ponto8.getHorarios().addElement("14:59");
		ponto8.getHorarios().addElement("15:23");
		ponto8.getHorarios().addElement("15:47");
		ponto8.getHorarios().addElement("16:11");
		ponto8.getHorarios().addElement("16:35");
		ponto8.getHorarios().addElement("16:47");
		ponto8.getHorarios().addElement("16:59");
		ponto8.getHorarios().addElement("17:23");
		ponto8.getHorarios().addElement("17:35");
		ponto8.getHorarios().addElement("17:47");
		ponto8.getHorarios().addElement("18:11");
		ponto8.getHorarios().addElement("18:40");
		ponto8.getHorarios().addElement("19:11");
		ponto8.getHorarios().addElement("19:23");
		ponto8.getHorarios().addElement("19:35");
		ponto8.getHorarios().addElement("19:47");
		ponto8.getHorarios().addElement("19:59");
		ponto8.getHorarios().addElement("20:11");
		ponto8.getHorarios().addElement("20:23");
		ponto8.getHorarios().addElement("20:35");
		ponto8.getHorarios().addElement("21:00");
		ponto8.getHorarios().addElement("21:23");
		ponto8.getHorarios().addElement("21:47");
		ponto8.getHorarios().addElement("22:11");
		ponto8.getHorarios().addElement("22:35");
		ponto8.getHorarios().addElement("22:52");
		ponto8.getHorarios().addElement("23:25");
		ponto8.getHorarios().addElement("23:45");
		ponto8.getHorarios().addElement("00:06");
		ponto8.getHorarios().addElement("00:47");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERM. GUADALUPE VIA PNEU");
		ponto9.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto9.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("23:00");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("BAIRRO MANDASSAIA");
		ponto10.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto10.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:53");
		ponto10.getHorarios().addElement("08:53");
		ponto10.getHorarios().addElement("11:39");
		ponto10.getHorarios().addElement("16:38");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("TERMINAL C.GRANDE DO SUL");
		ponto11.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto11.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("05:00");
		ponto11.getHorarios().addElement("05:22");
		ponto11.getHorarios().addElement("05:44");
		ponto11.getHorarios().addElement("06:06");
		ponto11.getHorarios().addElement("06:28");
		ponto11.getHorarios().addElement("06:50");
		ponto11.getHorarios().addElement("07:12");
		ponto11.getHorarios().addElement("07:34");
		ponto11.getHorarios().addElement("07:56");
		ponto11.getHorarios().addElement("08:18");
		ponto11.getHorarios().addElement("08:44");
		ponto11.getHorarios().addElement("08:54");
		ponto11.getHorarios().addElement("09:03");
		ponto11.getHorarios().addElement("09:28");
		ponto11.getHorarios().addElement("09:56");
		ponto11.getHorarios().addElement("10:24");
		ponto11.getHorarios().addElement("10:52");
		ponto11.getHorarios().addElement("11:20");
		ponto11.getHorarios().addElement("11:29");
		ponto11.getHorarios().addElement("11:48");
		ponto11.getHorarios().addElement("12:16");
		ponto11.getHorarios().addElement("12:44");
		ponto11.getHorarios().addElement("13:12");
		ponto11.getHorarios().addElement("13:40");
		ponto11.getHorarios().addElement("14:08");
		ponto11.getHorarios().addElement("14:36");
		ponto11.getHorarios().addElement("15:04");
		ponto11.getHorarios().addElement("15:32");
		ponto11.getHorarios().addElement("16:00");
		ponto11.getHorarios().addElement("16:28");
		ponto11.getHorarios().addElement("16:48");
		ponto11.getHorarios().addElement("16:56");
		ponto11.getHorarios().addElement("17:24");
		ponto11.getHorarios().addElement("17:52");
		ponto11.getHorarios().addElement("18:20");
		ponto11.getHorarios().addElement("19:08");
		ponto11.getHorarios().addElement("19:16");
		ponto11.getHorarios().addElement("19:43");
		ponto11.getHorarios().addElement("20:18");
		ponto11.getHorarios().addElement("20:35");
		ponto11.getHorarios().addElement("21:28");
		ponto11.getHorarios().addElement("22:03");
		ponto11.getHorarios().addElement("22:38");
		Ponto ponto12 = new Ponto();
		ponto12.setNome("TERMINAL GUADALUPE");
		ponto12.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto12.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto12);
		ponto12.getHorarios().addElement("06:06");
		ponto12.getHorarios().addElement("06:28");
		ponto12.getHorarios().addElement("06:50");
		ponto12.getHorarios().addElement("07:12");
		ponto12.getHorarios().addElement("07:34");
		ponto12.getHorarios().addElement("07:56");
		ponto12.getHorarios().addElement("08:18");
		ponto12.getHorarios().addElement("08:40");
		ponto12.getHorarios().addElement("09:02");
		ponto12.getHorarios().addElement("09:24");
		ponto12.getHorarios().addElement("10:04");
		ponto12.getHorarios().addElement("10:28");
		ponto12.getHorarios().addElement("11:06");
		ponto12.getHorarios().addElement("11:34");
		ponto12.getHorarios().addElement("12:02");
		ponto12.getHorarios().addElement("12:30");
		ponto12.getHorarios().addElement("12:58");
		ponto12.getHorarios().addElement("13:26");
		ponto12.getHorarios().addElement("13:54");
		ponto12.getHorarios().addElement("14:22");
		ponto12.getHorarios().addElement("14:50");
		ponto12.getHorarios().addElement("15:18");
		ponto12.getHorarios().addElement("15:46");
		ponto12.getHorarios().addElement("16:14");
		ponto12.getHorarios().addElement("16:42");
		ponto12.getHorarios().addElement("17:10");
		ponto12.getHorarios().addElement("17:58");
		ponto12.getHorarios().addElement("18:06");
		ponto12.getHorarios().addElement("18:34");
		ponto12.getHorarios().addElement("19:02");
		ponto12.getHorarios().addElement("19:30");
		ponto12.getHorarios().addElement("20:18");
		ponto12.getHorarios().addElement("20:53");
		ponto12.getHorarios().addElement("21:28");
		ponto12.getHorarios().addElement("22:13");
		ponto12.getHorarios().addElement("22:38");
		ponto12.getHorarios().addElement("23:13");
		ponto12.getHorarios().addElement("23:48");
		Ponto ponto13 = new Ponto();
		ponto13.setNome("TERMINAL JD.PAULISTA");
		ponto13.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto13.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto13);
		Ponto ponto14 = new Ponto();
		ponto14.setNome("VIA PNEU");
		ponto14.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto14.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto14);
		ponto14.getHorarios().addElement("21:10");
		ponto14.getHorarios().addElement("21:54");
		ponto14.getHorarios().addElement("22:19");
		ponto14.getHorarios().addElement("22:53");
		ponto14.getHorarios().addElement("22:54");
		ponto14.getHorarios().addElement("23:18");
		ponto14.getHorarios().addElement("23:53");
		ponto14.getHorarios().addElement("00:28");
		Ponto ponto15 = new Ponto();
		ponto15.setNome("TERM. PAULISTA SENT.CURITIBA");
		ponto15.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto15.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto15);
		ponto15.getHorarios().addElement("05:15");
		ponto15.getHorarios().addElement("05:33");
		ponto15.getHorarios().addElement("05:59");
		ponto15.getHorarios().addElement("06:21");
		ponto15.getHorarios().addElement("06:39");
		ponto15.getHorarios().addElement("07:05");
		ponto15.getHorarios().addElement("07:23");
		ponto15.getHorarios().addElement("07:45");
		ponto15.getHorarios().addElement("08:07");
		ponto15.getHorarios().addElement("08:29");
		ponto15.getHorarios().addElement("09:05");
		ponto15.getHorarios().addElement("10:07");
		ponto15.getHorarios().addElement("10:35");
		ponto15.getHorarios().addElement("11:03");
		ponto15.getHorarios().addElement("11:31");
		ponto15.getHorarios().addElement("11:59");
		ponto15.getHorarios().addElement("12:27");
		ponto15.getHorarios().addElement("12:55");
		ponto15.getHorarios().addElement("13:23");
		ponto15.getHorarios().addElement("13:51");
		ponto15.getHorarios().addElement("14:19");
		ponto15.getHorarios().addElement("14:47");
		ponto15.getHorarios().addElement("15:15");
		ponto15.getHorarios().addElement("15:43");
		ponto15.getHorarios().addElement("16:11");
		ponto15.getHorarios().addElement("16:59");
		ponto15.getHorarios().addElement("17:07");
		ponto15.getHorarios().addElement("17:35");
		ponto15.getHorarios().addElement("18:03");
		ponto15.getHorarios().addElement("18:31");
		ponto15.getHorarios().addElement("19:19");
		ponto15.getHorarios().addElement("19:54");
		ponto15.getHorarios().addElement("20:29");
		ponto15.getHorarios().addElement("21:04");
		ponto15.getHorarios().addElement("21:49");
		ponto15.getHorarios().addElement("22:14");
		ponto15.getHorarios().addElement("22:49");
		Ponto ponto16 = new Ponto();
		ponto16.setNome("TERM. PAULISTA SENT.C.GDE.SUL");
		ponto16.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto16.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto16);
		ponto16.getHorarios().addElement("05:02");
		ponto16.getHorarios().addElement("05:24");
		ponto16.getHorarios().addElement("06:08");
		ponto16.getHorarios().addElement("06:30");
		ponto16.getHorarios().addElement("06:52");
		ponto16.getHorarios().addElement("07:13");
		ponto16.getHorarios().addElement("07:35");
		ponto16.getHorarios().addElement("07:57");
		ponto16.getHorarios().addElement("08:19");
		ponto16.getHorarios().addElement("08:38");
		ponto16.getHorarios().addElement("09:03");
		ponto16.getHorarios().addElement("09:25");
		ponto16.getHorarios().addElement("09:47");
		ponto16.getHorarios().addElement("10:09");
		ponto16.getHorarios().addElement("10:49");
		ponto16.getHorarios().addElement("11:13");
		ponto16.getHorarios().addElement("11:51");
		ponto16.getHorarios().addElement("12:19");
		ponto16.getHorarios().addElement("12:47");
		ponto16.getHorarios().addElement("13:15");
		ponto16.getHorarios().addElement("13:43");
		ponto16.getHorarios().addElement("14:11");
		ponto16.getHorarios().addElement("14:39");
		ponto16.getHorarios().addElement("15:07");
		ponto16.getHorarios().addElement("15:35");
		ponto16.getHorarios().addElement("16:03");
		ponto16.getHorarios().addElement("16:31");
		ponto16.getHorarios().addElement("16:59");
		ponto16.getHorarios().addElement("17:27");
		ponto16.getHorarios().addElement("17:45");
		ponto16.getHorarios().addElement("18:43");
		ponto16.getHorarios().addElement("18:51");
		ponto16.getHorarios().addElement("19:19");
		ponto16.getHorarios().addElement("19:47");
		ponto16.getHorarios().addElement("20:15");
		ponto16.getHorarios().addElement("21:03");
		ponto16.getHorarios().addElement("21:39");
		ponto16.getHorarios().addElement("22:13");
		ponto16.getHorarios().addElement("23:03");
		ponto16.getHorarios().addElement("23:23");
		ponto16.getHorarios().addElement("23:58");
		ponto16.getHorarios().addElement("00:33");
		Ponto ponto17 = new Ponto();
		ponto17.setNome("BAIRRO MANDASSAIA");
		ponto17.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto17.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto17);
		ponto17.getHorarios().addElement("07:15");
		ponto17.getHorarios().addElement("11:50");
		ponto17.getHorarios().addElement("16:50");
		Ponto ponto18 = new Ponto();
		ponto18.setNome("TERMINAL C.GRANDE DO SUL");
		ponto18.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto18.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto18);
		ponto18.getHorarios().addElement("05:00");
		ponto18.getHorarios().addElement("05:30");
		ponto18.getHorarios().addElement("06:00");
		ponto18.getHorarios().addElement("06:30");
		ponto18.getHorarios().addElement("07:00");
		ponto18.getHorarios().addElement("07:02");
		ponto18.getHorarios().addElement("07:30");
		ponto18.getHorarios().addElement("08:00");
		ponto18.getHorarios().addElement("08:30");
		ponto18.getHorarios().addElement("09:00");
		ponto18.getHorarios().addElement("09:30");
		ponto18.getHorarios().addElement("10:00");
		ponto18.getHorarios().addElement("10:30");
		ponto18.getHorarios().addElement("11:00");
		ponto18.getHorarios().addElement("11:30");
		ponto18.getHorarios().addElement("11:36");
		ponto18.getHorarios().addElement("12:05");
		ponto18.getHorarios().addElement("12:30");
		ponto18.getHorarios().addElement("13:00");
		ponto18.getHorarios().addElement("13:30");
		ponto18.getHorarios().addElement("14:00");
		ponto18.getHorarios().addElement("14:30");
		ponto18.getHorarios().addElement("15:00");
		ponto18.getHorarios().addElement("15:30");
		ponto18.getHorarios().addElement("16:00");
		ponto18.getHorarios().addElement("16:30");
		ponto18.getHorarios().addElement("16:36");
		ponto18.getHorarios().addElement("17:05");
		ponto18.getHorarios().addElement("17:30");
		ponto18.getHorarios().addElement("18:00");
		ponto18.getHorarios().addElement("18:30");
		ponto18.getHorarios().addElement("19:10");
		ponto18.getHorarios().addElement("19:57");
		ponto18.getHorarios().addElement("20:44");
		ponto18.getHorarios().addElement("21:35");
		ponto18.getHorarios().addElement("22:51");
		Ponto ponto19 = new Ponto();
		ponto19.setNome("TERMINAL GUADALUPE");
		ponto19.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto19.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto19);
		ponto19.getHorarios().addElement("06:06");
		ponto19.getHorarios().addElement("06:45");
		ponto19.getHorarios().addElement("07:15");
		ponto19.getHorarios().addElement("07:45");
		ponto19.getHorarios().addElement("08:15");
		ponto19.getHorarios().addElement("08:45");
		ponto19.getHorarios().addElement("09:15");
		ponto19.getHorarios().addElement("09:45");
		ponto19.getHorarios().addElement("10:15");
		ponto19.getHorarios().addElement("10:40");
		ponto19.getHorarios().addElement("11:15");
		ponto19.getHorarios().addElement("11:45");
		ponto19.getHorarios().addElement("12:15");
		ponto19.getHorarios().addElement("12:45");
		ponto19.getHorarios().addElement("13:15");
		ponto19.getHorarios().addElement("13:45");
		ponto19.getHorarios().addElement("14:15");
		ponto19.getHorarios().addElement("14:45");
		ponto19.getHorarios().addElement("15:15");
		ponto19.getHorarios().addElement("15:40");
		ponto19.getHorarios().addElement("16:15");
		ponto19.getHorarios().addElement("16:45");
		ponto19.getHorarios().addElement("17:15");
		ponto19.getHorarios().addElement("17:45");
		ponto19.getHorarios().addElement("18:15");
		ponto19.getHorarios().addElement("18:45");
		ponto19.getHorarios().addElement("19:10");
		ponto19.getHorarios().addElement("19:45");
		ponto19.getHorarios().addElement("20:32");
		ponto19.getHorarios().addElement("21:07");
		ponto19.getHorarios().addElement("21:55");
		ponto19.getHorarios().addElement("22:46");
		ponto19.getHorarios().addElement("23:51");
		Ponto ponto20 = new Ponto();
		ponto20.setNome("TERM. PAULISTA SENT.CURITIBA");
		ponto20.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto20.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto20);
		ponto20.getHorarios().addElement("05:11");
		ponto20.getHorarios().addElement("05:41");
		ponto20.getHorarios().addElement("06:11");
		ponto20.getHorarios().addElement("06:41");
		ponto20.getHorarios().addElement("07:11");
		ponto20.getHorarios().addElement("07:41");
		ponto20.getHorarios().addElement("08:11");
		ponto20.getHorarios().addElement("08:41");
		ponto20.getHorarios().addElement("09:11");
		ponto20.getHorarios().addElement("09:46");
		ponto20.getHorarios().addElement("10:11");
		ponto20.getHorarios().addElement("10:41");
		ponto20.getHorarios().addElement("11:11");
		ponto20.getHorarios().addElement("11:41");
		ponto20.getHorarios().addElement("12:11");
		ponto20.getHorarios().addElement("12:41");
		ponto20.getHorarios().addElement("13:11");
		ponto20.getHorarios().addElement("13:46");
		ponto20.getHorarios().addElement("14:11");
		ponto20.getHorarios().addElement("14:41");
		ponto20.getHorarios().addElement("15:11");
		ponto20.getHorarios().addElement("15:41");
		ponto20.getHorarios().addElement("16:11");
		ponto20.getHorarios().addElement("16:41");
		ponto20.getHorarios().addElement("17:16");
		ponto20.getHorarios().addElement("17:41");
		ponto20.getHorarios().addElement("18:11");
		ponto20.getHorarios().addElement("18:41");
		ponto20.getHorarios().addElement("19:21");
		ponto20.getHorarios().addElement("20:08");
		ponto20.getHorarios().addElement("20:55");
		ponto20.getHorarios().addElement("21:46");
		ponto20.getHorarios().addElement("23:02");
		Ponto ponto21 = new Ponto();
		ponto21.setNome("TERM. PAULISTA SENT.C.GDE.SUL");
		ponto21.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto21.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto21);
		ponto21.getHorarios().addElement("05:15");
		ponto21.getHorarios().addElement("05:45");
		ponto21.getHorarios().addElement("06:10");
		ponto21.getHorarios().addElement("06:40");
		ponto21.getHorarios().addElement("06:51");
		ponto21.getHorarios().addElement("07:30");
		ponto21.getHorarios().addElement("08:00");
		ponto21.getHorarios().addElement("08:30");
		ponto21.getHorarios().addElement("09:00");
		ponto21.getHorarios().addElement("09:30");
		ponto21.getHorarios().addElement("10:00");
		ponto21.getHorarios().addElement("10:30");
		ponto21.getHorarios().addElement("11:00");
		ponto21.getHorarios().addElement("11:25");
		ponto21.getHorarios().addElement("12:00");
		ponto21.getHorarios().addElement("12:30");
		ponto21.getHorarios().addElement("13:00");
		ponto21.getHorarios().addElement("13:30");
		ponto21.getHorarios().addElement("14:00");
		ponto21.getHorarios().addElement("14:30");
		ponto21.getHorarios().addElement("15:00");
		ponto21.getHorarios().addElement("15:30");
		ponto21.getHorarios().addElement("16:00");
		ponto21.getHorarios().addElement("16:25");
		ponto21.getHorarios().addElement("17:00");
		ponto21.getHorarios().addElement("17:30");
		ponto21.getHorarios().addElement("18:00");
		ponto21.getHorarios().addElement("18:30");
		ponto21.getHorarios().addElement("19:00");
		ponto21.getHorarios().addElement("19:30");
		ponto21.getHorarios().addElement("19:55");
		ponto21.getHorarios().addElement("20:30");
		ponto21.getHorarios().addElement("21:17");
		ponto21.getHorarios().addElement("21:52");
		ponto21.getHorarios().addElement("22:40");
		ponto21.getHorarios().addElement("23:31");
		ponto21.getHorarios().addElement("00:41");
		return onibus;
		}
	}
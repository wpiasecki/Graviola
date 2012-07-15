
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus826 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("C. COMPRIDO / CIC");
		onibus.setCodigo("826");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERM.CAIUA SENTIDO TERM.C.COMP");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:39");
		ponto0.getHorarios().addElement("05:58");
		ponto0.getHorarios().addElement("06:17");
		ponto0.getHorarios().addElement("06:34");
		ponto0.getHorarios().addElement("06:51");
		ponto0.getHorarios().addElement("07:08");
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("07:42");
		ponto0.getHorarios().addElement("08:01");
		ponto0.getHorarios().addElement("08:16");
		ponto0.getHorarios().addElement("08:53");
		ponto0.getHorarios().addElement("09:27");
		ponto0.getHorarios().addElement("10:03");
		ponto0.getHorarios().addElement("10:38");
		ponto0.getHorarios().addElement("11:13");
		ponto0.getHorarios().addElement("11:48");
		ponto0.getHorarios().addElement("12:23");
		ponto0.getHorarios().addElement("12:58");
		ponto0.getHorarios().addElement("13:33");
		ponto0.getHorarios().addElement("14:08");
		ponto0.getHorarios().addElement("14:43");
		ponto0.getHorarios().addElement("15:18");
		ponto0.getHorarios().addElement("15:53");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("17:07");
		ponto0.getHorarios().addElement("17:27");
		ponto0.getHorarios().addElement("17:48");
		ponto0.getHorarios().addElement("18:09");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("19:07");
		ponto0.getHorarios().addElement("19:27");
		ponto0.getHorarios().addElement("19:47");
		ponto0.getHorarios().addElement("20:14");
		ponto0.getHorarios().addElement("20:51");
		ponto0.getHorarios().addElement("21:52");
		ponto0.getHorarios().addElement("22:51");
		ponto0.getHorarios().addElement("23:54");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO COMPRIDO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:10");
		ponto1.getHorarios().addElement("05:27");
		ponto1.getHorarios().addElement("05:40");
		ponto1.getHorarios().addElement("06:01");
		ponto1.getHorarios().addElement("06:18");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:52");
		ponto1.getHorarios().addElement("07:09");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("08:01");
		ponto1.getHorarios().addElement("08:36");
		ponto1.getHorarios().addElement("09:11");
		ponto1.getHorarios().addElement("09:46");
		ponto1.getHorarios().addElement("10:21");
		ponto1.getHorarios().addElement("10:56");
		ponto1.getHorarios().addElement("11:31");
		ponto1.getHorarios().addElement("12:06");
		ponto1.getHorarios().addElement("12:41");
		ponto1.getHorarios().addElement("13:16");
		ponto1.getHorarios().addElement("13:51");
		ponto1.getHorarios().addElement("14:26");
		ponto1.getHorarios().addElement("15:01");
		ponto1.getHorarios().addElement("15:36");
		ponto1.getHorarios().addElement("16:11");
		ponto1.getHorarios().addElement("16:29");
		ponto1.getHorarios().addElement("16:47");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:25");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:06");
		ponto1.getHorarios().addElement("18:28");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("19:05");
		ponto1.getHorarios().addElement("19:25");
		ponto1.getHorarios().addElement("19:45");
		ponto1.getHorarios().addElement("20:05");
		ponto1.getHorarios().addElement("21:05");
		ponto1.getHorarios().addElement("22:06");
		ponto1.getHorarios().addElement("23:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CIC");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:42");
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:18");
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("06:52");
		ponto2.getHorarios().addElement("07:09");
		ponto2.getHorarios().addElement("07:26");
		ponto2.getHorarios().addElement("07:43");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:36");
		ponto2.getHorarios().addElement("09:11");
		ponto2.getHorarios().addElement("09:46");
		ponto2.getHorarios().addElement("10:21");
		ponto2.getHorarios().addElement("10:56");
		ponto2.getHorarios().addElement("11:32");
		ponto2.getHorarios().addElement("12:07");
		ponto2.getHorarios().addElement("12:42");
		ponto2.getHorarios().addElement("13:17");
		ponto2.getHorarios().addElement("13:52");
		ponto2.getHorarios().addElement("14:27");
		ponto2.getHorarios().addElement("15:02");
		ponto2.getHorarios().addElement("15:37");
		ponto2.getHorarios().addElement("16:13");
		ponto2.getHorarios().addElement("16:49");
		ponto2.getHorarios().addElement("17:09");
		ponto2.getHorarios().addElement("17:29");
		ponto2.getHorarios().addElement("17:48");
		ponto2.getHorarios().addElement("18:07");
		ponto2.getHorarios().addElement("18:27");
		ponto2.getHorarios().addElement("18:48");
		ponto2.getHorarios().addElement("19:09");
		ponto2.getHorarios().addElement("19:27");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("20:37");
		ponto2.getHorarios().addElement("21:37");
		ponto2.getHorarios().addElement("22:37");
		ponto2.getHorarios().addElement("23:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERM. CAIUA SENTIDO CIC");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:26");
		ponto3.getHorarios().addElement("05:45");
		ponto3.getHorarios().addElement("06:02");
		ponto3.getHorarios().addElement("06:19");
		ponto3.getHorarios().addElement("06:36");
		ponto3.getHorarios().addElement("06:53");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:27");
		ponto3.getHorarios().addElement("07:44");
		ponto3.getHorarios().addElement("08:19");
		ponto3.getHorarios().addElement("08:54");
		ponto3.getHorarios().addElement("09:29");
		ponto3.getHorarios().addElement("10:04");
		ponto3.getHorarios().addElement("10:39");
		ponto3.getHorarios().addElement("11:14");
		ponto3.getHorarios().addElement("11:49");
		ponto3.getHorarios().addElement("12:24");
		ponto3.getHorarios().addElement("12:59");
		ponto3.getHorarios().addElement("13:34");
		ponto3.getHorarios().addElement("14:09");
		ponto3.getHorarios().addElement("14:44");
		ponto3.getHorarios().addElement("15:19");
		ponto3.getHorarios().addElement("15:54");
		ponto3.getHorarios().addElement("16:31");
		ponto3.getHorarios().addElement("16:53");
		ponto3.getHorarios().addElement("17:11");
		ponto3.getHorarios().addElement("17:29");
		ponto3.getHorarios().addElement("17:49");
		ponto3.getHorarios().addElement("18:09");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("18:52");
		ponto3.getHorarios().addElement("19:09");
		ponto3.getHorarios().addElement("19:29");
		ponto3.getHorarios().addElement("19:43");
		ponto3.getHorarios().addElement("20:03");
		ponto3.getHorarios().addElement("20:23");
		ponto3.getHorarios().addElement("21:23");
		ponto3.getHorarios().addElement("22:23");
		ponto3.getHorarios().addElement("23:26");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERM.CAIUA SENTIDO TERM.C.COMP");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("30/07/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:10");
		ponto4.getHorarios().addElement("06:40");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("07:40");
		ponto4.getHorarios().addElement("08:10");
		ponto4.getHorarios().addElement("08:40");
		ponto4.getHorarios().addElement("09:42");
		ponto4.getHorarios().addElement("10:44");
		ponto4.getHorarios().addElement("11:49");
		ponto4.getHorarios().addElement("12:53");
		ponto4.getHorarios().addElement("13:57");
		ponto4.getHorarios().addElement("15:01");
		ponto4.getHorarios().addElement("16:05");
		ponto4.getHorarios().addElement("17:09");
		ponto4.getHorarios().addElement("18:13");
		ponto4.getHorarios().addElement("19:14");
		ponto4.getHorarios().addElement("20:14");
		ponto4.getHorarios().addElement("21:14");
		ponto4.getHorarios().addElement("22:14");
		ponto4.getHorarios().addElement("23:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CAMPO COMPRIDO");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("30/07/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:56");
		ponto5.getHorarios().addElement("06:26");
		ponto5.getHorarios().addElement("06:56");
		ponto5.getHorarios().addElement("07:26");
		ponto5.getHorarios().addElement("07:56");
		ponto5.getHorarios().addElement("08:26");
		ponto5.getHorarios().addElement("08:56");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("11:02");
		ponto5.getHorarios().addElement("12:06");
		ponto5.getHorarios().addElement("13:10");
		ponto5.getHorarios().addElement("14:14");
		ponto5.getHorarios().addElement("15:18");
		ponto5.getHorarios().addElement("16:22");
		ponto5.getHorarios().addElement("17:26");
		ponto5.getHorarios().addElement("18:30");
		ponto5.getHorarios().addElement("19:30");
		ponto5.getHorarios().addElement("20:30");
		ponto5.getHorarios().addElement("21:30");
		ponto5.getHorarios().addElement("22:31");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL CIC");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("30/07/2011");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:56");
		ponto6.getHorarios().addElement("06:26");
		ponto6.getHorarios().addElement("06:56");
		ponto6.getHorarios().addElement("07:26");
		ponto6.getHorarios().addElement("07:56");
		ponto6.getHorarios().addElement("08:26");
		ponto6.getHorarios().addElement("09:28");
		ponto6.getHorarios().addElement("10:30");
		ponto6.getHorarios().addElement("11:34");
		ponto6.getHorarios().addElement("12:38");
		ponto6.getHorarios().addElement("13:42");
		ponto6.getHorarios().addElement("14:46");
		ponto6.getHorarios().addElement("15:50");
		ponto6.getHorarios().addElement("16:54");
		ponto6.getHorarios().addElement("17:58");
		ponto6.getHorarios().addElement("19:00");
		ponto6.getHorarios().addElement("20:00");
		ponto6.getHorarios().addElement("21:00");
		ponto6.getHorarios().addElement("22:00");
		ponto6.getHorarios().addElement("23:01");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERM. CAIUA SENTIDO CIC");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("30/07/2011");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:12");
		ponto7.getHorarios().addElement("06:42");
		ponto7.getHorarios().addElement("07:12");
		ponto7.getHorarios().addElement("07:42");
		ponto7.getHorarios().addElement("08:12");
		ponto7.getHorarios().addElement("08:42");
		ponto7.getHorarios().addElement("09:13");
		ponto7.getHorarios().addElement("10:16");
		ponto7.getHorarios().addElement("11:19");
		ponto7.getHorarios().addElement("12:23");
		ponto7.getHorarios().addElement("13:27");
		ponto7.getHorarios().addElement("14:31");
		ponto7.getHorarios().addElement("15:35");
		ponto7.getHorarios().addElement("16:39");
		ponto7.getHorarios().addElement("17:43");
		ponto7.getHorarios().addElement("18:46");
		ponto7.getHorarios().addElement("19:46");
		ponto7.getHorarios().addElement("20:46");
		ponto7.getHorarios().addElement("21:46");
		ponto7.getHorarios().addElement("22:47");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERM.CAIUA SENTIDO TERM.C.COMP");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("31/07/2011");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("06:02");
		ponto8.getHorarios().addElement("07:06");
		ponto8.getHorarios().addElement("08:10");
		ponto8.getHorarios().addElement("09:14");
		ponto8.getHorarios().addElement("10:18");
		ponto8.getHorarios().addElement("11:22");
		ponto8.getHorarios().addElement("12:26");
		ponto8.getHorarios().addElement("13:30");
		ponto8.getHorarios().addElement("14:34");
		ponto8.getHorarios().addElement("15:38");
		ponto8.getHorarios().addElement("16:42");
		ponto8.getHorarios().addElement("17:46");
		ponto8.getHorarios().addElement("18:50");
		ponto8.getHorarios().addElement("19:54");
		ponto8.getHorarios().addElement("20:58");
		ponto8.getHorarios().addElement("22:02");
		ponto8.getHorarios().addElement("23:07");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL CAMPO COMPRIDO");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("31/07/2011");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("05:15");
		ponto9.getHorarios().addElement("06:19");
		ponto9.getHorarios().addElement("07:23");
		ponto9.getHorarios().addElement("08:27");
		ponto9.getHorarios().addElement("09:31");
		ponto9.getHorarios().addElement("10:35");
		ponto9.getHorarios().addElement("11:39");
		ponto9.getHorarios().addElement("12:43");
		ponto9.getHorarios().addElement("13:47");
		ponto9.getHorarios().addElement("14:51");
		ponto9.getHorarios().addElement("15:55");
		ponto9.getHorarios().addElement("16:59");
		ponto9.getHorarios().addElement("18:03");
		ponto9.getHorarios().addElement("19:07");
		ponto9.getHorarios().addElement("20:11");
		ponto9.getHorarios().addElement("21:15");
		ponto9.getHorarios().addElement("22:20");
		ponto9.getHorarios().addElement("23:30");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("TERMINAL CIC");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("31/07/2011");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:47");
		ponto10.getHorarios().addElement("06:51");
		ponto10.getHorarios().addElement("07:55");
		ponto10.getHorarios().addElement("08:59");
		ponto10.getHorarios().addElement("10:03");
		ponto10.getHorarios().addElement("11:07");
		ponto10.getHorarios().addElement("12:11");
		ponto10.getHorarios().addElement("13:15");
		ponto10.getHorarios().addElement("14:19");
		ponto10.getHorarios().addElement("15:23");
		ponto10.getHorarios().addElement("16:27");
		ponto10.getHorarios().addElement("17:31");
		ponto10.getHorarios().addElement("18:35");
		ponto10.getHorarios().addElement("19:39");
		ponto10.getHorarios().addElement("20:43");
		ponto10.getHorarios().addElement("21:47");
		ponto10.getHorarios().addElement("22:52");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("TERM. CAIUA SENTIDO CIC");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("31/07/2011");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("05:32");
		ponto11.getHorarios().addElement("06:36");
		ponto11.getHorarios().addElement("07:40");
		ponto11.getHorarios().addElement("08:44");
		ponto11.getHorarios().addElement("09:48");
		ponto11.getHorarios().addElement("10:52");
		ponto11.getHorarios().addElement("11:56");
		ponto11.getHorarios().addElement("13:00");
		ponto11.getHorarios().addElement("14:04");
		ponto11.getHorarios().addElement("15:08");
		ponto11.getHorarios().addElement("16:12");
		ponto11.getHorarios().addElement("17:16");
		ponto11.getHorarios().addElement("18:20");
		ponto11.getHorarios().addElement("19:24");
		ponto11.getHorarios().addElement("20:28");
		ponto11.getHorarios().addElement("21:32");
		ponto11.getHorarios().addElement("22:37");
		ponto11.getHorarios().addElement("23:46");
		return onibus;
		}
	}
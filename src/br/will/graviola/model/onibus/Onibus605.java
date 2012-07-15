
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus605 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / FAZ. RIO GRANDE");
		onibus.setCodigo("605");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("E.T.RODOF.-SENT.CARLOS GOMES");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:04");
		ponto0.getHorarios().addElement("17:16");
		ponto0.getHorarios().addElement("17:28");
		ponto0.getHorarios().addElement("17:46");
		ponto0.getHorarios().addElement("18:05");
		ponto0.getHorarios().addElement("18:28");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("E.T.RODOFERROV.-SENT.FAZENDA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:08");
		ponto1.getHorarios().addElement("07:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESTACAO TUBO CARLOS GOMES");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:10");
		ponto2.getHorarios().addElement("06:20");
		ponto2.getHorarios().addElement("06:26");
		ponto2.getHorarios().addElement("06:32");
		ponto2.getHorarios().addElement("06:36");
		ponto2.getHorarios().addElement("06:40");
		ponto2.getHorarios().addElement("06:44");
		ponto2.getHorarios().addElement("06:50");
		ponto2.getHorarios().addElement("06:56");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:06");
		ponto2.getHorarios().addElement("07:08");
		ponto2.getHorarios().addElement("07:14");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("07:28");
		ponto2.getHorarios().addElement("07:36");
		ponto2.getHorarios().addElement("07:44");
		ponto2.getHorarios().addElement("07:52");
		ponto2.getHorarios().addElement("08:01");
		ponto2.getHorarios().addElement("08:14");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("08:47");
		ponto2.getHorarios().addElement("09:05");
		ponto2.getHorarios().addElement("09:22");
		ponto2.getHorarios().addElement("09:39");
		ponto2.getHorarios().addElement("09:57");
		ponto2.getHorarios().addElement("10:13");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("10:48");
		ponto2.getHorarios().addElement("11:05");
		ponto2.getHorarios().addElement("11:21");
		ponto2.getHorarios().addElement("11:37");
		ponto2.getHorarios().addElement("11:55");
		ponto2.getHorarios().addElement("12:12");
		ponto2.getHorarios().addElement("12:28");
		ponto2.getHorarios().addElement("12:45");
		ponto2.getHorarios().addElement("13:03");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("13:37");
		ponto2.getHorarios().addElement("13:54");
		ponto2.getHorarios().addElement("14:11");
		ponto2.getHorarios().addElement("14:28");
		ponto2.getHorarios().addElement("14:44");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:17");
		ponto2.getHorarios().addElement("15:34");
		ponto2.getHorarios().addElement("15:52");
		ponto2.getHorarios().addElement("16:09");
		ponto2.getHorarios().addElement("16:18");
		ponto2.getHorarios().addElement("16:26");
		ponto2.getHorarios().addElement("16:33");
		ponto2.getHorarios().addElement("16:41");
		ponto2.getHorarios().addElement("16:48");
		ponto2.getHorarios().addElement("16:56");
		ponto2.getHorarios().addElement("17:03");
		ponto2.getHorarios().addElement("17:09");
		ponto2.getHorarios().addElement("17:16");
		ponto2.getHorarios().addElement("17:21");
		ponto2.getHorarios().addElement("17:26");
		ponto2.getHorarios().addElement("17:33");
		ponto2.getHorarios().addElement("17:41");
		ponto2.getHorarios().addElement("17:46");
		ponto2.getHorarios().addElement("17:51");
		ponto2.getHorarios().addElement("17:56");
		ponto2.getHorarios().addElement("18:03");
		ponto2.getHorarios().addElement("18:10");
		ponto2.getHorarios().addElement("18:18");
		ponto2.getHorarios().addElement("18:26");
		ponto2.getHorarios().addElement("18:33");
		ponto2.getHorarios().addElement("18:41");
		ponto2.getHorarios().addElement("18:46");
		ponto2.getHorarios().addElement("18:51");
		ponto2.getHorarios().addElement("18:56");
		ponto2.getHorarios().addElement("19:03");
		ponto2.getHorarios().addElement("19:10");
		ponto2.getHorarios().addElement("19:20");
		ponto2.getHorarios().addElement("19:30");
		ponto2.getHorarios().addElement("19:40");
		ponto2.getHorarios().addElement("19:50");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("20:14");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("20:50");
		ponto2.getHorarios().addElement("21:10");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("21:50");
		ponto2.getHorarios().addElement("22:10");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("22:50");
		ponto2.getHorarios().addElement("23:10");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("23:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESTACAO TUBO PUC");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("13/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("22:14");
		ponto3.getHorarios().addElement("22:54");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("13/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:20");
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("05:36");
		ponto4.getHorarios().addElement("05:42");
		ponto4.getHorarios().addElement("05:46");
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("05:54");
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:06");
		ponto4.getHorarios().addElement("06:10");
		ponto4.getHorarios().addElement("06:14");
		ponto4.getHorarios().addElement("06:18");
		ponto4.getHorarios().addElement("06:24");
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("06:34");
		ponto4.getHorarios().addElement("06:38");
		ponto4.getHorarios().addElement("06:42");
		ponto4.getHorarios().addElement("06:48");
		ponto4.getHorarios().addElement("06:54");
		ponto4.getHorarios().addElement("06:58");
		ponto4.getHorarios().addElement("07:02");
		ponto4.getHorarios().addElement("07:06");
		ponto4.getHorarios().addElement("07:12");
		ponto4.getHorarios().addElement("07:18");
		ponto4.getHorarios().addElement("07:22");
		ponto4.getHorarios().addElement("07:26");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("07:36");
		ponto4.getHorarios().addElement("07:42");
		ponto4.getHorarios().addElement("07:48");
		ponto4.getHorarios().addElement("07:54");
		ponto4.getHorarios().addElement("08:05");
		ponto4.getHorarios().addElement("08:16");
		ponto4.getHorarios().addElement("08:28");
		ponto4.getHorarios().addElement("08:40");
		ponto4.getHorarios().addElement("08:52");
		ponto4.getHorarios().addElement("09:04");
		ponto4.getHorarios().addElement("09:21");
		ponto4.getHorarios().addElement("09:38");
		ponto4.getHorarios().addElement("09:55");
		ponto4.getHorarios().addElement("10:12");
		ponto4.getHorarios().addElement("10:29");
		ponto4.getHorarios().addElement("10:46");
		ponto4.getHorarios().addElement("11:03");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("11:37");
		ponto4.getHorarios().addElement("11:54");
		ponto4.getHorarios().addElement("12:11");
		ponto4.getHorarios().addElement("12:28");
		ponto4.getHorarios().addElement("12:45");
		ponto4.getHorarios().addElement("13:02");
		ponto4.getHorarios().addElement("13:19");
		ponto4.getHorarios().addElement("13:36");
		ponto4.getHorarios().addElement("13:53");
		ponto4.getHorarios().addElement("14:10");
		ponto4.getHorarios().addElement("14:27");
		ponto4.getHorarios().addElement("14:44");
		ponto4.getHorarios().addElement("15:01");
		ponto4.getHorarios().addElement("15:18");
		ponto4.getHorarios().addElement("15:35");
		ponto4.getHorarios().addElement("15:52");
		ponto4.getHorarios().addElement("16:09");
		ponto4.getHorarios().addElement("16:26");
		ponto4.getHorarios().addElement("16:43");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("17:12");
		ponto4.getHorarios().addElement("17:18");
		ponto4.getHorarios().addElement("17:26");
		ponto4.getHorarios().addElement("17:33");
		ponto4.getHorarios().addElement("17:41");
		ponto4.getHorarios().addElement("17:46");
		ponto4.getHorarios().addElement("17:51");
		ponto4.getHorarios().addElement("17:56");
		ponto4.getHorarios().addElement("18:03");
		ponto4.getHorarios().addElement("18:09");
		ponto4.getHorarios().addElement("18:21");
		ponto4.getHorarios().addElement("18:26");
		ponto4.getHorarios().addElement("18:33");
		ponto4.getHorarios().addElement("18:48");
		ponto4.getHorarios().addElement("19:05");
		ponto4.getHorarios().addElement("19:22");
		ponto4.getHorarios().addElement("19:41");
		ponto4.getHorarios().addElement("20:00");
		ponto4.getHorarios().addElement("20:20");
		ponto4.getHorarios().addElement("20:40");
		ponto4.getHorarios().addElement("21:00");
		ponto4.getHorarios().addElement("21:21");
		ponto4.getHorarios().addElement("21:42");
		ponto4.getHorarios().addElement("22:03");
		ponto4.getHorarios().addElement("22:24");
		ponto4.getHorarios().addElement("22:44");
		ponto4.getHorarios().addElement("23:01");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ESTACAO TUBO CARLOS GOMES");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("09/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:22");
		ponto5.getHorarios().addElement("06:36");
		ponto5.getHorarios().addElement("06:50");
		ponto5.getHorarios().addElement("07:04");
		ponto5.getHorarios().addElement("07:18");
		ponto5.getHorarios().addElement("07:32");
		ponto5.getHorarios().addElement("07:46");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("08:14");
		ponto5.getHorarios().addElement("08:28");
		ponto5.getHorarios().addElement("09:13");
		ponto5.getHorarios().addElement("09:35");
		ponto5.getHorarios().addElement("09:58");
		ponto5.getHorarios().addElement("10:20");
		ponto5.getHorarios().addElement("10:43");
		ponto5.getHorarios().addElement("11:05");
		ponto5.getHorarios().addElement("11:28");
		ponto5.getHorarios().addElement("11:50");
		ponto5.getHorarios().addElement("12:13");
		ponto5.getHorarios().addElement("12:35");
		ponto5.getHorarios().addElement("12:58");
		ponto5.getHorarios().addElement("13:20");
		ponto5.getHorarios().addElement("13:43");
		ponto5.getHorarios().addElement("14:05");
		ponto5.getHorarios().addElement("14:28");
		ponto5.getHorarios().addElement("14:50");
		ponto5.getHorarios().addElement("15:13");
		ponto5.getHorarios().addElement("15:35");
		ponto5.getHorarios().addElement("15:58");
		ponto5.getHorarios().addElement("16:20");
		ponto5.getHorarios().addElement("16:43");
		ponto5.getHorarios().addElement("17:05");
		ponto5.getHorarios().addElement("17:28");
		ponto5.getHorarios().addElement("17:50");
		ponto5.getHorarios().addElement("18:13");
		ponto5.getHorarios().addElement("18:35");
		ponto5.getHorarios().addElement("18:58");
		ponto5.getHorarios().addElement("19:20");
		ponto5.getHorarios().addElement("19:43");
		ponto5.getHorarios().addElement("20:05");
		ponto5.getHorarios().addElement("20:28");
		ponto5.getHorarios().addElement("20:50");
		ponto5.getHorarios().addElement("21:13");
		ponto5.getHorarios().addElement("21:43");
		ponto5.getHorarios().addElement("22:13");
		ponto5.getHorarios().addElement("22:43");
		ponto5.getHorarios().addElement("23:13");
		ponto5.getHorarios().addElement("23:43");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("09/06/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:40");
		ponto6.getHorarios().addElement("05:54");
		ponto6.getHorarios().addElement("06:08");
		ponto6.getHorarios().addElement("06:22");
		ponto6.getHorarios().addElement("06:36");
		ponto6.getHorarios().addElement("06:50");
		ponto6.getHorarios().addElement("07:04");
		ponto6.getHorarios().addElement("07:18");
		ponto6.getHorarios().addElement("07:32");
		ponto6.getHorarios().addElement("07:46");
		ponto6.getHorarios().addElement("08:00");
		ponto6.getHorarios().addElement("08:14");
		ponto6.getHorarios().addElement("08:28");
		ponto6.getHorarios().addElement("08:50");
		ponto6.getHorarios().addElement("09:13");
		ponto6.getHorarios().addElement("09:35");
		ponto6.getHorarios().addElement("09:58");
		ponto6.getHorarios().addElement("10:20");
		ponto6.getHorarios().addElement("10:43");
		ponto6.getHorarios().addElement("11:05");
		ponto6.getHorarios().addElement("11:28");
		ponto6.getHorarios().addElement("11:50");
		ponto6.getHorarios().addElement("12:13");
		ponto6.getHorarios().addElement("12:35");
		ponto6.getHorarios().addElement("12:58");
		ponto6.getHorarios().addElement("13:20");
		ponto6.getHorarios().addElement("13:43");
		ponto6.getHorarios().addElement("14:05");
		ponto6.getHorarios().addElement("14:28");
		ponto6.getHorarios().addElement("14:50");
		ponto6.getHorarios().addElement("15:13");
		ponto6.getHorarios().addElement("15:35");
		ponto6.getHorarios().addElement("15:58");
		ponto6.getHorarios().addElement("16:20");
		ponto6.getHorarios().addElement("16:43");
		ponto6.getHorarios().addElement("17:05");
		ponto6.getHorarios().addElement("17:28");
		ponto6.getHorarios().addElement("17:50");
		ponto6.getHorarios().addElement("18:13");
		ponto6.getHorarios().addElement("18:35");
		ponto6.getHorarios().addElement("18:58");
		ponto6.getHorarios().addElement("19:20");
		ponto6.getHorarios().addElement("19:43");
		ponto6.getHorarios().addElement("20:05");
		ponto6.getHorarios().addElement("20:28");
		ponto6.getHorarios().addElement("20:58");
		ponto6.getHorarios().addElement("21:25");
		ponto6.getHorarios().addElement("21:58");
		ponto6.getHorarios().addElement("22:28");
		ponto6.getHorarios().addElement("22:58");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("ESTACAO TUBO CARLOS GOMES");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:30");
		ponto7.getHorarios().addElement("07:00");
		ponto7.getHorarios().addElement("07:30");
		ponto7.getHorarios().addElement("08:00");
		ponto7.getHorarios().addElement("08:30");
		ponto7.getHorarios().addElement("09:00");
		ponto7.getHorarios().addElement("09:30");
		ponto7.getHorarios().addElement("10:00");
		ponto7.getHorarios().addElement("10:30");
		ponto7.getHorarios().addElement("11:00");
		ponto7.getHorarios().addElement("11:30");
		ponto7.getHorarios().addElement("12:00");
		ponto7.getHorarios().addElement("12:30");
		ponto7.getHorarios().addElement("13:00");
		ponto7.getHorarios().addElement("13:30");
		ponto7.getHorarios().addElement("14:00");
		ponto7.getHorarios().addElement("14:30");
		ponto7.getHorarios().addElement("15:00");
		ponto7.getHorarios().addElement("15:30");
		ponto7.getHorarios().addElement("16:00");
		ponto7.getHorarios().addElement("16:30");
		ponto7.getHorarios().addElement("17:00");
		ponto7.getHorarios().addElement("17:30");
		ponto7.getHorarios().addElement("18:00");
		ponto7.getHorarios().addElement("18:30");
		ponto7.getHorarios().addElement("19:00");
		ponto7.getHorarios().addElement("19:30");
		ponto7.getHorarios().addElement("20:00");
		ponto7.getHorarios().addElement("20:30");
		ponto7.getHorarios().addElement("21:00");
		ponto7.getHorarios().addElement("21:30");
		ponto7.getHorarios().addElement("22:00");
		ponto7.getHorarios().addElement("22:30");
		ponto7.getHorarios().addElement("23:00");
		ponto7.getHorarios().addElement("23:30");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:45");
		ponto8.getHorarios().addElement("06:15");
		ponto8.getHorarios().addElement("06:45");
		ponto8.getHorarios().addElement("07:15");
		ponto8.getHorarios().addElement("07:45");
		ponto8.getHorarios().addElement("08:15");
		ponto8.getHorarios().addElement("08:45");
		ponto8.getHorarios().addElement("09:15");
		ponto8.getHorarios().addElement("09:45");
		ponto8.getHorarios().addElement("10:15");
		ponto8.getHorarios().addElement("10:45");
		ponto8.getHorarios().addElement("11:15");
		ponto8.getHorarios().addElement("11:45");
		ponto8.getHorarios().addElement("12:15");
		ponto8.getHorarios().addElement("12:45");
		ponto8.getHorarios().addElement("13:15");
		ponto8.getHorarios().addElement("13:45");
		ponto8.getHorarios().addElement("14:15");
		ponto8.getHorarios().addElement("14:45");
		ponto8.getHorarios().addElement("15:15");
		ponto8.getHorarios().addElement("15:45");
		ponto8.getHorarios().addElement("16:15");
		ponto8.getHorarios().addElement("16:45");
		ponto8.getHorarios().addElement("17:15");
		ponto8.getHorarios().addElement("17:45");
		ponto8.getHorarios().addElement("18:15");
		ponto8.getHorarios().addElement("18:45");
		ponto8.getHorarios().addElement("19:15");
		ponto8.getHorarios().addElement("19:45");
		ponto8.getHorarios().addElement("20:15");
		ponto8.getHorarios().addElement("20:45");
		ponto8.getHorarios().addElement("21:15");
		ponto8.getHorarios().addElement("21:45");
		ponto8.getHorarios().addElement("22:15");
		ponto8.getHorarios().addElement("22:45");
		return onibus;
		}
	}
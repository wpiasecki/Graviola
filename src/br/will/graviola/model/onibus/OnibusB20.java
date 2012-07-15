
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusB20 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("GUARAITUBA / CABRAL");
		onibus.setCodigo("B20");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CABRAL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("10/05/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("05:47");
		ponto0.getHorarios().addElement("05:55");
		ponto0.getHorarios().addElement("06:03");
		ponto0.getHorarios().addElement("06:11");
		ponto0.getHorarios().addElement("06:18");
		ponto0.getHorarios().addElement("06:26");
		ponto0.getHorarios().addElement("06:34");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("06:49");
		ponto0.getHorarios().addElement("06:57");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:13");
		ponto0.getHorarios().addElement("07:21");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:44");
		ponto0.getHorarios().addElement("07:52");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:11");
		ponto0.getHorarios().addElement("08:22");
		ponto0.getHorarios().addElement("08:33");
		ponto0.getHorarios().addElement("08:45");
		ponto0.getHorarios().addElement("08:56");
		ponto0.getHorarios().addElement("09:07");
		ponto0.getHorarios().addElement("09:19");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("09:41");
		ponto0.getHorarios().addElement("09:53");
		ponto0.getHorarios().addElement("10:04");
		ponto0.getHorarios().addElement("10:15");
		ponto0.getHorarios().addElement("10:27");
		ponto0.getHorarios().addElement("10:38");
		ponto0.getHorarios().addElement("10:49");
		ponto0.getHorarios().addElement("11:01");
		ponto0.getHorarios().addElement("11:12");
		ponto0.getHorarios().addElement("11:23");
		ponto0.getHorarios().addElement("11:35");
		ponto0.getHorarios().addElement("11:46");
		ponto0.getHorarios().addElement("11:57");
		ponto0.getHorarios().addElement("12:09");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:31");
		ponto0.getHorarios().addElement("12:43");
		ponto0.getHorarios().addElement("12:54");
		ponto0.getHorarios().addElement("13:05");
		ponto0.getHorarios().addElement("13:17");
		ponto0.getHorarios().addElement("13:28");
		ponto0.getHorarios().addElement("13:39");
		ponto0.getHorarios().addElement("13:51");
		ponto0.getHorarios().addElement("14:02");
		ponto0.getHorarios().addElement("14:13");
		ponto0.getHorarios().addElement("14:25");
		ponto0.getHorarios().addElement("14:36");
		ponto0.getHorarios().addElement("14:47");
		ponto0.getHorarios().addElement("14:59");
		ponto0.getHorarios().addElement("15:10");
		ponto0.getHorarios().addElement("15:21");
		ponto0.getHorarios().addElement("15:33");
		ponto0.getHorarios().addElement("15:44");
		ponto0.getHorarios().addElement("15:55");
		ponto0.getHorarios().addElement("16:07");
		ponto0.getHorarios().addElement("16:18");
		ponto0.getHorarios().addElement("16:29");
		ponto0.getHorarios().addElement("16:41");
		ponto0.getHorarios().addElement("16:52");
		ponto0.getHorarios().addElement("17:04");
		ponto0.getHorarios().addElement("17:15");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:38");
		ponto0.getHorarios().addElement("17:49");
		ponto0.getHorarios().addElement("18:01");
		ponto0.getHorarios().addElement("18:12");
		ponto0.getHorarios().addElement("18:24");
		ponto0.getHorarios().addElement("18:35");
		ponto0.getHorarios().addElement("18:46");
		ponto0.getHorarios().addElement("18:58");
		ponto0.getHorarios().addElement("19:09");
		ponto0.getHorarios().addElement("19:21");
		ponto0.getHorarios().addElement("19:33");
		ponto0.getHorarios().addElement("19:46");
		ponto0.getHorarios().addElement("19:59");
		ponto0.getHorarios().addElement("20:12");
		ponto0.getHorarios().addElement("20:21");
		ponto0.getHorarios().addElement("20:29");
		ponto0.getHorarios().addElement("20:38");
		ponto0.getHorarios().addElement("20:50");
		ponto0.getHorarios().addElement("21:03");
		ponto0.getHorarios().addElement("21:28");
		ponto0.getHorarios().addElement("21:53");
		ponto0.getHorarios().addElement("22:18");
		ponto0.getHorarios().addElement("22:43");
		ponto0.getHorarios().addElement("23:08");
		ponto0.getHorarios().addElement("23:33");
		ponto0.getHorarios().addElement("23:58");
		ponto0.getHorarios().addElement("00:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUARAITUBA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("10/05/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:05");
		ponto1.getHorarios().addElement("05:12");
		ponto1.getHorarios().addElement("05:17");
		ponto1.getHorarios().addElement("05:25");
		ponto1.getHorarios().addElement("05:33");
		ponto1.getHorarios().addElement("05:41");
		ponto1.getHorarios().addElement("05:48");
		ponto1.getHorarios().addElement("05:56");
		ponto1.getHorarios().addElement("06:04");
		ponto1.getHorarios().addElement("06:11");
		ponto1.getHorarios().addElement("06:19");
		ponto1.getHorarios().addElement("06:27");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:43");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("06:58");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:14");
		ponto1.getHorarios().addElement("07:22");
		ponto1.getHorarios().addElement("07:31");
		ponto1.getHorarios().addElement("07:39");
		ponto1.getHorarios().addElement("07:47");
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("08:01");
		ponto1.getHorarios().addElement("08:08");
		ponto1.getHorarios().addElement("08:16");
		ponto1.getHorarios().addElement("08:24");
		ponto1.getHorarios().addElement("08:33");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("08:56");
		ponto1.getHorarios().addElement("09:07");
		ponto1.getHorarios().addElement("09:19");
		ponto1.getHorarios().addElement("09:30");
		ponto1.getHorarios().addElement("09:41");
		ponto1.getHorarios().addElement("09:53");
		ponto1.getHorarios().addElement("10:04");
		ponto1.getHorarios().addElement("10:15");
		ponto1.getHorarios().addElement("10:27");
		ponto1.getHorarios().addElement("10:38");
		ponto1.getHorarios().addElement("10:49");
		ponto1.getHorarios().addElement("11:01");
		ponto1.getHorarios().addElement("11:12");
		ponto1.getHorarios().addElement("11:23");
		ponto1.getHorarios().addElement("11:35");
		ponto1.getHorarios().addElement("11:46");
		ponto1.getHorarios().addElement("11:57");
		ponto1.getHorarios().addElement("12:09");
		ponto1.getHorarios().addElement("12:20");
		ponto1.getHorarios().addElement("12:31");
		ponto1.getHorarios().addElement("12:43");
		ponto1.getHorarios().addElement("12:54");
		ponto1.getHorarios().addElement("13:05");
		ponto1.getHorarios().addElement("13:17");
		ponto1.getHorarios().addElement("13:28");
		ponto1.getHorarios().addElement("13:39");
		ponto1.getHorarios().addElement("13:51");
		ponto1.getHorarios().addElement("14:02");
		ponto1.getHorarios().addElement("14:13");
		ponto1.getHorarios().addElement("14:25");
		ponto1.getHorarios().addElement("14:36");
		ponto1.getHorarios().addElement("14:47");
		ponto1.getHorarios().addElement("14:59");
		ponto1.getHorarios().addElement("15:10");
		ponto1.getHorarios().addElement("15:21");
		ponto1.getHorarios().addElement("15:33");
		ponto1.getHorarios().addElement("15:44");
		ponto1.getHorarios().addElement("15:55");
		ponto1.getHorarios().addElement("16:07");
		ponto1.getHorarios().addElement("16:18");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("16:42");
		ponto1.getHorarios().addElement("16:55");
		ponto1.getHorarios().addElement("17:06");
		ponto1.getHorarios().addElement("17:18");
		ponto1.getHorarios().addElement("17:32");
		ponto1.getHorarios().addElement("17:44");
		ponto1.getHorarios().addElement("17:55");
		ponto1.getHorarios().addElement("18:06");
		ponto1.getHorarios().addElement("18:18");
		ponto1.getHorarios().addElement("18:29");
		ponto1.getHorarios().addElement("18:41");
		ponto1.getHorarios().addElement("18:52");
		ponto1.getHorarios().addElement("19:04");
		ponto1.getHorarios().addElement("19:15");
		ponto1.getHorarios().addElement("19:26");
		ponto1.getHorarios().addElement("19:38");
		ponto1.getHorarios().addElement("19:49");
		ponto1.getHorarios().addElement("20:01");
		ponto1.getHorarios().addElement("20:13");
		ponto1.getHorarios().addElement("20:26");
		ponto1.getHorarios().addElement("20:51");
		ponto1.getHorarios().addElement("21:16");
		ponto1.getHorarios().addElement("21:41");
		ponto1.getHorarios().addElement("22:06");
		ponto1.getHorarios().addElement("22:31");
		ponto1.getHorarios().addElement("22:56");
		ponto1.getHorarios().addElement("23:21");
		ponto1.getHorarios().addElement("23:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CABRAL");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:06");
		ponto2.getHorarios().addElement("06:18");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("06:42");
		ponto2.getHorarios().addElement("06:54");
		ponto2.getHorarios().addElement("07:06");
		ponto2.getHorarios().addElement("07:18");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("07:42");
		ponto2.getHorarios().addElement("07:54");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:25");
		ponto2.getHorarios().addElement("08:40");
		ponto2.getHorarios().addElement("08:55");
		ponto2.getHorarios().addElement("09:10");
		ponto2.getHorarios().addElement("09:26");
		ponto2.getHorarios().addElement("09:41");
		ponto2.getHorarios().addElement("09:56");
		ponto2.getHorarios().addElement("10:11");
		ponto2.getHorarios().addElement("10:26");
		ponto2.getHorarios().addElement("10:42");
		ponto2.getHorarios().addElement("10:57");
		ponto2.getHorarios().addElement("11:12");
		ponto2.getHorarios().addElement("11:27");
		ponto2.getHorarios().addElement("11:42");
		ponto2.getHorarios().addElement("11:58");
		ponto2.getHorarios().addElement("12:13");
		ponto2.getHorarios().addElement("12:28");
		ponto2.getHorarios().addElement("12:43");
		ponto2.getHorarios().addElement("12:58");
		ponto2.getHorarios().addElement("13:14");
		ponto2.getHorarios().addElement("13:29");
		ponto2.getHorarios().addElement("13:44");
		ponto2.getHorarios().addElement("13:59");
		ponto2.getHorarios().addElement("14:14");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("14:45");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:15");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("15:46");
		ponto2.getHorarios().addElement("16:01");
		ponto2.getHorarios().addElement("16:16");
		ponto2.getHorarios().addElement("16:31");
		ponto2.getHorarios().addElement("16:46");
		ponto2.getHorarios().addElement("17:02");
		ponto2.getHorarios().addElement("17:17");
		ponto2.getHorarios().addElement("17:32");
		ponto2.getHorarios().addElement("17:47");
		ponto2.getHorarios().addElement("18:02");
		ponto2.getHorarios().addElement("18:18");
		ponto2.getHorarios().addElement("18:33");
		ponto2.getHorarios().addElement("18:48");
		ponto2.getHorarios().addElement("19:03");
		ponto2.getHorarios().addElement("19:18");
		ponto2.getHorarios().addElement("19:40");
		ponto2.getHorarios().addElement("19:53");
		ponto2.getHorarios().addElement("20:07");
		ponto2.getHorarios().addElement("20:20");
		ponto2.getHorarios().addElement("20:34");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("21:25");
		ponto2.getHorarios().addElement("21:50");
		ponto2.getHorarios().addElement("22:15");
		ponto2.getHorarios().addElement("22:40");
		ponto2.getHorarios().addElement("23:05");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("23:50");
		ponto2.getHorarios().addElement("00:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUARAITUBA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:30");
		ponto3.getHorarios().addElement("05:42");
		ponto3.getHorarios().addElement("05:54");
		ponto3.getHorarios().addElement("06:06");
		ponto3.getHorarios().addElement("06:18");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("06:42");
		ponto3.getHorarios().addElement("06:54");
		ponto3.getHorarios().addElement("07:06");
		ponto3.getHorarios().addElement("07:18");
		ponto3.getHorarios().addElement("07:32");
		ponto3.getHorarios().addElement("07:45");
		ponto3.getHorarios().addElement("07:58");
		ponto3.getHorarios().addElement("08:12");
		ponto3.getHorarios().addElement("08:18");
		ponto3.getHorarios().addElement("08:32");
		ponto3.getHorarios().addElement("08:48");
		ponto3.getHorarios().addElement("09:03");
		ponto3.getHorarios().addElement("09:18");
		ponto3.getHorarios().addElement("09:33");
		ponto3.getHorarios().addElement("09:48");
		ponto3.getHorarios().addElement("10:04");
		ponto3.getHorarios().addElement("10:19");
		ponto3.getHorarios().addElement("10:34");
		ponto3.getHorarios().addElement("10:49");
		ponto3.getHorarios().addElement("11:04");
		ponto3.getHorarios().addElement("11:20");
		ponto3.getHorarios().addElement("11:35");
		ponto3.getHorarios().addElement("11:50");
		ponto3.getHorarios().addElement("12:05");
		ponto3.getHorarios().addElement("12:20");
		ponto3.getHorarios().addElement("12:36");
		ponto3.getHorarios().addElement("12:51");
		ponto3.getHorarios().addElement("13:06");
		ponto3.getHorarios().addElement("13:21");
		ponto3.getHorarios().addElement("13:36");
		ponto3.getHorarios().addElement("13:52");
		ponto3.getHorarios().addElement("14:07");
		ponto3.getHorarios().addElement("14:22");
		ponto3.getHorarios().addElement("14:37");
		ponto3.getHorarios().addElement("14:52");
		ponto3.getHorarios().addElement("15:08");
		ponto3.getHorarios().addElement("15:23");
		ponto3.getHorarios().addElement("15:38");
		ponto3.getHorarios().addElement("15:53");
		ponto3.getHorarios().addElement("16:08");
		ponto3.getHorarios().addElement("16:24");
		ponto3.getHorarios().addElement("16:39");
		ponto3.getHorarios().addElement("16:54");
		ponto3.getHorarios().addElement("17:09");
		ponto3.getHorarios().addElement("17:24");
		ponto3.getHorarios().addElement("17:40");
		ponto3.getHorarios().addElement("17:55");
		ponto3.getHorarios().addElement("18:10");
		ponto3.getHorarios().addElement("18:25");
		ponto3.getHorarios().addElement("18:40");
		ponto3.getHorarios().addElement("18:56");
		ponto3.getHorarios().addElement("19:11");
		ponto3.getHorarios().addElement("19:26");
		ponto3.getHorarios().addElement("19:41");
		ponto3.getHorarios().addElement("19:56");
		ponto3.getHorarios().addElement("20:22");
		ponto3.getHorarios().addElement("20:47");
		ponto3.getHorarios().addElement("21:12");
		ponto3.getHorarios().addElement("21:38");
		ponto3.getHorarios().addElement("22:05");
		ponto3.getHorarios().addElement("22:30");
		ponto3.getHorarios().addElement("22:55");
		ponto3.getHorarios().addElement("23:15");
		ponto3.getHorarios().addElement("23:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL CABRAL");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("30/11/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:35");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("07:45");
		ponto4.getHorarios().addElement("08:27");
		ponto4.getHorarios().addElement("08:58");
		ponto4.getHorarios().addElement("09:24");
		ponto4.getHorarios().addElement("09:49");
		ponto4.getHorarios().addElement("10:14");
		ponto4.getHorarios().addElement("10:40");
		ponto4.getHorarios().addElement("11:05");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("11:56");
		ponto4.getHorarios().addElement("12:21");
		ponto4.getHorarios().addElement("12:46");
		ponto4.getHorarios().addElement("13:12");
		ponto4.getHorarios().addElement("13:37");
		ponto4.getHorarios().addElement("14:02");
		ponto4.getHorarios().addElement("14:28");
		ponto4.getHorarios().addElement("14:53");
		ponto4.getHorarios().addElement("15:18");
		ponto4.getHorarios().addElement("15:44");
		ponto4.getHorarios().addElement("16:09");
		ponto4.getHorarios().addElement("16:34");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("17:25");
		ponto4.getHorarios().addElement("17:50");
		ponto4.getHorarios().addElement("18:16");
		ponto4.getHorarios().addElement("18:41");
		ponto4.getHorarios().addElement("19:06");
		ponto4.getHorarios().addElement("19:32");
		ponto4.getHorarios().addElement("20:04");
		ponto4.getHorarios().addElement("20:22");
		ponto4.getHorarios().addElement("20:48");
		ponto4.getHorarios().addElement("21:26");
		ponto4.getHorarios().addElement("22:04");
		ponto4.getHorarios().addElement("22:42");
		ponto4.getHorarios().addElement("23:20");
		ponto4.getHorarios().addElement("00:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUARAITUBA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("30/11/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:00");
		ponto5.getHorarios().addElement("06:35");
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("07:45");
		ponto5.getHorarios().addElement("08:20");
		ponto5.getHorarios().addElement("08:46");
		ponto5.getHorarios().addElement("09:11");
		ponto5.getHorarios().addElement("09:36");
		ponto5.getHorarios().addElement("10:02");
		ponto5.getHorarios().addElement("10:27");
		ponto5.getHorarios().addElement("10:52");
		ponto5.getHorarios().addElement("11:18");
		ponto5.getHorarios().addElement("11:43");
		ponto5.getHorarios().addElement("12:08");
		ponto5.getHorarios().addElement("12:34");
		ponto5.getHorarios().addElement("12:59");
		ponto5.getHorarios().addElement("13:24");
		ponto5.getHorarios().addElement("13:50");
		ponto5.getHorarios().addElement("14:15");
		ponto5.getHorarios().addElement("14:40");
		ponto5.getHorarios().addElement("15:06");
		ponto5.getHorarios().addElement("15:31");
		ponto5.getHorarios().addElement("15:56");
		ponto5.getHorarios().addElement("16:22");
		ponto5.getHorarios().addElement("16:47");
		ponto5.getHorarios().addElement("17:12");
		ponto5.getHorarios().addElement("17:38");
		ponto5.getHorarios().addElement("18:03");
		ponto5.getHorarios().addElement("18:28");
		ponto5.getHorarios().addElement("18:54");
		ponto5.getHorarios().addElement("19:19");
		ponto5.getHorarios().addElement("19:44");
		ponto5.getHorarios().addElement("20:10");
		ponto5.getHorarios().addElement("20:48");
		ponto5.getHorarios().addElement("21:26");
		ponto5.getHorarios().addElement("22:04");
		ponto5.getHorarios().addElement("22:42");
		ponto5.getHorarios().addElement("23:20");
		return onibus;
		}
	}
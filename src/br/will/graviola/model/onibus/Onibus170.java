
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus170 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("BRACATINGA");
		onibus.setCodigo("170");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO BRACATINGA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("07/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:41");
		ponto0.getHorarios().addElement("06:02");
		ponto0.getHorarios().addElement("06:12");
		ponto0.getHorarios().addElement("06:23");
		ponto0.getHorarios().addElement("06:33");
		ponto0.getHorarios().addElement("06:44");
		ponto0.getHorarios().addElement("06:54");
		ponto0.getHorarios().addElement("07:04");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:46");
		ponto0.getHorarios().addElement("07:56");
		ponto0.getHorarios().addElement("08:07");
		ponto0.getHorarios().addElement("08:17");
		ponto0.getHorarios().addElement("08:28");
		ponto0.getHorarios().addElement("08:54");
		ponto0.getHorarios().addElement("09:20");
		ponto0.getHorarios().addElement("09:46");
		ponto0.getHorarios().addElement("10:12");
		ponto0.getHorarios().addElement("10:38");
		ponto0.getHorarios().addElement("11:04");
		ponto0.getHorarios().addElement("11:24");
		ponto0.getHorarios().addElement("11:35");
		ponto0.getHorarios().addElement("11:45");
		ponto0.getHorarios().addElement("11:56");
		ponto0.getHorarios().addElement("12:06");
		ponto0.getHorarios().addElement("12:16");
		ponto0.getHorarios().addElement("12:27");
		ponto0.getHorarios().addElement("12:37");
		ponto0.getHorarios().addElement("12:48");
		ponto0.getHorarios().addElement("12:58");
		ponto0.getHorarios().addElement("13:08");
		ponto0.getHorarios().addElement("13:19");
		ponto0.getHorarios().addElement("13:31");
		ponto0.getHorarios().addElement("13:43");
		ponto0.getHorarios().addElement("14:11");
		ponto0.getHorarios().addElement("14:37");
		ponto0.getHorarios().addElement("15:03");
		ponto0.getHorarios().addElement("15:29");
		ponto0.getHorarios().addElement("15:55");
		ponto0.getHorarios().addElement("16:21");
		ponto0.getHorarios().addElement("16:47");
		ponto0.getHorarios().addElement("17:16");
		ponto0.getHorarios().addElement("17:43");
		ponto0.getHorarios().addElement("17:55");
		ponto0.getHorarios().addElement("18:07");
		ponto0.getHorarios().addElement("18:19");
		ponto0.getHorarios().addElement("18:31");
		ponto0.getHorarios().addElement("18:43");
		ponto0.getHorarios().addElement("18:55");
		ponto0.getHorarios().addElement("19:07");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("20:30");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:00");
		ponto0.getHorarios().addElement("23:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("07/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("14:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("RUA NESTOR DE CASTRO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("07/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:46");
		ponto2.getHorarios().addElement("06:07");
		ponto2.getHorarios().addElement("06:28");
		ponto2.getHorarios().addElement("06:38");
		ponto2.getHorarios().addElement("06:49");
		ponto2.getHorarios().addElement("06:59");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("07:41");
		ponto2.getHorarios().addElement("07:51");
		ponto2.getHorarios().addElement("08:02");
		ponto2.getHorarios().addElement("08:15");
		ponto2.getHorarios().addElement("08:28");
		ponto2.getHorarios().addElement("08:54");
		ponto2.getHorarios().addElement("09:20");
		ponto2.getHorarios().addElement("09:46");
		ponto2.getHorarios().addElement("10:12");
		ponto2.getHorarios().addElement("10:38");
		ponto2.getHorarios().addElement("10:58");
		ponto2.getHorarios().addElement("11:07");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("11:40");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("12:01");
		ponto2.getHorarios().addElement("12:11");
		ponto2.getHorarios().addElement("12:22");
		ponto2.getHorarios().addElement("12:32");
		ponto2.getHorarios().addElement("12:42");
		ponto2.getHorarios().addElement("12:53");
		ponto2.getHorarios().addElement("13:03");
		ponto2.getHorarios().addElement("13:14");
		ponto2.getHorarios().addElement("13:45");
		ponto2.getHorarios().addElement("13:58");
		ponto2.getHorarios().addElement("14:11");
		ponto2.getHorarios().addElement("14:37");
		ponto2.getHorarios().addElement("15:03");
		ponto2.getHorarios().addElement("15:29");
		ponto2.getHorarios().addElement("15:55");
		ponto2.getHorarios().addElement("16:21");
		ponto2.getHorarios().addElement("16:47");
		ponto2.getHorarios().addElement("17:13");
		ponto2.getHorarios().addElement("17:25");
		ponto2.getHorarios().addElement("17:37");
		ponto2.getHorarios().addElement("17:49");
		ponto2.getHorarios().addElement("18:01");
		ponto2.getHorarios().addElement("18:13");
		ponto2.getHorarios().addElement("18:25");
		ponto2.getHorarios().addElement("18:37");
		ponto2.getHorarios().addElement("18:49");
		ponto2.getHorarios().addElement("19:03");
		ponto2.getHorarios().addElement("19:16");
		ponto2.getHorarios().addElement("19:27");
		ponto2.getHorarios().addElement("19:37");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:00");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("00:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("OI BRASILTELECOM");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("07/05/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("15:05");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO BRACATINGA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:24");
		ponto4.getHorarios().addElement("06:42");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("07:18");
		ponto4.getHorarios().addElement("07:36");
		ponto4.getHorarios().addElement("07:54");
		ponto4.getHorarios().addElement("08:12");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("08:48");
		ponto4.getHorarios().addElement("09:06");
		ponto4.getHorarios().addElement("09:24");
		ponto4.getHorarios().addElement("09:42");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("10:18");
		ponto4.getHorarios().addElement("10:36");
		ponto4.getHorarios().addElement("10:54");
		ponto4.getHorarios().addElement("11:12");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("11:48");
		ponto4.getHorarios().addElement("12:06");
		ponto4.getHorarios().addElement("12:24");
		ponto4.getHorarios().addElement("12:42");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("13:18");
		ponto4.getHorarios().addElement("13:36");
		ponto4.getHorarios().addElement("13:54");
		ponto4.getHorarios().addElement("14:12");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("14:48");
		ponto4.getHorarios().addElement("15:06");
		ponto4.getHorarios().addElement("15:24");
		ponto4.getHorarios().addElement("15:42");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("16:18");
		ponto4.getHorarios().addElement("16:36");
		ponto4.getHorarios().addElement("16:54");
		ponto4.getHorarios().addElement("17:12");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("17:48");
		ponto4.getHorarios().addElement("18:06");
		ponto4.getHorarios().addElement("18:24");
		ponto4.getHorarios().addElement("18:42");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("19:44");
		ponto4.getHorarios().addElement("20:36");
		ponto4.getHorarios().addElement("21:28");
		ponto4.getHorarios().addElement("22:20");
		ponto4.getHorarios().addElement("23:12");
		ponto4.getHorarios().addElement("00:04");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("RUA NESTOR DE CASTRO");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:57");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("06:51");
		ponto5.getHorarios().addElement("07:09");
		ponto5.getHorarios().addElement("07:27");
		ponto5.getHorarios().addElement("07:45");
		ponto5.getHorarios().addElement("08:03");
		ponto5.getHorarios().addElement("08:21");
		ponto5.getHorarios().addElement("08:39");
		ponto5.getHorarios().addElement("08:57");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("09:33");
		ponto5.getHorarios().addElement("09:51");
		ponto5.getHorarios().addElement("10:09");
		ponto5.getHorarios().addElement("10:27");
		ponto5.getHorarios().addElement("10:45");
		ponto5.getHorarios().addElement("11:03");
		ponto5.getHorarios().addElement("11:21");
		ponto5.getHorarios().addElement("11:39");
		ponto5.getHorarios().addElement("11:57");
		ponto5.getHorarios().addElement("12:15");
		ponto5.getHorarios().addElement("12:33");
		ponto5.getHorarios().addElement("12:51");
		ponto5.getHorarios().addElement("13:09");
		ponto5.getHorarios().addElement("13:27");
		ponto5.getHorarios().addElement("13:45");
		ponto5.getHorarios().addElement("14:03");
		ponto5.getHorarios().addElement("14:21");
		ponto5.getHorarios().addElement("14:39");
		ponto5.getHorarios().addElement("14:57");
		ponto5.getHorarios().addElement("15:15");
		ponto5.getHorarios().addElement("15:33");
		ponto5.getHorarios().addElement("15:51");
		ponto5.getHorarios().addElement("16:09");
		ponto5.getHorarios().addElement("16:27");
		ponto5.getHorarios().addElement("16:45");
		ponto5.getHorarios().addElement("17:03");
		ponto5.getHorarios().addElement("17:21");
		ponto5.getHorarios().addElement("17:39");
		ponto5.getHorarios().addElement("17:57");
		ponto5.getHorarios().addElement("18:15");
		ponto5.getHorarios().addElement("18:33");
		ponto5.getHorarios().addElement("18:51");
		ponto5.getHorarios().addElement("19:13");
		ponto5.getHorarios().addElement("19:29");
		ponto5.getHorarios().addElement("20:10");
		ponto5.getHorarios().addElement("21:02");
		ponto5.getHorarios().addElement("21:54");
		ponto5.getHorarios().addElement("22:46");
		ponto5.getHorarios().addElement("23:38");
		ponto5.getHorarios().addElement("00:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO BRACATINGA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("22/03/2009");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:45");
		ponto6.getHorarios().addElement("06:21");
		ponto6.getHorarios().addElement("06:39");
		ponto6.getHorarios().addElement("07:15");
		ponto6.getHorarios().addElement("07:33");
		ponto6.getHorarios().addElement("08:09");
		ponto6.getHorarios().addElement("08:27");
		ponto6.getHorarios().addElement("09:03");
		ponto6.getHorarios().addElement("09:21");
		ponto6.getHorarios().addElement("09:57");
		ponto6.getHorarios().addElement("10:15");
		ponto6.getHorarios().addElement("10:51");
		ponto6.getHorarios().addElement("11:09");
		ponto6.getHorarios().addElement("11:45");
		ponto6.getHorarios().addElement("12:03");
		ponto6.getHorarios().addElement("12:39");
		ponto6.getHorarios().addElement("12:57");
		ponto6.getHorarios().addElement("13:33");
		ponto6.getHorarios().addElement("13:51");
		ponto6.getHorarios().addElement("14:27");
		ponto6.getHorarios().addElement("14:45");
		ponto6.getHorarios().addElement("15:21");
		ponto6.getHorarios().addElement("15:39");
		ponto6.getHorarios().addElement("16:15");
		ponto6.getHorarios().addElement("16:33");
		ponto6.getHorarios().addElement("17:09");
		ponto6.getHorarios().addElement("17:27");
		ponto6.getHorarios().addElement("18:03");
		ponto6.getHorarios().addElement("18:21");
		ponto6.getHorarios().addElement("18:57");
		ponto6.getHorarios().addElement("19:15");
		ponto6.getHorarios().addElement("20:07");
		ponto6.getHorarios().addElement("20:59");
		ponto6.getHorarios().addElement("21:51");
		ponto6.getHorarios().addElement("22:43");
		ponto6.getHorarios().addElement("23:35");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("RUA NESTOR DE CASTRO");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("22/03/2009");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:12");
		ponto7.getHorarios().addElement("06:48");
		ponto7.getHorarios().addElement("07:06");
		ponto7.getHorarios().addElement("07:42");
		ponto7.getHorarios().addElement("08:00");
		ponto7.getHorarios().addElement("08:36");
		ponto7.getHorarios().addElement("08:54");
		ponto7.getHorarios().addElement("09:30");
		ponto7.getHorarios().addElement("09:48");
		ponto7.getHorarios().addElement("10:24");
		ponto7.getHorarios().addElement("10:42");
		ponto7.getHorarios().addElement("11:18");
		ponto7.getHorarios().addElement("11:36");
		ponto7.getHorarios().addElement("12:12");
		ponto7.getHorarios().addElement("12:30");
		ponto7.getHorarios().addElement("13:06");
		ponto7.getHorarios().addElement("13:24");
		ponto7.getHorarios().addElement("14:00");
		ponto7.getHorarios().addElement("14:18");
		ponto7.getHorarios().addElement("14:54");
		ponto7.getHorarios().addElement("15:12");
		ponto7.getHorarios().addElement("15:48");
		ponto7.getHorarios().addElement("16:06");
		ponto7.getHorarios().addElement("16:42");
		ponto7.getHorarios().addElement("17:00");
		ponto7.getHorarios().addElement("17:36");
		ponto7.getHorarios().addElement("17:54");
		ponto7.getHorarios().addElement("18:30");
		ponto7.getHorarios().addElement("18:48");
		ponto7.getHorarios().addElement("19:25");
		ponto7.getHorarios().addElement("19:41");
		ponto7.getHorarios().addElement("20:33");
		ponto7.getHorarios().addElement("21:25");
		ponto7.getHorarios().addElement("22:17");
		ponto7.getHorarios().addElement("23:09");
		ponto7.getHorarios().addElement("00:00");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus471 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("V. SÃO PAULO");
		onibus.setCodigo("471");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO VILA SAO PAULO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:10");
		ponto0.getHorarios().addElement("05:34");
		ponto0.getHorarios().addElement("05:58");
		ponto0.getHorarios().addElement("06:19");
		ponto0.getHorarios().addElement("06:44");
		ponto0.getHorarios().addElement("07:08");
		ponto0.getHorarios().addElement("07:29");
		ponto0.getHorarios().addElement("07:56");
		ponto0.getHorarios().addElement("08:23");
		ponto0.getHorarios().addElement("08:49");
		ponto0.getHorarios().addElement("09:15");
		ponto0.getHorarios().addElement("09:41");
		ponto0.getHorarios().addElement("10:07");
		ponto0.getHorarios().addElement("10:33");
		ponto0.getHorarios().addElement("10:59");
		ponto0.getHorarios().addElement("11:25");
		ponto0.getHorarios().addElement("11:51");
		ponto0.getHorarios().addElement("12:17");
		ponto0.getHorarios().addElement("12:43");
		ponto0.getHorarios().addElement("13:09");
		ponto0.getHorarios().addElement("13:35");
		ponto0.getHorarios().addElement("14:01");
		ponto0.getHorarios().addElement("14:27");
		ponto0.getHorarios().addElement("14:53");
		ponto0.getHorarios().addElement("15:19");
		ponto0.getHorarios().addElement("15:45");
		ponto0.getHorarios().addElement("16:11");
		ponto0.getHorarios().addElement("16:37");
		ponto0.getHorarios().addElement("17:03");
		ponto0.getHorarios().addElement("17:29");
		ponto0.getHorarios().addElement("17:55");
		ponto0.getHorarios().addElement("18:21");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("19:13");
		ponto0.getHorarios().addElement("19:39");
		ponto0.getHorarios().addElement("20:05");
		ponto0.getHorarios().addElement("20:31");
		ponto0.getHorarios().addElement("20:57");
		ponto0.getHorarios().addElement("21:23");
		ponto0.getHorarios().addElement("21:49");
		ponto0.getHorarios().addElement("22:15");
		ponto0.getHorarios().addElement("22:41");
		ponto0.getHorarios().addElement("23:07");
		ponto0.getHorarios().addElement("23:33");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:09");
		ponto1.getHorarios().addElement("06:33");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:23");
		ponto1.getHorarios().addElement("07:47");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("08:36");
		ponto1.getHorarios().addElement("09:02");
		ponto1.getHorarios().addElement("09:28");
		ponto1.getHorarios().addElement("09:54");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("10:46");
		ponto1.getHorarios().addElement("11:12");
		ponto1.getHorarios().addElement("11:38");
		ponto1.getHorarios().addElement("12:04");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("12:56");
		ponto1.getHorarios().addElement("13:22");
		ponto1.getHorarios().addElement("13:48");
		ponto1.getHorarios().addElement("14:14");
		ponto1.getHorarios().addElement("14:40");
		ponto1.getHorarios().addElement("15:06");
		ponto1.getHorarios().addElement("15:32");
		ponto1.getHorarios().addElement("15:58");
		ponto1.getHorarios().addElement("16:24");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:16");
		ponto1.getHorarios().addElement("17:40");
		ponto1.getHorarios().addElement("18:08");
		ponto1.getHorarios().addElement("18:34");
		ponto1.getHorarios().addElement("19:00");
		ponto1.getHorarios().addElement("19:26");
		ponto1.getHorarios().addElement("19:52");
		ponto1.getHorarios().addElement("20:18");
		ponto1.getHorarios().addElement("20:44");
		ponto1.getHorarios().addElement("21:10");
		ponto1.getHorarios().addElement("21:36");
		ponto1.getHorarios().addElement("22:02");
		ponto1.getHorarios().addElement("22:28");
		ponto1.getHorarios().addElement("22:54");
		ponto1.getHorarios().addElement("23:20");
		ponto1.getHorarios().addElement("23:46");
		ponto1.getHorarios().addElement("00:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO VILA SAO PAULO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("03/09/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:40");
		ponto2.getHorarios().addElement("06:19");
		ponto2.getHorarios().addElement("06:52");
		ponto2.getHorarios().addElement("07:25");
		ponto2.getHorarios().addElement("07:58");
		ponto2.getHorarios().addElement("08:31");
		ponto2.getHorarios().addElement("09:04");
		ponto2.getHorarios().addElement("09:37");
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("10:43");
		ponto2.getHorarios().addElement("11:16");
		ponto2.getHorarios().addElement("11:49");
		ponto2.getHorarios().addElement("12:22");
		ponto2.getHorarios().addElement("12:55");
		ponto2.getHorarios().addElement("13:28");
		ponto2.getHorarios().addElement("14:01");
		ponto2.getHorarios().addElement("14:34");
		ponto2.getHorarios().addElement("15:07");
		ponto2.getHorarios().addElement("15:40");
		ponto2.getHorarios().addElement("16:13");
		ponto2.getHorarios().addElement("16:46");
		ponto2.getHorarios().addElement("17:19");
		ponto2.getHorarios().addElement("17:52");
		ponto2.getHorarios().addElement("18:25");
		ponto2.getHorarios().addElement("18:58");
		ponto2.getHorarios().addElement("19:31");
		ponto2.getHorarios().addElement("20:04");
		ponto2.getHorarios().addElement("20:37");
		ponto2.getHorarios().addElement("21:10");
		ponto2.getHorarios().addElement("21:43");
		ponto2.getHorarios().addElement("22:16");
		ponto2.getHorarios().addElement("22:49");
		ponto2.getHorarios().addElement("23:22");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("03/09/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:17");
		ponto3.getHorarios().addElement("06:52");
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("07:58");
		ponto3.getHorarios().addElement("08:31");
		ponto3.getHorarios().addElement("09:04");
		ponto3.getHorarios().addElement("09:37");
		ponto3.getHorarios().addElement("10:10");
		ponto3.getHorarios().addElement("10:43");
		ponto3.getHorarios().addElement("11:16");
		ponto3.getHorarios().addElement("11:49");
		ponto3.getHorarios().addElement("12:22");
		ponto3.getHorarios().addElement("12:55");
		ponto3.getHorarios().addElement("13:28");
		ponto3.getHorarios().addElement("14:01");
		ponto3.getHorarios().addElement("14:34");
		ponto3.getHorarios().addElement("15:07");
		ponto3.getHorarios().addElement("15:40");
		ponto3.getHorarios().addElement("16:13");
		ponto3.getHorarios().addElement("16:46");
		ponto3.getHorarios().addElement("17:19");
		ponto3.getHorarios().addElement("17:52");
		ponto3.getHorarios().addElement("18:25");
		ponto3.getHorarios().addElement("18:58");
		ponto3.getHorarios().addElement("19:31");
		ponto3.getHorarios().addElement("20:04");
		ponto3.getHorarios().addElement("20:37");
		ponto3.getHorarios().addElement("21:10");
		ponto3.getHorarios().addElement("21:43");
		ponto3.getHorarios().addElement("22:16");
		ponto3.getHorarios().addElement("22:49");
		ponto3.getHorarios().addElement("23:22");
		ponto3.getHorarios().addElement("23:55");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO VILA SAO PAULO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("04/09/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:34");
		ponto4.getHorarios().addElement("06:07");
		ponto4.getHorarios().addElement("06:40");
		ponto4.getHorarios().addElement("07:13");
		ponto4.getHorarios().addElement("07:46");
		ponto4.getHorarios().addElement("08:19");
		ponto4.getHorarios().addElement("08:52");
		ponto4.getHorarios().addElement("09:25");
		ponto4.getHorarios().addElement("09:58");
		ponto4.getHorarios().addElement("10:31");
		ponto4.getHorarios().addElement("11:04");
		ponto4.getHorarios().addElement("11:37");
		ponto4.getHorarios().addElement("12:10");
		ponto4.getHorarios().addElement("12:43");
		ponto4.getHorarios().addElement("13:16");
		ponto4.getHorarios().addElement("13:49");
		ponto4.getHorarios().addElement("14:22");
		ponto4.getHorarios().addElement("14:55");
		ponto4.getHorarios().addElement("15:28");
		ponto4.getHorarios().addElement("16:01");
		ponto4.getHorarios().addElement("16:34");
		ponto4.getHorarios().addElement("17:07");
		ponto4.getHorarios().addElement("17:40");
		ponto4.getHorarios().addElement("18:13");
		ponto4.getHorarios().addElement("18:46");
		ponto4.getHorarios().addElement("19:19");
		ponto4.getHorarios().addElement("19:52");
		ponto4.getHorarios().addElement("20:25");
		ponto4.getHorarios().addElement("20:58");
		ponto4.getHorarios().addElement("21:31");
		ponto4.getHorarios().addElement("22:04");
		ponto4.getHorarios().addElement("22:37");
		ponto4.getHorarios().addElement("23:10");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("04/09/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:07");
		ponto5.getHorarios().addElement("06:40");
		ponto5.getHorarios().addElement("07:13");
		ponto5.getHorarios().addElement("07:46");
		ponto5.getHorarios().addElement("08:19");
		ponto5.getHorarios().addElement("08:52");
		ponto5.getHorarios().addElement("09:25");
		ponto5.getHorarios().addElement("09:58");
		ponto5.getHorarios().addElement("10:31");
		ponto5.getHorarios().addElement("11:04");
		ponto5.getHorarios().addElement("11:37");
		ponto5.getHorarios().addElement("12:10");
		ponto5.getHorarios().addElement("12:43");
		ponto5.getHorarios().addElement("13:16");
		ponto5.getHorarios().addElement("13:49");
		ponto5.getHorarios().addElement("14:22");
		ponto5.getHorarios().addElement("14:55");
		ponto5.getHorarios().addElement("15:28");
		ponto5.getHorarios().addElement("16:01");
		ponto5.getHorarios().addElement("16:34");
		ponto5.getHorarios().addElement("17:07");
		ponto5.getHorarios().addElement("17:40");
		ponto5.getHorarios().addElement("18:13");
		ponto5.getHorarios().addElement("18:46");
		ponto5.getHorarios().addElement("19:19");
		ponto5.getHorarios().addElement("19:52");
		ponto5.getHorarios().addElement("20:25");
		ponto5.getHorarios().addElement("20:58");
		ponto5.getHorarios().addElement("21:31");
		ponto5.getHorarios().addElement("22:04");
		ponto5.getHorarios().addElement("22:37");
		ponto5.getHorarios().addElement("23:10");
		ponto5.getHorarios().addElement("23:43");
		return onibus;
		}
	}
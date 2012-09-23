
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus923 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("923 - CAMPO MAGRO");
		onibus.setCodigo("923");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO CAMPO MAGRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:11");
		ponto0.getHorarios().addElement("05:33");
		ponto0.getHorarios().addElement("05:42");
		ponto0.getHorarios().addElement("06:01");
		ponto0.getHorarios().addElement("06:11");
		ponto0.getHorarios().addElement("06:22");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("06:54");
		ponto0.getHorarios().addElement("07:12");
		ponto0.getHorarios().addElement("07:22");
		ponto0.getHorarios().addElement("07:33");
		ponto0.getHorarios().addElement("07:53");
		ponto0.getHorarios().addElement("08:07");
		ponto0.getHorarios().addElement("08:29");
		ponto0.getHorarios().addElement("08:46");
		ponto0.getHorarios().addElement("09:09");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:25");
		ponto0.getHorarios().addElement("11:01");
		ponto0.getHorarios().addElement("11:18");
		ponto0.getHorarios().addElement("11:54");
		ponto0.getHorarios().addElement("12:17");
		ponto0.getHorarios().addElement("12:35");
		ponto0.getHorarios().addElement("13:08");
		ponto0.getHorarios().addElement("13:40");
		ponto0.getHorarios().addElement("14:24");
		ponto0.getHorarios().addElement("15:02");
		ponto0.getHorarios().addElement("15:40");
		ponto0.getHorarios().addElement("16:21");
		ponto0.getHorarios().addElement("16:56");
		ponto0.getHorarios().addElement("17:07");
		ponto0.getHorarios().addElement("17:18");
		ponto0.getHorarios().addElement("17:40");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:12");
		ponto0.getHorarios().addElement("18:23");
		ponto0.getHorarios().addElement("18:34");
		ponto0.getHorarios().addElement("18:56");
		ponto0.getHorarios().addElement("19:34");
		ponto0.getHorarios().addElement("20:12");
		ponto0.getHorarios().addElement("20:47");
		ponto0.getHorarios().addElement("21:23");
		ponto0.getHorarios().addElement("21:58");
		ponto0.getHorarios().addElement("22:34");
		ponto0.getHorarios().addElement("23:09");
		ponto0.getHorarios().addElement("23:48");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SANTA FELICIDADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:33");
		ponto1.getHorarios().addElement("05:44");
		ponto1.getHorarios().addElement("06:04");
		ponto1.getHorarios().addElement("06:16");
		ponto1.getHorarios().addElement("06:34");
		ponto1.getHorarios().addElement("06:44");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("07:29");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("08:07");
		ponto1.getHorarios().addElement("08:28");
		ponto1.getHorarios().addElement("09:04");
		ponto1.getHorarios().addElement("09:44");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("11:06");
		ponto1.getHorarios().addElement("11:36");
		ponto1.getHorarios().addElement("11:53");
		ponto1.getHorarios().addElement("12:27");
		ponto1.getHorarios().addElement("12:52");
		ponto1.getHorarios().addElement("13:43");
		ponto1.getHorarios().addElement("14:21");
		ponto1.getHorarios().addElement("14:59");
		ponto1.getHorarios().addElement("15:37");
		ponto1.getHorarios().addElement("16:15");
		ponto1.getHorarios().addElement("16:26");
		ponto1.getHorarios().addElement("16:37");
		ponto1.getHorarios().addElement("16:59");
		ponto1.getHorarios().addElement("17:09");
		ponto1.getHorarios().addElement("17:31");
		ponto1.getHorarios().addElement("17:42");
		ponto1.getHorarios().addElement("17:53");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:26");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("19:00");
		ponto1.getHorarios().addElement("19:09");
		ponto1.getHorarios().addElement("19:31");
		ponto1.getHorarios().addElement("20:09");
		ponto1.getHorarios().addElement("20:49");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("21:56");
		ponto1.getHorarios().addElement("22:31");
		ponto1.getHorarios().addElement("23:10");
		ponto1.getHorarios().addElement("23:42");
		ponto1.getHorarios().addElement("00:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO C.MAGRO/SAO BENEDITO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:25");
		ponto2.getHorarios().addElement("05:51");
		ponto2.getHorarios().addElement("06:32");
		ponto2.getHorarios().addElement("07:02");
		ponto2.getHorarios().addElement("07:43");
		ponto2.getHorarios().addElement("08:17");
		ponto2.getHorarios().addElement("11:36");
		ponto2.getHorarios().addElement("12:50");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:29");
		ponto2.getHorarios().addElement("18:01");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:21");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL STA.FELICIDADE S.BEN.");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:57");
		ponto3.getHorarios().addElement("06:27");
		ponto3.getHorarios().addElement("07:08");
		ponto3.getHorarios().addElement("07:41");
		ponto3.getHorarios().addElement("12:11");
		ponto3.getHorarios().addElement("16:07");
		ponto3.getHorarios().addElement("16:48");
		ponto3.getHorarios().addElement("17:20");
		ponto3.getHorarios().addElement("18:04");
		ponto3.getHorarios().addElement("18:38");
		ponto3.getHorarios().addElement("19:20");
		ponto3.getHorarios().addElement("19:56");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("CAMPO MAGRO HORARIO INICIAL");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("04:53");
		ponto4.getHorarios().addElement("05:04");
		ponto4.getHorarios().addElement("05:25");
		ponto4.getHorarios().addElement("05:35");
		ponto4.getHorarios().addElement("05:54");
		ponto4.getHorarios().addElement("11:11");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("RUA JOAO BATISTA DURIGAN");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:12");
		ponto5.getHorarios().addElement("05:36");
		ponto5.getHorarios().addElement("06:17");
		ponto5.getHorarios().addElement("06:47");
		ponto5.getHorarios().addElement("07:28");
		ponto5.getHorarios().addElement("08:01");
		ponto5.getHorarios().addElement("11:16");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("16:27");
		ponto5.getHorarios().addElement("17:08");
		ponto5.getHorarios().addElement("17:40");
		ponto5.getHorarios().addElement("18:24");
		ponto5.getHorarios().addElement("18:58");
		ponto5.getHorarios().addElement("19:40");
		ponto5.getHorarios().addElement("20:16");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO CAMPO MAGRO");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("03/07/2010");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:30");
		ponto6.getHorarios().addElement("05:49");
		ponto6.getHorarios().addElement("06:08");
		ponto6.getHorarios().addElement("06:27");
		ponto6.getHorarios().addElement("06:46");
		ponto6.getHorarios().addElement("07:05");
		ponto6.getHorarios().addElement("07:24");
		ponto6.getHorarios().addElement("07:43");
		ponto6.getHorarios().addElement("08:02");
		ponto6.getHorarios().addElement("08:21");
		ponto6.getHorarios().addElement("08:40");
		ponto6.getHorarios().addElement("08:59");
		ponto6.getHorarios().addElement("09:37");
		ponto6.getHorarios().addElement("10:15");
		ponto6.getHorarios().addElement("10:53");
		ponto6.getHorarios().addElement("11:31");
		ponto6.getHorarios().addElement("12:09");
		ponto6.getHorarios().addElement("12:47");
		ponto6.getHorarios().addElement("13:25");
		ponto6.getHorarios().addElement("14:03");
		ponto6.getHorarios().addElement("14:41");
		ponto6.getHorarios().addElement("15:19");
		ponto6.getHorarios().addElement("15:57");
		ponto6.getHorarios().addElement("16:35");
		ponto6.getHorarios().addElement("17:13");
		ponto6.getHorarios().addElement("17:51");
		ponto6.getHorarios().addElement("18:29");
		ponto6.getHorarios().addElement("19:07");
		ponto6.getHorarios().addElement("19:45");
		ponto6.getHorarios().addElement("20:23");
		ponto6.getHorarios().addElement("21:01");
		ponto6.getHorarios().addElement("22:17");
		ponto6.getHorarios().addElement("23:33");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL SANTA FELICIDADE");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("03/07/2010");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:30");
		ponto7.getHorarios().addElement("06:08");
		ponto7.getHorarios().addElement("06:27");
		ponto7.getHorarios().addElement("06:46");
		ponto7.getHorarios().addElement("07:05");
		ponto7.getHorarios().addElement("07:24");
		ponto7.getHorarios().addElement("07:43");
		ponto7.getHorarios().addElement("08:02");
		ponto7.getHorarios().addElement("08:21");
		ponto7.getHorarios().addElement("08:59");
		ponto7.getHorarios().addElement("09:37");
		ponto7.getHorarios().addElement("10:15");
		ponto7.getHorarios().addElement("10:53");
		ponto7.getHorarios().addElement("11:31");
		ponto7.getHorarios().addElement("12:09");
		ponto7.getHorarios().addElement("12:47");
		ponto7.getHorarios().addElement("13:25");
		ponto7.getHorarios().addElement("14:03");
		ponto7.getHorarios().addElement("14:41");
		ponto7.getHorarios().addElement("15:19");
		ponto7.getHorarios().addElement("15:57");
		ponto7.getHorarios().addElement("16:35");
		ponto7.getHorarios().addElement("17:13");
		ponto7.getHorarios().addElement("17:51");
		ponto7.getHorarios().addElement("18:29");
		ponto7.getHorarios().addElement("19:07");
		ponto7.getHorarios().addElement("19:45");
		ponto7.getHorarios().addElement("20:23");
		ponto7.getHorarios().addElement("21:39");
		ponto7.getHorarios().addElement("22:55");
		ponto7.getHorarios().addElement("00:11");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("BAIRRO CAMPO MAGRO");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("16/08/2009");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:41");
		ponto8.getHorarios().addElement("06:57");
		ponto8.getHorarios().addElement("08:13");
		ponto8.getHorarios().addElement("09:29");
		ponto8.getHorarios().addElement("10:07");
		ponto8.getHorarios().addElement("10:45");
		ponto8.getHorarios().addElement("11:23");
		ponto8.getHorarios().addElement("12:01");
		ponto8.getHorarios().addElement("12:39");
		ponto8.getHorarios().addElement("13:17");
		ponto8.getHorarios().addElement("13:55");
		ponto8.getHorarios().addElement("14:33");
		ponto8.getHorarios().addElement("15:11");
		ponto8.getHorarios().addElement("15:49");
		ponto8.getHorarios().addElement("16:27");
		ponto8.getHorarios().addElement("17:05");
		ponto8.getHorarios().addElement("17:43");
		ponto8.getHorarios().addElement("18:21");
		ponto8.getHorarios().addElement("18:59");
		ponto8.getHorarios().addElement("19:37");
		ponto8.getHorarios().addElement("20:53");
		ponto8.getHorarios().addElement("22:09");
		ponto8.getHorarios().addElement("23:30");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL SANTA FELICIDADE");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("16/08/2009");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("05:10");
		ponto9.getHorarios().addElement("06:19");
		ponto9.getHorarios().addElement("07:35");
		ponto9.getHorarios().addElement("08:51");
		ponto9.getHorarios().addElement("10:07");
		ponto9.getHorarios().addElement("10:45");
		ponto9.getHorarios().addElement("11:23");
		ponto9.getHorarios().addElement("12:01");
		ponto9.getHorarios().addElement("12:39");
		ponto9.getHorarios().addElement("13:17");
		ponto9.getHorarios().addElement("13:55");
		ponto9.getHorarios().addElement("14:33");
		ponto9.getHorarios().addElement("15:11");
		ponto9.getHorarios().addElement("15:49");
		ponto9.getHorarios().addElement("16:27");
		ponto9.getHorarios().addElement("17:05");
		ponto9.getHorarios().addElement("17:43");
		ponto9.getHorarios().addElement("18:21");
		ponto9.getHorarios().addElement("18:59");
		ponto9.getHorarios().addElement("20:15");
		ponto9.getHorarios().addElement("21:31");
		ponto9.getHorarios().addElement("22:50");
		ponto9.getHorarios().addElement("00:10");
		return onibus;
		}
	}
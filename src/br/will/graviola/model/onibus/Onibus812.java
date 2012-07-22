
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus812 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MONTANA");
		onibus.setCodigo("812");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO MONTANA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("22/08/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:14");
		ponto0.getHorarios().addElement("08:27");
		ponto0.getHorarios().addElement("08:54");
		ponto0.getHorarios().addElement("09:21");
		ponto0.getHorarios().addElement("09:48");
		ponto0.getHorarios().addElement("10:15");
		ponto0.getHorarios().addElement("10:42");
		ponto0.getHorarios().addElement("11:09");
		ponto0.getHorarios().addElement("11:36");
		ponto0.getHorarios().addElement("12:03");
		ponto0.getHorarios().addElement("12:30");
		ponto0.getHorarios().addElement("12:57");
		ponto0.getHorarios().addElement("13:24");
		ponto0.getHorarios().addElement("13:51");
		ponto0.getHorarios().addElement("14:18");
		ponto0.getHorarios().addElement("14:45");
		ponto0.getHorarios().addElement("15:12");
		ponto0.getHorarios().addElement("15:39");
		ponto0.getHorarios().addElement("16:06");
		ponto0.getHorarios().addElement("16:33");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:12");
		ponto0.getHorarios().addElement("17:25");
		ponto0.getHorarios().addElement("17:38");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:15");
		ponto0.getHorarios().addElement("18:28");
		ponto0.getHorarios().addElement("18:40");
		ponto0.getHorarios().addElement("18:53");
		ponto0.getHorarios().addElement("19:05");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:55");
		ponto0.getHorarios().addElement("20:22");
		ponto0.getHorarios().addElement("20:49");
		ponto0.getHorarios().addElement("21:16");
		ponto0.getHorarios().addElement("21:43");
		ponto0.getHorarios().addElement("22:10");
		ponto0.getHorarios().addElement("22:37");
		ponto0.getHorarios().addElement("23:04");
		ponto0.getHorarios().addElement("23:31");
		ponto0.getHorarios().addElement("23:58");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("22/08/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:13");
		ponto1.getHorarios().addElement("06:26");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("07:36");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("07:59");
		ponto1.getHorarios().addElement("08:16");
		ponto1.getHorarios().addElement("08:27");
		ponto1.getHorarios().addElement("08:54");
		ponto1.getHorarios().addElement("09:21");
		ponto1.getHorarios().addElement("09:48");
		ponto1.getHorarios().addElement("10:15");
		ponto1.getHorarios().addElement("10:42");
		ponto1.getHorarios().addElement("11:09");
		ponto1.getHorarios().addElement("11:36");
		ponto1.getHorarios().addElement("12:03");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("12:57");
		ponto1.getHorarios().addElement("13:24");
		ponto1.getHorarios().addElement("13:51");
		ponto1.getHorarios().addElement("14:18");
		ponto1.getHorarios().addElement("14:45");
		ponto1.getHorarios().addElement("15:12");
		ponto1.getHorarios().addElement("15:39");
		ponto1.getHorarios().addElement("16:06");
		ponto1.getHorarios().addElement("16:33");
		ponto1.getHorarios().addElement("16:47");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:12");
		ponto1.getHorarios().addElement("17:24");
		ponto1.getHorarios().addElement("17:37");
		ponto1.getHorarios().addElement("17:49");
		ponto1.getHorarios().addElement("18:02");
		ponto1.getHorarios().addElement("18:14");
		ponto1.getHorarios().addElement("18:27");
		ponto1.getHorarios().addElement("18:39");
		ponto1.getHorarios().addElement("18:52");
		ponto1.getHorarios().addElement("19:04");
		ponto1.getHorarios().addElement("19:17");
		ponto1.getHorarios().addElement("19:29");
		ponto1.getHorarios().addElement("19:54");
		ponto1.getHorarios().addElement("20:22");
		ponto1.getHorarios().addElement("20:49");
		ponto1.getHorarios().addElement("21:16");
		ponto1.getHorarios().addElement("21:43");
		ponto1.getHorarios().addElement("22:10");
		ponto1.getHorarios().addElement("22:37");
		ponto1.getHorarios().addElement("23:04");
		ponto1.getHorarios().addElement("23:31");
		ponto1.getHorarios().addElement("23:58");
		ponto1.getHorarios().addElement("00:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO MONTANA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("04/12/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:28");
		ponto2.getHorarios().addElement("06:01");
		ponto2.getHorarios().addElement("06:29");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:25");
		ponto2.getHorarios().addElement("07:53");
		ponto2.getHorarios().addElement("08:21");
		ponto2.getHorarios().addElement("08:49");
		ponto2.getHorarios().addElement("09:17");
		ponto2.getHorarios().addElement("09:45");
		ponto2.getHorarios().addElement("10:13");
		ponto2.getHorarios().addElement("10:41");
		ponto2.getHorarios().addElement("11:09");
		ponto2.getHorarios().addElement("11:37");
		ponto2.getHorarios().addElement("12:05");
		ponto2.getHorarios().addElement("12:33");
		ponto2.getHorarios().addElement("13:01");
		ponto2.getHorarios().addElement("13:29");
		ponto2.getHorarios().addElement("13:57");
		ponto2.getHorarios().addElement("14:25");
		ponto2.getHorarios().addElement("14:53");
		ponto2.getHorarios().addElement("15:21");
		ponto2.getHorarios().addElement("15:49");
		ponto2.getHorarios().addElement("16:17");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:13");
		ponto2.getHorarios().addElement("17:41");
		ponto2.getHorarios().addElement("18:09");
		ponto2.getHorarios().addElement("18:37");
		ponto2.getHorarios().addElement("19:05");
		ponto2.getHorarios().addElement("19:33");
		ponto2.getHorarios().addElement("20:25");
		ponto2.getHorarios().addElement("21:17");
		ponto2.getHorarios().addElement("22:09");
		ponto2.getHorarios().addElement("23:01");
		ponto2.getHorarios().addElement("23:53");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("04/12/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:52");
		ponto3.getHorarios().addElement("06:29");
		ponto3.getHorarios().addElement("06:57");
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("07:53");
		ponto3.getHorarios().addElement("08:21");
		ponto3.getHorarios().addElement("08:49");
		ponto3.getHorarios().addElement("09:17");
		ponto3.getHorarios().addElement("09:45");
		ponto3.getHorarios().addElement("10:13");
		ponto3.getHorarios().addElement("10:41");
		ponto3.getHorarios().addElement("11:09");
		ponto3.getHorarios().addElement("11:37");
		ponto3.getHorarios().addElement("12:05");
		ponto3.getHorarios().addElement("12:33");
		ponto3.getHorarios().addElement("13:01");
		ponto3.getHorarios().addElement("13:29");
		ponto3.getHorarios().addElement("13:57");
		ponto3.getHorarios().addElement("14:25");
		ponto3.getHorarios().addElement("14:53");
		ponto3.getHorarios().addElement("15:21");
		ponto3.getHorarios().addElement("15:49");
		ponto3.getHorarios().addElement("16:17");
		ponto3.getHorarios().addElement("16:45");
		ponto3.getHorarios().addElement("17:13");
		ponto3.getHorarios().addElement("17:41");
		ponto3.getHorarios().addElement("18:09");
		ponto3.getHorarios().addElement("18:37");
		ponto3.getHorarios().addElement("19:05");
		ponto3.getHorarios().addElement("19:33");
		ponto3.getHorarios().addElement("19:59");
		ponto3.getHorarios().addElement("20:51");
		ponto3.getHorarios().addElement("21:43");
		ponto3.getHorarios().addElement("22:35");
		ponto3.getHorarios().addElement("23:27");
		ponto3.getHorarios().addElement("00:19");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO MONTANA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:33");
		ponto4.getHorarios().addElement("06:01");
		ponto4.getHorarios().addElement("06:29");
		ponto4.getHorarios().addElement("06:57");
		ponto4.getHorarios().addElement("07:25");
		ponto4.getHorarios().addElement("07:53");
		ponto4.getHorarios().addElement("08:21");
		ponto4.getHorarios().addElement("08:49");
		ponto4.getHorarios().addElement("09:17");
		ponto4.getHorarios().addElement("09:45");
		ponto4.getHorarios().addElement("10:13");
		ponto4.getHorarios().addElement("10:41");
		ponto4.getHorarios().addElement("11:09");
		ponto4.getHorarios().addElement("11:37");
		ponto4.getHorarios().addElement("12:05");
		ponto4.getHorarios().addElement("12:33");
		ponto4.getHorarios().addElement("13:01");
		ponto4.getHorarios().addElement("13:29");
		ponto4.getHorarios().addElement("13:57");
		ponto4.getHorarios().addElement("14:25");
		ponto4.getHorarios().addElement("14:53");
		ponto4.getHorarios().addElement("15:21");
		ponto4.getHorarios().addElement("15:49");
		ponto4.getHorarios().addElement("16:17");
		ponto4.getHorarios().addElement("16:45");
		ponto4.getHorarios().addElement("17:13");
		ponto4.getHorarios().addElement("17:41");
		ponto4.getHorarios().addElement("18:09");
		ponto4.getHorarios().addElement("18:37");
		ponto4.getHorarios().addElement("19:05");
		ponto4.getHorarios().addElement("19:33");
		ponto4.getHorarios().addElement("20:25");
		ponto4.getHorarios().addElement("21:17");
		ponto4.getHorarios().addElement("22:09");
		ponto4.getHorarios().addElement("23:01");
		ponto4.getHorarios().addElement("23:53");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:55");
		ponto5.getHorarios().addElement("06:29");
		ponto5.getHorarios().addElement("06:57");
		ponto5.getHorarios().addElement("07:25");
		ponto5.getHorarios().addElement("07:53");
		ponto5.getHorarios().addElement("08:21");
		ponto5.getHorarios().addElement("08:49");
		ponto5.getHorarios().addElement("09:17");
		ponto5.getHorarios().addElement("09:45");
		ponto5.getHorarios().addElement("10:13");
		ponto5.getHorarios().addElement("10:41");
		ponto5.getHorarios().addElement("11:09");
		ponto5.getHorarios().addElement("11:37");
		ponto5.getHorarios().addElement("12:05");
		ponto5.getHorarios().addElement("12:33");
		ponto5.getHorarios().addElement("13:01");
		ponto5.getHorarios().addElement("13:29");
		ponto5.getHorarios().addElement("13:57");
		ponto5.getHorarios().addElement("14:25");
		ponto5.getHorarios().addElement("14:53");
		ponto5.getHorarios().addElement("15:21");
		ponto5.getHorarios().addElement("15:49");
		ponto5.getHorarios().addElement("16:17");
		ponto5.getHorarios().addElement("16:45");
		ponto5.getHorarios().addElement("17:13");
		ponto5.getHorarios().addElement("17:41");
		ponto5.getHorarios().addElement("18:09");
		ponto5.getHorarios().addElement("18:37");
		ponto5.getHorarios().addElement("19:05");
		ponto5.getHorarios().addElement("19:33");
		ponto5.getHorarios().addElement("19:59");
		ponto5.getHorarios().addElement("20:51");
		ponto5.getHorarios().addElement("21:43");
		ponto5.getHorarios().addElement("22:35");
		ponto5.getHorarios().addElement("23:27");
		ponto5.getHorarios().addElement("00:19");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus311 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("311 - ARAGUAIA");
		onibus.setCodigo("311");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO ARAGUAIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("29/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:53");
		ponto0.getHorarios().addElement("06:16");
		ponto0.getHorarios().addElement("06:39");
		ponto0.getHorarios().addElement("07:02");
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("07:48");
		ponto0.getHorarios().addElement("08:11");
		ponto0.getHorarios().addElement("08:34");
		ponto0.getHorarios().addElement("08:56");
		ponto0.getHorarios().addElement("09:20");
		ponto0.getHorarios().addElement("09:44");
		ponto0.getHorarios().addElement("10:06");
		ponto0.getHorarios().addElement("10:29");
		ponto0.getHorarios().addElement("10:51");
		ponto0.getHorarios().addElement("11:13");
		ponto0.getHorarios().addElement("11:38");
		ponto0.getHorarios().addElement("12:01");
		ponto0.getHorarios().addElement("12:24");
		ponto0.getHorarios().addElement("12:47");
		ponto0.getHorarios().addElement("13:10");
		ponto0.getHorarios().addElement("13:33");
		ponto0.getHorarios().addElement("13:56");
		ponto0.getHorarios().addElement("14:18");
		ponto0.getHorarios().addElement("14:44");
		ponto0.getHorarios().addElement("15:06");
		ponto0.getHorarios().addElement("15:28");
		ponto0.getHorarios().addElement("15:51");
		ponto0.getHorarios().addElement("16:16");
		ponto0.getHorarios().addElement("16:37");
		ponto0.getHorarios().addElement("16:59");
		ponto0.getHorarios().addElement("17:23");
		ponto0.getHorarios().addElement("17:46");
		ponto0.getHorarios().addElement("18:09");
		ponto0.getHorarios().addElement("18:32");
		ponto0.getHorarios().addElement("18:54");
		ponto0.getHorarios().addElement("19:18");
		ponto0.getHorarios().addElement("19:41");
		ponto0.getHorarios().addElement("20:04");
		ponto0.getHorarios().addElement("20:27");
		ponto0.getHorarios().addElement("20:50");
		ponto0.getHorarios().addElement("21:13");
		ponto0.getHorarios().addElement("21:36");
		ponto0.getHorarios().addElement("21:59");
		ponto0.getHorarios().addElement("22:23");
		ponto0.getHorarios().addElement("22:45");
		ponto0.getHorarios().addElement("23:08");
		ponto0.getHorarios().addElement("23:30");
		ponto0.getHorarios().addElement("23:50");
		ponto0.getHorarios().addElement("00:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("29/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:42");
		ponto1.getHorarios().addElement("06:06");
		ponto1.getHorarios().addElement("06:28");
		ponto1.getHorarios().addElement("06:51");
		ponto1.getHorarios().addElement("07:14");
		ponto1.getHorarios().addElement("07:36");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:22");
		ponto1.getHorarios().addElement("08:46");
		ponto1.getHorarios().addElement("09:07");
		ponto1.getHorarios().addElement("09:33");
		ponto1.getHorarios().addElement("09:55");
		ponto1.getHorarios().addElement("10:18");
		ponto1.getHorarios().addElement("10:41");
		ponto1.getHorarios().addElement("11:02");
		ponto1.getHorarios().addElement("11:25");
		ponto1.getHorarios().addElement("11:50");
		ponto1.getHorarios().addElement("12:13");
		ponto1.getHorarios().addElement("12:36");
		ponto1.getHorarios().addElement("12:59");
		ponto1.getHorarios().addElement("13:22");
		ponto1.getHorarios().addElement("13:45");
		ponto1.getHorarios().addElement("14:07");
		ponto1.getHorarios().addElement("14:33");
		ponto1.getHorarios().addElement("14:55");
		ponto1.getHorarios().addElement("15:17");
		ponto1.getHorarios().addElement("15:40");
		ponto1.getHorarios().addElement("16:05");
		ponto1.getHorarios().addElement("16:27");
		ponto1.getHorarios().addElement("16:47");
		ponto1.getHorarios().addElement("17:12");
		ponto1.getHorarios().addElement("17:35");
		ponto1.getHorarios().addElement("17:58");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:42");
		ponto1.getHorarios().addElement("19:06");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("19:52");
		ponto1.getHorarios().addElement("20:16");
		ponto1.getHorarios().addElement("20:39");
		ponto1.getHorarios().addElement("21:02");
		ponto1.getHorarios().addElement("21:25");
		ponto1.getHorarios().addElement("21:48");
		ponto1.getHorarios().addElement("22:11");
		ponto1.getHorarios().addElement("22:33");
		ponto1.getHorarios().addElement("22:57");
		ponto1.getHorarios().addElement("23:20");
		ponto1.getHorarios().addElement("23:40");
		ponto1.getHorarios().addElement("00:00");
		ponto1.getHorarios().addElement("00:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO ARAGUAIA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("04/12/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("10:00");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:30");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("19:30");
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
		ponto3.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("04/12/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:45");
		ponto3.getHorarios().addElement("06:15");
		ponto3.getHorarios().addElement("06:45");
		ponto3.getHorarios().addElement("07:15");
		ponto3.getHorarios().addElement("07:45");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("08:45");
		ponto3.getHorarios().addElement("09:15");
		ponto3.getHorarios().addElement("09:45");
		ponto3.getHorarios().addElement("10:15");
		ponto3.getHorarios().addElement("10:45");
		ponto3.getHorarios().addElement("11:15");
		ponto3.getHorarios().addElement("11:45");
		ponto3.getHorarios().addElement("12:15");
		ponto3.getHorarios().addElement("12:45");
		ponto3.getHorarios().addElement("13:15");
		ponto3.getHorarios().addElement("13:45");
		ponto3.getHorarios().addElement("14:15");
		ponto3.getHorarios().addElement("14:45");
		ponto3.getHorarios().addElement("15:15");
		ponto3.getHorarios().addElement("15:45");
		ponto3.getHorarios().addElement("16:15");
		ponto3.getHorarios().addElement("16:45");
		ponto3.getHorarios().addElement("17:15");
		ponto3.getHorarios().addElement("17:45");
		ponto3.getHorarios().addElement("18:15");
		ponto3.getHorarios().addElement("18:45");
		ponto3.getHorarios().addElement("19:15");
		ponto3.getHorarios().addElement("19:45");
		ponto3.getHorarios().addElement("20:15");
		ponto3.getHorarios().addElement("20:45");
		ponto3.getHorarios().addElement("21:15");
		ponto3.getHorarios().addElement("21:45");
		ponto3.getHorarios().addElement("22:15");
		ponto3.getHorarios().addElement("22:45");
		ponto3.getHorarios().addElement("23:15");
		ponto3.getHorarios().addElement("23:45");
		ponto3.getHorarios().addElement("00:15");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO ARAGUAIA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("09:00");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("10:30");
		ponto4.getHorarios().addElement("11:00");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("12:30");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("13:30");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("15:30");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("18:30");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("19:30");
		ponto4.getHorarios().addElement("20:00");
		ponto4.getHorarios().addElement("20:30");
		ponto4.getHorarios().addElement("21:00");
		ponto4.getHorarios().addElement("21:30");
		ponto4.getHorarios().addElement("22:00");
		ponto4.getHorarios().addElement("22:30");
		ponto4.getHorarios().addElement("23:00");
		ponto4.getHorarios().addElement("23:30");
		ponto4.getHorarios().addElement("00:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:45");
		ponto5.getHorarios().addElement("06:15");
		ponto5.getHorarios().addElement("06:45");
		ponto5.getHorarios().addElement("07:15");
		ponto5.getHorarios().addElement("07:45");
		ponto5.getHorarios().addElement("08:15");
		ponto5.getHorarios().addElement("08:45");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("09:45");
		ponto5.getHorarios().addElement("10:15");
		ponto5.getHorarios().addElement("10:45");
		ponto5.getHorarios().addElement("11:15");
		ponto5.getHorarios().addElement("11:45");
		ponto5.getHorarios().addElement("12:15");
		ponto5.getHorarios().addElement("12:45");
		ponto5.getHorarios().addElement("13:15");
		ponto5.getHorarios().addElement("13:45");
		ponto5.getHorarios().addElement("14:15");
		ponto5.getHorarios().addElement("14:45");
		ponto5.getHorarios().addElement("15:15");
		ponto5.getHorarios().addElement("15:45");
		ponto5.getHorarios().addElement("16:15");
		ponto5.getHorarios().addElement("16:45");
		ponto5.getHorarios().addElement("17:15");
		ponto5.getHorarios().addElement("17:45");
		ponto5.getHorarios().addElement("18:15");
		ponto5.getHorarios().addElement("18:45");
		ponto5.getHorarios().addElement("19:15");
		ponto5.getHorarios().addElement("19:45");
		ponto5.getHorarios().addElement("20:15");
		ponto5.getHorarios().addElement("20:45");
		ponto5.getHorarios().addElement("21:15");
		ponto5.getHorarios().addElement("21:45");
		ponto5.getHorarios().addElement("22:15");
		ponto5.getHorarios().addElement("22:45");
		ponto5.getHorarios().addElement("23:15");
		ponto5.getHorarios().addElement("23:45");
		ponto5.getHorarios().addElement("00:15");
		return onibus;
		}
	}
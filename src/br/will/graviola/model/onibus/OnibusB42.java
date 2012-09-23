
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB42 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B42 - MARACANA / LINHA VERDE");
		onibus.setCodigo("B42");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL MARACANA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("19/03/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:39");
		ponto0.getHorarios().addElement("05:48");
		ponto0.getHorarios().addElement("05:57");
		ponto0.getHorarios().addElement("06:05");
		ponto0.getHorarios().addElement("06:14");
		ponto0.getHorarios().addElement("06:23");
		ponto0.getHorarios().addElement("06:32");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("06:49");
		ponto0.getHorarios().addElement("06:58");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:24");
		ponto0.getHorarios().addElement("07:33");
		ponto0.getHorarios().addElement("07:42");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("07:59");
		ponto0.getHorarios().addElement("08:08");
		ponto0.getHorarios().addElement("08:17");
		ponto0.getHorarios().addElement("08:35");
		ponto0.getHorarios().addElement("09:13");
		ponto0.getHorarios().addElement("09:51");
		ponto0.getHorarios().addElement("10:29");
		ponto0.getHorarios().addElement("11:07");
		ponto0.getHorarios().addElement("11:44");
		ponto0.getHorarios().addElement("12:22");
		ponto0.getHorarios().addElement("13:00");
		ponto0.getHorarios().addElement("13:39");
		ponto0.getHorarios().addElement("14:17");
		ponto0.getHorarios().addElement("14:55");
		ponto0.getHorarios().addElement("15:35");
		ponto0.getHorarios().addElement("16:15");
		ponto0.getHorarios().addElement("16:55");
		ponto0.getHorarios().addElement("17:14");
		ponto0.getHorarios().addElement("17:38");
		ponto0.getHorarios().addElement("17:49");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:21");
		ponto0.getHorarios().addElement("18:32");
		ponto0.getHorarios().addElement("18:43");
		ponto0.getHorarios().addElement("18:54");
		ponto0.getHorarios().addElement("19:04");
		ponto0.getHorarios().addElement("19:22");
		ponto0.getHorarios().addElement("19:41");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("21:12");
		ponto0.getHorarios().addElement("22:16");
		ponto0.getHorarios().addElement("23:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("V.MARIA DO ROSARIO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("19/03/2012");
		onibus.getPontos().addElement(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL GUARAITUBA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("19/03/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("19:22");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESTACAO TUBO FANNY-LINHA VERDE");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("19/03/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:44");
		ponto3.getHorarios().addElement("06:05");
		ponto3.getHorarios().addElement("06:14");
		ponto3.getHorarios().addElement("06:23");
		ponto3.getHorarios().addElement("06:32");
		ponto3.getHorarios().addElement("06:40");
		ponto3.getHorarios().addElement("06:49");
		ponto3.getHorarios().addElement("06:58");
		ponto3.getHorarios().addElement("07:07");
		ponto3.getHorarios().addElement("07:15");
		ponto3.getHorarios().addElement("07:24");
		ponto3.getHorarios().addElement("07:33");
		ponto3.getHorarios().addElement("07:42");
		ponto3.getHorarios().addElement("07:50");
		ponto3.getHorarios().addElement("07:59");
		ponto3.getHorarios().addElement("08:08");
		ponto3.getHorarios().addElement("08:17");
		ponto3.getHorarios().addElement("08:34");
		ponto3.getHorarios().addElement("08:53");
		ponto3.getHorarios().addElement("09:12");
		ponto3.getHorarios().addElement("09:50");
		ponto3.getHorarios().addElement("10:28");
		ponto3.getHorarios().addElement("11:06");
		ponto3.getHorarios().addElement("11:42");
		ponto3.getHorarios().addElement("12:17");
		ponto3.getHorarios().addElement("12:57");
		ponto3.getHorarios().addElement("13:37");
		ponto3.getHorarios().addElement("14:16");
		ponto3.getHorarios().addElement("14:54");
		ponto3.getHorarios().addElement("15:32");
		ponto3.getHorarios().addElement("16:12");
		ponto3.getHorarios().addElement("16:35");
		ponto3.getHorarios().addElement("16:58");
		ponto3.getHorarios().addElement("17:09");
		ponto3.getHorarios().addElement("17:21");
		ponto3.getHorarios().addElement("17:32");
		ponto3.getHorarios().addElement("17:43");
		ponto3.getHorarios().addElement("17:54");
		ponto3.getHorarios().addElement("18:05");
		ponto3.getHorarios().addElement("18:15");
		ponto3.getHorarios().addElement("18:25");
		ponto3.getHorarios().addElement("18:35");
		ponto3.getHorarios().addElement("18:45");
		ponto3.getHorarios().addElement("18:55");
		ponto3.getHorarios().addElement("19:07");
		ponto3.getHorarios().addElement("19:18");
		ponto3.getHorarios().addElement("19:30");
		ponto3.getHorarios().addElement("19:48");
		ponto3.getHorarios().addElement("20:06");
		ponto3.getHorarios().addElement("20:40");
		ponto3.getHorarios().addElement("21:44");
		ponto3.getHorarios().addElement("22:48");
		ponto3.getHorarios().addElement("23:50");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BR476/AV.SAL.FILHO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("19/03/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("18:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL MARACANA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("25/09/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:30");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("13:30");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:30");
		ponto5.getHorarios().addElement("18:30");
		ponto5.getHorarios().addElement("19:30");
		ponto5.getHorarios().addElement("20:30");
		ponto5.getHorarios().addElement("21:30");
		ponto5.getHorarios().addElement("22:30");
		ponto5.getHorarios().addElement("23:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("ESTACAO TUBO FANNY-LINHA VERDE");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("25/09/2010");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:00");
		ponto6.getHorarios().addElement("07:00");
		ponto6.getHorarios().addElement("07:30");
		ponto6.getHorarios().addElement("08:00");
		ponto6.getHorarios().addElement("09:00");
		ponto6.getHorarios().addElement("10:00");
		ponto6.getHorarios().addElement("11:00");
		ponto6.getHorarios().addElement("12:00");
		ponto6.getHorarios().addElement("13:00");
		ponto6.getHorarios().addElement("14:00");
		ponto6.getHorarios().addElement("15:00");
		ponto6.getHorarios().addElement("16:00");
		ponto6.getHorarios().addElement("17:00");
		ponto6.getHorarios().addElement("18:00");
		ponto6.getHorarios().addElement("19:00");
		ponto6.getHorarios().addElement("20:00");
		ponto6.getHorarios().addElement("21:00");
		ponto6.getHorarios().addElement("22:00");
		ponto6.getHorarios().addElement("23:00");
		ponto6.getHorarios().addElement("00:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL MARACANA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("10/05/2009");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:30");
		ponto7.getHorarios().addElement("06:30");
		ponto7.getHorarios().addElement("07:30");
		ponto7.getHorarios().addElement("08:30");
		ponto7.getHorarios().addElement("09:30");
		ponto7.getHorarios().addElement("10:30");
		ponto7.getHorarios().addElement("11:30");
		ponto7.getHorarios().addElement("12:30");
		ponto7.getHorarios().addElement("13:30");
		ponto7.getHorarios().addElement("14:30");
		ponto7.getHorarios().addElement("15:30");
		ponto7.getHorarios().addElement("16:30");
		ponto7.getHorarios().addElement("17:30");
		ponto7.getHorarios().addElement("18:30");
		ponto7.getHorarios().addElement("19:30");
		ponto7.getHorarios().addElement("20:30");
		ponto7.getHorarios().addElement("21:30");
		ponto7.getHorarios().addElement("22:30");
		ponto7.getHorarios().addElement("23:30");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("ESTACAO TUBO FANNY-LINHA VERDE");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("10/05/2009");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("06:00");
		ponto8.getHorarios().addElement("07:00");
		ponto8.getHorarios().addElement("08:00");
		ponto8.getHorarios().addElement("09:00");
		ponto8.getHorarios().addElement("10:00");
		ponto8.getHorarios().addElement("11:00");
		ponto8.getHorarios().addElement("12:00");
		ponto8.getHorarios().addElement("13:00");
		ponto8.getHorarios().addElement("14:00");
		ponto8.getHorarios().addElement("15:00");
		ponto8.getHorarios().addElement("16:00");
		ponto8.getHorarios().addElement("17:00");
		ponto8.getHorarios().addElement("18:00");
		ponto8.getHorarios().addElement("19:00");
		ponto8.getHorarios().addElement("20:00");
		ponto8.getHorarios().addElement("21:00");
		ponto8.getHorarios().addElement("22:00");
		ponto8.getHorarios().addElement("23:00");
		ponto8.getHorarios().addElement("00:00");
		return onibus;
		}
	}
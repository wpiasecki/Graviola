
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusD13 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("D13 - INTEGRAR  PIRAQUARA");
		onibus.setCodigo("D13");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO VILA MACEDO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/04/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("10:35");
		ponto0.getHorarios().addElement("17:15");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("SANEPAR");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/04/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("19:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL PIRAQUARA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("16/04/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("04:35");
		ponto2.getHorarios().addElement("05:05");
		ponto2.getHorarios().addElement("05:15");
		ponto2.getHorarios().addElement("05:45");
		ponto2.getHorarios().addElement("05:45");
		ponto2.getHorarios().addElement("06:15");
		ponto2.getHorarios().addElement("06:25");
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("07:50");
		ponto2.getHorarios().addElement("08:25");
		ponto2.getHorarios().addElement("08:40");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("12:05");
		ponto2.getHorarios().addElement("12:40");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("13:40");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:10");
		ponto2.getHorarios().addElement("17:45");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:15");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:05");
		ponto2.getHorarios().addElement("19:15");
		ponto2.getHorarios().addElement("20:10");
		ponto2.getHorarios().addElement("20:40");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:10");
		ponto2.getHorarios().addElement("22:50");
		ponto2.getHorarios().addElement("23:50");
		ponto2.getHorarios().addElement("00:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("VILA FRANCA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("16/04/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("04:30");
		ponto3.getHorarios().addElement("05:25");
		ponto3.getHorarios().addElement("06:00");
		ponto3.getHorarios().addElement("06:25");
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("11:20");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("18:00");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("19:00");
		ponto3.getHorarios().addElement("19:25");
		ponto3.getHorarios().addElement("20:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("P.I.T.");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("16/04/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("04:50");
		ponto4.getHorarios().addElement("05:25");
		ponto4.getHorarios().addElement("06:05");
		ponto4.getHorarios().addElement("06:45");
		ponto4.getHorarios().addElement("07:25");
		ponto4.getHorarios().addElement("08:05");
		ponto4.getHorarios().addElement("09:00");
		ponto4.getHorarios().addElement("09:50");
		ponto4.getHorarios().addElement("10:55");
		ponto4.getHorarios().addElement("11:45");
		ponto4.getHorarios().addElement("12:20");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("16:50");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("18:40");
		ponto4.getHorarios().addElement("19:45");
		ponto4.getHorarios().addElement("21:10");
		ponto4.getHorarios().addElement("21:50");
		ponto4.getHorarios().addElement("22:30");
		ponto4.getHorarios().addElement("23:10");
		ponto4.getHorarios().addElement("00:10");
		ponto4.getHorarios().addElement("00:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("BAIRRO VILA MACEDO");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("08:40");
		ponto5.getHorarios().addElement("12:20");
		ponto5.getHorarios().addElement("16:15");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PLANTA DEODORO");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("18:45");
		ponto6.getHorarios().addElement("19:45");
		ponto6.getHorarios().addElement("20:50");
		ponto6.getHorarios().addElement("21:50");
		ponto6.getHorarios().addElement("22:50");
		ponto6.getHorarios().addElement("23:50");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRESIDIO PIRAQUARA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("09:50");
		ponto7.getHorarios().addElement("14:40");
		ponto7.getHorarios().addElement("17:20");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL PIRAQUARA");
		ponto8.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto8.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:20");
		ponto8.getHorarios().addElement("06:00");
		ponto8.getHorarios().addElement("06:20");
		ponto8.getHorarios().addElement("07:00");
		ponto8.getHorarios().addElement("07:20");
		ponto8.getHorarios().addElement("08:00");
		ponto8.getHorarios().addElement("08:20");
		ponto8.getHorarios().addElement("09:30");
		ponto8.getHorarios().addElement("10:10");
		ponto8.getHorarios().addElement("10:50");
		ponto8.getHorarios().addElement("11:30");
		ponto8.getHorarios().addElement("11:50");
		ponto8.getHorarios().addElement("13:10");
		ponto8.getHorarios().addElement("14:00");
		ponto8.getHorarios().addElement("14:20");
		ponto8.getHorarios().addElement("15:10");
		ponto8.getHorarios().addElement("15:55");
		ponto8.getHorarios().addElement("17:00");
		ponto8.getHorarios().addElement("17:40");
		ponto8.getHorarios().addElement("18:00");
		ponto8.getHorarios().addElement("18:35");
		ponto8.getHorarios().addElement("18:55");
		ponto8.getHorarios().addElement("19:30");
		ponto8.getHorarios().addElement("20:00");
		ponto8.getHorarios().addElement("20:35");
		ponto8.getHorarios().addElement("21:00");
		ponto8.getHorarios().addElement("21:35");
		ponto8.getHorarios().addElement("22:00");
		ponto8.getHorarios().addElement("22:35");
		ponto8.getHorarios().addElement("23:00");
		ponto8.getHorarios().addElement("23:35");
		ponto8.getHorarios().addElement("00:05");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("VILA FRANCA");
		ponto9.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto9.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("06:10");
		ponto9.getHorarios().addElement("07:10");
		ponto9.getHorarios().addElement("08:10");
		ponto9.getHorarios().addElement("11:40");
		ponto9.getHorarios().addElement("14:10");
		ponto9.getHorarios().addElement("17:50");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("P.I.T.");
		ponto10.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto10.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:40");
		ponto10.getHorarios().addElement("06:40");
		ponto10.getHorarios().addElement("07:40");
		ponto10.getHorarios().addElement("09:10");
		ponto10.getHorarios().addElement("10:30");
		ponto10.getHorarios().addElement("11:10");
		ponto10.getHorarios().addElement("12:50");
		ponto10.getHorarios().addElement("13:30");
		ponto10.getHorarios().addElement("15:30");
		ponto10.getHorarios().addElement("16:40");
		ponto10.getHorarios().addElement("18:20");
		ponto10.getHorarios().addElement("19:10");
		ponto10.getHorarios().addElement("20:15");
		ponto10.getHorarios().addElement("21:15");
		ponto10.getHorarios().addElement("22:15");
		ponto10.getHorarios().addElement("23:15");
		ponto10.getHorarios().addElement("00:20");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("BAIRRO VILA MACEDO");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("08:40");
		ponto11.getHorarios().addElement("12:20");
		ponto11.getHorarios().addElement("16:15");
		Ponto ponto12 = new Ponto();
		ponto12.setNome("PLANTA DEODORO");
		ponto12.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto12.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto12);
		ponto12.getHorarios().addElement("18:45");
		ponto12.getHorarios().addElement("19:45");
		ponto12.getHorarios().addElement("20:50");
		ponto12.getHorarios().addElement("21:50");
		ponto12.getHorarios().addElement("22:50");
		ponto12.getHorarios().addElement("23:50");
		Ponto ponto13 = new Ponto();
		ponto13.setNome("PRESIDIO PIRAQUARA");
		ponto13.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto13.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto13);
		ponto13.getHorarios().addElement("09:50");
		ponto13.getHorarios().addElement("14:40");
		ponto13.getHorarios().addElement("17:20");
		Ponto ponto14 = new Ponto();
		ponto14.setNome("TERMINAL PIRAQUARA");
		ponto14.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto14.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto14);
		ponto14.getHorarios().addElement("05:20");
		ponto14.getHorarios().addElement("06:00");
		ponto14.getHorarios().addElement("06:20");
		ponto14.getHorarios().addElement("07:00");
		ponto14.getHorarios().addElement("07:20");
		ponto14.getHorarios().addElement("08:00");
		ponto14.getHorarios().addElement("08:20");
		ponto14.getHorarios().addElement("09:30");
		ponto14.getHorarios().addElement("10:10");
		ponto14.getHorarios().addElement("10:50");
		ponto14.getHorarios().addElement("11:30");
		ponto14.getHorarios().addElement("11:50");
		ponto14.getHorarios().addElement("12:45");
		ponto14.getHorarios().addElement("13:10");
		ponto14.getHorarios().addElement("14:00");
		ponto14.getHorarios().addElement("14:20");
		ponto14.getHorarios().addElement("15:10");
		ponto14.getHorarios().addElement("15:55");
		ponto14.getHorarios().addElement("17:00");
		ponto14.getHorarios().addElement("17:40");
		ponto14.getHorarios().addElement("18:00");
		ponto14.getHorarios().addElement("18:35");
		ponto14.getHorarios().addElement("18:55");
		ponto14.getHorarios().addElement("19:30");
		ponto14.getHorarios().addElement("20:00");
		ponto14.getHorarios().addElement("20:35");
		ponto14.getHorarios().addElement("21:00");
		ponto14.getHorarios().addElement("21:35");
		ponto14.getHorarios().addElement("22:00");
		ponto14.getHorarios().addElement("22:35");
		ponto14.getHorarios().addElement("23:00");
		ponto14.getHorarios().addElement("23:35");
		ponto14.getHorarios().addElement("00:05");
		Ponto ponto15 = new Ponto();
		ponto15.setNome("VILA FRANCA");
		ponto15.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto15.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto15);
		ponto15.getHorarios().addElement("06:10");
		ponto15.getHorarios().addElement("07:10");
		ponto15.getHorarios().addElement("08:10");
		ponto15.getHorarios().addElement("11:40");
		ponto15.getHorarios().addElement("14:10");
		ponto15.getHorarios().addElement("17:50");
		Ponto ponto16 = new Ponto();
		ponto16.setNome("P.I.T.");
		ponto16.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto16.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto16);
		ponto16.getHorarios().addElement("05:40");
		ponto16.getHorarios().addElement("06:40");
		ponto16.getHorarios().addElement("07:40");
		ponto16.getHorarios().addElement("09:10");
		ponto16.getHorarios().addElement("10:30");
		ponto16.getHorarios().addElement("11:10");
		ponto16.getHorarios().addElement("12:50");
		ponto16.getHorarios().addElement("13:30");
		ponto16.getHorarios().addElement("15:30");
		ponto16.getHorarios().addElement("16:40");
		ponto16.getHorarios().addElement("18:20");
		ponto16.getHorarios().addElement("19:10");
		ponto16.getHorarios().addElement("20:15");
		ponto16.getHorarios().addElement("21:15");
		ponto16.getHorarios().addElement("22:15");
		ponto16.getHorarios().addElement("23:15");
		ponto16.getHorarios().addElement("00:20");
		return onibus;
		}
	}
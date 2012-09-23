
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusO74 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("O74 - CTBA / Q. BARRAS (BR 116)");
		onibus.setCodigo("O74");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO BORDA DO CAMPO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:36");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("04:00");
		ponto1.getHorarios().addElement("05:00");
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("08:38");
		ponto1.getHorarios().addElement("09:36");
		ponto1.getHorarios().addElement("10:42");
		ponto1.getHorarios().addElement("11:42");
		ponto1.getHorarios().addElement("12:42");
		ponto1.getHorarios().addElement("13:42");
		ponto1.getHorarios().addElement("14:50");
		ponto1.getHorarios().addElement("15:50");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("18:00");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:40");
		ponto1.getHorarios().addElement("20:25");
		ponto1.getHorarios().addElement("21:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL QUATRO BARRAS");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:30");
		ponto2.getHorarios().addElement("04:10");
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:27");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:02");
		ponto2.getHorarios().addElement("07:38");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:46");
		ponto2.getHorarios().addElement("09:42");
		ponto2.getHorarios().addElement("10:42");
		ponto2.getHorarios().addElement("11:42");
		ponto2.getHorarios().addElement("12:42");
		ponto2.getHorarios().addElement("13:42");
		ponto2.getHorarios().addElement("14:42");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("16:53");
		ponto2.getHorarios().addElement("17:05");
		ponto2.getHorarios().addElement("18:10");
		ponto2.getHorarios().addElement("18:30");
		ponto2.getHorarios().addElement("19:20");
		ponto2.getHorarios().addElement("20:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE2");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("16:05");
		ponto3.getHorarios().addElement("17:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO BORDA DO CAMPO");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:10");
		ponto4.getHorarios().addElement("05:40");
		ponto4.getHorarios().addElement("06:10");
		ponto4.getHorarios().addElement("21:25");
		ponto4.getHorarios().addElement("22:25");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("04:00");
		ponto5.getHorarios().addElement("05:00");
		ponto5.getHorarios().addElement("06:00");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:10");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("09:40");
		ponto5.getHorarios().addElement("10:20");
		ponto5.getHorarios().addElement("11:00");
		ponto5.getHorarios().addElement("11:40");
		ponto5.getHorarios().addElement("12:20");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("13:40");
		ponto5.getHorarios().addElement("14:20");
		ponto5.getHorarios().addElement("15:00");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("18:00");
		ponto5.getHorarios().addElement("19:00");
		ponto5.getHorarios().addElement("20:00");
		ponto5.getHorarios().addElement("20:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL QUATRO BARRAS");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:03");
		ponto6.getHorarios().addElement("04:15");
		ponto6.getHorarios().addElement("05:00");
		ponto6.getHorarios().addElement("05:30");
		ponto6.getHorarios().addElement("06:00");
		ponto6.getHorarios().addElement("06:30");
		ponto6.getHorarios().addElement("07:00");
		ponto6.getHorarios().addElement("07:30");
		ponto6.getHorarios().addElement("08:00");
		ponto6.getHorarios().addElement("08:40");
		ponto6.getHorarios().addElement("09:20");
		ponto6.getHorarios().addElement("10:00");
		ponto6.getHorarios().addElement("10:40");
		ponto6.getHorarios().addElement("11:20");
		ponto6.getHorarios().addElement("12:00");
		ponto6.getHorarios().addElement("12:40");
		ponto6.getHorarios().addElement("13:20");
		ponto6.getHorarios().addElement("14:00");
		ponto6.getHorarios().addElement("15:00");
		ponto6.getHorarios().addElement("16:00");
		ponto6.getHorarios().addElement("17:00");
		ponto6.getHorarios().addElement("18:00");
		ponto6.getHorarios().addElement("19:00");
		ponto6.getHorarios().addElement("20:00");
		ponto6.getHorarios().addElement("21:00");
		ponto6.getHorarios().addElement("22:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("BAIRRO BORDA DO CAMPO");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("02/09/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:40");
		ponto7.getHorarios().addElement("22:20");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL GUADALUPE");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("02/09/2012");
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
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL QUATRO BARRAS");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("02/09/2012");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("05:00");
		ponto9.getHorarios().addElement("06:00");
		ponto9.getHorarios().addElement("07:00");
		ponto9.getHorarios().addElement("08:00");
		ponto9.getHorarios().addElement("09:00");
		ponto9.getHorarios().addElement("10:00");
		ponto9.getHorarios().addElement("11:00");
		ponto9.getHorarios().addElement("12:00");
		ponto9.getHorarios().addElement("13:00");
		ponto9.getHorarios().addElement("14:00");
		ponto9.getHorarios().addElement("15:00");
		ponto9.getHorarios().addElement("16:00");
		ponto9.getHorarios().addElement("17:00");
		ponto9.getHorarios().addElement("18:00");
		ponto9.getHorarios().addElement("19:00");
		ponto9.getHorarios().addElement("20:00");
		ponto9.getHorarios().addElement("22:00");
		return onibus;
		}
	}
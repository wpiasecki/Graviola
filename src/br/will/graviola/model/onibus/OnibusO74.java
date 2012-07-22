
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
		onibus.setNome("CTBA / Q. BARRAS (BR 116)");
		onibus.setCodigo("O74");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO BORDA DO CAMPO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:36");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("28/05/2012");
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
		ponto1.getHorarios().addElement("16:05");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:30");
		ponto1.getHorarios().addElement("18:00");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:40");
		ponto1.getHorarios().addElement("20:08");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("22:05");
		ponto1.getHorarios().addElement("23:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL QUATRO BARRAS");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("28/05/2012");
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
		ponto2.getHorarios().addElement("08:40");
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
		ponto2.getHorarios().addElement("19:12");
		ponto2.getHorarios().addElement("20:10");
		ponto2.getHorarios().addElement("21:05");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:55");
		ponto2.getHorarios().addElement("23:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("19/09/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("04:00");
		ponto3.getHorarios().addElement("05:00");
		ponto3.getHorarios().addElement("06:00");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("09:40");
		ponto3.getHorarios().addElement("10:20");
		ponto3.getHorarios().addElement("11:00");
		ponto3.getHorarios().addElement("11:40");
		ponto3.getHorarios().addElement("12:20");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("13:40");
		ponto3.getHorarios().addElement("14:20");
		ponto3.getHorarios().addElement("15:00");
		ponto3.getHorarios().addElement("16:00");
		ponto3.getHorarios().addElement("17:00");
		ponto3.getHorarios().addElement("18:00");
		ponto3.getHorarios().addElement("19:00");
		ponto3.getHorarios().addElement("20:00");
		ponto3.getHorarios().addElement("21:00");
		ponto3.getHorarios().addElement("22:00");
		ponto3.getHorarios().addElement("23:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL QUATRO BARRAS");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("19/09/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("01:30");
		ponto4.getHorarios().addElement("04:15");
		ponto4.getHorarios().addElement("05:00");
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("08:40");
		ponto4.getHorarios().addElement("09:20");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("10:40");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("12:40");
		ponto4.getHorarios().addElement("13:20");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("20:00");
		ponto4.getHorarios().addElement("21:00");
		ponto4.getHorarios().addElement("22:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("20/09/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("04:00");
		ponto5.getHorarios().addElement("06:00");
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("11:00");
		ponto5.getHorarios().addElement("12:00");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("15:00");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("18:00");
		ponto5.getHorarios().addElement("19:00");
		ponto5.getHorarios().addElement("20:00");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("22:00");
		ponto5.getHorarios().addElement("23:00");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL QUATRO BARRAS");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("20/09/2009");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:30");
		ponto6.getHorarios().addElement("05:00");
		ponto6.getHorarios().addElement("06:00");
		ponto6.getHorarios().addElement("07:00");
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
		return onibus;
		}
	}
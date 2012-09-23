
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusG11 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("G11 - QUITANDINHA / PINHEIRINHO");
		onibus.setCodigo("G11");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL PINHEIRINHO (CHEGADA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("30/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("13:35");
		ponto0.getHorarios().addElement("14:20");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("15:50");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("20:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO (SAIDA)");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("30/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("11:10");
		ponto1.getHorarios().addElement("12:10");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:00");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("16:20");
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("20:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("QUITANDINHA (CHEGADA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("30/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("09:20");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("11:20");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:25");
		ponto2.getHorarios().addElement("15:20");
		ponto2.getHorarios().addElement("15:50");
		ponto2.getHorarios().addElement("16:50");
		ponto2.getHorarios().addElement("18:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("QUITANDINHA (SAIDA)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("30/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("04:50");
		ponto3.getHorarios().addElement("05:20");
		ponto3.getHorarios().addElement("05:35");
		ponto3.getHorarios().addElement("05:55");
		ponto3.getHorarios().addElement("06:15");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("07:50");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:30");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("12:15");
		ponto3.getHorarios().addElement("12:50");
		ponto3.getHorarios().addElement("14:00");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("15:30");
		ponto3.getHorarios().addElement("16:15");
		ponto3.getHorarios().addElement("17:10");
		ponto3.getHorarios().addElement("18:40");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL PINHEIRINHO (SAIDA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("30/04/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:20");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("09:00");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("11:00");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("12:30");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("15:30");
		ponto4.getHorarios().addElement("16:20");
		ponto4.getHorarios().addElement("16:50");
		ponto4.getHorarios().addElement("17:20");
		ponto4.getHorarios().addElement("17:50");
		ponto4.getHorarios().addElement("18:10");
		ponto4.getHorarios().addElement("18:40");
		ponto4.getHorarios().addElement("19:30");
		ponto4.getHorarios().addElement("20:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("QUITANDINHA (SAIDA)");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("30/04/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("04:50");
		ponto5.getHorarios().addElement("05:30");
		ponto5.getHorarios().addElement("06:00");
		ponto5.getHorarios().addElement("06:20");
		ponto5.getHorarios().addElement("06:50");
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("07:50");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:10");
		ponto5.getHorarios().addElement("18:40");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL PINHEIRINHO (SAIDA)");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("01/05/2011");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("07:00");
		ponto6.getHorarios().addElement("08:00");
		ponto6.getHorarios().addElement("09:00");
		ponto6.getHorarios().addElement("10:00");
		ponto6.getHorarios().addElement("11:00");
		ponto6.getHorarios().addElement("12:30");
		ponto6.getHorarios().addElement("14:00");
		ponto6.getHorarios().addElement("14:50");
		ponto6.getHorarios().addElement("15:30");
		ponto6.getHorarios().addElement("17:00");
		ponto6.getHorarios().addElement("18:15");
		ponto6.getHorarios().addElement("19:00");
		ponto6.getHorarios().addElement("19:45");
		ponto6.getHorarios().addElement("20:30");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("QUITANDINHA (SAIDA)");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("01/05/2011");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:30");
		ponto7.getHorarios().addElement("06:10");
		ponto7.getHorarios().addElement("06:45");
		ponto7.getHorarios().addElement("07:40");
		ponto7.getHorarios().addElement("08:50");
		ponto7.getHorarios().addElement("09:30");
		ponto7.getHorarios().addElement("10:50");
		ponto7.getHorarios().addElement("12:30");
		ponto7.getHorarios().addElement("14:00");
		ponto7.getHorarios().addElement("15:30");
		ponto7.getHorarios().addElement("16:45");
		ponto7.getHorarios().addElement("17:00");
		ponto7.getHorarios().addElement("17:15");
		ponto7.getHorarios().addElement("17:45");
		ponto7.getHorarios().addElement("18:20");
		return onibus;
		}
	}
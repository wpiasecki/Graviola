
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusO75 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("BRITANITE");
		onibus.setCodigo("O75");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BRITANITE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("31/10/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("04:50");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:55");
		ponto0.getHorarios().addElement("09:25");
		ponto0.getHorarios().addElement("10:15");
		ponto0.getHorarios().addElement("10:45");
		ponto0.getHorarios().addElement("11:15");
		ponto0.getHorarios().addElement("12:15");
		ponto0.getHorarios().addElement("12:45");
		ponto0.getHorarios().addElement("13:45");
		ponto0.getHorarios().addElement("14:15");
		ponto0.getHorarios().addElement("15:15");
		ponto0.getHorarios().addElement("15:45");
		ponto0.getHorarios().addElement("16:40");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("18:05");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("20:25");
		ponto0.getHorarios().addElement("21:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("FLORESTAL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("31/10/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:10");
		ponto1.getHorarios().addElement("05:55");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("09:50");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("14:45");
		ponto1.getHorarios().addElement("16:15");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("18:30");
		ponto1.getHorarios().addElement("19:55");
		ponto1.getHorarios().addElement("20:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERM.Q.BARRAS/BRITANITE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("31/10/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:20");
		ponto2.getHorarios().addElement("06:10");
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("07:25");
		ponto2.getHorarios().addElement("07:50");
		ponto2.getHorarios().addElement("08:40");
		ponto2.getHorarios().addElement("09:10");
		ponto2.getHorarios().addElement("10:05");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:20");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:15");
		ponto2.getHorarios().addElement("20:10");
		ponto2.getHorarios().addElement("21:05");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("Q.BARRAS/COHAB-FLORESTAL");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("31/10/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:00");
		ponto3.getHorarios().addElement("05:45");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("09:40");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("16:00");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("18:20");
		ponto3.getHorarios().addElement("19:45");
		ponto3.getHorarios().addElement("20:40");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus516 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("C. BELEM / S. FILHO");
		onibus.setCodigo("516");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL HAUER");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("27/10/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("10:00");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("12:40");
		ponto0.getHorarios().addElement("13:20");
		ponto0.getHorarios().addElement("14:00");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:45");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("19:15");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("HAUER-RUA MANOEL MAGALHAES");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("27/10/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("12:20");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:40");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("18:05");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("19:35");
		ponto1.getHorarios().addElement("20:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("R.DR.MANOEL MAGALHAES ABREU");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("27/10/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:45");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:40");
		ponto2.getHorarios().addElement("11:45");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:10");
		ponto2.getHorarios().addElement("13:50");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:15");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("19:45");
		ponto2.getHorarios().addElement("20:45");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("SALGADO FILHO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("27/10/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:15");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:40");
		ponto3.getHorarios().addElement("08:20");
		ponto3.getHorarios().addElement("09:15");
		ponto3.getHorarios().addElement("10:15");
		ponto3.getHorarios().addElement("11:15");
		ponto3.getHorarios().addElement("12:10");
		ponto3.getHorarios().addElement("12:50");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("14:15");
		ponto3.getHorarios().addElement("15:15");
		ponto3.getHorarios().addElement("16:15");
		ponto3.getHorarios().addElement("17:10");
		ponto3.getHorarios().addElement("17:55");
		ponto3.getHorarios().addElement("18:40");
		ponto3.getHorarios().addElement("19:25");
		ponto3.getHorarios().addElement("20:15");
		ponto3.getHorarios().addElement("21:15");
		ponto3.getHorarios().addElement("22:15");
		ponto3.getHorarios().addElement("22:45");
		ponto3.getHorarios().addElement("23:15");
		return onibus;
		}
	}
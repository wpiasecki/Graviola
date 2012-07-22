
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusI90 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("T. CACHOEIRA / T. MARACANÃ");
		onibus.setCodigo("I90");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CACHOEIRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("17/08/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("11:15");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("12:45");
		ponto0.getHorarios().addElement("13:30");
		ponto0.getHorarios().addElement("14:15");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("15:45");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("17:15");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("20:15");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("22:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL MARACANA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("17/08/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:15");
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:10");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("08:15");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("09:45");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("11:15");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("12:45");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("14:15");
		ponto1.getHorarios().addElement("15:00");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:15");
		ponto1.getHorarios().addElement("18:00");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("20:15");
		ponto1.getHorarios().addElement("21:45");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CACHOEIRA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("19:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL MARACANA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:15");
		ponto3.getHorarios().addElement("06:45");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("09:45");
		ponto3.getHorarios().addElement("11:15");
		ponto3.getHorarios().addElement("12:45");
		ponto3.getHorarios().addElement("14:15");
		ponto3.getHorarios().addElement("15:45");
		ponto3.getHorarios().addElement("17:15");
		ponto3.getHorarios().addElement("18:45");
		ponto3.getHorarios().addElement("20:15");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL CACHOEIRA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("08:10");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("10:50");
		ponto4.getHorarios().addElement("12:10");
		ponto4.getHorarios().addElement("13:30");
		ponto4.getHorarios().addElement("14:50");
		ponto4.getHorarios().addElement("16:10");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("19:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL MARACANA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:50");
		ponto5.getHorarios().addElement("10:10");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:50");
		ponto5.getHorarios().addElement("14:10");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:50");
		ponto5.getHorarios().addElement("18:20");
		ponto5.getHorarios().addElement("20:00");
		return onibus;
		}
	}
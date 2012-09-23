
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusE78 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E78 - CTBA / ROSEIRA");
		onibus.setCodigo("E78");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ROSEIRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/03/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("12:15");
		ponto0.getHorarios().addElement("12:50");
		ponto0.getHorarios().addElement("14:10");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("20:05");
		ponto0.getHorarios().addElement("22:05");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/03/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:20");
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("13:25");
		ponto1.getHorarios().addElement("15:40");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ROSEIRA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("17/03/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:20");
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("12:15");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("16:10");
		ponto2.getHorarios().addElement("18:55");
		ponto2.getHorarios().addElement("20:10");
		ponto2.getHorarios().addElement("22:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("17/03/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:20");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("09:25");
		ponto3.getHorarios().addElement("11:25");
		ponto3.getHorarios().addElement("13:15");
		ponto3.getHorarios().addElement("15:25");
		ponto3.getHorarios().addElement("18:10");
		ponto3.getHorarios().addElement("19:25");
		ponto3.getHorarios().addElement("21:15");
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ROSEIRA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("18/03/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:05");
		ponto4.getHorarios().addElement("07:50");
		ponto4.getHorarios().addElement("09:55");
		ponto4.getHorarios().addElement("14:05");
		ponto4.getHorarios().addElement("19:05");
		ponto4.getHorarios().addElement("22:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("18/03/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:20");
		ponto5.getHorarios().addElement("07:05");
		ponto5.getHorarios().addElement("09:10");
		ponto5.getHorarios().addElement("13:20");
		ponto5.getHorarios().addElement("18:20");
		ponto5.getHorarios().addElement("21:15");
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB80 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / COLOMBO (CAMBARÁ)");
		onibus.setCodigo("B80");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("COLOMBO (CAMBARA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/12/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("15:45");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("18:15");
		ponto0.getHorarios().addElement("19:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/12/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("10:45");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("20:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("COLOMBO (CAMBARA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("21/07/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("17:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("21/07/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("16:30");
		ponto3.getHorarios().addElement("18:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("COLOMBO (CAMBARA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("22/07/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("15:30");
		ponto4.getHorarios().addElement("17:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("22/07/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("18:30");
		return onibus;
		}
	}
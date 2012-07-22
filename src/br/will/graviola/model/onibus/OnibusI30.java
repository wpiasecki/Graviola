
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusI30 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("C. LARGO / BALSA NOVA");
		onibus.setCodigo("I30");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO BALSA NOVA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("25/11/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:55");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("09:15");
		ponto0.getHorarios().addElement("10:45");
		ponto0.getHorarios().addElement("12:15");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("17:45");
		ponto0.getHorarios().addElement("19:15");
		ponto0.getHorarios().addElement("22:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO LARGO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("25/11/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("13:45");
		ponto1.getHorarios().addElement("15:15");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("18:30");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("23:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO BALSA NOVA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("26/11/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:55");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("09:15");
		ponto2.getHorarios().addElement("10:45");
		ponto2.getHorarios().addElement("12:15");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("19:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAMPO LARGO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("26/11/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:40");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("10:00");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("15:15");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("22:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO BALSA NOVA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("27/11/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("09:00");
		ponto4.getHorarios().addElement("10:45");
		ponto4.getHorarios().addElement("12:15");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("20:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CAMPO LARGO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("27/11/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("08:15");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("18:00");
		ponto5.getHorarios().addElement("19:45");
		ponto5.getHorarios().addElement("22:30");
		return onibus;
		}
	}
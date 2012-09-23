
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus509 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("509 - MAD. BOQUEIRÃO");
		onibus.setCodigo("509");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA CARLOS GOMES (CHEGADA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("00:00");
		ponto0.getHorarios().addElement("01:00");
		ponto0.getHorarios().addElement("01:55");
		ponto0.getHorarios().addElement("02:55");
		ponto0.getHorarios().addElement("03:55");
		ponto0.getHorarios().addElement("04:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA CARLOS GOMES (SAIDA)");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("00:05");
		ponto1.getHorarios().addElement("01:05");
		ponto1.getHorarios().addElement("02:00");
		ponto1.getHorarios().addElement("03:00");
		ponto1.getHorarios().addElement("04:00");
		ponto1.getHorarios().addElement("05:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL BOQUEIRAO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("01/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("00:30");
		ponto2.getHorarios().addElement("01:30");
		ponto2.getHorarios().addElement("02:30");
		ponto2.getHorarios().addElement("03:30");
		ponto2.getHorarios().addElement("04:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA CARLOS GOMES (CHEGADA)");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("02/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("00:00");
		ponto3.getHorarios().addElement("01:00");
		ponto3.getHorarios().addElement("01:55");
		ponto3.getHorarios().addElement("02:55");
		ponto3.getHorarios().addElement("03:55");
		ponto3.getHorarios().addElement("04:55");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA CARLOS GOMES (SAIDA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("02/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:05");
		ponto4.getHorarios().addElement("01:05");
		ponto4.getHorarios().addElement("02:00");
		ponto4.getHorarios().addElement("03:00");
		ponto4.getHorarios().addElement("04:00");
		ponto4.getHorarios().addElement("05:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL BOQUEIRAO");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("02/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("00:30");
		ponto5.getHorarios().addElement("01:30");
		ponto5.getHorarios().addElement("02:30");
		ponto5.getHorarios().addElement("03:30");
		ponto5.getHorarios().addElement("04:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PRACA CARLOS GOMES (CHEGADA)");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("00:00");
		ponto6.getHorarios().addElement("01:00");
		ponto6.getHorarios().addElement("01:55");
		ponto6.getHorarios().addElement("02:55");
		ponto6.getHorarios().addElement("03:55");
		ponto6.getHorarios().addElement("04:55");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRACA CARLOS GOMES (SAIDA)");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("00:05");
		ponto7.getHorarios().addElement("01:05");
		ponto7.getHorarios().addElement("02:00");
		ponto7.getHorarios().addElement("03:00");
		ponto7.getHorarios().addElement("04:00");
		ponto7.getHorarios().addElement("05:00");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL BOQUEIRAO");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("00:30");
		ponto8.getHorarios().addElement("01:30");
		ponto8.getHorarios().addElement("02:30");
		ponto8.getHorarios().addElement("03:30");
		ponto8.getHorarios().addElement("04:30");
		return onibus;
		}
	}
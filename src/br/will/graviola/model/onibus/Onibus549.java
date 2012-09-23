
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus549 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("549 - MAD. BAIRRO NOVO");
		onibus.setCodigo("549");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO NOVO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/08/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("01:45");
		ponto0.getHorarios().addElement("02:45");
		ponto0.getHorarios().addElement("03:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL BOQUEIRAO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/08/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:30");
		ponto1.getHorarios().addElement("02:30");
		ponto1.getHorarios().addElement("03:30");
		ponto1.getHorarios().addElement("04:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO NOVO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:45");
		ponto2.getHorarios().addElement("02:45");
		ponto2.getHorarios().addElement("04:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL BOQUEIRAO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:30");
		ponto3.getHorarios().addElement("02:30");
		ponto3.getHorarios().addElement("03:30");
		ponto3.getHorarios().addElement("04:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO NOVO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("01:45");
		ponto4.getHorarios().addElement("02:45");
		ponto4.getHorarios().addElement("04:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL BOQUEIRAO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:30");
		ponto5.getHorarios().addElement("02:30");
		ponto5.getHorarios().addElement("03:30");
		ponto5.getHorarios().addElement("04:30");
		return onibus;
		}
	}
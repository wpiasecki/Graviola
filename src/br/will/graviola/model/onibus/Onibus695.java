
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus695 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("695 - E. E. ALTO BOQUEIRÃO");
		onibus.setCodigo("695");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA APADEH");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("16:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA APADEVI");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("11:05");
		ponto1.getHorarios().addElement("17:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("GARAGEM");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITES CHEGADA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:15");
		ponto3.getHorarios().addElement("11:15");
		ponto3.getHorarios().addElement("13:15");
		ponto3.getHorarios().addElement("17:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL SITES SAIDA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("11:40");
		ponto4.getHorarios().addElement("13:30");
		ponto4.getHorarios().addElement("17:45");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ESCOLA ALCINDO FANAYA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:50");
		ponto5.getHorarios().addElement("10:50");
		ponto5.getHorarios().addElement("16:50");
		return onibus;
		}
	}
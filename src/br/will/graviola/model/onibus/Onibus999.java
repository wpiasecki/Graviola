
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus999 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("999 - E.E. VIVIAN MARCAL 2");
		onibus.setCodigo("999");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA VIVIAN MARCAL SEDE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("18/10/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("11:10");
		ponto0.getHorarios().addElement("17:15");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA VIVIAN MARCAL-SUB SEDE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("18/10/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("10:40");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("16:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO - VIVIAN MARCAL 2");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("18/10/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("12:20");
		return onibus;
		}
	}
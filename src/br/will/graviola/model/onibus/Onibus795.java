
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus795 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("795 - E. E. ALCINDO FANAYA 2");
		onibus.setCodigo("795");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO - LUAN MULLER 2");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("12:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA APADEH");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("17:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA ALCINDO FANAYA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:40");
		ponto2.getHorarios().addElement("17:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESCOLA LUAN MULLER");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("11:00");
		ponto3.getHorarios().addElement("17:00");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus298 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("298 - E. E. ALCINDO FANAYA 3");
		onibus.setCodigo("298");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO - LUAN MULLER 4");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA APADEH");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("16:45");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITES SAIDA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("11:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESCOLA ALCINDO FANAYA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("17:00");
		return onibus;
		}
	}
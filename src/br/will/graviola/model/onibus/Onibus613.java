
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus613 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("V. URANO");
		onibus.setCodigo("613");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO V. URANO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO RASO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:47");
		ponto1.getHorarios().addElement("07:17");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusC04 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("C04 - T. C. IMBUIA / T. PINHAIS");
		onibus.setCodigo("C04");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:25");
		ponto0.getHorarios().addElement("17:36");
		ponto0.getHorarios().addElement("17:47");
		ponto0.getHorarios().addElement("17:58");
		ponto0.getHorarios().addElement("18:09");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:31");
		ponto0.getHorarios().addElement("18:42");
		ponto0.getHorarios().addElement("18:53");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHAIS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		return onibus;
		}
	}
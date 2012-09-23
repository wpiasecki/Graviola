
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusG73 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("G73 - CTBA / CAMP. DOS PAULAS");
		onibus.setCodigo("G73");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ALAMEDA DR. MURICY");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("26/09/2005");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:15");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("CAMPESTRE DOS PAULAS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("26/09/2005");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:40");
		return onibus;
		}
	}
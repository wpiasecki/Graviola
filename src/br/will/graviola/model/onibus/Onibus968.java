
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus968 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("968 - ESPECIAL TROMBINI");
		onibus.setCodigo("968");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("RUA BARAO DO CERRO AZUL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("22:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TROMBINI");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/05/2012");
		onibus.getPontos().addElement(ponto1);
		return onibus;
		}
	}
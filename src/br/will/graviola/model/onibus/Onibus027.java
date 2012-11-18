
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus027 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("027 - C.RASO/C.DO SIQUEIRA");
		onibus.setCodigo("027");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:21");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO RASO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:09");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:23");
		ponto1.getHorarios().addElement("07:46");
		return onibus;
		}
	}
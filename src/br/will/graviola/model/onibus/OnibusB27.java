
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB27 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B27 - RIBEIRA / FCO. CORADIN");
		onibus.setCodigo("B27");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUARAITUBA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/12/2008");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("19:00");
		return onibus;
		}
	}
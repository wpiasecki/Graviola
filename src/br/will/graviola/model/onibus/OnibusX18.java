
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusX18 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("X18 - ESPECIAL PAUL GARFUNKEL");
		onibus.setCodigo("X18");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CIC");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("18:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("RUA PAUL GARFUNKEL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("16:45");
		ponto1.getHorarios().addElement("17:15");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:15");
		return onibus;
		}
	}
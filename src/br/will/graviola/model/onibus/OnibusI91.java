
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusI91 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("TAMANDARÉ / COLOMBO");
		onibus.setCodigo("I91");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("COLOMBO (SEDE)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("12/07/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("11:10");
		ponto0.getHorarios().addElement("11:50");
		ponto0.getHorarios().addElement("12:30");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:35");
		ponto0.getHorarios().addElement("19:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL TAMANDARE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("12/07/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("12:10");
		ponto1.getHorarios().addElement("12:50");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:30");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("19:00");
		ponto1.getHorarios().addElement("19:40");
		return onibus;
		}
	}
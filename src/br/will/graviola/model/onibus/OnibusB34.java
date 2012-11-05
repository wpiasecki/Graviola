
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB34 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B34 - GUARAITUBA / MARACANA");
		onibus.setCodigo("B34");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL MARACANA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:40");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("18:40");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUARAITUBA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:10");
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("07:40");
		return onibus;
		}
	}
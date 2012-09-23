
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus688 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("688 - PINHEIRINHO / ZOOLÓGICO");
		onibus.setCodigo("688");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO PINHEIRINHO/ZOOLOGICO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto0.setValidoAPartirDe("22/11/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("09:40");
		ponto0.getHorarios().addElement("10:07");
		ponto0.getHorarios().addElement("10:33");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:27");
		ponto0.getHorarios().addElement("11:53");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:47");
		ponto0.getHorarios().addElement("13:13");
		ponto0.getHorarios().addElement("13:40");
		ponto0.getHorarios().addElement("14:07");
		ponto0.getHorarios().addElement("14:33");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("15:27");
		ponto0.getHorarios().addElement("15:53");
		ponto0.getHorarios().addElement("16:20");
		ponto0.getHorarios().addElement("16:47");
		ponto0.getHorarios().addElement("17:13");
		ponto0.getHorarios().addElement("17:40");
		ponto0.getHorarios().addElement("18:07");
		ponto0.getHorarios().addElement("18:33");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto1.setValidoAPartirDe("22/11/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("09:27");
		ponto1.getHorarios().addElement("09:53");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("10:47");
		ponto1.getHorarios().addElement("11:13");
		ponto1.getHorarios().addElement("11:40");
		ponto1.getHorarios().addElement("12:07");
		ponto1.getHorarios().addElement("12:33");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:27");
		ponto1.getHorarios().addElement("13:53");
		ponto1.getHorarios().addElement("14:20");
		ponto1.getHorarios().addElement("14:47");
		ponto1.getHorarios().addElement("15:13");
		ponto1.getHorarios().addElement("15:40");
		ponto1.getHorarios().addElement("16:07");
		ponto1.getHorarios().addElement("16:33");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:27");
		ponto1.getHorarios().addElement("17:53");
		return onibus;
		}
	}
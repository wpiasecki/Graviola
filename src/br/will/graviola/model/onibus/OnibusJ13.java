
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusJ13 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("J13 - TIMBOTUVA (EST. VELHA)");
		onibus.setCodigo("J13");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO TIMBUTUVA (EST.VELHA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:05");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:25");
		ponto0.getHorarios().addElement("16:56");
		ponto0.getHorarios().addElement("17:33");
		ponto0.getHorarios().addElement("18:11");
		ponto0.getHorarios().addElement("18:48");
		ponto0.getHorarios().addElement("19:26");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO COMPRIDO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:08");
		ponto1.getHorarios().addElement("06:43");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:53");
		ponto1.getHorarios().addElement("16:18");
		ponto1.getHorarios().addElement("16:55");
		ponto1.getHorarios().addElement("17:33");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("18:48");
		ponto1.getHorarios().addElement("19:25");
		ponto1.getHorarios().addElement("20:03");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("UNIVERSIDADE POSITIVO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:25");
		return onibus;
		}
	}
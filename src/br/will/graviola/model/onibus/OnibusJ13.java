
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
		onibus.setNome("TIMBOTUVA (EST. VELHA)");
		onibus.setCodigo("J13");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO TIMBUTUVA (EST.VELHA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
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
		ponto1.setValidoAPartirDe("09/07/2012");
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
		ponto2.setNome("BAIRRO TIMBUTUVA (EST.VELHA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("06:40");
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("07:50");
		ponto2.getHorarios().addElement("08:25");
		ponto2.getHorarios().addElement("16:56");
		ponto2.getHorarios().addElement("17:33");
		ponto2.getHorarios().addElement("18:11");
		ponto2.getHorarios().addElement("18:48");
		ponto2.getHorarios().addElement("19:26");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAMPO COMPRIDO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:08");
		ponto3.getHorarios().addElement("06:43");
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("07:53");
		ponto3.getHorarios().addElement("16:18");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("17:33");
		ponto3.getHorarios().addElement("18:10");
		ponto3.getHorarios().addElement("18:48");
		ponto3.getHorarios().addElement("19:25");
		ponto3.getHorarios().addElement("20:03");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("UNIVERSIDADE POSITIVO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:25");
		return onibus;
		}
	}
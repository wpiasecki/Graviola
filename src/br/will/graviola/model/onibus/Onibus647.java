
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus647 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("647 - CACHIMBA");
		onibus.setCodigo("647");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO CACHIMBA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:55");
		ponto0.getHorarios().addElement("06:25");
		ponto0.getHorarios().addElement("07:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:35");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO JD.SANT_ANA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:10");
		ponto2.getHorarios().addElement("07:35");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("BAIRRO CACHIMBA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/01/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:25");
		ponto3.getHorarios().addElement("06:40");
		ponto3.getHorarios().addElement("08:01");
		ponto3.getHorarios().addElement("17:35");
		ponto3.getHorarios().addElement("18:57");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL PINHEIRINHO");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("14/01/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("07:20");
		ponto4.getHorarios().addElement("16:54");
		ponto4.getHorarios().addElement("18:16");
		ponto4.getHorarios().addElement("19:37");
		return onibus;
		}
	}
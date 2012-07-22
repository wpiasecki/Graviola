
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
		onibus.setNome("CACHIMBA");
		onibus.setCodigo("647");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO CACHIMBA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/01/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("06:25");
		ponto0.getHorarios().addElement("07:05");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/01/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO CACHIMBA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:55");
		ponto2.getHorarios().addElement("06:25");
		ponto2.getHorarios().addElement("07:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHEIRINHO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:45");
		ponto3.getHorarios().addElement("06:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO JD.SANT_ANA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:10");
		ponto4.getHorarios().addElement("07:35");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("BAIRRO CACHIMBA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("14/01/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:25");
		ponto5.getHorarios().addElement("06:40");
		ponto5.getHorarios().addElement("08:01");
		ponto5.getHorarios().addElement("17:35");
		ponto5.getHorarios().addElement("18:57");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL PINHEIRINHO");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("14/01/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:00");
		ponto6.getHorarios().addElement("07:20");
		ponto6.getHorarios().addElement("16:54");
		ponto6.getHorarios().addElement("18:16");
		ponto6.getHorarios().addElement("19:37");
		return onibus;
		}
	}
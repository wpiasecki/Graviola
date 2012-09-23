
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus667 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("667 - TERMINAL CIC");
		onibus.setCodigo("667");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO RASO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CIC");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("23:12");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL PINHEIRINHO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto2);
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PORTAO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("22:25");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("EMPRESA KRAFT");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("22:55");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CIC/TERM.PINHEIRINHO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("14:25");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("POSITIVO INFORMATICA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto6.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("14:15");
		ponto6.getHorarios().addElement("22:15");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL CAPAO RASO");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:35");
		ponto7.getHorarios().addElement("06:03");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL CIC");
		ponto8.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto8.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:50");
		ponto8.getHorarios().addElement("06:15");
		ponto8.getHorarios().addElement("06:50");
		ponto8.getHorarios().addElement("23:12");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL PINHEIRINHO");
		ponto9.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto9.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto9);
		Ponto ponto10 = new Ponto();
		ponto10.setNome("EMPRESA KRAFT");
		ponto10.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto10.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("06:35");
		ponto10.getHorarios().addElement("23:00");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("TERMINAL CIC/TERM.PINHEIRINHO");
		ponto11.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto11.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("14:30");
		Ponto ponto12 = new Ponto();
		ponto12.setNome("POSITIVO INFORMATICA");
		ponto12.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto12.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto12);
		ponto12.getHorarios().addElement("14:20");
		ponto12.getHorarios().addElement("22:15");
		Ponto ponto13 = new Ponto();
		ponto13.setNome("TERMINAL CAPAO RASO");
		ponto13.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto13.setValidoAPartirDe("21/12/2008");
		onibus.getPontos().addElement(ponto13);
		Ponto ponto14 = new Ponto();
		ponto14.setNome("TERMINAL CIC");
		ponto14.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto14.setValidoAPartirDe("21/12/2008");
		onibus.getPontos().addElement(ponto14);
		ponto14.getHorarios().addElement("23:12");
		Ponto ponto15 = new Ponto();
		ponto15.setNome("EMPRESA KRAFT");
		ponto15.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto15.setValidoAPartirDe("21/12/2008");
		onibus.getPontos().addElement(ponto15);
		ponto15.getHorarios().addElement("06:35");
		ponto15.getHorarios().addElement("23:00");
		return onibus;
		}
	}
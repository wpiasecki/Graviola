
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus668 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("668 - CASA DE CUSTÓDIA");
		onibus.setCodigo("668");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO RASO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("15/09/2008");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:13");
		ponto0.getHorarios().addElement("07:38");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CIC");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("15/09/2008");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:35");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("CASA DE CUSTODIA (CHEGADA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("15/09/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:45");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("R.ALGACYR MUNHOZ MADER");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("15/09/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("07:52");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL CIC");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("05/05/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("11:15");
		ponto4.getHorarios().addElement("12:05");
		ponto4.getHorarios().addElement("16:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("CASA DE CUSTODIA (CHEGADA)");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("05/05/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:45");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("16:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("CASA DE CUSTODIA (SAIDA)");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("05/05/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("07:15");
		ponto6.getHorarios().addElement("11:45");
		ponto6.getHorarios().addElement("17:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL CIC");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("06/05/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:30");
		ponto7.getHorarios().addElement("07:30");
		ponto7.getHorarios().addElement("11:15");
		ponto7.getHorarios().addElement("12:05");
		ponto7.getHorarios().addElement("16:15");
		ponto7.getHorarios().addElement("17:20");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("CASA DE CUSTODIA (CHEGADA)");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("06/05/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("06:45");
		ponto8.getHorarios().addElement("11:30");
		ponto8.getHorarios().addElement("16:30");
		ponto8.getHorarios().addElement("17:35");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("CASA DE CUSTODIA (SAIDA)");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("06/05/2012");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("07:15");
		ponto9.getHorarios().addElement("11:45");
		ponto9.getHorarios().addElement("17:00");
		ponto9.getHorarios().addElement("18:00");
		return onibus;
		}
	}
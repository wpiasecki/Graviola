
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusF73 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("F73 - FAZ. RIO GRANDE / A. BRANCA");
		onibus.setCodigo("F73");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("AREIA BRANCA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("29/08/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("16:45");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("18:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("MANDIRITUBA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("29/08/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:35");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("10:45");
		ponto1.getHorarios().addElement("11:55");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("16:25");
		ponto1.getHorarios().addElement("17:22");
		ponto1.getHorarios().addElement("18:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("29/08/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:55");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("10:00");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:35");
		ponto2.getHorarios().addElement("15:35");
		ponto2.getHorarios().addElement("17:55");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TAURUS");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("29/08/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("13:50");
		ponto3.getHorarios().addElement("17:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ESPIGAO DAS ANTAS");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("29/08/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("08:50");
		ponto4.getHorarios().addElement("17:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("QUEIMADOS");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("29/08/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("11:45");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("AREIA BRANCA");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("27/08/2011");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("08:40");
		ponto6.getHorarios().addElement("09:00");
		ponto6.getHorarios().addElement("18:40");
		ponto6.getHorarios().addElement("19:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("MANDIRITUBA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("27/08/2011");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("07:35");
		ponto7.getHorarios().addElement("08:25");
		ponto7.getHorarios().addElement("09:20");
		ponto7.getHorarios().addElement("12:00");
		ponto7.getHorarios().addElement("12:45");
		ponto7.getHorarios().addElement("17:30");
		ponto7.getHorarios().addElement("18:30");
		ponto7.getHorarios().addElement("19:20");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto8.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto8.setValidoAPartirDe("27/08/2011");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("07:05");
		ponto8.getHorarios().addElement("08:00");
		ponto8.getHorarios().addElement("11:15");
		ponto8.getHorarios().addElement("12:25");
		ponto8.getHorarios().addElement("17:10");
		ponto8.getHorarios().addElement("18:00");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("ESPIGAO DAS ANTAS");
		ponto9.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto9.setValidoAPartirDe("27/08/2011");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("05:50");
		ponto9.getHorarios().addElement("08:50");
		ponto9.getHorarios().addElement("18:50");
		return onibus;
		}
	}
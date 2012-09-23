
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusG71 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("G71 - CTBA / MANDIRITUBA");
		onibus.setCodigo("G71");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ALAMEDA DR. MURICY");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/02/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:25");
		ponto0.getHorarios().addElement("11:40");
		ponto0.getHorarios().addElement("14:40");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("16:35");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("20:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("AREIA BRANCA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/02/2011");
		onibus.getPontos().addElement(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setNome("MANDIRITUBA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("21/02/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:15");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("07:50");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("13:10");
		ponto2.getHorarios().addElement("16:50");
		ponto2.getHorarios().addElement("18:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ALAMEDA DR. MURICY");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("17/11/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("10:00");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("17:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("MANDIRITUBA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("17/11/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:50");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("13:15");
		ponto4.getHorarios().addElement("15:45");
		ponto4.getHorarios().addElement("17:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ALAMEDA DR. MURICY");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("30/08/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("13:15");
		ponto5.getHorarios().addElement("19:00");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("AREIA BRANCA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("30/08/2009");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("17:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("MANDIRITUBA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("30/08/2009");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("07:30");
		ponto7.getHorarios().addElement("12:00");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusI31 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("COLOMBO / ANG. CARON");
		onibus.setCodigo("I31");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("HOSPITAL ANGELINA CARON");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/06/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:40");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("12:05");
		ponto0.getHorarios().addElement("13:10");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("15:50");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:05");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL ROCA GRANDE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/06/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:20");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("09:40");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("14:20");
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("19:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.GUARAITUBA SENTIDO ROCA GRAN");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/06/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("06:50");
		ponto2.getHorarios().addElement("08:25");
		ponto2.getHorarios().addElement("09:10");
		ponto2.getHorarios().addElement("11:25");
		ponto2.getHorarios().addElement("12:40");
		ponto2.getHorarios().addElement("13:45");
		ponto2.getHorarios().addElement("16:05");
		ponto2.getHorarios().addElement("16:25");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("18:45");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("T.GUARAITUBA SENTIDO ANG.CARON");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("13/06/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:50");
		ponto3.getHorarios().addElement("07:15");
		ponto3.getHorarios().addElement("08:00");
		ponto3.getHorarios().addElement("09:35");
		ponto3.getHorarios().addElement("10:10");
		ponto3.getHorarios().addElement("12:30");
		ponto3.getHorarios().addElement("13:50");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("17:10");
		ponto3.getHorarios().addElement("17:25");
		ponto3.getHorarios().addElement("19:55");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ANG.CARON  (CHEGADA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("14:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ANG.CARON  (SAIDA)");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("15:15");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL ROCA GRANDE");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("13:15");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("ANG.CARON  (CHEGADA)");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("14:15");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("ANG.CARON  (SAIDA)");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("15:15");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL ROCA GRANDE");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("13:15");
		return onibus;
		}
	}
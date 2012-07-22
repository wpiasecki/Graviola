
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusE77 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / GUATUPÊ");
		onibus.setCodigo("E77");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("GUATUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:15");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:20");
		ponto1.getHorarios().addElement("09:50");
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("12:20");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:30");
		ponto1.getHorarios().addElement("19:10");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("23:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("GUATUPE VIA JD.CRISTAL");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("16:10");
		ponto2.getHorarios().addElement("18:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("GUATUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("05/10/2002");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("10:50");
		ponto3.getHorarios().addElement("13:50");
		ponto3.getHorarios().addElement("15:10");
		ponto3.getHorarios().addElement("16:40");
		ponto3.getHorarios().addElement("18:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL GUADALUPE");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("05/10/2002");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("07:50");
		ponto4.getHorarios().addElement("10:15");
		ponto4.getHorarios().addElement("11:40");
		ponto4.getHorarios().addElement("13:15");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("17:20");
		ponto4.getHorarios().addElement("19:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("GUATUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("08/12/2002");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("08:40");
		ponto5.getHorarios().addElement("13:45");
		ponto5.getHorarios().addElement("16:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL GUADALUPE");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("08/12/2002");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("08:10");
		ponto6.getHorarios().addElement("13:15");
		ponto6.getHorarios().addElement("16:00");
		ponto6.getHorarios().addElement("18:10");
		return onibus;
		}
	}
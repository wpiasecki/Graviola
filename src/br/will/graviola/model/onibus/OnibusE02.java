
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusE02 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E02 - CTBA / APOLO");
		onibus.setCodigo("E02");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("06/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:46");
		ponto0.getHorarios().addElement("08:04");
		ponto0.getHorarios().addElement("08:33");
		ponto0.getHorarios().addElement("09:10");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("11:14");
		ponto0.getHorarios().addElement("12:50");
		ponto0.getHorarios().addElement("14:25");
		ponto0.getHorarios().addElement("15:53");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:35");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:45");
		ponto0.getHorarios().addElement("20:45");
		ponto0.getHorarios().addElement("22:15");
		ponto0.getHorarios().addElement("23:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("CONJUNTO APOLO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("06/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:48");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("12:03");
		ponto1.getHorarios().addElement("13:37");
		ponto1.getHorarios().addElement("15:08");
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:35");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:55");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("23:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL GUADALUPE");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("14/04/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("08:15");
		ponto2.getHorarios().addElement("08:58");
		ponto2.getHorarios().addElement("09:45");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("12:45");
		ponto2.getHorarios().addElement("14:15");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("19:30");
		ponto2.getHorarios().addElement("20:50");
		ponto2.getHorarios().addElement("22:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("CONJUNTO APOLO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/04/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:00");
		ponto3.getHorarios().addElement("06:45");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("12:00");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("17:15");
		ponto3.getHorarios().addElement("18:45");
		ponto3.getHorarios().addElement("20:10");
		ponto3.getHorarios().addElement("21:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL GUADALUPE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("15/04/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("08:10");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("12:50");
		ponto4.getHorarios().addElement("14:10");
		ponto4.getHorarios().addElement("18:50");
		ponto4.getHorarios().addElement("20:10");
		ponto4.getHorarios().addElement("22:10");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("CONJUNTO APOLO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("15/04/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:50");
		ponto5.getHorarios().addElement("12:10");
		ponto5.getHorarios().addElement("13:30");
		ponto5.getHorarios().addElement("18:10");
		ponto5.getHorarios().addElement("19:30");
		ponto5.getHorarios().addElement("21:30");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusF24 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("EUCALIPTOS II");
		onibus.setCodigo("F24");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("T.FAZENDA/EUCALIPTOS II");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/03/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("04:35");
		ponto0.getHorarios().addElement("04:55");
		ponto0.getHorarios().addElement("05:15");
		ponto0.getHorarios().addElement("05:25");
		ponto0.getHorarios().addElement("05:35");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("05:55");
		ponto0.getHorarios().addElement("06:05");
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:25");
		ponto0.getHorarios().addElement("06:35");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:30");
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("10:00");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:30");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("12:30");
		ponto0.getHorarios().addElement("13:00");
		ponto0.getHorarios().addElement("13:30");
		ponto0.getHorarios().addElement("14:00");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("16:25");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("16:50");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:20");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:40");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("18:40");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:40");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("20:30");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:35");
		ponto0.getHorarios().addElement("23:00");
		ponto0.getHorarios().addElement("23:30");
		ponto0.getHorarios().addElement("00:00");
		ponto0.getHorarios().addElement("00:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("T.FAZENDA/EUCALIPTOS II");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("14/04/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("04:30");
		ponto1.getHorarios().addElement("04:50");
		ponto1.getHorarios().addElement("05:10");
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("05:50");
		ponto1.getHorarios().addElement("06:10");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("09:30");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:00");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:30");
		ponto1.getHorarios().addElement("18:00");
		ponto1.getHorarios().addElement("18:30");
		ponto1.getHorarios().addElement("19:00");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("20:30");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("22:30");
		ponto1.getHorarios().addElement("23:00");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:00");
		ponto1.getHorarios().addElement("00:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.FAZENDA/EUCALIPTOS II");
		ponto2.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto2.setValidoAPartirDe("15/04/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("04:30");
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("10:00");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:30");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("19:30");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:00");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("00:00");
		ponto2.getHorarios().addElement("00:30");
		return onibus;
		}
	}
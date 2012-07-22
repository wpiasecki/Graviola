
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus718 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("PORTO BELO");
		onibus.setCodigo("718");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL FAZENDINHA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("02/03/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:02");
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:23");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:29");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("08:30");
		ponto0.getHorarios().addElement("08:55");
		ponto0.getHorarios().addElement("09:20");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:10");
		ponto0.getHorarios().addElement("10:35");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:25");
		ponto0.getHorarios().addElement("11:47");
		ponto0.getHorarios().addElement("12:07");
		ponto0.getHorarios().addElement("12:26");
		ponto0.getHorarios().addElement("12:45");
		ponto0.getHorarios().addElement("13:07");
		ponto0.getHorarios().addElement("13:28");
		ponto0.getHorarios().addElement("13:50");
		ponto0.getHorarios().addElement("14:15");
		ponto0.getHorarios().addElement("14:40");
		ponto0.getHorarios().addElement("15:05");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("15:55");
		ponto0.getHorarios().addElement("16:20");
		ponto0.getHorarios().addElement("16:45");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("17:57");
		ponto0.getHorarios().addElement("18:19");
		ponto0.getHorarios().addElement("18:41");
		ponto0.getHorarios().addElement("19:03");
		ponto0.getHorarios().addElement("19:25");
		ponto0.getHorarios().addElement("19:47");
		ponto0.getHorarios().addElement("20:09");
		ponto0.getHorarios().addElement("20:31");
		ponto0.getHorarios().addElement("20:53");
		ponto0.getHorarios().addElement("21:15");
		ponto0.getHorarios().addElement("21:40");
		ponto0.getHorarios().addElement("22:07");
		ponto0.getHorarios().addElement("22:38");
		ponto0.getHorarios().addElement("23:05");
		ponto0.getHorarios().addElement("23:27");
		ponto0.getHorarios().addElement("23:50");
		ponto0.getHorarios().addElement("00:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL FAZENDINHA");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("27/12/2008");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:05");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:45");
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("08:05");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("09:05");
		ponto1.getHorarios().addElement("09:25");
		ponto1.getHorarios().addElement("09:45");
		ponto1.getHorarios().addElement("10:05");
		ponto1.getHorarios().addElement("10:25");
		ponto1.getHorarios().addElement("10:45");
		ponto1.getHorarios().addElement("11:05");
		ponto1.getHorarios().addElement("11:25");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:05");
		ponto1.getHorarios().addElement("12:25");
		ponto1.getHorarios().addElement("12:45");
		ponto1.getHorarios().addElement("13:05");
		ponto1.getHorarios().addElement("13:25");
		ponto1.getHorarios().addElement("13:45");
		ponto1.getHorarios().addElement("14:05");
		ponto1.getHorarios().addElement("14:25");
		ponto1.getHorarios().addElement("14:45");
		ponto1.getHorarios().addElement("15:05");
		ponto1.getHorarios().addElement("15:25");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("16:05");
		ponto1.getHorarios().addElement("16:25");
		ponto1.getHorarios().addElement("16:45");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:25");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:05");
		ponto1.getHorarios().addElement("18:25");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("19:05");
		ponto1.getHorarios().addElement("19:25");
		ponto1.getHorarios().addElement("19:47");
		ponto1.getHorarios().addElement("20:12");
		ponto1.getHorarios().addElement("20:37");
		ponto1.getHorarios().addElement("21:02");
		ponto1.getHorarios().addElement("21:27");
		ponto1.getHorarios().addElement("21:52");
		ponto1.getHorarios().addElement("22:17");
		ponto1.getHorarios().addElement("22:42");
		ponto1.getHorarios().addElement("23:07");
		ponto1.getHorarios().addElement("23:32");
		ponto1.getHorarios().addElement("23:57");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL FAZENDINHA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto2.setValidoAPartirDe("28/12/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:45");
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("06:25");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:25");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:05");
		ponto2.getHorarios().addElement("08:25");
		ponto2.getHorarios().addElement("08:45");
		ponto2.getHorarios().addElement("09:05");
		ponto2.getHorarios().addElement("09:25");
		ponto2.getHorarios().addElement("09:45");
		ponto2.getHorarios().addElement("10:05");
		ponto2.getHorarios().addElement("10:25");
		ponto2.getHorarios().addElement("10:45");
		ponto2.getHorarios().addElement("11:05");
		ponto2.getHorarios().addElement("11:25");
		ponto2.getHorarios().addElement("11:45");
		ponto2.getHorarios().addElement("12:05");
		ponto2.getHorarios().addElement("12:25");
		ponto2.getHorarios().addElement("12:45");
		ponto2.getHorarios().addElement("13:05");
		ponto2.getHorarios().addElement("13:25");
		ponto2.getHorarios().addElement("13:45");
		ponto2.getHorarios().addElement("14:05");
		ponto2.getHorarios().addElement("14:25");
		ponto2.getHorarios().addElement("14:45");
		ponto2.getHorarios().addElement("15:05");
		ponto2.getHorarios().addElement("15:25");
		ponto2.getHorarios().addElement("15:45");
		ponto2.getHorarios().addElement("16:05");
		ponto2.getHorarios().addElement("16:25");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:05");
		ponto2.getHorarios().addElement("17:25");
		ponto2.getHorarios().addElement("17:45");
		ponto2.getHorarios().addElement("18:05");
		ponto2.getHorarios().addElement("18:25");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:05");
		ponto2.getHorarios().addElement("19:25");
		ponto2.getHorarios().addElement("19:47");
		ponto2.getHorarios().addElement("20:12");
		ponto2.getHorarios().addElement("20:37");
		ponto2.getHorarios().addElement("21:02");
		ponto2.getHorarios().addElement("21:27");
		ponto2.getHorarios().addElement("21:52");
		ponto2.getHorarios().addElement("22:17");
		ponto2.getHorarios().addElement("22:42");
		ponto2.getHorarios().addElement("23:07");
		ponto2.getHorarios().addElement("23:32");
		ponto2.getHorarios().addElement("23:57");
		return onibus;
		}
	}
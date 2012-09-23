
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus313 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("313 - AVENIDA IRAÍ / C. IMBUIA");
		onibus.setCodigo("313");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("AVENIDA IRAI");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:16");
		ponto0.getHorarios().addElement("06:32");
		ponto0.getHorarios().addElement("06:48");
		ponto0.getHorarios().addElement("07:04");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:52");
		ponto0.getHorarios().addElement("08:08");
		ponto0.getHorarios().addElement("08:28");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:10");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("09:50");
		ponto0.getHorarios().addElement("10:10");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("11:10");
		ponto0.getHorarios().addElement("11:30");
		ponto0.getHorarios().addElement("11:50");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("12:30");
		ponto0.getHorarios().addElement("12:50");
		ponto0.getHorarios().addElement("13:10");
		ponto0.getHorarios().addElement("13:30");
		ponto0.getHorarios().addElement("13:50");
		ponto0.getHorarios().addElement("14:10");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("14:50");
		ponto0.getHorarios().addElement("15:10");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("15:50");
		ponto0.getHorarios().addElement("16:08");
		ponto0.getHorarios().addElement("16:28");
		ponto0.getHorarios().addElement("16:48");
		ponto0.getHorarios().addElement("17:08");
		ponto0.getHorarios().addElement("17:28");
		ponto0.getHorarios().addElement("17:48");
		ponto0.getHorarios().addElement("18:08");
		ponto0.getHorarios().addElement("18:28");
		ponto0.getHorarios().addElement("18:48");
		ponto0.getHorarios().addElement("19:08");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("20:30");
		ponto0.getHorarios().addElement("21:10");
		ponto0.getHorarios().addElement("21:50");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:20");
		ponto0.getHorarios().addElement("23:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:17");
		ponto1.getHorarios().addElement("06:34");
		ponto1.getHorarios().addElement("06:48");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:22");
		ponto1.getHorarios().addElement("07:39");
		ponto1.getHorarios().addElement("07:54");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("08:49");
		ponto1.getHorarios().addElement("09:10");
		ponto1.getHorarios().addElement("09:28");
		ponto1.getHorarios().addElement("09:48");
		ponto1.getHorarios().addElement("10:10");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("11:10");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("11:55");
		ponto1.getHorarios().addElement("12:10");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("12:50");
		ponto1.getHorarios().addElement("13:10");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("14:10");
		ponto1.getHorarios().addElement("14:25");
		ponto1.getHorarios().addElement("14:50");
		ponto1.getHorarios().addElement("15:10");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("15:50");
		ponto1.getHorarios().addElement("16:10");
		ponto1.getHorarios().addElement("16:24");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:06");
		ponto1.getHorarios().addElement("17:29");
		ponto1.getHorarios().addElement("17:48");
		ponto1.getHorarios().addElement("18:07");
		ponto1.getHorarios().addElement("18:27");
		ponto1.getHorarios().addElement("18:48");
		ponto1.getHorarios().addElement("19:09");
		ponto1.getHorarios().addElement("19:27");
		ponto1.getHorarios().addElement("20:10");
		ponto1.getHorarios().addElement("20:50");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("22:10");
		ponto1.getHorarios().addElement("23:05");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("AVENIDA IRAI");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("13/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:16");
		ponto2.getHorarios().addElement("06:32");
		ponto2.getHorarios().addElement("06:48");
		ponto2.getHorarios().addElement("07:04");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("07:36");
		ponto2.getHorarios().addElement("07:52");
		ponto2.getHorarios().addElement("08:08");
		ponto2.getHorarios().addElement("08:28");
		ponto2.getHorarios().addElement("08:48");
		ponto2.getHorarios().addElement("09:08");
		ponto2.getHorarios().addElement("09:28");
		ponto2.getHorarios().addElement("09:48");
		ponto2.getHorarios().addElement("10:08");
		ponto2.getHorarios().addElement("10:28");
		ponto2.getHorarios().addElement("10:48");
		ponto2.getHorarios().addElement("11:08");
		ponto2.getHorarios().addElement("11:28");
		ponto2.getHorarios().addElement("11:48");
		ponto2.getHorarios().addElement("12:08");
		ponto2.getHorarios().addElement("12:28");
		ponto2.getHorarios().addElement("12:48");
		ponto2.getHorarios().addElement("13:08");
		ponto2.getHorarios().addElement("13:48");
		ponto2.getHorarios().addElement("14:28");
		ponto2.getHorarios().addElement("15:08");
		ponto2.getHorarios().addElement("15:48");
		ponto2.getHorarios().addElement("16:28");
		ponto2.getHorarios().addElement("17:08");
		ponto2.getHorarios().addElement("17:48");
		ponto2.getHorarios().addElement("18:28");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("13/11/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:18");
		ponto3.getHorarios().addElement("06:34");
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("07:06");
		ponto3.getHorarios().addElement("07:22");
		ponto3.getHorarios().addElement("07:38");
		ponto3.getHorarios().addElement("07:54");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("08:28");
		ponto3.getHorarios().addElement("08:48");
		ponto3.getHorarios().addElement("09:08");
		ponto3.getHorarios().addElement("09:28");
		ponto3.getHorarios().addElement("09:48");
		ponto3.getHorarios().addElement("10:08");
		ponto3.getHorarios().addElement("10:28");
		ponto3.getHorarios().addElement("10:48");
		ponto3.getHorarios().addElement("11:08");
		ponto3.getHorarios().addElement("11:28");
		ponto3.getHorarios().addElement("11:48");
		ponto3.getHorarios().addElement("12:08");
		ponto3.getHorarios().addElement("12:28");
		ponto3.getHorarios().addElement("12:48");
		ponto3.getHorarios().addElement("13:08");
		ponto3.getHorarios().addElement("13:28");
		ponto3.getHorarios().addElement("14:08");
		ponto3.getHorarios().addElement("14:48");
		ponto3.getHorarios().addElement("15:28");
		ponto3.getHorarios().addElement("16:08");
		ponto3.getHorarios().addElement("16:48");
		ponto3.getHorarios().addElement("17:28");
		ponto3.getHorarios().addElement("18:08");
		ponto3.getHorarios().addElement("18:48");
		return onibus;
		}
	}
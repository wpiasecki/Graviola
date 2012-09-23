
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus168 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("168 - RAPOSO TAVARES");
		onibus.setCodigo("168");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO RAPOSO TAVARES");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("25/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:35");
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("06:16");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("07:08");
		ponto0.getHorarios().addElement("07:34");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:26");
		ponto0.getHorarios().addElement("09:05");
		ponto0.getHorarios().addElement("09:44");
		ponto0.getHorarios().addElement("10:23");
		ponto0.getHorarios().addElement("11:02");
		ponto0.getHorarios().addElement("11:41");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:59");
		ponto0.getHorarios().addElement("13:38");
		ponto0.getHorarios().addElement("14:17");
		ponto0.getHorarios().addElement("14:56");
		ponto0.getHorarios().addElement("15:35");
		ponto0.getHorarios().addElement("16:14");
		ponto0.getHorarios().addElement("17:05");
		ponto0.getHorarios().addElement("17:33");
		ponto0.getHorarios().addElement("17:59");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("19:04");
		ponto0.getHorarios().addElement("19:43");
		ponto0.getHorarios().addElement("20:22");
		ponto0.getHorarios().addElement("21:01");
		ponto0.getHorarios().addElement("21:40");
		ponto0.getHorarios().addElement("22:20");
		ponto0.getHorarios().addElement("23:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("RUA NESTOR DE CASTRO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("25/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:22");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("08:22");
		ponto1.getHorarios().addElement("09:05");
		ponto1.getHorarios().addElement("09:44");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:38");
		ponto1.getHorarios().addElement("12:17");
		ponto1.getHorarios().addElement("12:56");
		ponto1.getHorarios().addElement("13:35");
		ponto1.getHorarios().addElement("14:15");
		ponto1.getHorarios().addElement("14:53");
		ponto1.getHorarios().addElement("15:32");
		ponto1.getHorarios().addElement("16:11");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:44");
		ponto1.getHorarios().addElement("18:12");
		ponto1.getHorarios().addElement("18:38");
		ponto1.getHorarios().addElement("19:02");
		ponto1.getHorarios().addElement("19:41");
		ponto1.getHorarios().addElement("20:22");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("21:40");
		ponto1.getHorarios().addElement("22:20");
		ponto1.getHorarios().addElement("23:05");
		ponto1.getHorarios().addElement("00:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO RAPOSO TAVARES");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("08/08/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:55");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:40");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:40");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:40");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:40");
		ponto2.getHorarios().addElement("14:20");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:40");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:40");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("19:40");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("22:20");
		ponto2.getHorarios().addElement("23:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("RUA NESTOR DE CASTRO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("08/08/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:55");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("07:05");
		ponto3.getHorarios().addElement("07:40");
		ponto3.getHorarios().addElement("08:20");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("09:40");
		ponto3.getHorarios().addElement("10:20");
		ponto3.getHorarios().addElement("11:00");
		ponto3.getHorarios().addElement("11:40");
		ponto3.getHorarios().addElement("12:20");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("13:40");
		ponto3.getHorarios().addElement("14:20");
		ponto3.getHorarios().addElement("15:00");
		ponto3.getHorarios().addElement("15:40");
		ponto3.getHorarios().addElement("16:20");
		ponto3.getHorarios().addElement("17:00");
		ponto3.getHorarios().addElement("17:40");
		ponto3.getHorarios().addElement("18:20");
		ponto3.getHorarios().addElement("19:00");
		ponto3.getHorarios().addElement("20:20");
		ponto3.getHorarios().addElement("21:40");
		ponto3.getHorarios().addElement("23:00");
		ponto3.getHorarios().addElement("00:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO RAPOSO TAVARES");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("30/11/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("07:50");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("09:10");
		ponto4.getHorarios().addElement("09:50");
		ponto4.getHorarios().addElement("10:30");
		ponto4.getHorarios().addElement("11:10");
		ponto4.getHorarios().addElement("11:50");
		ponto4.getHorarios().addElement("12:30");
		ponto4.getHorarios().addElement("13:10");
		ponto4.getHorarios().addElement("13:50");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("15:10");
		ponto4.getHorarios().addElement("15:50");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("17:10");
		ponto4.getHorarios().addElement("17:50");
		ponto4.getHorarios().addElement("19:10");
		ponto4.getHorarios().addElement("20:30");
		ponto4.getHorarios().addElement("21:50");
		ponto4.getHorarios().addElement("23:10");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("RUA NESTOR DE CASTRO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("30/11/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:50");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("07:50");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:10");
		ponto5.getHorarios().addElement("09:50");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("11:10");
		ponto5.getHorarios().addElement("11:50");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("13:10");
		ponto5.getHorarios().addElement("13:50");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:10");
		ponto5.getHorarios().addElement("15:50");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:10");
		ponto5.getHorarios().addElement("18:30");
		ponto5.getHorarios().addElement("19:50");
		ponto5.getHorarios().addElement("21:10");
		ponto5.getHorarios().addElement("22:30");
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}
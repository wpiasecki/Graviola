
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus386 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("386 - CAJURU");
		onibus.setCodigo("386");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO CAJURU");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:37");
		ponto0.getHorarios().addElement("06:54");
		ponto0.getHorarios().addElement("07:11");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("08:02");
		ponto0.getHorarios().addElement("08:22");
		ponto0.getHorarios().addElement("08:42");
		ponto0.getHorarios().addElement("09:06");
		ponto0.getHorarios().addElement("09:32");
		ponto0.getHorarios().addElement("09:58");
		ponto0.getHorarios().addElement("10:24");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("11:16");
		ponto0.getHorarios().addElement("11:42");
		ponto0.getHorarios().addElement("12:07");
		ponto0.getHorarios().addElement("12:32");
		ponto0.getHorarios().addElement("12:56");
		ponto0.getHorarios().addElement("13:20");
		ponto0.getHorarios().addElement("13:46");
		ponto0.getHorarios().addElement("14:12");
		ponto0.getHorarios().addElement("14:38");
		ponto0.getHorarios().addElement("15:04");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("15:57");
		ponto0.getHorarios().addElement("16:24");
		ponto0.getHorarios().addElement("16:51");
		ponto0.getHorarios().addElement("17:16");
		ponto0.getHorarios().addElement("17:41");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("20:30");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:00");
		ponto0.getHorarios().addElement("23:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA CARLOS GOMES");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:15");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:13");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("08:06");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("08:55");
		ponto1.getHorarios().addElement("09:20");
		ponto1.getHorarios().addElement("09:46");
		ponto1.getHorarios().addElement("10:12");
		ponto1.getHorarios().addElement("10:38");
		ponto1.getHorarios().addElement("11:04");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("11:54");
		ponto1.getHorarios().addElement("12:18");
		ponto1.getHorarios().addElement("12:43");
		ponto1.getHorarios().addElement("13:08");
		ponto1.getHorarios().addElement("13:34");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:26");
		ponto1.getHorarios().addElement("14:52");
		ponto1.getHorarios().addElement("15:18");
		ponto1.getHorarios().addElement("15:44");
		ponto1.getHorarios().addElement("16:10");
		ponto1.getHorarios().addElement("16:36");
		ponto1.getHorarios().addElement("16:58");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:42");
		ponto1.getHorarios().addElement("18:04");
		ponto1.getHorarios().addElement("18:26");
		ponto1.getHorarios().addElement("18:48");
		ponto1.getHorarios().addElement("19:10");
		ponto1.getHorarios().addElement("19:35");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("20:30");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("22:30");
		ponto1.getHorarios().addElement("23:00");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO CAJURU");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("27/08/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("08:55");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("10:05");
		ponto2.getHorarios().addElement("10:40");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("12:25");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:35");
		ponto2.getHorarios().addElement("14:10");
		ponto2.getHorarios().addElement("14:45");
		ponto2.getHorarios().addElement("15:20");
		ponto2.getHorarios().addElement("15:55");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:05");
		ponto2.getHorarios().addElement("17:40");
		ponto2.getHorarios().addElement("18:15");
		ponto2.getHorarios().addElement("19:30");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA CARLOS GOMES");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("27/08/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:35");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:45");
		ponto3.getHorarios().addElement("08:20");
		ponto3.getHorarios().addElement("08:55");
		ponto3.getHorarios().addElement("09:30");
		ponto3.getHorarios().addElement("10:05");
		ponto3.getHorarios().addElement("10:40");
		ponto3.getHorarios().addElement("11:15");
		ponto3.getHorarios().addElement("11:50");
		ponto3.getHorarios().addElement("12:25");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("13:35");
		ponto3.getHorarios().addElement("14:10");
		ponto3.getHorarios().addElement("14:45");
		ponto3.getHorarios().addElement("15:20");
		ponto3.getHorarios().addElement("15:55");
		ponto3.getHorarios().addElement("16:30");
		ponto3.getHorarios().addElement("17:05");
		ponto3.getHorarios().addElement("17:40");
		ponto3.getHorarios().addElement("18:15");
		ponto3.getHorarios().addElement("18:55");
		ponto3.getHorarios().addElement("20:00");
		ponto3.getHorarios().addElement("21:00");
		ponto3.getHorarios().addElement("22:00");
		ponto3.getHorarios().addElement("23:00");
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO CAJURU");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("28/08/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:35");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("07:45");
		ponto4.getHorarios().addElement("08:20");
		ponto4.getHorarios().addElement("08:55");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("10:05");
		ponto4.getHorarios().addElement("10:40");
		ponto4.getHorarios().addElement("11:15");
		ponto4.getHorarios().addElement("11:50");
		ponto4.getHorarios().addElement("12:25");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("13:35");
		ponto4.getHorarios().addElement("14:10");
		ponto4.getHorarios().addElement("14:45");
		ponto4.getHorarios().addElement("15:20");
		ponto4.getHorarios().addElement("15:55");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("17:05");
		ponto4.getHorarios().addElement("17:40");
		ponto4.getHorarios().addElement("18:15");
		ponto4.getHorarios().addElement("19:30");
		ponto4.getHorarios().addElement("20:30");
		ponto4.getHorarios().addElement("21:30");
		ponto4.getHorarios().addElement("22:30");
		ponto4.getHorarios().addElement("23:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA CARLOS GOMES");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("28/08/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:35");
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("07:45");
		ponto5.getHorarios().addElement("08:20");
		ponto5.getHorarios().addElement("08:55");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:05");
		ponto5.getHorarios().addElement("10:40");
		ponto5.getHorarios().addElement("11:15");
		ponto5.getHorarios().addElement("11:50");
		ponto5.getHorarios().addElement("12:25");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("13:35");
		ponto5.getHorarios().addElement("14:10");
		ponto5.getHorarios().addElement("14:45");
		ponto5.getHorarios().addElement("15:20");
		ponto5.getHorarios().addElement("15:55");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:05");
		ponto5.getHorarios().addElement("17:40");
		ponto5.getHorarios().addElement("18:15");
		ponto5.getHorarios().addElement("18:55");
		ponto5.getHorarios().addElement("20:00");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("22:00");
		ponto5.getHorarios().addElement("23:00");
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}
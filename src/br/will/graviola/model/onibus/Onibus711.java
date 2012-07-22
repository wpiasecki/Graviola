
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus711 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("ITATIAIA");
		onibus.setCodigo("711");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO ITATIAIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:15");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:08");
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:23");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:38");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("06:53");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:08");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:23");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("07:38");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("07:53");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:08");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("08:30");
		ponto0.getHorarios().addElement("08:45");
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("09:15");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:00");
		ponto0.getHorarios().addElement("10:15");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("10:45");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:15");
		ponto0.getHorarios().addElement("11:30");
		ponto0.getHorarios().addElement("11:45");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("12:16");
		ponto0.getHorarios().addElement("12:31");
		ponto0.getHorarios().addElement("12:43");
		ponto0.getHorarios().addElement("12:55");
		ponto0.getHorarios().addElement("13:07");
		ponto0.getHorarios().addElement("13:19");
		ponto0.getHorarios().addElement("13:31");
		ponto0.getHorarios().addElement("13:43");
		ponto0.getHorarios().addElement("13:55");
		ponto0.getHorarios().addElement("14:10");
		ponto0.getHorarios().addElement("14:26");
		ponto0.getHorarios().addElement("14:41");
		ponto0.getHorarios().addElement("14:56");
		ponto0.getHorarios().addElement("15:11");
		ponto0.getHorarios().addElement("15:26");
		ponto0.getHorarios().addElement("15:41");
		ponto0.getHorarios().addElement("15:56");
		ponto0.getHorarios().addElement("16:11");
		ponto0.getHorarios().addElement("16:26");
		ponto0.getHorarios().addElement("16:40");
		ponto0.getHorarios().addElement("16:54");
		ponto0.getHorarios().addElement("17:08");
		ponto0.getHorarios().addElement("17:17");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("17:44");
		ponto0.getHorarios().addElement("17:53");
		ponto0.getHorarios().addElement("18:02");
		ponto0.getHorarios().addElement("18:11");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:29");
		ponto0.getHorarios().addElement("18:38");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("18:56");
		ponto0.getHorarios().addElement("19:05");
		ponto0.getHorarios().addElement("19:14");
		ponto0.getHorarios().addElement("19:24");
		ponto0.getHorarios().addElement("19:34");
		ponto0.getHorarios().addElement("19:44");
		ponto0.getHorarios().addElement("20:01");
		ponto0.getHorarios().addElement("20:18");
		ponto0.getHorarios().addElement("20:35");
		ponto0.getHorarios().addElement("20:52");
		ponto0.getHorarios().addElement("21:07");
		ponto0.getHorarios().addElement("21:22");
		ponto0.getHorarios().addElement("21:37");
		ponto0.getHorarios().addElement("21:52");
		ponto0.getHorarios().addElement("22:07");
		ponto0.getHorarios().addElement("22:22");
		ponto0.getHorarios().addElement("22:37");
		ponto0.getHorarios().addElement("22:52");
		ponto0.getHorarios().addElement("23:07");
		ponto0.getHorarios().addElement("23:22");
		ponto0.getHorarios().addElement("23:38");
		ponto0.getHorarios().addElement("00:08");
		ponto0.getHorarios().addElement("00:33");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL FAZENDINHA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:31");
		ponto1.getHorarios().addElement("05:46");
		ponto1.getHorarios().addElement("06:01");
		ponto1.getHorarios().addElement("06:16");
		ponto1.getHorarios().addElement("06:24");
		ponto1.getHorarios().addElement("06:31");
		ponto1.getHorarios().addElement("06:39");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("06:54");
		ponto1.getHorarios().addElement("07:01");
		ponto1.getHorarios().addElement("07:09");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:24");
		ponto1.getHorarios().addElement("07:31");
		ponto1.getHorarios().addElement("07:39");
		ponto1.getHorarios().addElement("07:46");
		ponto1.getHorarios().addElement("07:54");
		ponto1.getHorarios().addElement("08:01");
		ponto1.getHorarios().addElement("08:16");
		ponto1.getHorarios().addElement("08:31");
		ponto1.getHorarios().addElement("08:46");
		ponto1.getHorarios().addElement("09:01");
		ponto1.getHorarios().addElement("09:16");
		ponto1.getHorarios().addElement("09:31");
		ponto1.getHorarios().addElement("09:46");
		ponto1.getHorarios().addElement("10:01");
		ponto1.getHorarios().addElement("10:16");
		ponto1.getHorarios().addElement("10:31");
		ponto1.getHorarios().addElement("10:46");
		ponto1.getHorarios().addElement("11:01");
		ponto1.getHorarios().addElement("11:16");
		ponto1.getHorarios().addElement("11:31");
		ponto1.getHorarios().addElement("11:46");
		ponto1.getHorarios().addElement("12:01");
		ponto1.getHorarios().addElement("12:13");
		ponto1.getHorarios().addElement("12:25");
		ponto1.getHorarios().addElement("12:37");
		ponto1.getHorarios().addElement("12:49");
		ponto1.getHorarios().addElement("13:01");
		ponto1.getHorarios().addElement("13:13");
		ponto1.getHorarios().addElement("13:27");
		ponto1.getHorarios().addElement("13:41");
		ponto1.getHorarios().addElement("13:56");
		ponto1.getHorarios().addElement("14:11");
		ponto1.getHorarios().addElement("14:26");
		ponto1.getHorarios().addElement("14:41");
		ponto1.getHorarios().addElement("14:56");
		ponto1.getHorarios().addElement("15:11");
		ponto1.getHorarios().addElement("15:26");
		ponto1.getHorarios().addElement("15:41");
		ponto1.getHorarios().addElement("15:56");
		ponto1.getHorarios().addElement("16:11");
		ponto1.getHorarios().addElement("16:26");
		ponto1.getHorarios().addElement("16:41");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("16:59");
		ponto1.getHorarios().addElement("17:08");
		ponto1.getHorarios().addElement("17:17");
		ponto1.getHorarios().addElement("17:26");
		ponto1.getHorarios().addElement("17:35");
		ponto1.getHorarios().addElement("17:44");
		ponto1.getHorarios().addElement("17:53");
		ponto1.getHorarios().addElement("18:02");
		ponto1.getHorarios().addElement("18:11");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:29");
		ponto1.getHorarios().addElement("18:38");
		ponto1.getHorarios().addElement("18:47");
		ponto1.getHorarios().addElement("18:56");
		ponto1.getHorarios().addElement("19:05");
		ponto1.getHorarios().addElement("19:14");
		ponto1.getHorarios().addElement("19:23");
		ponto1.getHorarios().addElement("19:32");
		ponto1.getHorarios().addElement("19:41");
		ponto1.getHorarios().addElement("19:50");
		ponto1.getHorarios().addElement("20:01");
		ponto1.getHorarios().addElement("20:18");
		ponto1.getHorarios().addElement("20:35");
		ponto1.getHorarios().addElement("20:52");
		ponto1.getHorarios().addElement("21:07");
		ponto1.getHorarios().addElement("21:22");
		ponto1.getHorarios().addElement("21:37");
		ponto1.getHorarios().addElement("21:52");
		ponto1.getHorarios().addElement("22:07");
		ponto1.getHorarios().addElement("22:22");
		ponto1.getHorarios().addElement("22:37");
		ponto1.getHorarios().addElement("22:52");
		ponto1.getHorarios().addElement("23:07");
		ponto1.getHorarios().addElement("23:22");
		ponto1.getHorarios().addElement("23:37");
		ponto1.getHorarios().addElement("23:55");
		ponto1.getHorarios().addElement("00:22");
		ponto1.getHorarios().addElement("00:44");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO ITATIAIA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("27/12/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:35");
		ponto2.getHorarios().addElement("05:50");
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("06:20");
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("06:50");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("07:35");
		ponto2.getHorarios().addElement("07:50");
		ponto2.getHorarios().addElement("08:05");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("08:35");
		ponto2.getHorarios().addElement("08:50");
		ponto2.getHorarios().addElement("09:05");
		ponto2.getHorarios().addElement("09:20");
		ponto2.getHorarios().addElement("09:35");
		ponto2.getHorarios().addElement("09:50");
		ponto2.getHorarios().addElement("10:05");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("10:35");
		ponto2.getHorarios().addElement("10:50");
		ponto2.getHorarios().addElement("11:05");
		ponto2.getHorarios().addElement("11:20");
		ponto2.getHorarios().addElement("11:35");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("12:05");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("12:35");
		ponto2.getHorarios().addElement("12:50");
		ponto2.getHorarios().addElement("13:05");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("13:35");
		ponto2.getHorarios().addElement("13:50");
		ponto2.getHorarios().addElement("14:05");
		ponto2.getHorarios().addElement("14:20");
		ponto2.getHorarios().addElement("14:35");
		ponto2.getHorarios().addElement("14:50");
		ponto2.getHorarios().addElement("15:05");
		ponto2.getHorarios().addElement("15:20");
		ponto2.getHorarios().addElement("15:35");
		ponto2.getHorarios().addElement("15:50");
		ponto2.getHorarios().addElement("16:05");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("16:35");
		ponto2.getHorarios().addElement("16:50");
		ponto2.getHorarios().addElement("17:05");
		ponto2.getHorarios().addElement("17:20");
		ponto2.getHorarios().addElement("17:35");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:05");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("18:35");
		ponto2.getHorarios().addElement("18:50");
		ponto2.getHorarios().addElement("19:05");
		ponto2.getHorarios().addElement("19:20");
		ponto2.getHorarios().addElement("19:49");
		ponto2.getHorarios().addElement("20:17");
		ponto2.getHorarios().addElement("20:45");
		ponto2.getHorarios().addElement("21:13");
		ponto2.getHorarios().addElement("21:41");
		ponto2.getHorarios().addElement("22:09");
		ponto2.getHorarios().addElement("22:37");
		ponto2.getHorarios().addElement("23:05");
		ponto2.getHorarios().addElement("23:34");
		ponto2.getHorarios().addElement("00:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL FAZENDINHA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("27/12/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:51");
		ponto3.getHorarios().addElement("06:06");
		ponto3.getHorarios().addElement("06:21");
		ponto3.getHorarios().addElement("06:36");
		ponto3.getHorarios().addElement("06:51");
		ponto3.getHorarios().addElement("07:06");
		ponto3.getHorarios().addElement("07:21");
		ponto3.getHorarios().addElement("07:36");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("08:06");
		ponto3.getHorarios().addElement("08:21");
		ponto3.getHorarios().addElement("08:36");
		ponto3.getHorarios().addElement("08:50");
		ponto3.getHorarios().addElement("09:05");
		ponto3.getHorarios().addElement("09:20");
		ponto3.getHorarios().addElement("09:35");
		ponto3.getHorarios().addElement("09:50");
		ponto3.getHorarios().addElement("10:05");
		ponto3.getHorarios().addElement("10:20");
		ponto3.getHorarios().addElement("10:35");
		ponto3.getHorarios().addElement("10:50");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("11:20");
		ponto3.getHorarios().addElement("11:35");
		ponto3.getHorarios().addElement("11:50");
		ponto3.getHorarios().addElement("12:05");
		ponto3.getHorarios().addElement("12:20");
		ponto3.getHorarios().addElement("12:35");
		ponto3.getHorarios().addElement("12:50");
		ponto3.getHorarios().addElement("13:05");
		ponto3.getHorarios().addElement("13:20");
		ponto3.getHorarios().addElement("13:35");
		ponto3.getHorarios().addElement("13:50");
		ponto3.getHorarios().addElement("14:05");
		ponto3.getHorarios().addElement("14:20");
		ponto3.getHorarios().addElement("14:35");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("15:05");
		ponto3.getHorarios().addElement("15:20");
		ponto3.getHorarios().addElement("15:35");
		ponto3.getHorarios().addElement("15:50");
		ponto3.getHorarios().addElement("16:05");
		ponto3.getHorarios().addElement("16:20");
		ponto3.getHorarios().addElement("16:35");
		ponto3.getHorarios().addElement("16:50");
		ponto3.getHorarios().addElement("17:05");
		ponto3.getHorarios().addElement("17:20");
		ponto3.getHorarios().addElement("17:35");
		ponto3.getHorarios().addElement("17:50");
		ponto3.getHorarios().addElement("18:05");
		ponto3.getHorarios().addElement("18:20");
		ponto3.getHorarios().addElement("18:35");
		ponto3.getHorarios().addElement("18:50");
		ponto3.getHorarios().addElement("19:05");
		ponto3.getHorarios().addElement("19:20");
		ponto3.getHorarios().addElement("19:35");
		ponto3.getHorarios().addElement("20:03");
		ponto3.getHorarios().addElement("20:31");
		ponto3.getHorarios().addElement("20:59");
		ponto3.getHorarios().addElement("21:27");
		ponto3.getHorarios().addElement("21:55");
		ponto3.getHorarios().addElement("22:23");
		ponto3.getHorarios().addElement("22:51");
		ponto3.getHorarios().addElement("23:19");
		ponto3.getHorarios().addElement("23:47");
		ponto3.getHorarios().addElement("00:13");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO ITATIAIA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("25/05/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:21");
		ponto4.getHorarios().addElement("05:51");
		ponto4.getHorarios().addElement("06:21");
		ponto4.getHorarios().addElement("06:51");
		ponto4.getHorarios().addElement("07:21");
		ponto4.getHorarios().addElement("07:51");
		ponto4.getHorarios().addElement("08:21");
		ponto4.getHorarios().addElement("08:51");
		ponto4.getHorarios().addElement("09:21");
		ponto4.getHorarios().addElement("09:51");
		ponto4.getHorarios().addElement("10:21");
		ponto4.getHorarios().addElement("10:51");
		ponto4.getHorarios().addElement("11:21");
		ponto4.getHorarios().addElement("11:51");
		ponto4.getHorarios().addElement("12:21");
		ponto4.getHorarios().addElement("12:51");
		ponto4.getHorarios().addElement("13:21");
		ponto4.getHorarios().addElement("13:51");
		ponto4.getHorarios().addElement("14:21");
		ponto4.getHorarios().addElement("14:51");
		ponto4.getHorarios().addElement("15:21");
		ponto4.getHorarios().addElement("15:51");
		ponto4.getHorarios().addElement("16:21");
		ponto4.getHorarios().addElement("16:51");
		ponto4.getHorarios().addElement("17:21");
		ponto4.getHorarios().addElement("17:51");
		ponto4.getHorarios().addElement("18:21");
		ponto4.getHorarios().addElement("18:51");
		ponto4.getHorarios().addElement("19:21");
		ponto4.getHorarios().addElement("19:51");
		ponto4.getHorarios().addElement("20:21");
		ponto4.getHorarios().addElement("20:51");
		ponto4.getHorarios().addElement("21:21");
		ponto4.getHorarios().addElement("21:51");
		ponto4.getHorarios().addElement("22:21");
		ponto4.getHorarios().addElement("22:51");
		ponto4.getHorarios().addElement("23:21");
		ponto4.getHorarios().addElement("23:53");
		ponto4.getHorarios().addElement("00:24");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL FAZENDINHA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("25/05/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:36");
		ponto5.getHorarios().addElement("06:06");
		ponto5.getHorarios().addElement("06:36");
		ponto5.getHorarios().addElement("07:06");
		ponto5.getHorarios().addElement("07:36");
		ponto5.getHorarios().addElement("08:06");
		ponto5.getHorarios().addElement("08:36");
		ponto5.getHorarios().addElement("09:06");
		ponto5.getHorarios().addElement("09:36");
		ponto5.getHorarios().addElement("10:06");
		ponto5.getHorarios().addElement("10:36");
		ponto5.getHorarios().addElement("11:06");
		ponto5.getHorarios().addElement("11:36");
		ponto5.getHorarios().addElement("12:06");
		ponto5.getHorarios().addElement("12:36");
		ponto5.getHorarios().addElement("13:06");
		ponto5.getHorarios().addElement("13:36");
		ponto5.getHorarios().addElement("14:06");
		ponto5.getHorarios().addElement("14:36");
		ponto5.getHorarios().addElement("15:06");
		ponto5.getHorarios().addElement("15:36");
		ponto5.getHorarios().addElement("16:06");
		ponto5.getHorarios().addElement("16:36");
		ponto5.getHorarios().addElement("17:06");
		ponto5.getHorarios().addElement("17:36");
		ponto5.getHorarios().addElement("18:06");
		ponto5.getHorarios().addElement("18:36");
		ponto5.getHorarios().addElement("19:06");
		ponto5.getHorarios().addElement("19:36");
		ponto5.getHorarios().addElement("20:06");
		ponto5.getHorarios().addElement("20:36");
		ponto5.getHorarios().addElement("21:06");
		ponto5.getHorarios().addElement("21:36");
		ponto5.getHorarios().addElement("22:06");
		ponto5.getHorarios().addElement("22:36");
		ponto5.getHorarios().addElement("23:06");
		ponto5.getHorarios().addElement("23:36");
		ponto5.getHorarios().addElement("00:07");
		ponto5.getHorarios().addElement("00:38");
		return onibus;
		}
	}
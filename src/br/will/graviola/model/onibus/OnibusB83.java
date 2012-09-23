
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB83 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B83 - CTBA / STA. TEREZA");
		onibus.setCodigo("B83");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("SANTA TEREZA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/01/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("05:55");
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:25");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:18");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:54");
		ponto0.getHorarios().addElement("08:13");
		ponto0.getHorarios().addElement("08:36");
		ponto0.getHorarios().addElement("09:08");
		ponto0.getHorarios().addElement("09:40");
		ponto0.getHorarios().addElement("10:12");
		ponto0.getHorarios().addElement("10:44");
		ponto0.getHorarios().addElement("11:16");
		ponto0.getHorarios().addElement("11:48");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:52");
		ponto0.getHorarios().addElement("13:24");
		ponto0.getHorarios().addElement("13:56");
		ponto0.getHorarios().addElement("14:28");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("15:32");
		ponto0.getHorarios().addElement("15:51");
		ponto0.getHorarios().addElement("16:10");
		ponto0.getHorarios().addElement("16:29");
		ponto0.getHorarios().addElement("16:48");
		ponto0.getHorarios().addElement("17:08");
		ponto0.getHorarios().addElement("17:27");
		ponto0.getHorarios().addElement("17:46");
		ponto0.getHorarios().addElement("18:05");
		ponto0.getHorarios().addElement("18:24");
		ponto0.getHorarios().addElement("18:44");
		ponto0.getHorarios().addElement("19:03");
		ponto0.getHorarios().addElement("19:22");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("20:40");
		ponto0.getHorarios().addElement("21:20");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:40");
		ponto0.getHorarios().addElement("23:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/01/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("08:06");
		ponto1.getHorarios().addElement("08:24");
		ponto1.getHorarios().addElement("08:42");
		ponto1.getHorarios().addElement("09:01");
		ponto1.getHorarios().addElement("09:24");
		ponto1.getHorarios().addElement("09:56");
		ponto1.getHorarios().addElement("10:28");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:32");
		ponto1.getHorarios().addElement("12:04");
		ponto1.getHorarios().addElement("12:36");
		ponto1.getHorarios().addElement("13:08");
		ponto1.getHorarios().addElement("13:40");
		ponto1.getHorarios().addElement("14:12");
		ponto1.getHorarios().addElement("14:44");
		ponto1.getHorarios().addElement("15:16");
		ponto1.getHorarios().addElement("15:48");
		ponto1.getHorarios().addElement("16:20");
		ponto1.getHorarios().addElement("16:39");
		ponto1.getHorarios().addElement("16:58");
		ponto1.getHorarios().addElement("17:17");
		ponto1.getHorarios().addElement("17:36");
		ponto1.getHorarios().addElement("17:56");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:34");
		ponto1.getHorarios().addElement("18:53");
		ponto1.getHorarios().addElement("19:12");
		ponto1.getHorarios().addElement("19:32");
		ponto1.getHorarios().addElement("19:51");
		ponto1.getHorarios().addElement("20:10");
		ponto1.getHorarios().addElement("20:40");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("22:40");
		ponto1.getHorarios().addElement("23:20");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("SANTA TEREZA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("03/12/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:38");
		ponto2.getHorarios().addElement("06:02");
		ponto2.getHorarios().addElement("06:28");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:26");
		ponto2.getHorarios().addElement("07:52");
		ponto2.getHorarios().addElement("08:21");
		ponto2.getHorarios().addElement("08:50");
		ponto2.getHorarios().addElement("09:16");
		ponto2.getHorarios().addElement("09:58");
		ponto2.getHorarios().addElement("10:40");
		ponto2.getHorarios().addElement("11:22");
		ponto2.getHorarios().addElement("12:07");
		ponto2.getHorarios().addElement("12:52");
		ponto2.getHorarios().addElement("13:37");
		ponto2.getHorarios().addElement("14:22");
		ponto2.getHorarios().addElement("15:07");
		ponto2.getHorarios().addElement("15:52");
		ponto2.getHorarios().addElement("16:37");
		ponto2.getHorarios().addElement("17:22");
		ponto2.getHorarios().addElement("18:07");
		ponto2.getHorarios().addElement("18:52");
		ponto2.getHorarios().addElement("19:37");
		ponto2.getHorarios().addElement("20:22");
		ponto2.getHorarios().addElement("21:15");
		ponto2.getHorarios().addElement("22:05");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("03/12/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:20");
		ponto3.getHorarios().addElement("06:44");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:39");
		ponto3.getHorarios().addElement("08:08");
		ponto3.getHorarios().addElement("08:34");
		ponto3.getHorarios().addElement("09:03");
		ponto3.getHorarios().addElement("09:32");
		ponto3.getHorarios().addElement("09:58");
		ponto3.getHorarios().addElement("10:40");
		ponto3.getHorarios().addElement("11:22");
		ponto3.getHorarios().addElement("12:07");
		ponto3.getHorarios().addElement("12:52");
		ponto3.getHorarios().addElement("13:37");
		ponto3.getHorarios().addElement("14:22");
		ponto3.getHorarios().addElement("15:07");
		ponto3.getHorarios().addElement("15:52");
		ponto3.getHorarios().addElement("16:37");
		ponto3.getHorarios().addElement("17:22");
		ponto3.getHorarios().addElement("18:07");
		ponto3.getHorarios().addElement("18:52");
		ponto3.getHorarios().addElement("19:37");
		ponto3.getHorarios().addElement("20:22");
		ponto3.getHorarios().addElement("21:15");
		ponto3.getHorarios().addElement("22:05");
		ponto3.getHorarios().addElement("23:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("SANTA TEREZA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:35");
		ponto4.getHorarios().addElement("07:25");
		ponto4.getHorarios().addElement("08:15");
		ponto4.getHorarios().addElement("09:05");
		ponto4.getHorarios().addElement("09:55");
		ponto4.getHorarios().addElement("10:45");
		ponto4.getHorarios().addElement("11:35");
		ponto4.getHorarios().addElement("12:25");
		ponto4.getHorarios().addElement("13:15");
		ponto4.getHorarios().addElement("14:05");
		ponto4.getHorarios().addElement("14:55");
		ponto4.getHorarios().addElement("15:45");
		ponto4.getHorarios().addElement("16:35");
		ponto4.getHorarios().addElement("17:25");
		ponto4.getHorarios().addElement("18:15");
		ponto4.getHorarios().addElement("19:05");
		ponto4.getHorarios().addElement("19:55");
		ponto4.getHorarios().addElement("20:45");
		ponto4.getHorarios().addElement("21:35");
		ponto4.getHorarios().addElement("22:25");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("26/07/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:40");
		ponto5.getHorarios().addElement("07:25");
		ponto5.getHorarios().addElement("08:15");
		ponto5.getHorarios().addElement("09:05");
		ponto5.getHorarios().addElement("09:55");
		ponto5.getHorarios().addElement("10:45");
		ponto5.getHorarios().addElement("11:35");
		ponto5.getHorarios().addElement("12:25");
		ponto5.getHorarios().addElement("13:15");
		ponto5.getHorarios().addElement("14:05");
		ponto5.getHorarios().addElement("14:55");
		ponto5.getHorarios().addElement("15:45");
		ponto5.getHorarios().addElement("16:35");
		ponto5.getHorarios().addElement("17:25");
		ponto5.getHorarios().addElement("18:15");
		ponto5.getHorarios().addElement("19:05");
		ponto5.getHorarios().addElement("19:55");
		ponto5.getHorarios().addElement("20:45");
		ponto5.getHorarios().addElement("21:35");
		ponto5.getHorarios().addElement("22:25");
		ponto5.getHorarios().addElement("23:20");
		return onibus;
		}
	}
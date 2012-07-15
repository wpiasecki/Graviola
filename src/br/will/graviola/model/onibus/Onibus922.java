
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus922 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("BOM PASTOR");
		onibus.setCodigo("922");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO BOM PASTOR");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("10/08/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:47");
		ponto0.getHorarios().addElement("06:04");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:37");
		ponto0.getHorarios().addElement("06:54");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:27");
		ponto0.getHorarios().addElement("07:44");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:17");
		ponto0.getHorarios().addElement("08:52");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:38");
		ponto0.getHorarios().addElement("11:31");
		ponto0.getHorarios().addElement("12:24");
		ponto0.getHorarios().addElement("13:17");
		ponto0.getHorarios().addElement("14:10");
		ponto0.getHorarios().addElement("15:03");
		ponto0.getHorarios().addElement("15:56");
		ponto0.getHorarios().addElement("16:49");
		ponto0.getHorarios().addElement("17:16");
		ponto0.getHorarios().addElement("17:42");
		ponto0.getHorarios().addElement("18:09");
		ponto0.getHorarios().addElement("18:35");
		ponto0.getHorarios().addElement("19:02");
		ponto0.getHorarios().addElement("19:28");
		ponto0.getHorarios().addElement("20:21");
		ponto0.getHorarios().addElement("21:14");
		ponto0.getHorarios().addElement("22:07");
		ponto0.getHorarios().addElement("23:00");
		ponto0.getHorarios().addElement("23:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SANTA FELICIDADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("10/08/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:58");
		ponto1.getHorarios().addElement("06:13");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("07:03");
		ponto1.getHorarios().addElement("07:19");
		ponto1.getHorarios().addElement("07:36");
		ponto1.getHorarios().addElement("07:53");
		ponto1.getHorarios().addElement("08:26");
		ponto1.getHorarios().addElement("09:19");
		ponto1.getHorarios().addElement("10:12");
		ponto1.getHorarios().addElement("11:05");
		ponto1.getHorarios().addElement("11:58");
		ponto1.getHorarios().addElement("12:51");
		ponto1.getHorarios().addElement("13:44");
		ponto1.getHorarios().addElement("14:37");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("16:23");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:16");
		ponto1.getHorarios().addElement("17:43");
		ponto1.getHorarios().addElement("18:09");
		ponto1.getHorarios().addElement("18:36");
		ponto1.getHorarios().addElement("19:02");
		ponto1.getHorarios().addElement("19:29");
		ponto1.getHorarios().addElement("19:55");
		ponto1.getHorarios().addElement("20:48");
		ponto1.getHorarios().addElement("21:41");
		ponto1.getHorarios().addElement("22:34");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO BOM PASTOR");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("13/12/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:20");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:50");
		ponto2.getHorarios().addElement("09:40");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:20");
		ponto2.getHorarios().addElement("12:10");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:50");
		ponto2.getHorarios().addElement("14:40");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("17:10");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:50");
		ponto2.getHorarios().addElement("19:40");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("21:20");
		ponto2.getHorarios().addElement("22:10");
		ponto2.getHorarios().addElement("23:00");
		ponto2.getHorarios().addElement("23:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SANTA FELICIDADE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("13/12/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:55");
		ponto3.getHorarios().addElement("06:45");
		ponto3.getHorarios().addElement("07:35");
		ponto3.getHorarios().addElement("08:25");
		ponto3.getHorarios().addElement("09:15");
		ponto3.getHorarios().addElement("10:05");
		ponto3.getHorarios().addElement("10:55");
		ponto3.getHorarios().addElement("11:45");
		ponto3.getHorarios().addElement("12:35");
		ponto3.getHorarios().addElement("13:25");
		ponto3.getHorarios().addElement("14:15");
		ponto3.getHorarios().addElement("15:05");
		ponto3.getHorarios().addElement("15:55");
		ponto3.getHorarios().addElement("16:45");
		ponto3.getHorarios().addElement("17:35");
		ponto3.getHorarios().addElement("18:25");
		ponto3.getHorarios().addElement("19:15");
		ponto3.getHorarios().addElement("20:05");
		ponto3.getHorarios().addElement("20:55");
		ponto3.getHorarios().addElement("21:45");
		ponto3.getHorarios().addElement("22:35");
		ponto3.getHorarios().addElement("23:30");
		ponto3.getHorarios().addElement("00:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO BOM PASTOR");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("14/12/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("06:20");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("08:50");
		ponto4.getHorarios().addElement("09:40");
		ponto4.getHorarios().addElement("10:30");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("12:10");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("13:50");
		ponto4.getHorarios().addElement("14:40");
		ponto4.getHorarios().addElement("15:30");
		ponto4.getHorarios().addElement("16:20");
		ponto4.getHorarios().addElement("17:10");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("18:50");
		ponto4.getHorarios().addElement("19:40");
		ponto4.getHorarios().addElement("20:30");
		ponto4.getHorarios().addElement("21:20");
		ponto4.getHorarios().addElement("22:10");
		ponto4.getHorarios().addElement("23:00");
		ponto4.getHorarios().addElement("23:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL SANTA FELICIDADE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("14/12/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:55");
		ponto5.getHorarios().addElement("06:45");
		ponto5.getHorarios().addElement("07:35");
		ponto5.getHorarios().addElement("08:25");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("10:05");
		ponto5.getHorarios().addElement("10:55");
		ponto5.getHorarios().addElement("11:45");
		ponto5.getHorarios().addElement("12:35");
		ponto5.getHorarios().addElement("13:25");
		ponto5.getHorarios().addElement("14:15");
		ponto5.getHorarios().addElement("15:05");
		ponto5.getHorarios().addElement("15:55");
		ponto5.getHorarios().addElement("16:45");
		ponto5.getHorarios().addElement("17:35");
		ponto5.getHorarios().addElement("18:25");
		ponto5.getHorarios().addElement("19:15");
		ponto5.getHorarios().addElement("20:05");
		ponto5.getHorarios().addElement("20:55");
		ponto5.getHorarios().addElement("21:45");
		ponto5.getHorarios().addElement("22:35");
		ponto5.getHorarios().addElement("23:30");
		ponto5.getHorarios().addElement("00:20");
		return onibus;
		}
	}
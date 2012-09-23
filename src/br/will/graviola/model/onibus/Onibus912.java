
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus912 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("912 - JOSÉ CULPI");
		onibus.setCodigo("912");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO JOSE CULPI");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/01/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:31");
		ponto0.getHorarios().addElement("06:01");
		ponto0.getHorarios().addElement("06:31");
		ponto0.getHorarios().addElement("07:01");
		ponto0.getHorarios().addElement("07:31");
		ponto0.getHorarios().addElement("08:04");
		ponto0.getHorarios().addElement("08:34");
		ponto0.getHorarios().addElement("09:06");
		ponto0.getHorarios().addElement("09:46");
		ponto0.getHorarios().addElement("10:24");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:36");
		ponto0.getHorarios().addElement("12:12");
		ponto0.getHorarios().addElement("12:48");
		ponto0.getHorarios().addElement("13:24");
		ponto0.getHorarios().addElement("14:00");
		ponto0.getHorarios().addElement("14:36");
		ponto0.getHorarios().addElement("15:16");
		ponto0.getHorarios().addElement("15:56");
		ponto0.getHorarios().addElement("16:32");
		ponto0.getHorarios().addElement("17:05");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("18:05");
		ponto0.getHorarios().addElement("18:35");
		ponto0.getHorarios().addElement("19:08");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("20:30");
		ponto0.getHorarios().addElement("21:10");
		ponto0.getHorarios().addElement("21:50");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:10");
		ponto0.getHorarios().addElement("23:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SANTA FELICIDADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/01/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:46");
		ponto1.getHorarios().addElement("06:16");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("08:20");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:26");
		ponto1.getHorarios().addElement("10:06");
		ponto1.getHorarios().addElement("10:42");
		ponto1.getHorarios().addElement("11:18");
		ponto1.getHorarios().addElement("11:54");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("13:06");
		ponto1.getHorarios().addElement("13:42");
		ponto1.getHorarios().addElement("14:18");
		ponto1.getHorarios().addElement("14:56");
		ponto1.getHorarios().addElement("15:36");
		ponto1.getHorarios().addElement("16:14");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("20:10");
		ponto1.getHorarios().addElement("20:50");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("22:10");
		ponto1.getHorarios().addElement("22:50");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO JOSE CULPI");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("18/03/2006");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:38");
		ponto2.getHorarios().addElement("06:12");
		ponto2.getHorarios().addElement("06:46");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("07:54");
		ponto2.getHorarios().addElement("08:28");
		ponto2.getHorarios().addElement("09:02");
		ponto2.getHorarios().addElement("09:36");
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("10:44");
		ponto2.getHorarios().addElement("11:18");
		ponto2.getHorarios().addElement("11:52");
		ponto2.getHorarios().addElement("12:26");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:34");
		ponto2.getHorarios().addElement("14:08");
		ponto2.getHorarios().addElement("14:42");
		ponto2.getHorarios().addElement("15:16");
		ponto2.getHorarios().addElement("15:50");
		ponto2.getHorarios().addElement("16:24");
		ponto2.getHorarios().addElement("16:58");
		ponto2.getHorarios().addElement("17:32");
		ponto2.getHorarios().addElement("18:06");
		ponto2.getHorarios().addElement("18:40");
		ponto2.getHorarios().addElement("19:14");
		ponto2.getHorarios().addElement("19:48");
		ponto2.getHorarios().addElement("20:22");
		ponto2.getHorarios().addElement("20:56");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:04");
		ponto2.getHorarios().addElement("22:38");
		ponto2.getHorarios().addElement("23:12");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SANTA FELICIDADE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("18/03/2006");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:20");
		ponto3.getHorarios().addElement("05:55");
		ponto3.getHorarios().addElement("06:29");
		ponto3.getHorarios().addElement("07:03");
		ponto3.getHorarios().addElement("07:37");
		ponto3.getHorarios().addElement("08:11");
		ponto3.getHorarios().addElement("08:45");
		ponto3.getHorarios().addElement("09:19");
		ponto3.getHorarios().addElement("09:53");
		ponto3.getHorarios().addElement("10:27");
		ponto3.getHorarios().addElement("11:01");
		ponto3.getHorarios().addElement("11:35");
		ponto3.getHorarios().addElement("12:09");
		ponto3.getHorarios().addElement("12:43");
		ponto3.getHorarios().addElement("13:17");
		ponto3.getHorarios().addElement("13:51");
		ponto3.getHorarios().addElement("14:25");
		ponto3.getHorarios().addElement("14:59");
		ponto3.getHorarios().addElement("15:33");
		ponto3.getHorarios().addElement("16:07");
		ponto3.getHorarios().addElement("16:41");
		ponto3.getHorarios().addElement("17:15");
		ponto3.getHorarios().addElement("17:49");
		ponto3.getHorarios().addElement("18:23");
		ponto3.getHorarios().addElement("18:57");
		ponto3.getHorarios().addElement("19:31");
		ponto3.getHorarios().addElement("20:05");
		ponto3.getHorarios().addElement("20:39");
		ponto3.getHorarios().addElement("21:13");
		ponto3.getHorarios().addElement("21:47");
		ponto3.getHorarios().addElement("22:21");
		ponto3.getHorarios().addElement("22:55");
		ponto3.getHorarios().addElement("23:29");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO JOSE CULPI");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("19/03/2006");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:42");
		ponto4.getHorarios().addElement("06:22");
		ponto4.getHorarios().addElement("07:02");
		ponto4.getHorarios().addElement("07:42");
		ponto4.getHorarios().addElement("08:22");
		ponto4.getHorarios().addElement("09:02");
		ponto4.getHorarios().addElement("09:42");
		ponto4.getHorarios().addElement("10:22");
		ponto4.getHorarios().addElement("11:02");
		ponto4.getHorarios().addElement("11:42");
		ponto4.getHorarios().addElement("12:22");
		ponto4.getHorarios().addElement("13:02");
		ponto4.getHorarios().addElement("13:42");
		ponto4.getHorarios().addElement("14:22");
		ponto4.getHorarios().addElement("15:02");
		ponto4.getHorarios().addElement("15:42");
		ponto4.getHorarios().addElement("16:22");
		ponto4.getHorarios().addElement("17:02");
		ponto4.getHorarios().addElement("17:42");
		ponto4.getHorarios().addElement("18:22");
		ponto4.getHorarios().addElement("19:02");
		ponto4.getHorarios().addElement("19:42");
		ponto4.getHorarios().addElement("20:22");
		ponto4.getHorarios().addElement("21:02");
		ponto4.getHorarios().addElement("21:42");
		ponto4.getHorarios().addElement("22:22");
		ponto4.getHorarios().addElement("23:02");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL SANTA FELICIDADE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("19/03/2006");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:25");
		ponto5.getHorarios().addElement("06:02");
		ponto5.getHorarios().addElement("06:42");
		ponto5.getHorarios().addElement("07:22");
		ponto5.getHorarios().addElement("08:02");
		ponto5.getHorarios().addElement("08:42");
		ponto5.getHorarios().addElement("09:22");
		ponto5.getHorarios().addElement("10:02");
		ponto5.getHorarios().addElement("10:42");
		ponto5.getHorarios().addElement("11:22");
		ponto5.getHorarios().addElement("12:02");
		ponto5.getHorarios().addElement("12:42");
		ponto5.getHorarios().addElement("13:22");
		ponto5.getHorarios().addElement("14:02");
		ponto5.getHorarios().addElement("14:42");
		ponto5.getHorarios().addElement("15:22");
		ponto5.getHorarios().addElement("16:02");
		ponto5.getHorarios().addElement("16:42");
		ponto5.getHorarios().addElement("17:22");
		ponto5.getHorarios().addElement("18:02");
		ponto5.getHorarios().addElement("18:42");
		ponto5.getHorarios().addElement("19:22");
		ponto5.getHorarios().addElement("20:02");
		ponto5.getHorarios().addElement("20:42");
		ponto5.getHorarios().addElement("21:22");
		ponto5.getHorarios().addElement("22:02");
		ponto5.getHorarios().addElement("22:42");
		ponto5.getHorarios().addElement("23:22");
		return onibus;
		}
	}
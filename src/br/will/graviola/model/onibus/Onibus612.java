
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus612 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("PORTÃO / CIC");
		onibus.setCodigo("612");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CIC");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:26");
		ponto0.getHorarios().addElement("05:38");
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("05:57");
		ponto0.getHorarios().addElement("06:13");
		ponto0.getHorarios().addElement("06:24");
		ponto0.getHorarios().addElement("06:34");
		ponto0.getHorarios().addElement("06:44");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("07:06");
		ponto0.getHorarios().addElement("07:17");
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("07:39");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:01");
		ponto0.getHorarios().addElement("08:12");
		ponto0.getHorarios().addElement("08:23");
		ponto0.getHorarios().addElement("08:37");
		ponto0.getHorarios().addElement("09:02");
		ponto0.getHorarios().addElement("09:27");
		ponto0.getHorarios().addElement("09:52");
		ponto0.getHorarios().addElement("10:17");
		ponto0.getHorarios().addElement("10:42");
		ponto0.getHorarios().addElement("11:07");
		ponto0.getHorarios().addElement("11:32");
		ponto0.getHorarios().addElement("11:57");
		ponto0.getHorarios().addElement("12:22");
		ponto0.getHorarios().addElement("12:47");
		ponto0.getHorarios().addElement("13:12");
		ponto0.getHorarios().addElement("13:37");
		ponto0.getHorarios().addElement("14:02");
		ponto0.getHorarios().addElement("14:27");
		ponto0.getHorarios().addElement("14:52");
		ponto0.getHorarios().addElement("15:17");
		ponto0.getHorarios().addElement("15:42");
		ponto0.getHorarios().addElement("16:12");
		ponto0.getHorarios().addElement("16:32");
		ponto0.getHorarios().addElement("16:49");
		ponto0.getHorarios().addElement("17:06");
		ponto0.getHorarios().addElement("17:22");
		ponto0.getHorarios().addElement("17:39");
		ponto0.getHorarios().addElement("17:56");
		ponto0.getHorarios().addElement("18:12");
		ponto0.getHorarios().addElement("18:29");
		ponto0.getHorarios().addElement("18:46");
		ponto0.getHorarios().addElement("19:02");
		ponto0.getHorarios().addElement("19:19");
		ponto0.getHorarios().addElement("19:36");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("20:12");
		ponto0.getHorarios().addElement("20:35");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:25");
		ponto0.getHorarios().addElement("21:50");
		ponto0.getHorarios().addElement("22:15");
		ponto0.getHorarios().addElement("22:45");
		ponto0.getHorarios().addElement("23:20");
		ponto0.getHorarios().addElement("23:35");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PORTAO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:04");
		ponto1.getHorarios().addElement("05:25");
		ponto1.getHorarios().addElement("05:49");
		ponto1.getHorarios().addElement("06:02");
		ponto1.getHorarios().addElement("06:13");
		ponto1.getHorarios().addElement("06:21");
		ponto1.getHorarios().addElement("06:33");
		ponto1.getHorarios().addElement("06:45");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("07:17");
		ponto1.getHorarios().addElement("07:28");
		ponto1.getHorarios().addElement("07:39");
		ponto1.getHorarios().addElement("07:49");
		ponto1.getHorarios().addElement("08:01");
		ponto1.getHorarios().addElement("08:12");
		ponto1.getHorarios().addElement("08:37");
		ponto1.getHorarios().addElement("09:02");
		ponto1.getHorarios().addElement("09:27");
		ponto1.getHorarios().addElement("09:52");
		ponto1.getHorarios().addElement("10:17");
		ponto1.getHorarios().addElement("10:42");
		ponto1.getHorarios().addElement("11:07");
		ponto1.getHorarios().addElement("11:32");
		ponto1.getHorarios().addElement("11:57");
		ponto1.getHorarios().addElement("12:22");
		ponto1.getHorarios().addElement("12:47");
		ponto1.getHorarios().addElement("13:12");
		ponto1.getHorarios().addElement("13:37");
		ponto1.getHorarios().addElement("14:02");
		ponto1.getHorarios().addElement("14:27");
		ponto1.getHorarios().addElement("14:52");
		ponto1.getHorarios().addElement("15:17");
		ponto1.getHorarios().addElement("15:42");
		ponto1.getHorarios().addElement("16:07");
		ponto1.getHorarios().addElement("16:24");
		ponto1.getHorarios().addElement("16:41");
		ponto1.getHorarios().addElement("16:57");
		ponto1.getHorarios().addElement("17:14");
		ponto1.getHorarios().addElement("17:31");
		ponto1.getHorarios().addElement("17:47");
		ponto1.getHorarios().addElement("18:04");
		ponto1.getHorarios().addElement("18:21");
		ponto1.getHorarios().addElement("18:37");
		ponto1.getHorarios().addElement("18:54");
		ponto1.getHorarios().addElement("19:09");
		ponto1.getHorarios().addElement("19:24");
		ponto1.getHorarios().addElement("19:47");
		ponto1.getHorarios().addElement("20:12");
		ponto1.getHorarios().addElement("20:35");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("21:25");
		ponto1.getHorarios().addElement("21:50");
		ponto1.getHorarios().addElement("22:15");
		ponto1.getHorarios().addElement("22:45");
		ponto1.getHorarios().addElement("23:15");
		ponto1.getHorarios().addElement("23:43");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CIC");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("22/09/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:40");
		ponto2.getHorarios().addElement("06:28");
		ponto2.getHorarios().addElement("07:14");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:54");
		ponto2.getHorarios().addElement("09:48");
		ponto2.getHorarios().addElement("10:38");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("13:11");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:50");
		ponto2.getHorarios().addElement("15:40");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:20");
		ponto2.getHorarios().addElement("18:10");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("19:50");
		ponto2.getHorarios().addElement("20:40");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:25");
		ponto2.getHorarios().addElement("23:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PORTAO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("22/09/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:15");
		ponto3.getHorarios().addElement("06:05");
		ponto3.getHorarios().addElement("06:51");
		ponto3.getHorarios().addElement("07:37");
		ponto3.getHorarios().addElement("08:27");
		ponto3.getHorarios().addElement("09:21");
		ponto3.getHorarios().addElement("10:15");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("11:55");
		ponto3.getHorarios().addElement("12:45");
		ponto3.getHorarios().addElement("13:35");
		ponto3.getHorarios().addElement("14:25");
		ponto3.getHorarios().addElement("15:15");
		ponto3.getHorarios().addElement("16:05");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("17:45");
		ponto3.getHorarios().addElement("18:35");
		ponto3.getHorarios().addElement("19:25");
		ponto3.getHorarios().addElement("20:15");
		ponto3.getHorarios().addElement("21:05");
		ponto3.getHorarios().addElement("22:00");
		ponto3.getHorarios().addElement("23:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL CIC");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("23/09/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("06:28");
		ponto4.getHorarios().addElement("07:14");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("08:54");
		ponto4.getHorarios().addElement("09:48");
		ponto4.getHorarios().addElement("10:38");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("12:20");
		ponto4.getHorarios().addElement("13:11");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("14:50");
		ponto4.getHorarios().addElement("15:40");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("17:20");
		ponto4.getHorarios().addElement("18:10");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("19:50");
		ponto4.getHorarios().addElement("20:40");
		ponto4.getHorarios().addElement("21:30");
		ponto4.getHorarios().addElement("22:25");
		ponto4.getHorarios().addElement("23:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL PORTAO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("23/09/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:05");
		ponto5.getHorarios().addElement("06:05");
		ponto5.getHorarios().addElement("06:51");
		ponto5.getHorarios().addElement("07:37");
		ponto5.getHorarios().addElement("08:27");
		ponto5.getHorarios().addElement("09:21");
		ponto5.getHorarios().addElement("10:15");
		ponto5.getHorarios().addElement("11:05");
		ponto5.getHorarios().addElement("11:55");
		ponto5.getHorarios().addElement("12:45");
		ponto5.getHorarios().addElement("13:35");
		ponto5.getHorarios().addElement("14:25");
		ponto5.getHorarios().addElement("15:15");
		ponto5.getHorarios().addElement("16:05");
		ponto5.getHorarios().addElement("16:55");
		ponto5.getHorarios().addElement("17:45");
		ponto5.getHorarios().addElement("18:35");
		ponto5.getHorarios().addElement("19:25");
		ponto5.getHorarios().addElement("20:15");
		ponto5.getHorarios().addElement("21:05");
		ponto5.getHorarios().addElement("22:00");
		ponto5.getHorarios().addElement("23:00");
		return onibus;
		}
	}
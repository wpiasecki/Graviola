
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus472 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("UBERABA");
		onibus.setCodigo("472");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO UBERABA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("18/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("08:44");
		ponto0.getHorarios().addElement("09:10");
		ponto0.getHorarios().addElement("09:40");
		ponto0.getHorarios().addElement("10:07");
		ponto0.getHorarios().addElement("10:34");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:27");
		ponto0.getHorarios().addElement("11:54");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:47");
		ponto0.getHorarios().addElement("13:14");
		ponto0.getHorarios().addElement("13:40");
		ponto0.getHorarios().addElement("14:07");
		ponto0.getHorarios().addElement("14:34");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("15:27");
		ponto0.getHorarios().addElement("15:57");
		ponto0.getHorarios().addElement("16:24");
		ponto0.getHorarios().addElement("16:47");
		ponto0.getHorarios().addElement("17:07");
		ponto0.getHorarios().addElement("17:27");
		ponto0.getHorarios().addElement("17:47");
		ponto0.getHorarios().addElement("18:07");
		ponto0.getHorarios().addElement("18:27");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("19:07");
		ponto0.getHorarios().addElement("19:47");
		ponto0.getHorarios().addElement("20:10");
		ponto0.getHorarios().addElement("20:34");
		ponto0.getHorarios().addElement("20:58");
		ponto0.getHorarios().addElement("21:22");
		ponto0.getHorarios().addElement("21:46");
		ponto0.getHorarios().addElement("22:10");
		ponto0.getHorarios().addElement("22:34");
		ponto0.getHorarios().addElement("22:58");
		ponto0.getHorarios().addElement("23:22");
		ponto0.getHorarios().addElement("23:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("18/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:20");
		ponto1.getHorarios().addElement("09:00");
		ponto1.getHorarios().addElement("09:27");
		ponto1.getHorarios().addElement("09:54");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("10:47");
		ponto1.getHorarios().addElement("11:14");
		ponto1.getHorarios().addElement("11:40");
		ponto1.getHorarios().addElement("12:05");
		ponto1.getHorarios().addElement("12:30");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:27");
		ponto1.getHorarios().addElement("13:54");
		ponto1.getHorarios().addElement("14:20");
		ponto1.getHorarios().addElement("14:47");
		ponto1.getHorarios().addElement("15:14");
		ponto1.getHorarios().addElement("15:40");
		ponto1.getHorarios().addElement("16:05");
		ponto1.getHorarios().addElement("16:27");
		ponto1.getHorarios().addElement("16:47");
		ponto1.getHorarios().addElement("17:07");
		ponto1.getHorarios().addElement("17:27");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:07");
		ponto1.getHorarios().addElement("18:27");
		ponto1.getHorarios().addElement("18:47");
		ponto1.getHorarios().addElement("19:07");
		ponto1.getHorarios().addElement("19:27");
		ponto1.getHorarios().addElement("19:51");
		ponto1.getHorarios().addElement("20:22");
		ponto1.getHorarios().addElement("20:46");
		ponto1.getHorarios().addElement("21:10");
		ponto1.getHorarios().addElement("21:34");
		ponto1.getHorarios().addElement("21:58");
		ponto1.getHorarios().addElement("22:22");
		ponto1.getHorarios().addElement("22:46");
		ponto1.getHorarios().addElement("23:08");
		ponto1.getHorarios().addElement("23:34");
		ponto1.getHorarios().addElement("23:58");
		ponto1.getHorarios().addElement("00:19");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO UBERABA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("16/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:03");
		ponto2.getHorarios().addElement("06:36");
		ponto2.getHorarios().addElement("07:09");
		ponto2.getHorarios().addElement("07:42");
		ponto2.getHorarios().addElement("08:15");
		ponto2.getHorarios().addElement("08:48");
		ponto2.getHorarios().addElement("09:21");
		ponto2.getHorarios().addElement("09:54");
		ponto2.getHorarios().addElement("10:27");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:33");
		ponto2.getHorarios().addElement("12:06");
		ponto2.getHorarios().addElement("12:39");
		ponto2.getHorarios().addElement("13:12");
		ponto2.getHorarios().addElement("13:45");
		ponto2.getHorarios().addElement("14:18");
		ponto2.getHorarios().addElement("14:51");
		ponto2.getHorarios().addElement("15:24");
		ponto2.getHorarios().addElement("15:57");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:03");
		ponto2.getHorarios().addElement("17:36");
		ponto2.getHorarios().addElement("18:09");
		ponto2.getHorarios().addElement("18:42");
		ponto2.getHorarios().addElement("19:15");
		ponto2.getHorarios().addElement("19:48");
		ponto2.getHorarios().addElement("20:21");
		ponto2.getHorarios().addElement("20:54");
		ponto2.getHorarios().addElement("21:27");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:33");
		ponto2.getHorarios().addElement("23:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("16/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:03");
		ponto3.getHorarios().addElement("06:36");
		ponto3.getHorarios().addElement("07:09");
		ponto3.getHorarios().addElement("07:42");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("08:48");
		ponto3.getHorarios().addElement("09:21");
		ponto3.getHorarios().addElement("09:54");
		ponto3.getHorarios().addElement("10:27");
		ponto3.getHorarios().addElement("11:00");
		ponto3.getHorarios().addElement("11:33");
		ponto3.getHorarios().addElement("12:06");
		ponto3.getHorarios().addElement("12:39");
		ponto3.getHorarios().addElement("13:12");
		ponto3.getHorarios().addElement("13:45");
		ponto3.getHorarios().addElement("14:18");
		ponto3.getHorarios().addElement("14:51");
		ponto3.getHorarios().addElement("15:24");
		ponto3.getHorarios().addElement("15:57");
		ponto3.getHorarios().addElement("16:30");
		ponto3.getHorarios().addElement("17:03");
		ponto3.getHorarios().addElement("17:36");
		ponto3.getHorarios().addElement("18:09");
		ponto3.getHorarios().addElement("18:42");
		ponto3.getHorarios().addElement("19:15");
		ponto3.getHorarios().addElement("19:48");
		ponto3.getHorarios().addElement("20:21");
		ponto3.getHorarios().addElement("20:54");
		ponto3.getHorarios().addElement("21:27");
		ponto3.getHorarios().addElement("22:00");
		ponto3.getHorarios().addElement("22:33");
		ponto3.getHorarios().addElement("23:10");
		ponto3.getHorarios().addElement("23:45");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO UBERABA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("17/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("06:23");
		ponto4.getHorarios().addElement("06:56");
		ponto4.getHorarios().addElement("07:29");
		ponto4.getHorarios().addElement("08:02");
		ponto4.getHorarios().addElement("08:35");
		ponto4.getHorarios().addElement("09:08");
		ponto4.getHorarios().addElement("09:41");
		ponto4.getHorarios().addElement("10:14");
		ponto4.getHorarios().addElement("10:47");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("11:53");
		ponto4.getHorarios().addElement("12:26");
		ponto4.getHorarios().addElement("12:59");
		ponto4.getHorarios().addElement("13:32");
		ponto4.getHorarios().addElement("14:05");
		ponto4.getHorarios().addElement("14:38");
		ponto4.getHorarios().addElement("15:11");
		ponto4.getHorarios().addElement("15:44");
		ponto4.getHorarios().addElement("16:17");
		ponto4.getHorarios().addElement("16:50");
		ponto4.getHorarios().addElement("17:23");
		ponto4.getHorarios().addElement("17:56");
		ponto4.getHorarios().addElement("18:29");
		ponto4.getHorarios().addElement("19:02");
		ponto4.getHorarios().addElement("19:35");
		ponto4.getHorarios().addElement("20:08");
		ponto4.getHorarios().addElement("20:41");
		ponto4.getHorarios().addElement("21:14");
		ponto4.getHorarios().addElement("21:47");
		ponto4.getHorarios().addElement("22:20");
		ponto4.getHorarios().addElement("22:53");
		ponto4.getHorarios().addElement("23:26");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("17/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:50");
		ponto5.getHorarios().addElement("06:23");
		ponto5.getHorarios().addElement("06:56");
		ponto5.getHorarios().addElement("07:29");
		ponto5.getHorarios().addElement("08:02");
		ponto5.getHorarios().addElement("08:35");
		ponto5.getHorarios().addElement("09:08");
		ponto5.getHorarios().addElement("09:41");
		ponto5.getHorarios().addElement("10:14");
		ponto5.getHorarios().addElement("10:47");
		ponto5.getHorarios().addElement("11:20");
		ponto5.getHorarios().addElement("11:53");
		ponto5.getHorarios().addElement("12:26");
		ponto5.getHorarios().addElement("12:59");
		ponto5.getHorarios().addElement("13:32");
		ponto5.getHorarios().addElement("14:05");
		ponto5.getHorarios().addElement("14:38");
		ponto5.getHorarios().addElement("15:11");
		ponto5.getHorarios().addElement("15:44");
		ponto5.getHorarios().addElement("16:17");
		ponto5.getHorarios().addElement("16:50");
		ponto5.getHorarios().addElement("17:23");
		ponto5.getHorarios().addElement("17:56");
		ponto5.getHorarios().addElement("18:29");
		ponto5.getHorarios().addElement("19:02");
		ponto5.getHorarios().addElement("19:35");
		ponto5.getHorarios().addElement("20:08");
		ponto5.getHorarios().addElement("20:41");
		ponto5.getHorarios().addElement("21:14");
		ponto5.getHorarios().addElement("21:47");
		ponto5.getHorarios().addElement("22:20");
		ponto5.getHorarios().addElement("22:53");
		ponto5.getHorarios().addElement("23:25");
		ponto5.getHorarios().addElement("00:00");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("ELECTROLUX-AV.SALGADO F.,2125");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("17/06/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:15");
		return onibus;
		}
	}
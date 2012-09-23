
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus375 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("375 - SAGRADO CORAÇÃO");
		onibus.setCodigo("375");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA SANTOS ANDRADE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/02/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:05");
		ponto0.getHorarios().addElement("06:41");
		ponto0.getHorarios().addElement("07:18");
		ponto0.getHorarios().addElement("07:53");
		ponto0.getHorarios().addElement("08:25");
		ponto0.getHorarios().addElement("08:59");
		ponto0.getHorarios().addElement("09:33");
		ponto0.getHorarios().addElement("10:07");
		ponto0.getHorarios().addElement("10:43");
		ponto0.getHorarios().addElement("11:10");
		ponto0.getHorarios().addElement("11:49");
		ponto0.getHorarios().addElement("12:21");
		ponto0.getHorarios().addElement("12:55");
		ponto0.getHorarios().addElement("13:31");
		ponto0.getHorarios().addElement("14:05");
		ponto0.getHorarios().addElement("14:39");
		ponto0.getHorarios().addElement("15:13");
		ponto0.getHorarios().addElement("15:47");
		ponto0.getHorarios().addElement("16:21");
		ponto0.getHorarios().addElement("16:55");
		ponto0.getHorarios().addElement("17:29");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:37");
		ponto0.getHorarios().addElement("19:11");
		ponto0.getHorarios().addElement("19:45");
		ponto0.getHorarios().addElement("20:19");
		ponto0.getHorarios().addElement("20:53");
		ponto0.getHorarios().addElement("22:06");
		ponto0.getHorarios().addElement("23:12");
		ponto0.getHorarios().addElement("00:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL BAIRRO ALTO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/02/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:35");
		ponto1.getHorarios().addElement("06:05");
		ponto1.getHorarios().addElement("06:45");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:51");
		ponto1.getHorarios().addElement("08:27");
		ponto1.getHorarios().addElement("08:59");
		ponto1.getHorarios().addElement("09:30");
		ponto1.getHorarios().addElement("10:08");
		ponto1.getHorarios().addElement("10:38");
		ponto1.getHorarios().addElement("11:19");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:20");
		ponto1.getHorarios().addElement("12:55");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("14:05");
		ponto1.getHorarios().addElement("14:38");
		ponto1.getHorarios().addElement("15:13");
		ponto1.getHorarios().addElement("15:47");
		ponto1.getHorarios().addElement("16:21");
		ponto1.getHorarios().addElement("16:55");
		ponto1.getHorarios().addElement("17:29");
		ponto1.getHorarios().addElement("18:03");
		ponto1.getHorarios().addElement("18:37");
		ponto1.getHorarios().addElement("19:11");
		ponto1.getHorarios().addElement("19:45");
		ponto1.getHorarios().addElement("20:19");
		ponto1.getHorarios().addElement("21:27");
		ponto1.getHorarios().addElement("22:40");
		ponto1.getHorarios().addElement("23:42");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA SANTOS ANDRADE");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("05/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:09");
		ponto2.getHorarios().addElement("06:43");
		ponto2.getHorarios().addElement("07:17");
		ponto2.getHorarios().addElement("07:51");
		ponto2.getHorarios().addElement("08:25");
		ponto2.getHorarios().addElement("08:59");
		ponto2.getHorarios().addElement("09:33");
		ponto2.getHorarios().addElement("10:07");
		ponto2.getHorarios().addElement("10:42");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("11:49");
		ponto2.getHorarios().addElement("12:23");
		ponto2.getHorarios().addElement("12:57");
		ponto2.getHorarios().addElement("13:31");
		ponto2.getHorarios().addElement("14:05");
		ponto2.getHorarios().addElement("14:41");
		ponto2.getHorarios().addElement("15:13");
		ponto2.getHorarios().addElement("15:49");
		ponto2.getHorarios().addElement("16:21");
		ponto2.getHorarios().addElement("16:55");
		ponto2.getHorarios().addElement("17:29");
		ponto2.getHorarios().addElement("18:03");
		ponto2.getHorarios().addElement("18:37");
		ponto2.getHorarios().addElement("19:11");
		ponto2.getHorarios().addElement("19:47");
		ponto2.getHorarios().addElement("20:55");
		ponto2.getHorarios().addElement("22:01");
		ponto2.getHorarios().addElement("23:09");
		ponto2.getHorarios().addElement("00:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL BAIRRO ALTO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("05/05/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:35");
		ponto3.getHorarios().addElement("06:09");
		ponto3.getHorarios().addElement("06:43");
		ponto3.getHorarios().addElement("07:17");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("08:25");
		ponto3.getHorarios().addElement("08:59");
		ponto3.getHorarios().addElement("09:33");
		ponto3.getHorarios().addElement("10:09");
		ponto3.getHorarios().addElement("10:41");
		ponto3.getHorarios().addElement("11:15");
		ponto3.getHorarios().addElement("11:49");
		ponto3.getHorarios().addElement("12:23");
		ponto3.getHorarios().addElement("12:57");
		ponto3.getHorarios().addElement("13:31");
		ponto3.getHorarios().addElement("14:05");
		ponto3.getHorarios().addElement("14:39");
		ponto3.getHorarios().addElement("15:18");
		ponto3.getHorarios().addElement("15:47");
		ponto3.getHorarios().addElement("16:21");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("17:29");
		ponto3.getHorarios().addElement("18:03");
		ponto3.getHorarios().addElement("18:37");
		ponto3.getHorarios().addElement("19:11");
		ponto3.getHorarios().addElement("20:23");
		ponto3.getHorarios().addElement("21:27");
		ponto3.getHorarios().addElement("22:35");
		ponto3.getHorarios().addElement("23:40");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA SANTOS ANDRADE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("20/02/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:07");
		ponto4.getHorarios().addElement("07:07");
		ponto4.getHorarios().addElement("08:07");
		ponto4.getHorarios().addElement("09:07");
		ponto4.getHorarios().addElement("10:07");
		ponto4.getHorarios().addElement("11:07");
		ponto4.getHorarios().addElement("12:07");
		ponto4.getHorarios().addElement("13:07");
		ponto4.getHorarios().addElement("14:07");
		ponto4.getHorarios().addElement("15:07");
		ponto4.getHorarios().addElement("16:07");
		ponto4.getHorarios().addElement("17:07");
		ponto4.getHorarios().addElement("18:07");
		ponto4.getHorarios().addElement("19:07");
		ponto4.getHorarios().addElement("20:07");
		ponto4.getHorarios().addElement("21:07");
		ponto4.getHorarios().addElement("22:07");
		ponto4.getHorarios().addElement("23:07");
		ponto4.getHorarios().addElement("00:07");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL BAIRRO ALTO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("20/02/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:37");
		ponto5.getHorarios().addElement("06:37");
		ponto5.getHorarios().addElement("07:37");
		ponto5.getHorarios().addElement("08:37");
		ponto5.getHorarios().addElement("09:37");
		ponto5.getHorarios().addElement("10:37");
		ponto5.getHorarios().addElement("11:37");
		ponto5.getHorarios().addElement("12:37");
		ponto5.getHorarios().addElement("13:37");
		ponto5.getHorarios().addElement("14:37");
		ponto5.getHorarios().addElement("15:37");
		ponto5.getHorarios().addElement("16:37");
		ponto5.getHorarios().addElement("17:37");
		ponto5.getHorarios().addElement("18:37");
		ponto5.getHorarios().addElement("19:37");
		ponto5.getHorarios().addElement("20:37");
		ponto5.getHorarios().addElement("21:37");
		ponto5.getHorarios().addElement("22:37");
		ponto5.getHorarios().addElement("23:37");
		return onibus;
		}
	}
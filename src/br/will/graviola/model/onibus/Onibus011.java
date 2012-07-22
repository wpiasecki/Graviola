
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus011 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("INTERBAIRROS I (ANTI-HORÁRIO)");
		onibus.setCodigo("011");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PONT.UNIVERSIDADE CATOLICA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:48");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:23");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("07:58");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("08:33");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:08");
		ponto0.getHorarios().addElement("09:25");
		ponto0.getHorarios().addElement("09:48");
		ponto0.getHorarios().addElement("10:07");
		ponto0.getHorarios().addElement("10:25");
		ponto0.getHorarios().addElement("10:44");
		ponto0.getHorarios().addElement("11:03");
		ponto0.getHorarios().addElement("11:22");
		ponto0.getHorarios().addElement("11:40");
		ponto0.getHorarios().addElement("11:59");
		ponto0.getHorarios().addElement("12:18");
		ponto0.getHorarios().addElement("12:37");
		ponto0.getHorarios().addElement("12:55");
		ponto0.getHorarios().addElement("13:14");
		ponto0.getHorarios().addElement("13:33");
		ponto0.getHorarios().addElement("13:52");
		ponto0.getHorarios().addElement("14:10");
		ponto0.getHorarios().addElement("14:29");
		ponto0.getHorarios().addElement("14:48");
		ponto0.getHorarios().addElement("15:07");
		ponto0.getHorarios().addElement("15:25");
		ponto0.getHorarios().addElement("15:44");
		ponto0.getHorarios().addElement("16:03");
		ponto0.getHorarios().addElement("16:22");
		ponto0.getHorarios().addElement("16:40");
		ponto0.getHorarios().addElement("16:59");
		ponto0.getHorarios().addElement("17:18");
		ponto0.getHorarios().addElement("17:37");
		ponto0.getHorarios().addElement("17:55");
		ponto0.getHorarios().addElement("18:14");
		ponto0.getHorarios().addElement("18:33");
		ponto0.getHorarios().addElement("18:56");
		ponto0.getHorarios().addElement("19:17");
		ponto0.getHorarios().addElement("19:29");
		ponto0.getHorarios().addElement("19:48");
		ponto0.getHorarios().addElement("20:13");
		ponto0.getHorarios().addElement("20:36");
		ponto0.getHorarios().addElement("20:57");
		ponto0.getHorarios().addElement("21:18");
		ponto0.getHorarios().addElement("21:39");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:21");
		ponto0.getHorarios().addElement("22:42");
		ponto0.getHorarios().addElement("23:03");
		ponto0.getHorarios().addElement("23:24");
		ponto0.getHorarios().addElement("23:45");
		ponto0.getHorarios().addElement("00:01");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PREFEITURA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:50");
		ponto1.getHorarios().addElement("06:08");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:43");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:18");
		ponto1.getHorarios().addElement("07:35");
		ponto1.getHorarios().addElement("07:53");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("08:28");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("09:03");
		ponto1.getHorarios().addElement("09:22");
		ponto1.getHorarios().addElement("09:40");
		ponto1.getHorarios().addElement("09:59");
		ponto1.getHorarios().addElement("10:18");
		ponto1.getHorarios().addElement("10:37");
		ponto1.getHorarios().addElement("10:55");
		ponto1.getHorarios().addElement("11:14");
		ponto1.getHorarios().addElement("11:33");
		ponto1.getHorarios().addElement("11:52");
		ponto1.getHorarios().addElement("12:10");
		ponto1.getHorarios().addElement("12:29");
		ponto1.getHorarios().addElement("12:48");
		ponto1.getHorarios().addElement("13:07");
		ponto1.getHorarios().addElement("13:25");
		ponto1.getHorarios().addElement("13:44");
		ponto1.getHorarios().addElement("14:03");
		ponto1.getHorarios().addElement("14:22");
		ponto1.getHorarios().addElement("14:40");
		ponto1.getHorarios().addElement("14:59");
		ponto1.getHorarios().addElement("15:18");
		ponto1.getHorarios().addElement("15:37");
		ponto1.getHorarios().addElement("15:55");
		ponto1.getHorarios().addElement("16:14");
		ponto1.getHorarios().addElement("16:33");
		ponto1.getHorarios().addElement("16:52");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:29");
		ponto1.getHorarios().addElement("17:48");
		ponto1.getHorarios().addElement("18:07");
		ponto1.getHorarios().addElement("18:25");
		ponto1.getHorarios().addElement("18:44");
		ponto1.getHorarios().addElement("19:03");
		ponto1.getHorarios().addElement("19:28");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("20:21");
		ponto1.getHorarios().addElement("20:42");
		ponto1.getHorarios().addElement("21:03");
		ponto1.getHorarios().addElement("21:24");
		ponto1.getHorarios().addElement("21:45");
		ponto1.getHorarios().addElement("22:06");
		ponto1.getHorarios().addElement("22:27");
		ponto1.getHorarios().addElement("22:48");
		ponto1.getHorarios().addElement("23:09");
		ponto1.getHorarios().addElement("23:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PONT.UNIVERSIDADE CATOLICA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:37");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:17");
		ponto2.getHorarios().addElement("07:37");
		ponto2.getHorarios().addElement("07:57");
		ponto2.getHorarios().addElement("08:17");
		ponto2.getHorarios().addElement("08:37");
		ponto2.getHorarios().addElement("08:57");
		ponto2.getHorarios().addElement("09:17");
		ponto2.getHorarios().addElement("09:37");
		ponto2.getHorarios().addElement("09:57");
		ponto2.getHorarios().addElement("10:17");
		ponto2.getHorarios().addElement("10:37");
		ponto2.getHorarios().addElement("10:57");
		ponto2.getHorarios().addElement("11:17");
		ponto2.getHorarios().addElement("11:37");
		ponto2.getHorarios().addElement("11:57");
		ponto2.getHorarios().addElement("12:17");
		ponto2.getHorarios().addElement("12:42");
		ponto2.getHorarios().addElement("12:57");
		ponto2.getHorarios().addElement("13:17");
		ponto2.getHorarios().addElement("13:47");
		ponto2.getHorarios().addElement("14:17");
		ponto2.getHorarios().addElement("14:47");
		ponto2.getHorarios().addElement("15:17");
		ponto2.getHorarios().addElement("15:47");
		ponto2.getHorarios().addElement("16:17");
		ponto2.getHorarios().addElement("16:47");
		ponto2.getHorarios().addElement("17:17");
		ponto2.getHorarios().addElement("17:47");
		ponto2.getHorarios().addElement("18:17");
		ponto2.getHorarios().addElement("18:47");
		ponto2.getHorarios().addElement("19:17");
		ponto2.getHorarios().addElement("19:47");
		ponto2.getHorarios().addElement("20:17");
		ponto2.getHorarios().addElement("20:47");
		ponto2.getHorarios().addElement("21:17");
		ponto2.getHorarios().addElement("21:47");
		ponto2.getHorarios().addElement("22:17");
		ponto2.getHorarios().addElement("22:47");
		ponto2.getHorarios().addElement("23:17");
		ponto2.getHorarios().addElement("23:47");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PREFEITURA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:00");
		ponto3.getHorarios().addElement("06:20");
		ponto3.getHorarios().addElement("06:40");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("07:40");
		ponto3.getHorarios().addElement("08:00");
		ponto3.getHorarios().addElement("08:20");
		ponto3.getHorarios().addElement("08:40");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("09:20");
		ponto3.getHorarios().addElement("09:40");
		ponto3.getHorarios().addElement("10:00");
		ponto3.getHorarios().addElement("10:20");
		ponto3.getHorarios().addElement("10:40");
		ponto3.getHorarios().addElement("11:00");
		ponto3.getHorarios().addElement("11:20");
		ponto3.getHorarios().addElement("11:40");
		ponto3.getHorarios().addElement("12:00");
		ponto3.getHorarios().addElement("12:20");
		ponto3.getHorarios().addElement("12:40");
		ponto3.getHorarios().addElement("13:10");
		ponto3.getHorarios().addElement("13:40");
		ponto3.getHorarios().addElement("14:10");
		ponto3.getHorarios().addElement("14:40");
		ponto3.getHorarios().addElement("15:10");
		ponto3.getHorarios().addElement("15:40");
		ponto3.getHorarios().addElement("16:10");
		ponto3.getHorarios().addElement("16:40");
		ponto3.getHorarios().addElement("17:10");
		ponto3.getHorarios().addElement("17:40");
		ponto3.getHorarios().addElement("18:10");
		ponto3.getHorarios().addElement("18:40");
		ponto3.getHorarios().addElement("19:10");
		ponto3.getHorarios().addElement("19:40");
		ponto3.getHorarios().addElement("20:10");
		ponto3.getHorarios().addElement("20:40");
		ponto3.getHorarios().addElement("21:10");
		ponto3.getHorarios().addElement("21:40");
		ponto3.getHorarios().addElement("22:10");
		ponto3.getHorarios().addElement("22:40");
		ponto3.getHorarios().addElement("23:10");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PONT.UNIVERSIDADE CATOLICA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:37");
		ponto4.getHorarios().addElement("07:07");
		ponto4.getHorarios().addElement("07:37");
		ponto4.getHorarios().addElement("08:07");
		ponto4.getHorarios().addElement("08:37");
		ponto4.getHorarios().addElement("09:07");
		ponto4.getHorarios().addElement("09:37");
		ponto4.getHorarios().addElement("10:07");
		ponto4.getHorarios().addElement("10:37");
		ponto4.getHorarios().addElement("11:07");
		ponto4.getHorarios().addElement("11:37");
		ponto4.getHorarios().addElement("12:07");
		ponto4.getHorarios().addElement("12:37");
		ponto4.getHorarios().addElement("13:07");
		ponto4.getHorarios().addElement("13:37");
		ponto4.getHorarios().addElement("14:07");
		ponto4.getHorarios().addElement("14:37");
		ponto4.getHorarios().addElement("15:07");
		ponto4.getHorarios().addElement("15:37");
		ponto4.getHorarios().addElement("16:07");
		ponto4.getHorarios().addElement("16:37");
		ponto4.getHorarios().addElement("17:07");
		ponto4.getHorarios().addElement("17:37");
		ponto4.getHorarios().addElement("18:07");
		ponto4.getHorarios().addElement("18:37");
		ponto4.getHorarios().addElement("19:07");
		ponto4.getHorarios().addElement("19:37");
		ponto4.getHorarios().addElement("20:07");
		ponto4.getHorarios().addElement("20:37");
		ponto4.getHorarios().addElement("21:07");
		ponto4.getHorarios().addElement("21:37");
		ponto4.getHorarios().addElement("22:07");
		ponto4.getHorarios().addElement("22:37");
		ponto4.getHorarios().addElement("23:07");
		ponto4.getHorarios().addElement("23:37");
		ponto4.getHorarios().addElement("00:07");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PREFEITURA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("05/12/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:00");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("11:00");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:00");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("13:30");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:00");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("17:30");
		ponto5.getHorarios().addElement("18:00");
		ponto5.getHorarios().addElement("18:30");
		ponto5.getHorarios().addElement("19:00");
		ponto5.getHorarios().addElement("19:30");
		ponto5.getHorarios().addElement("20:00");
		ponto5.getHorarios().addElement("20:30");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("21:30");
		ponto5.getHorarios().addElement("22:00");
		ponto5.getHorarios().addElement("22:30");
		ponto5.getHorarios().addElement("23:00");
		ponto5.getHorarios().addElement("23:30");
		return onibus;
		}
	}
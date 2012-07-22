
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB79 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / ROÇA GRANDE");
		onibus.setCodigo("B79");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("FABRICA FATO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("17:16");
		ponto0.getHorarios().addElement("19:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ROCA GRANDE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:10");
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("05:42");
		ponto1.getHorarios().addElement("05:54");
		ponto1.getHorarios().addElement("06:06");
		ponto1.getHorarios().addElement("06:18");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:42");
		ponto1.getHorarios().addElement("06:54");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:19");
		ponto1.getHorarios().addElement("07:32");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("07:58");
		ponto1.getHorarios().addElement("08:11");
		ponto1.getHorarios().addElement("08:23");
		ponto1.getHorarios().addElement("08:47");
		ponto1.getHorarios().addElement("09:20");
		ponto1.getHorarios().addElement("09:53");
		ponto1.getHorarios().addElement("10:26");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:33");
		ponto1.getHorarios().addElement("12:06");
		ponto1.getHorarios().addElement("12:40");
		ponto1.getHorarios().addElement("13:13");
		ponto1.getHorarios().addElement("13:46");
		ponto1.getHorarios().addElement("14:20");
		ponto1.getHorarios().addElement("14:53");
		ponto1.getHorarios().addElement("15:26");
		ponto1.getHorarios().addElement("15:56");
		ponto1.getHorarios().addElement("16:12");
		ponto1.getHorarios().addElement("16:28");
		ponto1.getHorarios().addElement("16:46");
		ponto1.getHorarios().addElement("17:04");
		ponto1.getHorarios().addElement("17:21");
		ponto1.getHorarios().addElement("17:36");
		ponto1.getHorarios().addElement("17:51");
		ponto1.getHorarios().addElement("18:06");
		ponto1.getHorarios().addElement("18:21");
		ponto1.getHorarios().addElement("18:36");
		ponto1.getHorarios().addElement("19:17");
		ponto1.getHorarios().addElement("20:02");
		ponto1.getHorarios().addElement("20:47");
		ponto1.getHorarios().addElement("21:32");
		ponto1.getHorarios().addElement("22:17");
		ponto1.getHorarios().addElement("23:02");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL GUADALUPE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:50");
		ponto2.getHorarios().addElement("06:10");
		ponto2.getHorarios().addElement("06:32");
		ponto2.getHorarios().addElement("06:44");
		ponto2.getHorarios().addElement("06:56");
		ponto2.getHorarios().addElement("07:08");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("07:32");
		ponto2.getHorarios().addElement("07:44");
		ponto2.getHorarios().addElement("07:57");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:22");
		ponto2.getHorarios().addElement("08:35");
		ponto2.getHorarios().addElement("08:48");
		ponto2.getHorarios().addElement("09:01");
		ponto2.getHorarios().addElement("09:13");
		ponto2.getHorarios().addElement("09:37");
		ponto2.getHorarios().addElement("10:10");
		ponto2.getHorarios().addElement("10:43");
		ponto2.getHorarios().addElement("11:16");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("12:23");
		ponto2.getHorarios().addElement("12:56");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:03");
		ponto2.getHorarios().addElement("14:36");
		ponto2.getHorarios().addElement("15:10");
		ponto2.getHorarios().addElement("15:43");
		ponto2.getHorarios().addElement("16:16");
		ponto2.getHorarios().addElement("16:31");
		ponto2.getHorarios().addElement("16:46");
		ponto2.getHorarios().addElement("17:01");
		ponto2.getHorarios().addElement("17:16");
		ponto2.getHorarios().addElement("17:31");
		ponto2.getHorarios().addElement("17:46");
		ponto2.getHorarios().addElement("18:01");
		ponto2.getHorarios().addElement("18:16");
		ponto2.getHorarios().addElement("18:31");
		ponto2.getHorarios().addElement("18:46");
		ponto2.getHorarios().addElement("19:01");
		ponto2.getHorarios().addElement("19:16");
		ponto2.getHorarios().addElement("19:39");
		ponto2.getHorarios().addElement("20:02");
		ponto2.getHorarios().addElement("20:47");
		ponto2.getHorarios().addElement("21:32");
		ponto2.getHorarios().addElement("22:17");
		ponto2.getHorarios().addElement("23:02");
		ponto2.getHorarios().addElement("23:47");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("FABRICA FATO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:10");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ROCA GRANDE");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:10");
		ponto4.getHorarios().addElement("05:30");
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("06:03");
		ponto4.getHorarios().addElement("06:30");
		ponto4.getHorarios().addElement("06:50");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("07:50");
		ponto4.getHorarios().addElement("08:10");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("09:15");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("10:45");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("12:15");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("13:45");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("15:15");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("16:45");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("18:15");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("20:00");
		ponto4.getHorarios().addElement("21:45");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:50");
		ponto5.getHorarios().addElement("06:10");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("06:50");
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("07:50");
		ponto5.getHorarios().addElement("08:10");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("08:50");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("10:45");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:15");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("13:45");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:15");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("16:45");
		ponto5.getHorarios().addElement("17:30");
		ponto5.getHorarios().addElement("18:15");
		ponto5.getHorarios().addElement("19:00");
		ponto5.getHorarios().addElement("19:45");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("22:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("FABRICA FATO");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("29/06/2008");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("11:15");
		ponto6.getHorarios().addElement("18:03");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("ROCA GRANDE");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("29/06/2008");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:15");
		ponto7.getHorarios().addElement("07:45");
		ponto7.getHorarios().addElement("09:15");
		ponto7.getHorarios().addElement("11:08");
		ponto7.getHorarios().addElement("12:45");
		ponto7.getHorarios().addElement("13:30");
		ponto7.getHorarios().addElement("14:15");
		ponto7.getHorarios().addElement("15:00");
		ponto7.getHorarios().addElement("15:45");
		ponto7.getHorarios().addElement("16:30");
		ponto7.getHorarios().addElement("17:15");
		ponto7.getHorarios().addElement("17:55");
		ponto7.getHorarios().addElement("18:45");
		ponto7.getHorarios().addElement("20:15");
		ponto7.getHorarios().addElement("21:45");
		ponto7.getHorarios().addElement("23:15");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL GUADALUPE");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("29/06/2008");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("07:00");
		ponto8.getHorarios().addElement("08:30");
		ponto8.getHorarios().addElement("10:00");
		ponto8.getHorarios().addElement("12:00");
		ponto8.getHorarios().addElement("13:30");
		ponto8.getHorarios().addElement("14:15");
		ponto8.getHorarios().addElement("15:00");
		ponto8.getHorarios().addElement("15:45");
		ponto8.getHorarios().addElement("16:30");
		ponto8.getHorarios().addElement("17:15");
		ponto8.getHorarios().addElement("18:00");
		ponto8.getHorarios().addElement("18:45");
		ponto8.getHorarios().addElement("19:30");
		ponto8.getHorarios().addElement("21:00");
		ponto8.getHorarios().addElement("22:30");
		ponto8.getHorarios().addElement("00:00");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusL11 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("R. BRANCO / TAMANDARÉ");
		onibus.setCodigo("L11");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("CAIC");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/10/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:32");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("06:12");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("09:08");
		ponto0.getHorarios().addElement("10:32");
		ponto0.getHorarios().addElement("11:50");
		ponto0.getHorarios().addElement("13:08");
		ponto0.getHorarios().addElement("14:26");
		ponto0.getHorarios().addElement("15:44");
		ponto0.getHorarios().addElement("16:57");
		ponto0.getHorarios().addElement("17:21");
		ponto0.getHorarios().addElement("17:33");
		ponto0.getHorarios().addElement("17:45");
		ponto0.getHorarios().addElement("17:57");
		ponto0.getHorarios().addElement("18:09");
		ponto0.getHorarios().addElement("18:21");
		ponto0.getHorarios().addElement("18:33");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("18:57");
		ponto0.getHorarios().addElement("19:09");
		ponto0.getHorarios().addElement("19:24");
		ponto0.getHorarios().addElement("20:48");
		ponto0.getHorarios().addElement("22:14");
		ponto0.getHorarios().addElement("23:38");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ITAPERUCU");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/10/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("04:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("MUELLER");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("03/10/2011");
		onibus.getPontos().addElement(ponto2);
		Ponto ponto3 = new Ponto();
		ponto3.setNome("SANTA TEREZINHA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("03/10/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:59");
		ponto3.getHorarios().addElement("07:17");
		ponto3.getHorarios().addElement("08:35");
		ponto3.getHorarios().addElement("09:53");
		ponto3.getHorarios().addElement("11:11");
		ponto3.getHorarios().addElement("12:29");
		ponto3.getHorarios().addElement("13:47");
		ponto3.getHorarios().addElement("15:05");
		ponto3.getHorarios().addElement("16:25");
		ponto3.getHorarios().addElement("17:42");
		ponto3.getHorarios().addElement("18:55");
		ponto3.getHorarios().addElement("20:11");
		ponto3.getHorarios().addElement("21:35");
		ponto3.getHorarios().addElement("23:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL TAMANDARE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("03/10/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:22");
		ponto4.getHorarios().addElement("05:32");
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("06:14");
		ponto4.getHorarios().addElement("06:25");
		ponto4.getHorarios().addElement("06:39");
		ponto4.getHorarios().addElement("06:52");
		ponto4.getHorarios().addElement("07:10");
		ponto4.getHorarios().addElement("07:40");
		ponto4.getHorarios().addElement("07:57");
		ponto4.getHorarios().addElement("08:32");
		ponto4.getHorarios().addElement("09:15");
		ponto4.getHorarios().addElement("09:48");
		ponto4.getHorarios().addElement("10:33");
		ponto4.getHorarios().addElement("11:12");
		ponto4.getHorarios().addElement("11:51");
		ponto4.getHorarios().addElement("12:30");
		ponto4.getHorarios().addElement("13:09");
		ponto4.getHorarios().addElement("13:48");
		ponto4.getHorarios().addElement("14:27");
		ponto4.getHorarios().addElement("15:06");
		ponto4.getHorarios().addElement("15:45");
		ponto4.getHorarios().addElement("16:15");
		ponto4.getHorarios().addElement("16:39");
		ponto4.getHorarios().addElement("16:51");
		ponto4.getHorarios().addElement("17:03");
		ponto4.getHorarios().addElement("17:06");
		ponto4.getHorarios().addElement("17:15");
		ponto4.getHorarios().addElement("17:27");
		ponto4.getHorarios().addElement("17:39");
		ponto4.getHorarios().addElement("17:51");
		ponto4.getHorarios().addElement("18:03");
		ponto4.getHorarios().addElement("18:15");
		ponto4.getHorarios().addElement("18:19");
		ponto4.getHorarios().addElement("18:27");
		ponto4.getHorarios().addElement("18:39");
		ponto4.getHorarios().addElement("18:51");
		ponto4.getHorarios().addElement("19:03");
		ponto4.getHorarios().addElement("19:15");
		ponto4.getHorarios().addElement("19:27");
		ponto4.getHorarios().addElement("19:32");
		ponto4.getHorarios().addElement("19:39");
		ponto4.getHorarios().addElement("19:51");
		ponto4.getHorarios().addElement("20:08");
		ponto4.getHorarios().addElement("20:53");
		ponto4.getHorarios().addElement("21:30");
		ponto4.getHorarios().addElement("22:30");
		ponto4.getHorarios().addElement("22:56");
		ponto4.getHorarios().addElement("23:40");
		ponto4.getHorarios().addElement("00:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERM.TAMANDARE/A07-CT.TAM-LAME");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("03/10/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:25");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("CAIC");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("20/09/2008");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:00");
		ponto6.getHorarios().addElement("05:40");
		ponto6.getHorarios().addElement("06:18");
		ponto6.getHorarios().addElement("06:58");
		ponto6.getHorarios().addElement("07:36");
		ponto6.getHorarios().addElement("08:16");
		ponto6.getHorarios().addElement("08:56");
		ponto6.getHorarios().addElement("09:36");
		ponto6.getHorarios().addElement("10:16");
		ponto6.getHorarios().addElement("10:56");
		ponto6.getHorarios().addElement("11:36");
		ponto6.getHorarios().addElement("12:16");
		ponto6.getHorarios().addElement("12:56");
		ponto6.getHorarios().addElement("13:36");
		ponto6.getHorarios().addElement("14:16");
		ponto6.getHorarios().addElement("14:56");
		ponto6.getHorarios().addElement("15:36");
		ponto6.getHorarios().addElement("16:16");
		ponto6.getHorarios().addElement("16:56");
		ponto6.getHorarios().addElement("17:36");
		ponto6.getHorarios().addElement("18:16");
		ponto6.getHorarios().addElement("18:56");
		ponto6.getHorarios().addElement("19:36");
		ponto6.getHorarios().addElement("20:56");
		ponto6.getHorarios().addElement("22:16");
		ponto6.getHorarios().addElement("23:40");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL TAMANDARE");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("20/09/2008");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("05:40");
		ponto7.getHorarios().addElement("06:18");
		ponto7.getHorarios().addElement("06:58");
		ponto7.getHorarios().addElement("07:36");
		ponto7.getHorarios().addElement("08:16");
		ponto7.getHorarios().addElement("08:56");
		ponto7.getHorarios().addElement("09:36");
		ponto7.getHorarios().addElement("10:16");
		ponto7.getHorarios().addElement("10:56");
		ponto7.getHorarios().addElement("11:36");
		ponto7.getHorarios().addElement("12:16");
		ponto7.getHorarios().addElement("12:56");
		ponto7.getHorarios().addElement("13:36");
		ponto7.getHorarios().addElement("14:16");
		ponto7.getHorarios().addElement("14:56");
		ponto7.getHorarios().addElement("15:36");
		ponto7.getHorarios().addElement("16:16");
		ponto7.getHorarios().addElement("16:56");
		ponto7.getHorarios().addElement("17:36");
		ponto7.getHorarios().addElement("18:16");
		ponto7.getHorarios().addElement("18:56");
		ponto7.getHorarios().addElement("19:36");
		ponto7.getHorarios().addElement("20:16");
		ponto7.getHorarios().addElement("21:36");
		ponto7.getHorarios().addElement("23:10");
		ponto7.getHorarios().addElement("00:25");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("CAIC");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("06/07/2008");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("05:30");
		ponto8.getHorarios().addElement("06:50");
		ponto8.getHorarios().addElement("08:10");
		ponto8.getHorarios().addElement("09:30");
		ponto8.getHorarios().addElement("10:50");
		ponto8.getHorarios().addElement("12:10");
		ponto8.getHorarios().addElement("13:30");
		ponto8.getHorarios().addElement("14:50");
		ponto8.getHorarios().addElement("16:10");
		ponto8.getHorarios().addElement("16:50");
		ponto8.getHorarios().addElement("17:30");
		ponto8.getHorarios().addElement("18:10");
		ponto8.getHorarios().addElement("18:50");
		ponto8.getHorarios().addElement("19:30");
		ponto8.getHorarios().addElement("20:50");
		ponto8.getHorarios().addElement("22:15");
		ponto8.getHorarios().addElement("23:40");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL TAMANDARE");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("06/07/2008");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("06:10");
		ponto9.getHorarios().addElement("07:30");
		ponto9.getHorarios().addElement("08:50");
		ponto9.getHorarios().addElement("10:10");
		ponto9.getHorarios().addElement("11:30");
		ponto9.getHorarios().addElement("12:50");
		ponto9.getHorarios().addElement("14:10");
		ponto9.getHorarios().addElement("15:30");
		ponto9.getHorarios().addElement("16:10");
		ponto9.getHorarios().addElement("16:50");
		ponto9.getHorarios().addElement("17:30");
		ponto9.getHorarios().addElement("18:10");
		ponto9.getHorarios().addElement("18:50");
		ponto9.getHorarios().addElement("19:30");
		ponto9.getHorarios().addElement("20:10");
		ponto9.getHorarios().addElement("21:30");
		ponto9.getHorarios().addElement("23:10");
		ponto9.getHorarios().addElement("00:20");
		return onibus;
		}
	}
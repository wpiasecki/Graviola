
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus616 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("616 - PORTAO / STA. BERNADETHE - L. VERDE");
		onibus.setCodigo("616");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERM.PORTAO-SENT.STA.BERNADETH");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("27/06/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("07:01");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("08:29");
		ponto0.getHorarios().addElement("09:13");
		ponto0.getHorarios().addElement("09:57");
		ponto0.getHorarios().addElement("10:41");
		ponto0.getHorarios().addElement("11:25");
		ponto0.getHorarios().addElement("12:09");
		ponto0.getHorarios().addElement("12:53");
		ponto0.getHorarios().addElement("13:37");
		ponto0.getHorarios().addElement("14:21");
		ponto0.getHorarios().addElement("15:05");
		ponto0.getHorarios().addElement("15:49");
		ponto0.getHorarios().addElement("16:33");
		ponto0.getHorarios().addElement("17:17");
		ponto0.getHorarios().addElement("18:01");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("19:29");
		ponto0.getHorarios().addElement("20:15");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:45");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:15");
		ponto0.getHorarios().addElement("23:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("EST.TUBO STA.BERNADETHE-L.VERD");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("27/06/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:55");
		ponto1.getHorarios().addElement("06:41");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("08:09");
		ponto1.getHorarios().addElement("08:53");
		ponto1.getHorarios().addElement("09:37");
		ponto1.getHorarios().addElement("10:21");
		ponto1.getHorarios().addElement("11:05");
		ponto1.getHorarios().addElement("11:49");
		ponto1.getHorarios().addElement("12:33");
		ponto1.getHorarios().addElement("13:17");
		ponto1.getHorarios().addElement("14:01");
		ponto1.getHorarios().addElement("14:45");
		ponto1.getHorarios().addElement("15:29");
		ponto1.getHorarios().addElement("16:13");
		ponto1.getHorarios().addElement("16:57");
		ponto1.getHorarios().addElement("17:41");
		ponto1.getHorarios().addElement("18:25");
		ponto1.getHorarios().addElement("19:09");
		ponto1.getHorarios().addElement("19:53");
		ponto1.getHorarios().addElement("20:40");
		ponto1.getHorarios().addElement("21:23");
		ponto1.getHorarios().addElement("22:10");
		ponto1.getHorarios().addElement("22:55");
		ponto1.getHorarios().addElement("23:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PORTAO-LINHA VERDE(SENT.FANNY)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("27/06/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:33");
		ponto2.getHorarios().addElement("06:17");
		ponto2.getHorarios().addElement("07:01");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:29");
		ponto2.getHorarios().addElement("09:13");
		ponto2.getHorarios().addElement("09:57");
		ponto2.getHorarios().addElement("10:41");
		ponto2.getHorarios().addElement("11:25");
		ponto2.getHorarios().addElement("12:09");
		ponto2.getHorarios().addElement("12:53");
		ponto2.getHorarios().addElement("13:37");
		ponto2.getHorarios().addElement("14:21");
		ponto2.getHorarios().addElement("15:05");
		ponto2.getHorarios().addElement("15:49");
		ponto2.getHorarios().addElement("16:33");
		ponto2.getHorarios().addElement("17:17");
		ponto2.getHorarios().addElement("18:01");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:29");
		ponto2.getHorarios().addElement("20:13");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("21:45");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:15");
		ponto2.getHorarios().addElement("23:55");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESTACAO TUBO FANNY-LINHA VERDE");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("27/06/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:55");
		ponto3.getHorarios().addElement("06:39");
		ponto3.getHorarios().addElement("07:23");
		ponto3.getHorarios().addElement("08:07");
		ponto3.getHorarios().addElement("08:51");
		ponto3.getHorarios().addElement("09:35");
		ponto3.getHorarios().addElement("10:19");
		ponto3.getHorarios().addElement("11:03");
		ponto3.getHorarios().addElement("11:47");
		ponto3.getHorarios().addElement("12:31");
		ponto3.getHorarios().addElement("13:15");
		ponto3.getHorarios().addElement("13:59");
		ponto3.getHorarios().addElement("14:43");
		ponto3.getHorarios().addElement("15:27");
		ponto3.getHorarios().addElement("16:11");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("17:39");
		ponto3.getHorarios().addElement("18:23");
		ponto3.getHorarios().addElement("19:07");
		ponto3.getHorarios().addElement("19:51");
		ponto3.getHorarios().addElement("20:35");
		ponto3.getHorarios().addElement("21:22");
		ponto3.getHorarios().addElement("22:07");
		ponto3.getHorarios().addElement("22:52");
		ponto3.getHorarios().addElement("23:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERM.PORTAO-SENT.STA.BERNADETH");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("22/01/2011");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:27");
		ponto4.getHorarios().addElement("07:47");
		ponto4.getHorarios().addElement("09:07");
		ponto4.getHorarios().addElement("10:27");
		ponto4.getHorarios().addElement("11:47");
		ponto4.getHorarios().addElement("13:07");
		ponto4.getHorarios().addElement("14:27");
		ponto4.getHorarios().addElement("15:47");
		ponto4.getHorarios().addElement("17:07");
		ponto4.getHorarios().addElement("18:27");
		ponto4.getHorarios().addElement("19:47");
		ponto4.getHorarios().addElement("21:07");
		ponto4.getHorarios().addElement("22:29");
		ponto4.getHorarios().addElement("23:53");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("EST.TUBO STA.BERNADETHE-L.VERD");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("22/01/2011");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:47");
		ponto5.getHorarios().addElement("08:07");
		ponto5.getHorarios().addElement("09:27");
		ponto5.getHorarios().addElement("10:47");
		ponto5.getHorarios().addElement("12:07");
		ponto5.getHorarios().addElement("13:27");
		ponto5.getHorarios().addElement("14:47");
		ponto5.getHorarios().addElement("16:07");
		ponto5.getHorarios().addElement("17:27");
		ponto5.getHorarios().addElement("18:47");
		ponto5.getHorarios().addElement("20:07");
		ponto5.getHorarios().addElement("21:27");
		ponto5.getHorarios().addElement("22:51");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PORTAO-LINHA VERDE(SENT.FANNY)");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("22/01/2011");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:45");
		ponto6.getHorarios().addElement("07:05");
		ponto6.getHorarios().addElement("08:25");
		ponto6.getHorarios().addElement("09:45");
		ponto6.getHorarios().addElement("11:05");
		ponto6.getHorarios().addElement("12:25");
		ponto6.getHorarios().addElement("13:45");
		ponto6.getHorarios().addElement("15:05");
		ponto6.getHorarios().addElement("16:25");
		ponto6.getHorarios().addElement("17:45");
		ponto6.getHorarios().addElement("19:05");
		ponto6.getHorarios().addElement("20:25");
		ponto6.getHorarios().addElement("21:45");
		ponto6.getHorarios().addElement("23:15");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("ESTACAO TUBO FANNY-LINHA VERDE");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("22/01/2011");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:07");
		ponto7.getHorarios().addElement("07:27");
		ponto7.getHorarios().addElement("08:47");
		ponto7.getHorarios().addElement("10:07");
		ponto7.getHorarios().addElement("11:27");
		ponto7.getHorarios().addElement("12:47");
		ponto7.getHorarios().addElement("14:07");
		ponto7.getHorarios().addElement("15:27");
		ponto7.getHorarios().addElement("16:47");
		ponto7.getHorarios().addElement("18:07");
		ponto7.getHorarios().addElement("19:27");
		ponto7.getHorarios().addElement("20:47");
		ponto7.getHorarios().addElement("22:07");
		ponto7.getHorarios().addElement("23:33");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERM.PORTAO-SENT.STA.BERNADETH");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("23/01/2011");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("06:27");
		ponto8.getHorarios().addElement("07:47");
		ponto8.getHorarios().addElement("09:07");
		ponto8.getHorarios().addElement("10:27");
		ponto8.getHorarios().addElement("11:47");
		ponto8.getHorarios().addElement("13:07");
		ponto8.getHorarios().addElement("14:27");
		ponto8.getHorarios().addElement("15:47");
		ponto8.getHorarios().addElement("17:07");
		ponto8.getHorarios().addElement("18:27");
		ponto8.getHorarios().addElement("19:47");
		ponto8.getHorarios().addElement("21:07");
		ponto8.getHorarios().addElement("22:29");
		ponto8.getHorarios().addElement("23:53");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("EST.TUBO STA.BERNADETHE-L.VERD");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("23/01/2011");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("06:47");
		ponto9.getHorarios().addElement("08:07");
		ponto9.getHorarios().addElement("09:27");
		ponto9.getHorarios().addElement("10:47");
		ponto9.getHorarios().addElement("12:07");
		ponto9.getHorarios().addElement("13:27");
		ponto9.getHorarios().addElement("14:47");
		ponto9.getHorarios().addElement("16:07");
		ponto9.getHorarios().addElement("17:27");
		ponto9.getHorarios().addElement("18:47");
		ponto9.getHorarios().addElement("20:07");
		ponto9.getHorarios().addElement("21:27");
		ponto9.getHorarios().addElement("22:51");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("PORTAO-LINHA VERDE(SENT.FANNY)");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("23/01/2011");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("05:45");
		ponto10.getHorarios().addElement("07:05");
		ponto10.getHorarios().addElement("08:25");
		ponto10.getHorarios().addElement("09:45");
		ponto10.getHorarios().addElement("11:05");
		ponto10.getHorarios().addElement("12:25");
		ponto10.getHorarios().addElement("13:45");
		ponto10.getHorarios().addElement("15:05");
		ponto10.getHorarios().addElement("16:25");
		ponto10.getHorarios().addElement("17:45");
		ponto10.getHorarios().addElement("19:05");
		ponto10.getHorarios().addElement("20:25");
		ponto10.getHorarios().addElement("21:45");
		ponto10.getHorarios().addElement("23:15");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("ESTACAO TUBO FANNY-LINHA VERDE");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("23/01/2011");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("06:07");
		ponto11.getHorarios().addElement("07:27");
		ponto11.getHorarios().addElement("08:47");
		ponto11.getHorarios().addElement("10:07");
		ponto11.getHorarios().addElement("11:27");
		ponto11.getHorarios().addElement("12:47");
		ponto11.getHorarios().addElement("14:07");
		ponto11.getHorarios().addElement("15:27");
		ponto11.getHorarios().addElement("16:47");
		ponto11.getHorarios().addElement("18:07");
		ponto11.getHorarios().addElement("19:27");
		ponto11.getHorarios().addElement("20:47");
		ponto11.getHorarios().addElement("22:07");
		ponto11.getHorarios().addElement("23:33");
		return onibus;
		}
	}
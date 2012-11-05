
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusD21 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("D21 - JD. STA. MÔNICA");
		onibus.setCodigo("D21");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("JARDIM SANTA MONICA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:25");
		ponto0.getHorarios().addElement("08:55");
		ponto0.getHorarios().addElement("09:25");
		ponto0.getHorarios().addElement("09:55");
		ponto0.getHorarios().addElement("10:25");
		ponto0.getHorarios().addElement("10:55");
		ponto0.getHorarios().addElement("11:25");
		ponto0.getHorarios().addElement("11:55");
		ponto0.getHorarios().addElement("12:25");
		ponto0.getHorarios().addElement("12:55");
		ponto0.getHorarios().addElement("13:25");
		ponto0.getHorarios().addElement("13:55");
		ponto0.getHorarios().addElement("14:25");
		ponto0.getHorarios().addElement("14:55");
		ponto0.getHorarios().addElement("15:25");
		ponto0.getHorarios().addElement("15:55");
		ponto0.getHorarios().addElement("16:25");
		ponto0.getHorarios().addElement("16:55");
		ponto0.getHorarios().addElement("17:20");
		ponto0.getHorarios().addElement("17:37");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:15");
		ponto0.getHorarios().addElement("18:27");
		ponto0.getHorarios().addElement("18:40");
		ponto0.getHorarios().addElement("18:53");
		ponto0.getHorarios().addElement("19:05");
		ponto0.getHorarios().addElement("19:17");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:55");
		ponto0.getHorarios().addElement("20:20");
		ponto0.getHorarios().addElement("20:50");
		ponto0.getHorarios().addElement("21:20");
		ponto0.getHorarios().addElement("21:50");
		ponto0.getHorarios().addElement("22:20");
		ponto0.getHorarios().addElement("23:18");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHAIS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:25");
		ponto1.getHorarios().addElement("05:55");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:45");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("07:35");
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("08:55");
		ponto1.getHorarios().addElement("09:25");
		ponto1.getHorarios().addElement("09:55");
		ponto1.getHorarios().addElement("10:25");
		ponto1.getHorarios().addElement("10:55");
		ponto1.getHorarios().addElement("11:25");
		ponto1.getHorarios().addElement("11:55");
		ponto1.getHorarios().addElement("12:25");
		ponto1.getHorarios().addElement("12:55");
		ponto1.getHorarios().addElement("13:25");
		ponto1.getHorarios().addElement("13:55");
		ponto1.getHorarios().addElement("14:25");
		ponto1.getHorarios().addElement("14:55");
		ponto1.getHorarios().addElement("15:25");
		ponto1.getHorarios().addElement("15:55");
		ponto1.getHorarios().addElement("16:25");
		ponto1.getHorarios().addElement("16:55");
		ponto1.getHorarios().addElement("17:12");
		ponto1.getHorarios().addElement("17:25");
		ponto1.getHorarios().addElement("17:38");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:02");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:28");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("18:52");
		ponto1.getHorarios().addElement("19:05");
		ponto1.getHorarios().addElement("19:18");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("19:42");
		ponto1.getHorarios().addElement("19:55");
		ponto1.getHorarios().addElement("20:20");
		ponto1.getHorarios().addElement("20:50");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("21:50");
		ponto1.getHorarios().addElement("22:25");
		ponto1.getHorarios().addElement("22:53");
		ponto1.getHorarios().addElement("23:42");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("JARDIM SANTA MONICA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("30/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:17");
		ponto2.getHorarios().addElement("05:34");
		ponto2.getHorarios().addElement("05:50");
		ponto2.getHorarios().addElement("06:07");
		ponto2.getHorarios().addElement("06:24");
		ponto2.getHorarios().addElement("06:40");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:14");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("07:47");
		ponto2.getHorarios().addElement("08:04");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("08:40");
		ponto2.getHorarios().addElement("09:20");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("11:20");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("14:20");
		ponto2.getHorarios().addElement("15:20");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("17:20");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("19:20");
		ponto2.getHorarios().addElement("20:20");
		ponto2.getHorarios().addElement("21:20");
		ponto2.getHorarios().addElement("22:20");
		ponto2.getHorarios().addElement("23:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHAIS");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("30/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:25");
		ponto3.getHorarios().addElement("05:42");
		ponto3.getHorarios().addElement("05:59");
		ponto3.getHorarios().addElement("06:15");
		ponto3.getHorarios().addElement("06:32");
		ponto3.getHorarios().addElement("06:49");
		ponto3.getHorarios().addElement("07:05");
		ponto3.getHorarios().addElement("07:22");
		ponto3.getHorarios().addElement("07:39");
		ponto3.getHorarios().addElement("07:55");
		ponto3.getHorarios().addElement("08:15");
		ponto3.getHorarios().addElement("08:50");
		ponto3.getHorarios().addElement("09:50");
		ponto3.getHorarios().addElement("10:50");
		ponto3.getHorarios().addElement("11:50");
		ponto3.getHorarios().addElement("12:50");
		ponto3.getHorarios().addElement("13:50");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("15:50");
		ponto3.getHorarios().addElement("16:50");
		ponto3.getHorarios().addElement("17:50");
		ponto3.getHorarios().addElement("18:50");
		ponto3.getHorarios().addElement("19:50");
		ponto3.getHorarios().addElement("20:50");
		ponto3.getHorarios().addElement("21:50");
		ponto3.getHorarios().addElement("22:50");
		ponto3.getHorarios().addElement("23:50");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("JARDIM SANTA MONICA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("11/06/2006");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("09:00");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("11:00");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("19:00");
		ponto4.getHorarios().addElement("20:00");
		ponto4.getHorarios().addElement("21:00");
		ponto4.getHorarios().addElement("22:00");
		ponto4.getHorarios().addElement("23:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL PINHAIS");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("11/06/2006");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("13:30");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:30");
		ponto5.getHorarios().addElement("18:30");
		ponto5.getHorarios().addElement("19:30");
		ponto5.getHorarios().addElement("20:30");
		ponto5.getHorarios().addElement("21:30");
		ponto5.getHorarios().addElement("22:30");
		ponto5.getHorarios().addElement("23:30");
		return onibus;
		}
	}
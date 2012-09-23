
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus681 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("681 - DALAGASSA");
		onibus.setCodigo("681");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL PINHEIRINHO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:53");
		ponto0.getHorarios().addElement("06:15");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:35");
		ponto0.getHorarios().addElement("11:25");
		ponto0.getHorarios().addElement("12:15");
		ponto0.getHorarios().addElement("13:05");
		ponto0.getHorarios().addElement("14:00");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("17:01");
		ponto0.getHorarios().addElement("18:02");
		ponto0.getHorarios().addElement("18:52");
		ponto0.getHorarios().addElement("19:52");
		ponto0.getHorarios().addElement("20:42");
		ponto0.getHorarios().addElement("21:27");
		ponto0.getHorarios().addElement("22:12");
		ponto0.getHorarios().addElement("22:52");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("VILA DALAGASSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("05:50");
		ponto1.getHorarios().addElement("06:14");
		ponto1.getHorarios().addElement("06:38");
		ponto1.getHorarios().addElement("07:02");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:35");
		ponto1.getHorarios().addElement("09:20");
		ponto1.getHorarios().addElement("10:10");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:50");
		ponto1.getHorarios().addElement("12:40");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:30");
		ponto1.getHorarios().addElement("18:32");
		ponto1.getHorarios().addElement("19:22");
		ponto1.getHorarios().addElement("20:17");
		ponto1.getHorarios().addElement("21:02");
		ponto1.getHorarios().addElement("21:47");
		ponto1.getHorarios().addElement("22:32");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL PINHEIRINHO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("20/08/2011");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("07:50");
		ponto2.getHorarios().addElement("08:35");
		ponto2.getHorarios().addElement("09:25");
		ponto2.getHorarios().addElement("10:19");
		ponto2.getHorarios().addElement("11:19");
		ponto2.getHorarios().addElement("12:14");
		ponto2.getHorarios().addElement("13:14");
		ponto2.getHorarios().addElement("14:14");
		ponto2.getHorarios().addElement("15:14");
		ponto2.getHorarios().addElement("16:13");
		ponto2.getHorarios().addElement("17:08");
		ponto2.getHorarios().addElement("18:08");
		ponto2.getHorarios().addElement("19:08");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("VILA DALAGASSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("20/08/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:10");
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("09:50");
		ponto3.getHorarios().addElement("10:49");
		ponto3.getHorarios().addElement("11:49");
		ponto3.getHorarios().addElement("12:44");
		ponto3.getHorarios().addElement("13:44");
		ponto3.getHorarios().addElement("14:44");
		ponto3.getHorarios().addElement("15:44");
		ponto3.getHorarios().addElement("16:43");
		ponto3.getHorarios().addElement("17:38");
		ponto3.getHorarios().addElement("18:38");
		return onibus;
		}
	}
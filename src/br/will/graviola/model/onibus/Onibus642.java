
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus642 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("GANCHINHO");
		onibus.setCodigo("642");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO GANCHINHO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:40");
		ponto0.getHorarios().addElement("09:50");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("13:20");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("15:50");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("20:25");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:35");
		ponto0.getHorarios().addElement("22:10");
		ponto0.getHorarios().addElement("22:45");
		ponto0.getHorarios().addElement("23:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO (SAIDA)");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("08:05");
		ponto1.getHorarios().addElement("09:15");
		ponto1.getHorarios().addElement("10:25");
		ponto1.getHorarios().addElement("11:35");
		ponto1.getHorarios().addElement("12:45");
		ponto1.getHorarios().addElement("13:55");
		ponto1.getHorarios().addElement("15:10");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:30");
		ponto1.getHorarios().addElement("19:10");
		ponto1.getHorarios().addElement("19:50");
		ponto1.getHorarios().addElement("20:25");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("21:35");
		ponto1.getHorarios().addElement("22:10");
		ponto1.getHorarios().addElement("22:50");
		ponto1.getHorarios().addElement("23:15");
		ponto1.getHorarios().addElement("23:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO GANCHINHO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("02/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:40");
		ponto2.getHorarios().addElement("06:40");
		ponto2.getHorarios().addElement("07:40");
		ponto2.getHorarios().addElement("08:40");
		ponto2.getHorarios().addElement("09:50");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("12:10");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:40");
		ponto2.getHorarios().addElement("16:50");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("19:10");
		ponto2.getHorarios().addElement("20:20");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHEIRINHO (SAIDA)");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("02/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:10");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("09:15");
		ponto3.getHorarios().addElement("10:25");
		ponto3.getHorarios().addElement("11:35");
		ponto3.getHorarios().addElement("12:45");
		ponto3.getHorarios().addElement("13:55");
		ponto3.getHorarios().addElement("15:05");
		ponto3.getHorarios().addElement("16:15");
		ponto3.getHorarios().addElement("17:25");
		ponto3.getHorarios().addElement("18:35");
		ponto3.getHorarios().addElement("19:45");
		ponto3.getHorarios().addElement("20:55");
		ponto3.getHorarios().addElement("22:05");
		ponto3.getHorarios().addElement("23:15");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO GANCHINHO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:40");
		ponto4.getHorarios().addElement("06:40");
		ponto4.getHorarios().addElement("07:40");
		ponto4.getHorarios().addElement("08:40");
		ponto4.getHorarios().addElement("09:50");
		ponto4.getHorarios().addElement("11:00");
		ponto4.getHorarios().addElement("12:10");
		ponto4.getHorarios().addElement("13:20");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("15:40");
		ponto4.getHorarios().addElement("16:50");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("19:10");
		ponto4.getHorarios().addElement("20:20");
		ponto4.getHorarios().addElement("21:30");
		ponto4.getHorarios().addElement("22:40");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL PINHEIRINHO (SAIDA)");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("03/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:10");
		ponto5.getHorarios().addElement("07:10");
		ponto5.getHorarios().addElement("08:10");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("10:25");
		ponto5.getHorarios().addElement("11:35");
		ponto5.getHorarios().addElement("12:45");
		ponto5.getHorarios().addElement("13:55");
		ponto5.getHorarios().addElement("15:05");
		ponto5.getHorarios().addElement("16:15");
		ponto5.getHorarios().addElement("17:25");
		ponto5.getHorarios().addElement("18:35");
		ponto5.getHorarios().addElement("19:45");
		ponto5.getHorarios().addElement("20:55");
		ponto5.getHorarios().addElement("22:05");
		ponto5.getHorarios().addElement("23:15");
		return onibus;
		}
	}
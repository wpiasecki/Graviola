
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus361 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("AUGUSTO STRESSER");
		onibus.setCodigo("361");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO AUGUSTO STRESSER");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:20");
		ponto0.getHorarios().addElement("09:50");
		ponto0.getHorarios().addElement("10:20");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("11:20");
		ponto0.getHorarios().addElement("11:50");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:50");
		ponto0.getHorarios().addElement("13:20");
		ponto0.getHorarios().addElement("13:50");
		ponto0.getHorarios().addElement("14:20");
		ponto0.getHorarios().addElement("14:50");
		ponto0.getHorarios().addElement("15:20");
		ponto0.getHorarios().addElement("15:50");
		ponto0.getHorarios().addElement("16:20");
		ponto0.getHorarios().addElement("16:50");
		ponto0.getHorarios().addElement("17:20");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("23:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA SANTOS ANDRADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:20");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:20");
		ponto1.getHorarios().addElement("09:50");
		ponto1.getHorarios().addElement("10:20");
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("11:20");
		ponto1.getHorarios().addElement("11:50");
		ponto1.getHorarios().addElement("12:20");
		ponto1.getHorarios().addElement("12:50");
		ponto1.getHorarios().addElement("13:20");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("14:20");
		ponto1.getHorarios().addElement("14:50");
		ponto1.getHorarios().addElement("15:20");
		ponto1.getHorarios().addElement("15:50");
		ponto1.getHorarios().addElement("16:20");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:50");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:55");
		ponto1.getHorarios().addElement("20:25");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("22:30");
		ponto1.getHorarios().addElement("23:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO AUGUSTO STRESSER");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("10:00");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("23:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA SANTOS ANDRADE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:35");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("12:30");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("15:30");
		ponto3.getHorarios().addElement("16:35");
		ponto3.getHorarios().addElement("17:30");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("19:30");
		ponto3.getHorarios().addElement("20:30");
		ponto3.getHorarios().addElement("21:30");
		ponto3.getHorarios().addElement("22:30");
		ponto3.getHorarios().addElement("23:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO AUGUSTO STRESSER");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("21/11/2010");
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
		ponto5.setNome("PRACA SANTOS ANDRADE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("21/11/2010");
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
		ponto5.getHorarios().addElement("18:35");
		ponto5.getHorarios().addElement("19:30");
		ponto5.getHorarios().addElement("20:30");
		ponto5.getHorarios().addElement("21:30");
		ponto5.getHorarios().addElement("22:30");
		ponto5.getHorarios().addElement("23:30");
		return onibus;
		}
	}
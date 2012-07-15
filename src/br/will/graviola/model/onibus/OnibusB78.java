
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusB78 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / JD. SÃO GABRIEL");
		onibus.setCodigo("B78");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("JARDIM SAO GABRIEL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:10");
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:19");
		ponto0.getHorarios().addElement("06:29");
		ponto0.getHorarios().addElement("06:38");
		ponto0.getHorarios().addElement("06:48");
		ponto0.getHorarios().addElement("06:57");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:16");
		ponto0.getHorarios().addElement("07:26");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:20");
		ponto0.getHorarios().addElement("09:50");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("11:20");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:50");
		ponto0.getHorarios().addElement("13:50");
		ponto0.getHorarios().addElement("14:20");
		ponto0.getHorarios().addElement("15:20");
		ponto0.getHorarios().addElement("15:45");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("16:15");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("16:43");
		ponto0.getHorarios().addElement("16:51");
		ponto0.getHorarios().addElement("17:04");
		ponto0.getHorarios().addElement("17:17");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:43");
		ponto0.getHorarios().addElement("17:56");
		ponto0.getHorarios().addElement("18:09");
		ponto0.getHorarios().addElement("18:22");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("19:15");
		ponto0.getHorarios().addElement("19:45");
		ponto0.getHorarios().addElement("20:15");
		ponto0.getHorarios().addElement("20:45");
		ponto0.getHorarios().addElement("21:15");
		ponto0.getHorarios().addElement("21:45");
		ponto0.getHorarios().addElement("22:15");
		ponto0.getHorarios().addElement("22:45");
		ponto0.getHorarios().addElement("23:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:50");
		ponto1.getHorarios().addElement("06:10");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:38");
		ponto1.getHorarios().addElement("06:48");
		ponto1.getHorarios().addElement("06:57");
		ponto1.getHorarios().addElement("07:07");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("07:35");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("08:35");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:05");
		ponto1.getHorarios().addElement("09:35");
		ponto1.getHorarios().addElement("10:05");
		ponto1.getHorarios().addElement("10:35");
		ponto1.getHorarios().addElement("11:35");
		ponto1.getHorarios().addElement("12:05");
		ponto1.getHorarios().addElement("13:05");
		ponto1.getHorarios().addElement("13:35");
		ponto1.getHorarios().addElement("14:35");
		ponto1.getHorarios().addElement("15:00");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("16:25");
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("16:55");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:23");
		ponto1.getHorarios().addElement("17:36");
		ponto1.getHorarios().addElement("17:49");
		ponto1.getHorarios().addElement("18:02");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:28");
		ponto1.getHorarios().addElement("18:41");
		ponto1.getHorarios().addElement("18:54");
		ponto1.getHorarios().addElement("19:07");
		ponto1.getHorarios().addElement("19:25");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("20:30");
		ponto1.getHorarios().addElement("21:00");
		ponto1.getHorarios().addElement("21:30");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("22:30");
		ponto1.getHorarios().addElement("23:00");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("JARDIM SAO GABRIEL");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:10");
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("06:45");
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:50");
		ponto2.getHorarios().addElement("09:20");
		ponto2.getHorarios().addElement("09:50");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("10:50");
		ponto2.getHorarios().addElement("11:20");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("12:50");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("13:50");
		ponto2.getHorarios().addElement("14:20");
		ponto2.getHorarios().addElement("14:50");
		ponto2.getHorarios().addElement("15:20");
		ponto2.getHorarios().addElement("15:45");
		ponto2.getHorarios().addElement("16:15");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:10");
		ponto2.getHorarios().addElement("17:40");
		ponto2.getHorarios().addElement("18:10");
		ponto2.getHorarios().addElement("18:40");
		ponto2.getHorarios().addElement("19:15");
		ponto2.getHorarios().addElement("19:45");
		ponto2.getHorarios().addElement("20:15");
		ponto2.getHorarios().addElement("20:45");
		ponto2.getHorarios().addElement("21:15");
		ponto2.getHorarios().addElement("21:45");
		ponto2.getHorarios().addElement("22:15");
		ponto2.getHorarios().addElement("23:15");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/02/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:50");
		ponto3.getHorarios().addElement("06:10");
		ponto3.getHorarios().addElement("06:40");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("08:05");
		ponto3.getHorarios().addElement("08:35");
		ponto3.getHorarios().addElement("09:05");
		ponto3.getHorarios().addElement("09:35");
		ponto3.getHorarios().addElement("10:05");
		ponto3.getHorarios().addElement("10:35");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("11:35");
		ponto3.getHorarios().addElement("12:05");
		ponto3.getHorarios().addElement("12:35");
		ponto3.getHorarios().addElement("13:05");
		ponto3.getHorarios().addElement("13:35");
		ponto3.getHorarios().addElement("14:05");
		ponto3.getHorarios().addElement("14:35");
		ponto3.getHorarios().addElement("15:00");
		ponto3.getHorarios().addElement("15:35");
		ponto3.getHorarios().addElement("16:00");
		ponto3.getHorarios().addElement("16:25");
		ponto3.getHorarios().addElement("16:55");
		ponto3.getHorarios().addElement("17:25");
		ponto3.getHorarios().addElement("17:55");
		ponto3.getHorarios().addElement("18:25");
		ponto3.getHorarios().addElement("18:55");
		ponto3.getHorarios().addElement("19:25");
		ponto3.getHorarios().addElement("20:00");
		ponto3.getHorarios().addElement("20:30");
		ponto3.getHorarios().addElement("21:00");
		ponto3.getHorarios().addElement("21:30");
		ponto3.getHorarios().addElement("22:00");
		ponto3.getHorarios().addElement("22:30");
		ponto3.getHorarios().addElement("23:00");
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("JARDIM SAO GABRIEL");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("29/06/2008");
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
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("29/06/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("08:00");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("11:00");
		ponto5.getHorarios().addElement("12:00");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("15:00");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("18:00");
		ponto5.getHorarios().addElement("19:00");
		ponto5.getHorarios().addElement("20:00");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("22:00");
		ponto5.getHorarios().addElement("23:00");
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}
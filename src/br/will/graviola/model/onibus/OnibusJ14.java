
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusJ14 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("TIMBOTUVA (EST. NOVA)");
		onibus.setCodigo("J14");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO TIMBUTUVA (EST.NOVA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/09/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("06:12");
		ponto0.getHorarios().addElement("06:28");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:32");
		ponto0.getHorarios().addElement("07:48");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("08:52");
		ponto0.getHorarios().addElement("09:13");
		ponto0.getHorarios().addElement("09:58");
		ponto0.getHorarios().addElement("10:43");
		ponto0.getHorarios().addElement("11:28");
		ponto0.getHorarios().addElement("12:13");
		ponto0.getHorarios().addElement("12:58");
		ponto0.getHorarios().addElement("13:43");
		ponto0.getHorarios().addElement("14:28");
		ponto0.getHorarios().addElement("15:13");
		ponto0.getHorarios().addElement("15:58");
		ponto0.getHorarios().addElement("16:43");
		ponto0.getHorarios().addElement("17:06");
		ponto0.getHorarios().addElement("17:28");
		ponto0.getHorarios().addElement("18:13");
		ponto0.getHorarios().addElement("18:36");
		ponto0.getHorarios().addElement("18:58");
		ponto0.getHorarios().addElement("19:43");
		ponto0.getHorarios().addElement("20:28");
		ponto0.getHorarios().addElement("21:13");
		ponto0.getHorarios().addElement("21:58");
		ponto0.getHorarios().addElement("22:43");
		ponto0.getHorarios().addElement("23:28");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO COMPRIDO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/09/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:52");
		ponto1.getHorarios().addElement("07:08");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("08:12");
		ponto1.getHorarios().addElement("08:28");
		ponto1.getHorarios().addElement("09:13");
		ponto1.getHorarios().addElement("09:58");
		ponto1.getHorarios().addElement("10:43");
		ponto1.getHorarios().addElement("11:28");
		ponto1.getHorarios().addElement("12:13");
		ponto1.getHorarios().addElement("12:58");
		ponto1.getHorarios().addElement("13:43");
		ponto1.getHorarios().addElement("14:28");
		ponto1.getHorarios().addElement("15:13");
		ponto1.getHorarios().addElement("15:58");
		ponto1.getHorarios().addElement("16:21");
		ponto1.getHorarios().addElement("16:43");
		ponto1.getHorarios().addElement("17:28");
		ponto1.getHorarios().addElement("17:51");
		ponto1.getHorarios().addElement("18:13");
		ponto1.getHorarios().addElement("18:58");
		ponto1.getHorarios().addElement("19:21");
		ponto1.getHorarios().addElement("19:43");
		ponto1.getHorarios().addElement("20:28");
		ponto1.getHorarios().addElement("21:13");
		ponto1.getHorarios().addElement("21:58");
		ponto1.getHorarios().addElement("22:43");
		ponto1.getHorarios().addElement("23:28");
		ponto1.getHorarios().addElement("00:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TIMBOTUVA (VIA VL.D.PEDRO II)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("09/09/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:56");
		ponto2.getHorarios().addElement("06:44");
		ponto2.getHorarios().addElement("07:16");
		ponto2.getHorarios().addElement("08:04");
		ponto2.getHorarios().addElement("08:36");
		ponto2.getHorarios().addElement("16:21");
		ponto2.getHorarios().addElement("17:51");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERM.C.COMPRIDO(VL.D.PEDRO II)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("09/09/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:36");
		ponto3.getHorarios().addElement("07:24");
		ponto3.getHorarios().addElement("07:56");
		ponto3.getHorarios().addElement("17:06");
		ponto3.getHorarios().addElement("18:36");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO TIMBUTUVA (EST.NOVA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("11/09/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:40");
		ponto4.getHorarios().addElement("06:20");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("07:40");
		ponto4.getHorarios().addElement("08:20");
		ponto4.getHorarios().addElement("09:50");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("12:50");
		ponto4.getHorarios().addElement("14:20");
		ponto4.getHorarios().addElement("15:50");
		ponto4.getHorarios().addElement("17:20");
		ponto4.getHorarios().addElement("18:50");
		ponto4.getHorarios().addElement("20:20");
		ponto4.getHorarios().addElement("21:50");
		ponto4.getHorarios().addElement("23:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CAMPO COMPRIDO");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("11/09/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:45");
		ponto5.getHorarios().addElement("06:20");
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("07:40");
		ponto5.getHorarios().addElement("09:05");
		ponto5.getHorarios().addElement("10:35");
		ponto5.getHorarios().addElement("12:05");
		ponto5.getHorarios().addElement("13:35");
		ponto5.getHorarios().addElement("15:05");
		ponto5.getHorarios().addElement("16:35");
		ponto5.getHorarios().addElement("18:05");
		ponto5.getHorarios().addElement("19:35");
		ponto5.getHorarios().addElement("21:05");
		ponto5.getHorarios().addElement("22:35");
		ponto5.getHorarios().addElement("00:00");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO TIMBUTUVA (EST.NOVA)");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("12/09/2010");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:00");
		ponto6.getHorarios().addElement("07:30");
		ponto6.getHorarios().addElement("09:00");
		ponto6.getHorarios().addElement("10:30");
		ponto6.getHorarios().addElement("12:00");
		ponto6.getHorarios().addElement("13:30");
		ponto6.getHorarios().addElement("15:00");
		ponto6.getHorarios().addElement("16:30");
		ponto6.getHorarios().addElement("18:00");
		ponto6.getHorarios().addElement("19:30");
		ponto6.getHorarios().addElement("21:00");
		ponto6.getHorarios().addElement("22:30");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL CAMPO COMPRIDO");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("12/09/2010");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:45");
		ponto7.getHorarios().addElement("08:15");
		ponto7.getHorarios().addElement("09:45");
		ponto7.getHorarios().addElement("11:15");
		ponto7.getHorarios().addElement("12:45");
		ponto7.getHorarios().addElement("14:15");
		ponto7.getHorarios().addElement("15:45");
		ponto7.getHorarios().addElement("17:15");
		ponto7.getHorarios().addElement("18:45");
		ponto7.getHorarios().addElement("20:15");
		ponto7.getHorarios().addElement("21:45");
		ponto7.getHorarios().addElement("23:15");
		return onibus;
		}
	}
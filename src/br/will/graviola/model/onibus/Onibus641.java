
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus641 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("641 - LUIZ NICHELE");
		onibus.setCodigo("641");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO LUIZ NICHELE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("27/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:00");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("09:35");
		ponto0.getHorarios().addElement("10:53");
		ponto0.getHorarios().addElement("12:05");
		ponto0.getHorarios().addElement("13:15");
		ponto0.getHorarios().addElement("14:33");
		ponto0.getHorarios().addElement("15:48");
		ponto0.getHorarios().addElement("17:05");
		ponto0.getHorarios().addElement("18:15");
		ponto0.getHorarios().addElement("19:25");
		ponto0.getHorarios().addElement("20:35");
		ponto0.getHorarios().addElement("21:55");
		ponto0.getHorarios().addElement("23:08");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("27/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:30");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("10:08");
		ponto1.getHorarios().addElement("11:35");
		ponto1.getHorarios().addElement("12:40");
		ponto1.getHorarios().addElement("13:55");
		ponto1.getHorarios().addElement("15:11");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:40");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("22:45");
		ponto1.getHorarios().addElement("23:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO LUIZ NICHELE");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("15/09/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:25");
		ponto2.getHorarios().addElement("07:35");
		ponto2.getHorarios().addElement("08:45");
		ponto2.getHorarios().addElement("11:54");
		ponto2.getHorarios().addElement("13:04");
		ponto2.getHorarios().addElement("14:14");
		ponto2.getHorarios().addElement("17:48");
		ponto2.getHorarios().addElement("18:58");
		ponto2.getHorarios().addElement("20:08");
		ponto2.getHorarios().addElement("21:18");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHEIRINHO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("15/09/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("11:19");
		ponto3.getHorarios().addElement("12:29");
		ponto3.getHorarios().addElement("13:39");
		ponto3.getHorarios().addElement("17:13");
		ponto3.getHorarios().addElement("18:23");
		ponto3.getHorarios().addElement("19:33");
		ponto3.getHorarios().addElement("20:43");
		ponto3.getHorarios().addElement("21:53");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO LUIZ NICHELE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("16/09/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:25");
		ponto4.getHorarios().addElement("07:35");
		ponto4.getHorarios().addElement("08:45");
		ponto4.getHorarios().addElement("10:50");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("17:35");
		ponto4.getHorarios().addElement("18:45");
		ponto4.getHorarios().addElement("19:55");
		ponto4.getHorarios().addElement("21:05");
		ponto4.getHorarios().addElement("22:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL PINHEIRINHO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("16/09/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:00");
		ponto5.getHorarios().addElement("08:10");
		ponto5.getHorarios().addElement("11:25");
		ponto5.getHorarios().addElement("12:35");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("18:10");
		ponto5.getHorarios().addElement("19:20");
		ponto5.getHorarios().addElement("20:30");
		ponto5.getHorarios().addElement("21:40");
		ponto5.getHorarios().addElement("22:50");
		return onibus;
		}
	}
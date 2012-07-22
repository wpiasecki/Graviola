
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus666 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("NOVO MUNDO");
		onibus.setCodigo("666");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO NOVO MUNDO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/06/2008");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:34");
		ponto0.getHorarios().addElement("07:08");
		ponto0.getHorarios().addElement("07:42");
		ponto0.getHorarios().addElement("08:16");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:24");
		ponto0.getHorarios().addElement("09:58");
		ponto0.getHorarios().addElement("10:32");
		ponto0.getHorarios().addElement("11:06");
		ponto0.getHorarios().addElement("11:40");
		ponto0.getHorarios().addElement("12:14");
		ponto0.getHorarios().addElement("12:48");
		ponto0.getHorarios().addElement("13:22");
		ponto0.getHorarios().addElement("13:56");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("15:04");
		ponto0.getHorarios().addElement("15:38");
		ponto0.getHorarios().addElement("16:12");
		ponto0.getHorarios().addElement("16:46");
		ponto0.getHorarios().addElement("17:20");
		ponto0.getHorarios().addElement("17:54");
		ponto0.getHorarios().addElement("18:28");
		ponto0.getHorarios().addElement("19:02");
		ponto0.getHorarios().addElement("19:36");
		ponto0.getHorarios().addElement("20:10");
		ponto0.getHorarios().addElement("20:44");
		ponto0.getHorarios().addElement("21:18");
		ponto0.getHorarios().addElement("21:52");
		ponto0.getHorarios().addElement("22:26");
		ponto0.getHorarios().addElement("23:00");
		ponto0.getHorarios().addElement("23:34");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/06/2008");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("07:09");
		ponto1.getHorarios().addElement("07:43");
		ponto1.getHorarios().addElement("08:17");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:24");
		ponto1.getHorarios().addElement("09:58");
		ponto1.getHorarios().addElement("10:32");
		ponto1.getHorarios().addElement("11:06");
		ponto1.getHorarios().addElement("11:40");
		ponto1.getHorarios().addElement("12:14");
		ponto1.getHorarios().addElement("12:48");
		ponto1.getHorarios().addElement("13:22");
		ponto1.getHorarios().addElement("13:56");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:04");
		ponto1.getHorarios().addElement("15:38");
		ponto1.getHorarios().addElement("16:12");
		ponto1.getHorarios().addElement("16:46");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("17:53");
		ponto1.getHorarios().addElement("18:27");
		ponto1.getHorarios().addElement("19:01");
		ponto1.getHorarios().addElement("19:35");
		ponto1.getHorarios().addElement("20:10");
		ponto1.getHorarios().addElement("20:44");
		ponto1.getHorarios().addElement("21:18");
		ponto1.getHorarios().addElement("21:52");
		ponto1.getHorarios().addElement("22:26");
		ponto1.getHorarios().addElement("23:00");
		ponto1.getHorarios().addElement("23:32");
		ponto1.getHorarios().addElement("00:05");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO NOVO MUNDO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("14/06/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:05");
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
		ponto2.getHorarios().addElement("21:05");
		ponto2.getHorarios().addElement("22:15");
		ponto2.getHorarios().addElement("23:25");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/06/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:33");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:30");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("12:30");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("15:30");
		ponto3.getHorarios().addElement("16:30");
		ponto3.getHorarios().addElement("17:30");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("19:30");
		ponto3.getHorarios().addElement("20:30");
		ponto3.getHorarios().addElement("21:40");
		ponto3.getHorarios().addElement("22:50");
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO NOVO MUNDO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("15/06/2008");
		onibus.getPontos().addElement(ponto4);
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
		ponto4.getHorarios().addElement("21:05");
		ponto4.getHorarios().addElement("22:15");
		ponto4.getHorarios().addElement("23:25");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("15/06/2008");
		onibus.getPontos().addElement(ponto5);
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
		ponto5.getHorarios().addElement("21:40");
		ponto5.getHorarios().addElement("22:50");
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}
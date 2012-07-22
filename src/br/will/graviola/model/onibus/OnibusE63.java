
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusE63 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("PRADO VELHO / P. MORO");
		onibus.setCodigo("E63");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO PEDRO MORO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("25/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:55");
		ponto0.getHorarios().addElement("08:40");
		ponto0.getHorarios().addElement("10:10");
		ponto0.getHorarios().addElement("11:40");
		ponto0.getHorarios().addElement("13:10");
		ponto0.getHorarios().addElement("14:50");
		ponto0.getHorarios().addElement("16:25");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("18:05");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("19:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO SAO PEDRO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("25/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:25");
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("06:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("JOAO NEGRAO (PONTE PRETA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("25/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:15");
		ponto2.getHorarios().addElement("08:55");
		ponto2.getHorarios().addElement("09:25");
		ponto2.getHorarios().addElement("10:55");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("15:35");
		ponto2.getHorarios().addElement("17:15");
		ponto2.getHorarios().addElement("17:50");
		ponto2.getHorarios().addElement("18:35");
		ponto2.getHorarios().addElement("19:05");
		ponto2.getHorarios().addElement("19:25");
		ponto2.getHorarios().addElement("20:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("BAIRRO PEDRO MORO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:45");
		ponto3.getHorarios().addElement("07:15");
		ponto3.getHorarios().addElement("07:55");
		ponto3.getHorarios().addElement("08:40");
		ponto3.getHorarios().addElement("10:10");
		ponto3.getHorarios().addElement("11:40");
		ponto3.getHorarios().addElement("13:10");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("16:25");
		ponto3.getHorarios().addElement("17:00");
		ponto3.getHorarios().addElement("17:35");
		ponto3.getHorarios().addElement("18:05");
		ponto3.getHorarios().addElement("18:45");
		ponto3.getHorarios().addElement("19:55");
		ponto3.getHorarios().addElement("22:15");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO SAO PEDRO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:25");
		ponto4.getHorarios().addElement("05:45");
		ponto4.getHorarios().addElement("06:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("JOAO NEGRAO (PONTE PRETA)");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:05");
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:05");
		ponto5.getHorarios().addElement("07:45");
		ponto5.getHorarios().addElement("08:15");
		ponto5.getHorarios().addElement("08:55");
		ponto5.getHorarios().addElement("09:25");
		ponto5.getHorarios().addElement("10:55");
		ponto5.getHorarios().addElement("12:20");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("15:35");
		ponto5.getHorarios().addElement("17:15");
		ponto5.getHorarios().addElement("17:50");
		ponto5.getHorarios().addElement("18:35");
		ponto5.getHorarios().addElement("19:05");
		ponto5.getHorarios().addElement("19:25");
		ponto5.getHorarios().addElement("20:40");
		ponto5.getHorarios().addElement("22:55");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO PEDRO MORO");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("17/07/1999");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("07:30");
		ponto6.getHorarios().addElement("12:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("BAIRRO SAO PEDRO");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("17/07/1999");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:00");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("JOAO NEGRAO (PONTE PRETA)");
		ponto8.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto8.setValidoAPartirDe("17/07/1999");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("06:45");
		ponto8.getHorarios().addElement("08:15");
		ponto8.getHorarios().addElement("12:45");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusE65 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E65 - CTBA / XINGU");
		onibus.setCodigo("E65");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO XINGU");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("18/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("05:58");
		ponto0.getHorarios().addElement("06:16");
		ponto0.getHorarios().addElement("06:27");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("09:40");
		ponto0.getHorarios().addElement("11:10");
		ponto0.getHorarios().addElement("11:55");
		ponto0.getHorarios().addElement("12:46");
		ponto0.getHorarios().addElement("13:35");
		ponto0.getHorarios().addElement("14:23");
		ponto0.getHorarios().addElement("15:10");
		ponto0.getHorarios().addElement("15:57");
		ponto0.getHorarios().addElement("16:44");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:45");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("20:35");
		ponto0.getHorarios().addElement("22:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("18/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:43");
		ponto1.getHorarios().addElement("07:01");
		ponto1.getHorarios().addElement("07:17");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("08:25");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("09:05");
		ponto1.getHorarios().addElement("10:25");
		ponto1.getHorarios().addElement("11:58");
		ponto1.getHorarios().addElement("12:45");
		ponto1.getHorarios().addElement("13:35");
		ponto1.getHorarios().addElement("14:22");
		ponto1.getHorarios().addElement("15:10");
		ponto1.getHorarios().addElement("15:56");
		ponto1.getHorarios().addElement("16:46");
		ponto1.getHorarios().addElement("17:36");
		ponto1.getHorarios().addElement("18:05");
		ponto1.getHorarios().addElement("18:44");
		ponto1.getHorarios().addElement("19:15");
		ponto1.getHorarios().addElement("19:50");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("23:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO XINGU");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("17/06/2006");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:50");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("08:50");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("11:50");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("14:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("17/06/2006");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:35");
		ponto3.getHorarios().addElement("08:04");
		ponto3.getHorarios().addElement("09:33");
		ponto3.getHorarios().addElement("11:05");
		ponto3.getHorarios().addElement("12:34");
		ponto3.getHorarios().addElement("14:05");
		ponto3.getHorarios().addElement("15:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO XINGU");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("14/09/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:35");
		ponto4.getHorarios().addElement("11:45");
		ponto4.getHorarios().addElement("17:35");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL GUADALUPE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("14/09/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("08:15");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("18:20");
		return onibus;
		}
	}
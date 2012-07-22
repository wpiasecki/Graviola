
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus815 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("TUIUTI / BARIGUI");
		onibus.setCodigo("815");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("08:35");
		ponto0.getHorarios().addElement("09:05");
		ponto0.getHorarios().addElement("09:35");
		ponto0.getHorarios().addElement("10:05");
		ponto0.getHorarios().addElement("10:35");
		ponto0.getHorarios().addElement("11:05");
		ponto0.getHorarios().addElement("11:28");
		ponto0.getHorarios().addElement("11:51");
		ponto0.getHorarios().addElement("12:14");
		ponto0.getHorarios().addElement("12:37");
		ponto0.getHorarios().addElement("13:00");
		ponto0.getHorarios().addElement("13:23");
		ponto0.getHorarios().addElement("13:46");
		ponto0.getHorarios().addElement("14:09");
		ponto0.getHorarios().addElement("14:39");
		ponto0.getHorarios().addElement("15:09");
		ponto0.getHorarios().addElement("15:39");
		ponto0.getHorarios().addElement("16:09");
		ponto0.getHorarios().addElement("16:39");
		ponto0.getHorarios().addElement("17:09");
		ponto0.getHorarios().addElement("17:39");
		ponto0.getHorarios().addElement("18:02");
		ponto0.getHorarios().addElement("18:25");
		ponto0.getHorarios().addElement("18:48");
		ponto0.getHorarios().addElement("19:11");
		ponto0.getHorarios().addElement("19:36");
		ponto0.getHorarios().addElement("19:57");
		ponto0.getHorarios().addElement("20:27");
		ponto0.getHorarios().addElement("20:57");
		ponto0.getHorarios().addElement("21:27");
		ponto0.getHorarios().addElement("21:57");
		ponto0.getHorarios().addElement("22:18");
		ponto0.getHorarios().addElement("22:39");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TUIUTI BARIGUI");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("20:12");
		ponto1.getHorarios().addElement("20:42");
		ponto1.getHorarios().addElement("21:12");
		ponto1.getHorarios().addElement("21:42");
		ponto1.getHorarios().addElement("22:05");
		ponto1.getHorarios().addElement("22:26");
		ponto1.getHorarios().addElement("22:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("11/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:15");
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("07:45");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:15");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("08:45");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("10:00");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:30");
		ponto2.getHorarios().addElement("19:00");
		return onibus;
		}
	}
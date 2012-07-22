
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus829 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("UNIV.POSITIVO");
		onibus.setCodigo("829");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAMPO COMPRIDO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:40");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:30");
		ponto0.getHorarios().addElement("09:00");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("10:00");
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:20");
		ponto0.getHorarios().addElement("11:40");
		ponto0.getHorarios().addElement("12:00");
		ponto0.getHorarios().addElement("12:20");
		ponto0.getHorarios().addElement("12:40");
		ponto0.getHorarios().addElement("13:00");
		ponto0.getHorarios().addElement("13:30");
		ponto0.getHorarios().addElement("14:00");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("15:00");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("20:30");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:28");
		ponto0.getHorarios().addElement("22:45");
		ponto0.getHorarios().addElement("23:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO COMPRIDO");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("30/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("07:58");
		ponto1.getHorarios().addElement("08:14");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("08:46");
		ponto1.getHorarios().addElement("09:02");
		ponto1.getHorarios().addElement("09:20");
		ponto1.getHorarios().addElement("09:40");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("11:20");
		ponto1.getHorarios().addElement("11:40");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("12:20");
		ponto1.getHorarios().addElement("12:40");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("13:30");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:00");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:00");
		ponto1.getHorarios().addElement("17:30");
		ponto1.getHorarios().addElement("18:05");
		return onibus;
		}
	}
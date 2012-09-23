
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusR71 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("R71 - CTBA / CONTENDA");
		onibus.setCodigo("R71");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ALAMEDA DR. MURICY");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("27/08/2007");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("08:05");
		ponto0.getHorarios().addElement("10:00");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("19:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("CONTENDA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("27/08/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:40");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("09:30");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("13:00");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:30");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("17:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ALAMEDA DR. MURICY");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("07/12/2002");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("18:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("CONTENDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("07/12/2002");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:45");
		ponto3.getHorarios().addElement("10:00");
		ponto3.getHorarios().addElement("17:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ALAMEDA DR. MURICY");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("01/12/2002");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("19:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("CONTENDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("01/12/2002");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("18:00");
		return onibus;
		}
	}
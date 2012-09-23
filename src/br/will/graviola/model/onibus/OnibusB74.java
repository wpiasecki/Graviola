
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB74 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B74 - CTBA / JD. CÉSAR AUGUSTO");
		onibus.setCodigo("B74");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("JARDIM CESAR AUGUSTO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("26/03/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("08:20");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("12:30");
		ponto0.getHorarios().addElement("15:35");
		ponto0.getHorarios().addElement("17:05");
		ponto0.getHorarios().addElement("18:42");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("26/03/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:15");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("09:05");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("16:17");
		ponto1.getHorarios().addElement("17:52");
		ponto1.getHorarios().addElement("19:27");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("JARDIM CESAR AUGUSTO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:45");
		ponto2.getHorarios().addElement("07:20");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:55");
		ponto2.getHorarios().addElement("15:25");
		ponto2.getHorarios().addElement("16:55");
		ponto2.getHorarios().addElement("18:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("25/07/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:25");
		ponto3.getHorarios().addElement("07:55");
		ponto3.getHorarios().addElement("13:10");
		ponto3.getHorarios().addElement("14:40");
		ponto3.getHorarios().addElement("16:10");
		ponto3.getHorarios().addElement("17:40");
		ponto3.getHorarios().addElement("18:50");
		return onibus;
		}
	}
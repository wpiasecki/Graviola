
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusI21 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("I21 - AGUDOS DO SUL");
		onibus.setCodigo("I21");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("AGUDOS DO SUL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("12:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("FAZENDA RIO GRANDE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("19:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("AGUDOS DO SUL");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("16/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("09:50");
		ponto2.getHorarios().addElement("18:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("FAZENDA RIO GRANDE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("16/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("19:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("AGUDOS DO SUL");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("17/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("18:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("FAZENDA RIO GRANDE");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("17/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("19:00");
		return onibus;
		}
	}
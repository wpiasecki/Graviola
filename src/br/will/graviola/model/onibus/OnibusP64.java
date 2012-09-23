
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusP64 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("P64 - CTBA / CERNE");
		onibus.setCodigo("P64");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO BATEIAS");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("30/09/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("18:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO CERNE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("30/09/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("FERNANDO MOREIRA (CHEGADA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("30/09/2011");
		onibus.getPontos().addElement(ponto2);
		Ponto ponto3 = new Ponto();
		ponto3.setNome("FERNANDO MOREIRA (SAIDA)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("30/09/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("17:30");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO CERNE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("09/03/2003");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:45");
		ponto4.getHorarios().addElement("10:30");
		ponto4.getHorarios().addElement("13:45");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("20:40");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("FERNANDO MOREIRA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("09/03/2003");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:35");
		ponto5.getHorarios().addElement("09:15");
		ponto5.getHorarios().addElement("12:00");
		ponto5.getHorarios().addElement("15:50");
		ponto5.getHorarios().addElement("19:30");
		return onibus;
		}
	}
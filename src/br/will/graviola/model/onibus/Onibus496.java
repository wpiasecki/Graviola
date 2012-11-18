
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus496 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("496 - E. E. UBERABA");
		onibus.setCodigo("496");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA 29 DE MARCO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("16:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("GARAGEM");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITES CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("13:15");
		ponto2.getHorarios().addElement("17:15");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITES SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("11:40");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("17:45");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:00");
		return onibus;
		}
	}
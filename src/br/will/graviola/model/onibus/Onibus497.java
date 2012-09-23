
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus497 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("497 - E. E. HELENA ANTIPOFF 2");
		onibus.setCodigo("497");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("12:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA HELENA ANTIPOFF");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("11:10");
		ponto1.getHorarios().addElement("13:40");
		ponto1.getHorarios().addElement("16:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA RENASCER PRADO VELHO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("12/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("10:50");
		ponto2.getHorarios().addElement("17:15");
		return onibus;
		}
	}
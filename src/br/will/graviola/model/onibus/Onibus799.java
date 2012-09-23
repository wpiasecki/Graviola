
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus799 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("799 - E. E. ALI BARK 1");
		onibus.setCodigo("799");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("12:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA ALI BARK");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("17:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("GARAGEM");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto2);
		return onibus;
		}
	}
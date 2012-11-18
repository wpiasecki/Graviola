
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus995 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("995 - E. E. LUCY REQUIAO 1");
		onibus.setCodigo("995");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("GARAGEM");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA LUCY REQUIAO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("11:10");
		ponto1.getHorarios().addElement("17:00");
		return onibus;
		}
	}
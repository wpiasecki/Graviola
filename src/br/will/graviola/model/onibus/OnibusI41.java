
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusI41 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("Q. BARRAS / BOCAIÚVA");
		onibus.setCodigo("I41");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BOCAIUVA DO SUL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/02/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL QUATRO BARRAS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/02/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("12:00");
		return onibus;
		}
	}
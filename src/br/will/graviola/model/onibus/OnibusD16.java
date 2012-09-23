
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusD16 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("D16 - PRESÍDIO");
		onibus.setCodigo("D16");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRESIDIO PIRAQUARA");
		ponto0.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto0.setValidoAPartirDe("02/04/2005");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("14:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PIRAQUARA");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("02/04/2005");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("14:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRESIDIO PIRAQUARA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto2.setValidoAPartirDe("03/04/2005");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("14:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PIRAQUARA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto3.setValidoAPartirDe("03/04/2005");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("14:00");
		return onibus;
		}
	}
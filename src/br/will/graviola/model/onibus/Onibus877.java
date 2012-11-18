
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus877 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("877 - TIRADENTES / TUIUTI  BARIGUI");
		onibus.setCodigo("877");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO TUIUTI BARIGUI");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("18:31");
		ponto0.getHorarios().addElement("18:56");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA TIRADENTES");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("18:35");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("10/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:07");
		return onibus;
		}
	}
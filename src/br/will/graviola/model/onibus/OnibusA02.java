//
//	package br.will.graviola.model.onibus;
//	
//	import br.will.graviola.model.*;
//	
//	/**
//	 * Código gerado automaticamente
//	 * 
//	 * @author will
//	 */
//	public class OnibusA02 {
//		public static Onibus create() {
//		Onibus onibus = new Onibus();
//		onibus.setNome("A02 - TAMANDARÉ");
//		onibus.setCodigo("A02");
//		Ponto ponto0 = new Ponto();
//		ponto0.setNome("ESTACAO TUBO PREFEITURA");
//		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
//		ponto0.setValidoAPartirDe("13/02/2012");
//		onibus.getPontos().addElement(ponto0);
//		ponto0.getHorarios().addElement("17:40");
//		ponto0.getHorarios().addElement("18:00");
//		ponto0.getHorarios().addElement("18:25");
//		ponto0.getHorarios().addElement("18:45");
//		Ponto ponto1 = new Ponto();
//		ponto1.setNome("TERMINAL CACHOEIRA");
//		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
//		ponto1.setValidoAPartirDe("13/02/2012");
//		onibus.getPontos().addElement(ponto1);
//		ponto1.getHorarios().addElement("18:05");
//		ponto1.getHorarios().addElement("18:25");
//		return onibus;
//		}
//	}
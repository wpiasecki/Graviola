
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusC01 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("C01 - PINHAIS/C.IMBUIA");
		onibus.setCodigo("C01");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO TUBO AUTODROMO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:28");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("07:02");
		ponto0.getHorarios().addElement("07:19");
		ponto0.getHorarios().addElement("07:38");
		ponto0.getHorarios().addElement("07:56");
		ponto0.getHorarios().addElement("08:14");
		ponto0.getHorarios().addElement("08:34");
		ponto0.getHorarios().addElement("08:51");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto1);
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusX16 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("X16 - PUC / RODOFERROVIARIA");
		onibus.setCodigo("X16");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO RODOFERROVIARIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESTACAO TUBO PUC");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("22:10");
		ponto1.getHorarios().addElement("22:35");
		ponto1.getHorarios().addElement("22:55");
		return onibus;
		}
	}
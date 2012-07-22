
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusX14 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("REFORÇO HAUER");
		onibus.setCodigo("X14");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL HAUER");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/02/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PONTO RUA SALGADO FILHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:35");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("08:05");
		return onibus;
		}
	}
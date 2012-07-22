
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus831 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("FAZENDINHA / C.RASO");
		onibus.setCodigo("831");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO RASO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("30/01/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:02");
		ponto0.getHorarios().addElement("06:32");
		ponto0.getHorarios().addElement("07:01");
		ponto0.getHorarios().addElement("07:29");
		ponto0.getHorarios().addElement("07:58");
		ponto0.getHorarios().addElement("17:31");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:29");
		ponto0.getHorarios().addElement("18:57");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL FAZENDINHA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("30/01/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:47");
		ponto1.getHorarios().addElement("06:17");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("07:14");
		ponto1.getHorarios().addElement("07:44");
		ponto1.getHorarios().addElement("17:16");
		ponto1.getHorarios().addElement("17:46");
		ponto1.getHorarios().addElement("18:14");
		ponto1.getHorarios().addElement("18:42");
		ponto1.getHorarios().addElement("19:11");
		return onibus;
		}
	}
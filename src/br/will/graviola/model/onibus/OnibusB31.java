
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB31 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B31 - DIRETO CABRAL");
		onibus.setCodigo("B31");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CABRAL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL MARACANA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:14");
		ponto1.getHorarios().addElement("06:21");
		ponto1.getHorarios().addElement("06:27");
		ponto1.getHorarios().addElement("06:34");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("06:53");
		ponto1.getHorarios().addElement("06:59");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:12");
		ponto1.getHorarios().addElement("07:18");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("07:31");
		ponto1.getHorarios().addElement("07:38");
		ponto1.getHorarios().addElement("07:44");
		return onibus;
		}
	}
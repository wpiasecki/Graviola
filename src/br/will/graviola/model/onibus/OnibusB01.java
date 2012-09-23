
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB01 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("B01 - CTBA / MARACANÃ");
		onibus.setCodigo("B01");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("20/08/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL MARACANA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("20/08/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:56");
		ponto1.getHorarios().addElement("06:15");
		ponto1.getHorarios().addElement("06:34");
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("07:34");
		ponto1.getHorarios().addElement("08:06");
		ponto1.getHorarios().addElement("08:25");
		return onibus;
		}
	}
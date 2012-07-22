
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus219 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("REFORÇO COLINA");
		onibus.setCodigo("219");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO COLINA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:11");
		ponto0.getHorarios().addElement("07:33");
		ponto0.getHorarios().addElement("07:56");
		ponto0.getHorarios().addElement("16:45");
		ponto0.getHorarios().addElement("17:15");
		ponto0.getHorarios().addElement("17:45");
		ponto0.getHorarios().addElement("18:15");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CABRAL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:18");
		ponto1.getHorarios().addElement("07:41");
		ponto1.getHorarios().addElement("08:04");
		ponto1.getHorarios().addElement("17:03");
		ponto1.getHorarios().addElement("17:33");
		ponto1.getHorarios().addElement("18:03");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus776 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CARMELA DUTRA");
		onibus.setCodigo("776");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO CARMELA DUTRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("02/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:41");
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("08:22");
		ponto0.getHorarios().addElement("08:42");
		ponto0.getHorarios().addElement("17:45");
		ponto0.getHorarios().addElement("18:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("02/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:16");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("08:17");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("19:35");
		return onibus;
		}
	}
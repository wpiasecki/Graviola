
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusA22 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("TANGUÁ / TAMANDARÉ");
		onibus.setCodigo("A22");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO TANGUA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("05/01/2004");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("08:30");
		ponto0.getHorarios().addElement("11:50");
		ponto0.getHorarios().addElement("13:10");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("18:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL TAMANDARE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("05/01/2004");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:50");
		ponto1.getHorarios().addElement("12:35");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("19:30");
		return onibus;
		}
	}
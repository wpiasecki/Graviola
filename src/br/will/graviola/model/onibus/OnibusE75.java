
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusE75 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / JD. CRISTAL");
		onibus.setCodigo("E75");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/11/2005");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO JD.CRISTAL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/11/2005");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:30");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusO76 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA/Q.BARRAS(RAPIDO)");
		onibus.setCodigo("O76");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("10/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("16:40");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("19:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("T.Q.BARRAS(VIA MENINO DEUS)");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("10/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("17:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.Q.BARRAS(VIA JD.PARANA)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("10/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:55");
		return onibus;
		}
	}
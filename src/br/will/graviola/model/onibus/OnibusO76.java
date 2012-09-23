
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
		onibus.setNome("O76 - CTBA/Q.BARRAS(RAPIDO)");
		onibus.setCodigo("O76");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("T.Q.BARRAS(VIA MENINO DEUS)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("17/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("17:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("GUADALUPE (VIA MENINO DEUS)");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("17/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("19:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("GUADALUPE(VIA MARIA JOSE)");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("17/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("17:55");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("T.Q.BARRAS (VIA MARIA JOSE)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("17/09/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:57");
		return onibus;
		}
	}
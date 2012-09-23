
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus679 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("679 - MAD. TATUQUARA");
		onibus.setCodigo("679");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL PINHEIRINHO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("01:30");
		ponto0.getHorarios().addElement("03:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO TATUQUARA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("02:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TATUQUARA - VIA GAR. REDENTOR");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("04/06/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("03:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHEIRINHO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("09/06/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:30");
		ponto3.getHorarios().addElement("03:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO TATUQUARA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("09/06/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("02:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TATUQUARA - VIA GAR. REDENTOR");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("09/06/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("03:30");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL PINHEIRINHO");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("10/06/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:30");
		ponto6.getHorarios().addElement("03:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("BAIRRO TATUQUARA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("10/06/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("02:15");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TATUQUARA - VIA GAR. REDENTOR");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("10/06/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("03:30");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus608 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("608 - MAD. PINHEIRINHO");
		onibus.setCodigo("608");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA RUI BARBOSA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("00:35");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("00:05");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("00:35");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHEIRINHO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("20/11/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("00:05");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("21/11/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:35");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL PINHEIRINHO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("21/11/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("00:05");
		return onibus;
		}
	}
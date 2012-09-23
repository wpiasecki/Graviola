
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus802 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("802 - MAD. CAMPO COMPRIDO");
		onibus.setCodigo("802");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA RUI BARBOSA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/08/2004");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("00:35");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO COMPRIDO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/08/2004");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("14/08/2004");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("00:25");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAMPO COMPRIDO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("14/08/2004");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("15/08/2004");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:19");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CAMPO COMPRIDO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("15/08/2004");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("23:51");
		return onibus;
		}
	}
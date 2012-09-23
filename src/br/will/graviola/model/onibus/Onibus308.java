
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus308 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("308 - MAD. CENTENÁRIO / RUI BARBOSA");
		onibus.setCodigo("308");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA RUI BARBOSA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("24/09/2007");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("00:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CENTENARIO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("24/09/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("31/07/2004");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:30");
		ponto2.getHorarios().addElement("00:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CENTENARIO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("31/07/2004");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("30/10/2005");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:40");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CENTENARIO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("30/10/2005");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}
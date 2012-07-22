
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus489 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. PETRÓPOLIS / SOLITUDE");
		onibus.setCodigo("489");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO SOLITUDE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/08/2009");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/08/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:10");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA / CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("03/08/2009");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:55");
		ponto2.getHorarios().addElement("02:50");
		ponto2.getHorarios().addElement("03:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA / SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("03/08/2009");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:05");
		ponto3.getHorarios().addElement("02:00");
		ponto3.getHorarios().addElement("03:00");
		ponto3.getHorarios().addElement("04:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO SOLITUDE");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto4);
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("05:10");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PRACA RUI BARBOSA / CHEGADA");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:55");
		ponto6.getHorarios().addElement("02:50");
		ponto6.getHorarios().addElement("03:50");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRACA RUI BARBOSA / SAIDA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("01/08/2009");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("01:05");
		ponto7.getHorarios().addElement("02:00");
		ponto7.getHorarios().addElement("03:00");
		ponto7.getHorarios().addElement("04:00");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("BAIRRO SOLITUDE");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto8);
		Ponto ponto9 = new Ponto();
		ponto9.setNome("PRACA RUI BARBOSA");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("05:10");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("PRACA RUI BARBOSA / CHEGADA");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("01:55");
		ponto10.getHorarios().addElement("02:50");
		ponto10.getHorarios().addElement("03:50");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("PRACA RUI BARBOSA / SAIDA");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("02/08/2009");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("01:05");
		ponto11.getHorarios().addElement("02:00");
		ponto11.getHorarios().addElement("03:00");
		ponto11.getHorarios().addElement("04:00");
		return onibus;
		}
	}
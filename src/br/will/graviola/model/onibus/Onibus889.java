
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus889 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("889 - MAD. SÃO BRÁZ");
		onibus.setCodigo("889");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ANT. ESCORSIN ESQ.TOALDO TULIO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA CHEGADA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("00:55");
		ponto1.getHorarios().addElement("01:50");
		ponto1.getHorarios().addElement("02:50");
		ponto1.getHorarios().addElement("03:50");
		ponto1.getHorarios().addElement("04:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA SAIDA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:08");
		ponto2.getHorarios().addElement("02:00");
		ponto2.getHorarios().addElement("03:00");
		ponto2.getHorarios().addElement("04:00");
		ponto2.getHorarios().addElement("05:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ANT. ESCORSIN ESQ.TOALDO TULIO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto3);
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA CHEGADA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:55");
		ponto4.getHorarios().addElement("01:50");
		ponto4.getHorarios().addElement("02:50");
		ponto4.getHorarios().addElement("03:50");
		ponto4.getHorarios().addElement("04:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA SAIDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:08");
		ponto5.getHorarios().addElement("02:00");
		ponto5.getHorarios().addElement("03:00");
		ponto5.getHorarios().addElement("04:00");
		ponto5.getHorarios().addElement("05:00");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("ANT. ESCORSIN ESQ.TOALDO TULIO");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto6);
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRACA RUI BARBOSA CHEGADA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("00:55");
		ponto7.getHorarios().addElement("01:50");
		ponto7.getHorarios().addElement("02:50");
		ponto7.getHorarios().addElement("03:50");
		ponto7.getHorarios().addElement("04:50");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("PRACA RUI BARBOSA SAIDA");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("01:08");
		ponto8.getHorarios().addElement("02:00");
		ponto8.getHorarios().addElement("03:00");
		ponto8.getHorarios().addElement("04:00");
		ponto8.getHorarios().addElement("05:00");
		return onibus;
		}
	}
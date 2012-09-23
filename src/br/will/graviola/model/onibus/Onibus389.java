
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus389 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("389 - MAD. TARUMÃ / AUGUSTA");
		onibus.setCodigo("389");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("CARLOS GOMES/CHEGADA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("00:50");
		ponto0.getHorarios().addElement("02:55");
		ponto0.getHorarios().addElement("04:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("CARLOS GOMES/TARUMA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:10");
		ponto1.getHorarios().addElement("03:00");
		ponto1.getHorarios().addElement("04:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA ZACARIAS/AUGUSTA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:55");
		ponto2.getHorarios().addElement("03:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA ZACARIAS/CHEGADA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("14/05/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:50");
		ponto3.getHorarios().addElement("03:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("CARLOS GOMES/CHEGADA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:50");
		ponto4.getHorarios().addElement("02:55");
		ponto4.getHorarios().addElement("04:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("CARLOS GOMES/TARUMA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:10");
		ponto5.getHorarios().addElement("03:00");
		ponto5.getHorarios().addElement("04:25");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PRACA ZACARIAS/AUGUSTA");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:55");
		ponto6.getHorarios().addElement("03:40");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRACA ZACARIAS/CHEGADA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("12/05/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("01:50");
		ponto7.getHorarios().addElement("03:35");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("CARLOS GOMES/CHEGADA");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("00:50");
		ponto8.getHorarios().addElement("02:55");
		ponto8.getHorarios().addElement("04:20");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("CARLOS GOMES/TARUMA");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("01:10");
		ponto9.getHorarios().addElement("03:00");
		ponto9.getHorarios().addElement("04:25");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("PRACA ZACARIAS/AUGUSTA");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("01:55");
		ponto10.getHorarios().addElement("03:40");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("PRACA ZACARIAS/CHEGADA");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("13/05/2012");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("01:50");
		ponto11.getHorarios().addElement("03:35");
		return onibus;
		}
	}
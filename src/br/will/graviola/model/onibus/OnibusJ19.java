
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusJ19 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. FERRARIA");
		onibus.setCodigo("J19");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO FERRARIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("25/07/1997");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("02:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("T.CAMPO COMPRIDO/CHEGADA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("25/07/1997");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:25");
		ponto1.getHorarios().addElement("02:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.CAMPO COMPRIDO/SAIDA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("25/07/1997");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:35");
		ponto2.getHorarios().addElement("02:35");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("BAIRRO FERRARIA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("26/07/1997");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("02:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("T.CAMPO COMPRIDO/CHEGADA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("26/07/1997");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("01:25");
		ponto4.getHorarios().addElement("02:25");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("T.CAMPO COMPRIDO/SAIDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("26/07/1997");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:35");
		ponto5.getHorarios().addElement("02:35");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO FERRARIA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("27/07/1997");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("02:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("T.CAMPO COMPRIDO/CHEGADA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("27/07/1997");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("01:25");
		ponto7.getHorarios().addElement("02:25");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("T.CAMPO COMPRIDO/SAIDA");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("27/07/1997");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("01:35");
		ponto8.getHorarios().addElement("02:35");
		return onibus;
		}
	}
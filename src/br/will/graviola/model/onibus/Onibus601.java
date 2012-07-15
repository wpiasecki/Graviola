
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus601 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CIC / TIRADENTES");
		onibus.setCodigo("601");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO TUBO TIRADENTES");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CIC");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:44");
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("07:21");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESTACAO TUBO NESTOR DE CASTRO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:45");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:15");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESTACAO TUBO TIRADENTES");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL CIC");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:44");
		ponto4.getHorarios().addElement("07:05");
		ponto4.getHorarios().addElement("07:21");
		ponto4.getHorarios().addElement("17:20");
		ponto4.getHorarios().addElement("17:40");
		return onibus;
		}
	}
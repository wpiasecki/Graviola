
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusX18 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("ESPECIAL PAUL GARFUNKEL");
		onibus.setCodigo("X18");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CIC");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("07/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("18:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("RUA PAUL GARFUNKEL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("07/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("16:45");
		ponto1.getHorarios().addElement("17:15");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CIC");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:35");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHEIRINHO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:55");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("RUA PAUL GARFUNKEL");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:20");
		ponto4.getHorarios().addElement("16:45");
		ponto4.getHorarios().addElement("17:15");
		ponto4.getHorarios().addElement("17:45");
		ponto4.getHorarios().addElement("18:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("VITORIA REGIA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:32");
		return onibus;
		}
	}
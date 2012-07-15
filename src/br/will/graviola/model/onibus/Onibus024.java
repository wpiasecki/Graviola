
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus024 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("C. RASO / CAMP. SIQUEIRA");
		onibus.setCodigo("024");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:27");
		ponto0.getHorarios().addElement("07:54");
		ponto0.getHorarios().addElement("08:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO RASO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:27");
		ponto1.getHorarios().addElement("07:54");
		ponto1.getHorarios().addElement("08:20");
		return onibus;
		}
	}
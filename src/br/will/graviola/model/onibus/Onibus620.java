
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus620 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("STA. CRUZ");
		onibus.setCodigo("620");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO RASO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:35");
		ponto0.getHorarios().addElement("18:02");
		ponto0.getHorarios().addElement("18:18");
		ponto0.getHorarios().addElement("18:28");
		ponto0.getHorarios().addElement("18:35");
		ponto0.getHorarios().addElement("18:43");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("18:58");
		ponto0.getHorarios().addElement("19:13");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("22:06");
		ponto0.getHorarios().addElement("22:18");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("22:43");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("R. SEN.ACCIOLY FILHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("17:18");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:02");
		ponto1.getHorarios().addElement("18:12");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("FACULDADE SANTA CRUZ");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("16/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("18:27");
		ponto2.getHorarios().addElement("18:35");
		ponto2.getHorarios().addElement("18:43");
		ponto2.getHorarios().addElement("18:50");
		ponto2.getHorarios().addElement("19:06");
		ponto2.getHorarios().addElement("19:21");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:12");
		ponto2.getHorarios().addElement("22:24");
		ponto2.getHorarios().addElement("22:37");
		ponto2.getHorarios().addElement("22:50");
		return onibus;
		}
	}
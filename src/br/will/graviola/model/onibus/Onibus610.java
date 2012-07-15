
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus610 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("S. CERCADO / C. RASO");
		onibus.setCodigo("610");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO RASO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:46");
		ponto0.getHorarios().addElement("07:02");
		ponto0.getHorarios().addElement("07:19");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("07:52");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:39");
		ponto1.getHorarios().addElement("06:55");
		ponto1.getHorarios().addElement("07:12");
		ponto1.getHorarios().addElement("07:28");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("08:01");
		ponto1.getHorarios().addElement("08:18");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITIO CERCADO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:27");
		ponto2.getHorarios().addElement("06:43");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:16");
		ponto2.getHorarios().addElement("07:33");
		ponto2.getHorarios().addElement("07:49");
		ponto2.getHorarios().addElement("08:06");
		return onibus;
		}
	}
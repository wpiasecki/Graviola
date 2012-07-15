
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus399 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. APAE 1");
		onibus.setCodigo("399");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO APAE 1");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("COMPLEXO APAE SANTA FELICIDADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA TIA MARIA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("16:30");
		return onibus;
		}
	}
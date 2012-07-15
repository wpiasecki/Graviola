
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus895 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. TATUQUARA");
		onibus.setCodigo("895");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA HELENA ANTIPOFF");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("16:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITES CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("13:15");
		ponto2.getHorarios().addElement("17:15");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITES SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("11:40");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("17:45");
		return onibus;
		}
	}
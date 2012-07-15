
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus694 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. BAIRRO NOVO");
		onibus.setCodigo("694");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA MULTI DISCIPLINAR");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("10:40");
		ponto0.getHorarios().addElement("16:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA RENASCER PRADO VELHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("08:15");
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("14:10");
		ponto1.getHorarios().addElement("17:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITES CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("13:10");
		ponto2.getHorarios().addElement("17:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITES SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("11:45");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("17:45");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO - E.E.BAIRRO NOVO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:45");
		return onibus;
		}
	}
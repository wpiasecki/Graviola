
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus894 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. 29 DE MARÇO 1");
		onibus.setCodigo("894");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("12:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA 29 DE MARCO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("13:15");
		ponto1.getHorarios().addElement("16:45");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA M.JESUS");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("13:25");
		ponto2.getHorarios().addElement("17:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESCOLA PRIMAVERA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("17:10");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusF72 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("FAZ. RIO GRANDE / MANDIRITUBA");
		onibus.setCodigo("F72");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("MANDIRITUBA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("18:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("17:15");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TAURUS");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("17:35");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("QUEIMADOS");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("28/05/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:50");
		ponto3.getHorarios().addElement("18:00");
		return onibus;
		}
	}
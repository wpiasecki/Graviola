
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusB01 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / MARACANÃ");
		onibus.setCodigo("B01");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("11/06/2012");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL MARACANA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("11/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:56");
		ponto1.getHorarios().addElement("06:15");
		ponto1.getHorarios().addElement("06:34");
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:15");
		ponto1.getHorarios().addElement("07:34");
		ponto1.getHorarios().addElement("08:01");
		ponto1.getHorarios().addElement("08:20");
		ponto1.getHorarios().addElement("08:39");
		return onibus;
		}
	}
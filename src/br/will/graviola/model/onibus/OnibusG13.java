
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusG13 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("LG. FERREIRAS / PINHEIRINHO");
		onibus.setCodigo("G13");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL PINHEIRINHO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/03/2008");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:30");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("LG.FERREIRAS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/03/2008");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL PINHEIRINHO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("08/03/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("12:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("LG.FERREIRAS");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("08/03/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:50");
		return onibus;
		}
	}
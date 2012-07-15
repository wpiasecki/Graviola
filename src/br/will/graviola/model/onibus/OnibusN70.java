
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusN70 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / C. GDE  SUL (RAPIDO)");
		onibus.setCodigo("N70");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL C.GRANDE DO SUL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("04:45");
		ponto0.getHorarios().addElement("06:53");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL GUADALUPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:50");
		ponto1.getHorarios().addElement("17:33");
		ponto1.getHorarios().addElement("17:57");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERM. PAULISTA SENT.CURITIBA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:05");
		return onibus;
		}
	}
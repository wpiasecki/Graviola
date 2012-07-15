
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusO72 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CTBA / POUSADA");
		onibus.setCodigo("O72");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/02/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("09:40");
		ponto0.getHorarios().addElement("11:55");
		ponto0.getHorarios().addElement("14:05");
		ponto0.getHorarios().addElement("16:25");
		ponto0.getHorarios().addElement("18:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL JD.PAULISTA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/02/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:32");
		ponto1.getHorarios().addElement("08:40");
		ponto1.getHorarios().addElement("10:45");
		ponto1.getHorarios().addElement("12:55");
		ponto1.getHorarios().addElement("15:15");
		ponto1.getHorarios().addElement("17:35");
		return onibus;
		}
	}
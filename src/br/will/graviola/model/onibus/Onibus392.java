
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus392 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. TOMAZ EDISON 4");
		onibus.setCodigo("392");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO LINHA TOMAZ EDISON 4");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("26/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA TOMAZ EDISON");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("26/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("11:40");
		ponto1.getHorarios().addElement("16:50");
		return onibus;
		}
	}
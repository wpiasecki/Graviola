
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus798 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. ALI BARK 2");
		onibus.setCodigo("798");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("26/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA ALI BARK");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("26/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("11:00");
		ponto1.getHorarios().addElement("16:50");
		return onibus;
		}
	}
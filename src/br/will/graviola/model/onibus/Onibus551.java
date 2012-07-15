
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus551 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("XAXIM / LINHA VERDE");
		onibus.setCodigo("551");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO TUBO XAXIM-LINHA VERDE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("21/05/2009");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:19");
		ponto0.getHorarios().addElement("06:38");
		ponto0.getHorarios().addElement("06:57");
		ponto0.getHorarios().addElement("07:16");
		ponto0.getHorarios().addElement("07:35");
		ponto0.getHorarios().addElement("07:54");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:50");
		ponto0.getHorarios().addElement("20:10");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO XAXIM");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("21/05/2009");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:50");
		ponto1.getHorarios().addElement("06:09");
		ponto1.getHorarios().addElement("06:28");
		ponto1.getHorarios().addElement("06:47");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("07:44");
		ponto1.getHorarios().addElement("08:04");
		ponto1.getHorarios().addElement("17:40");
		ponto1.getHorarios().addElement("18:00");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("19:00");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("19:40");
		ponto1.getHorarios().addElement("20:00");
		return onibus;
		}
	}
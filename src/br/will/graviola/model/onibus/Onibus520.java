
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class Onibus520 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("LD OSTERNACK / S. CERCADO");
		onibus.setCodigo("520");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO TUBO OSTERNACK");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:51");
		ponto0.getHorarios().addElement("06:03");
		ponto0.getHorarios().addElement("06:14");
		ponto0.getHorarios().addElement("06:18");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:37");
		ponto0.getHorarios().addElement("06:49");
		ponto0.getHorarios().addElement("06:55");
		ponto0.getHorarios().addElement("07:04");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:21");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESTACAO TUBO WESTPHALEN/B.NOVO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITIO CERCADO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:16");
		ponto2.getHorarios().addElement("07:28");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERM.S.CERCADO(SENT.OSTERNACK)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:05");
		ponto3.getHorarios().addElement("06:10");
		ponto3.getHorarios().addElement("06:22");
		ponto3.getHorarios().addElement("06:29");
		ponto3.getHorarios().addElement("06:41");
		ponto3.getHorarios().addElement("06:47");
		ponto3.getHorarios().addElement("06:56");
		ponto3.getHorarios().addElement("07:02");
		ponto3.getHorarios().addElement("07:13");
		return onibus;
		}
	}
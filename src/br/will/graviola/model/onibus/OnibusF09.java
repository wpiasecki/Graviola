
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusF09 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. FAZ. RIO GRANDE");
		onibus.setCodigo("F09");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/04/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("02:15");
		ponto0.getHorarios().addElement("03:20");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL PINHEIRINHO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/04/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:40");
		ponto1.getHorarios().addElement("02:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("CEASA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("13/04/2011");
		onibus.getPontos().addElement(ponto2);
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL FAZENDA RIO GRANDE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("16/04/2011");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("03:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("CEASA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("16/04/2011");
		onibus.getPontos().addElement(ponto4);
		return onibus;
		}
	}
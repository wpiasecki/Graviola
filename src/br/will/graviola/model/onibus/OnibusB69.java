
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.Onibus;
	import br.will.graviola.model.Ponto;
	import br.will.graviola.model.TipoDia;
	
	public class OnibusB69 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. CTBA / SÃO DIMAS");
		onibus.setCodigo("B69");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL GUADALUPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("28/05/2007");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("01:15");
		ponto0.getHorarios().addElement("03:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO SAO DIMAS-1");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("28/05/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("02:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO SAO DIMAS-2");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("28/05/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("03:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL GUADALUPE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("26/05/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:15");
		ponto3.getHorarios().addElement("03:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO SAO DIMAS-1");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("26/05/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("02:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("BAIRRO SAO DIMAS-2");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("26/05/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("03:50");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL GUADALUPE");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("27/05/2007");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:15");
		ponto6.getHorarios().addElement("03:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("BAIRRO SAO DIMAS-1");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("27/05/2007");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("02:20");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("BAIRRO SAO DIMAS-2");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("27/05/2007");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("03:50");
		return onibus;
		}
	}
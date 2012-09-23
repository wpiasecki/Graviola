
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus614 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("614 - FAZENDINHA / PUC");
		onibus.setCodigo("614");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO SANTA RITA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:19");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PONT.UNIVERSIDADE CATOLICA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:08");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:24");
		ponto1.getHorarios().addElement("07:33");
		ponto1.getHorarios().addElement("07:42");
		ponto1.getHorarios().addElement("11:30");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:10");
		ponto1.getHorarios().addElement("12:34");
		ponto1.getHorarios().addElement("12:51");
		ponto1.getHorarios().addElement("13:24");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:15");
		ponto1.getHorarios().addElement("17:24");
		ponto1.getHorarios().addElement("17:43");
		ponto1.getHorarios().addElement("18:17");
		ponto1.getHorarios().addElement("18:27");
		ponto1.getHorarios().addElement("18:37");
		ponto1.getHorarios().addElement("21:56");
		ponto1.getHorarios().addElement("22:16");
		ponto1.getHorarios().addElement("22:36");
		ponto1.getHorarios().addElement("22:58");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CIC");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:48");
		ponto2.getHorarios().addElement("06:53");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL FAZENDINHA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:33");
		ponto3.getHorarios().addElement("06:41");
		ponto3.getHorarios().addElement("06:49");
		ponto3.getHorarios().addElement("06:58");
		ponto3.getHorarios().addElement("07:07");
		ponto3.getHorarios().addElement("07:16");
		ponto3.getHorarios().addElement("07:24");
		ponto3.getHorarios().addElement("07:38");
		ponto3.getHorarios().addElement("07:42");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("08:00");
		ponto3.getHorarios().addElement("08:08");
		ponto3.getHorarios().addElement("12:04");
		ponto3.getHorarios().addElement("12:21");
		ponto3.getHorarios().addElement("12:54");
		ponto3.getHorarios().addElement("13:11");
		ponto3.getHorarios().addElement("13:27");
		ponto3.getHorarios().addElement("17:42");
		ponto3.getHorarios().addElement("17:52");
		ponto3.getHorarios().addElement("18:01");
		ponto3.getHorarios().addElement("18:20");
		ponto3.getHorarios().addElement("18:57");
		ponto3.getHorarios().addElement("22:27");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("TERMINAL PINHEIRINHO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:55");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("EMPRESA KRAFT");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:35");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("BAIRRO RIO BONITO");
		ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto6.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:24");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("T.S.CERCADO SENT.FAZENDINHA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto7.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("06:12");
		return onibus;
		}
	}
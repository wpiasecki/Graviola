
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
		ponto0.setNome("PONT.UNIVERSIDADE CATOLICA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:08");
		ponto0.getHorarios().addElement("07:16");
		ponto0.getHorarios().addElement("07:24");
		ponto0.getHorarios().addElement("07:33");
		ponto0.getHorarios().addElement("07:42");
		ponto0.getHorarios().addElement("11:30");
		ponto0.getHorarios().addElement("11:45");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("12:34");
		ponto0.getHorarios().addElement("12:51");
		ponto0.getHorarios().addElement("13:24");
		ponto0.getHorarios().addElement("17:05");
		ponto0.getHorarios().addElement("17:15");
		ponto0.getHorarios().addElement("17:24");
		ponto0.getHorarios().addElement("17:43");
		ponto0.getHorarios().addElement("18:17");
		ponto0.getHorarios().addElement("18:27");
		ponto0.getHorarios().addElement("18:37");
		ponto0.getHorarios().addElement("21:56");
		ponto0.getHorarios().addElement("22:16");
		ponto0.getHorarios().addElement("22:36");
		ponto0.getHorarios().addElement("22:58");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL FAZENDINHA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:33");
		ponto1.getHorarios().addElement("06:41");
		ponto1.getHorarios().addElement("06:49");
		ponto1.getHorarios().addElement("06:58");
		ponto1.getHorarios().addElement("07:07");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:24");
		ponto1.getHorarios().addElement("07:38");
		ponto1.getHorarios().addElement("07:42");
		ponto1.getHorarios().addElement("07:51");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:08");
		ponto1.getHorarios().addElement("12:04");
		ponto1.getHorarios().addElement("12:21");
		ponto1.getHorarios().addElement("12:54");
		ponto1.getHorarios().addElement("13:11");
		ponto1.getHorarios().addElement("13:27");
		ponto1.getHorarios().addElement("17:42");
		ponto1.getHorarios().addElement("17:52");
		ponto1.getHorarios().addElement("18:01");
		ponto1.getHorarios().addElement("18:20");
		ponto1.getHorarios().addElement("18:57");
		ponto1.getHorarios().addElement("22:27");
		return onibus;
		}
	}
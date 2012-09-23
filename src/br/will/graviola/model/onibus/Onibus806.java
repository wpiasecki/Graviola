
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus806 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("806 - T. C. LARGO / CAMP. SIQUEIRA");
		onibus.setCodigo("806");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:03");
		ponto0.getHorarios().addElement("06:35");
		ponto0.getHorarios().addElement("06:43");
		ponto0.getHorarios().addElement("06:51");
		ponto0.getHorarios().addElement("06:59");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:31");
		ponto0.getHorarios().addElement("07:39");
		ponto0.getHorarios().addElement("15:55");
		ponto0.getHorarios().addElement("16:17");
		ponto0.getHorarios().addElement("16:40");
		ponto0.getHorarios().addElement("16:54");
		ponto0.getHorarios().addElement("17:02");
		ponto0.getHorarios().addElement("17:15");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:38");
		ponto0.getHorarios().addElement("17:49");
		ponto0.getHorarios().addElement("18:01");
		ponto0.getHorarios().addElement("18:13");
		ponto0.getHorarios().addElement("18:24");
		ponto0.getHorarios().addElement("18:36");
		ponto0.getHorarios().addElement("18:47");
		ponto0.getHorarios().addElement("18:58");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:22");
		ponto0.getHorarios().addElement("22:46");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAMPO LARGO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:34");
		ponto1.getHorarios().addElement("06:06");
		ponto1.getHorarios().addElement("06:14");
		ponto1.getHorarios().addElement("06:22");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("06:38");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("07:02");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:18");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("07:36");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("07:58");
		ponto1.getHorarios().addElement("08:06");
		ponto1.getHorarios().addElement("16:26");
		ponto1.getHorarios().addElement("16:47");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:33");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("17:56");
		ponto1.getHorarios().addElement("18:08");
		ponto1.getHorarios().addElement("18:19");
		ponto1.getHorarios().addElement("18:30");
		ponto1.getHorarios().addElement("18:42");
		ponto1.getHorarios().addElement("18:54");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("18/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:15");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAMPO LARGO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("18/02/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:45");
		ponto3.getHorarios().addElement("06:52");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB02 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("CABRAL / MARACANÃ");
		onibus.setCodigo("B02");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CABRAL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("16:38");
		ponto0.getHorarios().addElement("16:54");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:18");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:34");
		ponto0.getHorarios().addElement("17:42");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("17:58");
		ponto0.getHorarios().addElement("18:06");
		ponto0.getHorarios().addElement("18:14");
		ponto0.getHorarios().addElement("18:22");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("18:38");
		ponto0.getHorarios().addElement("18:46");
		ponto0.getHorarios().addElement("18:54");
		ponto0.getHorarios().addElement("19:02");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:18");
		ponto0.getHorarios().addElement("19:26");
		ponto0.getHorarios().addElement("19:34");
		ponto0.getHorarios().addElement("19:42");
		ponto0.getHorarios().addElement("19:51");
		ponto0.getHorarios().addElement("20:00");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:13");
		ponto0.getHorarios().addElement("22:26");
		ponto0.getHorarios().addElement("22:39");
		ponto0.getHorarios().addElement("22:52");
		ponto0.getHorarios().addElement("23:05");
		ponto0.getHorarios().addElement("23:18");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL MARACANA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("16:58");
		ponto1.getHorarios().addElement("17:14");
		ponto1.getHorarios().addElement("17:30");
		ponto1.getHorarios().addElement("17:38");
		ponto1.getHorarios().addElement("17:46");
		ponto1.getHorarios().addElement("17:54");
		ponto1.getHorarios().addElement("18:02");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("18:18");
		ponto1.getHorarios().addElement("18:26");
		ponto1.getHorarios().addElement("18:34");
		ponto1.getHorarios().addElement("18:42");
		ponto1.getHorarios().addElement("18:50");
		ponto1.getHorarios().addElement("18:58");
		ponto1.getHorarios().addElement("19:06");
		ponto1.getHorarios().addElement("19:14");
		ponto1.getHorarios().addElement("19:22");
		ponto1.getHorarios().addElement("19:30");
		ponto1.getHorarios().addElement("19:38");
		ponto1.getHorarios().addElement("22:20");
		ponto1.getHorarios().addElement("22:33");
		ponto1.getHorarios().addElement("22:46");
		ponto1.getHorarios().addElement("22:59");
		return onibus;
		}
	}
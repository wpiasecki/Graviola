
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusH20 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("ANGÉLICA / C. RASO");
		onibus.setCodigo("H20");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL ANGELICA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:33");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("05:55");
		ponto0.getHorarios().addElement("06:05");
		ponto0.getHorarios().addElement("06:12");
		ponto0.getHorarios().addElement("06:19");
		ponto0.getHorarios().addElement("06:27");
		ponto0.getHorarios().addElement("06:36");
		ponto0.getHorarios().addElement("06:45");
		ponto0.getHorarios().addElement("06:52");
		ponto0.getHorarios().addElement("06:59");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:16");
		ponto0.getHorarios().addElement("07:25");
		ponto0.getHorarios().addElement("07:32");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("17:22");
		ponto0.getHorarios().addElement("17:38");
		ponto0.getHorarios().addElement("17:54");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:26");
		ponto0.getHorarios().addElement("18:42");
		ponto0.getHorarios().addElement("18:58");
		ponto0.getHorarios().addElement("19:15");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CAPAO RASO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:45");
		ponto1.getHorarios().addElement("05:55");
		ponto1.getHorarios().addElement("06:06");
		ponto1.getHorarios().addElement("06:15");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:32");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("06:48");
		ponto1.getHorarios().addElement("06:56");
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("07:12");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:28");
		ponto1.getHorarios().addElement("07:37");
		ponto1.getHorarios().addElement("17:15");
		ponto1.getHorarios().addElement("17:31");
		ponto1.getHorarios().addElement("17:47");
		ponto1.getHorarios().addElement("18:03");
		ponto1.getHorarios().addElement("18:19");
		ponto1.getHorarios().addElement("18:35");
		ponto1.getHorarios().addElement("18:51");
		ponto1.getHorarios().addElement("19:07");
		ponto1.getHorarios().addElement("19:23");
		ponto1.getHorarios().addElement("19:39");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL ANGELICA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("05/07/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:13");
		ponto2.getHorarios().addElement("06:26");
		ponto2.getHorarios().addElement("06:39");
		ponto2.getHorarios().addElement("06:52");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:18");
		ponto2.getHorarios().addElement("07:31");
		ponto2.getHorarios().addElement("07:44");
		ponto2.getHorarios().addElement("07:57");
		ponto2.getHorarios().addElement("08:10");
		ponto2.getHorarios().addElement("08:23");
		ponto2.getHorarios().addElement("08:36");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL CAPAO RASO");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("05/07/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:06");
		ponto3.getHorarios().addElement("06:20");
		ponto3.getHorarios().addElement("06:33");
		ponto3.getHorarios().addElement("06:46");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:12");
		ponto3.getHorarios().addElement("07:25");
		ponto3.getHorarios().addElement("07:38");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("08:04");
		ponto3.getHorarios().addElement("08:17");
		return onibus;
		}
	}
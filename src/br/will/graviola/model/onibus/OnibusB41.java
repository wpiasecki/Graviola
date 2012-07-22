
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusB41 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MARACANÃ / C. IMBUIA");
		onibus.setCodigo("B41");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("26/03/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("05:45");
		ponto0.getHorarios().addElement("05:51");
		ponto0.getHorarios().addElement("05:58");
		ponto0.getHorarios().addElement("06:05");
		ponto0.getHorarios().addElement("06:13");
		ponto0.getHorarios().addElement("06:20");
		ponto0.getHorarios().addElement("06:27");
		ponto0.getHorarios().addElement("06:35");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("06:51");
		ponto0.getHorarios().addElement("06:59");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:19");
		ponto0.getHorarios().addElement("07:28");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:44");
		ponto0.getHorarios().addElement("07:51");
		ponto0.getHorarios().addElement("07:59");
		ponto0.getHorarios().addElement("08:08");
		ponto0.getHorarios().addElement("08:15");
		ponto0.getHorarios().addElement("08:24");
		ponto0.getHorarios().addElement("08:36");
		ponto0.getHorarios().addElement("09:05");
		ponto0.getHorarios().addElement("10:10");
		ponto0.getHorarios().addElement("11:17");
		ponto0.getHorarios().addElement("11:50");
		ponto0.getHorarios().addElement("12:24");
		ponto0.getHorarios().addElement("12:57");
		ponto0.getHorarios().addElement("13:31");
		ponto0.getHorarios().addElement("14:04");
		ponto0.getHorarios().addElement("16:00");
		ponto0.getHorarios().addElement("16:10");
		ponto0.getHorarios().addElement("16:20");
		ponto0.getHorarios().addElement("16:30");
		ponto0.getHorarios().addElement("16:37");
		ponto0.getHorarios().addElement("16:44");
		ponto0.getHorarios().addElement("16:55");
		ponto0.getHorarios().addElement("17:03");
		ponto0.getHorarios().addElement("17:11");
		ponto0.getHorarios().addElement("17:19");
		ponto0.getHorarios().addElement("17:28");
		ponto0.getHorarios().addElement("17:36");
		ponto0.getHorarios().addElement("17:44");
		ponto0.getHorarios().addElement("17:51");
		ponto0.getHorarios().addElement("17:58");
		ponto0.getHorarios().addElement("18:08");
		ponto0.getHorarios().addElement("18:17");
		ponto0.getHorarios().addElement("18:26");
		ponto0.getHorarios().addElement("18:33");
		ponto0.getHorarios().addElement("18:41");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("18:57");
		ponto0.getHorarios().addElement("19:06");
		ponto0.getHorarios().addElement("19:15");
		ponto0.getHorarios().addElement("19:19");
		ponto0.getHorarios().addElement("19:27");
		ponto0.getHorarios().addElement("19:36");
		ponto0.getHorarios().addElement("19:46");
		ponto0.getHorarios().addElement("19:56");
		ponto0.getHorarios().addElement("22:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL MARACANA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("26/03/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:15");
		ponto1.getHorarios().addElement("05:25");
		ponto1.getHorarios().addElement("05:40");
		ponto1.getHorarios().addElement("05:47");
		ponto1.getHorarios().addElement("05:54");
		ponto1.getHorarios().addElement("06:02");
		ponto1.getHorarios().addElement("06:09");
		ponto1.getHorarios().addElement("06:16");
		ponto1.getHorarios().addElement("06:24");
		ponto1.getHorarios().addElement("06:31");
		ponto1.getHorarios().addElement("06:38");
		ponto1.getHorarios().addElement("06:46");
		ponto1.getHorarios().addElement("06:53");
		ponto1.getHorarios().addElement("07:01");
		ponto1.getHorarios().addElement("07:08");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:25");
		ponto1.getHorarios().addElement("07:32");
		ponto1.getHorarios().addElement("07:41");
		ponto1.getHorarios().addElement("07:51");
		ponto1.getHorarios().addElement("08:02");
		ponto1.getHorarios().addElement("08:11");
		ponto1.getHorarios().addElement("08:22");
		ponto1.getHorarios().addElement("08:34");
		ponto1.getHorarios().addElement("08:43");
		ponto1.getHorarios().addElement("09:37");
		ponto1.getHorarios().addElement("10:44");
		ponto1.getHorarios().addElement("11:17");
		ponto1.getHorarios().addElement("11:51");
		ponto1.getHorarios().addElement("12:24");
		ponto1.getHorarios().addElement("12:58");
		ponto1.getHorarios().addElement("13:31");
		ponto1.getHorarios().addElement("14:05");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("16:12");
		ponto1.getHorarios().addElement("16:24");
		ponto1.getHorarios().addElement("16:34");
		ponto1.getHorarios().addElement("16:41");
		ponto1.getHorarios().addElement("16:49");
		ponto1.getHorarios().addElement("16:56");
		ponto1.getHorarios().addElement("17:04");
		ponto1.getHorarios().addElement("17:12");
		ponto1.getHorarios().addElement("17:19");
		ponto1.getHorarios().addElement("17:28");
		ponto1.getHorarios().addElement("17:37");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("17:53");
		ponto1.getHorarios().addElement("18:01");
		ponto1.getHorarios().addElement("18:10");
		ponto1.getHorarios().addElement("18:17");
		ponto1.getHorarios().addElement("18:26");
		ponto1.getHorarios().addElement("18:35");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("18:54");
		ponto1.getHorarios().addElement("19:03");
		ponto1.getHorarios().addElement("19:13");
		ponto1.getHorarios().addElement("19:23");
		ponto1.getHorarios().addElement("19:39");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("23:20");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CAPAO DA IMBUIA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("07/01/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:59");
		ponto2.getHorarios().addElement("08:03");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL MARACANA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("07/01/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:28");
		ponto3.getHorarios().addElement("07:28");
		return onibus;
		}
	}
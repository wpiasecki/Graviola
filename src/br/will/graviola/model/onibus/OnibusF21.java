
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusF21 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("F21 - IGUAÇU II");
		onibus.setCodigo("F21");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("T.FAZENDA/IGUACU II");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("30/05/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("04:30");
		ponto0.getHorarios().addElement("04:47");
		ponto0.getHorarios().addElement("05:03");
		ponto0.getHorarios().addElement("05:11");
		ponto0.getHorarios().addElement("05:20");
		ponto0.getHorarios().addElement("05:28");
		ponto0.getHorarios().addElement("05:36");
		ponto0.getHorarios().addElement("05:44");
		ponto0.getHorarios().addElement("05:53");
		ponto0.getHorarios().addElement("06:01");
		ponto0.getHorarios().addElement("06:09");
		ponto0.getHorarios().addElement("06:17");
		ponto0.getHorarios().addElement("06:26");
		ponto0.getHorarios().addElement("06:34");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("06:59");
		ponto0.getHorarios().addElement("07:07");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:23");
		ponto0.getHorarios().addElement("07:32");
		ponto0.getHorarios().addElement("07:48");
		ponto0.getHorarios().addElement("08:21");
		ponto0.getHorarios().addElement("08:54");
		ponto0.getHorarios().addElement("09:27");
		ponto0.getHorarios().addElement("10:00");
		ponto0.getHorarios().addElement("10:33");
		ponto0.getHorarios().addElement("11:06");
		ponto0.getHorarios().addElement("11:39");
		ponto0.getHorarios().addElement("12:12");
		ponto0.getHorarios().addElement("12:45");
		ponto0.getHorarios().addElement("13:18");
		ponto0.getHorarios().addElement("13:51");
		ponto0.getHorarios().addElement("14:24");
		ponto0.getHorarios().addElement("14:57");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("16:03");
		ponto0.getHorarios().addElement("16:28");
		ponto0.getHorarios().addElement("16:36");
		ponto0.getHorarios().addElement("16:44");
		ponto0.getHorarios().addElement("16:53");
		ponto0.getHorarios().addElement("17:01");
		ponto0.getHorarios().addElement("17:09");
		ponto0.getHorarios().addElement("17:17");
		ponto0.getHorarios().addElement("17:26");
		ponto0.getHorarios().addElement("17:34");
		ponto0.getHorarios().addElement("17:42");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("17:59");
		ponto0.getHorarios().addElement("18:07");
		ponto0.getHorarios().addElement("18:15");
		ponto0.getHorarios().addElement("18:23");
		ponto0.getHorarios().addElement("18:32");
		ponto0.getHorarios().addElement("18:40");
		ponto0.getHorarios().addElement("18:48");
		ponto0.getHorarios().addElement("18:56");
		ponto0.getHorarios().addElement("19:05");
		ponto0.getHorarios().addElement("19:13");
		ponto0.getHorarios().addElement("19:21");
		ponto0.getHorarios().addElement("19:29");
		ponto0.getHorarios().addElement("19:38");
		ponto0.getHorarios().addElement("19:46");
		ponto0.getHorarios().addElement("19:54");
		ponto0.getHorarios().addElement("20:11");
		ponto0.getHorarios().addElement("20:27");
		ponto0.getHorarios().addElement("20:44");
		ponto0.getHorarios().addElement("21:00");
		ponto0.getHorarios().addElement("21:36");
		ponto0.getHorarios().addElement("22:06");
		ponto0.getHorarios().addElement("22:36");
		ponto0.getHorarios().addElement("23:06");
		ponto0.getHorarios().addElement("23:36");
		ponto0.getHorarios().addElement("00:06");
		ponto0.getHorarios().addElement("00:36");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("T.FAZENDA/PQ.INDUSTRIAL");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("30/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("20:24");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.FAZENDA/IGUACU II");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("07/04/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("04:30");
		ponto2.getHorarios().addElement("05:00");
		ponto2.getHorarios().addElement("05:13");
		ponto2.getHorarios().addElement("05:26");
		ponto2.getHorarios().addElement("05:39");
		ponto2.getHorarios().addElement("05:52");
		ponto2.getHorarios().addElement("06:05");
		ponto2.getHorarios().addElement("06:18");
		ponto2.getHorarios().addElement("06:31");
		ponto2.getHorarios().addElement("06:44");
		ponto2.getHorarios().addElement("06:57");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("07:23");
		ponto2.getHorarios().addElement("07:36");
		ponto2.getHorarios().addElement("07:49");
		ponto2.getHorarios().addElement("08:00");
		ponto2.getHorarios().addElement("08:30");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:30");
		ponto2.getHorarios().addElement("10:00");
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("12:00");
		ponto2.getHorarios().addElement("12:30");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:30");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:30");
		ponto2.getHorarios().addElement("16:00");
		ponto2.getHorarios().addElement("16:30");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:15");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("17:45");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:15");
		ponto2.getHorarios().addElement("18:30");
		ponto2.getHorarios().addElement("18:45");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("19:15");
		ponto2.getHorarios().addElement("19:30");
		ponto2.getHorarios().addElement("20:00");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:00");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("00:00");
		ponto2.getHorarios().addElement("00:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("T.FAZENDA/IGUACU II");
		ponto3.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto3.setValidoAPartirDe("02/11/2006");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("04:35");
		ponto3.getHorarios().addElement("05:07");
		ponto3.getHorarios().addElement("05:50");
		ponto3.getHorarios().addElement("06:32");
		ponto3.getHorarios().addElement("07:07");
		ponto3.getHorarios().addElement("07:42");
		ponto3.getHorarios().addElement("08:17");
		ponto3.getHorarios().addElement("08:52");
		ponto3.getHorarios().addElement("09:27");
		ponto3.getHorarios().addElement("10:02");
		ponto3.getHorarios().addElement("10:37");
		ponto3.getHorarios().addElement("11:12");
		ponto3.getHorarios().addElement("11:47");
		ponto3.getHorarios().addElement("12:22");
		ponto3.getHorarios().addElement("12:57");
		ponto3.getHorarios().addElement("13:32");
		ponto3.getHorarios().addElement("14:07");
		ponto3.getHorarios().addElement("14:42");
		ponto3.getHorarios().addElement("15:17");
		ponto3.getHorarios().addElement("15:52");
		ponto3.getHorarios().addElement("16:27");
		ponto3.getHorarios().addElement("17:02");
		ponto3.getHorarios().addElement("17:37");
		ponto3.getHorarios().addElement("18:12");
		ponto3.getHorarios().addElement("18:47");
		ponto3.getHorarios().addElement("19:22");
		ponto3.getHorarios().addElement("19:57");
		ponto3.getHorarios().addElement("20:32");
		ponto3.getHorarios().addElement("21:07");
		ponto3.getHorarios().addElement("21:42");
		ponto3.getHorarios().addElement("22:17");
		ponto3.getHorarios().addElement("22:52");
		ponto3.getHorarios().addElement("23:27");
		ponto3.getHorarios().addElement("00:02");
		ponto3.getHorarios().addElement("00:37");
		return onibus;
		}
	}
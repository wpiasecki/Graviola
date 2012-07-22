
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusF26 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("STA. TEREZINHA / IPE");
		onibus.setCodigo("F26");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("T.FAZENDA/S.TEREZINHA/IPE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("18/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("04:30");
		ponto0.getHorarios().addElement("05:08");
		ponto0.getHorarios().addElement("05:25");
		ponto0.getHorarios().addElement("05:46");
		ponto0.getHorarios().addElement("06:04");
		ponto0.getHorarios().addElement("06:24");
		ponto0.getHorarios().addElement("06:43");
		ponto0.getHorarios().addElement("07:02");
		ponto0.getHorarios().addElement("07:21");
		ponto0.getHorarios().addElement("07:40");
		ponto0.getHorarios().addElement("07:59");
		ponto0.getHorarios().addElement("08:18");
		ponto0.getHorarios().addElement("08:37");
		ponto0.getHorarios().addElement("08:56");
		ponto0.getHorarios().addElement("09:34");
		ponto0.getHorarios().addElement("10:12");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("11:28");
		ponto0.getHorarios().addElement("12:06");
		ponto0.getHorarios().addElement("12:44");
		ponto0.getHorarios().addElement("13:22");
		ponto0.getHorarios().addElement("14:00");
		ponto0.getHorarios().addElement("14:38");
		ponto0.getHorarios().addElement("15:16");
		ponto0.getHorarios().addElement("15:54");
		ponto0.getHorarios().addElement("16:32");
		ponto0.getHorarios().addElement("16:45");
		ponto0.getHorarios().addElement("16:58");
		ponto0.getHorarios().addElement("17:10");
		ponto0.getHorarios().addElement("17:23");
		ponto0.getHorarios().addElement("17:36");
		ponto0.getHorarios().addElement("17:48");
		ponto0.getHorarios().addElement("18:01");
		ponto0.getHorarios().addElement("18:14");
		ponto0.getHorarios().addElement("18:26");
		ponto0.getHorarios().addElement("18:39");
		ponto0.getHorarios().addElement("18:52");
		ponto0.getHorarios().addElement("19:04");
		ponto0.getHorarios().addElement("19:17");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:42");
		ponto0.getHorarios().addElement("19:55");
		ponto0.getHorarios().addElement("20:08");
		ponto0.getHorarios().addElement("20:20");
		ponto0.getHorarios().addElement("20:33");
		ponto0.getHorarios().addElement("20:46");
		ponto0.getHorarios().addElement("21:24");
		ponto0.getHorarios().addElement("22:04");
		ponto0.getHorarios().addElement("22:44");
		ponto0.getHorarios().addElement("23:24");
		ponto0.getHorarios().addElement("00:04");
		ponto0.getHorarios().addElement("00:40");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("T.FAZENDA/S.TEREZINHA/IPE");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("19/05/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("04:30");
		ponto1.getHorarios().addElement("05:08");
		ponto1.getHorarios().addElement("05:46");
		ponto1.getHorarios().addElement("06:24");
		ponto1.getHorarios().addElement("07:02");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("08:18");
		ponto1.getHorarios().addElement("08:56");
		ponto1.getHorarios().addElement("09:34");
		ponto1.getHorarios().addElement("10:12");
		ponto1.getHorarios().addElement("10:50");
		ponto1.getHorarios().addElement("11:28");
		ponto1.getHorarios().addElement("12:06");
		ponto1.getHorarios().addElement("12:44");
		ponto1.getHorarios().addElement("13:22");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:38");
		ponto1.getHorarios().addElement("15:16");
		ponto1.getHorarios().addElement("15:54");
		ponto1.getHorarios().addElement("16:32");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:48");
		ponto1.getHorarios().addElement("18:26");
		ponto1.getHorarios().addElement("19:04");
		ponto1.getHorarios().addElement("19:42");
		ponto1.getHorarios().addElement("20:20");
		ponto1.getHorarios().addElement("20:58");
		ponto1.getHorarios().addElement("21:36");
		ponto1.getHorarios().addElement("22:14");
		ponto1.getHorarios().addElement("22:52");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:04");
		ponto1.getHorarios().addElement("00:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.FAZENDA/S.TEREZINHA/IPE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto2.setValidoAPartirDe("20/05/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("04:30");
		ponto2.getHorarios().addElement("05:08");
		ponto2.getHorarios().addElement("05:46");
		ponto2.getHorarios().addElement("06:24");
		ponto2.getHorarios().addElement("07:02");
		ponto2.getHorarios().addElement("07:40");
		ponto2.getHorarios().addElement("08:18");
		ponto2.getHorarios().addElement("08:56");
		ponto2.getHorarios().addElement("09:34");
		ponto2.getHorarios().addElement("10:12");
		ponto2.getHorarios().addElement("10:50");
		ponto2.getHorarios().addElement("11:28");
		ponto2.getHorarios().addElement("12:06");
		ponto2.getHorarios().addElement("12:44");
		ponto2.getHorarios().addElement("13:22");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:38");
		ponto2.getHorarios().addElement("15:16");
		ponto2.getHorarios().addElement("15:54");
		ponto2.getHorarios().addElement("16:32");
		ponto2.getHorarios().addElement("17:10");
		ponto2.getHorarios().addElement("17:48");
		ponto2.getHorarios().addElement("18:26");
		ponto2.getHorarios().addElement("19:04");
		ponto2.getHorarios().addElement("19:42");
		ponto2.getHorarios().addElement("20:20");
		ponto2.getHorarios().addElement("20:58");
		ponto2.getHorarios().addElement("21:36");
		ponto2.getHorarios().addElement("22:14");
		ponto2.getHorarios().addElement("22:52");
		ponto2.getHorarios().addElement("23:30");
		ponto2.getHorarios().addElement("00:04");
		ponto2.getHorarios().addElement("00:40");
		return onibus;
		}
	}
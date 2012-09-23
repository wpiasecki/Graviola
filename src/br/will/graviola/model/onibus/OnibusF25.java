
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusF25 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("F25 - JD. VENEZA");
		onibus.setCodigo("F25");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("T.FAZENDA/VENEZA/CURTUME");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("15/03/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:38");
		ponto0.getHorarios().addElement("12:30");
		ponto0.getHorarios().addElement("18:34");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("T.FAZENDA/JD.VENEZA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("15/03/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("04:25");
		ponto1.getHorarios().addElement("05:00");
		ponto1.getHorarios().addElement("05:15");
		ponto1.getHorarios().addElement("05:42");
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:24");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:16");
		ponto1.getHorarios().addElement("07:48");
		ponto1.getHorarios().addElement("07:53");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("09:10");
		ponto1.getHorarios().addElement("09:50");
		ponto1.getHorarios().addElement("10:30");
		ponto1.getHorarios().addElement("11:10");
		ponto1.getHorarios().addElement("11:50");
		ponto1.getHorarios().addElement("13:10");
		ponto1.getHorarios().addElement("13:50");
		ponto1.getHorarios().addElement("14:30");
		ponto1.getHorarios().addElement("15:10");
		ponto1.getHorarios().addElement("15:50");
		ponto1.getHorarios().addElement("16:30");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:10");
		ponto1.getHorarios().addElement("17:32");
		ponto1.getHorarios().addElement("17:52");
		ponto1.getHorarios().addElement("18:12");
		ponto1.getHorarios().addElement("18:54");
		ponto1.getHorarios().addElement("19:16");
		ponto1.getHorarios().addElement("19:38");
		ponto1.getHorarios().addElement("19:58");
		ponto1.getHorarios().addElement("20:18");
		ponto1.getHorarios().addElement("20:40");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("22:40");
		ponto1.getHorarios().addElement("23:20");
		ponto1.getHorarios().addElement("00:05");
		ponto1.getHorarios().addElement("00:35");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.FAZENDA/VENEZA/CURTUME");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("28/01/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:50");
		ponto2.getHorarios().addElement("12:10");
		ponto2.getHorarios().addElement("18:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("T.FAZENDA/JD.VENEZA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("28/01/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("04:25");
		ponto3.getHorarios().addElement("05:00");
		ponto3.getHorarios().addElement("05:35");
		ponto3.getHorarios().addElement("06:10");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:10");
		ponto3.getHorarios().addElement("08:50");
		ponto3.getHorarios().addElement("09:30");
		ponto3.getHorarios().addElement("10:10");
		ponto3.getHorarios().addElement("10:50");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("12:50");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("14:10");
		ponto3.getHorarios().addElement("14:50");
		ponto3.getHorarios().addElement("15:30");
		ponto3.getHorarios().addElement("16:10");
		ponto3.getHorarios().addElement("16:50");
		ponto3.getHorarios().addElement("17:30");
		ponto3.getHorarios().addElement("18:10");
		ponto3.getHorarios().addElement("19:30");
		ponto3.getHorarios().addElement("20:10");
		ponto3.getHorarios().addElement("20:50");
		ponto3.getHorarios().addElement("21:30");
		ponto3.getHorarios().addElement("22:10");
		ponto3.getHorarios().addElement("22:50");
		ponto3.getHorarios().addElement("23:30");
		ponto3.getHorarios().addElement("00:05");
		ponto3.getHorarios().addElement("00:40");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("T.FAZENDA/JD.VENEZA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("29/01/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("04:25");
		ponto4.getHorarios().addElement("05:00");
		ponto4.getHorarios().addElement("05:35");
		ponto4.getHorarios().addElement("06:10");
		ponto4.getHorarios().addElement("06:50");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("08:10");
		ponto4.getHorarios().addElement("08:50");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("10:10");
		ponto4.getHorarios().addElement("10:50");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("12:10");
		ponto4.getHorarios().addElement("12:50");
		ponto4.getHorarios().addElement("13:30");
		ponto4.getHorarios().addElement("14:10");
		ponto4.getHorarios().addElement("14:50");
		ponto4.getHorarios().addElement("15:30");
		ponto4.getHorarios().addElement("16:10");
		ponto4.getHorarios().addElement("16:50");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("18:10");
		ponto4.getHorarios().addElement("18:50");
		ponto4.getHorarios().addElement("19:30");
		ponto4.getHorarios().addElement("20:15");
		ponto4.getHorarios().addElement("20:55");
		ponto4.getHorarios().addElement("21:35");
		ponto4.getHorarios().addElement("22:15");
		ponto4.getHorarios().addElement("22:55");
		ponto4.getHorarios().addElement("23:35");
		ponto4.getHorarios().addElement("00:05");
		ponto4.getHorarios().addElement("00:40");
		return onibus;
		}
	}
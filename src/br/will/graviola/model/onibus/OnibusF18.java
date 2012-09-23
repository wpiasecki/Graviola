
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusF18 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("F18 - PQ. INDUSTRIAL");
		onibus.setCodigo("F18");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("T.FAZENDA/PQ.INDUSTRIAL");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:25");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("07:15");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("08:30");
		ponto0.getHorarios().addElement("09:05");
		ponto0.getHorarios().addElement("09:45");
		ponto0.getHorarios().addElement("10:20");
		ponto0.getHorarios().addElement("11:00");
		ponto0.getHorarios().addElement("11:35");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("12:45");
		ponto0.getHorarios().addElement("13:25");
		ponto0.getHorarios().addElement("13:55");
		ponto0.getHorarios().addElement("14:30");
		ponto0.getHorarios().addElement("15:25");
		ponto0.getHorarios().addElement("16:05");
		ponto0.getHorarios().addElement("16:45");
		ponto0.getHorarios().addElement("18:05");
		ponto0.getHorarios().addElement("18:45");
		ponto0.getHorarios().addElement("19:25");
		ponto0.getHorarios().addElement("20:05");
		ponto0.getHorarios().addElement("20:45");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("22:00");
		ponto0.getHorarios().addElement("22:30");
		ponto0.getHorarios().addElement("23:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERM.FAZ./PQ.INDL.+SUMITOMO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("03/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:25");
		ponto1.getHorarios().addElement("17:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("T.FAZENDA/PQ.INDUSTRIAL");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("02/02/2008");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:25");
		ponto2.getHorarios().addElement("06:10");
		ponto2.getHorarios().addElement("06:40");
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("11:25");
		ponto2.getHorarios().addElement("12:10");
		ponto2.getHorarios().addElement("12:55");
		ponto2.getHorarios().addElement("13:20");
		ponto2.getHorarios().addElement("14:00");
		ponto2.getHorarios().addElement("14:30");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("16:45");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:15");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:00");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("T.FAZENDA/PQ.INDUSTRIAL");
		ponto3.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto3.setValidoAPartirDe("03/02/2008");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:35");
		ponto3.getHorarios().addElement("13:55");
		ponto3.getHorarios().addElement("22:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ANTEX (CHEGADA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("03/02/2008");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("05:50");
		ponto4.getHorarios().addElement("14:10");
		ponto4.getHorarios().addElement("22:15");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ANTEX (SAIDA)");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("03/02/2008");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:15");
		ponto5.getHorarios().addElement("14:35");
		ponto5.getHorarios().addElement("22:45");
		return onibus;
		}
	}
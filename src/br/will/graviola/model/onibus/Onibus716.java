
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus716 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("716 - FRIGORIFICO");
		onibus.setCodigo("716");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO FRIGORIFICO");
		ponto0.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto0.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:40");
		ponto0.getHorarios().addElement("06:10");
		ponto0.getHorarios().addElement("06:50");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:10");
		ponto0.getHorarios().addElement("08:50");
		ponto0.getHorarios().addElement("09:30");
		ponto0.getHorarios().addElement("10:10");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("11:30");
		ponto0.getHorarios().addElement("12:10");
		ponto0.getHorarios().addElement("12:50");
		ponto0.getHorarios().addElement("13:30");
		ponto0.getHorarios().addElement("14:10");
		ponto0.getHorarios().addElement("14:50");
		ponto0.getHorarios().addElement("15:30");
		ponto0.getHorarios().addElement("16:10");
		ponto0.getHorarios().addElement("16:50");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("20:10");
		ponto0.getHorarios().addElement("20:50");
		ponto0.getHorarios().addElement("21:30");
		ponto0.getHorarios().addElement("22:10");
		ponto0.getHorarios().addElement("22:46");
		ponto0.getHorarios().addElement("23:22");
		ponto0.getHorarios().addElement("00:02");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("CAIUA SENTIDO FRIGORIFICO");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:40");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:40");
		ponto1.getHorarios().addElement("09:20");
		ponto1.getHorarios().addElement("10:00");
		ponto1.getHorarios().addElement("10:40");
		ponto1.getHorarios().addElement("11:20");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("12:40");
		ponto1.getHorarios().addElement("13:20");
		ponto1.getHorarios().addElement("14:00");
		ponto1.getHorarios().addElement("14:40");
		ponto1.getHorarios().addElement("15:20");
		ponto1.getHorarios().addElement("16:00");
		ponto1.getHorarios().addElement("16:40");
		ponto1.getHorarios().addElement("17:20");
		ponto1.getHorarios().addElement("18:00");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("19:20");
		ponto1.getHorarios().addElement("20:00");
		ponto1.getHorarios().addElement("20:40");
		ponto1.getHorarios().addElement("21:20");
		ponto1.getHorarios().addElement("22:00");
		ponto1.getHorarios().addElement("22:38");
		ponto1.getHorarios().addElement("23:14");
		ponto1.getHorarios().addElement("23:54");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("CAIUA SENT.MOR.ALTO BELA VISTA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("05:45");
		ponto2.getHorarios().addElement("06:20");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:40");
		ponto2.getHorarios().addElement("08:20");
		ponto2.getHorarios().addElement("09:00");
		ponto2.getHorarios().addElement("09:40");
		ponto2.getHorarios().addElement("10:20");
		ponto2.getHorarios().addElement("11:00");
		ponto2.getHorarios().addElement("11:40");
		ponto2.getHorarios().addElement("12:20");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("13:40");
		ponto2.getHorarios().addElement("14:20");
		ponto2.getHorarios().addElement("15:00");
		ponto2.getHorarios().addElement("15:40");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:40");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("19:00");
		ponto2.getHorarios().addElement("19:40");
		ponto2.getHorarios().addElement("20:20");
		ponto2.getHorarios().addElement("21:00");
		ponto2.getHorarios().addElement("21:40");
		ponto2.getHorarios().addElement("22:20");
		ponto2.getHorarios().addElement("22:56");
		ponto2.getHorarios().addElement("23:34");
		ponto2.getHorarios().addElement("00:10");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("MOR.ALTO DA BELA VISTA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("01/09/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("05:50");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("07:10");
		ponto3.getHorarios().addElement("07:50");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:10");
		ponto3.getHorarios().addElement("09:50");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("11:10");
		ponto3.getHorarios().addElement("11:50");
		ponto3.getHorarios().addElement("12:30");
		ponto3.getHorarios().addElement("13:10");
		ponto3.getHorarios().addElement("13:50");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("15:10");
		ponto3.getHorarios().addElement("15:50");
		ponto3.getHorarios().addElement("16:30");
		ponto3.getHorarios().addElement("17:10");
		ponto3.getHorarios().addElement("17:50");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("19:10");
		ponto3.getHorarios().addElement("19:50");
		ponto3.getHorarios().addElement("20:30");
		ponto3.getHorarios().addElement("21:10");
		ponto3.getHorarios().addElement("21:50");
		ponto3.getHorarios().addElement("22:28");
		ponto3.getHorarios().addElement("23:04");
		ponto3.getHorarios().addElement("23:42");
		return onibus;
		}
	}
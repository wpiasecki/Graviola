
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus670 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("SÃO JORGE");
		onibus.setCodigo("670");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO SAO JORGE");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:30");
		ponto0.getHorarios().addElement("06:00");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("08:31");
		ponto0.getHorarios().addElement("09:01");
		ponto0.getHorarios().addElement("09:33");
		ponto0.getHorarios().addElement("10:03");
		ponto0.getHorarios().addElement("10:35");
		ponto0.getHorarios().addElement("11:05");
		ponto0.getHorarios().addElement("11:37");
		ponto0.getHorarios().addElement("12:12");
		ponto0.getHorarios().addElement("12:47");
		ponto0.getHorarios().addElement("13:22");
		ponto0.getHorarios().addElement("13:57");
		ponto0.getHorarios().addElement("14:32");
		ponto0.getHorarios().addElement("15:07");
		ponto0.getHorarios().addElement("15:42");
		ponto0.getHorarios().addElement("16:17");
		ponto0.getHorarios().addElement("16:53");
		ponto0.getHorarios().addElement("17:27");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:37");
		ponto0.getHorarios().addElement("19:13");
		ponto0.getHorarios().addElement("19:47");
		ponto0.getHorarios().addElement("20:19");
		ponto0.getHorarios().addElement("20:51");
		ponto0.getHorarios().addElement("21:23");
		ponto0.getHorarios().addElement("21:54");
		ponto0.getHorarios().addElement("22:24");
		ponto0.getHorarios().addElement("22:58");
		ponto0.getHorarios().addElement("23:27");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/11/2011");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:00");
		ponto1.getHorarios().addElement("06:30");
		ponto1.getHorarios().addElement("07:00");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("08:30");
		ponto1.getHorarios().addElement("09:02");
		ponto1.getHorarios().addElement("09:32");
		ponto1.getHorarios().addElement("10:04");
		ponto1.getHorarios().addElement("10:34");
		ponto1.getHorarios().addElement("11:06");
		ponto1.getHorarios().addElement("11:37");
		ponto1.getHorarios().addElement("12:12");
		ponto1.getHorarios().addElement("12:47");
		ponto1.getHorarios().addElement("13:22");
		ponto1.getHorarios().addElement("13:57");
		ponto1.getHorarios().addElement("14:32");
		ponto1.getHorarios().addElement("15:07");
		ponto1.getHorarios().addElement("15:42");
		ponto1.getHorarios().addElement("16:17");
		ponto1.getHorarios().addElement("16:51");
		ponto1.getHorarios().addElement("17:27");
		ponto1.getHorarios().addElement("18:01");
		ponto1.getHorarios().addElement("18:37");
		ponto1.getHorarios().addElement("19:11");
		ponto1.getHorarios().addElement("19:46");
		ponto1.getHorarios().addElement("20:18");
		ponto1.getHorarios().addElement("20:50");
		ponto1.getHorarios().addElement("21:22");
		ponto1.getHorarios().addElement("21:53");
		ponto1.getHorarios().addElement("22:24");
		ponto1.getHorarios().addElement("22:55");
		ponto1.getHorarios().addElement("23:30");
		ponto1.getHorarios().addElement("00:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO SAO JORGE");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("16/07/2005");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:00");
		ponto2.getHorarios().addElement("06:30");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:30");
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
		ponto2.getHorarios().addElement("17:00");
		ponto2.getHorarios().addElement("17:30");
		ponto2.getHorarios().addElement("18:00");
		ponto2.getHorarios().addElement("18:30");
		ponto2.getHorarios().addElement("19:30");
		ponto2.getHorarios().addElement("20:30");
		ponto2.getHorarios().addElement("21:30");
		ponto2.getHorarios().addElement("22:30");
		ponto2.getHorarios().addElement("23:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("16/07/2005");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("07:00");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("08:00");
		ponto3.getHorarios().addElement("08:30");
		ponto3.getHorarios().addElement("09:00");
		ponto3.getHorarios().addElement("09:30");
		ponto3.getHorarios().addElement("10:00");
		ponto3.getHorarios().addElement("10:30");
		ponto3.getHorarios().addElement("11:00");
		ponto3.getHorarios().addElement("11:30");
		ponto3.getHorarios().addElement("12:00");
		ponto3.getHorarios().addElement("12:30");
		ponto3.getHorarios().addElement("13:00");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("14:00");
		ponto3.getHorarios().addElement("14:30");
		ponto3.getHorarios().addElement("15:00");
		ponto3.getHorarios().addElement("15:30");
		ponto3.getHorarios().addElement("16:00");
		ponto3.getHorarios().addElement("16:30");
		ponto3.getHorarios().addElement("17:00");
		ponto3.getHorarios().addElement("17:30");
		ponto3.getHorarios().addElement("18:00");
		ponto3.getHorarios().addElement("18:30");
		ponto3.getHorarios().addElement("19:00");
		ponto3.getHorarios().addElement("20:00");
		ponto3.getHorarios().addElement("21:00");
		ponto3.getHorarios().addElement("22:00");
		ponto3.getHorarios().addElement("23:00");
		ponto3.getHorarios().addElement("00:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO SAO JORGE");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("17/07/2005");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:00");
		ponto4.getHorarios().addElement("07:00");
		ponto4.getHorarios().addElement("08:00");
		ponto4.getHorarios().addElement("08:30");
		ponto4.getHorarios().addElement("09:00");
		ponto4.getHorarios().addElement("09:30");
		ponto4.getHorarios().addElement("10:00");
		ponto4.getHorarios().addElement("10:30");
		ponto4.getHorarios().addElement("11:00");
		ponto4.getHorarios().addElement("11:30");
		ponto4.getHorarios().addElement("12:00");
		ponto4.getHorarios().addElement("12:30");
		ponto4.getHorarios().addElement("13:00");
		ponto4.getHorarios().addElement("13:30");
		ponto4.getHorarios().addElement("14:00");
		ponto4.getHorarios().addElement("14:30");
		ponto4.getHorarios().addElement("15:00");
		ponto4.getHorarios().addElement("15:30");
		ponto4.getHorarios().addElement("16:00");
		ponto4.getHorarios().addElement("16:30");
		ponto4.getHorarios().addElement("17:00");
		ponto4.getHorarios().addElement("17:30");
		ponto4.getHorarios().addElement("18:00");
		ponto4.getHorarios().addElement("18:30");
		ponto4.getHorarios().addElement("19:30");
		ponto4.getHorarios().addElement("20:30");
		ponto4.getHorarios().addElement("21:30");
		ponto4.getHorarios().addElement("22:30");
		ponto4.getHorarios().addElement("23:30");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("17/07/2005");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("06:30");
		ponto5.getHorarios().addElement("07:30");
		ponto5.getHorarios().addElement("08:30");
		ponto5.getHorarios().addElement("09:00");
		ponto5.getHorarios().addElement("09:30");
		ponto5.getHorarios().addElement("10:00");
		ponto5.getHorarios().addElement("10:30");
		ponto5.getHorarios().addElement("11:00");
		ponto5.getHorarios().addElement("11:30");
		ponto5.getHorarios().addElement("12:00");
		ponto5.getHorarios().addElement("12:30");
		ponto5.getHorarios().addElement("13:00");
		ponto5.getHorarios().addElement("13:30");
		ponto5.getHorarios().addElement("14:00");
		ponto5.getHorarios().addElement("14:30");
		ponto5.getHorarios().addElement("15:00");
		ponto5.getHorarios().addElement("15:30");
		ponto5.getHorarios().addElement("16:00");
		ponto5.getHorarios().addElement("16:30");
		ponto5.getHorarios().addElement("17:00");
		ponto5.getHorarios().addElement("17:30");
		ponto5.getHorarios().addElement("18:00");
		ponto5.getHorarios().addElement("18:30");
		ponto5.getHorarios().addElement("19:00");
		ponto5.getHorarios().addElement("20:00");
		ponto5.getHorarios().addElement("21:00");
		ponto5.getHorarios().addElement("22:00");
		ponto5.getHorarios().addElement("23:00");
		ponto5.getHorarios().addElement("00:00");
		return onibus;
		}
	}
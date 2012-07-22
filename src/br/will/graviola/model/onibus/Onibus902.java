
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus902 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("STA. FELICIDADE");
		onibus.setCodigo("902");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("CENTRO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:14");
		ponto0.getHorarios().addElement("06:23");
		ponto0.getHorarios().addElement("06:30");
		ponto0.getHorarios().addElement("06:38");
		ponto0.getHorarios().addElement("06:46");
		ponto0.getHorarios().addElement("06:54");
		ponto0.getHorarios().addElement("07:02");
		ponto0.getHorarios().addElement("07:10");
		ponto0.getHorarios().addElement("07:18");
		ponto0.getHorarios().addElement("07:26");
		ponto0.getHorarios().addElement("07:34");
		ponto0.getHorarios().addElement("07:42");
		ponto0.getHorarios().addElement("07:50");
		ponto0.getHorarios().addElement("07:59");
		ponto0.getHorarios().addElement("08:08");
		ponto0.getHorarios().addElement("08:16");
		ponto0.getHorarios().addElement("08:25");
		ponto0.getHorarios().addElement("08:33");
		ponto0.getHorarios().addElement("16:39");
		ponto0.getHorarios().addElement("16:49");
		ponto0.getHorarios().addElement("16:59");
		ponto0.getHorarios().addElement("17:09");
		ponto0.getHorarios().addElement("17:19");
		ponto0.getHorarios().addElement("17:30");
		ponto0.getHorarios().addElement("17:40");
		ponto0.getHorarios().addElement("17:50");
		ponto0.getHorarios().addElement("18:00");
		ponto0.getHorarios().addElement("18:10");
		ponto0.getHorarios().addElement("18:20");
		ponto0.getHorarios().addElement("18:30");
		ponto0.getHorarios().addElement("18:40");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:00");
		ponto0.getHorarios().addElement("19:10");
		ponto0.getHorarios().addElement("19:20");
		ponto0.getHorarios().addElement("19:30");
		ponto0.getHorarios().addElement("19:43");
		ponto0.getHorarios().addElement("19:51");
		ponto0.getHorarios().addElement("20:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SANTA FELICIDADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("05:54");
		ponto1.getHorarios().addElement("06:02");
		ponto1.getHorarios().addElement("06:10");
		ponto1.getHorarios().addElement("06:18");
		ponto1.getHorarios().addElement("06:26");
		ponto1.getHorarios().addElement("06:34");
		ponto1.getHorarios().addElement("06:42");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("06:58");
		ponto1.getHorarios().addElement("07:06");
		ponto1.getHorarios().addElement("07:14");
		ponto1.getHorarios().addElement("07:22");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("07:38");
		ponto1.getHorarios().addElement("07:46");
		ponto1.getHorarios().addElement("07:54");
		ponto1.getHorarios().addElement("08:02");
		ponto1.getHorarios().addElement("08:10");
		ponto1.getHorarios().addElement("08:19");
		ponto1.getHorarios().addElement("08:29");
		ponto1.getHorarios().addElement("08:40");
		ponto1.getHorarios().addElement("08:45");
		ponto1.getHorarios().addElement("08:55");
		ponto1.getHorarios().addElement("17:05");
		ponto1.getHorarios().addElement("17:15");
		ponto1.getHorarios().addElement("17:25");
		ponto1.getHorarios().addElement("17:35");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("17:55");
		ponto1.getHorarios().addElement("18:05");
		ponto1.getHorarios().addElement("18:15");
		ponto1.getHorarios().addElement("18:25");
		ponto1.getHorarios().addElement("18:35");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("18:55");
		ponto1.getHorarios().addElement("19:05");
		ponto1.getHorarios().addElement("19:16");
		ponto1.getHorarios().addElement("19:27");
		ponto1.getHorarios().addElement("19:33");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("CENTRO");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("11/02/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("16:12");
		ponto2.getHorarios().addElement("16:55");
		ponto2.getHorarios().addElement("17:41");
		ponto2.getHorarios().addElement("18:26");
		ponto2.getHorarios().addElement("19:12");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SANTA FELICIDADE");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("11/02/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:40");
		ponto3.getHorarios().addElement("06:51");
		ponto3.getHorarios().addElement("07:15");
		ponto3.getHorarios().addElement("07:28");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("08:05");
		ponto3.getHorarios().addElement("08:28");
		ponto3.getHorarios().addElement("08:42");
		return onibus;
		}
	}
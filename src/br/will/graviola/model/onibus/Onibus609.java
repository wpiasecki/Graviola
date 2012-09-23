
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus609 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("609 - MAD. CIC");
		onibus.setCodigo("609");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA RUI BARBOSA (CHEGADA)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("05/02/2007");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("01:00");
		ponto0.getHorarios().addElement("02:16");
		ponto0.getHorarios().addElement("03:26");
		ponto0.getHorarios().addElement("04:36");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA (SAIDA)");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("05/02/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:10");
		ponto1.getHorarios().addElement("02:30");
		ponto1.getHorarios().addElement("03:40");
		ponto1.getHorarios().addElement("04:50");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CIC");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("05/02/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:43");
		ponto2.getHorarios().addElement("02:58");
		ponto2.getHorarios().addElement("04:08");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA (CHEGADA)");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("03/02/2007");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:00");
		ponto3.getHorarios().addElement("02:16");
		ponto3.getHorarios().addElement("03:26");
		ponto3.getHorarios().addElement("04:36");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA (SAIDA)");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("03/02/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("01:10");
		ponto4.getHorarios().addElement("02:30");
		ponto4.getHorarios().addElement("03:40");
		ponto4.getHorarios().addElement("04:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("TERMINAL CIC");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("03/02/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:43");
		ponto5.getHorarios().addElement("02:58");
		ponto5.getHorarios().addElement("04:08");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PRACA RUI BARBOSA (CHEGADA)");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("22/06/2008");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("01:05");
		ponto6.getHorarios().addElement("01:50");
		ponto6.getHorarios().addElement("02:16");
		ponto6.getHorarios().addElement("03:00");
		ponto6.getHorarios().addElement("03:26");
		ponto6.getHorarios().addElement("04:10");
		ponto6.getHorarios().addElement("04:36");
		ponto6.getHorarios().addElement("05:20");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRACA RUI BARBOSA (SAIDA)");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("22/06/2008");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("01:10");
		ponto7.getHorarios().addElement("02:00");
		ponto7.getHorarios().addElement("02:30");
		ponto7.getHorarios().addElement("03:10");
		ponto7.getHorarios().addElement("03:40");
		ponto7.getHorarios().addElement("04:20");
		ponto7.getHorarios().addElement("04:50");
		ponto7.getHorarios().addElement("05:30");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("TERMINAL CIC");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("22/06/2008");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("00:40");
		ponto8.getHorarios().addElement("01:43");
		ponto8.getHorarios().addElement("02:30");
		ponto8.getHorarios().addElement("02:58");
		ponto8.getHorarios().addElement("03:40");
		ponto8.getHorarios().addElement("04:08");
		ponto8.getHorarios().addElement("04:50");
		return onibus;
		}
	}
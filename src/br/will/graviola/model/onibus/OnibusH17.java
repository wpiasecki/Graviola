
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusH17 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("H17 - ARAUCÁRIA/CATANDUVAS");
		onibus.setCodigo("H17");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("CATANDUVAS");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("17:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("CONTENDA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:45");
		ponto1.getHorarios().addElement("12:00");
		ponto1.getHorarios().addElement("19:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL ARAUCARIA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:35");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("18:40");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERM.ARAUCARIA VIA CPO BASTIAO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("17:20");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("CATANDUVAS VIA CONTENDA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:05");
		ponto4.getHorarios().addElement("07:30");
		ponto4.getHorarios().addElement("11:45");
		ponto4.getHorarios().addElement("19:10");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("CONTENDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:35");
		ponto5.getHorarios().addElement("08:45");
		ponto5.getHorarios().addElement("12:15");
		ponto5.getHorarios().addElement("17:45");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERMINAL ARAUCARIA");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("06:50");
		ponto6.getHorarios().addElement("08:00");
		ponto6.getHorarios().addElement("11:30");
		ponto6.getHorarios().addElement("17:00");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("CATANDUVAS VIA CONTENDA");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("07:20");
		ponto7.getHorarios().addElement("08:30");
		ponto7.getHorarios().addElement("12:00");
		ponto7.getHorarios().addElement("17:30");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("CONTENDA");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("07:35");
		ponto8.getHorarios().addElement("08:45");
		ponto8.getHorarios().addElement("17:45");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("TERMINAL ARAUCARIA");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("06:50");
		ponto9.getHorarios().addElement("08:00");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("TERM.ARAUCARIA VIA CPO BASTIAO");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("17:00");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("CATANDUVAS VIA CONTENDA");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("01/11/2012");
		onibus.getPontos().addElement(ponto11);
		ponto11.getHorarios().addElement("07:20");
		ponto11.getHorarios().addElement("08:30");
		ponto11.getHorarios().addElement("17:30");
		return onibus;
		}
	}

	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusC64 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. CTBA / PINHAIS");
		onibus.setCodigo("C64");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("GUADALUPE/SAIDA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("01/10/2007");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("01:00");
		ponto0.getHorarios().addElement("02:15");
		ponto0.getHorarios().addElement("03:30");
		ponto0.getHorarios().addElement("05:00");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PLANTA KARLA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("01/10/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:30");
		ponto1.getHorarios().addElement("02:50");
		ponto1.getHorarios().addElement("04:05");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERM.GUADALUPE/CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("01/10/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("00:50");
		ponto2.getHorarios().addElement("02:00");
		ponto2.getHorarios().addElement("03:20");
		ponto2.getHorarios().addElement("04:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL PINHAIS");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("01/10/2007");
		onibus.getPontos().addElement(ponto3);
		Ponto ponto4 = new Ponto();
		ponto4.setNome("GUADALUPE/SAIDA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("06/10/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("01:00");
		ponto4.getHorarios().addElement("02:15");
		ponto4.getHorarios().addElement("03:30");
		ponto4.getHorarios().addElement("05:00");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PLANTA KARLA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("06/10/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:30");
		ponto5.getHorarios().addElement("02:50");
		ponto5.getHorarios().addElement("04:05");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("TERM.GUADALUPE/CHEGADA");
		ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto6.setValidoAPartirDe("06/10/2007");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("00:50");
		ponto6.getHorarios().addElement("02:00");
		ponto6.getHorarios().addElement("03:20");
		ponto6.getHorarios().addElement("04:50");
		Ponto ponto7 = new Ponto();
		ponto7.setNome("TERMINAL PINHAIS");
		ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto7.setValidoAPartirDe("06/10/2007");
		onibus.getPontos().addElement(ponto7);
		Ponto ponto8 = new Ponto();
		ponto8.setNome("GUADALUPE/SAIDA");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("07/10/2007");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("01:00");
		ponto8.getHorarios().addElement("02:15");
		ponto8.getHorarios().addElement("03:30");
		ponto8.getHorarios().addElement("05:00");
		Ponto ponto9 = new Ponto();
		ponto9.setNome("PLANTA KARLA");
		ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto9.setValidoAPartirDe("07/10/2007");
		onibus.getPontos().addElement(ponto9);
		ponto9.getHorarios().addElement("01:30");
		ponto9.getHorarios().addElement("02:50");
		ponto9.getHorarios().addElement("04:05");
		Ponto ponto10 = new Ponto();
		ponto10.setNome("TERM.GUADALUPE/CHEGADA");
		ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto10.setValidoAPartirDe("07/10/2007");
		onibus.getPontos().addElement(ponto10);
		ponto10.getHorarios().addElement("00:50");
		ponto10.getHorarios().addElement("02:00");
		ponto10.getHorarios().addElement("03:20");
		ponto10.getHorarios().addElement("04:50");
		Ponto ponto11 = new Ponto();
		ponto11.setNome("TERMINAL PINHAIS");
		ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto11.setValidoAPartirDe("07/10/2007");
		onibus.getPontos().addElement(ponto11);
		return onibus;
		}
	}
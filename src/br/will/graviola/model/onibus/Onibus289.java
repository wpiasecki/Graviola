
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus289 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. JD. GRAZIELA");
		onibus.setCodigo("289");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PRACA RUI BARBOSA/CHEGADA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("00:55");
		ponto0.getHorarios().addElement("01:50");
		ponto0.getHorarios().addElement("02:50");
		ponto0.getHorarios().addElement("03:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA/SAIDA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("08/11/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:05");
		ponto1.getHorarios().addElement("02:00");
		ponto1.getHorarios().addElement("03:00");
		ponto1.getHorarios().addElement("04:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA/CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("13/11/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("00:55");
		ponto2.getHorarios().addElement("01:50");
		ponto2.getHorarios().addElement("02:50");
		ponto2.getHorarios().addElement("03:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PRACA RUI BARBOSA/SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("13/11/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:05");
		ponto3.getHorarios().addElement("02:00");
		ponto3.getHorarios().addElement("03:00");
		ponto3.getHorarios().addElement("04:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA/CHEGADA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("07/11/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:55");
		ponto4.getHorarios().addElement("01:50");
		ponto4.getHorarios().addElement("02:50");
		ponto4.getHorarios().addElement("03:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA/SAIDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("07/11/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:05");
		ponto5.getHorarios().addElement("02:00");
		ponto5.getHorarios().addElement("03:00");
		ponto5.getHorarios().addElement("04:00");
		return onibus;
		}
	}
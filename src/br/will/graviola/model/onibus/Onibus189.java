
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus189 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("MAD. ABRANCHES");
		onibus.setCodigo("189");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("RUI BARBOSA/CHEGADA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("01:00");
		ponto0.getHorarios().addElement("01:50");
		ponto0.getHorarios().addElement("02:50");
		ponto0.getHorarios().addElement("03:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("RUI BARBOSA/SAIDA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("09/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:10");
		ponto1.getHorarios().addElement("02:00");
		ponto1.getHorarios().addElement("03:00");
		ponto1.getHorarios().addElement("04:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("RUI BARBOSA/CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto2.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:00");
		ponto2.getHorarios().addElement("01:50");
		ponto2.getHorarios().addElement("02:50");
		ponto2.getHorarios().addElement("03:50");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("RUI BARBOSA/SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("07/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("01:10");
		ponto3.getHorarios().addElement("02:00");
		ponto3.getHorarios().addElement("03:00");
		ponto3.getHorarios().addElement("04:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("RUI BARBOSA/CHEGADA");
		ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto4.setValidoAPartirDe("08/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("00:50");
		ponto4.getHorarios().addElement("01:50");
		ponto4.getHorarios().addElement("02:50");
		ponto4.getHorarios().addElement("03:50");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("RUI BARBOSA/SAIDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto5.setValidoAPartirDe("08/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:00");
		ponto5.getHorarios().addElement("02:00");
		ponto5.getHorarios().addElement("03:00");
		ponto5.getHorarios().addElement("04:00");
		return onibus;
		}
	}
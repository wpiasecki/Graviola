
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus198 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("198 - E. E. BOA VISTA");
		onibus.setCodigo("198");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA NABIL TACLA (SEDE)");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("08:00");
		ponto0.getHorarios().addElement("10:50");
		ponto0.getHorarios().addElement("16:55");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA SAO CAMILO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("16:40");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL SITES CHEGADA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:15");
		ponto2.getHorarios().addElement("11:30");
		ponto2.getHorarios().addElement("13:10");
		ponto2.getHorarios().addElement("17:30");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITES SAIDA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("11:45");
		ponto3.getHorarios().addElement("13:30");
		ponto3.getHorarios().addElement("17:45");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("BAIRRO - INICIO DE OPERACAO");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("29/10/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("06:10");
		return onibus;
		}
	}
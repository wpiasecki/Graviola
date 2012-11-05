
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus302 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("302 - CENTENÁRIO / RUI BARBOSA");
		onibus.setCodigo("302");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO TUBO EUFRASIO CORREIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("16:58");
		ponto0.getHorarios().addElement("17:23");
		ponto0.getHorarios().addElement("17:33");
		ponto0.getHorarios().addElement("17:38");
		ponto0.getHorarios().addElement("18:03");
		ponto0.getHorarios().addElement("18:28");
		ponto0.getHorarios().addElement("18:38");
		ponto0.getHorarios().addElement("18:44");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto1);
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CENTENARIO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("05/11/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:15");
		ponto2.getHorarios().addElement("06:29");
		ponto2.getHorarios().addElement("06:39");
		ponto2.getHorarios().addElement("06:48");
		ponto2.getHorarios().addElement("06:53");
		ponto2.getHorarios().addElement("07:00");
		ponto2.getHorarios().addElement("07:18");
		ponto2.getHorarios().addElement("07:33");
		ponto2.getHorarios().addElement("07:39");
		ponto2.getHorarios().addElement("07:48");
		ponto2.getHorarios().addElement("07:54");
		ponto2.getHorarios().addElement("08:01");
		ponto2.getHorarios().addElement("18:11");
		return onibus;
		}
	}

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
		onibus.setNome("CENTENÁRIO / RUI BARBOSA");
		onibus.setCodigo("302");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESTACAO TUBO EUFRASIO CORREIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("11/06/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("16:55");
		ponto0.getHorarios().addElement("17:24");
		ponto0.getHorarios().addElement("17:42");
		ponto0.getHorarios().addElement("18:01");
		ponto0.getHorarios().addElement("18:16");
		ponto0.getHorarios().addElement("18:27");
		ponto0.getHorarios().addElement("18:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL CENTENARIO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("11/06/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:03");
		ponto1.getHorarios().addElement("06:14");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:43");
		ponto1.getHorarios().addElement("06:52");
		ponto1.getHorarios().addElement("07:01");
		ponto1.getHorarios().addElement("07:10");
		ponto1.getHorarios().addElement("07:28");
		ponto1.getHorarios().addElement("07:46");
		ponto1.getHorarios().addElement("07:55");
		ponto1.getHorarios().addElement("08:07");
		return onibus;
		}
	}
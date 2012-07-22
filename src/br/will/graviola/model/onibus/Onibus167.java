
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus167 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("FREDOLIN WOLF");
		onibus.setCodigo("167");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("AV MARECHAL FLORIANO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:18");
		ponto0.getHorarios().addElement("08:23");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("BAIRRO FREDOLIN WOLF");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("07:47");
		ponto1.getHorarios().addElement("08:50");
		ponto1.getHorarios().addElement("09:48");
		ponto1.getHorarios().addElement("10:45");
		ponto1.getHorarios().addElement("11:45");
		ponto1.getHorarios().addElement("12:45");
		ponto1.getHorarios().addElement("13:47");
		ponto1.getHorarios().addElement("14:47");
		ponto1.getHorarios().addElement("15:45");
		ponto1.getHorarios().addElement("16:45");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("18:45");
		ponto1.getHorarios().addElement("19:40");
		ponto1.getHorarios().addElement("20:45");
		ponto1.getHorarios().addElement("21:45");
		ponto1.getHorarios().addElement("22:45");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("RUA NESTOR DE CASTRO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("02/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:19");
		ponto2.getHorarios().addElement("08:24");
		ponto2.getHorarios().addElement("09:19");
		ponto2.getHorarios().addElement("10:17");
		ponto2.getHorarios().addElement("11:15");
		ponto2.getHorarios().addElement("12:12");
		ponto2.getHorarios().addElement("13:15");
		ponto2.getHorarios().addElement("14:10");
		ponto2.getHorarios().addElement("15:15");
		ponto2.getHorarios().addElement("16:20");
		ponto2.getHorarios().addElement("17:15");
		ponto2.getHorarios().addElement("18:20");
		ponto2.getHorarios().addElement("19:10");
		ponto2.getHorarios().addElement("20:10");
		ponto2.getHorarios().addElement("21:15");
		ponto2.getHorarios().addElement("22:15");
		ponto2.getHorarios().addElement("23:20");
		return onibus;
		}
	}
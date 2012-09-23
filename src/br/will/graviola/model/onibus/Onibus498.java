
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus498 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("498 - E. E. PINHAIS 2");
		onibus.setCodigo("498");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA CENTRO DE DIA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("07:20");
		ponto0.getHorarios().addElement("11:25");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA ECUMENICA - SEDE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("07:05");
		ponto1.getHorarios().addElement("17:25");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA M.JESUS");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("07:10");
		ponto2.getHorarios().addElement("11:10");
		ponto2.getHorarios().addElement("13:00");
		ponto2.getHorarios().addElement("17:05");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESCOLA M.JESUS (SUB-SEDE)");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("11:35");
		ponto3.getHorarios().addElement("13:25");
		ponto3.getHorarios().addElement("17:35");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ESCOLA NABIL TACLA (SEDE)");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("07:25");
		ponto4.getHorarios().addElement("11:20");
		ponto4.getHorarios().addElement("13:20");
		ponto4.getHorarios().addElement("17:20");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ESCOLA SAO CAMILO");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("10:55");
		ponto5.getHorarios().addElement("16:50");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("INICIO OPERACAO SITES - BAIRRO");
		ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto6.setValidoAPartirDe("16/08/2010");
		onibus.getPontos().addElement(ponto6);
		ponto6.getHorarios().addElement("05:50");
		return onibus;
		}
	}
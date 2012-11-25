
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusX21 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("X21 - REFORCO HAUER / IFPR");
		  onibus.setCodigo("X21");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL HAUER");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("01/10/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("07:00");
		  ponto0.getHorarios().addElement("07:20");
		  ponto0.getHorarios().addElement("12:05");
		  ponto0.getHorarios().addElement("12:35");
		  ponto0.getHorarios().addElement("13:00");
		  ponto0.getHorarios().addElement("17:45");
		  ponto0.getHorarios().addElement("18:15");
		  ponto0.getHorarios().addElement("18:40");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("PONTO RUA SALGADO FILHO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("01/10/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:40");
		  ponto1.getHorarios().addElement("07:30");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("INSTITUTO FEDERAL DO PARANA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("01/10/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("07:10");
		  ponto2.getHorarios().addElement("11:50");
		  ponto2.getHorarios().addElement("12:20");
		  ponto2.getHorarios().addElement("12:50");
		  ponto2.getHorarios().addElement("17:30");
		  ponto2.getHorarios().addElement("18:00");
		  ponto2.getHorarios().addElement("18:30");
		  return onibus;
		  }
	  }
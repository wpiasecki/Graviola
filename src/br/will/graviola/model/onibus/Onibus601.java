
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus601 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("601 - CIC / TIRADENTES");
		  onibus.setCodigo("601");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESTACAO TUBO NESTOR DE CASTRO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("16:45");
		  ponto0.getHorarios().addElement("17:00");
		  ponto0.getHorarios().addElement("17:45");
		  ponto0.getHorarios().addElement("18:00");
		  ponto0.getHorarios().addElement("18:15");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESTACAO TUBO TIRADENTES");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL CIC");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:44");
		  ponto2.getHorarios().addElement("07:05");
		  ponto2.getHorarios().addElement("07:21");
		  ponto2.getHorarios().addElement("17:20");
		  ponto2.getHorarios().addElement("17:40");
		  return onibus;
		  }
	  }
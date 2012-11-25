
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus201 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("201 - CABRAL / BOM RETIRO");
		  onibus.setCodigo("201");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL CABRAL");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("27/08/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("17:17");
		  ponto0.getHorarios().addElement("17:30");
		  ponto0.getHorarios().addElement("17:44");
		  ponto0.getHorarios().addElement("17:58");
		  ponto0.getHorarios().addElement("18:12");
		  ponto0.getHorarios().addElement("18:25");
		  ponto0.getHorarios().addElement("18:38");
		  ponto0.getHorarios().addElement("18:52");
		  ponto0.getHorarios().addElement("19:04");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("N.PECANHA,690/HENRIQUE ITIBERE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("27/08/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("17:02");
		  ponto1.getHorarios().addElement("17:14");
		  ponto1.getHorarios().addElement("17:25");
		  ponto1.getHorarios().addElement("17:39");
		  ponto1.getHorarios().addElement("17:52");
		  ponto1.getHorarios().addElement("18:06");
		  ponto1.getHorarios().addElement("18:20");
		  ponto1.getHorarios().addElement("18:33");
		  ponto1.getHorarios().addElement("18:46");
		  ponto1.getHorarios().addElement("19:00");
		  ponto1.getHorarios().addElement("19:11");
		  ponto1.getHorarios().addElement("22:15");
		  return onibus;
		  }
	  }
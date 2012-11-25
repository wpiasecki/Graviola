
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus831 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("831 - FAZENDINHA / C.RASO");
		  onibus.setCodigo("831");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL CAPAO RASO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("08/10/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:03");
		  ponto0.getHorarios().addElement("06:33");
		  ponto0.getHorarios().addElement("07:03");
		  ponto0.getHorarios().addElement("07:33");
		  ponto0.getHorarios().addElement("08:04");
		  ponto0.getHorarios().addElement("17:40");
		  ponto0.getHorarios().addElement("18:25");
		  ponto0.getHorarios().addElement("18:56");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL FAZENDINHA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("08/10/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("05:47");
		  ponto1.getHorarios().addElement("06:17");
		  ponto1.getHorarios().addElement("06:47");
		  ponto1.getHorarios().addElement("07:17");
		  ponto1.getHorarios().addElement("07:47");
		  ponto1.getHorarios().addElement("17:22");
		  ponto1.getHorarios().addElement("18:07");
		  ponto1.getHorarios().addElement("18:38");
		  ponto1.getHorarios().addElement("19:09");
		  return onibus;
		  }
	  }
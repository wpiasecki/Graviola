
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus893 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("893 - E. E. TOMAZ EDISON 2");
		  onibus.setCodigo("893");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESCOLA TOMAZ EDISON");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("11:40");
		  ponto0.getHorarios().addElement("17:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("BAIRRO - TOMAZ EDISON 2");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:00");
		  return onibus;
		  }
	  }
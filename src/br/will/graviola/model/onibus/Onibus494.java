
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus494 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("494 - E.E. HELENA ANTIPOFF 5");
		  onibus.setCodigo("494");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESCOLA HELENA ANTIPOFF");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("07:15");
		  ponto0.getHorarios().addElement("11:00");
		  ponto0.getHorarios().addElement("13:00");
		  ponto0.getHorarios().addElement("17:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA RENASCER PRADO VELHO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("10:45");
		  ponto1.getHorarios().addElement("16:45");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("GARAGEM");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:00");
		  ponto2.getHorarios().addElement("12:00");
		  return onibus;
		  }
	  }
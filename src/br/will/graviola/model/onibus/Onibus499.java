
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus499 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("499 - E. E. HELENA ANTIPOFF 4");
		  onibus.setCodigo("499");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESCOLA HELENA ANTIPOFF");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("07:30");
		  ponto0.getHorarios().addElement("11:20");
		  ponto0.getHorarios().addElement("13:00");
		  ponto0.getHorarios().addElement("16:50");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA RENASCER PRADO VELHO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("10:45");
		  ponto1.getHorarios().addElement("17:15");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("GARAGEM");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:00");
		  return onibus;
		  }
	  }
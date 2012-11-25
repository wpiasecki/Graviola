
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus599 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("599 - E. E. HELENA ANTIPOFF 1");
		  onibus.setCodigo("599");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO H.ANTIPOFF-RENASCER BOQ");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:00");
		  ponto0.getHorarios().addElement("12:45");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA HELENA ANTIPOFF");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:15");
		  ponto1.getHorarios().addElement("11:10");
		  ponto1.getHorarios().addElement("13:30");
		  ponto1.getHorarios().addElement("16:50");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESCOLA RENASCER PRADO VELHO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("26/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("10:45");
		  ponto2.getHorarios().addElement("17:15");
		  return onibus;
		  }
	  }
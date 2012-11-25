
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus391 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("391 - E. E. SAO FRANCISCO DE ASSIS 1");
		  onibus.setCodigo("391");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:00");
		  ponto0.getHorarios().addElement("12:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA ALTERNATIVA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("11:00");
		  ponto1.getHorarios().addElement("16:45");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESCOLA SAO FRANCISCO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("07:30");
		  ponto2.getHorarios().addElement("11:20");
		  ponto2.getHorarios().addElement("13:30");
		  ponto2.getHorarios().addElement("17:00");
		  return onibus;
		  }
	  }
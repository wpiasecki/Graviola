
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusI32 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("I32 - ARAUCARIA / CAMPO LARGO");
		  onibus.setCodigo("I32");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL CAMPO LARGO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("28/11/2011");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:00");
		  ponto0.getHorarios().addElement("07:30");
		  ponto0.getHorarios().addElement("12:00");
		  ponto0.getHorarios().addElement("13:00");
		  ponto0.getHorarios().addElement("17:30");
		  ponto0.getHorarios().addElement("18:30");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ARAUCARIA-RODOVIARIA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("28/11/2011");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:00");
		  ponto1.getHorarios().addElement("07:00");
		  ponto1.getHorarios().addElement("12:00");
		  ponto1.getHorarios().addElement("13:00");
		  ponto1.getHorarios().addElement("17:30");
		  ponto1.getHorarios().addElement("18:30");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusA73 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("A73 - CTBA / JD. MARROCOS");
		  onibus.setCodigo("A73");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("JARDIM MARROCOS");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("20/08/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("05:50");
		  ponto0.getHorarios().addElement("07:07");
		  ponto0.getHorarios().addElement("08:25");
		  ponto0.getHorarios().addElement("12:40");
		  ponto0.getHorarios().addElement("18:00");
		  ponto0.getHorarios().addElement("20:48");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("MUELLER");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("20/08/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:27");
		  ponto1.getHorarios().addElement("07:46");
		  ponto1.getHorarios().addElement("12:05");
		  ponto1.getHorarios().addElement("17:15");
		  ponto1.getHorarios().addElement("18:40");
		  ponto1.getHorarios().addElement("20:05");
		  ponto1.getHorarios().addElement("21:30");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus546 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("546 - S. CERCADO / BOQUEIRÃO");
		  onibus.setCodigo("546");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL BOQUEIRAO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:44");
		  ponto0.getHorarios().addElement("06:49");
		  ponto0.getHorarios().addElement("06:54");
		  ponto0.getHorarios().addElement("07:11");
		  ponto0.getHorarios().addElement("07:17");
		  ponto0.getHorarios().addElement("07:23");
		  ponto0.getHorarios().addElement("07:40");
		  ponto0.getHorarios().addElement("07:45");
		  ponto0.getHorarios().addElement("07:51");
		  ponto0.getHorarios().addElement("17:41");
		  ponto0.getHorarios().addElement("17:53");
		  ponto0.getHorarios().addElement("18:08");
		  ponto0.getHorarios().addElement("18:16");
		  ponto0.getHorarios().addElement("18:23");
		  ponto0.getHorarios().addElement("18:38");
		  ponto0.getHorarios().addElement("18:46");
		  ponto0.getHorarios().addElement("18:53");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL SITIO CERCADO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:30");
		  ponto1.getHorarios().addElement("06:36");
		  ponto1.getHorarios().addElement("06:41");
		  ponto1.getHorarios().addElement("06:58");
		  ponto1.getHorarios().addElement("07:04");
		  ponto1.getHorarios().addElement("07:09");
		  ponto1.getHorarios().addElement("07:26");
		  ponto1.getHorarios().addElement("07:32");
		  ponto1.getHorarios().addElement("07:38");
		  ponto1.getHorarios().addElement("07:54");
		  ponto1.getHorarios().addElement("08:00");
		  ponto1.getHorarios().addElement("17:55");
		  ponto1.getHorarios().addElement("18:02");
		  ponto1.getHorarios().addElement("18:09");
		  ponto1.getHorarios().addElement("18:24");
		  ponto1.getHorarios().addElement("18:32");
		  ponto1.getHorarios().addElement("18:39");
		  ponto1.getHorarios().addElement("18:53");
		  return onibus;
		  }
	  }
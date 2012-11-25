
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusX20 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("X20 - PORTAO/SITIO CERCADO");
		  onibus.setCodigo("X20");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL PORTAO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("16:44");
		  ponto0.getHorarios().addElement("16:53");
		  ponto0.getHorarios().addElement("16:57");
		  ponto0.getHorarios().addElement("17:03");
		  ponto0.getHorarios().addElement("17:08");
		  ponto0.getHorarios().addElement("17:35");
		  ponto0.getHorarios().addElement("17:46");
		  ponto0.getHorarios().addElement("17:52");
		  ponto0.getHorarios().addElement("17:58");
		  ponto0.getHorarios().addElement("18:03");
		  ponto0.getHorarios().addElement("18:30");
		  ponto0.getHorarios().addElement("18:40");
		  ponto0.getHorarios().addElement("18:46");
		  ponto0.getHorarios().addElement("18:51");
		  ponto0.getHorarios().addElement("18:57");
		  ponto0.getHorarios().addElement("19:24");
		  return onibus;
		  }
	  }
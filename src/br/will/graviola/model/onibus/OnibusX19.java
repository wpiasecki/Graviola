
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusX19 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("X19 - ESPECIAL HASDRUBAL BELLEGARD");
		  onibus.setCodigo("X19");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL PINHEIRINHO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("04/06/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:15");
		  ponto0.getHorarios().addElement("07:05");
		  ponto0.getHorarios().addElement("17:47");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("HASDRUBAL BELLEGARD");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("04/06/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:35");
		  ponto1.getHorarios().addElement("07:25");
		  ponto1.getHorarios().addElement("17:25");
		  ponto1.getHorarios().addElement("18:10");
		  return onibus;
		  }
	  }
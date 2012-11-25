
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus539 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("539 - REFORÇO TERMINAL");
		  onibus.setCodigo("539");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("REFORCO BAIRRO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:55");
		  ponto0.getHorarios().addElement("07:09");
		  ponto0.getHorarios().addElement("07:23");
		  ponto0.getHorarios().addElement("07:37");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL BOQUEIRAO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:02");
		  ponto1.getHorarios().addElement("07:16");
		  ponto1.getHorarios().addElement("07:30");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus690 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("690 - V.JULIANA");
		  onibus.setCodigo("690");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL PINHEIRINHO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("16/01/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:05");
		  ponto0.getHorarios().addElement("07:20");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("BAIRRO V.JULIANA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("16/01/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("05:15");
		  ponto1.getHorarios().addElement("06:40");
		  ponto1.getHorarios().addElement("08:00");
		  return onibus;
		  }
	  }
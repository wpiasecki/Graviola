
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus994 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("994 - E.E. NABIL TACLA 1");
		  onibus.setCodigo("994");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESCOLA NABIL TACLA (SEDE)");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("08/11/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("10:50");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("BAIRRO - NABIL TACLA 1");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("08/11/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:00");
		  return onibus;
		  }
	  }
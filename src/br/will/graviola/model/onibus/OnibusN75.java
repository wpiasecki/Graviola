
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusN75 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("N75 - CTBA / TIMBU (RAPIDO)");
		  onibus.setCodigo("N75");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL GUADALUPE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("17/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL JD.PAULISTA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("17/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:00");
		  return onibus;
		  }
	  }
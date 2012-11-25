
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusE70 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("E70 - CTBA / PUC");
		  onibus.setCodigo("E70");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("CAMPUS DA PUC");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL GUADALUPE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:38");
		  ponto1.getHorarios().addElement("18:12");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("CAMPUS DA PUC");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("01/08/2009");
		  onibus.getPontos().addElement(ponto2);
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL GUADALUPE");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("01/08/2009");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("06:40");
		  return onibus;
		  }
	  }
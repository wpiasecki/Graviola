
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusN70 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("N70 - CTBA / C. GDE  SUL (RAPIDO)");
		  onibus.setCodigo("N70");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL C.GRANDE DO SUL");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("06/08/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:57");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERM. PAULISTA SENT.CURITIBA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("06/08/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:09");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL GUADALUPE2");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("06/08/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("17:39");
		  ponto2.getHorarios().addElement("18:03");
		  return onibus;
		  }
	  }
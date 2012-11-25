
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusG12 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("G12 - A. BRANCA / FAZ. RIO GRANDE");
		  onibus.setCodigo("G12");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("AREIA BRANCA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("01/03/2004");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:30");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL FAZENDA RIO GRANDE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("01/03/2004");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("16:25");
		  ponto1.getHorarios().addElement("17:25");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("AREIA BRANCA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("07/03/2004");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:30");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL FAZENDA RIO GRANDE");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("07/03/2004");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("17:25");
		  return onibus;
		  }
	  }
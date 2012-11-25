
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusZ01 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("Z01 - UNIBRASIL / TUBO DETRAN");
		  onibus.setCodigo("Z01");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("FACULDADE UNIBRASIL");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("30/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("22:05");
		  ponto0.getHorarios().addElement("22:15");
		  ponto0.getHorarios().addElement("22:25");
		  ponto0.getHorarios().addElement("22:35");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TUBO DETRAN/ESPECIAL");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("30/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus199 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("199 - E. E. APAE 5");
		  onibus.setCodigo("199");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("COMPLEXO APAE SANTA FELICIDADE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("16:50");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA TIA MARIA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("08:00");
		  ponto1.getHorarios().addElement("16:30");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("GARAGEM");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:00");
		  return onibus;
		  }
	  }
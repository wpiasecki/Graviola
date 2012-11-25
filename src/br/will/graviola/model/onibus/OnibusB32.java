
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusB32 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("B32 - MARACANÃ / STA. CÂNDIDA");
		  onibus.setCodigo("B32");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO RIO VERDE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:27");
		  ponto0.getHorarios().addElement("06:36");
		  ponto0.getHorarios().addElement("06:45");
		  ponto0.getHorarios().addElement("06:56");
		  ponto0.getHorarios().addElement("07:08");
		  ponto0.getHorarios().addElement("07:20");
		  ponto0.getHorarios().addElement("07:35");
		  ponto0.getHorarios().addElement("07:46");
		  ponto0.getHorarios().addElement("08:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL SANTA CANDIDA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto1);
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus340 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("340 - DETRAN / B. ALTO");
		  onibus.setCodigo("340");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESTACAO TUBO DETRAN");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("30/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL BAIRRO ALTO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("30/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:27");
		  ponto1.getHorarios().addElement("06:52");
		  ponto1.getHorarios().addElement("07:15");
		  ponto1.getHorarios().addElement("07:39");
		  ponto1.getHorarios().addElement("08:02");
		  ponto1.getHorarios().addElement("17:00");
		  ponto1.getHorarios().addElement("17:20");
		  ponto1.getHorarios().addElement("17:40");
		  ponto1.getHorarios().addElement("18:00");
		  ponto1.getHorarios().addElement("18:20");
		  ponto1.getHorarios().addElement("18:40");
		  ponto1.getHorarios().addElement("19:00");
		  ponto1.getHorarios().addElement("19:20");
		  return onibus;
		  }
	  }
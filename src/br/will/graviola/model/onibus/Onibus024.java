
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus024 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("024 - C. RASO / CAMP. SIQUEIRA");
		  onibus.setCodigo("024");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESTACAO TUBO MERCES");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("27/08/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("17:57");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL CAMPINA DO SIQUEIRA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("27/08/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:00");
		  ponto1.getHorarios().addElement("07:27");
		  ponto1.getHorarios().addElement("07:54");
		  ponto1.getHorarios().addElement("08:20");
		  ponto1.getHorarios().addElement("18:07");
		  ponto1.getHorarios().addElement("18:20");
		  ponto1.getHorarios().addElement("22:00");
		  ponto1.getHorarios().addElement("22:25");
		  ponto1.getHorarios().addElement("22:40");
		  ponto1.getHorarios().addElement("23:05");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL CAPAO RASO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("27/08/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("07:00");
		  ponto2.getHorarios().addElement("07:27");
		  ponto2.getHorarios().addElement("07:54");
		  ponto2.getHorarios().addElement("08:20");
		  ponto2.getHorarios().addElement("17:53");
		  ponto2.getHorarios().addElement("18:35");
		  ponto2.getHorarios().addElement("22:04");
		  ponto2.getHorarios().addElement("22:20");
		  ponto2.getHorarios().addElement("22:45");
		  ponto2.getHorarios().addElement("23:00");
		  return onibus;
		  }
	  }
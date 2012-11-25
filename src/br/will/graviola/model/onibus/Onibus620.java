
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus620 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("620 - STA. CRUZ");
		  onibus.setCodigo("620");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL CAPAO RASO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("05/11/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("17:05");
		  ponto0.getHorarios().addElement("17:35");
		  ponto0.getHorarios().addElement("17:51");
		  ponto0.getHorarios().addElement("18:02");
		  ponto0.getHorarios().addElement("18:18");
		  ponto0.getHorarios().addElement("18:28");
		  ponto0.getHorarios().addElement("18:35");
		  ponto0.getHorarios().addElement("18:43");
		  ponto0.getHorarios().addElement("18:50");
		  ponto0.getHorarios().addElement("18:58");
		  ponto0.getHorarios().addElement("19:13");
		  ponto0.getHorarios().addElement("19:30");
		  ponto0.getHorarios().addElement("22:06");
		  ponto0.getHorarios().addElement("22:19");
		  ponto0.getHorarios().addElement("22:32");
		  ponto0.getHorarios().addElement("22:50");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL CIC");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("05/11/2012");
		  onibus.getPontos().addElement(ponto1);
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("R. SEN.ACCIOLY FILHO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("05/11/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("17:18");
		  ponto2.getHorarios().addElement("17:45");
		  ponto2.getHorarios().addElement("18:02");
		  ponto2.getHorarios().addElement("18:12");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("FACULDADE SANTA CRUZ");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("05/11/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("18:27");
		  ponto3.getHorarios().addElement("18:35");
		  ponto3.getHorarios().addElement("18:43");
		  ponto3.getHorarios().addElement("18:50");
		  ponto3.getHorarios().addElement("19:06");
		  ponto3.getHorarios().addElement("19:21");
		  ponto3.getHorarios().addElement("22:00");
		  ponto3.getHorarios().addElement("22:13");
		  ponto3.getHorarios().addElement("22:25");
		  ponto3.getHorarios().addElement("22:40");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("POSIGRAF");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto4.setValidoAPartirDe("05/11/2012");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("23:02");
		  return onibus;
		  }
	  }
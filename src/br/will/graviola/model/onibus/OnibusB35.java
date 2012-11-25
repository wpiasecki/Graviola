
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusB35 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("B35 - PORTEIRA / PALOMA");
		  onibus.setCodigo("B35");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO PALOMA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("04/10/2010");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("05:25");
		  ponto0.getHorarios().addElement("06:15");
		  ponto0.getHorarios().addElement("07:05");
		  ponto0.getHorarios().addElement("07:45");
		  ponto0.getHorarios().addElement("08:30");
		  ponto0.getHorarios().addElement("17:30");
		  ponto0.getHorarios().addElement("18:18");
		  ponto0.getHorarios().addElement("19:08");
		  ponto0.getHorarios().addElement("19:48");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("BAIRRO PORTEIRA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("04/10/2010");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("05:53");
		  ponto1.getHorarios().addElement("06:43");
		  ponto1.getHorarios().addElement("07:25");
		  ponto1.getHorarios().addElement("08:10");
		  ponto1.getHorarios().addElement("17:10");
		  ponto1.getHorarios().addElement("17:55");
		  ponto1.getHorarios().addElement("18:40");
		  ponto1.getHorarios().addElement("19:28");
		  ponto1.getHorarios().addElement("20:10");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("V.MARIA DO ROSARIO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("04/10/2010");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("05:50");
		  ponto2.getHorarios().addElement("06:40");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL GUARAITUBA / PALOMA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("04/10/2010");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("06:05");
		  ponto3.getHorarios().addElement("06:55");
		  ponto3.getHorarios().addElement("07:35");
		  ponto3.getHorarios().addElement("08:20");
		  ponto3.getHorarios().addElement("17:20");
		  ponto3.getHorarios().addElement("18:08");
		  ponto3.getHorarios().addElement("18:56");
		  ponto3.getHorarios().addElement("19:38");
		  ponto3.getHorarios().addElement("20:20");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("TERMINAL GUARAITUBA / PORTEIRA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto4.setValidoAPartirDe("04/10/2010");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("05:37");
		  ponto4.getHorarios().addElement("06:27");
		  ponto4.getHorarios().addElement("07:17");
		  ponto4.getHorarios().addElement("07:57");
		  ponto4.getHorarios().addElement("08:42");
		  ponto4.getHorarios().addElement("17:00");
		  ponto4.getHorarios().addElement("17:38");
		  ponto4.getHorarios().addElement("18:28");
		  ponto4.getHorarios().addElement("19:20");
		  ponto4.getHorarios().addElement("20:00");
		  return onibus;
		  }
	  }
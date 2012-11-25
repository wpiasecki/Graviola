
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus309 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("309 - MAD. CENTENÁRIO");
		  onibus.setCodigo("309");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("RUI BARBOSA/CHEGADA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("12/09/2011");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("01:50");
		  ponto0.getHorarios().addElement("02:50");
		  ponto0.getHorarios().addElement("03:50");
		  ponto0.getHorarios().addElement("04:50");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("RUI BARBOSA/SAIDA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("12/09/2011");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("01:10");
		  ponto1.getHorarios().addElement("02:00");
		  ponto1.getHorarios().addElement("03:00");
		  ponto1.getHorarios().addElement("04:00");
		  ponto1.getHorarios().addElement("05:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL CENTENARIO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("12/09/2011");
		  onibus.getPontos().addElement(ponto2);
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("RUI BARBOSA/CHEGADA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("17/09/2011");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("01:50");
		  ponto3.getHorarios().addElement("02:50");
		  ponto3.getHorarios().addElement("03:50");
		  ponto3.getHorarios().addElement("04:50");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("RUI BARBOSA/SAIDA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto4.setValidoAPartirDe("17/09/2011");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("01:10");
		  ponto4.getHorarios().addElement("02:00");
		  ponto4.getHorarios().addElement("03:00");
		  ponto4.getHorarios().addElement("04:00");
		  ponto4.getHorarios().addElement("05:00");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERMINAL CENTENARIO");
		  ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto5.setValidoAPartirDe("17/09/2011");
		  onibus.getPontos().addElement(ponto5);
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("RUI BARBOSA/CHEGADA");
		  ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto6.setValidoAPartirDe("18/09/2011");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("01:50");
		  ponto6.getHorarios().addElement("02:20");
		  ponto6.getHorarios().addElement("02:50");
		  ponto6.getHorarios().addElement("03:20");
		  ponto6.getHorarios().addElement("03:50");
		  ponto6.getHorarios().addElement("04:20");
		  ponto6.getHorarios().addElement("04:50");
		  Ponto ponto7 = new Ponto();
		  ponto7.setNome("RUI BARBOSA/SAIDA");
		  ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto7.setValidoAPartirDe("18/09/2011");
		  onibus.getPontos().addElement(ponto7);
		  ponto7.getHorarios().addElement("01:10");
		  ponto7.getHorarios().addElement("01:40");
		  ponto7.getHorarios().addElement("02:00");
		  ponto7.getHorarios().addElement("02:30");
		  ponto7.getHorarios().addElement("03:00");
		  ponto7.getHorarios().addElement("03:30");
		  ponto7.getHorarios().addElement("04:00");
		  ponto7.getHorarios().addElement("04:30");
		  ponto7.getHorarios().addElement("05:00");
		  ponto7.getHorarios().addElement("05:30");
		  Ponto ponto8 = new Ponto();
		  ponto8.setNome("TERMINAL CENTENARIO");
		  ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto8.setValidoAPartirDe("18/09/2011");
		  onibus.getPontos().addElement(ponto8);
		  ponto8.getHorarios().addElement("05:00");
		  return onibus;
		  }
	  }
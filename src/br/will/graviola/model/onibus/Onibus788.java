
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus788 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("788 - MAD. V. VELHA");
		  onibus.setCodigo("788");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("RUI BARBOSA/CHEGADA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("10/07/2006");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("00:55");
		  ponto0.getHorarios().addElement("01:53");
		  ponto0.getHorarios().addElement("02:50");
		  ponto0.getHorarios().addElement("03:50");
		  ponto0.getHorarios().addElement("04:50");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("RUI BARBOSA/SAIDA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("10/07/2006");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("01:08");
		  ponto1.getHorarios().addElement("02:00");
		  ponto1.getHorarios().addElement("03:00");
		  ponto1.getHorarios().addElement("04:00");
		  ponto1.getHorarios().addElement("05:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("RUI BARBOSA/CHEGADA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("03/02/2007");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("00:55");
		  ponto2.getHorarios().addElement("01:53");
		  ponto2.getHorarios().addElement("02:50");
		  ponto2.getHorarios().addElement("03:50");
		  ponto2.getHorarios().addElement("04:50");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("RUI BARBOSA/SAIDA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("03/02/2007");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("01:08");
		  ponto3.getHorarios().addElement("02:00");
		  ponto3.getHorarios().addElement("03:00");
		  ponto3.getHorarios().addElement("04:00");
		  ponto3.getHorarios().addElement("05:00");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("RUI BARBOSA/CHEGADA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("04/02/2007");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("00:55");
		  ponto4.getHorarios().addElement("01:53");
		  ponto4.getHorarios().addElement("02:50");
		  ponto4.getHorarios().addElement("03:50");
		  ponto4.getHorarios().addElement("04:50");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("RUI BARBOSA/SAIDA");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("04/02/2007");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("01:08");
		  ponto5.getHorarios().addElement("02:00");
		  ponto5.getHorarios().addElement("03:00");
		  ponto5.getHorarios().addElement("04:00");
		  ponto5.getHorarios().addElement("05:00");
		  return onibus;
		  }
	  }
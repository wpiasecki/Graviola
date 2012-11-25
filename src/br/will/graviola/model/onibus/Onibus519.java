
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus519 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("519 - MAD. S. FRANCISCO / IGUAPE");
		  onibus.setCodigo("519");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("PRACA CARLOS GOMES");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("31/07/2009");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("00:30");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL BOQUEIRAO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("31/07/2009");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("00:05");
		  ponto1.getHorarios().addElement("00:55");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL HAUER CHEGADA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("31/07/2009");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("01:05");
		  ponto2.getHorarios().addElement("02:05");
		  ponto2.getHorarios().addElement("03:05");
		  ponto2.getHorarios().addElement("04:05");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL HAUER SAIDA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("31/07/2009");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("01:15");
		  ponto3.getHorarios().addElement("02:15");
		  ponto3.getHorarios().addElement("03:15");
		  ponto3.getHorarios().addElement("04:15");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("PRACA CARLOS GOMES");
		  ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto4.setValidoAPartirDe("01/08/2009");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("00:30");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERMINAL BOQUEIRAO");
		  ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto5.setValidoAPartirDe("01/08/2009");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("00:05");
		  ponto5.getHorarios().addElement("00:55");
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("TERMINAL HAUER CHEGADA");
		  ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto6.setValidoAPartirDe("01/08/2009");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("01:05");
		  ponto6.getHorarios().addElement("02:05");
		  ponto6.getHorarios().addElement("03:05");
		  ponto6.getHorarios().addElement("04:05");
		  Ponto ponto7 = new Ponto();
		  ponto7.setNome("TERMINAL HAUER SAIDA");
		  ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto7.setValidoAPartirDe("01/08/2009");
		  onibus.getPontos().addElement(ponto7);
		  ponto7.getHorarios().addElement("01:15");
		  ponto7.getHorarios().addElement("02:15");
		  ponto7.getHorarios().addElement("03:15");
		  ponto7.getHorarios().addElement("04:15");
		  Ponto ponto8 = new Ponto();
		  ponto8.setNome("PRACA CARLOS GOMES");
		  ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto8.setValidoAPartirDe("02/08/2009");
		  onibus.getPontos().addElement(ponto8);
		  ponto8.getHorarios().addElement("00:30");
		  Ponto ponto9 = new Ponto();
		  ponto9.setNome("TERMINAL BOQUEIRAO");
		  ponto9.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto9.setValidoAPartirDe("02/08/2009");
		  onibus.getPontos().addElement(ponto9);
		  ponto9.getHorarios().addElement("00:05");
		  ponto9.getHorarios().addElement("00:55");
		  Ponto ponto10 = new Ponto();
		  ponto10.setNome("TERMINAL HAUER CHEGADA");
		  ponto10.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto10.setValidoAPartirDe("02/08/2009");
		  onibus.getPontos().addElement(ponto10);
		  ponto10.getHorarios().addElement("01:05");
		  ponto10.getHorarios().addElement("02:05");
		  ponto10.getHorarios().addElement("03:05");
		  ponto10.getHorarios().addElement("04:05");
		  Ponto ponto11 = new Ponto();
		  ponto11.setNome("TERMINAL HAUER SAIDA");
		  ponto11.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto11.setValidoAPartirDe("02/08/2009");
		  onibus.getPontos().addElement(ponto11);
		  ponto11.getHorarios().addElement("01:15");
		  ponto11.getHorarios().addElement("02:15");
		  ponto11.getHorarios().addElement("03:15");
		  ponto11.getHorarios().addElement("04:15");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusE73 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("E73 - CTBA / JD. CRUZEIRO");
		  onibus.setCodigo("E73");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL GUADALUPE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("25/04/2011");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:30");
		  ponto0.getHorarios().addElement("11:20");
		  ponto0.getHorarios().addElement("16:25");
		  ponto0.getHorarios().addElement("17:07");
		  ponto0.getHorarios().addElement("18:05");
		  ponto0.getHorarios().addElement("18:25");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("BAIRRO JD. CRUZEIRO");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("25/04/2011");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("05:45");
		  ponto1.getHorarios().addElement("06:45");
		  ponto1.getHorarios().addElement("06:55");
		  ponto1.getHorarios().addElement("07:10");
		  ponto1.getHorarios().addElement("12:10");
		  ponto1.getHorarios().addElement("17:15");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL GUADALUPE");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("14/06/2008");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:30");
		  ponto2.getHorarios().addElement("11:20");
		  ponto2.getHorarios().addElement("16:30");
		  ponto2.getHorarios().addElement("18:05");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("BAIRRO JD. CRUZEIRO");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("14/06/2008");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("05:50");
		  ponto3.getHorarios().addElement("07:05");
		  ponto3.getHorarios().addElement("12:10");
		  ponto3.getHorarios().addElement("17:15");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("TERMINAL GUADALUPE");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("15/06/2008");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("06:30");
		  ponto4.getHorarios().addElement("18:05");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("BAIRRO JD. CRUZEIRO");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("15/06/2008");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("05:50");
		  ponto5.getHorarios().addElement("07:05");
		  return onibus;
		  }
	  }
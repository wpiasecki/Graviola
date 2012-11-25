
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusB81 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("B81 - CTBA / COLOMBO (GUARACI)");
		  onibus.setCodigo("B81");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("COLOMBO (GUARACI)");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("30/06/2008");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:00");
		  ponto0.getHorarios().addElement("08:00");
		  ponto0.getHorarios().addElement("17:20");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL GUADALUPE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("30/06/2008");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:00");
		  ponto1.getHorarios().addElement("09:00");
		  ponto1.getHorarios().addElement("18:20");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("COLOMBO (GUARACI)");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("28/06/2008");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:00");
		  ponto2.getHorarios().addElement("08:00");
		  ponto2.getHorarios().addElement("11:30");
		  ponto2.getHorarios().addElement("13:30");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL GUADALUPE");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("28/06/2008");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("07:00");
		  ponto3.getHorarios().addElement("09:00");
		  ponto3.getHorarios().addElement("12:30");
		  ponto3.getHorarios().addElement("14:30");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("COLOMBO (GUARACI)");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("29/06/2008");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("08:00");
		  ponto4.getHorarios().addElement("14:00");
		  ponto4.getHorarios().addElement("16:00");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERMINAL GUADALUPE");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("29/06/2008");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("09:00");
		  ponto5.getHorarios().addElement("15:00");
		  ponto5.getHorarios().addElement("17:00");
		  return onibus;
		  }
	  }
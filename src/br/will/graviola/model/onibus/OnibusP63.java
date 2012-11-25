
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusP63 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("P63 - CTBA / BATEIAS");
		  onibus.setCodigo("P63");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO BATEIAS");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("30/03/2011");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("05:10");
		  ponto0.getHorarios().addElement("07:00");
		  ponto0.getHorarios().addElement("10:00");
		  ponto0.getHorarios().addElement("12:00");
		  ponto0.getHorarios().addElement("16:20");
		  ponto0.getHorarios().addElement("18:40");
		  ponto0.getHorarios().addElement("21:00");
		  ponto0.getHorarios().addElement("23:20");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("FERNANDO MOREIRA (CHEGADA)");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("30/03/2011");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("08:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("FERNANDO MOREIRA (SAIDA)");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("30/03/2011");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:05");
		  ponto2.getHorarios().addElement("08:30");
		  ponto2.getHorarios().addElement("11:00");
		  ponto2.getHorarios().addElement("15:10");
		  ponto2.getHorarios().addElement("17:30");
		  ponto2.getHorarios().addElement("19:50");
		  ponto2.getHorarios().addElement("22:20");
		  ponto2.getHorarios().addElement("01:10");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("BAIRRO BATEIAS");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("08/03/2003");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("05:15");
		  ponto3.getHorarios().addElement("07:35");
		  ponto3.getHorarios().addElement("10:00");
		  ponto3.getHorarios().addElement("12:00");
		  ponto3.getHorarios().addElement("16:20");
		  ponto3.getHorarios().addElement("18:40");
		  ponto3.getHorarios().addElement("21:00");
		  ponto3.getHorarios().addElement("23:10");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("FERNANDO MOREIRA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto4.setValidoAPartirDe("08/03/2003");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("06:25");
		  ponto4.getHorarios().addElement("09:00");
		  ponto4.getHorarios().addElement("11:00");
		  ponto4.getHorarios().addElement("15:10");
		  ponto4.getHorarios().addElement("17:30");
		  ponto4.getHorarios().addElement("19:50");
		  ponto4.getHorarios().addElement("22:10");
		  ponto4.getHorarios().addElement("01:00");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("BAIRRO BATEIAS");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("09/03/2003");
		  onibus.getPontos().addElement(ponto5);
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("FERNANDO MOREIRA");
		  ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto6.setValidoAPartirDe("09/03/2003");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("01:00");
		  return onibus;
		  }
	  }
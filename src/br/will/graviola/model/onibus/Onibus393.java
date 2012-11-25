
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus393 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("393 - C. IMBUIA / PQ. BARIGUI");
		  onibus.setCodigo("393");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO CAPAO DA IMBUIA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("26/03/2007");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:30");
		  ponto0.getHorarios().addElement("08:30");
		  ponto0.getHorarios().addElement("10:30");
		  ponto0.getHorarios().addElement("12:30");
		  ponto0.getHorarios().addElement("14:30");
		  ponto0.getHorarios().addElement("16:30");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("PARQUE BARIGUI");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("26/03/2007");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:30");
		  ponto1.getHorarios().addElement("09:30");
		  ponto1.getHorarios().addElement("11:30");
		  ponto1.getHorarios().addElement("13:30");
		  ponto1.getHorarios().addElement("15:30");
		  ponto1.getHorarios().addElement("17:40");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL SITES ANTI-HORARIO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("26/03/2007");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:50");
		  ponto2.getHorarios().addElement("08:50");
		  ponto2.getHorarios().addElement("10:50");
		  ponto2.getHorarios().addElement("12:50");
		  ponto2.getHorarios().addElement("14:50");
		  ponto2.getHorarios().addElement("16:55");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL SITES HORARIO");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("26/03/2007");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("08:10");
		  ponto3.getHorarios().addElement("10:10");
		  ponto3.getHorarios().addElement("12:10");
		  ponto3.getHorarios().addElement("14:10");
		  ponto3.getHorarios().addElement("16:10");
		  ponto3.getHorarios().addElement("18:20");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("BAIRRO CAPAO DA IMBUIA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto4.setValidoAPartirDe("22/10/2005");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("06:30");
		  ponto4.getHorarios().addElement("08:30");
		  ponto4.getHorarios().addElement("10:30");
		  ponto4.getHorarios().addElement("12:30");
		  ponto4.getHorarios().addElement("14:30");
		  ponto4.getHorarios().addElement("16:30");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("PARQUE BARIGUI");
		  ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto5.setValidoAPartirDe("22/10/2005");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("07:30");
		  ponto5.getHorarios().addElement("09:30");
		  ponto5.getHorarios().addElement("11:30");
		  ponto5.getHorarios().addElement("13:30");
		  ponto5.getHorarios().addElement("15:30");
		  ponto5.getHorarios().addElement("17:30");
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("TERMINAL SITES ANTI-HORARIO");
		  ponto6.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto6.setValidoAPartirDe("22/10/2005");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("06:50");
		  ponto6.getHorarios().addElement("08:50");
		  ponto6.getHorarios().addElement("10:50");
		  ponto6.getHorarios().addElement("12:50");
		  ponto6.getHorarios().addElement("14:50");
		  ponto6.getHorarios().addElement("16:50");
		  Ponto ponto7 = new Ponto();
		  ponto7.setNome("TERMINAL SITES HORARIO");
		  ponto7.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto7.setValidoAPartirDe("22/10/2005");
		  onibus.getPontos().addElement(ponto7);
		  ponto7.getHorarios().addElement("08:10");
		  ponto7.getHorarios().addElement("10:10");
		  ponto7.getHorarios().addElement("12:10");
		  ponto7.getHorarios().addElement("14:10");
		  ponto7.getHorarios().addElement("16:10");
		  ponto7.getHorarios().addElement("18:10");
		  return onibus;
		  }
	  }
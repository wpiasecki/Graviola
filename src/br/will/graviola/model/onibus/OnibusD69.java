
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusD69 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("D69 - MAD. CTBA / PIRAQUARA");
		  onibus.setCodigo("D69");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("PRACA SANTOS ANDRADE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("14/02/2011");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("01:10");
		  ponto0.getHorarios().addElement("03:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL PIRAQUARA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("14/02/2011");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("00:15");
		  ponto1.getHorarios().addElement("02:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("PRACA SANTOS ANDRADE");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("23/07/2005");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("01:00");
		  ponto2.getHorarios().addElement("03:00");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL PIRAQUARA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("23/07/2005");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("00:15");
		  ponto3.getHorarios().addElement("02:00");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("PRACA SANTOS ANDRADE");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("24/07/2005");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("01:00");
		  ponto4.getHorarios().addElement("03:00");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERMINAL PIRAQUARA");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("24/07/2005");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("00:15");
		  ponto5.getHorarios().addElement("02:00");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus360 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("360 - NOVENA");
		  onibus.setCodigo("360");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO NOVENA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("16/05/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("07:55");
		  ponto0.getHorarios().addElement("08:45");
		  ponto0.getHorarios().addElement("09:45");
		  ponto0.getHorarios().addElement("10:45");
		  ponto0.getHorarios().addElement("11:45");
		  ponto0.getHorarios().addElement("12:55");
		  ponto0.getHorarios().addElement("13:45");
		  ponto0.getHorarios().addElement("14:45");
		  ponto0.getHorarios().addElement("15:45");
		  ponto0.getHorarios().addElement("16:45");
		  ponto0.getHorarios().addElement("17:45");
		  ponto0.getHorarios().addElement("18:45");
		  ponto0.getHorarios().addElement("19:45");
		  ponto0.getHorarios().addElement("20:45");
		  ponto0.getHorarios().addElement("22:05");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("PRACA RUI BARBOSA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("16/05/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:35");
		  ponto1.getHorarios().addElement("08:25");
		  ponto1.getHorarios().addElement("09:25");
		  ponto1.getHorarios().addElement("10:25");
		  ponto1.getHorarios().addElement("11:25");
		  ponto1.getHorarios().addElement("12:25");
		  ponto1.getHorarios().addElement("13:25");
		  ponto1.getHorarios().addElement("14:25");
		  ponto1.getHorarios().addElement("15:25");
		  ponto1.getHorarios().addElement("16:25");
		  ponto1.getHorarios().addElement("17:25");
		  ponto1.getHorarios().addElement("18:25");
		  ponto1.getHorarios().addElement("19:25");
		  ponto1.getHorarios().addElement("20:25");
		  ponto1.getHorarios().addElement("21:25");
		  return onibus;
		  }
	  }
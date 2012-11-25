
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus395 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("395 - E. E. V. OFICINAS");
		  onibus.setCodigo("395");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO - LUAN MULLER 3");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL SITES CHEGADA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:15");
		  ponto1.getHorarios().addElement("11:15");
		  ponto1.getHorarios().addElement("13:15");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL SITES SAIDA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("07:30");
		  ponto2.getHorarios().addElement("11:40");
		  ponto2.getHorarios().addElement("13:35");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("ESCOLA SAO FRANCISCO");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("10:50");
		  ponto3.getHorarios().addElement("16:55");
		  return onibus;
		  }
	  }
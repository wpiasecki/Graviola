
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus194 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("194 - E. E. BARREIRINHA");
		  onibus.setCodigo("194");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA MERCEDES STRESSER");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("08:00");
		  ponto1.getHorarios().addElement("14:10");
		  ponto1.getHorarios().addElement("17:05");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESCOLA VIVIAN MARCAL-SUB SEDE");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("10:50");
		  ponto2.getHorarios().addElement("16:30");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL SITES CHEGADA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("07:15");
		  ponto3.getHorarios().addElement("11:15");
		  ponto3.getHorarios().addElement("13:15");
		  ponto3.getHorarios().addElement("17:20");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("TERMINAL SITES SAIDA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto4.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("07:30");
		  ponto4.getHorarios().addElement("11:40");
		  ponto4.getHorarios().addElement("13:30");
		  ponto4.getHorarios().addElement("17:40");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus294 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("294 - E.E. ECUMENICA 6");
		  onibus.setCodigo("294");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESCOLA ECUMENICA - SEDE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("26/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("11:30");
		  ponto0.getHorarios().addElement("13:00");
		  ponto0.getHorarios().addElement("17:10");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA ECUMENICA - SUB-SEDE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("26/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:20");
		  ponto1.getHorarios().addElement("11:00");
		  ponto1.getHorarios().addElement("16:45");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("BAIRRO - ECUMENICA 6");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("26/09/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("06:15");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("BAIRRO - ECUMENICA 6 (EM USO)");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("26/09/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("12:20");
		  return onibus;
		  }
	  }
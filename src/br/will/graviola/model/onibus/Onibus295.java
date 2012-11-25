
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus295 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("295 - E. E. ECUMÊNICA 5");
		  onibus.setCodigo("295");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO - ECUMENICA 5");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("11:20");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA ECUMENICA - SEDE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("13:20");
		  ponto1.getHorarios().addElement("17:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESCOLA ECUMENICA - SUB-SEDE");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("13:15");
		  ponto2.getHorarios().addElement("16:45");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("ESCOLA M.STRESSER (USO)");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("10/09/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("17:20");
		  return onibus;
		  }
	  }
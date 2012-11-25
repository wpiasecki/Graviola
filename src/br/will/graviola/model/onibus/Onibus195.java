
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus195 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("195 - E. E. APAE 4");
		  onibus.setCodigo("195");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("11:20");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("COMPLEXO APAE SANTA FELICIDADE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("17:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESCOLA ECUMENICA - SEDE");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("12:55");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("ESCOLA ECUMENICA - SUB-SEDE");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("13:10");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("ESCOLA M.STRESSER (USO)");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto4.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto4);
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("ESCOLA TIA MARIA");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto5.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("07:45");
		  ponto5.getHorarios().addElement("16:30");
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("GARAGEM");
		  ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto6.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("05:30");
		  return onibus;
		  }
	  }
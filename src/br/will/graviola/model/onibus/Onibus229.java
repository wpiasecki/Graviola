
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus229 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("229 - MAD. PENHA / F. NORONHA");
		  onibus.setCodigo("229");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERM.BOA VISTA-SENT.FER.NORONH");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("09/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("01:10");
		  ponto0.getHorarios().addElement("02:10");
		  ponto0.getHorarios().addElement("03:05");
		  ponto0.getHorarios().addElement("03:55");
		  ponto0.getHorarios().addElement("05:05");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERM.BOA VISTA-SENT.PENHA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("09/07/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("01:35");
		  ponto1.getHorarios().addElement("02:35");
		  ponto1.getHorarios().addElement("03:25");
		  ponto1.getHorarios().addElement("04:15");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERM.BOA VISTA-SENT.FER.NORONH");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("07/07/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("01:10");
		  ponto2.getHorarios().addElement("02:10");
		  ponto2.getHorarios().addElement("03:05");
		  ponto2.getHorarios().addElement("03:55");
		  ponto2.getHorarios().addElement("05:05");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERM.BOA VISTA-SENT.PENHA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("07/07/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("01:35");
		  ponto3.getHorarios().addElement("02:35");
		  ponto3.getHorarios().addElement("03:25");
		  ponto3.getHorarios().addElement("04:15");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("TERM.BOA VISTA-SENT.FER.NORONH");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("08/07/2012");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("01:10");
		  ponto4.getHorarios().addElement("02:10");
		  ponto4.getHorarios().addElement("03:05");
		  ponto4.getHorarios().addElement("03:55");
		  ponto4.getHorarios().addElement("05:05");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERM.BOA VISTA-SENT.PENHA");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("08/07/2012");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("01:35");
		  ponto5.getHorarios().addElement("02:35");
		  ponto5.getHorarios().addElement("03:25");
		  ponto5.getHorarios().addElement("04:15");
		  return onibus;
		  }
	  }
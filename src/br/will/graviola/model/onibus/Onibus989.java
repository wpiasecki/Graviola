
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus989 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("989 - MAD. STA. FELICIDADE");
		  onibus.setCodigo("989");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("RUI BARBOSA/CHEGADA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("02/04/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("01:20");
		  ponto0.getHorarios().addElement("02:30");
		  ponto0.getHorarios().addElement("03:35");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("RUI BARBOSA/SAIDA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("02/04/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("01:30");
		  ponto1.getHorarios().addElement("02:40");
		  ponto1.getHorarios().addElement("03:40");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("RUI BARBOSA/CHEGADA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("07/04/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("01:20");
		  ponto2.getHorarios().addElement("02:30");
		  ponto2.getHorarios().addElement("03:35");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("RUI BARBOSA/SAIDA");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("07/04/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("01:30");
		  ponto3.getHorarios().addElement("02:40");
		  ponto3.getHorarios().addElement("03:40");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("RUI BARBOSA/CHEGADA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("08/04/2012");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("01:20");
		  ponto4.getHorarios().addElement("02:30");
		  ponto4.getHorarios().addElement("03:35");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("RUI BARBOSA/SAIDA");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("08/04/2012");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("01:30");
		  ponto5.getHorarios().addElement("02:40");
		  ponto5.getHorarios().addElement("03:40");
		  return onibus;
		  }
	  }
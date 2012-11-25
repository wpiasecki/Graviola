
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusE69 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("E69 - MAD. CTBA / SÃO JOSÉ");
		  onibus.setCodigo("E69");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("BAIRRO PEDRO MORO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("31/05/2010");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("00:30");
		  ponto0.getHorarios().addElement("01:50");
		  ponto0.getHorarios().addElement("04:30");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL GUADALUPE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("31/05/2010");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("01:10");
		  ponto1.getHorarios().addElement("02:30");
		  ponto1.getHorarios().addElement("05:05");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("BAIRRO PEDRO MORO");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("25/10/1997");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("00:30");
		  ponto2.getHorarios().addElement("01:50");
		  ponto2.getHorarios().addElement("03:10");
		  ponto2.getHorarios().addElement("04:30");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL GUADALUPE");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("25/10/1997");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("01:10");
		  ponto3.getHorarios().addElement("02:30");
		  ponto3.getHorarios().addElement("03:50");
		  ponto3.getHorarios().addElement("05:05");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("BAIRRO PEDRO MORO");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto4.setValidoAPartirDe("26/10/1997");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("00:30");
		  ponto4.getHorarios().addElement("01:50");
		  ponto4.getHorarios().addElement("03:10");
		  ponto4.getHorarios().addElement("04:30");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERMINAL GUADALUPE");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		  ponto5.setValidoAPartirDe("26/10/1997");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("01:10");
		  ponto5.getHorarios().addElement("02:30");
		  ponto5.getHorarios().addElement("03:50");
		  ponto5.getHorarios().addElement("05:05");
		  return onibus;
		  }
	  }

	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusO76 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("O76 - CTBA/Q.BARRAS(RAPIDO)");
		  onibus.setCodigo("O76");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("T.Q.BARRAS(VIA MENINO DEUS)");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("17/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("07:25");
		  ponto0.getHorarios().addElement("17:40");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("GUADALUPE (VIA MENINO DEUS)");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("17/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("16:40");
		  ponto1.getHorarios().addElement("19:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("GUADALUPE(VIA MARIA JOSE)");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("17/09/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("17:55");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("T.Q.BARRAS (VIA MARIA JOSE)");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("17/09/2012");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("06:57");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("BAIRRO BORDA DO CAMPO");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto4.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("20:00");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("TERMINAL QUATRO BARRAS");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto5.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto5);
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("TERM.Q.BARRAS/BORDA DO CAMPO");
		  ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto6.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("19:40");
		  Ponto ponto7 = new Ponto();
		  ponto7.setNome("T.Q.BARRAS(VIA MENINO DEUS)");
		  ponto7.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto7.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto7);
		  ponto7.getHorarios().addElement("07:25");
		  ponto7.getHorarios().addElement("17:40");
		  Ponto ponto8 = new Ponto();
		  ponto8.setNome("GUADALUPE (VIA MENINO DEUS)");
		  ponto8.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto8.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto8);
		  ponto8.getHorarios().addElement("16:40");
		  ponto8.getHorarios().addElement("18:40");
		  Ponto ponto9 = new Ponto();
		  ponto9.setNome("GUADALUPE(VIA MARIA JOSE)");
		  ponto9.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto9.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto9);
		  ponto9.getHorarios().addElement("17:55");
		  Ponto ponto10 = new Ponto();
		  ponto10.setNome("T.Q.BARRAS (VIA MARIA JOSE)");
		  ponto10.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto10.setValidoAPartirDe("03/12/2012");
		  onibus.getPontos().addElement(ponto10);
		  ponto10.getHorarios().addElement("06:55");
		  return onibus;
		  }
	  }
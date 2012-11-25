
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus495 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("495 - E. E. PINHAIS 1");
		  onibus.setCodigo("495");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESCOLA ALTERNATIVA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("11:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("ESCOLA CENTRAU");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("07:00");
		  ponto1.getHorarios().addElement("18:07");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESCOLA MULTI DISCIPLINAR");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("07:22");
		  ponto2.getHorarios().addElement("10:52");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("ESCOLA ECUMENICA - SEDE");
		  ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto3.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("11:56");
		  ponto3.getHorarios().addElement("17:30");
		  Ponto ponto4 = new Ponto();
		  ponto4.setNome("ESCOLA EPHETA");
		  ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto4.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto4);
		  ponto4.getHorarios().addElement("07:50");
		  Ponto ponto5 = new Ponto();
		  ponto5.setNome("ESCOLA I.R.P.");
		  ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto5.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto5);
		  ponto5.getHorarios().addElement("11:40");
		  Ponto ponto6 = new Ponto();
		  ponto6.setNome("ESCOLA NABIL TACLA (SUB-SEDE)");
		  ponto6.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto6.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto6);
		  ponto6.getHorarios().addElement("08:00");
		  ponto6.getHorarios().addElement("11:25");
		  ponto6.getHorarios().addElement("14:01");
		  ponto6.getHorarios().addElement("17:03");
		  Ponto ponto7 = new Ponto();
		  ponto7.setNome("ESCOLA PRIMAVERA");
		  ponto7.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto7.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto7);
		  ponto7.getHorarios().addElement("07:12");
		  ponto7.getHorarios().addElement("10:40");
		  ponto7.getHorarios().addElement("13:16");
		  ponto7.getHorarios().addElement("17:51");
		  Ponto ponto8 = new Ponto();
		  ponto8.setNome("ESCOLA RENASCER PRADO VELHO");
		  ponto8.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto8.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto8);
		  ponto8.getHorarios().addElement("17:18");
		  Ponto ponto9 = new Ponto();
		  ponto9.setNome("ESCOLA VIVIAN MARCAL SEDE");
		  ponto9.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto9.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto9);
		  ponto9.getHorarios().addElement("07:35");
		  ponto9.getHorarios().addElement("13:35");
		  ponto9.getHorarios().addElement("16:40");
		  Ponto ponto10 = new Ponto();
		  ponto10.setNome("INICIO OPERACAO SITES - BAIRRO");
		  ponto10.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto10.setValidoAPartirDe("08/02/2010");
		  onibus.getPontos().addElement(ponto10);
		  ponto10.getHorarios().addElement("05:45");
		  return onibus;
		  }
	  }
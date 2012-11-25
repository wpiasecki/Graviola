
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusH21 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("H21 - ANGÉLICA / CIC");
		  onibus.setCodigo("H21");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL ANGELICA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("29/03/2010");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("05:15");
		  ponto0.getHorarios().addElement("05:54");
		  ponto0.getHorarios().addElement("06:41");
		  ponto0.getHorarios().addElement("07:30");
		  ponto0.getHorarios().addElement("08:30");
		  ponto0.getHorarios().addElement("09:30");
		  ponto0.getHorarios().addElement("10:30");
		  ponto0.getHorarios().addElement("11:20");
		  ponto0.getHorarios().addElement("12:02");
		  ponto0.getHorarios().addElement("12:46");
		  ponto0.getHorarios().addElement("13:35");
		  ponto0.getHorarios().addElement("14:30");
		  ponto0.getHorarios().addElement("15:10");
		  ponto0.getHorarios().addElement("15:58");
		  ponto0.getHorarios().addElement("16:50");
		  ponto0.getHorarios().addElement("17:50");
		  ponto0.getHorarios().addElement("18:40");
		  ponto0.getHorarios().addElement("19:22");
		  ponto0.getHorarios().addElement("20:02");
		  ponto0.getHorarios().addElement("20:42");
		  ponto0.getHorarios().addElement("21:35");
		  ponto0.getHorarios().addElement("22:30");
		  ponto0.getHorarios().addElement("23:30");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL CIC");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("29/03/2010");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("05:32");
		  ponto1.getHorarios().addElement("06:16");
		  ponto1.getHorarios().addElement("07:06");
		  ponto1.getHorarios().addElement("07:55");
		  ponto1.getHorarios().addElement("09:00");
		  ponto1.getHorarios().addElement("10:00");
		  ponto1.getHorarios().addElement("11:00");
		  ponto1.getHorarios().addElement("11:40");
		  ponto1.getHorarios().addElement("12:24");
		  ponto1.getHorarios().addElement("13:08");
		  ponto1.getHorarios().addElement("14:05");
		  ponto1.getHorarios().addElement("14:50");
		  ponto1.getHorarios().addElement("15:35");
		  ponto1.getHorarios().addElement("16:20");
		  ponto1.getHorarios().addElement("17:20");
		  ponto1.getHorarios().addElement("18:15");
		  ponto1.getHorarios().addElement("19:02");
		  ponto1.getHorarios().addElement("19:42");
		  ponto1.getHorarios().addElement("20:22");
		  ponto1.getHorarios().addElement("21:05");
		  ponto1.getHorarios().addElement("22:05");
		  ponto1.getHorarios().addElement("23:05");
		  ponto1.getHorarios().addElement("00:00");
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("TERMINAL ANGELICA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto2.setValidoAPartirDe("17/06/2000");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("05:25");
		  ponto2.getHorarios().addElement("06:10");
		  ponto2.getHorarios().addElement("07:00");
		  ponto2.getHorarios().addElement("07:50");
		  ponto2.getHorarios().addElement("08:40");
		  ponto2.getHorarios().addElement("16:00");
		  ponto2.getHorarios().addElement("16:50");
		  ponto2.getHorarios().addElement("17:40");
		  Ponto ponto3 = new Ponto();
		  ponto3.setNome("TERMINAL CIC");
		  ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		  ponto3.setValidoAPartirDe("17/06/2000");
		  onibus.getPontos().addElement(ponto3);
		  ponto3.getHorarios().addElement("05:45");
		  ponto3.getHorarios().addElement("06:30");
		  ponto3.getHorarios().addElement("07:20");
		  ponto3.getHorarios().addElement("08:15");
		  ponto3.getHorarios().addElement("09:00");
		  ponto3.getHorarios().addElement("16:25");
		  ponto3.getHorarios().addElement("17:15");
		  ponto3.getHorarios().addElement("18:05");
		  return onibus;
		  }
	  }
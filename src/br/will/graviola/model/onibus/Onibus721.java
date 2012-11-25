
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class Onibus721 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("721 - MÁRIO JORGE");
		  onibus.setCodigo("721");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL CAIUA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("12/09/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("05:20");
		  ponto0.getHorarios().addElement("05:58");
		  ponto0.getHorarios().addElement("06:36");
		  ponto0.getHorarios().addElement("07:14");
		  ponto0.getHorarios().addElement("07:52");
		  ponto0.getHorarios().addElement("08:32");
		  ponto0.getHorarios().addElement("09:16");
		  ponto0.getHorarios().addElement("10:00");
		  ponto0.getHorarios().addElement("10:44");
		  ponto0.getHorarios().addElement("11:28");
		  ponto0.getHorarios().addElement("12:12");
		  ponto0.getHorarios().addElement("12:56");
		  ponto0.getHorarios().addElement("13:40");
		  ponto0.getHorarios().addElement("14:24");
		  ponto0.getHorarios().addElement("15:08");
		  ponto0.getHorarios().addElement("15:53");
		  ponto0.getHorarios().addElement("16:34");
		  ponto0.getHorarios().addElement("17:12");
		  ponto0.getHorarios().addElement("17:50");
		  ponto0.getHorarios().addElement("18:28");
		  ponto0.getHorarios().addElement("19:06");
		  ponto0.getHorarios().addElement("19:45");
		  ponto0.getHorarios().addElement("20:29");
		  ponto0.getHorarios().addElement("21:13");
		  ponto0.getHorarios().addElement("21:57");
		  ponto0.getHorarios().addElement("22:40");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("RUA DR. MARIO JORGE");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("12/09/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("05:00");
		  ponto1.getHorarios().addElement("05:38");
		  ponto1.getHorarios().addElement("06:16");
		  ponto1.getHorarios().addElement("06:54");
		  ponto1.getHorarios().addElement("07:32");
		  ponto1.getHorarios().addElement("08:11");
		  ponto1.getHorarios().addElement("08:54");
		  ponto1.getHorarios().addElement("09:38");
		  ponto1.getHorarios().addElement("10:22");
		  ponto1.getHorarios().addElement("11:06");
		  ponto1.getHorarios().addElement("11:50");
		  ponto1.getHorarios().addElement("12:34");
		  ponto1.getHorarios().addElement("13:18");
		  ponto1.getHorarios().addElement("14:02");
		  ponto1.getHorarios().addElement("14:46");
		  ponto1.getHorarios().addElement("15:30");
		  ponto1.getHorarios().addElement("16:13");
		  ponto1.getHorarios().addElement("16:52");
		  ponto1.getHorarios().addElement("17:30");
		  ponto1.getHorarios().addElement("18:08");
		  ponto1.getHorarios().addElement("18:46");
		  ponto1.getHorarios().addElement("19:24");
		  ponto1.getHorarios().addElement("20:04");
		  ponto1.getHorarios().addElement("20:47");
		  ponto1.getHorarios().addElement("21:31");
		  ponto1.getHorarios().addElement("22:15");
		  return onibus;
		  }
	  }
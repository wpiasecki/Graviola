
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusC05 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("C05 - DIRETO C. IMBUIA");
		  onibus.setCodigo("C05");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL CAPAO DA IMBUIA");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto0);
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL PINHAIS");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("13/02/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:07");
		  ponto1.getHorarios().addElement("06:15");
		  ponto1.getHorarios().addElement("06:19");
		  ponto1.getHorarios().addElement("06:23");
		  ponto1.getHorarios().addElement("06:28");
		  ponto1.getHorarios().addElement("06:32");
		  ponto1.getHorarios().addElement("06:40");
		  ponto1.getHorarios().addElement("06:44");
		  ponto1.getHorarios().addElement("06:48");
		  ponto1.getHorarios().addElement("06:52");
		  ponto1.getHorarios().addElement("06:56");
		  ponto1.getHorarios().addElement("07:05");
		  ponto1.getHorarios().addElement("07:09");
		  ponto1.getHorarios().addElement("07:13");
		  ponto1.getHorarios().addElement("07:16");
		  ponto1.getHorarios().addElement("07:21");
		  ponto1.getHorarios().addElement("07:29");
		  ponto1.getHorarios().addElement("07:34");
		  ponto1.getHorarios().addElement("07:38");
		  ponto1.getHorarios().addElement("07:42");
		  ponto1.getHorarios().addElement("07:46");
		  ponto1.getHorarios().addElement("07:55");
		  ponto1.getHorarios().addElement("07:59");
		  ponto1.getHorarios().addElement("08:04");
		  ponto1.getHorarios().addElement("08:09");
		  return onibus;
		  }
	  }
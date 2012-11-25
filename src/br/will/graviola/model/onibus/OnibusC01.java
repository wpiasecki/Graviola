
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusC01 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("C01 - PINHAIS/C.IMBUIA");
		  onibus.setCodigo("C01");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("ESTACAO TUBO AUTODROMO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("07/11/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:45");
		  ponto0.getHorarios().addElement("07:02");
		  ponto0.getHorarios().addElement("07:22");
		  ponto0.getHorarios().addElement("07:39");
		  ponto0.getHorarios().addElement("07:56");
		  ponto0.getHorarios().addElement("08:14");
		  ponto0.getHorarios().addElement("08:42");
		  ponto0.getHorarios().addElement("09:02");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL CAPAO DA IMBUIA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("07/11/2012");
		  onibus.getPontos().addElement(ponto1);
		  Ponto ponto2 = new Ponto();
		  ponto2.setNome("ESTACAO TUBO PAULO KISSULA");
		  ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto2.setValidoAPartirDe("07/11/2012");
		  onibus.getPontos().addElement(ponto2);
		  ponto2.getHorarios().addElement("08:28");
		  return onibus;
		  }
	  }
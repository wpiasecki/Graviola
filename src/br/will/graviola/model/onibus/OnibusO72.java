
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusO72 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("O72 - CTBA / POUSADA");
		  onibus.setCodigo("O72");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL GUADALUPE");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("06/08/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("07:40");
		  ponto0.getHorarios().addElement("09:45");
		  ponto0.getHorarios().addElement("11:55");
		  ponto0.getHorarios().addElement("14:05");
		  ponto0.getHorarios().addElement("16:30");
		  ponto0.getHorarios().addElement("19:00");
		  Ponto ponto1 = new Ponto();
		  ponto1.setNome("TERMINAL JD.PAULISTA");
		  ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto1.setValidoAPartirDe("06/08/2012");
		  onibus.getPontos().addElement(ponto1);
		  ponto1.getHorarios().addElement("06:32");
		  ponto1.getHorarios().addElement("08:40");
		  ponto1.getHorarios().addElement("10:45");
		  ponto1.getHorarios().addElement("13:00");
		  ponto1.getHorarios().addElement("15:20");
		  ponto1.getHorarios().addElement("17:40");
		  return onibus;
		  }
	  }
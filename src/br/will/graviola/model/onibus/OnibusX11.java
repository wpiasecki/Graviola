
	  package br.will.graviola.model.onibus;
	
	  import br.will.graviola.model.*;
	
	  /**
	   * Código gerado automaticamente
	   * 
	   * @author will
	   */
	  public class OnibusX11 {
		  public static Onibus create() {
		  Onibus onibus = new Onibus();
		  onibus.setNome("X11 - SITIO CERCADO / C. RASO");
		  onibus.setCodigo("X11");
		  Ponto ponto0 = new Ponto();
		  ponto0.setNome("TERMINAL SITIO CERCADO");
		  ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		  ponto0.setValidoAPartirDe("23/07/2012");
		  onibus.getPontos().addElement(ponto0);
		  ponto0.getHorarios().addElement("06:20");
		  ponto0.getHorarios().addElement("06:25");
		  ponto0.getHorarios().addElement("06:30");
		  ponto0.getHorarios().addElement("06:36");
		  ponto0.getHorarios().addElement("06:42");
		  ponto0.getHorarios().addElement("06:48");
		  ponto0.getHorarios().addElement("06:58");
		  ponto0.getHorarios().addElement("07:03");
		  ponto0.getHorarios().addElement("07:07");
		  ponto0.getHorarios().addElement("07:12");
		  ponto0.getHorarios().addElement("07:20");
		  ponto0.getHorarios().addElement("07:24");
		  ponto0.getHorarios().addElement("07:30");
		  ponto0.getHorarios().addElement("07:40");
		  ponto0.getHorarios().addElement("07:46");
		  ponto0.getHorarios().addElement("07:51");
		  ponto0.getHorarios().addElement("07:54");
		  ponto0.getHorarios().addElement("08:02");
		  ponto0.getHorarios().addElement("08:08");
		  return onibus;
		  }
	  }
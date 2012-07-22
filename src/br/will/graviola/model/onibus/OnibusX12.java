
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusX12 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("ESPECIAL BOQUEIRAO");
		onibus.setCodigo("X12");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL BOQUEIRAO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:33");
		ponto0.getHorarios().addElement("06:42");
		ponto0.getHorarios().addElement("06:51");
		ponto0.getHorarios().addElement("07:00");
		ponto0.getHorarios().addElement("07:09");
		ponto0.getHorarios().addElement("07:18");
		ponto0.getHorarios().addElement("07:27");
		ponto0.getHorarios().addElement("07:36");
		ponto0.getHorarios().addElement("07:45");
		ponto0.getHorarios().addElement("07:54");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESTACAO TUBO EUCALIPTOS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:23");
		ponto1.getHorarios().addElement("06:32");
		ponto1.getHorarios().addElement("06:41");
		ponto1.getHorarios().addElement("06:50");
		ponto1.getHorarios().addElement("06:59");
		ponto1.getHorarios().addElement("07:08");
		ponto1.getHorarios().addElement("07:17");
		ponto1.getHorarios().addElement("07:26");
		ponto1.getHorarios().addElement("07:35");
		ponto1.getHorarios().addElement("07:44");
		ponto1.getHorarios().addElement("07:53");
		ponto1.getHorarios().addElement("08:02");
		return onibus;
		}
	}
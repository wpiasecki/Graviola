
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusP65 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("P65 - CTBA / TERRA BOA");
		onibus.setCodigo("P65");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO TERRA BOA");
		ponto0.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto0.setValidoAPartirDe("31/03/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("10:30");
		ponto0.getHorarios().addElement("17:45");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("FERNANDO MOREIRA");
		ponto1.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto1.setValidoAPartirDe("31/03/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("08:00");
		ponto1.getHorarios().addElement("15:30");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("BAIRRO TERRA BOA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto2.setValidoAPartirDe("01/04/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("10:30");
		ponto2.getHorarios().addElement("17:45");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("FERNANDO MOREIRA");
		ponto3.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto3.setValidoAPartirDe("01/04/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("08:00");
		ponto3.getHorarios().addElement("15:30");
		return onibus;
		}
	}
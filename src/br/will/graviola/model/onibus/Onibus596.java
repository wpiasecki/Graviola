
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus596 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. APAE 2");
		onibus.setCodigo("596");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("BAIRRO APAE 2");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("05:50");
		ponto0.getHorarios().addElement("11:05");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("COMPLEXO APAE SANTA FELICIDADE");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("17:00");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA ECUMENICA - SEDE");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("13:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("ESCOLA ECUMENICA - SUB-SEDE");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("13:05");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ESCOLA M.STRESSER (USO)");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		Ponto ponto5 = new Ponto();
		ponto5.setNome("ESCOLA TIA MARIA");
		ponto5.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto5.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("07:50");
		ponto5.getHorarios().addElement("16:30");
		return onibus;
		}
	}
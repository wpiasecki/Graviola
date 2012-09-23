
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class OnibusA05 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("A05 - MAD. CTBA / TAMANDARÉ");
		onibus.setCodigo("A05");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("PREFEITURA");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("24/09/2007");
		onibus.getPontos().addElement(ponto0);
		Ponto ponto1 = new Ponto();
		ponto1.setNome("PRACA RUI BARBOSA/CHEGADA");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("24/09/2007");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("01:10");
		ponto1.getHorarios().addElement("02:35");
		ponto1.getHorarios().addElement("03:55");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("PRACA RUI BARBOSA/SAIDA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("24/09/2007");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("01:15");
		ponto2.getHorarios().addElement("02:40");
		ponto2.getHorarios().addElement("04:00");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("PREFEITURA");
		ponto3.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto3.setValidoAPartirDe("22/09/2007");
		onibus.getPontos().addElement(ponto3);
		Ponto ponto4 = new Ponto();
		ponto4.setNome("PRACA RUI BARBOSA/CHEGADA");
		ponto4.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto4.setValidoAPartirDe("22/09/2007");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("01:10");
		ponto4.getHorarios().addElement("02:35");
		ponto4.getHorarios().addElement("03:55");
		Ponto ponto5 = new Ponto();
		ponto5.setNome("PRACA RUI BARBOSA/SAIDA");
		ponto5.setTipoDia(TipoDia.getTipoDia("SABADO"));
		ponto5.setValidoAPartirDe("22/09/2007");
		onibus.getPontos().addElement(ponto5);
		ponto5.getHorarios().addElement("01:15");
		ponto5.getHorarios().addElement("02:40");
		ponto5.getHorarios().addElement("04:00");
		Ponto ponto6 = new Ponto();
		ponto6.setNome("PREFEITURA");
		ponto6.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto6.setValidoAPartirDe("23/09/2007");
		onibus.getPontos().addElement(ponto6);
		Ponto ponto7 = new Ponto();
		ponto7.setNome("PRACA RUI BARBOSA/CHEGADA");
		ponto7.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto7.setValidoAPartirDe("23/09/2007");
		onibus.getPontos().addElement(ponto7);
		ponto7.getHorarios().addElement("01:10");
		ponto7.getHorarios().addElement("02:35");
		ponto7.getHorarios().addElement("03:55");
		Ponto ponto8 = new Ponto();
		ponto8.setNome("PRACA RUI BARBOSA/SAIDA");
		ponto8.setTipoDia(TipoDia.getTipoDia("DOMINGO"));
		ponto8.setValidoAPartirDe("23/09/2007");
		onibus.getPontos().addElement(ponto8);
		ponto8.getHorarios().addElement("01:15");
		ponto8.getHorarios().addElement("02:40");
		ponto8.getHorarios().addElement("04:00");
		return onibus;
		}
	}
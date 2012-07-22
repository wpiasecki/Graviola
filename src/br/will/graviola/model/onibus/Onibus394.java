
	package br.will.graviola.model.onibus;
	
	import br.will.graviola.model.*;
	
	/**
	 * Código gerado automaticamente
	 * 
	 * @author will
	 */
	public class Onibus394 {
		public static Onibus create() {
		Onibus onibus = new Onibus();
		onibus.setNome("E. E. CENTRAU 1");
		onibus.setCodigo("394");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("ESCOLA 29 DE MARCO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("10:50");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("ESCOLA M.JESUS");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("11:05");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("ESCOLA PRIMAVERA");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("11:20");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("BAIRRO LINHA 394");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:00");
		Ponto ponto4 = new Ponto();
		ponto4.setNome("ESCOLA CENTRAU I");
		ponto4.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto4.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto4);
		ponto4.getHorarios().addElement("16:40");
		return onibus;
		}
	}
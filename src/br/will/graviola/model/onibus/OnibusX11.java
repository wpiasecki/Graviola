
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
		onibus.setNome("SITIO CERCADO / C. RASO");
		onibus.setCodigo("X11");
		Ponto ponto0 = new Ponto();
		ponto0.setNome("TERMINAL CAPAO RASO");
		ponto0.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto0.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto0);
		ponto0.getHorarios().addElement("06:43");
		ponto0.getHorarios().addElement("06:48");
		ponto0.getHorarios().addElement("06:59");
		ponto0.getHorarios().addElement("07:05");
		ponto0.getHorarios().addElement("07:11");
		ponto0.getHorarios().addElement("07:21");
		ponto0.getHorarios().addElement("07:26");
		ponto0.getHorarios().addElement("07:30");
		ponto0.getHorarios().addElement("07:43");
		ponto0.getHorarios().addElement("07:47");
		ponto0.getHorarios().addElement("16:15");
		ponto0.getHorarios().addElement("16:25");
		ponto0.getHorarios().addElement("17:00");
		ponto0.getHorarios().addElement("17:11");
		ponto0.getHorarios().addElement("17:22");
		ponto0.getHorarios().addElement("17:33");
		ponto0.getHorarios().addElement("17:44");
		ponto0.getHorarios().addElement("17:55");
		ponto0.getHorarios().addElement("18:06");
		ponto0.getHorarios().addElement("18:17");
		ponto0.getHorarios().addElement("18:28");
		ponto0.getHorarios().addElement("18:39");
		ponto0.getHorarios().addElement("18:50");
		ponto0.getHorarios().addElement("19:01");
		ponto0.getHorarios().addElement("19:15");
		ponto0.getHorarios().addElement("19:25");
		Ponto ponto1 = new Ponto();
		ponto1.setNome("TERMINAL SITIO CERCADO");
		ponto1.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto1.setValidoAPartirDe("13/02/2012");
		onibus.getPontos().addElement(ponto1);
		ponto1.getHorarios().addElement("06:20");
		ponto1.getHorarios().addElement("06:25");
		ponto1.getHorarios().addElement("06:36");
		ponto1.getHorarios().addElement("06:42");
		ponto1.getHorarios().addElement("06:48");
		ponto1.getHorarios().addElement("06:58");
		ponto1.getHorarios().addElement("07:03");
		ponto1.getHorarios().addElement("07:07");
		ponto1.getHorarios().addElement("07:20");
		ponto1.getHorarios().addElement("07:24");
		ponto1.getHorarios().addElement("07:30");
		ponto1.getHorarios().addElement("07:40");
		ponto1.getHorarios().addElement("07:46");
		ponto1.getHorarios().addElement("07:51");
		ponto1.getHorarios().addElement("08:02");
		ponto1.getHorarios().addElement("08:08");
		ponto1.getHorarios().addElement("16:39");
		ponto1.getHorarios().addElement("16:50");
		ponto1.getHorarios().addElement("17:23");
		ponto1.getHorarios().addElement("17:34");
		ponto1.getHorarios().addElement("17:45");
		ponto1.getHorarios().addElement("17:56");
		ponto1.getHorarios().addElement("18:07");
		ponto1.getHorarios().addElement("18:18");
		ponto1.getHorarios().addElement("18:29");
		ponto1.getHorarios().addElement("18:40");
		ponto1.getHorarios().addElement("18:51");
		ponto1.getHorarios().addElement("19:02");
		Ponto ponto2 = new Ponto();
		ponto2.setNome("TERMINAL CAPAO RASO");
		ponto2.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto2.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto2);
		ponto2.getHorarios().addElement("06:43");
		ponto2.getHorarios().addElement("06:48");
		ponto2.getHorarios().addElement("06:53");
		ponto2.getHorarios().addElement("06:59");
		ponto2.getHorarios().addElement("07:05");
		ponto2.getHorarios().addElement("07:11");
		ponto2.getHorarios().addElement("07:21");
		ponto2.getHorarios().addElement("07:26");
		ponto2.getHorarios().addElement("07:30");
		ponto2.getHorarios().addElement("07:35");
		ponto2.getHorarios().addElement("07:43");
		ponto2.getHorarios().addElement("07:47");
		Ponto ponto3 = new Ponto();
		ponto3.setNome("TERMINAL SITIO CERCADO");
		ponto3.setTipoDia(TipoDia.getTipoDia("DIA_UTIL"));
		ponto3.setValidoAPartirDe("23/07/2012");
		onibus.getPontos().addElement(ponto3);
		ponto3.getHorarios().addElement("06:20");
		ponto3.getHorarios().addElement("06:25");
		ponto3.getHorarios().addElement("06:30");
		ponto3.getHorarios().addElement("06:36");
		ponto3.getHorarios().addElement("06:42");
		ponto3.getHorarios().addElement("06:48");
		ponto3.getHorarios().addElement("06:58");
		ponto3.getHorarios().addElement("07:03");
		ponto3.getHorarios().addElement("07:07");
		ponto3.getHorarios().addElement("07:12");
		ponto3.getHorarios().addElement("07:20");
		ponto3.getHorarios().addElement("07:24");
		ponto3.getHorarios().addElement("07:30");
		ponto3.getHorarios().addElement("07:40");
		ponto3.getHorarios().addElement("07:46");
		ponto3.getHorarios().addElement("07:51");
		ponto3.getHorarios().addElement("07:54");
		ponto3.getHorarios().addElement("08:02");
		ponto3.getHorarios().addElement("08:08");
		return onibus;
		}
	}
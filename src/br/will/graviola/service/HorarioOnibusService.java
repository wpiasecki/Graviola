package br.will.graviola.service;

import java.util.Vector;

import br.will.graviola.model.Onibus;
import br.will.graviola.model.onibus.*;

public class HorarioOnibusService
{
	public static int findIndiceByNome(String nome)
	{
		return findIndiceByNome(nome, getLinhasOnibus());
	}
	
	
	public static int findIndiceByNome(String nome, Vector linhas) 
	{
		String nomeUpper = nome.toUpperCase();
		for (int i = 0; i < linhas.size(); i++) 
		{
			String linha = (String) linhas.elementAt(i);
			if (linha.startsWith(nomeUpper)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static Vector getLinhasOnibus() {
		Vector linhasOnibus = new Vector();
		linhasOnibus.addElement("A. BRANCA / FAZ. RIO GRANDE");
		linhasOnibus.addElement("A. MUNHOZ / J. BOTÂNICO");
		linhasOnibus.addElement("ABAETÉ");
		linhasOnibus.addElement("ABRANCHES");
		linhasOnibus.addElement("ACRÓPOLE");
		linhasOnibus.addElement("AEROPORTO");
		linhasOnibus.addElement("AGRÍCOLA");
		linhasOnibus.addElement("ÁGUA CLARA");
		linhasOnibus.addElement("ÁGUA VERDE/ ABRANCHES");
		linhasOnibus.addElement("AGUDOS DO SUL");
		linhasOnibus.addElement("AHÚ / LOS ANGELES");
		linhasOnibus.addElement("ALFERES POLI");
		linhasOnibus.addElement("ALIANÇA");
		linhasOnibus.addElement("ALTO BOQUEIRÃO");
		linhasOnibus.addElement("ALTO TARUMÃ");
		linhasOnibus.addElement("ANA TERRA / ADRIANE");
		linhasOnibus.addElement("ANGÉLICA / C. RASO");
		linhasOnibus.addElement("ANGÉLICA / CIC");
		linhasOnibus.addElement("ARAGUAIA");
		linhasOnibus.addElement("ARAUCARIA / CAMPO LARGO");
		linhasOnibus.addElement("ARAUCÁRIA / PINHEIRINHO");
		linhasOnibus.addElement("ARAUCÁRIA / PORTÃO");
		linhasOnibus.addElement("AUGUSTA");
		linhasOnibus.addElement("AUGUSTO STRESSER");
		linhasOnibus.addElement("AVENIDA IRAÍ / C. IMBUIA");
		linhasOnibus.addElement("B. ALTO / BOA VISTA");
		linhasOnibus.addElement("B. ALTO / E. PERNETA");
		linhasOnibus.addElement("B. ALTO / STA. CÂNDIDA");
		linhasOnibus.addElement("B. ALTO / STA. FELICIDADE");
		linhasOnibus.addElement("BAIRRO NOVO");
		linhasOnibus.addElement("BAIRRO NOVO A");
		linhasOnibus.addElement("BAIRRO NOVO B");
		linhasOnibus.addElement("BAIRRO NOVO C");
		linhasOnibus.addElement("BANESTADO / CALIFÓRNIA");
		linhasOnibus.addElement("BARREIRINHA");
		linhasOnibus.addElement("BARREIRINHA / SÃO JOSÉ");
		linhasOnibus.addElement("BIGORRILHO");
		linhasOnibus.addElement("BOA VISTA / BARREIRINHA");
		linhasOnibus.addElement("BOCAIÚVA DO SUL");
		linhasOnibus.addElement("BOM PASTOR");
		linhasOnibus.addElement("BOM RETIRO / PUC");
		linhasOnibus.addElement("BOQUEIRÃO");
		linhasOnibus.addElement("BOQUEIRÃO / C. CÍVICO");
		linhasOnibus.addElement("BOQUEIRAO / KRAFT");
		linhasOnibus.addElement("BORDA DO CAMPO");
		linhasOnibus.addElement("BOSCH");
		linhasOnibus.addElement("BRACATINGA");
		linhasOnibus.addElement("BRITANITE");
		linhasOnibus.addElement("BUTIATUVINHA");
		linhasOnibus.addElement("C. BELEM / S. FILHO");
		linhasOnibus.addElement("C. COMPRIDO / C. RASO");
		linhasOnibus.addElement("C. COMPRIDO / CIC");
		linhasOnibus.addElement("C. IMBUIA / PQ. BARIGUI");
		linhasOnibus.addElement("C. LARGO / BALSA NOVA");
		linhasOnibus.addElement("C. MÚSICA / V. ALEGRE");
		linhasOnibus.addElement("C. RASO / CAIUÁ");
		linhasOnibus.addElement("C. RASO / CAMP. SIQUEIRA");
		linhasOnibus.addElement("CABRAL / BOM RETIRO");
		linhasOnibus.addElement("CABRAL / CACHOEIRA");
		linhasOnibus.addElement("CABRAL / MARACANÃ");
		linhasOnibus.addElement("CABRAL / OSÓRIO");
		linhasOnibus.addElement("CABRAL / PORTÃO");
		linhasOnibus.addElement("CACHIMBA");
		linhasOnibus.addElement("CACHIMBA / OLARIA");
		linhasOnibus.addElement("CAIUÁ");
		linhasOnibus.addElement("CAIUA / C.COMPRIDO");
		linhasOnibus.addElement("CAJURU");
		linhasOnibus.addElement("CAMARGO");
		linhasOnibus.addElement("CAMP. SIQUEIRA / BATEL");
		linhasOnibus.addElement("CAMPO ALEGRE");
		linhasOnibus.addElement("CAMPO LARGO");
		linhasOnibus.addElement("CAMPO MAGRO");
		linhasOnibus.addElement("CANAL BELÉM");
		linhasOnibus.addElement("CARBOMAFRA");
		linhasOnibus.addElement("CARMELA DUTRA");
		linhasOnibus.addElement("CASA DE CUSTÓDIA");
		linhasOnibus.addElement("CASSIOPÉIA");
		linhasOnibus.addElement("CENTENÁRIO");
		linhasOnibus.addElement("CENTENÁRIO / BOQUEIRÃO");
		linhasOnibus.addElement("CENTENÁRIO / C. COMPRIDO");
		linhasOnibus.addElement("CENTENÁRIO / HAUER");
		linhasOnibus.addElement("CENTENÁRIO / RUI BARBOSA");
		linhasOnibus.addElement("CENTRO POLITÉCNICO");
		linhasOnibus.addElement("CIC / TIRADENTES");
		linhasOnibus.addElement("CIRCULAR CENTRO (ANTI-HORÁRIO)");
		linhasOnibus.addElement("CIRCULAR CENTRO (HORÁRIO)");
		linhasOnibus.addElement("CIRCULAR SUL  (ANTI-HORÁRIO)");
		linhasOnibus.addElement("CIRCULAR SUL (HORÁRIO)");
		linhasOnibus.addElement("COLINA VERDE");
		linhasOnibus.addElement("COLOMBO / ANG. CARON");
		linhasOnibus.addElement("COLOMBO / CIC");
		linhasOnibus.addElement("COLOMBO / SÃO JOSÉ");
		linhasOnibus.addElement("COLÔNIA FARIA");
		linhasOnibus.addElement("COTOLENGO");
		linhasOnibus.addElement("CRISTO REI");
		linhasOnibus.addElement("CTBA  / V. PALMITAL");
		linhasOnibus.addElement("CTBA / APOLO");
		linhasOnibus.addElement("CTBA / ARAUCÁRIA");
		linhasOnibus.addElement("CTBA / ARAUCÁRIA");
		linhasOnibus.addElement("CTBA / AREIA BRANCA");
		linhasOnibus.addElement("CTBA / BATEIAS");
		linhasOnibus.addElement("CTBA / BRAGA");
		linhasOnibus.addElement("CTBA / C. GDE  SUL (RAPIDO)");
		linhasOnibus.addElement("CTBA / C. GRANDE DO SUL");
		linhasOnibus.addElement("CTBA / C. LARGO");
		linhasOnibus.addElement("CTBA / CAMP. DOS PAULAS");
		linhasOnibus.addElement("CTBA / CAMPO LARGO");
		linhasOnibus.addElement("CTBA / CAP. DO ATUBA");
		linhasOnibus.addElement("CTBA / CERNE");
		linhasOnibus.addElement("CTBA / COLOMBO (CAMBARÁ)");
		linhasOnibus.addElement("CTBA / COLOMBO (GUARACI)");
		linhasOnibus.addElement("CTBA / COLOMBO (ROD. UVA)");
		linhasOnibus.addElement("CTBA / CONJ. ATUBA");
		linhasOnibus.addElement("CTBA / CONTENDA");
		linhasOnibus.addElement("CTBA / EUGÊNIA MARIA");
		linhasOnibus.addElement("CTBA / FAZ. RIO GRANDE");
		linhasOnibus.addElement("CTBA / GUATUPÊ");
		linhasOnibus.addElement("CTBA / INDEPENDÊNCIA");
		linhasOnibus.addElement("CTBA / ITAPERUÇU");
		linhasOnibus.addElement("CTBA / JD. ANA ROSA");
		linhasOnibus.addElement("CTBA / JD. ARAPONGAS");
		linhasOnibus.addElement("CTBA / JD. CÉSAR AUGUSTO");
		linhasOnibus.addElement("CTBA / JD. CRISTAL");
		linhasOnibus.addElement("CTBA / JD. CRUZEIRO");
		linhasOnibus.addElement("CTBA / JD. CURITIBA");
		linhasOnibus.addElement("CTBA / JD. IPÊ");
		linhasOnibus.addElement("CTBA / JD. IZAURA");
		linhasOnibus.addElement("CTBA / JD. MARROCOS");
		linhasOnibus.addElement("CTBA / JD. OSASCO");
		linhasOnibus.addElement("CTBA / JD. PARAÍSO");
		linhasOnibus.addElement("CTBA / JD. SÃO GABRIEL");
		linhasOnibus.addElement("CTBA / MANDIRITUBA");
		linhasOnibus.addElement("CTBA / MARACANÃ");
		linhasOnibus.addElement("CTBA / PEDRO MORO");
		linhasOnibus.addElement("CTBA / PIRAQUARA");
		linhasOnibus.addElement("CTBA / PIRAQUARA (DIRETO)");
		linhasOnibus.addElement("CTBA / POSTO PARIS");
		linhasOnibus.addElement("CTBA / POUSADA");
		linhasOnibus.addElement("CTBA / PUC");
		linhasOnibus.addElement("CTBA / Q. BARRAS (BR 116)");
		linhasOnibus.addElement("CTBA / Q. BARRAS (GRACIOSA)");
		linhasOnibus.addElement("CTBA / QUISISANA");
		linhasOnibus.addElement("CTBA / R. BCO. DO SUL");
		linhasOnibus.addElement("CTBA / ROÇA GRANDE");
		linhasOnibus.addElement("CTBA / ROSEIRA");
		linhasOnibus.addElement("CTBA / SÃO JOSÉ");
		linhasOnibus.addElement("CTBA / SÃO SEBASTIÃO");
		linhasOnibus.addElement("CTBA / STA. TEREZA");
		linhasOnibus.addElement("CTBA / TAMANDARÉ");
		linhasOnibus.addElement("CTBA / TAMANDARÉ (LAMENHA)");
		linhasOnibus.addElement("CTBA / TAMANDARÉ (MINÉRIOS)");
		linhasOnibus.addElement("CTBA / TANGUÁ");
		linhasOnibus.addElement("CTBA / TERRA BOA");
		linhasOnibus.addElement("CTBA / TIMBÚ");
		linhasOnibus.addElement("CTBA / URANO");
		linhasOnibus.addElement("CTBA / V.  MARTA");
		linhasOnibus.addElement("CTBA / V. ZUMBI");
		linhasOnibus.addElement("CTBA / XINGU");
		linhasOnibus.addElement("CTBA/GUARAITUBA(VIA MARACANA)");
		linhasOnibus.addElement("CTBA/Q.BARRAS(RAPIDO)");
		linhasOnibus.addElement("DALAGASSA");
		linhasOnibus.addElement("DETRAN / VIC. MACHADO");
		linhasOnibus.addElement("DIRETO C. IMBUIA");
		linhasOnibus.addElement("DIRETO CABRAL");
		linhasOnibus.addElement("DOM ÁTICO");
		linhasOnibus.addElement("E. E. ALCINDO FANAYA 1");
		linhasOnibus.addElement("E. E. ALCINDO FANAYA 2");
		linhasOnibus.addElement("E. E. ALI BARK 1");
		linhasOnibus.addElement("E. E. ALI BARK 2");
		linhasOnibus.addElement("E. E. ALTO BOQUEIRÃO");
		linhasOnibus.addElement("E. E. APAE 1");
		linhasOnibus.addElement("E. E. APAE 2");
		linhasOnibus.addElement("E. E. APAE 3");
		linhasOnibus.addElement("E. E. APAE 6");
		linhasOnibus.addElement("E. E. BAIRRO NOVO");
		linhasOnibus.addElement("E. E. C. IMBUIA");
		linhasOnibus.addElement("E. E. CAJURU");
		linhasOnibus.addElement("E. E. CENTRAU 1");
		linhasOnibus.addElement("E. E. CIC");
		linhasOnibus.addElement("E. E. ECUMÊNICA 1");
		linhasOnibus.addElement("E. E. ECUMÊNICA 2");
		linhasOnibus.addElement("E. E. HELENA ANTIPOFF 1");
		linhasOnibus.addElement("E. E. HELENA ANTIPOFF 2");
		linhasOnibus.addElement("E. E. HELENA ANTIPOFF 4");
		linhasOnibus.addElement("E. E. NOSSA SRA. DA LUZ");
		linhasOnibus.addElement("E. E. PINHAIS 1");
		linhasOnibus.addElement("E. E. PINHAIS 2");
		linhasOnibus.addElement("E. E. PINHEIRINHO");
		linhasOnibus.addElement("E. E. SÍTIO CERCADO");
		linhasOnibus.addElement("E. E. STA. HELENA");
		linhasOnibus.addElement("E. E. STA. QUITÉRIA");
		linhasOnibus.addElement("E. E. TATUQUARA");
		linhasOnibus.addElement("E. E. THOMAZ EDISON 1");
		linhasOnibus.addElement("E. E. TOMAZ EDISON 2");
		linhasOnibus.addElement("E. E. TOMAZ EDISON 3");
		linhasOnibus.addElement("E. E. TOMAZ EDISON 4");
		linhasOnibus.addElement("E. E. TOMAZ EDISON 5");
		linhasOnibus.addElement("E. E. VIVIAN MARCAL 1");
		linhasOnibus.addElement("E. E. 29 DE MARÇO 1");
		linhasOnibus.addElement("E. VERÍSSIMO / PANTANAL");
		linhasOnibus.addElement("EMILIANO PERNETA");
		linhasOnibus.addElement("ERASTO  GAERTNER");
		linhasOnibus.addElement("ESPECIAL BOQUEIRAO");
		linhasOnibus.addElement("ESPECIAL HASDRUBAL BELLEGARD");
		linhasOnibus.addElement("ESPECIAL PAUL GARFUNKEL");
		linhasOnibus.addElement("ESPECIAL TROMBINI");
		linhasOnibus.addElement("ESTADOS");
		linhasOnibus.addElement("ESTRIBO AHÚ");
		linhasOnibus.addElement("ESTUDANTES");
		linhasOnibus.addElement("EUCALIPTOS");
		linhasOnibus.addElement("EUCALIPTOS II");
		linhasOnibus.addElement("EUCALIPTOS III / PIONEIROS");
		linhasOnibus.addElement("EXECUTIVO / AEROPORTO");
		linhasOnibus.addElement("FANNY");
		linhasOnibus.addElement("FAZ. RIO GRANDE / A. BRANCA");
		linhasOnibus.addElement("FAZ. RIO GRANDE / MANDIRITUBA");
		linhasOnibus.addElement("FAZEND. / CAIUÁ-FRIGORÍF.");
		linhasOnibus.addElement("FAZENDA / CIC");
		linhasOnibus.addElement("FAZENDA / PINHEIRINHO");
		linhasOnibus.addElement("FAZENDA (DIRETO)");
		linhasOnibus.addElement("FAZENDINHA");
		linhasOnibus.addElement("FAZENDINHA / C. COMPRIDO");
		linhasOnibus.addElement("FAZENDINHA / C.RASO");
		linhasOnibus.addElement("FAZENDINHA / PORTÃO");
		linhasOnibus.addElement("FAZENDINHA / PUC");
		linhasOnibus.addElement("FAZENDINHA / TAMANDARÉ");
		linhasOnibus.addElement("FERNANDO DE NORONHA");
		linhasOnibus.addElement("FERNÃO DIAS");
		linhasOnibus.addElement("FORMOSA");
		linhasOnibus.addElement("FREDOLIN WOLF");
		linhasOnibus.addElement("FUTURAMA");
		linhasOnibus.addElement("FUTURAMA / S. CERCADO");
		linhasOnibus.addElement("GABINETO");
		linhasOnibus.addElement("GANCHINHO");
		linhasOnibus.addElement("GIANNINI");
		linhasOnibus.addElement("GRALHA AZUL");
		linhasOnibus.addElement("GRAMADOS");
		linhasOnibus.addElement("GUABIROTUBA");
		linhasOnibus.addElement("GUARAITUBA");
		linhasOnibus.addElement("GUARAITUBA / CABRAL");
		linhasOnibus.addElement("GUARAITUBA / CABRAL");
		linhasOnibus.addElement("GUARAITUBA / MARACANA");
		linhasOnibus.addElement("GUARITUBA");
		linhasOnibus.addElement("GUILHERMINA");
		linhasOnibus.addElement("HAUER / BOQUEIRÃO");
		linhasOnibus.addElement("HIGIENÓPOLIS");
		linhasOnibus.addElement("HUGO LANGE");
		linhasOnibus.addElement("IGUAÇU I");
		linhasOnibus.addElement("IGUAÇU II");
		linhasOnibus.addElement("IGUAPE I");
		linhasOnibus.addElement("IGUAPE II");
		linhasOnibus.addElement("INTEGRAR  PIRAQUARA");
		linhasOnibus.addElement("INTER 2 ( ANTI-HORÁRIO)");
		linhasOnibus.addElement("INTER 2 (HORÁRIO)");
		linhasOnibus.addElement("INTERBAIRROS I (ANTI-HORÁRIO)");
		linhasOnibus.addElement("INTERBAIRROS I (HORÁRIO)");
		linhasOnibus.addElement("INTERBAIRROS II (ANTI-HORÁRIO)");
		linhasOnibus.addElement("INTERBAIRROS II (HORÁRIO)");
		linhasOnibus.addElement("INTERBAIRROS III");
		linhasOnibus.addElement("INTERBAIRROS IV");
		linhasOnibus.addElement("INTERBAIRROS V");
		linhasOnibus.addElement("INTERBAIRROS VI");
		linhasOnibus.addElement("INTERHOSPITAIS");
		linhasOnibus.addElement("ITAMARATI");
		linhasOnibus.addElement("ITAPERUÇU / CAIC");
		linhasOnibus.addElement("ITAPERUÇU / TAMANDARÉ");
		linhasOnibus.addElement("ITATIAIA");
		linhasOnibus.addElement("ITUPAVA / HOSP. MILITAR");
		linhasOnibus.addElement("JACOB MACANHAN");
		linhasOnibus.addElement("JD. BELA VISTA");
		linhasOnibus.addElement("JD. BOA VISTA");
		linhasOnibus.addElement("JD. CENTAURO");
		linhasOnibus.addElement("JD. CHAPARRAL");
		linhasOnibus.addElement("JD. CLÁUDIA");
		linhasOnibus.addElement("JD. DAS GRAÇAS");
		linhasOnibus.addElement("JD. DO ARROIO");
		linhasOnibus.addElement("JD. ESPLANADA");
		linhasOnibus.addElement("JD. EUCALIPTOS");
		linhasOnibus.addElement("JD. GRAMADOS");
		linhasOnibus.addElement("JD. GRAZIELA");
		linhasOnibus.addElement("JD. HOLANDÊS");
		linhasOnibus.addElement("JD. INDEPENDÊNCIA / CIC");
		linhasOnibus.addElement("JD. IPÊ");
		linhasOnibus.addElement("JD. IRAÍ");
		linhasOnibus.addElement("JD. ITÁLIA");
		linhasOnibus.addElement("JD. ITIBERÊ");
		linhasOnibus.addElement("JD. KOSMOS");
		linhasOnibus.addElement("JD. LUDOVICA");
		linhasOnibus.addElement("JD. MERCÊS / GUANABARA");
		linhasOnibus.addElement("JD. MONTE SANTO");
		linhasOnibus.addElement("JD. ORDEM");
		linhasOnibus.addElement("JD. PARAÍSO / TAMANDARÉ");
		linhasOnibus.addElement("JD. PARANAENSE");
		linhasOnibus.addElement("JD. PIONEIRO");
		linhasOnibus.addElement("JD. SOCIAL / BATEL");
		linhasOnibus.addElement("JD. STA. MÔNICA");
		linhasOnibus.addElement("JD. TROPICAL");
		linhasOnibus.addElement("JD. VENEZA");
		linhasOnibus.addElement("JOAQUINA");
		linhasOnibus.addElement("JOSÉ CULPI");
		linhasOnibus.addElement("JÚLIO GRAF");
		linhasOnibus.addElement("JUVEVÊ / ÁGUA VERDE");
		linhasOnibus.addElement("KAMYR");
		linhasOnibus.addElement("LARANJEIRAS");
		linhasOnibus.addElement("LD OSTERNACK / S. CERCADO");
		linhasOnibus.addElement("LG. FERREIRAS / PINHEIRINHO");
		linhasOnibus.addElement("LIGEIRÃO - PINHEIRINHO / C. GOMES");
		linhasOnibus.addElement("LIGEIRAO BOQUEIRAO");
		linhasOnibus.addElement("LINDÓIA");
		linhasOnibus.addElement("LONDRINA");
		linhasOnibus.addElement("LUIZ NICHELE");
		linhasOnibus.addElement("MAD. ABRANCHES");
		linhasOnibus.addElement("MAD. BAIRRO NOVO");
		linhasOnibus.addElement("MAD. BOQUEIRÃO");
		linhasOnibus.addElement("MAD. CAIUÁ");
		linhasOnibus.addElement("MAD. CAMPO COMPRIDO");
		linhasOnibus.addElement("MAD. CAMPO COMPRIDO");
		linhasOnibus.addElement("MAD. CENTENÁRIO");
		linhasOnibus.addElement("MAD. CENTENÁRIO / RUI BARBOSA");
		linhasOnibus.addElement("MAD. CIC");
		linhasOnibus.addElement("MAD. CTBA / PINHAIS");
		linhasOnibus.addElement("MAD. CTBA / PIRAQUARA");
		linhasOnibus.addElement("MAD. CTBA / SÃO DIMAS");
		linhasOnibus.addElement("MAD. CTBA / SÃO JOSÉ");
		linhasOnibus.addElement("MAD. CTBA / TAMANDARÉ");
		linhasOnibus.addElement("MAD. FAZ. RIO GRANDE");
		linhasOnibus.addElement("MAD. FERRARIA");
		linhasOnibus.addElement("MAD. JD. GRAZIELA");
		linhasOnibus.addElement("MAD. PENHA / F. NORONHA");
		linhasOnibus.addElement("MAD. PETRÓPOLIS / SOLITUDE");
		linhasOnibus.addElement("MAD. PILARZINHO / UBERABA");
		linhasOnibus.addElement("MAD. PINHEIRINHO");
		linhasOnibus.addElement("MAD. S. CÂNDIDA / C. RASO");
		linhasOnibus.addElement("MAD. S. FRANCISCO / IGUAPE");
		linhasOnibus.addElement("MAD. S. PEDRO / R. NEGRO");
		linhasOnibus.addElement("MAD. SÃO BRÁZ");
		linhasOnibus.addElement("MAD. STA. FELICIDADE");
		linhasOnibus.addElement("MAD. TARUMÃ / AUGUSTA");
		linhasOnibus.addElement("MAD. TATUQUARA");
		linhasOnibus.addElement("MAD. V. VELHA");
		linhasOnibus.addElement("MAL. HERMES / STA. EFIGÊNIA");
		linhasOnibus.addElement("MARACANÃ / B. ALTO");
		linhasOnibus.addElement("MARACANÃ / C. IMBUIA");
		linhasOnibus.addElement("MARACANA / LINHA VERDE");
		linhasOnibus.addElement("MARACANÃ / STA.  CÂNDIDA");
		linhasOnibus.addElement("MARACANÃ / STA. CÂNDIDA");
		linhasOnibus.addElement("MARIA ANGÉLICA");
		linhasOnibus.addElement("MARINGÁ");
		linhasOnibus.addElement("MATEUS LEME");
		linhasOnibus.addElement("MENONITAS");
		linhasOnibus.addElement("MERCÚRIO");
		linhasOnibus.addElement("MONTANA");
		linhasOnibus.addElement("MONTE CASTELO");
		linhasOnibus.addElement("MOSSUNGUÊ");
		linhasOnibus.addElement("NAÇÕES I");
		linhasOnibus.addElement("NAÇÕES II");
		linhasOnibus.addElement("NILO PEÇANHA");
		linhasOnibus.addElement("NIVALDO BRAGA");
		linhasOnibus.addElement("NOSSA SRA. DA LUZ");
		linhasOnibus.addElement("NOSSA SRA. DE NAZARÉ");
		linhasOnibus.addElement("NOVENA");
		linhasOnibus.addElement("NOVO MUNDO");
		linhasOnibus.addElement("OLARIA");
		linhasOnibus.addElement("OSTERNACK / BOQUEIRÃO");
		linhasOnibus.addElement("OSTERNACK / S. CERCADO");
		linhasOnibus.addElement("OURO VERDE / V. BÁDIA");
		linhasOnibus.addElement("PAINEIRAS");
		linhasOnibus.addElement("PALMEIRA");
		linhasOnibus.addElement("PALOMA");
		linhasOnibus.addElement("PALOMA / GUARAITUBA");
		linhasOnibus.addElement("PALOTINOS");
		linhasOnibus.addElement("PARAÍSO");
		linhasOnibus.addElement("PARIGOT DE SOUZA");
		linhasOnibus.addElement("PARQUE INDUSTRIAL");
		linhasOnibus.addElement("PASSAÚNA");
		linhasOnibus.addElement("PETRÓPOLIS");
		linhasOnibus.addElement("PINHAIS / B. ALTO");
		linhasOnibus.addElement("PINHAIS / C. COMPRIDO");
		linhasOnibus.addElement("PINHAIS / GUADALUPE");
		linhasOnibus.addElement("PINHAIS / PIRAQUARA");
		linhasOnibus.addElement("PINHAIS / RUI BARBOSA");
		linhasOnibus.addElement("PINHEIRINHO");
		linhasOnibus.addElement("PINHEIRINHO");
		linhasOnibus.addElement("PINHEIRINHO / CIC");
		linhasOnibus.addElement("PINHEIRINHO / ZOOLÓGICO");
		linhasOnibus.addElement("PINHEIROS");
		linhasOnibus.addElement("PIRATINI / BR 476");
		linhasOnibus.addElement("PIRINEUS");
		linhasOnibus.addElement("PLANALTO");
		linhasOnibus.addElement("PLANTA DEODORO");
		linhasOnibus.addElement("PLANTA KARLA");
		linhasOnibus.addElement("POMPÉIA");
		linhasOnibus.addElement("PORTÃO");
		linhasOnibus.addElement("PORTÃO / CIC");
		linhasOnibus.addElement("PORTAO / STA. BERNADETHE - L. VERDE");
		linhasOnibus.addElement("PORTAO/SITIO CERCADO");
		linhasOnibus.addElement("PORTEIRA / PALOMA");
		linhasOnibus.addElement("PORTO BELO");
		linhasOnibus.addElement("PQ. INDUSTRIAL");
		linhasOnibus.addElement("PRADO VELHO / P. MORO");
		linhasOnibus.addElement("PRESÍDIO");
		linhasOnibus.addElement("PRIMAVERA");
		linhasOnibus.addElement("PRIVÊ");
		linhasOnibus.addElement("PUC / SÃO JOSÉ");
		linhasOnibus.addElement("Q. BARRAS / BOCAIÚVA");
		linhasOnibus.addElement("Q. BARRAS / PIRAQUARA");
		linhasOnibus.addElement("Q. BARRAS/T.PAULISTA-ANTI HORARI");
		linhasOnibus.addElement("Q. BARRAS/T.PAULISTA-HORARIO");
		linhasOnibus.addElement("QUARTEL GENERAL");
		linhasOnibus.addElement("QUITANDINHA / PINHEIRINHO");
		linhasOnibus.addElement("R. BRANCO / TAMANDARÉ");
		linhasOnibus.addElement("RAPOSO TAVARES");
		linhasOnibus.addElement("RAQUEL PRADO / PUC");
		linhasOnibus.addElement("REBOUÇAS");
		linhasOnibus.addElement("REFORÇO COLINA");
		linhasOnibus.addElement("REFORÇO HAUER");
		linhasOnibus.addElement("REFORÇO TERMINAL");
		linhasOnibus.addElement("RIBEIRA / FCO. CORADIN");
		linhasOnibus.addElement("RIO BONITO");
		linhasOnibus.addElement("RIO BONITO / CIC");
		linhasOnibus.addElement("RIO NEGRO");
		linhasOnibus.addElement("RIO VERDE");
		linhasOnibus.addElement("RIVIERA");
		linhasOnibus.addElement("ROÇA GRANDE /  APDEC");
		linhasOnibus.addElement("RONDON");
		linhasOnibus.addElement("ROSEIRA");
		linhasOnibus.addElement("RUA XV / BARIGUI");
		linhasOnibus.addElement("RURBANA");
		linhasOnibus.addElement("S. CERCADO / BOQUEIRÃO");
		linhasOnibus.addElement("S. CERCADO / C. RASO");
		linhasOnibus.addElement("SABARÁ");
		linhasOnibus.addElement("SAGRADO CORAÇÃO");
		linhasOnibus.addElement("SAN FRANCISCO");
		linhasOnibus.addElement("SÃO BENEDITO");
		linhasOnibus.addElement("SÃO BERNARDO");
		linhasOnibus.addElement("SÃO BRAZ");
		linhasOnibus.addElement("SÃO CRISTÓVÃO");
		linhasOnibus.addElement("SÃO FRANCISCO");
		linhasOnibus.addElement("SÃO JOÃO");
		linhasOnibus.addElement("SÃO JORGE");
		linhasOnibus.addElement("SÃO JORGE");
		linhasOnibus.addElement("SÃO JOSÉ / D. FINA");
		linhasOnibus.addElement("SATURNO");
		linhasOnibus.addElement("SAVÓIA");
		linhasOnibus.addElement("SITIO CERCADO / C. RASO");
		linhasOnibus.addElement("SÍTIO CERCADO (ANTI-HORÁRIO)");
		linhasOnibus.addElement("SÍTIO CERCADO (HORÁRIO)");
		linhasOnibus.addElement("SOLAR");
		linhasOnibus.addElement("SOLITUDE");
		linhasOnibus.addElement("STA. AMÉLIA");
		linhasOnibus.addElement("STA. ÂNGELA");
		linhasOnibus.addElement("STA. BARBARA");
		linhasOnibus.addElement("STA. CÂNDIDA / C. RASO");
		linhasOnibus.addElement("STA. CÂNDIDA / PINHEIRINHO");
		linhasOnibus.addElement("STA. CRUZ");
		linhasOnibus.addElement("STA. FELICIDADE");
		linhasOnibus.addElement("STA. FELICIDADE");
		linhasOnibus.addElement("STA. FELICIDADE / STA. CÂNDIDA");
		linhasOnibus.addElement("STA. GEMA");
		linhasOnibus.addElement("STA. HELENA");
		linhasOnibus.addElement("STA. INÊS");
		linhasOnibus.addElement("STA. JOANA");
		linhasOnibus.addElement("STA. MARIA");
		linhasOnibus.addElement("STA. QUITÉRIA");
		linhasOnibus.addElement("STA. RITA / CIC");
		linhasOnibus.addElement("STA. RITA / PINHEIRINHO");
		linhasOnibus.addElement("STA. TEREZINHA");
		linhasOnibus.addElement("STA. TEREZINHA");
		linhasOnibus.addElement("STA. TEREZINHA / IPE");
		linhasOnibus.addElement("T. BOQ. / T. AFONSO PENA");
		linhasOnibus.addElement("T. BOQ. / T. CENTRAL");
		linhasOnibus.addElement("T. C. IMBUIA / T. PINHAIS");
		linhasOnibus.addElement("T. C. LARGO / CAMP. SIQUEIRA");
		linhasOnibus.addElement("T. CACHOEIRA / T. MARACANÃ");
		linhasOnibus.addElement("TAMANDARÉ");
		linhasOnibus.addElement("TAMANDARÉ / CABRAL");
		linhasOnibus.addElement("TAMANDARÉ / CABRAL");
		linhasOnibus.addElement("TAMANDARÉ / COLOMBO");
		linhasOnibus.addElement("TANGUÁ / TAMANDARÉ");
		linhasOnibus.addElement("TARUMÃ");
		linhasOnibus.addElement("TERMINAL CIC");
		linhasOnibus.addElement("TIMBOTUVA (EST. NOVA)");
		linhasOnibus.addElement("TIMBOTUVA (EST. VELHA)");
		linhasOnibus.addElement("TINGUI");
		linhasOnibus.addElement("TRABALHADOR");
		linhasOnibus.addElement("TRAMONTINA");
		linhasOnibus.addElement("TRINDADE");
		linhasOnibus.addElement("TUIUTI / BARIGUI");
		linhasOnibus.addElement("TURISMO");
		linhasOnibus.addElement("UBERABA");
		linhasOnibus.addElement("UBERLÂNDIA");
		linhasOnibus.addElement("UMBARÁ");
		linhasOnibus.addElement("UNIV.POSITIVO");
		linhasOnibus.addElement("V. AMÉLIA");
		linhasOnibus.addElement("V. AUTÓDROMO");
		linhasOnibus.addElement("V. CUBAS");
		linhasOnibus.addElement("V. ESPERANÇA");
		linhasOnibus.addElement("V. GRANDE / V. TARUMÃ");
		linhasOnibus.addElement("V. IZABEL");
		linhasOnibus.addElement("V. LEONICE");
		linhasOnibus.addElement("V. MACEDO");
		linhasOnibus.addElement("V. MACEDO");
		linhasOnibus.addElement("V. MARIA ANTONIETA");
		linhasOnibus.addElement("V. MARIA DO ROSÁRIO");
		linhasOnibus.addElement("V. MARISA");
		linhasOnibus.addElement("V. MARQUETO");
		linhasOnibus.addElement("V. NORI");
		linhasOnibus.addElement("V. NOVA");
		linhasOnibus.addElement("V. PRADO");
		linhasOnibus.addElement("V. RENO");
		linhasOnibus.addElement("V. REX");
		linhasOnibus.addElement("V. ROSINHA");
		linhasOnibus.addElement("V. SANDRA");
		linhasOnibus.addElement("V. SÃO PAULO");
		linhasOnibus.addElement("V. SÃO PEDRO");
		linhasOnibus.addElement("V. SUIÇA");
		linhasOnibus.addElement("V. URANO");
		linhasOnibus.addElement("V. VELHA");
		linhasOnibus.addElement("V. VERDE");
		linhasOnibus.addElement("VENEZA");
		linhasOnibus.addElement("VIC. DE CARVALHO / C. IMBUIA");
		linhasOnibus.addElement("VILA VELHA/BURITI");
		linhasOnibus.addElement("VITÓRIA RÉGIA");
		linhasOnibus.addElement("V.JULIANA");
		linhasOnibus.addElement("WEISSÓPOLIS");
		linhasOnibus.addElement("XAXIM / CAPÃO RASO");
		linhasOnibus.addElement("XAXIM / LINHA VERDE");
		linhasOnibus.addElement("ZOOLÓGICO");
		
		return linhasOnibus;
	} 

		public static Onibus getByNome(String nome) {
		if (nome.equals("A. BRANCA / FAZ. RIO GRANDE")) {
			return OnibusG12.create();
		}
	
		if (nome.equals("A. MUNHOZ / J. BOTÂNICO")) {
			return Onibus464.create();
		}
	
		if (nome.equals("ABAETÉ")) {
			return Onibus226.create();
		}
	
		if (nome.equals("ABRANCHES")) {
			return Onibus182.create();
		}
	
		if (nome.equals("ACRÓPOLE")) {
			return Onibus332.create();
		}
	
		if (nome.equals("AEROPORTO")) {
			return Onibus208.create();
		}
	
		if (nome.equals("AGRÍCOLA")) {
			return Onibus334.create();
		}
	
		if (nome.equals("ÁGUA CLARA")) {
			return OnibusC13.create();
		}
	
		if (nome.equals("ÁGUA VERDE/ ABRANCHES")) {
			return Onibus180.create();
		}
	
		if (nome.equals("AGUDOS DO SUL")) {
			return OnibusI21.create();
		}
	
		if (nome.equals("AHÚ / LOS ANGELES")) {
			return Onibus265.create();
		}
	
		if (nome.equals("ALFERES POLI")) {
			return Onibus560.create();
		}
	
		if (nome.equals("ALIANÇA")) {
			return Onibus232.create();
		}
	
		if (nome.equals("ALTO BOQUEIRÃO")) {
			return Onibus629.create();
		}
	
		if (nome.equals("ALTO TARUMÃ")) {
			return Onibus373.create();
		}
	
		if (nome.equals("ANA TERRA / ADRIANE")) {
			return OnibusB15.create();
		}
	
		if (nome.equals("ANGÉLICA / C. RASO")) {
			return OnibusH20.create();
		}
	
		if (nome.equals("ANGÉLICA / CIC")) {
			return OnibusH21.create();
		}
	
		if (nome.equals("ARAGUAIA")) {
			return Onibus311.create();
		}
	
		if (nome.equals("ARAUCARIA / CAMPO LARGO")) {
			return OnibusI32.create();
		}
	
		if (nome.equals("ARAUCÁRIA / PINHEIRINHO")) {
			return OnibusH11.create();
		}
	
		if (nome.equals("ARAUCÁRIA / PORTÃO")) {
			return OnibusH12.create();
		}
	
		if (nome.equals("AUGUSTA")) {
			return Onibus823.create();
		}
	
		if (nome.equals("AUGUSTO STRESSER")) {
			return Onibus361.create();
		}
	
		if (nome.equals("AVENIDA IRAÍ / C. IMBUIA")) {
			return Onibus313.create();
		}
	
		if (nome.equals("B. ALTO / BOA VISTA")) {
			return Onibus342.create();
		}
	
		if (nome.equals("B. ALTO / E. PERNETA")) {
			return OnibusC41.create();
		}
	
		if (nome.equals("B. ALTO / STA. CÂNDIDA")) {
			return Onibus341.create();
		}
	
		if (nome.equals("B. ALTO / STA. FELICIDADE")) {
			return Onibus307.create();
		}
	
		if (nome.equals("BAIRRO NOVO")) {
			return Onibus506.create();
		}
	
		if (nome.equals("BAIRRO NOVO A")) {
			return Onibus541.create();
		}
	
		if (nome.equals("BAIRRO NOVO B")) {
			return Onibus542.create();
		}
	
		if (nome.equals("BAIRRO NOVO C")) {
			return Onibus547.create();
		}
	
		if (nome.equals("BANESTADO / CALIFÓRNIA")) {
			return Onibus231.create();
		}
	
		if (nome.equals("BARREIRINHA")) {
			return Onibus205.create();
		}
	
		if (nome.equals("BARREIRINHA / SÃO JOSÉ")) {
			return Onibus206.create();
		}
	
		if (nome.equals("BIGORRILHO")) {
			return Onibus875.create();
		}
	
		if (nome.equals("BOA VISTA / BARREIRINHA")) {
			return Onibus225.create();
		}
	
		if (nome.equals("BOCAIÚVA DO SUL")) {
			return OnibusB33.create();
		}
	
		if (nome.equals("BOM PASTOR")) {
			return Onibus922.create();
		}
	
		if (nome.equals("BOM RETIRO / PUC")) {
			return Onibus175.create();
		}
	
		if (nome.equals("BOQUEIRÃO")) {
			return Onibus503.create();
		}
	
		if (nome.equals("BOQUEIRÃO / C. CÍVICO")) {
			return Onibus505.create();
		}
	
		if (nome.equals("BOQUEIRAO / KRAFT")) {
			return Onibus540.create();
		}
	
		if (nome.equals("BORDA DO CAMPO")) {
			return OnibusO71.create();
		}
	
		if (nome.equals("BOSCH")) {
			return Onibus627.create();
		}
	
		if (nome.equals("BRACATINGA")) {
			return Onibus170.create();
		}
	
		if (nome.equals("BRITANITE")) {
			return OnibusO75.create();
		}
	
		if (nome.equals("BUTIATUVINHA")) {
			return Onibus913.create();
		}
	
		if (nome.equals("C. BELEM / S. FILHO")) {
			return Onibus516.create();
		}
	
		if (nome.equals("C. COMPRIDO / C. RASO")) {
			return Onibus828.create();
		}
	
		if (nome.equals("C. COMPRIDO / CIC")) {
			return Onibus826.create();
		}
	
		if (nome.equals("C. IMBUIA / PQ. BARIGUI")) {
			return Onibus393.create();
		}
	
		if (nome.equals("C. LARGO / BALSA NOVA")) {
			return OnibusI30.create();
		}
	
		if (nome.equals("C. MÚSICA / V. ALEGRE")) {
			return Onibus150.create();
		}
	
		if (nome.equals("C. RASO / CAIUÁ")) {
			return Onibus658.create();
		}
	
		if (nome.equals("C. RASO / CAMP. SIQUEIRA")) {
			return Onibus024.create();
		}
	
		if (nome.equals("CABRAL / BOM RETIRO")) {
			return Onibus201.create();
		}
	
		if (nome.equals("CABRAL / CACHOEIRA")) {
			return Onibus215.create();
		}
	
		if (nome.equals("CABRAL / MARACANÃ")) {
			return OnibusB02.create();
		}
	
		if (nome.equals("CABRAL / OSÓRIO")) {
			return Onibus207.create();
		}
	
		if (nome.equals("CABRAL / PORTÃO")) {
			return Onibus216.create();
		}
	
		if (nome.equals("CACHIMBA")) {
			return Onibus647.create();
		}
	
		if (nome.equals("CACHIMBA / OLARIA")) {
			return Onibus659.create();
		}
	
		if (nome.equals("CAIUÁ")) {
			return Onibus703.create();
		}
	
		if (nome.equals("CAIUA / C.COMPRIDO")) {
			return Onibus732.create();
		}
	
		if (nome.equals("CAJURU")) {
			return Onibus386.create();
		}
	
		if (nome.equals("CAMARGO")) {
			return Onibus322.create();
		}
	
		if (nome.equals("CAMP. SIQUEIRA / BATEL")) {
			return Onibus801.create();
		}
	
		if (nome.equals("CAMPO ALEGRE")) {
			return Onibus654.create();
		}
	
		if (nome.equals("CAMPO LARGO")) {
			return OnibusJ15.create();
		}
	
		if (nome.equals("CAMPO MAGRO")) {
			return Onibus923.create();
		}
	
		if (nome.equals("CANAL BELÉM")) {
			return Onibus475.create();
		}
	
		if (nome.equals("CARBOMAFRA")) {
			return Onibus628.create();
		}
	
		if (nome.equals("CARMELA DUTRA")) {
			return Onibus776.create();
		}
	
		if (nome.equals("CASA DE CUSTÓDIA")) {
			return Onibus668.create();
		}
	
		if (nome.equals("CASSIOPÉIA")) {
			return Onibus224.create();
		}
	
		if (nome.equals("CENTENÁRIO")) {
			return Onibus305.create();
		}
	
		if (nome.equals("CENTENÁRIO / BOQUEIRÃO")) {
			return Onibus335.create();
		}
	
		if (nome.equals("CENTENÁRIO / C. COMPRIDO")) {
			return Onibus303.create();
		}
	
		if (nome.equals("CENTENÁRIO / HAUER")) {
			return Onibus338.create();
		}
	
		if (nome.equals("CENTENÁRIO / RUI BARBOSA")) {
			return Onibus302.create();
		}
	
		if (nome.equals("CENTRO POLITÉCNICO")) {
			return Onibus469.create();
		}
	
		if (nome.equals("CIC / TIRADENTES")) {
			return Onibus601.create();
		}
	
		if (nome.equals("CIRCULAR CENTRO (ANTI-HORÁRIO)")) {
			return Onibus002.create();
		}
	
		if (nome.equals("CIRCULAR CENTRO (HORÁRIO)")) {
			return Onibus001.create();
		}
	
		if (nome.equals("CIRCULAR SUL  (ANTI-HORÁRIO)")) {
			return Onibus602.create();
		}
	
		if (nome.equals("CIRCULAR SUL (HORÁRIO)")) {
			return Onibus502.create();
		}
	
		if (nome.equals("COLINA VERDE")) {
			return Onibus211.create();
		}
	
		if (nome.equals("COLOMBO / ANG. CARON")) {
			return OnibusI31.create();
		}
	
		if (nome.equals("COLOMBO / CIC")) {
			return Onibus607.create();
		}
	
		if (nome.equals("COLOMBO / SÃO JOSÉ")) {
			return OnibusI20.create();
		}
	
		if (nome.equals("COLÔNIA FARIA")) {
			return OnibusB24.create();
		}
	
		if (nome.equals("COTOLENGO")) {
			return Onibus778.create();
		}
	
		if (nome.equals("CRISTO REI")) {
			return Onibus385.create();
		}
	
		if (nome.equals("CTBA  / V. PALMITAL")) {
			return OnibusC72.create();
		}
	
		if (nome.equals("CTBA / APOLO")) {
			return OnibusE02.create();
		}
	
		if (nome.equals("CTBA / ARAUCÁRIA")) {
			return Onibus606.create();
		}
	
		if (nome.equals("CTBA / ARAUCÁRIA")) {
			return OnibusH01.create();
		}
	
		if (nome.equals("CTBA / AREIA BRANCA")) {
			return OnibusG72.create();
		}
	
		if (nome.equals("CTBA / BATEIAS")) {
			return OnibusP63.create();
		}
	
		if (nome.equals("CTBA / BRAGA")) {
			return OnibusE67.create();
		}
	
		if (nome.equals("CTBA / C. GDE  SUL (RAPIDO)")) {
			return OnibusN70.create();
		}
	
		if (nome.equals("CTBA / C. GRANDE DO SUL")) {
			return OnibusN71.create();
		}
	
		if (nome.equals("CTBA / C. LARGO")) {
			return OnibusJ62.create();
		}
	
		if (nome.equals("CTBA / CAMP. DOS PAULAS")) {
			return OnibusG73.create();
		}
	
		if (nome.equals("CTBA / CAMPO LARGO")) {
			return Onibus805.create();
		}
	
		if (nome.equals("CTBA / CAP. DO ATUBA")) {
			return OnibusB61.create();
		}
	
		if (nome.equals("CTBA / CERNE")) {
			return OnibusP64.create();
		}
	
		if (nome.equals("CTBA / COLOMBO (CAMBARÁ)")) {
			return OnibusB80.create();
		}
	
		if (nome.equals("CTBA / COLOMBO (GUARACI)")) {
			return OnibusB81.create();
		}
	
		if (nome.equals("CTBA / COLOMBO (ROD. UVA)")) {
			return OnibusB72.create();
		}
	
		if (nome.equals("CTBA / CONJ. ATUBA")) {
			return OnibusC63.create();
		}
	
		if (nome.equals("CTBA / CONTENDA")) {
			return OnibusR71.create();
		}
	
		if (nome.equals("CTBA / EUGÊNIA MARIA")) {
			return OnibusN72.create();
		}
	
		if (nome.equals("CTBA / FAZ. RIO GRANDE")) {
			return Onibus605.create();
		}
	
		if (nome.equals("CTBA / GUATUPÊ")) {
			return OnibusE77.create();
		}
	
		if (nome.equals("CTBA / INDEPENDÊNCIA")) {
			return OnibusE66.create();
		}
	
		if (nome.equals("CTBA / ITAPERUÇU")) {
			return OnibusK71.create();
		}
	
		if (nome.equals("CTBA / JD. ANA ROSA")) {
			return OnibusB82.create();
		}
	
		if (nome.equals("CTBA / JD. ARAPONGAS")) {
			return OnibusB75.create();
		}
	
		if (nome.equals("CTBA / JD. CÉSAR AUGUSTO")) {
			return OnibusB74.create();
		}
	
		if (nome.equals("CTBA / JD. CRISTAL")) {
			return OnibusE75.create();
		}
	
		if (nome.equals("CTBA / JD. CRUZEIRO")) {
			return OnibusE73.create();
		}
	
		if (nome.equals("CTBA / JD. CURITIBA")) {
			return OnibusB77.create();
		}
	
		if (nome.equals("CTBA / JD. IPÊ")) {
			return OnibusE71.create();
		}
	
		if (nome.equals("CTBA / JD. IZAURA")) {
			return OnibusE72.create();
		}
	
		if (nome.equals("CTBA / JD. MARROCOS")) {
			return OnibusA73.create();
		}
	
		if (nome.equals("CTBA / JD. OSASCO")) {
			return OnibusB73.create();
		}
	
		if (nome.equals("CTBA / JD. PARAÍSO")) {
			return OnibusA72.create();
		}
	
		if (nome.equals("CTBA / JD. SÃO GABRIEL")) {
			return OnibusB78.create();
		}
	
		if (nome.equals("CTBA / MANDIRITUBA")) {
			return OnibusG71.create();
		}
	
		if (nome.equals("CTBA / MARACANÃ")) {
			return OnibusB01.create();
		}
	
		if (nome.equals("CTBA / PEDRO MORO")) {
			return OnibusE62.create();
		}
	
		if (nome.equals("CTBA / PIRAQUARA")) {
			return OnibusD61.create();
		}
	
		if (nome.equals("CTBA / PIRAQUARA (DIRETO)")) {
			return OnibusD66.create();
		}
	
		if (nome.equals("CTBA / POSTO PARIS")) {
			return OnibusE76.create();
		}
	
		if (nome.equals("CTBA / POUSADA")) {
			return OnibusO72.create();
		}
	
		if (nome.equals("CTBA / PUC")) {
			return OnibusE70.create();
		}
	
		if (nome.equals("CTBA / Q. BARRAS (BR 116)")) {
			return OnibusO74.create();
		}
	
		if (nome.equals("CTBA / Q. BARRAS (GRACIOSA)")) {
			return OnibusO73.create();
		}
	
		if (nome.equals("CTBA / QUISISANA")) {
			return OnibusE68.create();
		}
	
		if (nome.equals("CTBA / R. BCO. DO SUL")) {
			return OnibusL71.create();
		}
	
		if (nome.equals("CTBA / ROÇA GRANDE")) {
			return OnibusB79.create();
		}
	
		if (nome.equals("CTBA / ROSEIRA")) {
			return OnibusE78.create();
		}
	
		if (nome.equals("CTBA / SÃO JOSÉ")) {
			return OnibusE05.create();
		}
	
		if (nome.equals("CTBA / SÃO SEBASTIÃO")) {
			return OnibusB76.create();
		}
	
		if (nome.equals("CTBA / STA. TEREZA")) {
			return OnibusB83.create();
		}
	
		if (nome.equals("CTBA / TAMANDARÉ")) {
			return OnibusA01.create();
		}
	
		if (nome.equals("CTBA / TAMANDARÉ (LAMENHA)")) {
			return OnibusA07.create();
		}
	
		if (nome.equals("CTBA / TAMANDARÉ (MINÉRIOS)")) {
			return OnibusA06.create();
		}
	
		if (nome.equals("CTBA / TANGUÁ")) {
			return OnibusA77.create();
		}
	
		if (nome.equals("CTBA / TERRA BOA")) {
			return OnibusP65.create();
		}
	
		if (nome.equals("CTBA / TIMBÚ")) {
			return OnibusN73.create();
		}
	
		if (nome.equals("CTBA / URANO")) {
			return OnibusE01.create();
		}
	
		if (nome.equals("CTBA / V.  MARTA")) {
			return OnibusA78.create();
		}
	
		if (nome.equals("CTBA / V. ZUMBI")) {
			return OnibusC66.create();
		}
	
		if (nome.equals("CTBA / XINGU")) {
			return OnibusE65.create();
		}
	
		if (nome.equals("CTBA/GUARAITUBA(VIA MARACANA)")) {
			return OnibusB06.create();
		}
	
		if (nome.equals("CTBA/Q.BARRAS(RAPIDO)")) {
			return OnibusO76.create();
		}
	
		if (nome.equals("DALAGASSA")) {
			return Onibus681.create();
		}
	
		if (nome.equals("DETRAN / VIC. MACHADO")) {
			return Onibus380.create();
		}
	
		if (nome.equals("DIRETO C. IMBUIA")) {
			return OnibusC05.create();
		}
	
		if (nome.equals("DIRETO CABRAL")) {
			return OnibusB31.create();
		}
	
		if (nome.equals("DOM ÁTICO")) {
			return Onibus662.create();
		}
	
		if (nome.equals("E. E. ALCINDO FANAYA 1")) {
			return Onibus699.create();
		}
	
		if (nome.equals("E. E. ALCINDO FANAYA 2")) {
			return Onibus795.create();
		}
	
		if (nome.equals("E. E. ALI BARK 1")) {
			return Onibus799.create();
		}
	
		if (nome.equals("E. E. ALI BARK 2")) {
			return Onibus798.create();
		}
	
		if (nome.equals("E. E. ALTO BOQUEIRÃO")) {
			return Onibus695.create();
		}
	
		if (nome.equals("E. E. APAE 1")) {
			return Onibus399.create();
		}
	
		if (nome.equals("E. E. APAE 2")) {
			return Onibus596.create();
		}
	
		if (nome.equals("E. E. APAE 3")) {
			return Onibus598.create();
		}
	
		if (nome.equals("E. E. APAE 6")) {
			return Onibus396.create();
		}
	
		if (nome.equals("E. E. BAIRRO NOVO")) {
			return Onibus694.create();
		}
	
		if (nome.equals("E. E. C. IMBUIA")) {
			return Onibus398.create();
		}
	
		if (nome.equals("E. E. CAJURU")) {
			return Onibus397.create();
		}
	
		if (nome.equals("E. E. CENTRAU 1")) {
			return Onibus394.create();
		}
	
		if (nome.equals("E. E. CIC")) {
			return Onibus899.create();
		}
	
		if (nome.equals("E. E. ECUMÊNICA 1")) {
			return Onibus697.create();
		}
	
		if (nome.equals("E. E. ECUMÊNICA 2")) {
			return Onibus897.create();
		}
	
		if (nome.equals("E. E. HELENA ANTIPOFF 1")) {
			return Onibus599.create();
		}
	
		if (nome.equals("E. E. HELENA ANTIPOFF 2")) {
			return Onibus497.create();
		}
	
		if (nome.equals("E. E. HELENA ANTIPOFF 4")) {
			return Onibus499.create();
		}
	
		if (nome.equals("E. E. NOSSA SRA. DA LUZ")) {
			return Onibus698.create();
		}
	
		if (nome.equals("E. E. PINHAIS 1")) {
			return Onibus495.create();
		}
	
		if (nome.equals("E. E. PINHAIS 2")) {
			return Onibus498.create();
		}
	
		if (nome.equals("E. E. PINHEIRINHO")) {
			return Onibus696.create();
		}
	
		if (nome.equals("E. E. SÍTIO CERCADO")) {
			return Onibus597.create();
		}
	
		if (nome.equals("E. E. STA. HELENA")) {
			return Onibus796.create();
		}
	
		if (nome.equals("E. E. STA. QUITÉRIA")) {
			return Onibus797.create();
		}
	
		if (nome.equals("E. E. TATUQUARA")) {
			return Onibus895.create();
		}
	
		if (nome.equals("E. E. THOMAZ EDISON 1")) {
			return Onibus693.create();
		}
	
		if (nome.equals("E. E. TOMAZ EDISON 2")) {
			return Onibus893.create();
		}
	
		if (nome.equals("E. E. TOMAZ EDISON 3")) {
			return Onibus691.create();
		}
	
		if (nome.equals("E. E. TOMAZ EDISON 4")) {
			return Onibus392.create();
		}
	
		if (nome.equals("E. E. TOMAZ EDISON 5")) {
			return Onibus692.create();
		}
	
		if (nome.equals("E. E. VIVIAN MARCAL 1")) {
			return Onibus998.create();
		}
	
		if (nome.equals("E. E. 29 DE MARÇO 1")) {
			return Onibus894.create();
		}
	
		if (nome.equals("E. VERÍSSIMO / PANTANAL")) {
			return Onibus533.create();
		}
	
		if (nome.equals("EMILIANO PERNETA")) {
			return OnibusC23.create();
		}
	
		if (nome.equals("ERASTO  GAERTNER")) {
			return Onibus465.create();
		}
	
		if (nome.equals("ESPECIAL BOQUEIRAO")) {
			return OnibusX12.create();
		}
	
		if (nome.equals("ESPECIAL HASDRUBAL BELLEGARD")) {
			return OnibusX19.create();
		}
	
		if (nome.equals("ESPECIAL PAUL GARFUNKEL")) {
			return OnibusX18.create();
		}
	
		if (nome.equals("ESPECIAL TROMBINI")) {
			return Onibus968.create();
		}
	
		if (nome.equals("ESTADOS")) {
			return OnibusF13.create();
		}
	
		if (nome.equals("ESTRIBO AHÚ")) {
			return Onibus266.create();
		}
	
		if (nome.equals("ESTUDANTES")) {
			return Onibus466.create();
		}
	
		if (nome.equals("EUCALIPTOS")) {
			return OnibusF17.create();
		}
	
		if (nome.equals("EUCALIPTOS II")) {
			return OnibusF24.create();
		}
	
		if (nome.equals("EUCALIPTOS III / PIONEIROS")) {
			return OnibusF27.create();
		}
	
		if (nome.equals("EXECUTIVO / AEROPORTO")) {
			return OnibusE64.create();
		}
	
		if (nome.equals("FANNY")) {
			return Onibus621.create();
		}
	
		if (nome.equals("FAZ. RIO GRANDE / A. BRANCA")) {
			return OnibusF73.create();
		}
	
		if (nome.equals("FAZ. RIO GRANDE / MANDIRITUBA")) {
			return OnibusF72.create();
		}
	
		if (nome.equals("FAZEND. / CAIUÁ-FRIGORÍF.")) {
			return Onibus719.create();
		}
	
		if (nome.equals("FAZENDA / CIC")) {
			return OnibusF05.create();
		}
	
		if (nome.equals("FAZENDA / PINHEIRINHO")) {
			return OnibusF01.create();
		}
	
		if (nome.equals("FAZENDA (DIRETO)")) {
			return OnibusF03.create();
		}
	
		if (nome.equals("FAZENDINHA")) {
			return Onibus701.create();
		}
	
		if (nome.equals("FAZENDINHA / C. COMPRIDO")) {
			return Onibus720.create();
		}
	
		if (nome.equals("FAZENDINHA / C.RASO")) {
			return Onibus831.create();
		}
	
		if (nome.equals("FAZENDINHA / PORTÃO")) {
			return Onibus611.create();
		}
	
		if (nome.equals("FAZENDINHA / PUC")) {
			return Onibus614.create();
		}
	
		if (nome.equals("FAZENDINHA / TAMANDARÉ")) {
			return Onibus702.create();
		}
	
		if (nome.equals("FERNANDO DE NORONHA")) {
			return Onibus270.create();
		}
	
		if (nome.equals("FERNÃO DIAS")) {
			return Onibus821.create();
		}
	
		if (nome.equals("FORMOSA")) {
			return Onibus673.create();
		}
	
		if (nome.equals("FREDOLIN WOLF")) {
			return Onibus167.create();
		}
	
		if (nome.equals("FUTURAMA")) {
			return Onibus639.create();
		}
	
		if (nome.equals("FUTURAMA / S. CERCADO")) {
			return Onibus683.create();
		}
	
		if (nome.equals("GABINETO")) {
			return Onibus822.create();
		}
	
		if (nome.equals("GANCHINHO")) {
			return Onibus642.create();
		}
	
		if (nome.equals("GIANNINI")) {
			return OnibusA16.create();
		}
	
		if (nome.equals("GRALHA AZUL")) {
			return OnibusF15.create();
		}
	
		if (nome.equals("GRAMADOS")) {
			return Onibus625.create();
		}
	
		if (nome.equals("GUABIROTUBA")) {
			return Onibus470.create();
		}
	
		if (nome.equals("GUARAITUBA")) {
			return OnibusB23.create();
		}
	
		if (nome.equals("GUARAITUBA / CABRAL")) {
			return OnibusB05.create();
		}
	
		if (nome.equals("GUARAITUBA / CABRAL")) {
			return OnibusB20.create();
		}
	
		if (nome.equals("GUARAITUBA / MARACANA")) {
			return OnibusB34.create();
		}
	
		if (nome.equals("GUARITUBA")) {
			return OnibusD22.create();
		}
	
		if (nome.equals("GUILHERMINA")) {
			return Onibus561.create();
		}
	
		if (nome.equals("HAUER / BOQUEIRÃO")) {
			return Onibus513.create();
		}
	
		if (nome.equals("HIGIENÓPOLIS")) {
			return Onibus371.create();
		}
	
		if (nome.equals("HUGO LANGE")) {
			return Onibus374.create();
		}
	
		if (nome.equals("IGUAÇU I")) {
			return OnibusF12.create();
		}
	
		if (nome.equals("IGUAÇU II")) {
			return OnibusF21.create();
		}
	
		if (nome.equals("IGUAPE I")) {
			return Onibus523.create();
		}
	
		if (nome.equals("IGUAPE II")) {
			return Onibus515.create();
		}
	
		if (nome.equals("INTEGRAR  PIRAQUARA")) {
			return OnibusD13.create();
		}
	
		if (nome.equals("INTER 2 ( ANTI-HORÁRIO)")) {
			return Onibus023.create();
		}
	
		if (nome.equals("INTER 2 (HORÁRIO)")) {
			return Onibus022.create();
		}
	
		if (nome.equals("INTERBAIRROS I (ANTI-HORÁRIO)")) {
			return Onibus011.create();
		}
	
		if (nome.equals("INTERBAIRROS I (HORÁRIO)")) {
			return Onibus010.create();
		}
	
		if (nome.equals("INTERBAIRROS II (ANTI-HORÁRIO)")) {
			return Onibus021.create();
		}
	
		if (nome.equals("INTERBAIRROS II (HORÁRIO)")) {
			return Onibus020.create();
		}
	
		if (nome.equals("INTERBAIRROS III")) {
			return Onibus030.create();
		}
	
		if (nome.equals("INTERBAIRROS IV")) {
			return Onibus040.create();
		}
	
		if (nome.equals("INTERBAIRROS V")) {
			return Onibus050.create();
		}
	
		if (nome.equals("INTERBAIRROS VI")) {
			return Onibus060.create();
		}
	
		if (nome.equals("INTERHOSPITAIS")) {
			return Onibus378.create();
		}
	
		if (nome.equals("ITAMARATI")) {
			return Onibus512.create();
		}
	
		if (nome.equals("ITAPERUÇU / CAIC")) {
			return OnibusI71.create();
		}
	
		if (nome.equals("ITAPERUÇU / TAMANDARÉ")) {
			return OnibusK11.create();
		}
	
		if (nome.equals("ITATIAIA")) {
			return Onibus711.create();
		}
	
		if (nome.equals("ITUPAVA / HOSP. MILITAR")) {
			return Onibus366.create();
		}
	
		if (nome.equals("JACOB MACANHAN")) {
			return OnibusC28.create();
		}
	
		if (nome.equals("JD. BELA VISTA")) {
			return OnibusD31.create();
		}
	
		if (nome.equals("JD. BOA VISTA")) {
			return Onibus914.create();
		}
	
		if (nome.equals("JD. CENTAURO")) {
			return Onibus468.create();
		}
	
		if (nome.equals("JD. CHAPARRAL")) {
			return Onibus183.create();
		}
	
		if (nome.equals("JD. CLÁUDIA")) {
			return OnibusC20.create();
		}
	
		if (nome.equals("JD. DAS GRAÇAS")) {
			return OnibusB13.create();
		}
	
		if (nome.equals("JD. DO ARROIO")) {
			return Onibus244.create();
		}
	
		if (nome.equals("JD. ESPLANADA")) {
			return Onibus865.create();
		}
	
		if (nome.equals("JD. EUCALIPTOS")) {
			return OnibusB26.create();
		}
	
		if (nome.equals("JD. GRAMADOS")) {
			return OnibusA14.create();
		}
	
		if (nome.equals("JD. GRAZIELA")) {
			return OnibusA31.create();
		}
	
		if (nome.equals("JD. HOLANDÊS")) {
			return OnibusC11.create();
		}
	
		if (nome.equals("JD. INDEPENDÊNCIA / CIC")) {
			return Onibus712.create();
		}
	
		if (nome.equals("JD. IPÊ")) {
			return Onibus917.create();
		}
	
		if (nome.equals("JD. IRAÍ")) {
			return OnibusC16.create();
		}
	
		if (nome.equals("JD. ITÁLIA")) {
			return Onibus972.create();
		}
	
		if (nome.equals("JD. ITIBERÊ")) {
			return Onibus474.create();
		}
	
		if (nome.equals("JD. KOSMOS")) {
			return Onibus169.create();
		}
	
		if (nome.equals("JD. LUDOVICA")) {
			return Onibus617.create();
		}
	
		if (nome.equals("JD. MERCÊS / GUANABARA")) {
			return Onibus160.create();
		}
	
		if (nome.equals("JD. MONTE SANTO")) {
			return OnibusA13.create();
		}
	
		if (nome.equals("JD. ORDEM")) {
			return Onibus655.create();
		}
	
		if (nome.equals("JD. PARAÍSO / TAMANDARÉ")) {
			return OnibusA21.create();
		}
	
		if (nome.equals("JD. PARANAENSE")) {
			return Onibus532.create();
		}
	
		if (nome.equals("JD. PIONEIRO")) {
			return Onibus921.create();
		}
	
		if (nome.equals("JD. SOCIAL / BATEL")) {
			return Onibus365.create();
		}
	
		if (nome.equals("JD. STA. MÔNICA")) {
			return OnibusD21.create();
		}
	
		if (nome.equals("JD. TROPICAL")) {
			return OnibusC18.create();
		}
	
		if (nome.equals("JD. VENEZA")) {
			return OnibusF25.create();
		}
	
		if (nome.equals("JOAQUINA")) {
			return OnibusC27.create();
		}
	
		if (nome.equals("JOSÉ CULPI")) {
			return Onibus912.create();
		}
	
		if (nome.equals("JÚLIO GRAF")) {
			return Onibus967.create();
		}
	
		if (nome.equals("JUVEVÊ / ÁGUA VERDE")) {
			return Onibus285.create();
		}
	
		if (nome.equals("KAMYR")) {
			return Onibus656.create();
		}
	
		if (nome.equals("LARANJEIRAS")) {
			return Onibus271.create();
		}
	
		if (nome.equals("LD OSTERNACK / S. CERCADO")) {
			return Onibus520.create();
		}
	
		if (nome.equals("LG. FERREIRAS / PINHEIRINHO")) {
			return OnibusG13.create();
		}
	
		if (nome.equals("LIGEIRÃO - PINHEIRINHO / C. GOMES")) {
			return Onibus550.create();
		}
	
		if (nome.equals("LIGEIRAO BOQUEIRAO")) {
			return Onibus500.create();
		}
	
		if (nome.equals("LINDÓIA")) {
			return Onibus661.create();
		}
	
		if (nome.equals("LONDRINA")) {
			return Onibus635.create();
		}
	
		if (nome.equals("LUIZ NICHELE")) {
			return Onibus641.create();
		}
	
		if (nome.equals("MAD. ABRANCHES")) {
			return Onibus189.create();
		}
	
		if (nome.equals("MAD. BAIRRO NOVO")) {
			return Onibus549.create();
		}
	
		if (nome.equals("MAD. BOQUEIRÃO")) {
			return Onibus509.create();
		}
	
		if (nome.equals("MAD. CAIUÁ")) {
			return Onibus789.create();
		}
	
		if (nome.equals("MAD. CAMPO COMPRIDO")) {
			return Onibus802.create();
		}
	
		if (nome.equals("MAD. CAMPO COMPRIDO")) {
			return Onibus809.create();
		}
	
		if (nome.equals("MAD. CENTENÁRIO")) {
			return Onibus309.create();
		}
	
		if (nome.equals("MAD. CENTENÁRIO / RUI BARBOSA")) {
			return Onibus308.create();
		}
	
		if (nome.equals("MAD. CIC")) {
			return Onibus609.create();
		}
	
		if (nome.equals("MAD. CTBA / PINHAIS")) {
			return OnibusC64.create();
		}
	
		if (nome.equals("MAD. CTBA / PIRAQUARA")) {
			return OnibusD69.create();
		}
	
		if (nome.equals("MAD. CTBA / SÃO DIMAS")) {
			return OnibusB69.create();
		}
	
		if (nome.equals("MAD. CTBA / SÃO JOSÉ")) {
			return OnibusE69.create();
		}
	
		if (nome.equals("MAD. CTBA / TAMANDARÉ")) {
			return OnibusA05.create();
		}
	
		if (nome.equals("MAD. FAZ. RIO GRANDE")) {
			return OnibusF09.create();
		}
	
		if (nome.equals("MAD. FERRARIA")) {
			return OnibusJ19.create();
		}
	
		if (nome.equals("MAD. JD. GRAZIELA")) {
			return Onibus289.create();
		}
	
		if (nome.equals("MAD. PENHA / F. NORONHA")) {
			return Onibus229.create();
		}
	
		if (nome.equals("MAD. PETRÓPOLIS / SOLITUDE")) {
			return Onibus489.create();
		}
	
		if (nome.equals("MAD. PILARZINHO / UBERABA")) {
			return Onibus188.create();
		}
	
		if (nome.equals("MAD. PINHEIRINHO")) {
			return Onibus608.create();
		}
	
		if (nome.equals("MAD. S. CÂNDIDA / C. RASO")) {
			return Onibus209.create();
		}
	
		if (nome.equals("MAD. S. FRANCISCO / IGUAPE")) {
			return Onibus519.create();
		}
	
		if (nome.equals("MAD. S. PEDRO / R. NEGRO")) {
			return Onibus689.create();
		}
	
		if (nome.equals("MAD. SÃO BRÁZ")) {
			return Onibus889.create();
		}
	
		if (nome.equals("MAD. STA. FELICIDADE")) {
			return Onibus989.create();
		}
	
		if (nome.equals("MAD. TARUMÃ / AUGUSTA")) {
			return Onibus389.create();
		}
	
		if (nome.equals("MAD. TATUQUARA")) {
			return Onibus679.create();
		}
	
		if (nome.equals("MAD. V. VELHA")) {
			return Onibus788.create();
		}
	
		if (nome.equals("MAL. HERMES / STA. EFIGÊNIA")) {
			return Onibus260.create();
		}
	
		if (nome.equals("MARACANÃ / B. ALTO")) {
			return OnibusB25.create();
		}
	
		if (nome.equals("MARACANÃ / C. IMBUIA")) {
			return OnibusB41.create();
		}
	
		if (nome.equals("MARACANA / LINHA VERDE")) {
			return OnibusB42.create();
		}
	
		if (nome.equals("MARACANÃ / STA.  CÂNDIDA")) {
			return OnibusB11.create();
		}
	
		if (nome.equals("MARACANÃ / STA. CÂNDIDA")) {
			return OnibusB32.create();
		}
	
		if (nome.equals("MARIA ANGÉLICA")) {
			return Onibus633.create();
		}
	
		if (nome.equals("MARINGÁ")) {
			return Onibus522.create();
		}
	
		if (nome.equals("MATEUS LEME")) {
			return Onibus181.create();
		}
	
		if (nome.equals("MENONITAS")) {
			return Onibus594.create();
		}
	
		if (nome.equals("MERCÚRIO")) {
			return Onibus331.create();
		}
	
		if (nome.equals("MONTANA")) {
			return Onibus812.create();
		}
	
		if (nome.equals("MONTE CASTELO")) {
			return OnibusB19.create();
		}
	
		if (nome.equals("MOSSUNGUÊ")) {
			return Onibus814.create();
		}
	
		if (nome.equals("NAÇÕES I")) {
			return OnibusF16.create();
		}
	
		if (nome.equals("NAÇÕES II")) {
			return OnibusF22.create();
		}
	
		if (nome.equals("NILO PEÇANHA")) {
			return Onibus176.create();
		}
	
		if (nome.equals("NIVALDO BRAGA")) {
			return Onibus521.create();
		}
	
		if (nome.equals("NOSSA SRA. DA LUZ")) {
			return Onibus674.create();
		}
	
		if (nome.equals("NOSSA SRA. DE NAZARÉ")) {
			return Onibus280.create();
		}
	
		if (nome.equals("NOVENA")) {
			return Onibus360.create();
		}
	
		if (nome.equals("NOVO MUNDO")) {
			return Onibus666.create();
		}
	
		if (nome.equals("OLARIA")) {
			return Onibus233.create();
		}
	
		if (nome.equals("OSTERNACK / BOQUEIRÃO")) {
			return Onibus535.create();
		}
	
		if (nome.equals("OSTERNACK / S. CERCADO")) {
			return Onibus548.create();
		}
	
		if (nome.equals("OURO VERDE / V. BÁDIA")) {
			return Onibus915.create();
		}
	
		if (nome.equals("PAINEIRAS")) {
			return Onibus272.create();
		}
	
		if (nome.equals("PALMEIRA")) {
			return Onibus640.create();
		}
	
		if (nome.equals("PALOMA")) {
			return OnibusB22.create();
		}
	
		if (nome.equals("PALOMA / GUARAITUBA")) {
			return OnibusB36.create();
		}
	
		if (nome.equals("PALOTINOS")) {
			return Onibus387.create();
		}
	
		if (nome.equals("PARAÍSO")) {
			return Onibus343.create();
		}
	
		if (nome.equals("PARIGOT DE SOUZA")) {
			return Onibus534.create();
		}
	
		if (nome.equals("PARQUE INDUSTRIAL")) {
			return Onibus623.create();
		}
	
		if (nome.equals("PASSAÚNA")) {
			return Onibus911.create();
		}
	
		if (nome.equals("PETRÓPOLIS")) {
			return Onibus462.create();
		}
	
		if (nome.equals("PINHAIS / B. ALTO")) {
			return OnibusC42.create();
		}
	
		if (nome.equals("PINHAIS / C. COMPRIDO")) {
			return Onibus304.create();
		}
	
		if (nome.equals("PINHAIS / GUADALUPE")) {
			return OnibusC03.create();
		}
	
		if (nome.equals("PINHAIS / PIRAQUARA")) {
			return OnibusD14.create();
		}
	
		if (nome.equals("PINHAIS / RUI BARBOSA")) {
			return Onibus301.create();
		}
	
		if (nome.equals("PINHEIRINHO")) {
			return Onibus603.create();
		}
	
		if (nome.equals("PINHEIRINHO")) {
			return Onibus638.create();
		}
	
		if (nome.equals("PINHEIRINHO / CIC")) {
			return Onibus644.create();
		}
	
		if (nome.equals("PINHEIRINHO / ZOOLÓGICO")) {
			return Onibus688.create();
		}
	
		if (nome.equals("PINHEIROS")) {
			return Onibus916.create();
		}
	
		if (nome.equals("PIRATINI / BR 476")) {
			return Onibus631.create();
		}
	
		if (nome.equals("PIRINEUS")) {
			return Onibus649.create();
		}
	
		if (nome.equals("PLANALTO")) {
			return OnibusB14.create();
		}
	
		if (nome.equals("PLANTA DEODORO")) {
			return OnibusD11.create();
		}
	
		if (nome.equals("PLANTA KARLA")) {
			return OnibusC22.create();
		}
	
		if (nome.equals("POMPÉIA")) {
			return Onibus646.create();
		}
	
		if (nome.equals("PORTÃO")) {
			return Onibus671.create();
		}
	
		if (nome.equals("PORTÃO / CIC")) {
			return Onibus612.create();
		}
	
		if (nome.equals("PORTAO / STA. BERNADETHE - L. VERDE")) {
			return Onibus616.create();
		}
	
		if (nome.equals("PORTAO/SITIO CERCADO")) {
			return OnibusX20.create();
		}
	
		if (nome.equals("PORTEIRA / PALOMA")) {
			return OnibusB35.create();
		}
	
		if (nome.equals("PORTO BELO")) {
			return Onibus718.create();
		}
	
		if (nome.equals("PQ. INDUSTRIAL")) {
			return OnibusF18.create();
		}
	
		if (nome.equals("PRADO VELHO / P. MORO")) {
			return OnibusE63.create();
		}
	
		if (nome.equals("PRESÍDIO")) {
			return OnibusD16.create();
		}
	
		if (nome.equals("PRIMAVERA")) {
			return Onibus171.create();
		}
	
		if (nome.equals("PRIVÊ")) {
			return OnibusC26.create();
		}
	
		if (nome.equals("PUC / SÃO JOSÉ")) {
			return OnibusE31.create();
		}
	
		if (nome.equals("Q. BARRAS / BOCAIÚVA")) {
			return OnibusI41.create();
		}
	
		if (nome.equals("Q. BARRAS / PIRAQUARA")) {
			return OnibusI40.create();
		}
	
		if (nome.equals("Q. BARRAS/T.PAULISTA-ANTI HORARI")) {
			return OnibusI51.create();
		}
	
		if (nome.equals("Q. BARRAS/T.PAULISTA-HORARIO")) {
			return OnibusI50.create();
		}
	
		if (nome.equals("QUARTEL GENERAL")) {
			return Onibus632.create();
		}
	
		if (nome.equals("QUITANDINHA / PINHEIRINHO")) {
			return OnibusG11.create();
		}
	
		if (nome.equals("R. BRANCO / TAMANDARÉ")) {
			return OnibusL11.create();
		}
	
		if (nome.equals("RAPOSO TAVARES")) {
			return Onibus168.create();
		}
	
		if (nome.equals("RAQUEL PRADO / PUC")) {
			return Onibus165.create();
		}
	
		if (nome.equals("REBOUÇAS")) {
			return OnibusJ12.create();
		}
	
		if (nome.equals("REFORÇO COLINA")) {
			return Onibus219.create();
		}
	
		if (nome.equals("REFORÇO HAUER")) {
			return OnibusX14.create();
		}
	
		if (nome.equals("REFORÇO TERMINAL")) {
			return Onibus539.create();
		}
	
		if (nome.equals("RIBEIRA / FCO. CORADIN")) {
			return OnibusB27.create();
		}
	
		if (nome.equals("RIO BONITO")) {
			return Onibus684.create();
		}
	
		if (nome.equals("RIO BONITO / CIC")) {
			return Onibus685.create();
		}
	
		if (nome.equals("RIO NEGRO")) {
			return Onibus636.create();
		}
	
		if (nome.equals("RIO VERDE")) {
			return Onibus221.create();
		}
	
		if (nome.equals("RIVIERA")) {
			return Onibus827.create();
		}
	
		if (nome.equals("ROÇA GRANDE /  APDEC")) {
			return OnibusB29.create();
		}
	
		if (nome.equals("RONDON")) {
			return Onibus622.create();
		}
	
		if (nome.equals("ROSEIRA")) {
			return OnibusB18.create();
		}
	
		if (nome.equals("RUA XV / BARIGUI")) {
			return Onibus370.create();
		}
	
		if (nome.equals("RURBANA")) {
			return Onibus680.create();
		}
	
		if (nome.equals("S. CERCADO / BOQUEIRÃO")) {
			return Onibus546.create();
		}
	
		if (nome.equals("S. CERCADO / C. RASO")) {
			return Onibus610.create();
		}
	
		if (nome.equals("SABARÁ")) {
			return Onibus653.create();
		}
	
		if (nome.equals("SAGRADO CORAÇÃO")) {
			return Onibus375.create();
		}
	
		if (nome.equals("SAN FRANCISCO")) {
			return OnibusA11.create();
		}
	
		if (nome.equals("SÃO BENEDITO")) {
			return Onibus236.create();
		}
	
		if (nome.equals("SÃO BERNARDO")) {
			return Onibus965.create();
		}
	
		if (nome.equals("SÃO BRAZ")) {
			return Onibus870.create();
		}
	
		if (nome.equals("SÃO CRISTÓVÃO")) {
			return OnibusD12.create();
		}
	
		if (nome.equals("SÃO FRANCISCO")) {
			return Onibus511.create();
		}
	
		if (nome.equals("SÃO JOÃO")) {
			return Onibus213.create();
		}
	
		if (nome.equals("SÃO JORGE")) {
			return Onibus670.create();
		}
	
		if (nome.equals("SÃO JORGE")) {
			return OnibusA17.create();
		}
	
		if (nome.equals("SÃO JOSÉ / D. FINA")) {
			return Onibus824.create();
		}
	
		if (nome.equals("SATURNO")) {
			return Onibus811.create();
		}
	
		if (nome.equals("SAVÓIA")) {
			return Onibus876.create();
		}
	
		if (nome.equals("SITIO CERCADO / C. RASO")) {
			return OnibusX11.create();
		}
	
		if (nome.equals("SÍTIO CERCADO (ANTI-HORÁRIO)")) {
			return Onibus508.create();
		}
	
		if (nome.equals("SÍTIO CERCADO (HORÁRIO)")) {
			return Onibus507.create();
		}
	
		if (nome.equals("SOLAR")) {
			return Onibus212.create();
		}
	
		if (nome.equals("SOLITUDE")) {
			return Onibus463.create();
		}
	
		if (nome.equals("STA. AMÉLIA")) {
			return Onibus713.create();
		}
	
		if (nome.equals("STA. ÂNGELA")) {
			return OnibusJ16.create();
		}
	
		if (nome.equals("STA. BARBARA")) {
			return Onibus461.create();
		}
	
		if (nome.equals("STA. CÂNDIDA / C. RASO")) {
			return Onibus203.create();
		}
	
		if (nome.equals("STA. CÂNDIDA / PINHEIRINHO")) {
			return Onibus204.create();
		}
	
		if (nome.equals("STA. CRUZ")) {
			return Onibus620.create();
		}
	
		if (nome.equals("STA. FELICIDADE")) {
			return Onibus901.create();
		}
	
		if (nome.equals("STA. FELICIDADE")) {
			return Onibus902.create();
		}
	
		if (nome.equals("STA. FELICIDADE / STA. CÂNDIDA")) {
			return Onibus924.create();
		}
	
		if (nome.equals("STA. GEMA")) {
			return Onibus274.create();
		}
	
		if (nome.equals("STA. HELENA")) {
			return OnibusB17.create();
		}
	
		if (nome.equals("STA. INÊS")) {
			return Onibus531.create();
		}
	
		if (nome.equals("STA. JOANA")) {
			return Onibus637.create();
		}
	
		if (nome.equals("STA. MARIA")) {
			return OnibusF14.create();
		}
	
		if (nome.equals("STA. QUITÉRIA")) {
			return Onibus760.create();
		}
	
		if (nome.equals("STA. RITA / CIC")) {
			return Onibus619.create();
		}
	
		if (nome.equals("STA. RITA / PINHEIRINHO")) {
			return Onibus650.create();
		}
	
		if (nome.equals("STA. TEREZINHA")) {
			return Onibus243.create();
		}
	
		if (nome.equals("STA. TEREZINHA")) {
			return OnibusF19.create();
		}
	
		if (nome.equals("STA. TEREZINHA / IPE")) {
			return OnibusF26.create();
		}
	
		if (nome.equals("T. BOQ. / T. AFONSO PENA")) {
			return OnibusE11.create();
		}
	
		if (nome.equals("T. BOQ. / T. CENTRAL")) {
			return OnibusE21.create();
		}
	
		if (nome.equals("T. C. IMBUIA / T. PINHAIS")) {
			return OnibusC04.create();
		}
	
		if (nome.equals("T. C. LARGO / CAMP. SIQUEIRA")) {
			return Onibus806.create();
		}
	
		if (nome.equals("T. CACHOEIRA / T. MARACANÃ")) {
			return OnibusI90.create();
		}
	
		if (nome.equals("TAMANDARÉ")) {
			return OnibusA02.create();
		}
	
		if (nome.equals("TAMANDARÉ / CABRAL")) {
			return Onibus105.create();
		}
	
		if (nome.equals("TAMANDARÉ / CABRAL")) {
			return Onibus218.create();
		}
	
		if (nome.equals("TAMANDARÉ / COLOMBO")) {
			return OnibusI91.create();
		}
	
		if (nome.equals("TANGUÁ / TAMANDARÉ")) {
			return OnibusA22.create();
		}
	
		if (nome.equals("TARUMÃ")) {
			return Onibus372.create();
		}
	
		if (nome.equals("TERMINAL CIC")) {
			return Onibus667.create();
		}
	
		if (nome.equals("TIMBOTUVA (EST. NOVA)")) {
			return OnibusJ14.create();
		}
	
		if (nome.equals("TIMBOTUVA (EST. VELHA)")) {
			return OnibusJ13.create();
		}
	
		if (nome.equals("TINGUI")) {
			return Onibus214.create();
		}
	
		if (nome.equals("TRABALHADOR")) {
			return Onibus545.create();
		}
	
		if (nome.equals("TRAMONTINA")) {
			return Onibus861.create();
		}
	
		if (nome.equals("TRINDADE")) {
			return Onibus321.create();
		}
	
		if (nome.equals("TUIUTI / BARIGUI")) {
			return Onibus815.create();
		}
	
		if (nome.equals("TURISMO")) {
			return Onibus979.create();
		}
	
		if (nome.equals("UBERABA")) {
			return Onibus472.create();
		}
	
		if (nome.equals("UBERLÂNDIA")) {
			return Onibus615.create();
		}
	
		if (nome.equals("UMBARÁ")) {
			return Onibus643.create();
		}
	
		if (nome.equals("UNIV.POSITIVO")) {
			return Onibus829.create();
		}
	
		if (nome.equals("V. AMÉLIA")) {
			return OnibusC25.create();
		}
	
		if (nome.equals("V. AUTÓDROMO")) {
			return Onibus323.create();
		}
	
		if (nome.equals("V. CUBAS")) {
			return Onibus663.create();
		}
	
		if (nome.equals("V. ESPERANÇA")) {
			return Onibus222.create();
		}
	
		if (nome.equals("V. GRANDE / V. TARUMÃ")) {
			return OnibusC30.create();
		}
	
		if (nome.equals("V. IZABEL")) {
			return Onibus761.create();
		}
	
		if (nome.equals("V. LEONICE")) {
			return Onibus242.create();
		}
	
		if (nome.equals("V. MACEDO")) {
			return Onibus467.create();
		}
	
		if (nome.equals("V. MACEDO")) {
			return OnibusD23.create();
		}
	
		if (nome.equals("V. MARIA ANTONIETA")) {
			return OnibusC17.create();
		}
	
		if (nome.equals("V. MARIA DO ROSÁRIO")) {
			return OnibusB28.create();
		}
	
		if (nome.equals("V. MARISA")) {
			return Onibus714.create();
		}
	
		if (nome.equals("V. MARQUETO")) {
			return Onibus825.create();
		}
	
		if (nome.equals("V. NORI")) {
			return Onibus166.create();
		}
	
		if (nome.equals("V. NOVA")) {
			return OnibusC12.create();
		}
	
		if (nome.equals("V. PRADO")) {
			return OnibusA32.create();
		}
	
		if (nome.equals("V. RENO")) {
			return Onibus336.create();
		}
	
		if (nome.equals("V. REX")) {
			return Onibus665.create();
		}
	
		if (nome.equals("V. ROSINHA")) {
			return Onibus762.create();
		}
	
		if (nome.equals("V. SANDRA")) {
			return Onibus860.create();
		}
	
		if (nome.equals("V. SÃO PAULO")) {
			return Onibus471.create();
		}
	
		if (nome.equals("V. SÃO PEDRO")) {
			return Onibus624.create();
		}
	
		if (nome.equals("V. SUIÇA")) {
			return Onibus184.create();
		}
	
		if (nome.equals("V. URANO")) {
			return Onibus613.create();
		}
	
		if (nome.equals("V. VELHA")) {
			return Onibus777.create();
		}
	
		if (nome.equals("V. VERDE")) {
			return Onibus652.create();
		}
	
		if (nome.equals("VENEZA")) {
			return Onibus918.create();
		}
	
		if (nome.equals("VIC. DE CARVALHO / C. IMBUIA")) {
			return OnibusZ03.create();
		}
	
		if (nome.equals("VILA VELHA/BURITI")) {
			return Onibus779.create();
		}
	
		if (nome.equals("VITÓRIA RÉGIA")) {
			return Onibus630.create();
		}
	
		if (nome.equals("V.JULIANA")) {
			return Onibus690.create();
		}
	
		if (nome.equals("WEISSÓPOLIS")) {
			return OnibusC15.create();
		}
	
		if (nome.equals("XAXIM / CAPÃO RASO")) {
			return Onibus657.create();
		}
	
		if (nome.equals("XAXIM / LINHA VERDE")) {
			return Onibus551.create();
		}
	
		if (nome.equals("ZOOLÓGICO")) {
			return Onibus536.create();
		}
	
		throw new IllegalArgumentException("Nenhum onibus com o nome " + nome);
	}
	
}

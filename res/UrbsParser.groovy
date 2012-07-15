/**
 * Script para parsear os horarios de onibus disponíveis no site da urbs, 
 * jogá-los nas classes de modelo definidas, e processá-las usando XStream
 * O site da urbs é parseado usando a própria URL do Java suavizada com 
 * NekoHtml.
 * 
 * Validar com amostras:
 * [  ] Bom retiro/puc
 * [  ] Cabral osório
 * [  ] Jd. das graças
 * [  ] Tingui
 * [  ] ctba/independencia
 * [  ] ctba/posto paris
 * [  ] pedro moro
 * 
 * Curiosidade: java nao ocupou em média 1.3% de CPU durante o processamento, 
 * pois depende da latencia de rede
 */

import groovy.transform.*
import java.text.SimpleDateFormat
import java.sql.Time
import com.thoughtworks.xstream.XStream



def urbsSelect = '''
			<select name="linha" class="custom-selectmenu">
				<option value="G12">A. BRANCA / FAZ. RIO GRANDE</option>
				<option value="464">A. MUNHOZ / J. BOTÂNICO</option>
				<option value="226">ABAETÉ</option>
				<option value="182">ABRANCHES</option>
				<option value="332">ACRÓPOLE</option>
				<option value="208">AEROPORTO</option>
				<option value="334">AGRÍCOLA</option>
				<option value="C13">ÁGUA CLARA</option>
				<option value="180">ÁGUA VERDE/ ABRANCHES</option>
				<option value="I21">AGUDOS DO SUL</option>
				<option value="265">AHÚ / LOS ANGELES</option>
				<option value="560">ALFERES POLI</option>
				<option value="232">ALIANÇA</option>
				<option value="629">ALTO BOQUEIRÃO</option>
				<option value="373">ALTO TARUMÃ</option>
				<option value="B15">ANA TERRA / ADRIANE</option>
				<option value="H20">ANGÉLICA / C. RASO</option>
				<option value="H21">ANGÉLICA / CIC</option>
				<option value="311">ARAGUAIA</option>
				<option value="I32">ARAUCARIA / CAMPO LARGO</option>
				<option value="H11">ARAUCÁRIA / PINHEIRINHO</option>
				<option value="H12">ARAUCÁRIA / PORTÃO</option>
				<option value="823">AUGUSTA</option>
				<option value="361">AUGUSTO STRESSER</option>
				<option value="313">AVENIDA IRAÍ / C. IMBUIA</option>
				<option value="342">B. ALTO / BOA VISTA</option>
				<option value="C41">B. ALTO / E. PERNETA</option>
				<option value="341">B. ALTO / STA. CÂNDIDA</option>
				<option value="307">B. ALTO / STA. FELICIDADE</option>
				<option value="506">BAIRRO NOVO</option>
				<option value="541">BAIRRO NOVO A</option>
				<option value="542">BAIRRO NOVO B</option>
				<option value="547">BAIRRO NOVO C</option>
				<option value="231">BANESTADO / CALIFÓRNIA</option>
				<option value="205">BARREIRINHA</option>
				<option value="206">BARREIRINHA / SÃO JOSÉ</option>
				<option value="875">BIGORRILHO</option>
				<option value="225">BOA VISTA / BARREIRINHA</option>
				<option value="B33">BOCAIÚVA DO SUL</option>
				<option value="922">BOM PASTOR</option>
				<option value="175">BOM RETIRO / PUC</option>
				<option value="503">BOQUEIRÃO</option>
				<option value="505">BOQUEIRÃO / C. CÍVICO</option>
				<option value="540">BOQUEIRAO / KRAFT</option>
				<option value="O71">BORDA DO CAMPO</option>
				<option value="627">BOSCH</option>
				<option value="170">BRACATINGA</option>
				<option value="O75">BRITANITE</option>
				<option value="913">BUTIATUVINHA</option>
				<option value="516">C. BELEM / S. FILHO</option>
				<option value="828">C. COMPRIDO / C. RASO</option>
				<option value="826">C. COMPRIDO / CIC</option>
				<option value="393">C. IMBUIA / PQ. BARIGUI</option>
				<option value="I30">C. LARGO / BALSA NOVA</option>
				<option value="150">C. MÚSICA / V. ALEGRE</option>
				<option value="658">C. RASO / CAIUÁ</option>
				<option value="024">C. RASO / CAMP. SIQUEIRA</option>
				<option value="201">CABRAL / BOM RETIRO</option>
				<option value="215">CABRAL / CACHOEIRA</option>
				<option value="B02">CABRAL / MARACANÃ</option>
				<option value="207">CABRAL / OSÓRIO</option>
				<option value="216">CABRAL / PORTÃO</option>
				<option value="647">CACHIMBA</option>
				<option value="659">CACHIMBA / OLARIA</option>
				<option value="703">CAIUÁ</option>
				<option value="732">CAIUA / C.COMPRIDO</option>
				<option value="386">CAJURU</option>
				<option value="322">CAMARGO</option>
				<option value="801">CAMP. SIQUEIRA / BATEL</option>
				<option value="654">CAMPO ALEGRE</option>
				<option value="J15">CAMPO LARGO</option>
				<option value="923">CAMPO MAGRO</option>
				<option value="475">CANAL BELÉM</option>
				<option value="628">CARBOMAFRA</option>
				<option value="776">CARMELA DUTRA</option>
				<option value="668">CASA DE CUSTÓDIA</option>
				<option value="224">CASSIOPÉIA</option>
				<option value="305">CENTENÁRIO</option>
				<option value="335">CENTENÁRIO / BOQUEIRÃO</option>
				<option value="303">CENTENÁRIO / C. COMPRIDO</option>
				<option value="338">CENTENÁRIO / HAUER</option>
				<option value="302">CENTENÁRIO / RUI BARBOSA</option>
				<option value="469">CENTRO POLITÉCNICO</option>
				<option value="601">CIC / TIRADENTES</option>
				<option value="002">CIRCULAR CENTRO (ANTI-HORÁRIO)</option>
				<option value="001">CIRCULAR CENTRO (HORÁRIO)</option>
				<option value="602">CIRCULAR SUL  (ANTI-HORÁRIO)</option>
				<option value="502">CIRCULAR SUL (HORÁRIO)</option>
				<option value="211">COLINA VERDE</option>
				<option value="I31">COLOMBO / ANG. CARON</option>
				<option value="607">COLOMBO / CIC</option>
				<option value="I20">COLOMBO / SÃO JOSÉ</option>
				<option value="B24">COLÔNIA FARIA</option>
				<option value="778">COTOLENGO</option>
				<option value="385">CRISTO REI</option>
				<option value="C72">CTBA  / V. PALMITAL</option>
				<option value="E02">CTBA / APOLO</option>
				<option value="606">CTBA / ARAUCÁRIA</option>
				<option value="H01">CTBA / ARAUCÁRIA</option>
				<option value="G72">CTBA / AREIA BRANCA</option>
				<option value="P63">CTBA / BATEIAS</option>
				<option value="E67">CTBA / BRAGA</option>
				<option value="N70">CTBA / C. GDE  SUL (RAPIDO)</option>
				<option value="N71">CTBA / C. GRANDE DO SUL</option>
				<option value="J62">CTBA / C. LARGO</option>
				<option value="G73">CTBA / CAMP. DOS PAULAS</option>
				<option value="805">CTBA / CAMPO LARGO</option>
				<option value="B61">CTBA / CAP. DO ATUBA</option>
				<option value="P64">CTBA / CERNE</option>
				<option value="B80">CTBA / COLOMBO (CAMBARÁ)</option>
				<option value="B81">CTBA / COLOMBO (GUARACI)</option>
				<option value="B72">CTBA / COLOMBO (ROD. UVA)</option>
				<option value="C63">CTBA / CONJ. ATUBA</option>
				<option value="R71">CTBA / CONTENDA</option>
				<option value="N72">CTBA / EUGÊNIA MARIA</option>
				<option value="605">CTBA / FAZ. RIO GRANDE</option>
				<option value="E77">CTBA / GUATUPÊ</option>
				<option value="E66">CTBA / INDEPENDÊNCIA</option>
				<option value="K71">CTBA / ITAPERUÇU</option>
				<option value="B82">CTBA / JD. ANA ROSA</option>
				<option value="B75">CTBA / JD. ARAPONGAS</option>
				<option value="B74">CTBA / JD. CÉSAR AUGUSTO</option>
				<option value="E75">CTBA / JD. CRISTAL</option>
				<option value="E73">CTBA / JD. CRUZEIRO</option>
				<option value="B77">CTBA / JD. CURITIBA</option>
				<option value="E71">CTBA / JD. IPÊ</option>
				<option value="E72">CTBA / JD. IZAURA</option>
				<option value="A73">CTBA / JD. MARROCOS</option>
				<option value="B73">CTBA / JD. OSASCO</option>
				<option value="A72">CTBA / JD. PARAÍSO</option>
				<option value="B78">CTBA / JD. SÃO GABRIEL</option>
				<option value="G71">CTBA / MANDIRITUBA</option>
				<option value="B01">CTBA / MARACANÃ</option>
				<option value="E62">CTBA / PEDRO MORO</option>
				<option value="D61">CTBA / PIRAQUARA</option>
				<option value="D66">CTBA / PIRAQUARA (DIRETO)</option>
				<option value="E76">CTBA / POSTO PARIS</option>
				<option value="O72">CTBA / POUSADA</option>
				<option value="E70">CTBA / PUC</option>
				<option value="O74">CTBA / Q. BARRAS (BR 116)</option>
				<option value="O73">CTBA / Q. BARRAS (GRACIOSA)</option>
				<option value="E68">CTBA / QUISISANA</option>
				<option value="L71">CTBA / R. BCO. DO SUL</option>
				<option value="B79">CTBA / ROÇA GRANDE</option>
				<option value="E78">CTBA / ROSEIRA</option>
				<option value="E05">CTBA / SÃO JOSÉ</option>
				<option value="B76">CTBA / SÃO SEBASTIÃO</option>
				<option value="B83">CTBA / STA. TEREZA</option>
				<option value="A01">CTBA / TAMANDARÉ</option>
				<option value="A07">CTBA / TAMANDARÉ (LAMENHA)</option>
				<option value="A06">CTBA / TAMANDARÉ (MINÉRIOS)</option>
				<option value="A77">CTBA / TANGUÁ</option>
				<option value="P65">CTBA / TERRA BOA</option>
				<option value="N73">CTBA / TIMBÚ</option>
				<option value="E01">CTBA / URANO</option>
				<option value="A78">CTBA / V.  MARTA</option>
				<option value="C66">CTBA / V. ZUMBI</option>
				<option value="E65">CTBA / XINGU</option>
				<option value="B06">CTBA/GUARAITUBA(VIA MARACANA)</option>
				<option value="O76">CTBA/Q.BARRAS(RAPIDO)</option>
				<option value="681">DALAGASSA</option>
				<option value="380">DETRAN / VIC. MACHADO</option>
				<option value="C05">DIRETO C. IMBUIA</option>
				<option value="B31">DIRETO CABRAL</option>
				<option value="662">DOM ÁTICO</option>
				<option value="699">E. E. ALCINDO FANAYA 1</option>
				<option value="795">E. E. ALCINDO FANAYA 2</option>
				<option value="799">E. E. ALI BARK 1</option>
				<option value="798">E. E. ALI BARK 2</option>
				<option value="695">E. E. ALTO BOQUEIRÃO</option>
				<option value="399">E. E. APAE 1</option>
				<option value="596">E. E. APAE 2</option>
				<option value="598">E. E. APAE 3</option>
				<option value="396">E. E. APAE 6</option>
				<option value="694">E. E. BAIRRO NOVO</option>
				<option value="398">E. E. C. IMBUIA</option>
				<option value="397">E. E. CAJURU</option>
				<option value="394">E. E. CENTRAU 1</option>
				<option value="899">E. E. CIC</option>
				<option value="697">E. E. ECUMÊNICA 1</option>
				<option value="897">E. E. ECUMÊNICA 2</option>
				<option value="599">E. E. HELENA ANTIPOFF 1</option>
				<option value="497">E. E. HELENA ANTIPOFF 2</option>
				<option value="499">E. E. HELENA ANTIPOFF 4</option>
				<option value="698">E. E. NOSSA SRA. DA LUZ</option>
				<option value="495">E. E. PINHAIS 1</option>
				<option value="498">E. E. PINHAIS 2</option>
				<option value="696">E. E. PINHEIRINHO</option>
				<option value="597">E. E. SÍTIO CERCADO</option>
				<option value="796">E. E. STA. HELENA</option>
				<option value="797">E. E. STA. QUITÉRIA</option>
				<option value="895">E. E. TATUQUARA</option>
				<option value="693">E. E. THOMAZ EDISON 1</option>
				<option value="893">E. E. TOMAZ EDISON 2</option>
				<option value="691">E. E. TOMAZ EDISON 3</option>
				<option value="392">E. E. TOMAZ EDISON 4</option>
				<option value="692">E. E. TOMAZ EDISON 5</option>
				<option value="998">E. E. VIVIAN MARCAL 1</option>
				<option value="894">E. E. 29 DE MARÇO 1</option>
				<option value="533">E. VERÍSSIMO / PANTANAL</option>
				<option value="C23">EMILIANO PERNETA</option>
				<option value="465">ERASTO  GAERTNER</option>
				<option value="X12">ESPECIAL BOQUEIRAO</option>
				<option value="X19">ESPECIAL HASDRUBAL BELLEGARD</option>
				<option value="X18">ESPECIAL PAUL GARFUNKEL</option>
				<option value="968">ESPECIAL TROMBINI</option>
				<option value="F13">ESTADOS</option>
				<option value="266">ESTRIBO AHÚ</option>
				<option value="466">ESTUDANTES</option>
				<option value="F17">EUCALIPTOS</option>
				<option value="F24">EUCALIPTOS II</option>
				<option value="F27">EUCALIPTOS III / PIONEIROS</option>
				<option value="E64">EXECUTIVO / AEROPORTO</option>
				<option value="621">FANNY</option>
				<option value="F73">FAZ. RIO GRANDE / A. BRANCA</option>
				<option value="F72">FAZ. RIO GRANDE / MANDIRITUBA</option>
				<option value="719">FAZEND. / CAIUÁ-FRIGORÍF.</option>
				<option value="F05">FAZENDA / CIC</option>
				<option value="F01">FAZENDA / PINHEIRINHO</option>
				<option value="F03">FAZENDA (DIRETO)</option>
				<option value="701">FAZENDINHA</option>
				<option value="720">FAZENDINHA / C. COMPRIDO</option>
				<option value="831">FAZENDINHA / C.RASO</option>
				<option value="611">FAZENDINHA / PORTÃO</option>
				<option value="614">FAZENDINHA / PUC</option>
				<option value="702">FAZENDINHA / TAMANDARÉ</option>
				<option value="270">FERNANDO DE NORONHA</option>
				<option value="821">FERNÃO DIAS</option>
				<option value="673">FORMOSA</option>
				<option value="167">FREDOLIN WOLF</option>
				<option value="639">FUTURAMA</option>
				<option value="683">FUTURAMA / S. CERCADO</option>
				<option value="822">GABINETO</option>
				<option value="642">GANCHINHO</option>
				<option value="A16">GIANNINI</option>
				<option value="F15">GRALHA AZUL</option>
				<option value="625">GRAMADOS</option>
				<option value="470">GUABIROTUBA</option>
				<option value="B23">GUARAITUBA</option>
				<option value="B05">GUARAITUBA / CABRAL</option>
				<option value="B20">GUARAITUBA / CABRAL</option>
				<option value="B34">GUARAITUBA / MARACANA</option>
				<option value="D22">GUARITUBA</option>
				<option value="561">GUILHERMINA</option>
				<option value="513">HAUER / BOQUEIRÃO</option>
				<option value="371">HIGIENÓPOLIS</option>
				<option value="374">HUGO LANGE</option>
				<option value="F12">IGUAÇU I</option>
				<option value="F21">IGUAÇU II</option>
				<option value="523">IGUAPE I</option>
				<option value="515">IGUAPE II</option>
				<option value="D13">INTEGRAR  PIRAQUARA</option>
				<option value="023">INTER 2 ( ANTI-HORÁRIO)</option>
				<option value="022">INTER 2 (HORÁRIO)</option>
				<option value="011">INTERBAIRROS I (ANTI-HORÁRIO)</option>
				<option value="010">INTERBAIRROS I (HORÁRIO)</option>
				<option value="021">INTERBAIRROS II (ANTI-HORÁRIO)</option>
				<option value="020">INTERBAIRROS II (HORÁRIO)</option>
				<option value="030">INTERBAIRROS III</option>
				<option value="040">INTERBAIRROS IV</option>
				<option value="050">INTERBAIRROS V</option>
				<option value="060">INTERBAIRROS VI</option>
				<option value="378">INTERHOSPITAIS</option>
				<option value="512">ITAMARATI</option>
				<option value="I71">ITAPERUÇU / CAIC</option>
				<option value="K11">ITAPERUÇU / TAMANDARÉ</option>
				<option value="711">ITATIAIA</option>
				<option value="366">ITUPAVA / HOSP. MILITAR</option>
				<option value="C28">JACOB MACANHAN</option>
				<option value="D31">JD. BELA VISTA</option>
				<option value="914">JD. BOA VISTA</option>
				<option value="468">JD. CENTAURO</option>
				<option value="183">JD. CHAPARRAL</option>
				<option value="C20">JD. CLÁUDIA</option>
				<option value="B13">JD. DAS GRAÇAS</option>
				<option value="244">JD. DO ARROIO</option>
				<option value="865">JD. ESPLANADA</option>
				<option value="B26">JD. EUCALIPTOS</option>
				<option value="A14">JD. GRAMADOS</option>
				<option value="A31">JD. GRAZIELA</option>
				<option value="C11">JD. HOLANDÊS</option>
				<option value="712">JD. INDEPENDÊNCIA / CIC</option>
				<option value="917">JD. IPÊ</option>
				<option value="C16">JD. IRAÍ</option>
				<option value="972">JD. ITÁLIA</option>
				<option value="474">JD. ITIBERÊ</option>
				<option value="169">JD. KOSMOS</option>
				<option value="617">JD. LUDOVICA</option>
				<option value="160">JD. MERCÊS / GUANABARA</option>
				<option value="A13">JD. MONTE SANTO</option>
				<option value="655">JD. ORDEM</option>
				<option value="A21">JD. PARAÍSO / TAMANDARÉ</option>
				<option value="532">JD. PARANAENSE</option>
				<option value="921">JD. PIONEIRO</option>
				<option value="365">JD. SOCIAL / BATEL</option>
				<option value="D21">JD. STA. MÔNICA</option>
				<option value="C18">JD. TROPICAL</option>
				<option value="F25">JD. VENEZA</option>
				<option value="C27">JOAQUINA</option>
				<option value="912">JOSÉ CULPI</option>
				<option value="967">JÚLIO GRAF</option>
				<option value="285">JUVEVÊ / ÁGUA VERDE</option>
				<option value="656">KAMYR</option>
				<option value="271">LARANJEIRAS</option>
				<option value="520">LD OSTERNACK / S. CERCADO</option>
				<option value="G13">LG. FERREIRAS / PINHEIRINHO</option>
				<option value="550">LIGEIRÃO - PINHEIRINHO / C. GOMES</option>
				<option value="500">LIGEIRAO BOQUEIRAO</option>
				<option value="661">LINDÓIA</option>
				<option value="635">LONDRINA</option>
				<option value="641">LUIZ NICHELE</option>
				<option value="189">MAD. ABRANCHES</option>
				<option value="549">MAD. BAIRRO NOVO</option>
				<option value="509">MAD. BOQUEIRÃO</option>
				<option value="789">MAD. CAIUÁ</option>
				<option value="802">MAD. CAMPO COMPRIDO</option>
				<option value="809">MAD. CAMPO COMPRIDO</option>
				<option value="309">MAD. CENTENÁRIO</option>
				<option value="308">MAD. CENTENÁRIO / RUI BARBOSA</option>
				<option value="609">MAD. CIC</option>
				<option value="C64">MAD. CTBA / PINHAIS</option>
				<option value="D69">MAD. CTBA / PIRAQUARA</option>
				<option value="B69">MAD. CTBA / SÃO DIMAS</option>
				<option value="E69">MAD. CTBA / SÃO JOSÉ</option>
				<option value="A05">MAD. CTBA / TAMANDARÉ</option>
				<option value="F09">MAD. FAZ. RIO GRANDE</option>
				<option value="J19">MAD. FERRARIA</option>
				<option value="289">MAD. JD. GRAZIELA</option>
				<option value="229">MAD. PENHA / F. NORONHA</option>
				<option value="489">MAD. PETRÓPOLIS / SOLITUDE</option>
				<option value="188">MAD. PILARZINHO / UBERABA</option>
				<option value="608">MAD. PINHEIRINHO</option>
				<option value="209">MAD. S. CÂNDIDA / C. RASO</option>
				<option value="519">MAD. S. FRANCISCO / IGUAPE</option>
				<option value="689">MAD. S. PEDRO / R. NEGRO</option>
				<option value="889">MAD. SÃO BRÁZ</option>
				<option value="989">MAD. STA. FELICIDADE</option>
				<option value="389">MAD. TARUMÃ / AUGUSTA</option>
				<option value="679">MAD. TATUQUARA</option>
				<option value="788">MAD. V. VELHA</option>
				<option value="260">MAL. HERMES / STA. EFIGÊNIA</option>
				<option value="B25">MARACANÃ / B. ALTO</option>
				<option value="B41">MARACANÃ / C. IMBUIA</option>
				<option value="B42">MARACANA / LINHA VERDE</option>
				<option value="B11">MARACANÃ / STA.  CÂNDIDA</option>
				<option value="B32">MARACANÃ / STA. CÂNDIDA</option>
				<option value="633">MARIA ANGÉLICA</option>
				<option value="522">MARINGÁ</option>
				<option value="181">MATEUS LEME</option>
				<option value="594">MENONITAS</option>
				<option value="331">MERCÚRIO</option>
				<option value="812">MONTANA</option>
				<option value="B19">MONTE CASTELO</option>
				<option value="814">MOSSUNGUÊ</option>
				<option value="F16">NAÇÕES I</option>
				<option value="F22">NAÇÕES II</option>
				<option value="176">NILO PEÇANHA</option>
				<option value="521">NIVALDO BRAGA</option>
				<option value="674">NOSSA SRA. DA LUZ</option>
				<option value="280">NOSSA SRA. DE NAZARÉ</option>
				<option value="360">NOVENA</option>
				<option value="666">NOVO MUNDO</option>
				<option value="233">OLARIA</option>
				<option value="535">OSTERNACK / BOQUEIRÃO</option>
				<option value="548">OSTERNACK / S. CERCADO</option>
				<option value="915">OURO VERDE / V. BÁDIA</option>
				<option value="272">PAINEIRAS</option>
				<option value="640">PALMEIRA</option>
				<option value="B22">PALOMA</option>
				<option value="B36">PALOMA / GUARAITUBA</option>
				<option value="387">PALOTINOS</option>
				<option value="343">PARAÍSO</option>
				<option value="534">PARIGOT DE SOUZA</option>
				<option value="623">PARQUE INDUSTRIAL</option>
				<option value="911">PASSAÚNA</option>
				<option value="462">PETRÓPOLIS</option>
				<option value="C42">PINHAIS / B. ALTO</option>
				<option value="304">PINHAIS / C. COMPRIDO</option>
				<option value="C03">PINHAIS / GUADALUPE</option>
				<option value="D14">PINHAIS / PIRAQUARA</option>
				<option value="301">PINHAIS / RUI BARBOSA</option>
				<option value="603">PINHEIRINHO</option>
				<option value="638">PINHEIRINHO</option>
				<option value="644">PINHEIRINHO / CIC</option>
				<option value="688">PINHEIRINHO / ZOOLÓGICO</option>
				<option value="916">PINHEIROS</option>
				<option value="631">PIRATINI / BR 476</option>
				<option value="649">PIRINEUS</option>
				<option value="B14">PLANALTO</option>
				<option value="D11">PLANTA DEODORO</option>
				<option value="C22">PLANTA KARLA</option>
				<option value="646">POMPÉIA</option>
				<option value="671">PORTÃO</option>
				<option value="612">PORTÃO / CIC</option>
				<option value="616">PORTAO / STA. BERNADETHE - L. VERDE</option>
				<option value="X20">PORTAO/SITIO CERCADO</option>
				<option value="B35">PORTEIRA / PALOMA</option>
				<option value="718">PORTO BELO</option>
				<option value="F18">PQ. INDUSTRIAL</option>
				<option value="E63">PRADO VELHO / P. MORO</option>
				<option value="D16">PRESÍDIO</option>
				<option value="171">PRIMAVERA</option>
				<option value="C26">PRIVÊ</option>
				<option value="E31">PUC / SÃO JOSÉ</option>
				<option value="I41">Q. BARRAS / BOCAIÚVA</option>
				<option value="I40">Q. BARRAS / PIRAQUARA</option>
				<option value="I51">Q. BARRAS/T.PAULISTA-ANTI HORARI</option>
				<option value="I50">Q. BARRAS/T.PAULISTA-HORARIO</option>
				<option value="632">QUARTEL GENERAL</option>
				<option value="G11">QUITANDINHA / PINHEIRINHO</option>
				<option value="L11">R. BRANCO / TAMANDARÉ</option>
				<option value="168">RAPOSO TAVARES</option>
				<option value="165">RAQUEL PRADO / PUC</option>
				<option value="J12">REBOUÇAS</option>
				<option value="219">REFORÇO COLINA</option>
				<option value="X14">REFORÇO HAUER</option>
				<option value="539">REFORÇO TERMINAL</option>
				<option value="B27">RIBEIRA / FCO. CORADIN</option>
				<option value="684">RIO BONITO</option>
				<option value="685">RIO BONITO / CIC</option>
				<option value="636">RIO NEGRO</option>
				<option value="221">RIO VERDE</option>
				<option value="827">RIVIERA</option>
				<option value="B29">ROÇA GRANDE /  APDEC</option>
				<option value="622">RONDON</option>
				<option value="B18">ROSEIRA</option>
				<option value="370">RUA XV / BARIGUI</option>
				<option value="680">RURBANA</option>
				<option value="546">S. CERCADO / BOQUEIRÃO</option>
				<option value="610">S. CERCADO / C. RASO</option>
				<option value="653">SABARÁ</option>
				<option value="375">SAGRADO CORAÇÃO</option>
				<option value="A11">SAN FRANCISCO</option>
				<option value="236">SÃO BENEDITO</option>
				<option value="965">SÃO BERNARDO</option>
				<option value="870">SÃO BRAZ</option>
				<option value="D12">SÃO CRISTÓVÃO</option>
				<option value="511">SÃO FRANCISCO</option>
				<option value="213">SÃO JOÃO</option>
				<option value="670">SÃO JORGE</option>
				<option value="A17">SÃO JORGE</option>
				<option value="824">SÃO JOSÉ / D. FINA</option>
				<option value="811">SATURNO</option>
				<option value="876">SAVÓIA</option>
				<option value="X11">SITIO CERCADO / C. RASO</option>
				<option value="508">SÍTIO CERCADO (ANTI-HORÁRIO)</option>
				<option value="507">SÍTIO CERCADO (HORÁRIO)</option>
				<option value="212">SOLAR</option>
				<option value="463">SOLITUDE</option>
				<option value="713">STA. AMÉLIA</option>
				<option value="J16">STA. ÂNGELA</option>
				<option value="461">STA. BARBARA</option>
				<option value="203">STA. CÂNDIDA / C. RASO</option>
				<option value="204">STA. CÂNDIDA / PINHEIRINHO</option>
				<option value="620">STA. CRUZ</option>
				<option value="901">STA. FELICIDADE</option>
				<option value="902">STA. FELICIDADE</option>
				<option value="924">STA. FELICIDADE / STA. CÂNDIDA</option>
				<option value="274">STA. GEMA</option>
				<option value="B17">STA. HELENA</option>
				<option value="531">STA. INÊS</option>
				<option value="637">STA. JOANA</option>
				<option value="F14">STA. MARIA</option>
				<option value="760">STA. QUITÉRIA</option>
				<option value="619">STA. RITA / CIC</option>
				<option value="650">STA. RITA / PINHEIRINHO</option>
				<option value="243">STA. TEREZINHA</option>
				<option value="F19">STA. TEREZINHA </option>
				<option value="F26">STA. TEREZINHA / IPE</option>
				<option value="E11">T. BOQ. / T. AFONSO PENA</option>
				<option value="E21">T. BOQ. / T. CENTRAL</option>
				<option value="C04">T. C. IMBUIA / T. PINHAIS</option>
				<option value="806">T. C. LARGO / CAMP. SIQUEIRA</option>
				<option value="I90">T. CACHOEIRA / T. MARACANÃ</option>
				<option value="A02">TAMANDARÉ</option>
				<option value="105">TAMANDARÉ / CABRAL</option>
				<option value="218">TAMANDARÉ / CABRAL</option>
				<option value="I91">TAMANDARÉ / COLOMBO</option>
				<option value="A22">TANGUÁ / TAMANDARÉ</option>
				<option value="372">TARUMÃ</option>
				<option value="667">TERMINAL CIC</option>
				<option value="J14">TIMBOTUVA (EST. NOVA)</option>
				<option value="J13">TIMBOTUVA (EST. VELHA)</option>
				<option value="214">TINGUI</option>
				<option value="545">TRABALHADOR</option>
				<option value="861">TRAMONTINA</option>
				<option value="321">TRINDADE</option>
				<option value="815">TUIUTI / BARIGUI</option>
				<option value="979">TURISMO</option>
				<option value="472">UBERABA</option>
				<option value="615">UBERLÂNDIA</option>
				<option value="643">UMBARÁ</option>
				<option value="829">UNIV.POSITIVO</option>
				<option value="C25">V. AMÉLIA</option>
				<option value="323">V. AUTÓDROMO</option>
				<option value="663">V. CUBAS</option>
				<option value="222">V. ESPERANÇA</option>
				<option value="C30">V. GRANDE / V. TARUMÃ</option>
				<option value="761">V. IZABEL</option>
				<option value="242">V. LEONICE</option>
				<option value="467">V. MACEDO</option>
				<option value="D23">V. MACEDO</option>
				<option value="C17">V. MARIA ANTONIETA</option>
				<option value="B28">V. MARIA DO ROSÁRIO</option>
				<option value="714">V. MARISA</option>
				<option value="825">V. MARQUETO</option>
				<option value="166">V. NORI</option>
				<option value="C12">V. NOVA</option>
				<option value="A32">V. PRADO</option>
				<option value="336">V. RENO</option>
				<option value="665">V. REX</option>
				<option value="762">V. ROSINHA</option>
				<option value="860">V. SANDRA</option>
				<option value="471">V. SÃO PAULO</option>
				<option value="624">V. SÃO PEDRO</option>
				<option value="184">V. SUIÇA</option>
				<option value="613">V. URANO</option>
				<option value="777">V. VELHA</option>
				<option value="652">V. VERDE</option>
				<option value="918">VENEZA</option>
				<option value="Z03">VIC. DE CARVALHO / C. IMBUIA</option>
				<option value="779">VILA VELHA/BURITI</option>
				<option value="630">VITÓRIA RÉGIA</option>
				<option value="690">V.JULIANA</option>
				<option value="C15">WEISSÓPOLIS</option>
				<option value="657">XAXIM / CAPÃO RASO</option>
				<option value="551">XAXIM / LINHA VERDE</option>
				<option value="536">ZOOLÓGICO</option>
			</select>
'''


@ToString
class Onibus {
	String nome
	String codigo
	List<Ponto> pontos = []
}

enum TipoDia { 
	DIA_UTIL("Dia útil"), SABADO("Sábado"), DOMINGO("Domingo")
	private String descricao
	private TipoDia(String s) { descricao = s }
	static TipoDia findByDescricao(String descricao) {
		switch (descricao) {
			case ["SÁBADO", "SABADO"]: return SABADO
			case "DOMINGO": return DOMINGO
			case ["DIA ÚTIL", 'DIA UTIL']: return DIA_UTIL
		}
	}
}

@ToString
class Ponto {
	String nome
	TipoDia tipoDia
	Date validoAPartirDe
	List<Time> horarios = []
}

def dateFormat = new SimpleDateFormat('dd/MM/yyyy')
def timeFormat = new SimpleDateFormat('HH:mm')
def urbsUrl = "http://www.urbs.curitiba.pr.gov.br/horario-de-onibus/codigo"
def onibusList = []

def linhasUrbs = new XmlParser().parseText( urbsSelect )
def codigosLinhasUrbs = linhasUrbs.option.collect { it.@value.toString() }
def curr = { System.currentTimeMillis() }

codigosLinhasUrbs.eachWithIndex { codigoOnibus, index ->
	
	def t0 = curr()
	
	def onibus = new Onibus(codigo:codigoOnibus)
	onibusList << onibus
	
	def urlBusao = urbsUrl.replace('codigo', codigoOnibus)
	
	def nekoParser = new org.cyberneko.html.parsers.SAXParser()
	nekoParser.setProperty( 'http://cyberneko.org/html/properties/default-encoding', 'UTF-8' )
	
	def html = new XmlParser( nekoParser ).parse( urlBusao )
	
	def mainDiv = html.breadthFirst().find { 
		it.getClass() == Node && 
		it.name().toString().endsWith('DIV') &&
		it.@id == 'main'
	}
	
	def nomeBusaoDiv = mainDiv.breadthFirst().find { it.@class == 'clearfix margin-big-top width96' }
	onibus.nome = nomeBusaoDiv.H2.text()
	
	def pontoHorarioDivs = mainDiv.breadthFirst().findAll { 
		it.@class == 'bg-white round-bl-60 width96 margin-medium-top clearfix' 
	}
	
	pontoHorarioDivs.each { pontoHorarioDiv ->
		def nomePonto = pontoHorarioDiv.DIV.H3.text().replace( 'Ponto: ', '' )
		def dataTipoDia = pontoHorarioDiv.DIV.P.text().replace( 'Válido a partir de: ', '' ).split( '-' )
		def tipoDia = TipoDia.findByDescricao( dataTipoDia[1].trim() )
		def validoAPartirDe = dateFormat.parse( dataTipoDia[0] )
		def horarios = []
		
		def ponto = new Ponto(nome:nomePonto, validoAPartirDe: validoAPartirDe, tipoDia: tipoDia, horarios: horarios)
		onibus.pontos << ponto
		
		pontoHorarioDiv.DIV.UL.LI.each { li ->
			def dataHorario = timeFormat.parse(li.text())
			ponto.horarios << new Time(dataHorario.time)
		}
	}
	
	println "${onibus.nome} processado em ${curr() - t0}ms. Restam ${index}/${codigosLinhasUrbs.size()}"
	
}


println onibusList.join("\n")

def xstream = new XStream()
xstream.alias( 'HorariosOnibus', List.class )
xstream.alias( 'Horario', Time.class )

def nomeArquivo = "linhasUrbs_${curr()}.xml"
new File(nomeArquivo).write xstream.toXML( onibusList )
println "${nomeArquivo} gravado com sucesso"



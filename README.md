Graviola
========

Graviola é um software em Java para celulares como Nokia, LG, Samsung (sem ser Android) entre outros, para visualizar os horários de ônibus da cidade de Curitiba/PR. 

O Graviola ainda não possui suporte para touchscreen nem para BlackBerry. Mas está na lista, aguarde as próximas versões :-).

Não é possível utilizá-lo no Android ou em iPhone.

O Graviola conta com os seguintes recursos:

* destaca os próximos horários da linha;
* elabora automaticamente uma lista com as suas linhas mais utilizadas;
* pesquisa de linhas por nome e por ponto/terminal;
* pesquisa de pontos/terminais por nome;
* navegação pelos pontos de parada das linhas;

Não é necessário ter uma conexão com a internet. O Graviola pode ser atualizado a partir do computador.

Informações de onibus obtidas do site da URBS usando script Groovy. Desenvolvido em Java ME.

Versão 1.5 (2012-12-25)

- [erro] índice dos pontos não respeita horários com o mesmo nome
- [erro] selecionar um ponto traz a rolagem uma linha acima do ponto certo
- barra de rolagem na listagem de horários
- não carregar novamente de arquivo a lista de linhas da listagem principal
- somente algumas telas precisam da mensagem de "Aguarde", não todas
- base atualizada
- [erro] selecionar o ultimo ponto pode fazer o canvas estourar
- ícone de natal!
- [erro] pesquisar linha que não existe e depois pesquisar novamente retorna um erro

Versão 1.4 (2012-12-09)

- pesquisa por pontos (finalmente!)
- pesquisa de linhas por pontos
- todas as telas com listas, ao voltar, retornam no índice selecionado
- tela de "Aguarde" visível nas transições de telas com processamento mais pesado
- base de dados refatorada para arquivo binário, ao invés de código
- atualização de base de dados

Versão 1.3.1 (2012-11-25)

- base de dados atualizada

Versão 1.3 (2012-11-18)

- modelo de telas refatorado (e agora está orientado a objeto)
- corrigido bug ao retornar para a tela de resultado de pesquisa e buscar outra linha
- implementado navegação por entre os pontos de uma linha de onibus


Versão 1.2 (2012-11-04)

- 81 linhas atualizadas
- melhoria: ao efetuar uma pesquisa, visualizar uma linha, e retornar, o resultado da pesquisa não é mais perdida
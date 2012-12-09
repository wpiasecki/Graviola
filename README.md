Graviola
========

Graviola é um software em Java para celulares mais antigos, como Nokia, LG e Samsung, para visualizar os horários de ônibus da cidade de Curitiba/PR.

A atualização do software é offline, cada nova versão deve ser baixada para o celular através de um computador.

A base de dados do software é o próprio software, para fins de performance. 

Informações parseadas do site da URBS usando Groovy.

Versão 1.4b2 (2012-12-09)

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
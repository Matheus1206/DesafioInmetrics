# Matheus Bandeira de Oliveira
Repositório criado com o objetivo de facilitar o contato com a Inmetrics.

Explicando a automação em web:
  Para o desafio foi criada a automação de todos os cenários propostos levando em consideração um fluxo "correto" e "incorreto", mesmo com o uso do cucumber foi criada uma DSL para facilitar a escrita da automação. Decidi dividir o projeto em 3 partes para uma melhor organização:
   - CORE: Nesta pasta ficam as classes responsáveis por inicializar o chromedriver, os métodos da DSL, ou seja, tudo que é responsável para a inicialização do projeto.
   - PAGES: Local onde ficam as páginas com seus objetos mapeados.
   - TESTS: Pasta onde encontra-se os arquivos .feature e suas classes em java.

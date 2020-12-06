#language:pt

  Funcionalidade: Cadastro
    Cenario: Cadastro correto
      Dado que cliquei no link de cadastro
      E adicionei o nome do usuario
      E adicionei a senha
      E confirmei a senha
      E cliquei no botão de cadastrar
      Então a tela de login é apresentada

    Cenario: Cadastro sem digitar o usuario
      Dado que cliquei no link de cadastro
      E adicionei a senha
      E confirmei a senha
      E cliquei no botão de cadastrar
      Então a mensagem de campo obrigatorio é apresentada

    Cenario: Cadastro senhas diferentes
      Dado que cliquei no link de cadastro
      E adicionei o nome do usuario
      E adicionei a senha
      E adicionei a senha diferente
      E cliquei no botão de cadastrar
      Então a mensagem de campo SENHAS NÃO COMBINAM É APRESENTADA

#language:pt

  Funcionalidade: Login
    Cenario: Login com Sucesso
      Dado que realizo o login com usuario e senha corretos
      Então a tela inicial é apresentada

    Cenario: Login incorreto
      Dado que realizo o login com usuario e senha incorretos
      Então a mensagem "ERRO!" é apresentada



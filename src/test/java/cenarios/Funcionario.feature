#language:pt

Funcionalidade: Login
  Cenario: Funcionario pesquisa
    Dado que escrevo um nome no botao pesquisar
    Então devera ser apresentado o nome na tabela

   Cenario Excluir Funcionario
     Dado que aperto no botao de excluir
     Então o usuario nao aparece na tabela

    Cenario: Alterar nome funcionario
      Dado que clico no botao de alterar
      E altero o nome do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar cargo funcionario
      Dado que clico no botao de alterar
      E altero o cargo do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar cpf funcionario
      Dado que clico no botao de alterar
      E altero o cpf do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar salario funcionario
      Dado que clico no botao de alterar
      E altero o salario do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar sexo funcionario
      Dado que clico no botao de alterar
      E altero o sexo do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar tipo contratação funcionario
      Dado que clico no botao de alterar
      E altero o tipo de contratação do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar a data de admissão funcionario
      Dado que clico no botao de alterar
      E altero a data de admissão do funcionario
      E clico em enviar
      Então deverá ser alterado com sucesso

    Cenario: Alterar deixando um campo vazio
      Dado que clico no botao de alterar
      E limpo o campo nome
      E clico em enviar
      Então deverá ser apresentada a mensagem preencha este campo

    Cenario: Adicionar funcionario
      Dado que clico no link de novo funcionario
      E escrevo o nome
      E escrevo o cargo
      E escrevo o cpf
      E escrevo o salario
      E seleciono o sexo
      E seleciono o tipo de contratação
      E seleciono a admissão
      E clico em enviar
      Então a mensagem de sucesso é apresentada

    Cenario: Adicionar funcionario cpf inválido
      Dado que clico no link de novo funcionario
      E escrevo o nome
      E escrevo o cargo
      E escrevo o cpf invalido
      Então a mensagem CPF Invalido é apresentada

    Cenario: Adicionar com campo vazio
      Dado que clico no link de novo funcionario
      E clico em enviar
      Então deverá ser apresentada a mensagem preencha este campo




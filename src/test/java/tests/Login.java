package tests;

import core.Cenarios;
import core.DSL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pages.FuncionarioPage;
import pages.LoginPage;

public class Login extends DSL {

    private Cenarios cenario = Cenarios.LOGIN;
    public LoginPage login = new LoginPage(driver);
    public FuncionarioPage funcionario = new FuncionarioPage(driver);

    private String usuarioCorreto = "teste@teste.com";
    private String senhaCorreta = "asdf1234";
    private String usuarioIncorreto = "MatheusBandeira";
    private String senhaIncorreta = "123456";

    @Before
    public void setup(){
       createDriver();
   }


    @Dado("que realizo o login com usuario e senha corretos")
    public void queRealizoOLoginComUsuarioESenhaCorretos() {
        escrever(login.inputUsuario, usuarioCorreto);
        escrever(login.inputSenha, senhaCorreta);
        clicar(login.buttonEntre);
    }

    @Então("a tela inicial é apresentada")
    public void aTelaInicialÉApresentada() {
        print(cenario, "Login Correto");
        assertivaPortexto("NOVO FUNCIONÁRIO", funcionario.linkNovoFuncionario);
    }

    @Dado("que realizo o login com usuario e senha incorretos")
    public void queRealizoOLoginComUsuarioESenhaIncorretos() {
        escrever(login.inputUsuario, usuarioIncorreto);
        escrever(login.inputSenha, senhaIncorreta);
        clicar(login.buttonEntre);
    }


    @Então("a mensagem {string} é apresentada")
    public void aMensagemÉApresentada(String mensagem) {
        print(cenario, "Login Incorreto");
        assertivaPortexto(mensagem.toUpperCase(), login.messageErro);
    }

    @After
    public void tearDown(){
        killDriver();
    }
}

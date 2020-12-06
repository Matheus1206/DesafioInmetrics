package tests;

import core.Cenarios;
import core.CreateData;
import core.DSL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.testng.annotations.BeforeMethod;
import pages.CadastroPage;
import pages.LoginPage;

public class Cadastro extends DSL {

    private Cenarios cenario = Cenarios.CADASTRO;
    CadastroPage cadastro = new CadastroPage(driver);
    LoginPage login = new LoginPage(driver);

    private String senha = CreateData.criaSenha();

    @BeforeMethod
    public void setup(){
        createDriver();
    }

    @Dado("que cliquei no link de cadastro")
    public void queCliqueiNoLinkDeCadastro() {
        clicar(cadastro.linkCadastro);

    }

    @E("adicionei o nome do usuario")
    public void adicioneiONomeDoUsuario() {
        escrever(cadastro.inputUsuario, CreateData.criaUsuario());
    }

    @E("adicionei a senha")
    public void adicioneiASenha() {
        escrever(cadastro.inputSenha, senha);

    }

    @E("confirmei a senha")
    public void confirmeiASenha() {
        escrever(cadastro.inputConfirmeSenha, senha);

    }

    @E("cliquei no botão de cadastrar")
    public void cliqueiNoBotãoDeCadastrar() {
        clicar(cadastro.buttonCadastrar);
    }

    @Então("a tela de login é apresentada")
    public void aTelaDeLoginÉApresentada() {
        print(cenario, "Cadastro correto");
        assertivaPortexto("LOGIN",login.linkLogin);
    }

    @Então("a mensagem de campo obrigatorio é apresentada")
    public void aMensagemDeCampoObrigatorioÉApresentada() {
        print(cenario, "Cadastro sem digitar o usuario");
        assertivaPortexto("", cadastro.messageCampoObrigatorio);

    }

    @Então("a mensagem de campo SENHAS NÃO COMBINAM É APRESENTADA")
    public void aMensagemDeCampoSENHASNÃOCOMBINAMÉAPRESENTADA() {
        print(cenario, "Cadastro senhas diferentes");
        assertivaPortexto("Senhas não combinam", cadastro.messageSenhasDiferentes);
    }

    @E("adicionei a senha diferente")
    public void adicioneiASenhaDiferente() {
        escrever(cadastro.inputConfirmeSenha, CreateData.criaSenha());
    }

    @After
    public void tearDown(){
        killDriver();
    }
}

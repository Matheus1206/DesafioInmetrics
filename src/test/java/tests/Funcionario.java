package tests;

import core.Cenarios;
import core.CreateData;
import core.DSL;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import pages.FuncionarioPage;
import pages.LoginPage;

public class Funcionario extends DSL {

    Cenarios cenario = Cenarios.FUNCIONARIO;
    LoginPage login  = new LoginPage(driver);
    FuncionarioPage funcionario = new FuncionarioPage(driver);

    @Before
    public void setup(){
        escrever(login.inputUsuario, "teste@teste.com");
        escrever(login.inputSenha, "asdf1234");
    }

    @Dado("que escrevo um nome no botao pesquisar")
    public void queEscrevoUmNomeNoBotaoPesquisar() {
        escrever(funcionario.inputPesquisa, "joão");
    }

    @Então("devera ser apresentado o nome na tabela")
    public void deveraSerApresentadoONomeNaTabela() {
        print(cenario, "Funcionário alterar");
        assertivaPortexto("joao", funcionario.funcionarioPesquisa);
    }

    @Dado("que aperto no botao de excluir")
    public void queApertoNoBotaoDeExcluir() {
        clicar(funcionario.buttonExcluir);
    }

    @Então("o usuario nao aparece na tabela")
    public void oUsuarioNaoApareceNaTabela() {
        print(cenario, "Funcionário alterar");
        assertivaPortexto(" ", funcionario.funcionarioPesquisa);
    }

    @Dado("que clico no botao de alterar")
    public void queClicoNoBotaoDeAlterar() {
        clicar(funcionario.buttonAlterar);
    }

    @E("altero o nome do funcionario")
    public void alteroONomeDoFuncionario() {
        limpar(funcionario.inputNome);
        escrever(funcionario.inputNome, "TESTE");
    }

    @E("clico em enviar")
    public void clicoEmEnviar() {
        clicar(funcionario.buttontEnviar);
    }

    @Então("deverá ser alterado com sucesso")
    public void deveráSerAlteradoComSucesso() {
        print(cenario, "Funcionário alterar");
        assertivaPortexto("TESTE", funcionario.funcionarioPesquisa);
    }

    @E("altero o cargo do funcionario")
    public void alteroOCargoDoFuncionario() {
        limpar(funcionario.inputCargo);
        escrever(funcionario.inputCargo, "ANALISTA DE TESTE");
    }

    @E("altero o cpf do funcionario")
    public void alteroOCpfDoFuncionario() {
        limpar(funcionario.inputCpf);
        escrever(funcionario.inputCpf, CreateData.criaCpf());
    }

    @E("altero o salario do funcionario")
    public void alteroOSalarioDoFuncionario() {
        limpar(funcionario.inputDinheiro);
        escrever(funcionario.inputDinheiro, "1500000");
    }

    @E("altero o sexo do funcionario")
    public void alteroOSexoDoFuncionario() {
        selecionaItem(funcionario.selectSexo, 3);
    }

    @E("altero o tipo de contratação do funcionario")
    public void alteroOTipoDeContrataçãoDoFuncionario() {
        clicar(funcionario.radioContratacaoPj);
    }

    @E("altero a data de admissão do funcionario")
    public void alteroADataDeAdmissãoDoFuncionario() {
        limpar(funcionario.inputAdmissao);
        escrever(funcionario.inputAdmissao, "220418");
    }

    @E("limpo o campo nome")
    public void limpoOCampoNome() {
        limpar(funcionario.inputNome);
    }

    @Então("deverá ser apresentada a mensagem preencha este campo")
    public void deveráSerApresentadaAMensagemPreenchaEsteCampo() {

    }

    @Dado("que clico no link de novo funcionario")
    public void queClicoNoLinkDeNovoFuncionario() {
        clicar(funcionario.linkNovoFuncionario);
    }

    @E("escrevo o nome")
    public void escrevoONome() {
        escrever(funcionario.inputNome, "TESTES");
    }

    @E("escrevo o cargo")
    public void escrevoOCargo() {
        escrever(funcionario.inputCargo, "ANALISTA DE TESTE");

    }

    @E("escrevo o cpf")
    public void escrevoOCpf() {
        escrever(funcionario.inputCpf, CreateData.criaCpf());
    }

    @E("escrevo o salario")
    public void escrevoOSalario() {
        escrever(funcionario.inputDinheiro, "15555");
    }

    @E("seleciono o sexo")
    public void selecionoOSexo() {
        selecionaItem(funcionario.selectSexo, 2);
    }

    @E("seleciono o tipo de contratação")
    public void selecionoOTipoDeContratação() {
        clicar(funcionario.radioContratacaoPj);
    }

    @E("seleciono a admissão")
    public void selecionoAAdmissão() {
        escrever(funcionario.inputAdmissao, "220418");
    }

    @Então("a mensagem de sucesso é apresentada")
    public void aMensagemDeSucessoÉApresentada() {
        assertivaPortexto("SUCESSO!", funcionario.messageAlterarSucesso);
    }

    @E("escrevo o cpf invalido")
    public void escrevoOCpfInvalido() {
        escrever(funcionario.inputCpf, "15255552");
    }

    @Então("a mensagem CPF Invalido é apresentada")
    public void aMensagemCPFInvalidoÉApresentada() {
        String validacao = driver.switchTo().alert().getText();
        Assert.assertEquals("CPF Invalido!", validacao);

    }



}

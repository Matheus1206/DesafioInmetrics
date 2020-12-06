package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FuncionarioPage extends BasePage  {

    //Construtor
    public FuncionarioPage(WebDriver driver) {
        super(driver);
    }

    //Objetos
    public By inputPesquisa = By.cssSelector("input[type=\"search\"]");
    public By buttonExcluir = By.cssSelector("button[id = \"delete-btn\"]");
    public By buttonAlterar = By.cssSelector("button[class = \"btn btn-warning\"]");
    public By inputNome = By.cssSelector("input[id = \"inputNome\"]");
    public By inputCargo = By.cssSelector("input[id = \"inputCargo\"]");
    public By inputCpf = By.cssSelector("input[id = \"cpf\"]");
    public By inputDinheiro = By.cssSelector("input[id = \"dinheiro\"]");
    public By selectSexo = By.cssSelector("input[id = \"slctSexo\"]");
    public By radioContratacaoClt = By.cssSelector("input[id = \"clt\"]");
    public By radioContratacaoPj = By.cssSelector("input[id = \"pj\"]");
    public By inputAdmissao = By.cssSelector("input[id = \"inputAdmissao\"]");
    public By buttontEnviar = By.cssSelector("input[type=\"submit\"]");
    public By buttontCancelar = By.cssSelector("input[type=\"reset\"]");
    public By messageAlterarSucesso = By.xpath("//strong[contains(text(), \" SUCESSO! \")]");
    public By linkNovoFuncionario = By.cssSelector("a[href=\"/empregados/new_empregado\"]");
    public By funcionarioPesquisa = By.cssSelector("td[class=\"text-center sorting_1\"]");
}

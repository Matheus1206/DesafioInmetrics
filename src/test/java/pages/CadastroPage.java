package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage extends BasePage {

    // Construtor
    public CadastroPage(WebDriver driver) {
        super(driver);
    }

    //Objetos
    public By linkCadastro = By.cssSelector("a[href=\"/accounts/signup/\"][class=\"nav-link text-uppercase font-weight-bold\"]");
    public By inputUsuario = By.cssSelector("input[name='username']");
    public By inputSenha = By.cssSelector("input[name='pass']");
    public By inputConfirmeSenha = By.cssSelector("input[name='confirmpass']");
    public By buttonCadastrar = By.cssSelector("button[class = \"login100-form-btn\"]");
    public By messageCampoObrigatorio = By.cssSelector("div[data-validate=\"Campo obrigatório\"]");
    public By messageSenhasDiferentes = By.xpath("/html/body/div[@class='limiter']//form[@action='/accounts/signup/']/div[3]/span[@class='txt1']/div[@class='container-login100-form-btn m-t-17 text-center']");
}

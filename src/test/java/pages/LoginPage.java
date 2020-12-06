package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Construtor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Objetos
    public By inputUsuario = By.name("username");
    public By inputSenha = By.name("pass");
    public By buttonEntre = By.className("login100-form-btn");
    public By messageErro = By.xpath("//strong[contains(text(), \" ERRO! \")]");
    public By linkLogin = By.cssSelector("a[href=\"/accounts/login/\"]");
}

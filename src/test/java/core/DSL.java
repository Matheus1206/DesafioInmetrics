package core;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DSL extends DriverFactory {

    //pega texto do alert
    public String pegaTextoAlert(By by){
        return driver.switchTo().alert().getText();
    }

    //seleciona item
    public void selecionaItem(By by, Integer opcao){
        Select select =  new Select(driver.findElement(by));
        select.selectByIndex(opcao);
    }

    //limpar
    public void limpar(By by){
        driver.findElement(by).clear();
    }

    //Realizar um clique
    public void clicar(By by){
        driver.findElement(by).click();
    }

    //Escrever
    public void escrever(By by, String texto){
        driver.findElement(by).sendKeys(texto);
    }

    //obtem texto de objeto
    public String obterTexto(By by){
        return driver.findElement(by).getText();
    }

    //asserção por texto
    public void assertivaPortexto(String atual,By by){
        assertEquals(atual,obterTexto(by));
    }

    //fecha navegador
    public void fechaNavegador(){
        driver.quit();
    }

    //tira screenshoot
    public void print(Cenarios cenario, String nomeDoArquivo){
            String horaExecucao = getHoraExecucao();
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("prints/" + cenario + "/" + nomeDoArquivo + "  -  " + horaExecucao +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHoraExecucao(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd-MM-yyyy hhmm").format(ts);
    }

}

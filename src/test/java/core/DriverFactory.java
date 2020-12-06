package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;

    }

    public static void createDriver(){
        String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
        System.out.println("SISTEMA OPERACIONAL: "+OS);
        if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
            System.setProperty("webdriver.chrome.driver", "libs/chromedriver_mac");
        } else if (OS.indexOf("nux") >= 0) {
            System.setProperty("webdriver.chrome.driver", "libs/chromedriver_linux");
        } else if(OS.startsWith("w")){
            System.setProperty("webdriver.chrome.driver", "libs/chromedriver85.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.inmrobo.tk/accounts/login/");
    }

    public static void killDriver() {
        if(driver != null){
            driver = null; }
    }
}

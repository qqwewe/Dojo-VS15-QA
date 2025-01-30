package automationexercise.factory.seleniumfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;

    // inicia o browser
    public void initBrowser(String url){

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.get(url);  // Abre o navegador
        driver.manage().window().maximize();  // Maximizar navegador

    }

    // finaliza o browser
    public void tearDown(){
        driver.close();
    }



}

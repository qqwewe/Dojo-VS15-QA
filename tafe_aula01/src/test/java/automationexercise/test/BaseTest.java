package automationexercise.test;

import automationexercise.factory.seleniumfactory.SeleniumFactory;
import org.testng.annotations.*;

public class BaseTest {

    SeleniumFactory seleniumFactory = new SeleniumFactory();

    @BeforeMethod
    public void abrirNavegador(){
        seleniumFactory.initBrowser("https://www.automationpractice.pl/index.php");
    }


    @AfterMethod
    public void fecharNavegador(){
        seleniumFactory.tearDown();
    }

}

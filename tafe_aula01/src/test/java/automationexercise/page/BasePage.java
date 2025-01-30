package automationexercise.page;


import automationexercise.factory.seleniumfactory.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;


public class BasePage extends Elements {


    static void preencherInput(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void preencherInputFile(By by, File uploadFile) {
        esperarElemento(by);
        WebElement fileInput = element(by);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
    }

    static void clicar(By by) {
        esperarElemento(by);
        element(by).click();
    }

    static void verificarElemento(By by) {
        esperarElemento(by);
    }

    protected static String lerTexto(By by) {
        return element(by).getText();
    }

    protected static void selecinoTab(By by){
        esperarElemento(by);
        element(by).sendKeys("\t");
    }

    static void selectDropDown(By by, String option){
        esperarElemento(by);
        clicar(by);
        Select select = new Select(element(by));
        select.selectByValue(option);
    }

    static void SelectClick(By by) {
        esperarElemento(by);
        element(by).click();
    }
}

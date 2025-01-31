package automationexercise.page;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{

    private static final By BUTTON_MY_ADDRESS =
            By.cssSelector("#center_column > div > div > ul > li:nth-child(3) > a");

    public void clickMyAddress() {
        clicar(BUTTON_MY_ADDRESS);
    }

}

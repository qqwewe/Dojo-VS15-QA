package automationexercise.page;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {
    private static final By USER_INFO = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a");
    private static final By SIGN_OUT = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a");
    private static final By CONTACT_US = By.cssSelector("#contact-link > a");

    public void clickUserInfo() {
        clicar(USER_INFO);
    }
}

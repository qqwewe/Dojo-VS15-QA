package automationexercise.page;

import org.openqa.selenium.By;

public class AddressesPage extends BasePage{
    private static final By BUTTON_ADD_NEW_ADDRESS =
            By.cssSelector("#center_column > div.clearfix.main-page-indent > a");

    public void clickButtonAddNewAddress() {
        clicar(BUTTON_ADD_NEW_ADDRESS);
    }

}

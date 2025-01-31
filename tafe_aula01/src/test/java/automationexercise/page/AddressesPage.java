package automationexercise.page;

import org.openqa.selenium.By;

public class AddressesPage extends BasePage{
    private static final By BUTTON_ADD_NEW_ADDRESS =
            By.cssSelector("#center_column > div.clearfix.main-page-indent > a");

    private static final By MY_ADDRESSES_TITLE =
            By.cssSelector("#center_column > h1");

    public void clickButtonAddNewAddress() {
        clicar(BUTTON_ADD_NEW_ADDRESS);
    }

    public String getTitleText(){
     return lerTexto(MY_ADDRESSES_TITLE);
    }

}

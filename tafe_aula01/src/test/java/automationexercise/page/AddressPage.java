package automationexercise.page;

import org.openqa.selenium.By;

public class AddressPage extends BasePage{

    public static final By address = By.cssSelector("#address1");
    public static final By city = By.cssSelector("#city");
    public static final By state = By.cssSelector("#id_state");
    public static final By zipCode = By.cssSelector("#postcode");
    public static final By phoneHome = By.cssSelector("#phone");
    public static final By phoneMobile = By.cssSelector("#phone_mobile");
    public static final By buttonSave = By.cssSelector("#submitAddress > span");

    public void fillAdrres(String address1){preencherInput(address, address1);}
}

package automationexercise.page;

import org.openqa.selenium.By;

public class AddressPage extends BasePage{

    private static final By FORM_ADDRESS = By.cssSelector("#address1");
    private static final By FORM_CITY = By.cssSelector("#city");
    private static final By FORM_STATE = By.cssSelector("#id_state");
    private static final By FORM_ZIP_CODE = By.cssSelector("#postcode");
    private static final By FORM_PHONE_HOME = By.cssSelector("#phone");
    private static final By FORM_PHONE_MOBILE = By.cssSelector("#phone_mobile");
    private static final By BUTTON_SAVE = By.cssSelector("#submitAddress > span");


    public void fillAddress(String address1){preencherInput(FORM_ADDRESS, address1);}
    public void fillCity(String city){preencherInput(FORM_CITY, city);}
    public void clickState(String idState){
        selectDropDown(FORM_STATE, idState);
    }
    public void fillZipCode(String zipCode){preencherInput(FORM_ZIP_CODE, zipCode);}
    public void fillPhoneHome(String home){preencherInput(FORM_PHONE_HOME, home);}
    public void fillPhoneMobile(String mobile){preencherInput(FORM_PHONE_MOBILE, mobile);}
    public void clickButtonSave(){
        clicar(BUTTON_SAVE);
    }
}

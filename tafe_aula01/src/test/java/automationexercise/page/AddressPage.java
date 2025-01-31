package automationexercise.page;

import org.openqa.selenium.By;

public class AddressPage extends BasePage{

    private static final By form_address = By.cssSelector("#address1");
    private static final By form_city = By.cssSelector("#city");
    private static final By form_state = By.cssSelector("#id_state");
    private static final By form_zipCode = By.cssSelector("#postcode");
    private static final By form_phoneHome = By.cssSelector("#phone");
    private static final By form_phoneMobile = By.cssSelector("#phone_mobile");
    private static final By form_buttonSave = By.cssSelector("#submitAddress > span");


    public void fillAddress(String address1){preencherInput(form_address, address1);}
    public void fillCity(String city){preencherInput(form_city, city);}
    public void clickState(){
        clicar(form_state);
    }
    public void fillZipCode(String zipCode){preencherInput(form_zipCode, zipCode);}
    public void fillphoneHome(String home){preencherInput(form_phoneHome, home);}
    public void fillphoneMobile(String mobile){preencherInput(form_phoneMobile, mobile);}
    public void clickbuttonSave(){
        clicar(form_buttonSave);
    }
}

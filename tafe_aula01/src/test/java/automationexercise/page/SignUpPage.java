package automationexercise.page;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage {

    private static final By SIGNUP_HOME = By.cssSelector("div.header_user_info > a");
    private static final By CREATE_ACOUNT = By.cssSelector("#SubmitCreate");
    private static final By CREATE_EMAIL = By.cssSelector("#email_create");
    private static final By CHECKBOX_MR = By.cssSelector("#id_gender1");
    private static final By CHECKBOX_MRS = By.cssSelector("#id_gender2");
    private static final By FIRST_NAME = By.cssSelector("#customer_firstname");
    private static final By LAST_NAME = By.cssSelector("#customer_lastname");
    private static final By PASSWORD = By.cssSelector("#passwd");
    private static final By DAY = By.cssSelector("#days");
    private static final By MONTH = By.cssSelector("#months");
    private static final By YEAR = By.cssSelector("#years");
    private static final By NEWSLETTER = By.cssSelector("#uniform-newsletter");

    public void clickSignUpHomeButton(){
        clicar(SIGNUP_HOME);
    }
    public void fillEmailField(String email){
        preencherInput(CREATE_EMAIL, email);
    }
    public void clickCreateAccountButton(){
        clicar(CREATE_ACOUNT);
    }

    public void clickTitleCheckboxButton(String title){
        if(title.equalsIgnoreCase("Mr")){

        }
    }
}

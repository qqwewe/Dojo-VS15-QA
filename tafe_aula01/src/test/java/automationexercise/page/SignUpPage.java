package automationexercise.page;

import org.openqa.selenium.By;

public class SignUpPage {

    private static final By SIGNUP_HOME = By.cssSelector("div.header_user_info > a");
    private static final By CREATE_ACOUNT = By.cssSelector("#SubmitCreate");
    private static final By CREATE_EMAIL = By.cssSelector("#email_create");
    private static final By CHECKBOX_MR = By.cssSelector("#id_gender1");
    private static final By CHECKBOX_MRS = By.cssSelector("#id_gender2");
    private static final By NAME = By.cssSelector("#customer_firstname");


}

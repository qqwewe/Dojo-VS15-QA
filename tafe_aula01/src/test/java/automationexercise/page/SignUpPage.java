package automationexercise.page;

import automationexercise.data.UserDto;
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
    private static final By BUTTON_SUBMIT = By.cssSelector("#submitAccount");
    private static final By MESSAGE_CREATE_SUCCESS = By.cssSelector("#center_column p.alert.alert-success");


    public void clickSignUpHomeButton(){
        clicar(SIGNUP_HOME);
    }
    public void fillEmailField(String email){
        preencherInput(CREATE_EMAIL, email);
    }
    public void clickCreateAccountButton(){
        clicar(CREATE_ACOUNT);
    }

    public void singUpFlow(UserDto userData){
        clickSignUpHomeButton();
        fillEmailField(userData.getEmail());
        clickCreateAccountButton();
        clickTitleCheckboxButton(userData.getTitle());
        inputFirstNameField(userData.getFirstName());
        inputLastNameField(userData.getLastName());
        inputPasswordField(userData.getPassword());
        selectDayField(String.valueOf(userData.getDay()));
        selectMonthField(String.valueOf(userData.getMonth()));
        selectYearField(String.valueOf(userData.getYear()));
        clickNewsletter();
        clickButtonSubmit();
    }

    public void clickTitleCheckboxButton(String title){
        if(title.equalsIgnoreCase("Mr")){
            clicar(CHECKBOX_MR);
        } else {
            clicar(CHECKBOX_MRS);
        }
    }

    public void inputFirstNameField(String firstName){
        preencherInput(FIRST_NAME, firstName);
    }

    public void inputLastNameField(String lastName){
        preencherInput(LAST_NAME, lastName);
    }

    public void inputPasswordField(String password){
        preencherInput(PASSWORD, password);
    }

   public void selectDayField(String day){selectDropDown(DAY, day);}

   public void selectMonthField(String month){
        selectDropDown(MONTH, month);
   }

   public void selectYearField(String year){
        selectDropDown(YEAR, year);
   }

   public void clickNewsletter(){
        clicar(NEWSLETTER);
   }

   public void clickButtonSubmit(){
        clicar(BUTTON_SUBMIT);
   }

   public String verifySuccessMsg() {return  lerTexto(MESSAGE_CREATE_SUCCESS);}



}

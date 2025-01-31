package automationexercise.test;

import automationexercise.data.UserDto;
import automationexercise.page.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static automationexercise.factory.data.SignUpData.createSignUpDto;

public class SignUpTest extends BaseTest{

    SignUpPage signUpPage = new SignUpPage();
    UserDto userData = createSignUpDto();

    @Test
    public void signUpNewUser(){
        signUpPage.clickSignUpHomeButton();
        signUpPage.fillEmailField(userData.getEmail());
        signUpPage.clickCreateAccountButton();
        signUpPage.clickTitleCheckboxButton(userData.getTitle());
        signUpPage.inputFirstNameField(userData.getFirstName());
        signUpPage.inputLastNameField(userData.getLastName());
        signUpPage.inputPasswordField(userData.getPassword());
        signUpPage.selectDayField(String.valueOf(userData.getDay()));
        signUpPage.selectMonthField(String.valueOf(userData.getMonth()));
        signUpPage.selectYearField(String.valueOf(userData.getYear()));
        signUpPage.clickNewsletter();
        signUpPage.clickButtonSubmit();
        String msg = signUpPage.verifySuccessMsg();
        Assert.assertEquals(msg, "Your account has been created.");
    }

}

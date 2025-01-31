package automationexercise.test;

import automationexercise.data.UserDto;
import automationexercise.factory.provider.SignInProvider;
import automationexercise.page.SignInPage;
import automationexercise.page.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static automationexercise.factory.data.SignInData.createSignInDto;
import static automationexercise.factory.data.SignInData.createSignInvalid;

public class SignInTest extends BaseTest {
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    UserDto user;

    @Test
    public void testSignInValidUser() {
        UserDto useer = createSignInDto();
        signUpPage.singUpFlow(user);
        signInPage.clickSignUpHomeButton();
        String msg = signInPage.verifyAuthPage();
        Assert.assertEquals(msg, "AUTHENTICATION");
        signInPage.fillEmail(user.getEmail());
        signInPage.fillPassword(user.getPassword());
        signInPage.clickLoginButton();
        signInPage.clickSignOutButton();
    }

    @Test(dataProvider = "invalidLoginData", dataProviderClass = SignInProvider.class)
    public void testSignInInvalidUser(String emailString, String stringSenha) {
        signInPage.clickSignUpHomeButton();
        String msg = signInPage.verifyAuthPage();
        Assert.assertEquals(msg, "AUTHENTICATION");
        signInPage.fillEmail(emailString);
        signInPage.fillPassword(stringSenha);
        signInPage.clickLoginButton();
        signInPage.clickSignOutButton();
    }



}

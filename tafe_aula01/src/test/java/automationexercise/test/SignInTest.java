package automationexercise.test;

import automationexercise.data.UserDto;
import automationexercise.page.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static automationexercise.factory.data.SignInData.createSignInDto;

public class SignInTest extends BaseTest {
    SignInPage signInPage = new SignInPage();

    @Test
    public void testSignInValidUser() {
        UserDto user = createSignInDto();
        signInPage.clickSignUpHomeButton();
        String msg = signInPage.verifyAuthPage();
        Assert.assertEquals(msg, "AUTHENTICATION");

        signInPage.fillEmail(user.getEmail());
        signInPage.fillPassword(user.getPassword());
        signInPage.clickLoginButton();
        signInPage.clickSignOutButton();
    }

}

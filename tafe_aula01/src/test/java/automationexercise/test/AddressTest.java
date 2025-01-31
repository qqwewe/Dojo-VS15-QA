package automationexercise.test;

import automationexercise.data.UserDto;
import automationexercise.page.AddressPage;
import automationexercise.page.HeaderPage;
import automationexercise.page.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static automationexercise.factory.data.SignInData.createSignInDto;

public class AddressTest
{
    SignInPage signInPage = new SignInPage();
    HeaderPage headerPage = new HeaderPage();
    AddressPage addressPage = new AddressPage();
 @Test
    public void testAddAddress(){
     UserDto user = createSignInDto();
     signInPage.clickSignUpHomeButton();
     String msg = signInPage.verifyAuthPage();
     Assert.assertEquals(msg, "AUTHENTICATION");

     signInPage.fillEmail(user.getEmail());
     signInPage.fillPassword(user.getPassword());
     signInPage.clickLoginButton();
     headerPage.


 }
}

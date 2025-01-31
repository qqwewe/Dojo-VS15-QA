package automationexercise.test;

import automationexercise.data.UserDto;
import automationexercise.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static automationexercise.factory.data.SignInData.createSignInDto;

public class AddressTest
{
    SignInPage signInPage = new SignInPage();
    HeaderPage headerPage = new HeaderPage();
    AddressPage addressPage = new AddressPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressesPage addressesPage = new AddressesPage();

 @Test
    public void testAddAddress(){
     UserDto user = createSignInDto();
     signInPage.clickSignUpHomeButton();
     String msg = signInPage.verifyAuthPage();
     Assert.assertEquals(msg, "AUTHENTICATION");

     signInPage.fillEmail(user.getEmail());
     signInPage.fillPassword(user.getPassword());
     signInPage.clickLoginButton();
     headerPage.clickUserInfo();
     myAccountPage.clickMyAddress();
     addressesPage.clickButtonAddNewAddress();
     addressPage.fillAddress();

 }
}

package automationexercise.test;

import automationexercise.data.AddressDto;
import automationexercise.data.UserDto;
import automationexercise.page.*;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import static automationexercise.factory.data.AddressData.createAddressData;
import static automationexercise.factory.data.SignInData.createSignInDto;

public class AddressTest extends BaseTest
{
    SignInPage signInPage = new SignInPage();
    HeaderPage headerPage = new HeaderPage();
    AddressPage addressPage = new AddressPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressesPage addressesPage = new AddressesPage();

 @Test
    public void testAddAddress() throws InterruptedException {
     UserDto user = createSignInDto();
     AddressDto address = createAddressData();
     signInPage.clickSignUpHomeButton();
     String msg = signInPage.verifyAuthPage();
     Assert.assertEquals(msg, "AUTHENTICATION");

     signInPage.fillEmail(user.getEmail());
     signInPage.fillPassword(user.getPassword());
     signInPage.clickLoginButton();
     headerPage.clickUserInfo();
     myAccountPage.clickMyAddress();
     addressesPage.clickButtonAddNewAddress();
     addressPage.fillAddress(address.getAddress());
     addressPage.fillCity(address.getCity());
     addressPage.clickState(String.valueOf(address.getState()));
     addressPage.fillZipCode(address.getZipCode());
     addressPage.fillPhoneHome(address.getPhoneHome());
     addressPage.fillPhoneMobile(address.getPhoneMobile());
     addressPage.fillAddressTitle(address.getAlias());
     addressPage.clickButtonSave();
     Assert.assertEquals(addressesPage.getTitleText(),"MY ADDRESSES");

 }

}

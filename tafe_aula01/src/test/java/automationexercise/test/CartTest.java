package automationexercise.test;

import automationexercise.data.UserDto;
import automationexercise.factory.data.SignInData;
import automationexercise.page.CartPage;
import automationexercise.page.SignInPage;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    CartPage cartPage = new CartPage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void finalizarCompra() {
        UserDto user = SignInData.createSignInDto();
        cartPage.clicarPaginaWoman();
        cartPage.clicarAdicionarProduto();
        cartPage.selecionarCorDoProduto();
        cartPage.clicarAddCart();
        cartPage.clicarCheckout();
        cartPage.clicarProceedToCheckout();
        signInPage.fillEmail(user.getEmail());
        signInPage.fillPassword(user.getPassword());
        signInPage.clickLoginButton();

    }

}

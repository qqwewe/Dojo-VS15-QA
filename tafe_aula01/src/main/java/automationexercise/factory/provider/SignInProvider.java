package automationexercise.factory.provider;

import org.testng.annotations.DataProvider;

public class SignInProvider {

    @DataProvider(name = "invalidLoginData")
    public Object[][] invalidLoginProvider() {
        return new Object[][]{
                {"Email@email.com", "Senha"},
                {"testevalido@teste.com" ,"Senha"},
                {"email@email.com","teste123"}

        };
    }
}

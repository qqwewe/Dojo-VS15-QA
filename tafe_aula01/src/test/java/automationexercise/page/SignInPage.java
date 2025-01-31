package automationexercise.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInPage extends BasePage {

    public static final By MESSAGE_AUTH_PAGE = By.cssSelector("#center_column > h1");
    public static final By INPUT_EMAIL = By.cssSelector("#email");
    public static final By INPUT_PASSWORD = By.cssSelector("#passwd");
    public static final By BUTTON_LOGIN = By.cssSelector("#SubmitLogin > span");
    private static final By SIGNUP_HOME = By.cssSelector("div.header_user_info > a");

    public void fillEmail(String email) {
        preencherInput(INPUT_EMAIL, email);
    }

    public void fillPassword(String password) {
        preencherInput(INPUT_PASSWORD, password);
    }

    public void clickLoginButton() {
        clicar(BUTTON_LOGIN);
    }

    public String verifyAuthPage() {
        return lerTexto(MESSAGE_AUTH_PAGE);
    }

    public void clickSignUpHomeButton() {
        clicar(SIGNUP_HOME);
    }

}

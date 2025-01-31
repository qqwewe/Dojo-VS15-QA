package automationexercise.page;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

    public static final By WOMAN = By.cssSelector("ul > li.sfHoverForce > a");
    public static final By PRODUTO = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link > img")
    public static final By SELECTOR_WHITE = By.cssSelector("#color_8");
    public static final By BUTTON_ADD_CART = By.cssSelector("#add_to_cart > button > span");
    public static final By TEXT_SUCCSESS_ADD_CART = By.cssSelector("div.layer_cart_product.col-xs-12.col-md-6 > h2");
    public static final By BUTTON_CHECKOUT = By.cssSelector("div.button-container > a");
    public static final By TEXT_SUCCSESS_CHECKOUT = By.cssSelector("#cart_title");
    public static final By BUTTON_PROCEED_TO_CHECKOUT = By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium");

}

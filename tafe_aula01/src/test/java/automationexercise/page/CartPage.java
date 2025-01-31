package automationexercise.page;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

    private static final By WOMAN = By.cssSelector("ul > li.sfHoverForce > a");
    private static final By PRODUTO = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link > img");
    private static final By SELECTOR_WHITE = By.cssSelector("#color_8");
    private static final By BUTTON_ADD_CART = By.cssSelector("#add_to_cart > button > span");
    private static final By TEXT_SUCCESS_ADD_CART = By.cssSelector("div.layer_cart_product.col-xs-12.col-md-6 > h2");
    private static final By BUTTON_CHECKOUT = By.cssSelector("div.button-container > a");
    private static final By TEXT_SUCCESS_CHECKOUT = By.cssSelector("#cart_title");
    private static final By BUTTON_PROCEED_TO_CHECKOUT = By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium");

}

package amazonshopping.cart.views;

import amazonshopping.cart.locators.AmazonCartPageLocators;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AmazonCartPage {

    private AmazonCartPageLocators amazonCartPageLocators;      //here are stored all needed elements for performing actions on page
    private WebDriver driver;

    public AmazonCartPage(WebDriver driver) {

        this.driver = driver;
        amazonCartPageLocators = new AmazonCartPageLocators(driver); }

    /**
     * Checking that correct product was added.
     */
    public void productsInCart() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        amazonCartPageLocators.cartButton().click();
        amazonCartPageLocators.cartProductUrl().click();
    }

    /**
     * Getting price for product
     */
    public void getPriceForCartProduct() {

        amazonCartPageLocators.productPrice();
    }
    /**
     * Checking that correct product was added.
     */
    public void summarizePriceForProducts() {

        amazonCartPageLocators.subtotalPrice().getText().equals(amazonCartPageLocators.productPrice());
    }

    /**
     * Getting url of product from cart.
     * @return url
     */
    public String getCartProductUrl() {

        return driver.getCurrentUrl();
    }
}

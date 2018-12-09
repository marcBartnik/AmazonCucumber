package amazonshopping.cart.views;

import amazonshopping.cart.locators.AmazonCartPageLocators;
import amazonshopping.digitalcameras.locators.AmazonBestSellersInDigitalCamerasLocators;
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
    public void checkProductsInCart(AmazonBestSellersInDigitalCamerasLocators amazonBestSellersInDigitalCamerasLocators) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        amazonCartPageLocators.cartButton().click();
        amazonCartPageLocators.productName().getText().equals(amazonBestSellersInDigitalCamerasLocators.productName());
    }

    /**
     * Checking that correct product was added.
     */
    public void checkSummarizePriceForProducts() {

        amazonCartPageLocators.subtotalPrice().getText().equals(amazonCartPageLocators.productPrice());
    }
}

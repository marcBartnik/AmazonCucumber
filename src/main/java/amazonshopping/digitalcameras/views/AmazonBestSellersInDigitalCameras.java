package amazonshopping.digitalcameras.views;

import amazonshopping.digitalcameras.locators.AmazonBestSellersInDigitalCamerasLocators;
import org.openqa.selenium.WebDriver;

/**
 * Class provides methods for Customer to moving on a page with game searching results.
 */

public class AmazonBestSellersInDigitalCameras {

    private AmazonBestSellersInDigitalCamerasLocators amazonBestSellersInDigitalCamerasLocators;                    //here are stored all needed element for performing actions on page
    private WebDriver driver;

    /**
     * Default constructor.
     * @param driver enable performing actions on a page
     */
    public AmazonBestSellersInDigitalCameras(WebDriver driver) {

        this.driver = driver;
        amazonBestSellersInDigitalCamerasLocators = new AmazonBestSellersInDigitalCamerasLocators(driver); }

    /**
     * Clicking on 5th element.
     */
    public void clickOn5thElement() {

        amazonBestSellersInDigitalCamerasLocators.fifthElement().click();
    }

    /**
     * Adding items to cart.
     */
    public void addItemToCart() {

        amazonBestSellersInDigitalCamerasLocators.selectQuantity().click();
        amazonBestSellersInDigitalCamerasLocators.addToCartButton().click();
    }

    /**
     * Getting product url from search results.
     * @return url
     */
    public String productUrl() {

        return driver.getCurrentUrl();
    }

    public void getCart() {

        amazonBestSellersInDigitalCamerasLocators.cartButton();
    }
}
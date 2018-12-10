package amazonshopping.customers;

import amazonshopping.cart.views.AmazonCartPage;
import amazonshopping.digitalcameras.views.AmazonBestSellersInDigitalCameras;
import amazonshopping.homepage.views.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

/**
 * Class Customer is an Actor who will be performing actions on Amazon page.
 */

public class Customer {

    private WebDriver driver;
    private final String chromeDriverPath = new File("src/main/resources/chromedriver.exe").getAbsolutePath();
    private AmazonHomePage amazonHomePage;
    private AmazonBestSellersInDigitalCameras amazonBestSellersInDigitalCameras;
    private AmazonCartPage amazonCartPage;

    /**
     * Constructor.
     */
    public Customer() {}

    /**
     * Setting up environment for using Chrome driver.
     */
    public void startSession() {

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        amazonHomePage = new AmazonHomePage(driver);
        amazonBestSellersInDigitalCameras = new AmazonBestSellersInDigitalCameras(driver);
        amazonCartPage = new AmazonCartPage(driver);
    }

    /**
     * Cleaning up environment after tests.
     */
    public void quitSession() {

        driver.close();
        driver.quit();
    }

    /**
     * Opening Amazon home page and validation if it succeeded.
     */
    public void goToHomePage() {

        amazonHomePage.openHomePage();
    }

    /**
     * Looking for specified items.
     */
    public void checkBestSellerCameras() {

        this.amazonHomePage.clickOnSearchInputField();
        this.amazonHomePage.setRequestedProduct();
        this.amazonHomePage.lookForDesiredProduct();
    }

    /**
     * Checking details of particular item.
     */
    public void openDetailsForProduct() {

        amazonBestSellersInDigitalCameras.clickOn5thElement();
    }

    /**
     * Adding particular product to cart.
     */
    public void addProductToCart() {

        amazonBestSellersInDigitalCameras.addItemToCart();
    }

    /**
     * Checking that correct products were added.
     */
    public boolean checkProductsInCart() {

        amazonCartPage.productsInCart();
        return amazonBestSellersInDigitalCameras.productUrl() == amazonCartPage.getCartProductUrl();
    }

    /**
     * Checking that summarize price is ok.
     */
    public void checkSubtotalPrice() {

        amazonBestSellersInDigitalCameras.getCart();
        amazonCartPage.getPriceForCartProduct();
        amazonCartPage.summarizePriceForProducts();
    }
}
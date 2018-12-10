package amazonshopping.digitalcameras.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class stores web page elements needed for running tests
 */
public class AmazonBestSellersInDigitalCamerasLocators {

    private WebDriver driver;				    //driver which allows to navigate on a web page
    private By fifthElement;					//5th elemnt in search results
    private By selectQuantityLocator;		    //field which represents requested quantity of product
    private By addToCartButtonLocator;			//button which allows adding products to cart
    private By cartButtonLocator;               //button which reaches cart button

    /**
     * Web element representatives on a page.
     */
    public AmazonBestSellersInDigitalCamerasLocators(WebDriver driver){

        this.driver = driver;
        fifthElement = new By.ByXPath("//*[@id=\"result_4\"]/div/div[2]/div/div[2]/div[1]/div[1]/a");
        selectQuantityLocator = new By.ByXPath("//*[@id=\"quantity\"]/option[8]");
        addToCartButtonLocator = new By.ByXPath("//*[@id=\"add-to-cart-button\"]");
        cartButtonLocator = new By.ByXPath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
    }

    /**
     * Finding 5th product on a page
     */
    public WebElement fifthElement() { return driver.findElement(fifthElement); }

    /**
     * Finding selecting requested quantity button
     */
    public WebElement selectQuantity() { return driver.findElement(selectQuantityLocator); }

    /**
     * Finding "Add to cart" button
     */
    public WebElement addToCartButton() { return driver.findElement(addToCartButtonLocator); }

    /**
     * Finding cart button
     */
    public WebElement cartButton() { return driver.findElement(cartButtonLocator); }
}
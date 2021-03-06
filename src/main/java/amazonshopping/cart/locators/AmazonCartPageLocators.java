package amazonshopping.cart.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonCartPageLocators {

    private WebDriver driver;				    //driver which allows to navigate on a web page
    private By cartButtonLocator;				//button which brings customer to cart
    private By productPriceLocator;             //field that shows product price
    private By subtotalPriceLocator;		    //field that shows subtotal price
    private By productUrlLocator;		        //field which represents product name

    /**
     * Web element representatives on a page.
     */
    public AmazonCartPageLocators(WebDriver driver){

        this.driver = driver;
        cartButtonLocator = new By.ByXPath("//*[@id=\"hlb-view-cart-announce\"]");
        productPriceLocator = new By.ByXPath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[2]/p/span");
        subtotalPriceLocator = new By.ByClassName("//*[@id=\"gutterCartViewForm\"]/div[3]/div/div/div[1]/p/span/span[2]");
        productUrlLocator = new By.ByXPath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a");
    }

    /**
     * Finding 5th product on a page
     */
    public WebElement cartButton() { return driver.findElement(cartButtonLocator); }

    /**
     * Finding quantity button
     */
    public WebElement productPrice() { return driver.findElement(productPriceLocator); }

    /**
     * Finding quantity button
     */
    public WebElement subtotalPrice() { return driver.findElement(subtotalPriceLocator); }

    /**
     * Finding selecting requested quantity button
     */
    public WebElement cartProductUrl() { return driver.findElement(productUrlLocator); }
}
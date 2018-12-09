package amazonshopping.homepage.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class stores web page elements needed for running tests.
 */

public class AmazonHomePageLocators {

    private WebDriver driver;					//driver which allows navigation on web page
    private By searchInputFieldLocator;			//field where customer can type requested item

    /**
     * Web element representatives on a page.
     * @param driver enable performing actions ona page
     */
    public AmazonHomePageLocators(WebDriver driver) {

        this.driver = driver;
        searchInputFieldLocator = new By.ById("twotabsearchtextbox");
    }

    /**
     * Reaching search field.
     */
    public WebElement searchInputField() {

        return  driver.findElement(searchInputFieldLocator); }
}
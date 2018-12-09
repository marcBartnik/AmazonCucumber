package amazontests;

import amazonshopping.customers.Customer;
import org.junit.AfterClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;

/**
 * Class calls all methods from class Customer.
 */
public class StepDefinition {

    private static Customer customer = new Customer();

    @BeforeClass
    public void setUp() {
        customer.startSession();
    }

    /**
     * Cleaning up.
     */
    @AfterClass
    public static void tearDown() {
        customer.quitSession();
    }

    /**
     * Hereby are all implemented steps from scenario.
     */
   /* @Test
    public void customerIsBuyingDigitalCameras() {

        customer.goToHomePage();
        customer.checkBestSellerCameras();
        customer.openDetailsForProduct();
        customer.addProductToCart();
        customer.checkProductsInCart();
        customer.checkSubtotalPrice();
    }*/

    /*Given Customer is on Amazon home page
    When Customer goes into "Best sellers in Digital Cameras"
    When Customer opens details of fifth product
    When Customer adds eight pieces to the shopping cart
    When Customer checks that correct product was added
    Then Customer checks that subtotal price sum is correct*/

    @Given("^Customer is on Amazon home page$")
    public void customerIsOnAmazonHomePage() {
        customer.goToHomePage();
    }

    @When("^Customer goes into \"([^\"]*)\"$")
    public void customerGoesInto() {
        customer.checkBestSellerCameras();
    }

    @When("^Customer opens details of fifth product$")
    public void customerOpensDetailsOfFifthProduct() {
        customer.openDetailsForProduct();
    }

    @When("^Customer adds eight pieces to the shopping cart$")
    public void customerAddsEightPiecesToTheShoppingCart() {
        customer.addProductToCart();
    }

    @When("^Customer checks that correct product was added$")
    public void customerChecksThatCorrectProductWasAdded() {
        customer.checkProductsInCart();
    }

    @Then("^Customer checks that subtotal price sum is correct$")
    public void customerChecksThatSubtotalPriceSumIsCorrect() {
        customer.checkSubtotalPrice();
    }
}
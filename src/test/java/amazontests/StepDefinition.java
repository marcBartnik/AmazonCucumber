package amazontests;

import amazonshopping.customers.Customer;
import org.junit.AfterClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Class calls all methods from class Customer.
 */
public class StepDefinition {

    private static Customer customer = new Customer();

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

    @Given("^Customer is on Amazon home page$")
    public void customerIsOnAmazonHomePage() {
        customer.startSession();
        customer.goToHomePage();
    }

    @When("^Customer goes into \"Best sellers in Digital Cameras\"$")
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
        customer.quitSession();
    }
}
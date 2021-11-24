package com.definitions;

import com.pageObjects.CurrentTempPage;
import com.testBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WeatherShoppingDefinitions extends TestBase {

    CurrentTempPage currentTempPage = new CurrentTempPage(driver);

    @Given("User landed to the weather shopper home page and checks the temperature")
    public void User_landed_to_the_weather_shopper_home_page() {
        currentTempPage.getTemperature();
    }

    @When("user chooses the respective shopping option based on weather and clicks on buy")
    public void user_checks_the_temperature_and_chooses_the_shopping_option() {
        currentTempPage.getTemperature();
    }

    @Then("verify click should redirect to respective moisturizers and sunscreens page")
    public void verify_click_should_redirect_to_moisturizer_page() {
        //Inside method through assert verifying the redirection
        currentTempPage.shopBasedOnTemperature();
    }

    @Given("User added two least expensive product in the card based on requirement")
    public void User_added_two_least_expensive_product_in_the_card_based_on_requirement() {
        currentTempPage.getTemperature();
        currentTempPage.shopBasedOnTemperature();
        currentTempPage.addItemInTheCart();
    }

    @Given("User selects the least expensive moisturizer that contains almond")
    public void user_selects_the_least_expensive_moisturizer_that_contains_almond() {
        currentTempPage.shopBasedOnTemperature();
    }

    @When("user verifies two item should be added in the cart clicks on cart button")
    public void user_verifies_two_item_added_in_the_cart() {
        currentTempPage.verifyCartItem();
    }

    @Then("Verify page should redirect to checkout page successfully")
    public void verify_page_should_redirect_to_checkout() {
        currentTempPage.verifyCheckoutPageRedirection();
    }

    @Given("User landed to the checkout page and verify the items in the cart clicks on Pay with card option")
    public void user_landed_to_the_checkout_page_and_verify_the_items_in_the_cart() {

        currentTempPage.getTemperature();
        currentTempPage.shopBasedOnTemperature();
        currentTempPage.addItemInTheCart();
        currentTempPage.verifyCartItem();
        currentTempPage.verifyCheckoutPageRedirection();
        currentTempPage.verifyCheckoutPageItems();
    }

    @When("user provides all the required payment details clicks on Pay button")
    public void user_provides_all_the_required_payment_details_clicks_on_pay_button() {
        currentTempPage.paymentDetails();
    }

    @Then("Verify payment page once payment done successfully")
    public void verify_payment_page_once_payment_done_successfully() {
        currentTempPage.verifyPaymentPage();
    }

}

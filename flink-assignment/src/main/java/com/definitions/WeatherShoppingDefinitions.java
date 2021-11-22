package com.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherShoppingDefinitions {

    @Given("User landed to the weather shopper website")
    public void Userlandedtotheweathershopperwebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sutapamaji\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://weathershopper.pythonanywhere.com/");
    }

    @When("user checks the temperature")
    public void userChecksTheTemperature() {
    }

    @When("User shop for moisturizers if the weather is below {int} degrees")
    public void user_shop_for_moisturizers_if_the_weather_is_below_degrees(int temp1) {

    }

    @When("Shop for sunscreens if the weather is above {int} degrees")
    public void shop_for_sunscreens_if_the_weather_is_above_degrees(int temp2) {

    }

    @Then("User clicks on Buy moisturizer button")
    public void user_clicks_on_buy_moisturizer_button() {

    }

    @Then("verify click should redirect to moisturizer page")
    public void verify_click_should_redirect_to_moisturizer_page() {

    }

    @Given("User selects the least expensive moisturizer that contains Aloe")
    public void user_selects_the_least_expensive_moisturizer_that_contains_aloe() {

    }

    @Given("User selects the least expensive moisturizer that contains almond")
    public void user_selects_the_least_expensive_moisturizer_that_contains_almond() {

    }

    @When("user verifies two item added in the cart")
    public void user_verifies_two_item_added_in_the_cart() {

    }

    @Then("User clicks on cart button")
    public void user_clicks_on_cart_button() {

    }

    @Then("Verify page should redirect to checkout")
    public void verify_page_should_redirect_to_checkout() {

    }

    @Given("User landed to the payment screen and verify the items in the cart")
    public void user_landed_to_the_payment_screen_and_verify_the_items_in_the_cart() {

    }

    @Given("click on Pay with card option")
    public void click_on_pay_with_card_option() {

    }

    @When("user provides all the required payment details")
    public void user_provides_all_the_required_payment_details() {

    }

    @When("click on Pay button")
    public void click_on_pay_button() {

    }

    @Then("Payment should successfully done")
    public void payment_should_successfully_done() {

    }

}

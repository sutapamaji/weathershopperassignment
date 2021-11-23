package com.definitions;

import com.pageObjects.CurrentTempPage;
import com.testBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.openqa.selenium.By;


public class WeatherShoppingDefinitions extends TestBase {

    Logger LOGGER = LogManager.getLogger(WeatherShoppingDefinitions.class);
    String temperature;

    @Given("User landed to the weather shopper website")
    public void Userlandedtotheweathershopperwebsite() {

        driver.get("https://weathershopper.pythonanywhere.com/");
        temperature = driver.findElement(By.xpath("//span[@id='temperature']")).getText();
        LOGGER.info("Temp in Weather Shopper is " + temperature);

    }

    @When("user checks the temperature and chooses the shopping option")
    public void userchecksthetemperatureandchoosestheshoppingoption() {

        int i = Integer.parseInt(temperature.substring(0,2));
        if (i< 19) {
            LOGGER.info("Temperature is less than 19 Customer shop for moisturizers ");
            driver.findElement(By.xpath("//a[@href='/moisturizer']")).click();
        } else if (i > 34) {
            LOGGER.info("Temperature is greater than 34 Customer shop for sunscreen ");
            driver.findElement(By.xpath("//a[@href='/sunscreen']")).click();
        } else {
            LOGGER.info("Based on temperature Customer don't want to buy anything");
        }
    }

    @When("User shop for moisturizers if the weather is below {int} degrees")
    public void user_shop_for_moisturizers_if_the_weather_is_below_degrees() {

    }

    @When("Shop for sunscreens if the weather is above {int} degrees")
    public void shop_for_sunscreens_if_the_weather_is_above_degrees() {

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

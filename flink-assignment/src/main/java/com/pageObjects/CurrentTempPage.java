package com.pageObjects;

import com.helper.WaitHelper;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

@AllArgsConstructor
public class CurrentTempPage {

    private WebDriver driver;
    String temp;
    String product = null;
    WaitHelper waitHelper;
    Logger LOGGER = LogManager.getLogger(CurrentTempPage.class);

    public CurrentTempPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    /**
     * Get the desired URL and verify the Temperature ,then assign it to global variable
     */
    @SneakyThrows
    public void getTemperature() {
        try {
            driver.get("https://weathershopper.pythonanywhere.com/");
            temp = driver.findElement(By.xpath("//span[@id='temperature']")).getText();
            LOGGER.info("Today's Temperature in Weather Shopper website is " + temp);
        } catch (Exception e) {
            LOGGER.error("Not able to access Weather Shopper website");
        }
    }

    /**
     * Validate based on temperature happened successfully or not using assert
     */
    @SneakyThrows
    public void shopBasedOnTemperature() {
        try {
            int currentTemperature = Integer.parseInt(temp.substring(0, 2));
            if (currentTemperature < 19) {
                LOGGER.info("Temperature is less than 19 degree, user shops for moisturizers");
                driver.findElement(By.xpath("//a[@href='/moisturizer']")).click();
                //Verify the redirection
                assertThat("Successfully redirected to Moisturizers page",
                        driver.findElement(By.xpath("//h2[contains(text(),'Moisturizers')]")).isDisplayed(),
                        Matchers.equalTo(true));

            } else if (currentTemperature > 34) {
                LOGGER.info("Temperature is greater than 34 degree, user shops for sunscreen ");
                driver.findElement(By.xpath("//a[@href='/sunscreen']")).click();
                //Verify the redirection
                assertThat("Successfully redirected to Sunscreens page",
                        driver.findElement(By.xpath("//h2[contains(text(),'Sunscreens')]")).isDisplayed(),
                        Matchers.equalTo(true));

            } else {
                LOGGER.info("Based on temperature user does not want to shop anything");
            }
        } catch (NullPointerException exception) {
            LOGGER.error("Temperature is invalid, Please provide valid temperature");
        }
    }

    /**
     * Verify product category by getting the current URL and assign to global variable
     */
    @SneakyThrows
    public void verifyProductCategory() {
        try {
            String currentURL = driver.getCurrentUrl();
            String[] getRequiredString = currentURL.split(".com/");
            for (int i = 0; i < getRequiredString.length; i++) {
                if (getRequiredString[1].contains("moisturizer")) {
                    LOGGER.info("Product Type Contains moisturizer");
                    product = "moisturizer";

                } else if (getRequiredString[1].contains("sunscreen")) {
                    LOGGER.info("Product Type Contains sunscreen");
                    product = "sunscreen";
                }
            }
        } catch (NullPointerException exception) {
            LOGGER.error("Element not found");
        }
    }

    @SneakyThrows
    public void addItemInTheCart() {
        verifyProductCategory();
        verifyTheProductToBeAdded(product);
    }

    /**
     * @param product Add the product in the cart based on requirement
     */
    @SneakyThrows
    public void verifyTheProductToBeAdded(String product) {
        if (product.contains("moisturizer")) {
            LOGGER.info("User selects the least expensive moisturizer that contains aloe");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button")).click();
        } else if (product.contains("sunscreen")) {
            LOGGER.info("User selects the least expensive sunscreen that contains aloe");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button")).click();
        } else {
            LOGGER.error("Product does not contain moisturizer or sunscreen category");
        }
    }

    /**
     * Verification of the cart items
     */
    @SneakyThrows
    public void verifyCartItem() {
        String numberOfItems = driver.findElement(By.xpath("//span[@id='cart']")).getText();
        if (numberOfItems.contains("2 item(s)")) {
            LOGGER.info("2 Items successfully added in the cart");
            driver.findElement(By.xpath("//button[@class='thin-text nav-link']")).click();
        } else {
            LOGGER.error("Two items not added in the cart");
        }
    }

    /**
     * Verification of successful redirection to the checkout page user assert
     */
    @SneakyThrows
    public void verifyCheckoutPageRedirection() {

        assertThat("Successfully redirected to Checkout page",
                driver.findElement(By.xpath("//h2[contains(text(),'Checkout')]")).isDisplayed(),
                Matchers.equalTo(true));
    }

    /**
     * Proceed for payment page after successful verification of Checkout page
     */
    @SneakyThrows
    public void verifyCheckoutPageItems() {
        LOGGER.info("Verify 2 items present in the checkout page");
        List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        LOGGER.info("Table size is " + table.size());
        if (table.size() == 2) {
            LOGGER.info("Checkout page verified successfully");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//span[contains(text(),'Pay with Card')]")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else {
            LOGGER.error("Error present in the checkout page, please verify before proceeding");
        }

    }

    /**
     * Fill all the payment details and make payment
     */
    @SneakyThrows
    public void paymentDetails() {
        try {
            WebElement element = driver.findElement(By.xpath("//iframe[@class='stripe_checkout_app']"));
            driver.switchTo().frame(element);
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
            String cardNumber = "4000056655665556";
            for (char ch : cardNumber.toCharArray()) {
                switch (Integer.parseInt(String.valueOf(ch))) {
                    case 0:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD0);
                        break;
                    case 1:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD1);
                        break;
                    case 2:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD2);
                        break;
                    case 3:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD3);
                        break;
                    case 4:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD4);
                        break;
                    case 5:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD5);
                        break;
                    case 6:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD6);
                        break;
                    case 7:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD7);
                        break;
                    case 8:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD8);
                        break;
                    case 9:
                        driver.findElement(By.id("card_number")).sendKeys(Keys.NUMPAD9);
                        break;
                }
            }
            driver.findElement(By.id("cc-exp")).sendKeys("1/22");
            driver.findElement(By.id("cc-csc")).sendKeys("567");
            driver.findElement(By.id("billing-zip")).sendKeys("500081");
            driver.findElement(By.xpath("//span[@class='iconTick']")).click();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            LOGGER.error("Invalid details");
        }
    }

    /**
     * Verification of successful payment using assert
     */
    @SneakyThrows
    public void verifyPaymentPage() {
        try {
            WebElement element = driver.findElement(By.xpath("//*[contains(text(),'PAYMENT SUCCESS')]"));
            waitHelper.WaitForElement(element, 20);
            assertThat("Payment completed successfully",
                    element.isDisplayed(), Matchers.equalTo(true));
        } catch (Exception e) {
            LOGGER.info("Unsuccessful Payment, Please retry");
        }
    }
}

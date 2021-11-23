package com.helper;

import com.definitions.WeatherShoppingDefinitions;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    Logger LOGGER = LogManager.getLogger(WeatherShoppingDefinitions.class);

    private WebDriver driver;

    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }

    public void WaitForElement(WebElement element, long timeOutInSeconds){
        LOGGER.info("waiting for element visibilityOf..");
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        LOGGER.info("element is visible..");
    }
}

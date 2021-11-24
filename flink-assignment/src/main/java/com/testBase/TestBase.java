package com.testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.enums.Browsers;
import com.enums.OS;


public class TestBase {

    public static WebDriver driver;

    /**
     * Based on OS (Mac or Windows) and Browser Choice webdriver instance going to initialize
     * @param browser
     * @return
     */

    public WebDriver selectBrowser(String browser) {
        if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                //Chrome should be of version 96
                WebDriverManager.chromedriver().version("96.0.4664.45").setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("--disable-browser-side-navigation");
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        } else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                //Chrome should be of version 96
                WebDriverManager.chromedriver().version("96.0.4664.45").setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("--disable-browser-side-navigation");
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}

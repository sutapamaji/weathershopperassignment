package com.definitions;

import com.enums.Browsers;
import com.testBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class ServiceHooks {
    TestBase testBase;

    @Before
    public void initializeTest() {
        testBase = new TestBase();
        testBase.selectBrowser(Browsers.CHROME.name());
    }

    @After
    public void endTest() {
        TestBase.driver.quit();
    }
}

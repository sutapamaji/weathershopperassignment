package com.definitions;

import com.enums.Browsers;
import com.testBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
    TestBase testBase;

    /**
     * WebDriver instance initialization
     */
    @Before
    public void initializeTest() {
        testBase = new TestBase();
        testBase.selectBrowser(Browsers.FIREFOX.name());
    }

    @After
    public void endTest() {
        TestBase.driver.quit();
    }
}

package com.definitions;

import com.enums.Browsers;
import com.testBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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

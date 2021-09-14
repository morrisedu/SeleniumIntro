package com.cybertek.utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;

    // Setting up all chrome driver dependencies
    @BeforeEach
    public void driverSetup() {
//        WebDriverManager.chromedriver().setup();
//
//        chrome = new ChromeDriver();
//
//        chrome.manage().window().maximize();

        // Using the WebDriverFactory, you can call any driver
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Waits a maximum of 10 seconds for an element to be found before throwing an error
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}

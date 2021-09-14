package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
    WebDriver chrome;

    // Setting up all chrome driver dependencies
    @BeforeEach
    public void driverSetup() {
        WebDriverManager.chromedriver().setup();

        chrome = new ChromeDriver();

        chrome.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser() {
        chrome.quit();
    }
}

package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class BootstrapDropDown_NoSelectTag {
    WebDriver chrome;

    @BeforeAll
    public static void webDriverSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void browserDriver() {
        chrome = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser() {
        chrome.quit();
    }

    @Test
    public void testBootstrapDropDownWithNoSelectTag() {
        /*
            Bootstrap Dropdowns are fancy and do not necessarily have a select tag.
            The styling allows them to look like a select tag even though they are not
            Deal with it like a regular link
         */

        chrome.get("http://practice.cybertekschool.com/dropdown");

        (chrome.findElement(By.linkText("Dropdown link"))).click();

        (chrome.findElement(By.linkText("Google"))).click();

        String currentUrl = chrome.getCurrentUrl();
        String expectedUrl = "https://www.google.com/";

        // assertTrue(currentUrl.equals("https://google.com"));
        assertEquals(currentUrl, expectedUrl);

    }
}

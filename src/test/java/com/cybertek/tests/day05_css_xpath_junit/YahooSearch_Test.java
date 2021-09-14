package com.cybertek.tests.day05_css_xpath_junit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearch_Test {
    WebDriver chrome;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void webDriverSetup() {
        chrome = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser() {
        chrome.quit();
    }

    @Test
    public void testYahooSearchHomePageTitle() {
        chrome.manage().window().maximize();

        chrome.get("https://search.yahoo.com/");

        String expectedPageTitle = "Yahoo Search - Web Search";
        String actualPageTitle = chrome.getTitle();

        // Quit browser
        chrome.quit();

        // Assertions.assertTrue(actualPageTitle.equals(expectedPageTitle));
        assertEquals(expectedPageTitle, actualPageTitle);

    }

    @Test
    public void testYahooSearchPageTitle() {
        /*
            Identify search box
            Enter "selenium"
            Hit enter on the keyboard (submit)
         */
        chrome.manage().window().maximize();

        chrome.get("https://search.yahoo.com/");

        // Identify element on the webpage
        WebElement searchBox = chrome.findElement(By.xpath("//input[@name='p']"));
        searchBox.sendKeys("Selenium" + Keys.ENTER);
        // Keyboard keystrokes can be simulates using Keys.INPUT_OPTION

        String expectedSearchTitle = "Selenium";
        String actualSearchTitle = chrome.getTitle();

        chrome.quit();

        assertTrue(actualSearchTitle.startsWith(expectedSearchTitle));
    }
}

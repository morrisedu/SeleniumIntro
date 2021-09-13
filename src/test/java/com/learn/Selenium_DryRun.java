package com.learn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_DryRun {
    public static void main(String[] args) {
        // Setting up WebDriver

        // System.setProperty("webdriver.chrome.driver", "/home/miro/Insync/eduumorris@outlook.com/OneDrive/cybertek/Dependencies/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        // Chrome driver object to be used
        WebDriver chrome_driver = new ChromeDriver();

        // WebDriver edge_driver = new EdgeDriver(); // Has an error
        // WebDriver firefox_driver = new FirefoxDriver();

        // Basic navigation
        chrome_driver.navigate().to("https://google.com");

        // edge_driver.navigate().to("https://facebook.com"); // Has an error
        // firefox_driver.navigate().to("http://facebook.com");
    }
}

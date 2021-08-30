package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {
    public static void main(String[] args) throws InterruptedException {
        // Setup webdriver instances
        WebDriverManager.chromedriver().setup();
        WebDriver chrome_driver = new ChromeDriver();

        // navigate.to(url)
        // driver.get(url)
        /*
        This is the shorter version of the previous
        navigate.to(url)
         */
        chrome_driver.get("https://google.com");

        // navigate.back()

        Thread.sleep(3000);
        chrome_driver.navigate().back();

        // navigate.forward()
        Thread.sleep(3000);
        chrome_driver.navigate().forward();

        // navigate.refresh()
        chrome_driver.navigate().refresh();
    }
}

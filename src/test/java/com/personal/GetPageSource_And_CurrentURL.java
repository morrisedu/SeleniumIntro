package com.personal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource_And_CurrentURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("file:///home/miro/Desktop/TemplateWebsites/veggie/index.html");

        // Get current URL
        System.out.println("chrome.getCurrentUrl() = " + chrome.getCurrentUrl());

        // Get page source
        System.out.println("chrome.getPageSource() = " + chrome.getPageSource());

        chrome.quit();
    }
}

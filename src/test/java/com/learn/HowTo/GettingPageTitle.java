package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("file:///home/miro/Desktop/TemplateWebsites/veggie/index.html");

        String currentPageTitle = chrome.getTitle();

        System.out.println(currentPageTitle);

        chrome.quit();
    }
}

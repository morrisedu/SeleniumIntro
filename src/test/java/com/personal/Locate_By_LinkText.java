package com.personal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locate_By_LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("file:///home/miro/Desktop/TemplateWebsites/veggie/index.html");

        // Locating a link by the text to be clicked
        WebElement aboutLink = chrome.findElement(By.linkText("About"));

        aboutLink.click();

        Thread.sleep(5000);
        chrome.quit();
    }
}

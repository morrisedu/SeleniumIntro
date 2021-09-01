package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_By_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://etsy.com");

        WebElement giftLink = chrome.findElement(By.partialLinkText("Trust and"));
        giftLink.click();

        Thread.sleep(5000);

        chrome.quit();
    }
}

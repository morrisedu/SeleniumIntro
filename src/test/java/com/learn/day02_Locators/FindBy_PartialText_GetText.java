package com.learn.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBy_PartialText_GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com");

        // Identify the link using partial link text then get the full text using the new method getText()

        WebElement myLink = chrome.findElement(By.partialLinkText("A"));
        System.out.println(myLink.getText());

        chrome.quit();
    }
}

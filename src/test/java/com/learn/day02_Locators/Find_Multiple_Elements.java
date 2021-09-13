package com.learn.day02_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Find_Multiple_Elements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com");

        // Get all elements that have partial text 'A'
        List<WebElement> allLinks = chrome.findElements(By.partialLinkText("A"));

        System.out.println("allLinks.size() = " + allLinks.size());

//        WebElement firstItem = allLinks.get(1);
//        System.out.println("firstItem.getText() = " + firstItem.getText());

        for (WebElement allLink : allLinks) {
            
        }

        // System.out.println("allLinks = " + allLinks);

        chrome.quit();
    }
}

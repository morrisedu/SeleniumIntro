package com.learn.FindElementBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tagname {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com");

        // Identify and save the first element with <a> tag
        WebElement firstLink = chrome.findElement(By.tagName("a"));

        // print out the text
        System.out.println("firstLink.getText() = " + firstLink.getText());

        // Identify and save elements with <a> tag
        List<WebElement> allLinks = chrome.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        // Iterate the list and get the text of all links
        int count = 1;

        for (WebElement allLink : allLinks) {
            System.out.println("allLink.getText(" + count + ") = " + allLink.getText());
            count++;
        }

        // click on the link

        chrome.quit();
    }
}

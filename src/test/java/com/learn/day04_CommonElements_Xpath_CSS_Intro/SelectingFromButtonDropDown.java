package com.learn.day04_CommonElements_Xpath_CSS_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromButtonDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com/dropdown");

        // Identify language multiselect dropdown
        WebElement buttonDropDown = chrome.findElement(By.id("dropdownMenuLink"));
        buttonDropDown.click();

        // Identify elements that are possbily just links
        WebElement googleLink = chrome.findElement(By.linkText("Google"));
        googleLink.click();

        Thread.sleep(5000);

        chrome.quit();
    }
}

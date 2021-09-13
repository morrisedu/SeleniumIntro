package com.learn.day04_CommonElements_Xpath_CSS_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxes_HowTo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com/dropdown");

        // Identify first dropdown
        WebElement yearDropDownElm = chrome.findElement(By.id("year"));

        // Wrap it up using a Select class so that we can use Select class methods that are easy
        Select yearDropDownObj = new Select(yearDropDownElm);

        // Selecting elements in the drop down. 3 ways:
        // Select by index
        yearDropDownObj.selectByIndex(9);

        // Select by value attribute
        yearDropDownObj.selectByValue("2019");

        // Select by visible text
        yearDropDownObj.selectByVisibleText("1990");

        WebElement monthDropDownElm = chrome.findElement(By.id("month"));
        Select monthSelectObj = new Select(monthDropDownElm);

        monthSelectObj.selectByIndex(4);
        monthSelectObj.selectByValue("7");
        monthSelectObj.selectByVisibleText("December");



        chrome.quit();
    }
}

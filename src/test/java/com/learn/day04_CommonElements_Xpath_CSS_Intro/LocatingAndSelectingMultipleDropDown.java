package com.learn.day04_CommonElements_Xpath_CSS_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingAndSelectingMultipleDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com/dropdown");

        // Identify language multiselect dropdown
        WebElement langDropDown = chrome.findElement(By.name("Languages"));
        Select langDropDownObj = new Select(langDropDown);

        langDropDownObj.selectByIndex(2);
        langDropDownObj.selectByVisibleText("Java");
        langDropDownObj.selectByValue("c");

        // With multiple select dropdowns, You can also deselect
        langDropDownObj.deselectByIndex(2);
        langDropDownObj.deselectByVisibleText("Java");
        langDropDownObj.deselectByValue("c");

        chrome.quit();
    }
}

package com.learn.day04_CommonElements_Xpath_CSS_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_HowTo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://search.yahoo.com/");

        // Identify search box using CSS Selector
        // WebElement searchBox = chrome.findElement(By.cssSelector("#yschsp")); // With the id of the element
        // WebElement searchBox = chrome.findElement(By.cssSelector("input[id='yschsp']")); // Also uses the id
       //  WebElement searchBox = chrome.findElement(By.cssSelector("input[name='p']")); // Using a combination of some attributes

        WebElement searchBox = chrome.findElement(By.cssSelector("input[name='p'][type='text']"));

        searchBox.sendKeys("CSS Selector");

//        WebElement cancelButton = chrome.findElement(By.cssSelector("button#sbq-clear>span"));
//        cancelButton.click();

        WebElement commitSearch = chrome.findElement(By.cssSelector("span[title='Search']"));
        commitSearch.click();


        chrome.quit();
    }
}

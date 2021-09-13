package com.learn.FindElementBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com");

        // identify the span element with class name "h1y"
        WebElement elm = chrome.findElement(By.className("h1y"));
        System.out.println("elm.getText() = " + elm.getText());

        // Identify first element in unordered list using class name
        System.out.println("==============");
        WebElement firstElm = chrome.findElement(By.className("list-group-item"));
        System.out.println("firstElm.getText() = " + firstElm.getText());
        System.out.println("==============");
        List<WebElement> allLis = chrome.findElements(By.className("list-group-item"));
        System.out.println("allLis.size() = " + allLis.size());
        System.out.println("==============");

        chrome.quit();
    }
}

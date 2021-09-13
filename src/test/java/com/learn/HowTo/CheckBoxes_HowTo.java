package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_HowTo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com/checkboxes");

        // Checkbox 1
        WebElement checkbox1 = chrome.findElement(By.id("box1"));
        System.out.println("Before clicking checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After clicking checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("=========");

        // Checkbox 2
        WebElement checkbox2 = chrome.findElement(By.id("box2"));
        System.out.println("Before click checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After click checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));
        System.out.println("========");

        chrome.quit();
    }
}

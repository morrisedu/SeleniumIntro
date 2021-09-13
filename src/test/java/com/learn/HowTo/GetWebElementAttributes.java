package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebElementAttributes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://ultimateqa.com/complicated-page");

        WebElement aButton = chrome.findElement(By.name("et_builder_submit_button"));

        // Get tag name of the element
        System.out.println("aButton.getTagName() = " + aButton.getTagName());

        // Get text in an element
        System.out.println("aButton.getText() = " + aButton.getText());

        // Get value attribute of the element
        // System.out.println("aButton.getAttribute(\"value\") = " + aButton.getAttribute("value"));

        WebElement anInput = chrome.findElement(By.name("et_pb_contact_captcha_1"));
        System.out.println("anInput.getAttribute(\"class\") = " + anInput.getAttribute("class"));


        // Identify and save the search button element

        // Get tag name of the element, get class attribute
        // Click on a button

        //

        chrome.quit();
    }
}

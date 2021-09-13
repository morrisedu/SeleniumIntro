package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_HowTo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = chrome.findElement(By.cssSelector("#blue"));

        if (!blueRadioButton.isSelected()) {
            System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
            blueRadioButton.click();
        }

        WebElement redRadioButton = chrome.findElement(By.cssSelector("#red"));

        if (!redRadioButton.isSelected()) {
            System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());
            redRadioButton.click();
            System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());
            System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        }

        chrome.quit();
    }
}

package com.learn.day04_CommonElements_Xpath_CSS_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_HowTo_intro {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://practice.cybertekschool.com/");

        WebElement headerSpan = chrome.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        WebElement headerSpan2 = chrome.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        /*
            Providing attributes in XPath

            elementtag[@]

            You can provide index of an element:
                //elementtag[index]

            Use text of an element:
                //elementtag[text()='test value']
                    e.g. //h3[text()='Checkboxes']
         */

        chrome.findElement(By.xpath("//h3[text()='Checkboxes']")).click();

        chrome.quit();
    }
}

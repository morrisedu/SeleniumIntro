package com.personal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_By_Name {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("file:///home/miro/Desktop/TemplateWebsites/veggie/index.html");

        /*
        The following identifies elements by the name
         */

        WebElement searchBox = chrome.findElement(By.name("send-form"));
        System.out.println(searchBox.getLocation());

    }
}

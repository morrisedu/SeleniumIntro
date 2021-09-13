package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindow {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://google.com");

        // Maximize brwoser window


        //chrome.manage().window().maximize();

        // Make window full screen
        //chrome.manage().window().fullscreen();

        // Set window position (Offset, left & top)
        //chrome.manage().window().setPosition(new Point(200, 300));

        System.out.println("chrome.manage().window().getPosition() = " + chrome.manage().window().getPosition());

        // Set dimension
        chrome.manage().window().setSize(new Dimension(300, 200));

        // Get window dimension
        System.out.println("chrome.manage().window().getSize() = " + chrome.manage().window().getSize());

        chrome.quit();


        chrome.manage().window().maximize();

        // Make window full screen
        chrome.manage().window().fullscreen();

        // Set window position (Offset, left & top)
        chrome.manage().window().setPosition(new Point(200, 300));


        System.out.println("The End");
    }
}

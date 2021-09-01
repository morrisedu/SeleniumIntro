package com.nextbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Function {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://login.nextbasecrm.com/stream/");

        // To login to the application

        WebElement emailInput  = chrome.findElement(By.name("USER_LOGIN"));
        emailInput.sendKeys("hr27@cybertekschool.com");

        WebElement passwordInput = chrome.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("UserUser");
        
        WebElement sendLogin = chrome.findElement(By.className("login-btn"));
        sendLogin.click();

        // Assert login
        WebElement userEmail = chrome.findElement(By.id("user-name"));
        String expectedEmail = userEmail.getText();

        boolean emailIsOkay = expectedEmail.equals("hr27@cybertekschool.com") ? true : false;

        chrome.quit();

        System.out.println(emailIsOkay ? "pass" : "fail");
    }
}

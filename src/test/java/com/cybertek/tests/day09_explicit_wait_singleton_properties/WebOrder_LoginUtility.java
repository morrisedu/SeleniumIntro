package com.cybertek.tests.day09_explicit_wait_singleton_properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrder_LoginUtility {
    public static void login(WebDriver driver) {
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // Enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        // Login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(WebDriver driver, String username, String password) {
        // Enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);

        // Enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);

        // Login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void logout(WebDriver driver) {
        driver.findElement(By.id("ctl00_logout")).click();
    }

    public static boolean isAtOrderPage(WebDriver driver) {
        boolean result = false;

        try {
            WebElement header = driver.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            // System.out.println("Element was identified");
            result = true;
        } catch (NoSuchElementException e) {
            // System.out.println("Element was not found");
            e.printStackTrace();
        }

        return result;
    }
}

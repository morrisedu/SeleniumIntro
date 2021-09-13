package com.swaglab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/*
    This is a positive test
 */

public class FirstPracticeTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://saucedemo.com"); // Navigate to the testing home page

        chrome.manage().window().maximize(); // Maximize window page

        // Get the title page
        String pageTitle = chrome.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        // Get username & password input boxes
        WebElement userNameInput = chrome.findElement(By.id("user-name"));
        userNameInput.sendKeys("standard_user");

        WebElement passwordInput = chrome.findElement(By.id("password"));
        passwordInput.sendKeys("secret_sauce");

        // Login button
        WebElement loginButton = chrome.findElement(By.id("login-button"));
        loginButton.submit();

        // Thread.sleep(10000);

        // inventory_item_name, inventory_item_price

        /*
            This is getting the first item name and the price

            Use link text, id, or name to identify the name. This however isn't dynamic
            WebElement firstProductName = chrome.findElement(By.linkText("Sauce Labs Backpack"));

            I'll use the class name since the products are dynamic and will eventually change. The class name used for
            styling, however, might not
         */

        String firstProductName = chrome.findElement(By.className("inventory_item_name")).getText();
        String firstProductPrice = chrome.findElement(By.className("inventory_item_price")).getText();

        System.out.println("First product is: "  + firstProductName + " and it's price = " + firstProductPrice);

        System.out.println("=============");

        // Get titles of all current products
        List<WebElement> allProductNames = chrome.findElements(By.className("inventory_item_name"));

        List<WebElement> allProductPrices = chrome.findElements(By.className("inventory_item_price"));

        Hashtable<String, String> products = new Hashtable<String, String>();

        for (int i = 0; i < allProductNames.size(); i++) {
            String productName = allProductNames.get(i).getText();
            String productPrice = allProductPrices.get(i).getText();

            products.put(productName, productPrice);
        }

        // Add product to cart. This part will need to be maintained to cope with changes of the website
        WebElement addProduct = chrome.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addProduct.click();

        // Open the cart
        WebElement cartButton = chrome.findElement(By.id("shopping_cart_container"));
        cartButton.click();

        // Verify element was added
//        WebElement verifyAddedProduct = chrome.findElement(By.className("inventory_item_name"));

//        if (verifyAddedProduct.getText().equals("Sauce Labs Backpack")) {
//            System.out.println("Test passed");
//        } else {
//            System.out.println("Test Failed");
//        }

        WebElement continueShoppingButton = chrome.findElement(By.id("continue-shopping"));
        continueShoppingButton.click();

        chrome.quit();
    }
}

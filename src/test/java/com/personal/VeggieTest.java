package com.personal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeggieTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        chrome.get("file:///home/miro/Desktop/veggie/index.html");

        // Get element on page
        /*
            Locate something using the id:
            in this case, the main nav.
         */

        WebElement nameBox = chrome.findElement(By.id("name_send"));
        WebElement emailBox = chrome.findElement(By.id("email_send"));
        WebElement messageBox = chrome.findElement(By.id("message_send"));

        // Enter text inside inputbox element using sendKey("Text to enter")
        nameBox.sendKeys("TestName");
        emailBox.sendKeys("testemail@email.com");
        messageBox.sendKeys("This is the message that we are going to send out. But this is a test message");

        WebElement inputButton = chrome.findElement(By.id("form_sender"));
        Thread.sleep(3000);
        // inputButton.click();
        inputButton.submit();

        chrome.quit();
    }
}

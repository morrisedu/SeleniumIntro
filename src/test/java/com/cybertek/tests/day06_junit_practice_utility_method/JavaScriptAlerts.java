package com.cybertek.tests.day06_junit_practice_utility_method;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class JavaScriptAlerts extends TestBase {
    public static void getUrl() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void testJavascriptAlert() {
        getUrl();

        // Regular alert
        driver.findElement(By.xpath("//*[@id='content']/div/button[1]")).click();

        // Switch to the alert box using the following method
        // driver.switchTo().alert().accept();

        Alert alertObj = driver.switchTo().alert();
        System.out.println("alertObj.getText() = " + alertObj.getText());
        alertObj.accept();
    }

    @Test
    public void testJavascriptConfirmAlert() throws InterruptedException {
        getUrl();

        // Confirm alert
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        // driver.switchTo().alert().dismiss(); // This will dismiss the alert box
        driver.switchTo().alert().accept(); // This will accept the alert box
        Thread.sleep(3000);
    }

    @Test
    public void testJavascriptPromptAlert() throws InterruptedException {
        getUrl();

        // Prompt alert
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Alert alertObj2 = driver.switchTo().alert();
        alertObj2.sendKeys("Hello"); // Enter some text
        Thread.sleep(2000);
        alertObj2.accept(); // Accept
        Thread.sleep(2000);
    }
}

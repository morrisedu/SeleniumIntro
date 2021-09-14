package com.cybertek.tests.day06_junit_practice_utility_method;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SlowElementTest extends TestBase {
    @Test
    public void testWait() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[. = 'Remove']")).click();

        // Thread.sleep(5000); // This can be replaced by implicit wait

        WebElement itsGoneElm = driver.findElement(By.id("message"));

        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
        System.out.println("\"THE END\" = " + "THE END");
    }
}

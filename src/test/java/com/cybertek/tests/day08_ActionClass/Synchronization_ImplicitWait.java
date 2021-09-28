package com.cybertek.tests.day08_ActionClass;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Synchronization_ImplicitWait extends TestBase {
    @Test
    public void testImplicitWait() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement remove_button = driver.findElement(By.xpath("//button[text()='Remove']"));

        remove_button.click();

        WebElement its_gone_elm = driver.findElement(By.id("message"));


        assertTrue(its_gone_elm.isDisplayed());
        assertEquals("It's gone!", its_gone_elm.getText());

        // WebElement enable_button = driver.findElement(By.xpath())
    }
}

package com.cybertek.tests.day07_iframes;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe_Intro extends TestBase {
    @Test
    public void testIframeIntro() {
        driver.get("http://practice.cybertekschool.com/iframe");

        // Switch to iFrame
        // driver.switchTo().frame(0); // Using index
        // driver.switchTo().frame("mce_0_ifr"); // Using id or name

        // Using WebElement
        WebElement iFrame = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iFrame);

        // Locate <p> element inside the iframe
        WebElement pTagInsideIframe = driver.findElement(By.tagName("p"));

        System.out.println("pTagInsideIframe = " + pTagInsideIframe.getText());

        // Switching out of iframe
        driver.switchTo().parentFrame(); // Will switch one level up

        // driver.switchTo().defaultContent(); // This will switch to top level HTML


        driver.findElement(By.linkText("Home")).click();
    }
}

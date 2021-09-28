package com.learn.HowTo;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static com.cybertek.utilities.BrowserUtil.waitFor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecuteJavaScriptCode extends TestBase {
    @Test
    public void testJavaScriptScroll() {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        // Cast driver to JavascriptExecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // Scroll page using JavaScript
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0, 1000)");
            waitFor(1);
        }
    }

    @Test
    public void test_ScrollElementIntoView() {
        driver.get("http://practice.cybertekschool.com/large");

        WebElement school_link = driver.findElement(By.linkText("Cybertek School"));
        WebElement home_link = driver.findElement(By.linkText("Home"));

        // Cast driver to JavascriptExecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // Execute JavaScript
        jse.executeScript("arguments[0].scrollIntoView(true)", school_link);
        waitFor(3);
        jse.executeScript("arguments[0].scrollIntoView(true)", home_link);
        waitFor(3);
    }

    @Test
    public void testOpenNewTabAndNavigateToAUrl() {
        driver.get("http://practice.cybertekschool.com");
        waitFor(2);

        // Cast driver to JavascriptExecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // Execute JavaScript
        jse.executeScript("window.open('https://google.com', '_blank')");
        waitFor(2);

        // Switch to new tab
        Set<String> all_tabs = driver.getWindowHandles();

        for (String tab : all_tabs) {
            driver.switchTo().window(tab);
        }

        assertEquals("Google", driver.getTitle());

        // Switch to the new tab

    }
}

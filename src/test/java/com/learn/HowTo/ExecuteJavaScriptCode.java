package com.learn.HowTo;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import static com.cybertek.utilities.BrowserUtil.waitFor;

public class ExecuteJavaScriptCode extends TestBase {
    @Test
    public void testJavaScriptScroll() {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        // Cast driver to Javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // Scroll page using JavaScript
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0, 1000)");
            waitFor(1);
        }
    }
}

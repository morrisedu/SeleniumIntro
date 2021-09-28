package com.cybertek.tests.day09_explicit_wait_singleton_properties;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest extends TestBase {
    @Test
    public void testExplicitWait() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, 7);

        // wait.until()
    }
}

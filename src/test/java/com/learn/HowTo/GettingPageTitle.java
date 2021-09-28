package com.learn.HowTo;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GettingPageTitle extends TestBase {
    @Test
    public void test_GetPageTitle() {
        driver.get("https://google.com");

        String currentPageTitle = driver.getTitle();

        assertEquals("Google", currentPageTitle);
    }
}

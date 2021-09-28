package com.learn.HowTo;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class SwitchWindowsAndTabs extends TestBase {
    @Test
    public void testTabSwitching() {
        driver.get("http://practice.cybertekschool.com/windows");

        // Get current window handle
        String current_handle = driver.getWindowHandle();
        System.out.println("current_handle = " + current_handle);

        // Get all handles
        Set<String> all_handles = driver.getWindowHandles();
        System.out.println("all_handles = " + all_handles);

        // Get element to open new tab
        WebElement new_tab = driver.findElement(By.linkText("Click Here"));
        new_tab.click();

        System.out.println("After clicking once driver.getWindowHandles() = " + driver.getWindowHandle());
        System.out.println("After clicking once driver.getWindowHandles() = " + driver.getWindowHandles());
    }
}

package com.cybertek.tests.day09_explicit_wait_singleton_properties;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.cybertek.utilities.BrowserUtil.waitFor;
import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ExplicitWait extends TestBase {
    @Test
    public void testExplicitWait() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, 7);

        // wait.until()
    }

    @Test
    public void test_WaitForExpectedTitle() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        driver.findElement(By.partialLinkText("Example 7:")).click();

        WebDriverWait wait = new WebDriverWait(driver, 6);

        wait.until(titleIs("Dynamic title"));

        WebElement successmsg = driver.findElement(By.id("alert"));

        assertTrue(successmsg.isDisplayed());
    }

    @Test
    public void test_WaitForElementToBeClickable() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input[type='text']"));
        driver.findElement(By.xpath("//*[@id='input-example']/button")).click();

        // Initialize wait object from the WebDriverWait class
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Wait for condition to be met
        wait.until(elementToBeClickable(inputbox));
        // wait.until(presenceOfAllElementsLocatedBy(By.id("message")));

        inputbox.sendKeys("It is now clickable");

        waitFor(3);
    }

    @Test
    public void test_WaitForElementVisibility() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        driver.findElement(By.partialLinkText("Example 1:")).click();

        driver.findElement(By.cssSelector("div#start > button")).click();

        // Wait for elements to show up
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World!']")));
        wait.until(invisibilityOfElementLocated(By.id("loading")));

        driver.findElement(By.id("username")).sendKeys("Wait Successful");

        waitFor(3);

        assertEquals("Wait Successful", driver.findElement(By.id("username")).getAttribute("value"));
        assertFalse(driver.findElement(By.id("loading")).isDisplayed());
    }
}

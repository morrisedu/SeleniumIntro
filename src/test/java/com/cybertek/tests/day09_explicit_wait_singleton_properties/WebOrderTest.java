package com.cybertek.tests.day09_explicit_wait_singleton_properties;

import com.cybertek.utilities.BrowserUtil;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderTest extends TestBase {
    @BeforeEach
    public void opeUrl() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }

    @Test
    public void testLogin() {
        WebOrder_LoginUtility.login(driver, "Tester", "test");

        assertTrue(WebOrder_LoginUtility.isAtOrderPage(driver));
        assertEquals("List of All Orders", driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[2]/div[2]/h2")).getText().strip());
    }

    @Test
    public void testLoginFails() {
        WebOrder_LoginUtility.login(driver, "", "12345");

        WebElement login_error = driver.findElement(By.id("ctl00_MainContent_status"));

        assertTrue(login_error.isDisplayed());
        assertEquals("Invalid Login or Password.", login_error.getText());
    }

    @Test
    public void testLogout() {
        String login_title_before_login = driver.getTitle();

        WebOrder_LoginUtility.login(driver, "Tester", "test");

        BrowserUtil.waitFor(3);

        WebOrder_LoginUtility.logout(driver);
        String login_title_after_logout = driver.getTitle();

        assertEquals(login_title_before_login, login_title_after_logout);
        // assertTrue(WebOrder_LoginUtility.isAtOrderPage(driver)); // This should fail
    }
}

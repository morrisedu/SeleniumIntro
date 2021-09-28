package com.cybertek.tests.day10_driver_method_practice_properties;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.cybertek.utilities.ConfigReader.read;

public class SeleniumWithPropertiesTest extends TestBase {
    @Test
    public void testWebOrderLogin() {
        // Get values from properties file
        String web_order_url = read("weborder_url");
        String username = read("weborder_username");
        String password = read("weborder_password");

        // Navigate using value read from properties file
        driver.get(web_order_url);

        // enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        driver.findElement(By.id("ctl00_MainContent_password")) .sendKeys(password);
        // click login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();


    }
}

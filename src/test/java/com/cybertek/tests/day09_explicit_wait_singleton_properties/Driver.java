package com.cybertek.tests.day09_explicit_wait_singleton_properties;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            System.out.println("Driver created");
            driver = WebDriverFactory.getDriver("chrome");
        }

        System.out.println("Driver already exists");
        return driver;
    }
}

package com.cybertek.tests.day09_explicit_wait_singleton_properties;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Singleton_Test {

    @Test
    public void testDriverSingletonUtility() {
        WebDriver driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com");
    }

    @Test
    public void testSingleton() {
//        Singleton s1 = new Singleton();
//        s1.word = "abc";
//
//        Singleton s2 = new Singleton();
//        s1.word = "afg";
    }
}

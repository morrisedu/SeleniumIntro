package com.cybertek.tests.day06_junit_practice_utility_method;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class WebTables extends TestBase {
    public static void getUrl() {
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @Test
    public void testWebTables1() {

    }
}

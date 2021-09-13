package com.cybertek.tests.day05_css_xpath_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    /*
        Test method is annotated with @Test annotation
        It is a void method with no param. It may take some parameters if needed.
     */
    @Test
    public void testAddition() {
        int num1 = 10;
        int num2 = 20;
        int expected_result = 30;

        Assertions.assertEquals(expected_result, num1 + num2);
    }

    @Test
    public void testString() {
        String msg = "I love Python";

        // check whether it is equal

        // Assert equals takes 2 parameters:
        Assertions.assertEquals("I love Selenium", msg);

        // assertTrue takes one parameter that should be boolean
        Assertions.assertTrue(msg.startsWith("I love"));
    }

}

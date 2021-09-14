package com.cybertek.tests.day05_css_xpath_junit;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationDemo {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Run's before all tests");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Run's after each. Should be seen multiple times after test");
    }

    @Test
    public void test1() {
        System.out.println("Running the test");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Run's before each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Run's after all test's have run");
    }

    @Test
    public void test2() {
        System.out.println("Running the second test");
    }
}

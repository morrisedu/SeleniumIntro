package com.learn.HowTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CssSelectors {
    WebDriver chrome;

    @BeforeAll
    public static void webDriverSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void browserDriver() {
        chrome = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser() {
        chrome.quit();
    }

    @Test
    public void testCssSelecting() throws InterruptedException {
        chrome.get("http://practice.cybertekschool.com/registration_form");

        // First Name
        String firstName = "Jolyn";
        (chrome.findElement(By.cssSelector("input[name = 'firstname']"))).sendKeys(firstName);

        // Last Name
        String lastName = "Jessalyn";
        (chrome.findElement(By.cssSelector("input[name = 'lastname']"))).sendKeys(lastName);

        // Username
        String userName = firstName + lastName;
        (chrome.findElement(By.cssSelector("input[name = 'username']"))).sendKeys(userName);

        // Email
        String email = (firstName + lastName + "@email.com").toLowerCase();
        (chrome.findElement(By.cssSelector("input[name = 'email']"))).sendKeys("jolyn@email.com");

        // Password
        String pwd = "be7275f3-3725-4986-a51c-5524e66324ed";
        (chrome.findElement(By.cssSelector("input[name = 'password']"))).sendKeys(pwd);

        // Phone Number
        String phoneNumber = "108-009-5786";
        (chrome.findElement(By.cssSelector("input[name = 'phone']"))).sendKeys(phoneNumber);

        // Gender
        WebElement genderRadio = chrome.findElement(By.cssSelector("input[name = 'gender'][type='radio'][value='female']"));

        if (!genderRadio.isSelected()) {
            genderRadio.click();
        } // Select female gender

        // Date of birth
        String dateOfBirth = "09/23/1999";
        (chrome.findElement(By.cssSelector("input[name = 'birthday']"))).sendKeys(dateOfBirth);

        // Depart Office
        Select departmentOfficeSelect = new Select(chrome.findElement(By.cssSelector("select[name = 'department']")));

        departmentOfficeSelect.selectByVisibleText("Department of Engineering");

        // Job Title
        Select jobTitleSelect = new Select(chrome.findElement(By.cssSelector("select[name = 'job_title']")));
        jobTitleSelect.selectByVisibleText("SDET");

        //  Programming languages

        WebElement cPlusPlus = chrome.findElement(By.cssSelector("input[type='checkbox'][value='cplusplus']"));

        if (!cPlusPlus.isSelected()) {
            cPlusPlus.click();
        }

        WebElement javaScript = chrome.findElement(By.cssSelector("input[type='checkbox'][value='javascript']"));

        if (!javaScript.isSelected()) {
            javaScript.click();
        }

        // Submit & Wait
        (chrome.findElement(By.cssSelector("button[type = 'submit'][id = 'wooden_spoon']"))).click();

        Thread.sleep(10000);

        assertTrue(chrome.findElement(By.xpath("//div/h4")).getText().equals("Well done!"));
        assertTrue(chrome.findElement(By.xpath("//div/p")).getText().equals("You've successfully completed registration!"));

        // Quit chrome
        chrome.quit();

    }
}

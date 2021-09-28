package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cybertek.utilities.ConfigReader.confRead;

public class WLoginPage {
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username_field;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement password_field;
    
    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement login_btn;

    /**
     * The constructor below instructs Selenium to start looking for defined elements when called
     */
    public WLoginPage() {
        /*
            PageFactor is a Selenium class that supports Page Object Model
                -   It has a method called initElements that once called, will locate all elements specified by @FinBy annotation
                -   initElements accepts 2 arguments, WebDriver instance & Page class instance (this), which is the current instance of the class
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * goTo method, navigates to login page
     * @noparam
     * Uses config.properties file
     */
    public void goTo() {
        Driver.getDriver().navigate().to(confRead("weborder_url"));
    }

    /**
     * Login method to login to page
     * @param username username
     * @param password password
     */
    public void login(String username, String password) {

    }
}

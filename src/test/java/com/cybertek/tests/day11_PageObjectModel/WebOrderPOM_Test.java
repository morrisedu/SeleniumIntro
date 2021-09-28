package com.cybertek.tests.day11_PageObjectModel;

import com.cybertek.pages.WLoginPage;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;

import static com.cybertek.utilities.BrowserUtil.waitFor;
import static com.cybertek.utilities.ConfigReader.confRead;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderPOM_Test extends TestBase {
    WLoginPage loginPage = new WLoginPage();

    @Test
    public void test_LoginUtilizingPOM() {
        loginPage.goTo();

//        loginPage.username_field.sendKeys(confRead("weborder_username"));
//        loginPage.password_field.sendKeys(confRead("weborder_password"));
//        loginPage.login_btn.click();

        loginPage.login(confRead("weborder_username"), confRead("weborder_password"));

        waitFor(4);

        assertEquals("Web Orders", driver.getTitle());
    }

    @Test
    public void test_WrongLoginCredentials() {
        loginPage.goTo();

        loginPage.login("test", "test");
        waitFor(5);

        assertTrue(loginPage.loginError());
    }
}

package com.cybertek.tests.day11_PageObjectModel;

import com.cybertek.pages.WLoginPage;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;

import static com.cybertek.utilities.BrowserUtil.waitFor;
import static com.cybertek.utilities.ConfigReader.confRead;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebOrderPOM_Test extends TestBase {
    @Test
    public void test_LoginUtilizingPOM() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        WLoginPage loginPage = new WLoginPage();

        loginPage.username_field.sendKeys(confRead("weborder_username"));
        loginPage.password_field.sendKeys(confRead("weborder_password"));
        loginPage.login_btn.click();
        waitFor(4);

        assertEquals("Web Orders", driver.getTitle());
    }
}

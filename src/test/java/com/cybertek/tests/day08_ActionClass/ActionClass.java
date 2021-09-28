package com.cybertek.tests.day08_ActionClass;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.cybertek.utilities.BrowserUtil.waitFor;
import static org.junit.jupiter.api.Assertions.*;

/*
    Action Class in Selenium is a built-in feature that handles keyboard and mouse events such as holding down keys and right clicking
 */

// Reference https://selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html

public class ActionClass extends TestBase {
    /*
        Hover
        Drag & drop
     */

    @Test
    public void testHoverAction() {


        driver.get("http://practice.cybertekschool.com/hovers");

        Actions actions = new Actions(driver);

        // Hover
        WebElement first_image = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        WebElement first_image_text = driver.findElement(By.xpath("//h5[.='name: user1']"));

        assertFalse(first_image_text.isDisplayed());

        actions.moveToElement(first_image).pause(3000).perform();

        assertTrue(first_image_text.isDisplayed());

    }

    @Test
    public void testDragAndDrop() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement small_circle = driver.findElement(By.id("draggable"));
        WebElement big_circle = driver.findElement(By.id("droptarget"));

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        waitFor(5);

        String big_circle_text = big_circle.getText();

        Actions actions = new Actions(driver);

        actions.dragAndDrop(small_circle, big_circle).perform();

        // actions.moveToElement(small_circle).clickAndHold().moveToElement(big_circle).release().perform();

        waitFor(5);

        assertEquals("You did great!", big_circle.getText());

    }

    @Test
    public void testKeyboardActions() {
        driver.get("https://google.com");

        WebElement search_box = driver.findElement(By.name("q"));

        // Click on the element
        // Hold down shift, eneter keys, realease shift, enter keys
        // Select all text (CTRL + A)
        // Delete text (DEL/Backsapce)
        Actions actions = new Actions(driver);

        actions.click(search_box).keyDown(Keys.SHIFT).sendKeys("Selenium is interesting")
                .keyUp(Keys.SHIFT)
                .sendKeys(" selenium is not interesting").pause(1000)
                .keyDown(Keys.CONTROL).sendKeys("A") // (CTRL + A)
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .perform();

        assertTrue(search_box.getAttribute("value").isEmpty());
    }

    @Test
    public void testRightClick() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        driver.manage().window().maximize();
        waitFor(10);

        // Switch to iframe
        driver.switchTo().frame("iframeResult");

        // Locate div element inside iframe
        WebElement area = driver.findElement(By.cssSelector("div[contextmenu='mymenu']"));

        // Right click
        Actions actions = new Actions(driver);

        actions.contextClick(area).perform();

        waitFor(3);

        Alert alert = driver.switchTo().alert();

        assertEquals("You right-clicked inside the div!", alert.getText());
        alert.accept();

        waitFor(2);
    }

    @Test
    public void testDoubleClick() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        waitFor(10);

        driver.switchTo().frame("iframeResult");

        WebElement p_elm = driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        WebElement resulting_elm = driver.findElement(By.id("demo"));

        assertFalse(resulting_elm.isDisplayed());

        Actions actions = new Actions(driver);

        actions.doubleClick(p_elm).perform();

        // Assert new p element with Hello World text is displayed
        assertTrue(resulting_elm.isDisplayed());

    }
}

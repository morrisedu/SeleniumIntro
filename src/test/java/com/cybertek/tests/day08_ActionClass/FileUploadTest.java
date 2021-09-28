package com.cybertek.tests.day08_ActionClass;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadTest extends TestBase {
    @Test
    public void testFileUpload() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");

        // Send file location to the file upload input
        driver.findElement(By.id("file-upload")).sendKeys("/home/miro/Desktop/SampleUpload.txt");

        // Click the upload button
        driver.findElement(By.id("file-submit")).click();

        // Wait
        Thread.sleep(3000);



        assertEquals("File Uploaded!", driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
        assertEquals("SampleUpload.txt", driver.findElement(By.id("uploaded-files")).getText().strip());
    }
}

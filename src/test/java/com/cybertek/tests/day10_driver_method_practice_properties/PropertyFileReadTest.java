package com.cybertek.tests.day10_driver_method_practice_properties;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.cybertek.utilities.ConfigReader.confRead;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyFileReadTest {
    @Test
    public void testFileReading() throws IOException {
        // Open a connection to the file using FileInputStreamObject
        FileInputStream in = new FileInputStream("config.properties");

        // Create empty Properties object
        Properties project_properties = new Properties();

        // Load the FileInputStream into Properties object
        project_properties.load(in);

        // Close input stream connection
        in.close();

        // Read properties
        String hello_value = project_properties.getProperty("hello");

        System.out.println("hello_value = " + hello_value);
        System.out.println("project_properties.getProperty(\"browser\") = " + project_properties.getProperty("browser"));
    }

    @Test
    public void testEmployTryCatchForErrors() {
        Properties proj_properties = new Properties();

        try {
            FileInputStream in = new FileInputStream("1config.properties");

            proj_properties.load(in);

            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String hello_value = proj_properties.getProperty("hello");

        assertEquals("world", hello_value);
    }

    @Test
    public void testReadingUsingUlitityClass() {
        System.out.println("read(\"hello\") = " + confRead("hello"));

        assertEquals("world", confRead("hello"));
    }
}

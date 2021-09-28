package com.cybertek.utilities;

public class BrowserUtil {
    // Method to pause thread for a number of seconds

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

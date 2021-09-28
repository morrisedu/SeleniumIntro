package com.cybertek.utilities;

public class BrowserUtil {
    /**
       * Waiting for a number of seconds with handling excpetion
        @param seconds
     */

    public static void waitFor(int seconds) {
        try {
            Thread.sleep( (long) seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

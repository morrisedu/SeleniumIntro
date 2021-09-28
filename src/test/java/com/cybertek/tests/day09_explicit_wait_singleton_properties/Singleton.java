package com.cybertek.tests.day09_explicit_wait_singleton_properties;

/*
    * The following class should only have one instance
    * Creating of more than one object from this class should not be allowed
    *
    * Singleton is a design pattern to have a class only generate one object(instance)
    * In order to achieve singleton pattern:
    * 1.    Make the constructor private
    * 2.    Create a private static field with the data type being the same as the class
    * 3.    Create a public getter method for private field
    *       -   The getter method should check if an obj already exists, if an object does not exist, create one, otherwise, use existing object
 */

public class Singleton {
    // static String word = "The only value";

    // Variable obj
    private static Singleton obj;

    private Singleton() {
        /*
            Empty class
            This is just part of creating a singleton class in the following steps:
                1.  Make constructor as private
                2.  Write a static method that has return type object of this Singleton class.
         */
    }

    public static Singleton getObject() {
        if (obj == null) {
            obj = new Singleton();
            return obj;
        } else {
            return obj;
        }
    }
}

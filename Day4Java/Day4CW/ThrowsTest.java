package com.coforge.Day4Java.Day4CW;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ThrowsTest {
    public static void myMethod() throws FileNotFoundException {
       FileReader fr = new FileReader("Demo.txt");
    }

    public static void main(String args[]) {
        try {
            myMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

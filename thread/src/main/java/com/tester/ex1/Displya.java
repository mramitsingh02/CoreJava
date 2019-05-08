package com.tester.ex1;

public class Displya {
    public synchronized void display(String str)
    {
        System.out.println("Hello " + str);
    }
}

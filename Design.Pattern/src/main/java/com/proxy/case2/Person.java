package com.proxy.case2;

public class Person implements Human {
    @Override
    public void walk() {
        System.out.println("Person is walking..");

    }

    @Override
    public void talk() {
        System.out.println("Person is talking..");
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}

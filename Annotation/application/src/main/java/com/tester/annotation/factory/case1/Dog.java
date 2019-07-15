package com.tester.annotation.factory.case1;

@AutoElement(tag = AnimalTags.DOG)
public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("woo");
    }
}

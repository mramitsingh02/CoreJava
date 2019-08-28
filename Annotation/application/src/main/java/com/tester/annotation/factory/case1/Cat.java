package com.tester.annotation.factory.case1;

@AutoElement(tag = AnimalTags.CAT)
public class Cat implements Animal {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void bark() {
        System.out.println("Maou");
    }
}
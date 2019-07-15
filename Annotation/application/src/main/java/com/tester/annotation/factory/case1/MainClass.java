package com.tester.annotation.factory.case1;

public class MainClass {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal(AnimalTags.DOG);
        dog.bark();
        Animal cat = AnimalFactory.createAnimal(AnimalTags.CAT);
        cat.bark();
    }
}

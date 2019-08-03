package com.tester.annotation.validation;

public class Dog {
    @NotNull
    private String name= "Amit";

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

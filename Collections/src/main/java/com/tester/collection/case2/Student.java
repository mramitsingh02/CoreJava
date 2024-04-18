package com.tester.collection.case2;

public class Student {
    private String name;
    private int age;
    private String address;
    private String standard;

    public Student(String name, int age, String address, String standard) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getStandard() {
        return standard;
    }
}

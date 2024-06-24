package com.tester.java8.collection.lambda.case2;

public class Director {

    private String name;
    private String phone;
    private String email;

    public Director(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                '}';
    }
}

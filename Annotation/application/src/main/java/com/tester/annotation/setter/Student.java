package com.tester.annotation.setter;


import com.tester.annotation.setter.case1.SetterAndGetter;

@SetterAndGetter
public class Student {
    String firstName;
    String lastName;
    boolean isPass;
    int roll;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isPass=" + isPass +
                ", roll=" + roll +
                '}';
    }
}

package com.tester.java8.collection.stream.case14;

import java.util.Arrays;
import java.util.List;

public class StudentDataFactory {
    public static List<Student> getStudentList() {
        return Arrays.asList(
                new Student(1, "Rohit", "Singh", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 65),
                new Student(3, "Ankit", "Singh", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish", "Singh", 30, "Male", "Mechanical Engineering", 2023, "Kerala", 26),
                new Student(5, "Roshan", "Singh", 23, "Male", "Biotech Engineering", 2014, "Mumbai", 12),
                new Student(6, "Chetan", "Singh", 24, "Male", "Mechanical Engineering", 2022, "Karnataka", 90),
                new Student(7, "Arun", "Singh", 26, "Male", "Electronic Engineering", 2023, "Karnataka", 324),
                new Student(8, "Nam", "Singh", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Singh", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Singh", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98)
        );
    }
}

package com.java8.stream.data;


import com.java8.stream.entity.Employee;
import com.java8.stream.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFactory {
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

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        return employeeList;
    }


    public static List<String> getStationeryList() {
        return Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
    }

    public static List<String> getCourseList() {
        return Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
    }


}

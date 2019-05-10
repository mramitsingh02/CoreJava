package com.builder.case1;

import com.builder.common.Gender;

import java.time.LocalDate;

public class BuilderDemo {

    public static void main(String[] args) {
        Student student = new Student(120, "Amit");
        System.out.println(student);
        Student student1 = new StudentBuilder()
                .setRoleNumber(120)
                .setFname("Amit")
                .setLname("Singh")
                .setFatherName("Mannu Singh")
                .setDateOfBirth(LocalDate.of(1984, 8, 3))
                .setGender(Gender.MALE).build();


        System.out.println(student1.toString());


    }

}

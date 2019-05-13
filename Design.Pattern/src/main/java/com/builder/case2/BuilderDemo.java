package com.builder.case2;

import com.builder.common.Gender;

import java.time.LocalDate;

public class BuilderDemo {
    public static void main(String[] args) {
         Student student1 = new CorporateStudentBuilder()
                .setRoleNumber(120)
                .setFname("Amit")
                .setLname("Singh")
                .setFatherName("Mannu Singh")
                .setDateOfBirth(LocalDate.of(1984, 8, 3))
                .setGender(Gender.MALE)
                .setEmployeeId(318015l)
                .setEmailId("amit@gmail.com")
                .build();


        System.out.println(student1.toString());

    }
}

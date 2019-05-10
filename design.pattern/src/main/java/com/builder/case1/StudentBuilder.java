package com.builder.case1;

import com.builder.common.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentBuilder {

    private long roleNumber;
    private String fname;
    private String lname;
    private LocalDate dateOfBirth;
    private String fatherName;
    private Gender gender;

    public long getRoleNumber() {
        return roleNumber;

    }

    public StudentBuilder setRoleNumber(long roleNumber) {
        this.roleNumber = roleNumber;
        return this;
    }

    public String getFname() {
        return fname;
    }

    public StudentBuilder setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public String getLname() {
        return lname;
    }

    public StudentBuilder setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public StudentBuilder setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public StudentBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Student build() {
        return new Student(roleNumber, fname,lname,dateOfBirth,fatherName,gender);
    }
}

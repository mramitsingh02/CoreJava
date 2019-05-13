package com.builder.case1;

import com.builder.common.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Student {


    private long roleNumber;
    private String fname;
    private String lname;
    private LocalDate dateOfBirth;
    private String fatherName;
    private Gender gender;


    public Student() {
    }

    public Student(long roleNumber, String fname) {
        this();
        this.roleNumber = roleNumber;
        this.fname = fname;
    }

    public Student(long roleNumber, String fname, String lname, LocalDate dateOfBirth, String fatherName, Gender gender) {
        this.roleNumber = roleNumber;
        this.fname = fname;
        this.lname = lname;
        this.dateOfBirth = dateOfBirth;
        this.fatherName = fatherName;
        this.gender = gender;
    }

    public long getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(long roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roleNumber == student.roleNumber &&
                fname.equals(student.fname) &&
                Objects.equals(lname, student.lname) &&
                Objects.equals(dateOfBirth, student.dateOfBirth) &&
                Objects.equals(fatherName, student.fatherName) &&
                gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleNumber, fname, lname, dateOfBirth, fatherName, gender);
    }


    @Override
    public String toString() {
        return "Student{" +
                "roleNumber=" + roleNumber +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", fatherName='" + fatherName + '\'' +
                ", gender=" + gender +
                '}';
    }


}

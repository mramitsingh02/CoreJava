package com.tester.java8.collection.stream.case1;

import java.util.Objects;

public class Student {
    private long rollNumber;
    private String firstName;
    private String lastName;
    private String higestDegree;
    private String status;

    public Student(long rollNumber, String firstName, String lastName, String higestDegree, String status) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.higestDegree = higestDegree;
        this.status = status;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHigestDegree() {
        return higestDegree;
    }

    public void setHigestDegree(String higestDegree) {
        this.higestDegree = higestDegree;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student(String firstName, String lastName, String higestDegree, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.higestDegree = higestDegree;
        this.status = status;
    }

    public Student() {
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                higestDegree.equals(student.higestDegree) &&
                Objects.equals(status, student.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, firstName, lastName, higestDegree, status);
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", higestDegree='" + higestDegree + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

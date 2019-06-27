package com.tester.java8.collection.stream.case1;

import java.util.concurrent.atomic.AtomicInteger;

public class StudentBuilder {
    private long rollNumber;
    private String firstName;
    private String lastName;
    private String higestDegree;
    private String status;
    private AtomicInteger studentIdGenerator;

    public StudentBuilder(){}

    public StudentBuilder(Employee employee) {
    }


    public long getRollNumber() {
        return rollNumber;
    }

    public StudentBuilder setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getHigestDegree() {
        return higestDegree;
    }

    public StudentBuilder setHigestDegree(String higestDegree) {
        this.higestDegree = higestDegree;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public StudentBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public Student build() {
        return new Student(studentIdGenerator.incrementAndGet(), firstName, lastName, higestDegree, status);
    }


    public StudentBuilder withGenerator(AtomicInteger rollNumberGenerator) {
        this.studentIdGenerator = rollNumberGenerator;
        return this;
    }
}

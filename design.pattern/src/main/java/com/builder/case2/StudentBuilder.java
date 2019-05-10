package com.builder.case2;

import com.builder.common.Gender;

import java.time.LocalDate;

public class StudentBuilder<SELF extends StudentBuilder<SELF>> {

    protected Student student = new Student();

    public SELF setRoleNumber(long roleNumber) {
        this.student.setRoleNumber(roleNumber);
        return self();
    }


    public SELF setFname(String fname) {
        this.student.setFname(fname);
        return self();
    }

    public SELF setLname(String lname) {
        this.student.setLname(lname);
        return self();
    }

    public SELF setDateOfBirth(LocalDate dateOfBirth) {
        this.student.setDateOfBirth(dateOfBirth);
        return self();
    }


    public SELF setFatherName(String fatherName) {
        this.student.setFatherName(fatherName);
        return self();
    }


    public SELF setGender(Gender gender) {
        this.student.setGender(gender);
        return self();
    }

    protected SELF self() {
        return (SELF) this;
    }

    public Student build() {
        return student;
    }
}

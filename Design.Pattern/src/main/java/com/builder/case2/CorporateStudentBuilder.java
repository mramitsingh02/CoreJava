package com.builder.case2;

public class CorporateStudentBuilder extends StudentBuilder<CorporateStudentBuilder> {


    public CorporateStudentBuilder setEmployeeId(long employeeId) {
        this.student.setEmployeeId(employeeId);
        return self();
    }


    public CorporateStudentBuilder setEmailId(String emailId) {
        this.student.setEmailId(emailId);
        return self();
    }

    @Override
    protected CorporateStudentBuilder self() {
        return this;
    }

    public Student build() {
        return student;
    }

    @Override
    public String toString() {
        return "CorporateStudentBuilder{" +
                "student=" + student +
                '}';
    }
}

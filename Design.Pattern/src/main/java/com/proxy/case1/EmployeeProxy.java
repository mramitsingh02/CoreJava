package com.proxy.case1;

public class EmployeeProxy extends Employee {

    public EmployeeProxy(long empId) {
        super(empId);
    }

    @Override
    public String getName() {
        if (this.getName() != null && this.getName().matches("[a-zA-Z]+\\.?")) {
            return super.getName();
        } else {
            throw new IllegalArgumentException("Name must be Alphabet");
        }

    }


    @Override
    public void setAge(int age) {

        if (age >= 18) {
            super.setAge(age);
        } else {
            throw new IllegalArgumentException("Age must be greater then 18 ");
        }
    }
}

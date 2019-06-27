package com.tester.java8.collection.stream.case1;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeBuilder {
    private AtomicInteger empIdGenerator = null;
    private int empId;
    private String empfirstName;
    private String higstDegree;
    private long salary;
    private String department;
    private float expriences;

    private Student newStudent;

    public EmployeeBuilder(Student newStudent) {
        this.newStudent = newStudent;
    }

    public EmployeeBuilder withGenerator(AtomicInteger empIdGenerator) {
        this.empIdGenerator = empIdGenerator;
        return this;
    }

    public float getExpriences() {
        return expriences;
    }

    public EmployeeBuilder setExpriences(float expriences) {
        this.expriences = expriences;
        return this;
    }

    public int getEmpId() {
        return empId;
    }

    public EmployeeBuilder setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public String getEmpfirstName() {
        return empfirstName;
    }

    public EmployeeBuilder setEmpfirstName(String empfirstName) {
        this.empfirstName = empfirstName;
        return this;
    }

    public String getHigstDegree() {
        return higstDegree;
    }

    public EmployeeBuilder setHigstDegree(String higstDegree) {
        this.higstDegree = higstDegree;
        return this;
    }

    public long getSalary() {
        return salary;
    }

    public EmployeeBuilder setSalary(long salary) {
        this.salary = salary;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Employee build() {
        Employee newEmployee = null;
        if (Objects.nonNull(newStudent)) {
            newEmployee = new Employee(empIdGenerator.getAndIncrement(), newStudent.getFirstName(), newStudent.getHigestDegree(), 0l, "Tranning");
        } else {
            newEmployee = new Employee(empId, empfirstName, higstDegree, salary, department);
        }

        return newEmployee;
    }

}

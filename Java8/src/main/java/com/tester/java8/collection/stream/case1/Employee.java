package com.tester.java8.collection.stream.case1;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empfirstName;
    private String higstDegree;
    private long salary;
    private String department;
    private float expriences;

    public Employee(int empId, String empfirstName, String higstDegree, long salary, String department) {
        this.empId = empId;
        this.empfirstName = empfirstName;
        this.higstDegree = higstDegree;
        this.salary = salary;
        this.department = department;
        this.expriences = 0.0f;
    }

    public float getExpriences() {
        return expriences;
    }

    public void setExpriences(float expriences) {
        this.expriences = expriences;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpfirstName() {
        return empfirstName;
    }

    public void setEmpfirstName(String empfirstName) {
        this.empfirstName = empfirstName;
    }

    public String getHigstDegree() {
        return higstDegree;
    }

    public void setHigstDegree(String higstDegree) {
        this.higstDegree = higstDegree;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                salary == employee.salary &&
                Objects.equals(empfirstName, employee.empfirstName) &&
                Objects.equals(higstDegree, employee.higstDegree) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empfirstName, higstDegree, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empfirstName='" + empfirstName + '\'' +
                ", higstDegree='" + higstDegree + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

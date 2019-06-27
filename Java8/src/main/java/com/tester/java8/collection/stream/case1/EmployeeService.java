package com.tester.java8.collection.stream.case1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeService {
    private static List<Employee> lstOfEmployee = new ArrayList<>();
    private final AtomicInteger empIdGenerator;


    public EmployeeService(AtomicInteger empIdGenerator) {
        this.empIdGenerator = empIdGenerator;
    }

    public EmployeeService(List<Employee> listOfEmployee, AtomicInteger empIdGenerator) {
        this(empIdGenerator);
        lstOfEmployee.addAll(listOfEmployee);
    }

    public void addAll(List<Student> studentList) {
        studentList.stream().map(student -> new EmployeeBuilder(student).withGenerator(empIdGenerator).build())
                .forEach(lstOfEmployee::add);
    }

    public void add(Student student) {
        lstOfEmployee.add(new EmployeeBuilder(student).withGenerator(empIdGenerator).build());
    }

    public void add(Employee employee) {
        lstOfEmployee.add(employee);
    }

    public void addAllEmployee(List<Employee> employeeList) {
        employeeList.stream().forEach(lstOfEmployee::add);
    }

    public void remove(Student student) {
        lstOfEmployee.remove(student);
    }

    public void print() {
        lstOfEmployee.forEach(System.out::println);
    }

    public List<Employee> getListOfEmployee() {
        return lstOfEmployee;
    }

    public AtomicInteger getRollNumberGenerator() {
        return empIdGenerator;
    }
}

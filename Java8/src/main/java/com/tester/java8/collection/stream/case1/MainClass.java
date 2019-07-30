package com.tester.java8.collection.stream.case1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MainClass {


    public static void main(String[] args) {
        AtomicInteger rollNumberGenerator = new AtomicInteger(10000);
        AtomicInteger empIdGenerator = new AtomicInteger(200000);


        StudentService studentService = new StudentService(rollNumberGenerator);
        studentService.prepareDummyStudent();
        studentService.print();

        EmployeeService employeeService = new EmployeeService(empIdGenerator);
        ObjectTransformar.setRollNumberGenerator(employeeService.getRollNumberGenerator());

        List<Employee> lstOfEmployee = studentService.getListOfStudent().stream().map(ObjectTransformar::transform).collect(Collectors.toList());
        employeeService.addAllEmployee(lstOfEmployee);


        System.out.println("**************************************************************************************************************");
        employeeService.print();
    }


}

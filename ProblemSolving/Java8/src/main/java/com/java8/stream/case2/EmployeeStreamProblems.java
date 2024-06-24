package com.java8.stream.case2;

import com.java8.stream.data.DataFactory;
import com.java8.stream.entity.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.java8.stream.util.Utils.printHeader;

public class EmployeeStreamProblems {
    public static void main(String[] args) {
        List<Employee> employees = DataFactory.getEmployeeList();
        printHeader("1 : How many male and female employees are there in the organization?");

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).forEach((k, v) -> System.out.println(k + " = " + v));
        printHeader("2 : Print the name of all departments in the organization?");

        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        printHeader("3 : What is the average age of male and female employees?");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge))).forEach((k, v) -> System.out.println(k + " = " + v));


        printHeader("4 : Get the details of highest paid employee in the organization?");
        employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        printHeader("5 : Get the names of all employees who have joined after 2015?");

        employees.stream().filter(x -> x.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        printHeader("6 : Count the number of employees in each department?");
        Map<String, Long> deptOfEmpCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(deptOfEmpCount);

        printHeader("7 : What is the average salary of each department?");

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))).forEach((k, v) -> System.out.println(k + " = " + v));
        printHeader("8 : Get the details of youngest male employee in the product development department?");

        employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("male") && e.getDepartment().equalsIgnoreCase("product development"))
                .min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);

        printHeader("9 : Who has the most working experience in the organization?");

        employees.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining)).ifPresent(System.out::println);

        employees.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().ifPresent(System.out::println);

        printHeader("10 : How many male and female employees are there in the sales and marketing team?");

        employees.stream()
                .filter(ex -> ex.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).forEach((k, v) -> System.out.println(k + " = " + v));

        printHeader("11 : What is the average salary of male and female employees?");

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))).forEach((k, v) -> System.out.println(k + " = " + v));

        printHeader("12 : List down the names of all employees in each department?");

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k, v) -> System.out.println(k + " = " + v.stream().map(Employee::getName).toList()));
        printHeader("13 : What is the average salary and total salary of the whole organization?");
//        employees.

        printHeader("14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
        printHeader("15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");
        employees.stream().max(Comparator.comparingInt(Employee::getAge)).ifPresent(x -> System.out.println(x.getAge() + " " + x.getDepartment() ));


    }
}

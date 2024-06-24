package com.java8.stream.case1;

import com.java8.stream.data.DataFactory;
import com.java8.stream.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.java8.stream.util.Utils.printHeader;

public class StudentStreamProblems {
    public static void main(String[] args) {
        List<Student> students = DataFactory.getStudentList();
        printHeader("1- Find list of students whose first name starts with alphabet A");
        students.stream().filter(student -> student.getFirstName().startsWith("A")).forEach(System.out::println);
        printHeader("2- Group The Student By Department Names");
        students.stream().collect(Collectors.groupingBy(Student::getDepartmentName)).entrySet().forEach(stringListEntry -> System.out.println("\n\n" + stringListEntry.getKey() + "\n_______________________\n" + stringListEntry.getValue()));

        printHeader("3- Find the total count of student using stream");
        System.out.println(students.stream().count());

        printHeader("4- Find the max age of student");
        System.out.println(students.stream().max(Comparator.comparingInt(Student::getAge)));

        printHeader("5- Find all departments names");
        students.stream().map(Student::getDepartmentName).distinct().forEach(System.out::println);

        printHeader("6- Find the count of student in each department");
        students.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).entrySet().forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + " has " + stringLongEntry.getValue() + " students."));

        printHeader("7- Find the list of students whose age is less than 30");

        students.stream().filter(student -> student.getAge() < 30).forEach(System.out::println);

        printHeader("8- Find the list of students whose rank is in between 50 and 100");
        students.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).forEach(System.out::println);

        printHeader("9- Find the average age of male and female students");
        students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge))).forEach((s, aDouble) -> System.out.println(s + " has " + aDouble));

        printHeader("10- Find the department who is having maximum number of students");

        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey());


        printHeader("11- Find the Students who stays in Delhi and sort them by their names");
        students.stream().filter(student -> student.getCity().equalsIgnoreCase("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);

        printHeader("12- Find the average rank in all departments");
        students.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingDouble(Student::getRank))).entrySet().forEach(stringDoubleEntry -> System.out.println(stringDoubleEntry.getKey() + " = " + stringDoubleEntry.getValue()));
        printHeader("13- Find the highest rank in each department");

        students.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.maxBy(Comparator.comparingInt(Student::getRank)))).entrySet().forEach(stringDoubleEntry -> System.out.println(stringDoubleEntry.getKey() + " = " + stringDoubleEntry.getValue()));

        printHeader("14- Find the list of students and sort them by their rank");
        students.stream().sorted(Comparator.comparingInt(Student::getRank)).forEach(System.out::println);

        printHeader("15- Find the student who has second rank");
        students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).skip(1).findFirst().ifPresent(System.out::println);


    }


}
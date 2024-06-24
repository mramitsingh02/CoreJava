package com.tester.java8.collection.stream.case14;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentSteamExampleMainClass {


    public static void main(String[] args) {
        //medium.com/illumination/java-8-stream-api-commonly-asked-interview-questions-2a57081044ef
        List<Student> students = StudentDataFactory.getStudentList();
        //Find students of students whose first name starts with alphabet A

        System.out.println(students.stream().filter(student -> student.getFirstName().startsWith("A")).collect(Collectors.toList()));
        // Group the student by department names.
        Map<String, List<Student>> studentGroupByDepartment = students.stream().collect(Collectors.groupingBy(Student::getDepartmentName));
        print(studentGroupByDepartment);

        // Group the student by Gender
        Map<String, List<Student>> studentGroupByGender = students.stream().collect(Collectors.groupingBy(Student::getGender));
        print(studentGroupByGender);

        // Group the student by joinedYear
        Map<Integer, List<Student>> studentsByYear = students.stream().collect(Collectors.groupingBy(Student::getJoinedYear));
        printInt(studentsByYear);

        // Find the total number of student
        printWithSpace("Total Student Count" + students.stream().count());

        //3. Find the max age of student
        int maxAge = students.stream().mapToInt(Student::getAge).max().orElse(0);
        System.out.println(maxAge);

        // Find the max age student.
        students.stream().max(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);

        printWithSpace("5- Find all departments names");
        List<String> departments = students.stream().map(Student::getDepartmentName).distinct().collect(Collectors.toList());
        print(departments);


        // Find the count of the student in each department.
        printWithSpace("6. Find the count of the student in each department.");
        students.stream().collect(Collectors.toMap(Student::getDepartmentName, s -> 1, Integer::sum)).entrySet().forEach(System.out::println);


        printWithSpace("7- Find the students of students whose age is less than 30\n\n");
        students.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList()).forEach(System.out::println);

        printWithSpace("8- Find the students of students whose rank is in between 50 and 100");
        students.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList()).forEach(System.out::println);

        printWithSpace("9- Find the average age of male and female students");

        Map<String, Double> avgAgeOfGender = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        printMap(avgAgeOfGender);

        double avgAgeOfMale = students.stream().filter(student -> student.getGender().equalsIgnoreCase("male")).collect(Collectors.averagingInt(Student::getAge)).doubleValue();
        print(avgAgeOfMale);


        printWithSpace("10- Find the department who is having maximum number of students");

//        students.stream().collect(Collectors.groupingBy(Student::getDepartmentName)).entrySet().stream().map(x -> x.getValue().size()).max(Integer::compare).ifPresent(System.out::println);
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());

        printWithSpace("11- Find the Students who stays in Delhi and sort them by their names");
        students.stream().filter(student -> student.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList()).forEach(System.out::println);

        printWithSpace("12- Find the average rank in all departments");
        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingInt(Student::getRank))).entrySet()
                .forEach(System.out::println);

        printWithSpace("13- Find the highest rank in each department");
        students.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.maxBy(Comparator.comparingInt(Student::getRank)))).entrySet().forEach(System.out::println);
        printWithSpace("14- Find the students of students and sort them by their rank");
        students.stream().sorted(Comparator.comparingInt(Student::getRank)).forEach(System.out::println);
        printWithSpace("15- Find the student who has second rank");
        Student student = students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).skip(1).findFirst().get();
        System.out.println(student);


    }

    private static void printMap(Map<String, Double> avgAgeOfGender) {
        avgAgeOfGender.entrySet().forEach(System.out::println);
    }

    private static void print(double avgAgeOfMale) {
        System.out.println(avgAgeOfMale);
    }

    private static void printWithSpace(String x) {
        System.out.println("==========================================================================================================================");
        System.out.println("\n\n" + x);
        System.out.println("==========================================================================================================================");
    }

    private static void print(List<String> departments) {
        for (String student : departments) {
            System.out.println(student);
        }
    }

    private static void print(Map<String, List<Student>> stringListMap) {
        for (Map.Entry<String, List<Student>> studentEntry : stringListMap.entrySet()) {
            System.out.println(studentEntry.getKey());
            System.out.println("--------------------------------------------------------------");
            for (Student student : studentEntry.getValue()) {
                System.out.println(student);
            }
        }
    }

    private static void printInt(Map<Integer, List<Student>> stringListMap) {
        for (Map.Entry<Integer, List<Student>> studentEntry : stringListMap.entrySet()) {
            System.out.println(studentEntry.getKey());
            System.out.println("--------------------------------------------------------------");
            for (Student student : studentEntry.getValue()) {
                System.out.println(student);
            }
        }
    }


}

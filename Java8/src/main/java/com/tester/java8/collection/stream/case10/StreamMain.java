package com.tester.java8.collection.stream.case10;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    private static List<Student> prepareData() {
        Student s1 = new Student(1002, "Amit", "MCA", 62.0f);
        Student s2 = new Student(1200, "Singh", "MCA", 72.0f);
        Student s3 = new Student(1212, "Ashish", "MCA", 75.0f);
        Student s4 = new Student(1214, "Ragwa", "MCA", 77.0f);
        Student s5 = new Student(1215, "Hari", "MCA", 77.0f);
        Student s6 = new Student(1217, "Arpit", "MCA", 66.0f);
        Student s7 = new Student(1218, "Vinay", "MCA", 66.0f);
        Student s8 = new Student(1221, "Sumit", "MCA", 63.0f);
        Student s9 = new Student(1222, "Priya", "MCA", 63.0f);
        Student s10 = new Student(1224, "Sivam", "MCA", 62.0f);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = prepareData();
        System.out.println("Unsorted >===================================================================");
        Map<Float, String> stringMap = studentList.stream().collect(Collectors.toMap(s -> s.masksPresentage, s -> s.toString(), (s1, s2) -> s1 + ":" + s2));
        stringMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("Sorted >===================================================================");
        TreeMap<Float, String> stringTreeMap = studentList.stream().collect(Collectors.toMap(s -> s.masksPresentage, s -> s.toString(), (s1, s2) -> s1 + ":" + s2, TreeMap::new));
        stringTreeMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        

        Collector<Student, StringJoiner, String> of = Collector.of(
                () -> {
                    System.out.println("Supplier");
                    return new StringJoiner(" : ");
                },
                (m, s) -> {
                    System.out.println("Accumulator");
                    m.add(s.toString());
                },
                (s1, s2) -> {
                    System.out.println("Combiner");
                    return s1.merge(s2);
                }, k -> {
                    System.out.println("Finisher");
                    return k.toString();
                }
        );

        String studentString = studentList.stream().collect(of);
        System.out.println(studentString);


    }

    public static class Student {
        int rollNumber;
        String name;
        String className;
        float masksPresentage;

        private Student() {

        }

        public Student(int rollNumber, String name, String className, float masksPresentage) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.className = className;
            this.masksPresentage = masksPresentage;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "rollNumber=" + rollNumber +
                    ", name='" + name + '\'' +
                    ", className='" + className + '\'' +
                    '}';
        }
    }


}

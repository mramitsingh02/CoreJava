package com.tester.collection.case2;

import java.util.List;
import java.util.Map;

public class StudentData {

    public static List<Student> getStudents() {
        List<Student> students = new java.util.ArrayList<>();
        students.add(new Student("A-A", 10, "A", "1"));
        students.add(new Student("A-B", 11, "B", "2"));
        students.add(new Student("A-C", 12, "C", "3"));
        students.add(new Student("A-D", 13, "D", "4"));
        students.add(new Student("A-E", 14, "E", "5"));
        students.add(new Student("A-F", 15, "F", "6"));
        students.add(new Student("A-G", 16, "G", "7"));
        students.add(new Student("A-H", 17, "H", "8"));
        students.add(new Student("A-I", 18, "I", "9"));
        students.add(new Student("A-J", 19, "J", "10"));

        students.add(new Student("B-A", 10, "A", "1"));
        students.add(new Student("B-B", 11, "B", "2"));
        students.add(new Student("B-C", 12, "C", "3"));
        students.add(new Student("B-D", 13, "D", "4"));
        students.add(new Student("B-E", 14, "E", "5"));
        students.add(new Student("B-F", 15, "F", "6"));
        students.add(new Student("B-G", 16, "G", "7"));
        students.add(new Student("B-H", 17, "H", "8"));
        students.add(new Student("B-I", 18, "I", "9"));
        students.add(new Student("B-J", 19, "J", "10"));

        students.add(new Student("C-A", 10, "A", "1"));
        students.add(new Student("C-B", 11, "B", "2"));
        students.add(new Student("C-C", 12, "C", "3"));
        students.add(new Student("C-D", 13, "D", "4"));
        students.add(new Student("C-E", 14, "E", "5"));
        students.add(new Student("C-F", 15, "F", "6"));
        students.add(new Student("C-G", 16, "G", "7"));
        students.add(new Student("C-H", 17, "H", "8"));
        students.add(new Student("C-I", 18, "I", "9"));
        students.add(new Student("C-J", 19, "J", "10"));

        students.add(new Student("D-A", 10, "A", "1"));
        students.add(new Student("D-B", 11, "B", "2"));
        students.add(new Student("D-C", 12, "C", "3"));
        students.add(new Student("D-D", 13, "D", "4"));
        students.add(new Student("D-E", 14, "E", "5"));
        students.add(new Student("D-F", 15, "F", "6"));
        students.add(new Student("D-G", 16, "G", "7"));
        students.add(new Student("D-H", 17, "H", "8"));
        students.add(new Student("D-I", 18, "I", "9"));
        students.add(new Student("D-J", 19, "J", "10"));

        return students;
    }

    public static Map<Section, List<Student>> getStudentMap(final List<Student> listMap) {
        Map<Section, List<Student>> studentMap = new java.util.HashMap<>();
        listMap.forEach(student -> {
         String[] sectionWiseName =   student.getName().split("-");
            Section section = Section.valueOf(sectionWiseName[0]);
            studentMap.computeIfAbsent(section, s -> new java.util.ArrayList<>()).add(student);
        });


        return studentMap;
    }

    public static Map<String, Map<Section, List<Student>>> getListByClassPerSection(final Map<Section, List<Student>> studentMap) {

//        studentMap.

        return null;
    }
}

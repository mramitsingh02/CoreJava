package com.tester.collection.case2;

import java.util.List;
import java.util.Map;

public class ComputeStudents {
    public static void main(String[] args) {
        List<Student> listMap = StudentData.getStudents();

        Map<Section, List<Student>> studentMap = StudentData.getStudentMap(listMap);
        studentMap.forEach((section, students) -> {
            System.out.println("Section: " + section);
            students.forEach(student -> {
                System.out.println("Name: " + student.getName() + " Age: " + student.getAge() + " Address: " + student.getAddress() + " Standard: " + student.getStandard());
            });
        });


        StudentData.getListByClassPerSection(studentMap);

    }
}

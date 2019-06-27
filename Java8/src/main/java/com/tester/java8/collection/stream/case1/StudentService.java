package com.tester.java8.collection.stream.case1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentService {
    private final AtomicInteger rollNumberGenerator;
    private List<Student> lstOfStudent = new ArrayList<>();
    public StudentService(AtomicInteger rollNumberGenerator) {
        this.rollNumberGenerator = rollNumberGenerator;
    }

    public StudentService(List<Student> listOfStudent, AtomicInteger rollNumberGenerator) {
        this.rollNumberGenerator = rollNumberGenerator;
        lstOfStudent.addAll(listOfStudent);
    }

    public List<Student> prepareDummyStudent() {
        lstOfStudent.add(new StudentBuilder().withGenerator(rollNumberGenerator).setFirstName("Amit").setLastName("Singh").setHigestDegree("MCA").setStatus("Active").build());
        lstOfStudent.add(new StudentBuilder().withGenerator(rollNumberGenerator).setFirstName("Vidhu").setLastName("Singh").setHigestDegree("MCA").setStatus("Active").build());
        lstOfStudent.add(new StudentBuilder().withGenerator(rollNumberGenerator).setFirstName("Atul").setLastName("Singh").setHigestDegree("MCA").setStatus("Active").build());
        lstOfStudent.add(new StudentBuilder().withGenerator(rollNumberGenerator).setFirstName("Ravi").setLastName("Singh").setHigestDegree("MCA").setStatus("Active").build());
        return lstOfStudent;
    }

    public void add(Student student) {
        lstOfStudent.add(student);
    }

    public void remove(Student student) {
        lstOfStudent.remove(student);
    }

    public Employee getEmployee(Student student) {
        return ObjectTransformar.transform(student);
    }

    public void print() {
        lstOfStudent.forEach(System.out::println);
    }

    public List<Student> getListOfStudent() {
        return lstOfStudent;
    }

    public AtomicInteger getRollNumberGenerator() {
        return rollNumberGenerator;
    }
}

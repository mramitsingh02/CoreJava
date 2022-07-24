package com.tester.java8.collection.stream.case1;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectTransformar {
    private static AtomicInteger rollNumberGenerator = null;

    public static Employee transform(Student student) {
        return new EmployeeBuilder(student).withGenerator(rollNumberGenerator).build();
    }

    public static Student transform(Employee employee) {
        return new StudentBuilder(employee).withGenerator(rollNumberGenerator).build();
    }

    public static void setRollNumberGenerator(AtomicInteger rNumberGenerator) {
        rollNumberGenerator = rNumberGenerator;

    }
}

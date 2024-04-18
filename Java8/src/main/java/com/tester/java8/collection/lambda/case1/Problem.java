package com.tester.java8.collection.lambda.case1;


import java.util.HashSet;
import java.util.stream.Collectors;

public class Problem {

    public static void main(String[] args) {
        final java.util.List<Integer> integers = java.util.List.of(10, 15, 8, 49, 25, 98, 98, 32, 15);

        java.util.Set<Integer> set = new HashSet<>();
        final java.util.List<Integer> duplicate = integers.stream().filter(x -> !set.add(x)).collect(Collectors.toList());
        System.out.println(duplicate);
    }

}

package com.tester.java8.collection.stream.case13;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekCase {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        System.out.println();
        Stream.iterate(0, i -> i + 1).skip(2).limit(30).collect(Collectors.toList()).forEach(System.out::print);
    }

    private static void test2() {
        Stream.iterate(0, i -> i + 1).filter(x -> x % 2 == 0).limit(20).skip(2).collect(Collectors.toList()).forEach(System.out::print);
    }

    private static void test1() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }
}
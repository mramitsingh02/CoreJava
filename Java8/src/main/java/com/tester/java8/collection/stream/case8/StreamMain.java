package com.tester.java8.collection.stream.case8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("---->");
        Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);
        System.out.println("---->");
        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
        System.out.println("---->");
        IntStream.rangeClosed(1, 10).mapToObj(n -> "a" + n).forEach(System.out::println);
        System.out.println("---->");
        Arrays.stream(new int[]{1, 12, 13, 14}).map(n -> n * 2).forEach(System.out::println);
        System.out.println("---->");
        Arrays.stream(new int[]{1, 12, 13, 14}).map(n -> n * 2).average().ifPresent(System.out::println);
        System.out.println("---->");
        Stream.of(20.3,11.7,10.0).mapToInt(Double::intValue).mapToObj(x -> "a"+x).forEach(System.out::println);


    }


}

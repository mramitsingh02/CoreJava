package com.tester.java8.collection.lambda.case1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestClass {


    public static void main(String[] args) {
        final int[] integers = {-1, -3};
        final int max = Arrays.stream(integers).filter(x -> x >0).max().orElse(1) + 1;

        IntStream.range(1, max)
                .filter(x -> Arrays.stream(integers).noneMatch(y -> y == x))
                .findFirst()
                .ifPresent(System.out::println);
    }


}

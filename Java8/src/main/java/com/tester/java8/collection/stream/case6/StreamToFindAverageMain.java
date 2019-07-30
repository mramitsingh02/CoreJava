package com.tester.java8.collection.stream.case6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamToFindAverageMain {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }


    private static void test5() {
        Stream.of(new BigInteger("12"), new BigInteger("18")).mapToInt(BigInteger::intValue).average().ifPresent(System.out::println);
    }


    private static void test4() {
        Stream.of(new BigDecimal("12.3"), new BigDecimal("17.7"))
                .mapToDouble(BigDecimal::doubleValue).average().ifPresent(System.out::println);
    }

    private static void test3() {
        IntStream.range(0, 10).average().ifPresent(System.out::println);
    }

    private static void test2() {
        IntStream.builder().add(1).add(3).add(5).add(7).add(11).add(13).add(17).build().average().ifPresent(System.out::println);
    }

    private static void test1() {
        int[] ints = {1, 3, 5, 7, 11, 13, 17};
        Arrays.stream(ints).average().ifPresent(System.out::println);
    }
}
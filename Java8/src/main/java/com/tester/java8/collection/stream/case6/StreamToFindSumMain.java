package com.tester.java8.collection.stream.case6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamToFindSumMain {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }


    private static void test5() {
        int sum = Stream.of(new BigInteger("12"), new BigInteger("18")).mapToInt(BigInteger::intValue).sum();
        System.out.println(sum);
    }


    private static void test4() {
        double sum = Stream.of(new BigDecimal("12.3"), new BigDecimal("17.7"))
                .mapToDouble(BigDecimal::doubleValue).sum();
        System.out.println(sum);
    }

    private static void test3() {
        int sum = IntStream.range(0, 10).sum();
        System.out.println(sum);
    }


    private static void test2() {
        int sum = IntStream.builder().add(1).add(3).add(5).add(7).add(11).add(13).add(17).build().sum();
        System.out.println(sum);
    }

    private static void test1() {
        int[] ints = {1, 3, 5, 7, 11, 13, 17};
        int sum = Arrays.stream(ints).sum();
        System.out.println(sum);

    }
}
package com.tester.java8.collection.stream.case11;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ParallelismMainCase {

    private static final int MAX = 100;
    static List<String> values = new ArrayList<>(MAX);

    public static void main(String[] args) {
        fillData();
        test1();
        //test2();
        test3();
    }


    private static void test3() {
        long t0 = System.nanoTime();

        List<String> strings = values.parallelStream().sorted((s1, s2) -> {
            System.out.println("sorting : " + s1 + ", " + s2 + ", " + Thread.currentThread().getName());
            return s1.compareTo(s2);
        }).collect(Collectors.toList());
        long t1 = System.nanoTime();
        long toMillis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Total time took : " + toMillis + " milli second.");

    }

    private static void test2() {



        long t0 = System.nanoTime();
        long count = values.parallelStream().sorted((s1, s2) -> {
            System.out.println("sorting : " + s1 + ", " + s2 + ", " + Thread.currentThread().getName());
            return s1.compareTo(s2);
        }).filter(x -> {
            System.out.println("Filtering : " + x);
            return true;
        })
                .map(x -> {
                    System.out.println("Mapping :" + x);
                    return x.toUpperCase();
                }).count();
        System.out.println("Total Count : " + count);
        long t1 = System.nanoTime();

        long toMillis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Total time took : " + toMillis + " milli second.");


    }

    private static void fillData() {
        values.clear();
        for (int i = 0; i < MAX; i++) {
            String value = UUID.randomUUID().toString();
            values.add(value);
        }
        System.out.println("Data prepared");
    }

    private static void test1() {
        //-Djava.util.concurrent.ForkJoinPool.common.parallelism=5
        //System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "12");
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        System.out.println("Parallelism Size: " + forkJoinPool.getParallelism());
    }

}

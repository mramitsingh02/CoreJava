package com.tester.java8.collection;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadingInJava11 {

    ThreadingInJava11() {
        List<Integer> list = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("calculation is in progress..");
        AtomicInteger evenCounter = new AtomicInteger();
        AtomicInteger oddCounter = new AtomicInteger();
        list.stream()
                .parallel()
                .forEach(value -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread-num" + value);
                });

        System.out.println("even number is:" + evenCounter.get() + ", odd number is: " + oddCounter.get());


    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadingInJava11();
    }

}
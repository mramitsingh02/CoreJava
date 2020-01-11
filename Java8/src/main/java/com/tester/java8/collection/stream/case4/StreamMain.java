package com.tester.java8.collection.stream.case4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamMain {
    private static final int MAX = 10000000;
    static List<String> values = new ArrayList<>(MAX);

    public static void main(String[] args) {
        sortSequential();
        sortParallel();
    }

    private static void sortParallel() {
        generateData();
        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println("Total Count : " + count);
        long t1 = System.nanoTime();

        long toMillis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Total time took : " + toMillis + " milli second.");

    }

    private static void sortSequential() {
        generateData();
        long t0 = System.nanoTime();
        long count = values.parallelStream().sorted(Comparator.reverseOrder()).count();
        System.out.println("Total Count : " + count);
        long t1 = System.nanoTime();

        long toMillis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Total time took : " + toMillis + " milli second.");

    }

    private static void generateData() {
        values.clear();
        for (int i = 0; i < MAX; i++) {
            values.add(UUID.randomUUID().toString());
        }
    }
}

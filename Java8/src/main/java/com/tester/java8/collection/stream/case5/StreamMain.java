package com.tester.java8.collection.stream.case5;

import com.google.common.base.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("d2", "a2", "b1", "b3", "c");
        //test1(strings);
        //test2(strings);
        //test3(strings);
        //test4(strings);
        //test5(strings);
        //test6(strings);
        //test7(strings);
        test8(strings);

    }

    private static void test8(List<String> strings) {
        Supplier<Stream<String>> streamSupplier = () -> strings.stream().map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).filter(x -> {
            System.out.println("filtering -> " + x);
            return x.startsWith("B");
        });

        boolean anyMatch = streamSupplier.get().anyMatch(x -> true);
        System.out.println(anyMatch);
        boolean allMatch = streamSupplier.get().allMatch(x -> true);
        System.out.println(allMatch);
    }
    private static void test7(List<String> strings) {
        strings.stream().map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).allMatch(x -> {
            System.out.println("allMatch -> " + x);
            return x.startsWith("B");
        });
    }
    private static void test6(List<String> strings) {
        strings.stream().map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).anyMatch(x -> {
            System.out.println("anyMatch -> " + x);
            return x.startsWith("B");
        });
    }

    private static void test5(List<String> strings) {
        strings.stream()
                .filter(x -> {
                    System.out.println("filtering -> " + x);
                    return x.startsWith("b");
                })
                .sorted((s1, s2) -> {
                    System.out.println("Sorting -> " + s1 + " ," + s2);
                    return s1.compareTo(s2);
                }).map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).forEach(x -> {
            System.out.println("foreach -> " + x);
        });
    }


    private static void test4(List<String> strings) {
        strings.stream()
                .sorted((s1, s2) -> {
                    System.out.println("Sorting -> " + s1 + " ," + s2);
                    return s1.compareTo(s2);
                })
                .filter(x -> {
                    System.out.println("filtering -> " + x);
                    return x.startsWith("b");
                }).map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).forEach(x -> {
            System.out.println("foreach -> " + x);
        });
    }

    private static void test3(List<String> strings) {
        strings.stream().filter(x -> {
            System.out.println("filtering -> " + x);
            return x.startsWith("b");
        }).map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).forEach(x -> {
            System.out.println("foreach -> " + x);
        });
    }

    private static void test2(List<String> strings) {
        strings.stream().map(x -> {
            System.out.println("Mapping -> " + x);
            return x.toUpperCase();
        }).filter(x -> {
            System.out.println("filtering -> " + x);
            return x.startsWith("B");
        }).forEach(x -> {
            System.out.println("foreach -> " + x);
        });

    }

    private static void test1(List<String> strings) {
        strings.stream().filter(x -> {
            System.out.println("Filtering -> " + x);
            return true;
        }).forEach(x -> {
            System.out.println("foreach -> " + x);
        });
    }
}
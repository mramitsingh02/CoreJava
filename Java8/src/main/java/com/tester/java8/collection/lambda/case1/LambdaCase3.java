package com.tester.java8.collection.lambda.case1;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaCase3 {

    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("Foo"));
        System.out.println(predicate.negate().test("Foo"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        System.out.println(nonNull.test("Amit".contains("A")));

        Function<String, Integer> function = Integer::valueOf;
        Function<String, String> backToString = function.andThen(String::valueOf);
        Function<String, String> function2 = String::intern;
        String s7 = "Hello";
        System.out.println(function2.apply( new String("Hello")));
        System.out.println(backToString.apply("123"));

        Comparator<String> comparator = (s1, s2) -> s2.compareTo(s1);
        List<String> lst = Arrays.asList("Amit", "Arpit");

        lst.sort(comparator);
        System.out.println(lst);

        Runnable runnable = () -> System.out.println(UUID.randomUUID());
        runnable.run();

        Callable<UUID> callable = UUID::randomUUID;
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @FunctionalInterface
    public interface Foo {
        void foo();
    }

}
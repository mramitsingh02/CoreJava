package com.tester.java8.collection.optional.case1;

import java.util.Optional;

public class OptionalCase1 {
    public static void main(String[] args) {
       // Optional.ofNullable(null).orElseThrow(RuntimeException::new);
        Optional<String> optionalS = Optional.ofNullable("Amit");
        optionalS.ifPresent(System.out::println);
        System.out.println(optionalS.isPresent());
        System.out.println(optionalS.get());
        optionalS.orElse("Singh");

       // optionalS.ifPresentOrElse(System.out::println, () -> System.out.println("Running"));

    }

}
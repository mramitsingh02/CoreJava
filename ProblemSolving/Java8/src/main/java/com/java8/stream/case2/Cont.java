package com.java8.stream.case2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cont {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("JAVA", "SPRING", "JAVA", "SWING");

        li.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " = " + v));




    }

}

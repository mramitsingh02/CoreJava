package com.tester.java8.collection.lambda.cash3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        String str = "Hi Amit How are you doing. I am doing good, how r u doing. I am doing good.";

        TreeMap<Character, Integer> collect = str.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isAlphabetic)
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, TreeMap::new));
        System.out.println(collect);


    }
}
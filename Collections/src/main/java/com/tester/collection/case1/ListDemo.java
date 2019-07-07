package com.tester.collection.case1;

import com.google.common.base.Supplier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListDemo {
    public static void main(String[] args) {
       // List<String> list = new ArrayList<>(500);
        List<String> list =  IntStream.range(1, 200).mapToObj(() -> randomAlphaNumeric(20)).collect(Collectors.toList());

     /*   for (int i = 1; i <= 200; i++) {
            list.add(randomAlphaNumeric(20));
        }*/
        list.forEach(System.out::println);
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}

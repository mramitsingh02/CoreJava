package com.tester.java8.collection.stream.case12;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SecureRandomCase {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom(new byte[]{1, 3, 3, 7});
        int[] ints = IntStream.generate(secureRandom::nextInt).filter(x -> x > 0).limit(10).toArray();
        System.out.println(Arrays.toString(ints));


        int[] ints1 = IntStream.iterate(1, n -> n * 2).limit(11).toArray();
        System.out.println(Arrays.toString(ints1));


    }

}
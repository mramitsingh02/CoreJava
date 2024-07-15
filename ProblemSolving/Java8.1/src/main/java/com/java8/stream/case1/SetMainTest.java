package com.java8.stream.case1;

import java.util.HashSet;
import java.util.Set;

public class SetMainTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        String s1 = new String("Hello");
        String s2 = null;
        String s3 = null;
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());
    }
}

package com.tester.collection.map.case2;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("BB", "b");

        Set<String> s = map.keySet();
        Collection<String> c = map.values();
        Set<String> sa = new HashSet<>(c);
        System.out.println(c);
        System.out.println(sa);
        /*for (String s1: c) {
            System.out.println(s1);
        }*/


    }
}

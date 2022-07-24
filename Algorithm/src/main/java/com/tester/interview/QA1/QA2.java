package com.tester.interview.QA1;

import java.util.*;

public class QA2 {
    public static void main(String[] args) {
        Map<Integer, Integer> unSortedMap = new HashMap<>();
        unSortedMap.put(1, 3);
        unSortedMap.put(2, 4);
        unSortedMap.put(3, 2);
        unSortedMap.put(4, 5);
        unSortedMap.put(6, 1);
        System.out.println(unSortedMap);
        TreeMap<Integer, Integer> reverseSortedMap = new TreeMap<>();

        unSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getValue(), x.getKey()));

        System.out.println(reverseSortedMap);
    }

    public static class IntegerReverse implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

}

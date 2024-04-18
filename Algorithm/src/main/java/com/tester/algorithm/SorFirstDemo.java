package com.tester.algorithm;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SorFirstDemo {
    public static void main(String[] args) {
        int[] values = new int[]{2, 3, 3, 2, 2, 2, 1, 3, 1, 1, 5, 1, 1};

        Map<Integer, Integer> mapOfInteger = new LinkedHashMap<>();


        for (final int value : values) {
            if (mapOfInteger.containsKey(value)) {
                mapOfInteger.put(value, mapOfInteger.get(value) + 1);
            } else {
                mapOfInteger.put(value, 1);
            }
        }

//        SortMapByValue.sort(mapOfInteger);


   /*     mapOfInteger.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> {
            System.out.println(x.getKey() + " " + x.getValue());
        });*/
        mapOfInteger.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> {
            System.out.println(x.getKey() + " " + x.getValue());
        });
        Map<Integer, Integer> topTen =
                mapOfInteger.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(topTen);


    }

    private static class ValueComparator implements Comparator<Integer> {
        @Override
        public int compare(final Integer o1, final Integer o2) {
            return o1 - o2;
        }
    }

    private static class SortMapByValue {
        public static void sort(final Map<Integer, Integer> mapOfInteger) {
            Map<Integer, Integer> remapOfInteger = new LinkedHashMap<>();
            mapOfInteger.values();


        }
    }
}

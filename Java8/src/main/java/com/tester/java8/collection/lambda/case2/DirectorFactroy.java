package com.tester.java8.collection.lambda.case2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectorFactroy {
    static Map<Integer, List<Director>> map = new HashMap<>();

    static {
        map.put(1, Arrays.asList(new Director("Rajamouli", "1234567890", ""), new Director("Arpit", "1234567891", "")));
        map.put(2, Arrays.asList(new Director("Amit", "1234567890", ""), new Director("Salim", "1234567891", "")));
        map.put(3, Arrays.asList(new Director("Arpit", "1234567890", ""), new Director("Amit", "1234567891", "")));
        map.put(4, Arrays.asList(new Director("Priyam", "1234567890", ""), new Director("Priya", "1234567891", "")));

    }

    public static List<Director> getDirectors(int i) {
        return map.get(i);
    }
}

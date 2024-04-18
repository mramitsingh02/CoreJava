package com.tester.java8.collection.lambda.case1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DuplicateNumber {
    public static void main(String[] args) {
        int[] ints = {1, 34, 53, 21, 57, 32, 34, 67, 23, 64, 5, 3, 23, 24, 85};
//list of duplicate numbers
        List<Integer> duplicate = Arrays.stream(ints).boxed().collect(Collectors.toList());

        System.out.println(duplicate);
//list of unique numbers
        List<Integer> collect = Arrays.stream(ints).distinct().mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.println(collect);

        String words = "Java developers are Just Awesome";
//
        // find the first non-repeating character in a string
        final Character character = words.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);


        System.out.println(words.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null));

    }
}

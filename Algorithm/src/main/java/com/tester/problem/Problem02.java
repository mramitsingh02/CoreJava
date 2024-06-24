package com.tester.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem02 {
    public static void main(String[] args) {
        int array[] = new int[]{10, 15, 8, 49, 25, 98, 98, 32, 15};
        Set<Integer> duplicate = new HashSet<>();
        System.out.println(Arrays.stream(array).filter(x -> !duplicate.add(x)).findFirst().orElse(-1));
        duplicate.clear();
        System.out.println(Arrays.stream(array).filter(x -> !duplicate.add(x)).mapToObj(String::valueOf).collect(Collectors.toList()));
    }
}

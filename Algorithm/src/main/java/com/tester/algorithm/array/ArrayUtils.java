package com.tester.algorithm.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayUtils {

    public static void printArrayElement(String msg, int[] ints) {
        System.out.println(msg);
        String collect = Arrays.stream(ints)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }

    public static int findPivot(int[] elements, int start, int end) {
        if (end < start) {
            return -1;
        }
        if (start == end) {
            return start;
        }
        int mid = (end + start) / 2;

        if (mid < end && elements[mid] > elements[mid + 1]) {
            return mid;
        }
        if (mid > start && elements[mid] < elements[mid - 1]) {
            return mid - 1;
        }

        if (elements[start] >= elements[mid]) {
            return findPivot(elements, start, mid - 1);
        }
        return findPivot(elements, mid + 1, end);

    }
}
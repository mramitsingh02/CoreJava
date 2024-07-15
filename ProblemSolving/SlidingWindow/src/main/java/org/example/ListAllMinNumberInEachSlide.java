package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListAllMinNumberInEachSlide {
    public static void main(String[] args) {
        int input[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        System.out.println(solveUsingSlidingWindows(input, k));
    }

    private static List<Integer> solveUsingSlidingWindows(int[] array, int k) {

        List<Integer> allPossibleSet = new ArrayList<>();
        int i = 0, j = 0;
        while (j - i + 1 < k) {
            j++;
        }
        while (j < array.length) {

            allPossibleSet.add(findMaxInSubset(array, i, j));
            i++;
            j++;
        }
        return allPossibleSet;

    }

    private static int findMaxInSubset(int[] array, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            max = Math.max(max, array[k]);
        }
        return max;
    }
}

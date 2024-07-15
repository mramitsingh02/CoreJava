package org.example;

import org.example.util.Pair;

import java.util.*;

public class ListSetOfSumNumber {
    public static void main(String[] args) {
        int input[] = {2, 5, 16, 1, 7, 8, 6, 4, 3};
        // [[7,3,1,4], [6,4,2,3]]
        int k = 4;
        int sum = 15;

        System.out.println(solveUsingSlidingWindows(input, k, sum));
        System.out.println(solveUsingSlidingWindowOptimized(input, k, sum));
    }

    private static List<String> solveUsingSlidingWindows1(int[] array, int k, int sum) {
        List<String> allPossibleSet = new ArrayList<>();
        Deque<Pair> possibleValue = new LinkedList<>();
        int i = 0, j = 0;
        int sumOfSubSet = 0;
        while (j - i + 1 < k) {
            j++;
            sumOfSubSet = sumOfSubset(array, i, j);
        }
        while (j < array.length){

            sumOfSubSet += array[i];
            if (sumOfSubSet == sum) {
                allPossibleSet.add(Arrays.toString(Arrays.copyOfRange(array, i, j + 1)));
            }


        }


            return allPossibleSet;
    }

    private static List<String> solveUsingSlidingWindowOptimized(int[] array, int k, int sum) {

        List<String> allPossibleSet = new ArrayList<>();
        int i = 0, j = 0;
        int sumOfSubSet = sumOfSubset(array, i, j);
        while (j - i + 1 < k) {
            j++;
            sumOfSubSet = sumOfSubset(array, i, j);
        }
        while (j < array.length - 1) {

            if (sumOfSubSet == sum) {
                allPossibleSet.add(Arrays.toString(Arrays.copyOfRange(array, i, j + 1)));
            }
            sumOfSubSet -= array[i];
            i++;
            j++;
            sumOfSubSet += array[j];
        }
        return allPossibleSet;

    }

    private static List<String> solveUsingSlidingWindows(int[] array, int k, int sum) {

        List<String> allPossibleSet = new ArrayList<>();
        int i = 0, j = 0;
        while (j - i + 1 < k) {
            j++;
        }
        while (j < array.length) {

            int sumOfSubSet = sumOfSubset(array, i, j);
            if (sumOfSubSet == sum) {
                allPossibleSet.add(Arrays.toString(Arrays.copyOfRange(array, i, j + 1)));
            }
            i++;
            j++;
        }
        return allPossibleSet;

    }

    private static int sumOfSubset(int[] array, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += array[k];
        }
        return sum;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class RemoveMinumNumberAndAdjesent2NumberIsEvenInEachSlide {
    public static void main(String[] args) {
        int input[] = {5, 3, 2, 7, 8, 15};
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

            allPossibleSet.add(findMinNumberWhereSumOfAdjecentIsEven(array, i, j));
            i++;
            j++;
        }
        return allPossibleSet;

    }

    private static int findMinNumberWhereSumOfAdjecentIsEven(int[] array, int i, int j) {

        for (int k = i; k <= j; k++) {
            if (array[k] < 0) {
                return array[k];
            }
        }
        return 0;
    }
}

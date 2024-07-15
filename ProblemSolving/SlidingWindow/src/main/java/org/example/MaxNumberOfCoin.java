package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberOfCoin {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int value = 43;

        List<Integer> lst = findListOfCoins(input, value);


    }

    private static List<Integer> findListOfCoins(int[] input, int value) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int sum = 0;
        while (j < input.length) {
            sum += input[j];
            if (sum > value) {
                sum -= input[j];
            }
            list.add(input[j]);

            if (sum == value)
            {
                return list;
            }
            else
            {
                j++;
            }
        }
        return list;
    }
}

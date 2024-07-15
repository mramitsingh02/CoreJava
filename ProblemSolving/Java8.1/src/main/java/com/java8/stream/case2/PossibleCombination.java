package com.java8.stream.case2;

import java.util.Arrays;

public class PossibleCombination {
    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);
    }

    private static void generatePermutation(String str, int start, int end) {
        if (start == end - 1) {
            System.out.println(str);
        } else {
            //Swapping the string by fixing a character
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str, start + 1, end);
                //Backtracking and swapping the characters again.
                str = swapString(str, start, i);
            }
        }

    }

    private static String swapString(String str, int start, int end) {
        char[] charArray = str.toCharArray();
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        return Arrays.toString(charArray);
    }
}

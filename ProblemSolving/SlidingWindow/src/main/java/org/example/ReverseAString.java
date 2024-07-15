package org.example;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "Hello World";

        char[] chars = input.toCharArray();
        System.out.println(input);
        int left = 0, right = chars.length - 1;
        while (left != right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;

        }
        System.out.println(String.valueOf(chars));
    }
}

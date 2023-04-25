package com.tester.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class RomanNumberGenerator {

    public static void main(String[] args) {
        RomanNumberGenerator romanNumberGenerator = new RomanNumberGenerator();
        System.out.println(romanNumberGenerator.romanToInt("III") == 3);
        System.out.println(romanNumberGenerator.romanToInt("LVIII") == 58);
        System.out.println(romanNumberGenerator.romanToInt("MCMXCIV") == 1994);
    }

    public int romanToInt(String s) {

        char[] words = s.toCharArray();
        int sum = 0;
        int numberArr[] = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numberArr[i] = getNumber(words[i]);
        }
        int previousValue = 0;
        for (int i = numberArr.length - 1; i >= 0; i--) {
            if (i > 0) {
                previousValue = numberArr[i - 1];
            }
            int currentValue = numberArr[i];
            if (previousValue < currentValue) {
                sum += (currentValue - previousValue);
                previousValue = 0;
                i--;
            } else {
                sum += currentValue;
            }
        }
        List<String> l = new ArrayList<>();
//        l.in

        return sum;
    }


    public static int getNumber(char word) {

        switch (word) {

            case 'I':
                return 1;
            case 'i':
                return 1;
            case 'v':
                return 5;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'x':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }


}


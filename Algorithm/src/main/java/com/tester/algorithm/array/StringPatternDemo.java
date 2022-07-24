package com.tester.algorithm.array;

public class StringPatternDemo {
    public static void main(String[] args) {

        // aaabbaab
        // a3b2a2b1a

        String input = "aaabbaab";


        char[] inputInCharArray = input.toCharArray();
        char currentValue = inputInCharArray[0];
        int counter = 0;
        String newString = "";
        for (int i = 0; i < inputInCharArray.length; i++) {
            if (((char) currentValue) == inputInCharArray[i]) {
                counter++;
            } else {
                newString += String.valueOf((char) currentValue) + counter;
                currentValue = inputInCharArray[i];
                counter = 1;
                if (i == inputInCharArray.length - 1) {
                    newString += String.valueOf((char) currentValue) + counter;
                }
            }

        }
        System.out.println(newString);
    }
}

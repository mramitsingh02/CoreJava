package com.tester.case1;

import java.util.Arrays;

public class DuplicateStringCountUsingArrayMainClass {
    public static void main(String[] args) {
        String input = "Afgs23asSGHS";
 /*       char[] chars = input.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);*/
        System.out.println(duplicateCount(input));
    }

    public static String duplicateCount(String input) {

        char[] charArray = input.toCharArray();
        int xSize = charArray.length;
        int ySize = 2;

        String[] result = new String[xSize];
        int arrayFillSize = 0;
        for (int index = 0; index < xSize; index++) {
            String currentValue = Character.toString(charArray[index]);
            int currentIndex;
            if ((currentIndex = findValueInArray(result, currentValue, xSize)) != -1) {
                int nextCount = Integer.valueOf(result[currentIndex].substring(1)) + 1;
                result[currentIndex] = currentValue + nextCount;
            } else {
                result[arrayFillSize] = currentValue + "1";
                arrayFillSize++;
            }
        }

        result = (String[]) Arrays.copyOf(result, arrayFillSize);
        Arrays.sort(result);
        return display(result);
    }

    private static String display(String[] result) {
        StringBuilder sn = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            sn.append(result[i]);
        }
        return sn.toString();
    }

    private static int findValueInArray(String[] result, String currentValue, int xSize) {
        int currentIndex;
        for (currentIndex = 0; currentIndex < xSize; currentIndex++) {
            String temp = result[currentIndex];
            if (temp == null) {
                break;
            }
            if (temp.startsWith(currentValue)) {
                return currentIndex;
            }
        }
        return -1;
    }


}

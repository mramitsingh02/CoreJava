package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

public class SumOfAllElements {
    public static void main(String[] args) {
        SumOfAllElements thisInstance = new SumOfAllElements();
        System.out.println("Approach 1 : "+ thisInstance.sum(SortUtils.duplicateElements));
        System.out.println("Approach 2 : "+thisInstance.sum(SortUtils.duplicateElements, 0, SortUtils.duplicateElements.length - 1));
        int abc = 0;
        System.out.println();

    }

    public int sum(int[] elements) {
        int value = 0;
        for (int i = 0; i < elements.length; i++) {
            value += elements[i];
        }
        return value;
    }


    public int sum(int[] elements, int start, int end) {
        if (start < end) {
            int m = (end + start) / 2;
            int i1 = sum(elements, start, m);
            int i2 = sum(elements, m + 1, end);
            return i1 + i2;
        }
        return elements[start];
    }

}

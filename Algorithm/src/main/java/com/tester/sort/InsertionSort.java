package com.tester.sort;

import java.util.Arrays;


public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort thisInstance = new InsertionSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements);
        System.out.println(Arrays.toString(elements));
    }


    public void sort(int[] elements) {

        for (int i = 1; i < elements.length; i++) {
            int iValue = elements[i];
            int j = i - 1;
            for (; j >= 0 && elements[j] > iValue; j--) {
                int jValue = elements[j];
                elements[j + 1] = jValue;
            }
            elements[j + 1] = iValue;
        }
    }


}

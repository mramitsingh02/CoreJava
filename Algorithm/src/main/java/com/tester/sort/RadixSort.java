package com.tester.sort;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        RadixSort thisInstance = new RadixSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements);
        System.out.println(Arrays.toString(elements));
    }

    public void sort(int[] elements) {
        int arrayLen = elements.length;
        int maxValue = SortUtils.maxValue(elements);
        int numberOfDigit = SortUtils.numberOfDigit(maxValue);
        int[] output = new int[arrayLen];
        for (int index = 1; maxValue / index > 0; index = index * 10) {
            int[] count = new int[10];
            for (int i = 0; i < arrayLen; i++) {
                ++count[((elements[i] / index) % 10)];
            }

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            for (int i = count.length - 1; i >= 0; i--) {
                output[count[((elements[i] / index) % 10) - 1]] = elements[i];
                count[((elements[i] / index) % 10)]--;
            }
            SortUtils.print(output);

            for (int i = 0; i < output.length; i++) {
                elements[i] = output[i];
            }
            SortUtils.print(elements);
        }


    }

}

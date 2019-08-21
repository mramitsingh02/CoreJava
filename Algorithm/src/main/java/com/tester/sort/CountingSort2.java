package com.tester.sort;

import java.util.Arrays;

public class CountingSort2 {
    public static void main(String[] args) {
        CountingSort2 thisInstance = new CountingSort2();
        thisInstance.sort(SortUtils.DUPLICATE_ELEMENTS);
        SortUtils.print(SortUtils.DUPLICATE_ELEMENTS);
    }

    public void sort(int[] elements) {
        int range = Arrays.stream(elements).max().getAsInt();
        int[] newElements = new int[range + 1];
        Arrays.fill(newElements, 0);
        int[] output = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            ++newElements[elements[i]];
        }
        for (int i = 1; i <= newElements.length - 1; i++) {
            newElements[i] += newElements[i - 1];
        }


        for (int i = elements.length - 1; i >= 0; i--) {
            output[newElements[elements[i]] - 1] = elements[i];
            --newElements[elements[i]];
        }
        for (int i = 0; i < output.length; i++) {
            elements[i] = output[i];
        }


    }
}

package com.tester.sort;

public class CountingSort {
    public static void main(String[] args) {
        CountingSort thisInstance = new CountingSort();
        thisInstance.sort(SortUtils.duplicateElements, 122);
    }

    public void sort(int[] elements, int range) {
        int[] newElements = new int[range + 1];
        int[] output = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            newElements[elements[i]]++;
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

package com.tester.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort thisInstance = new MergeSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements, 0, elements.length - 1);
        System.out.println(Arrays.toString(elements));
    }

    public void sort(int[] elements, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = (endIndex + startIndex) / 2;
            sort(elements, startIndex, middleIndex);
            sort(elements, middleIndex + 1, endIndex);
            merge(elements, startIndex, middleIndex, endIndex);
        }
    }


    private void merge(int[] elements, int startIndex, int middleIndex, int endIndex) {
        int num1 = middleIndex - startIndex + 1;
        int num2 = endIndex - middleIndex;
        int[] L = new int[num1];
        for (int i = 0; i < num1; ++i) {
            L[i] = elements[startIndex + i];
        }
        int[] R = new int[num2];
        for (int i = 0; i < num2; ++i) {
            R[i] = elements[middleIndex + 1 + i];
        }
        int k = startIndex;
        int i = 0, j = 0;
        for (; i < num1 && j < num2; ) {
            if (L[i] < R[j]) {
                elements[k] = L[i];
                i++;
            } else {
                elements[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < num1) {
            elements[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < num2) {
            elements[k] = R[j];
            j++;
            k++;
        }

    }

    private void swap(int[] elements, int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

}

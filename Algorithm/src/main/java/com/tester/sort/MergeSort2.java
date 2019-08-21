package com.tester.sort;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        MergeSort2 thisInstance = new MergeSort2();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements, 0, elements.length - 1);
        System.out.println(Arrays.toString(elements));
    }

    public void sort(int[] elements, int start, int end) {
        if (start < end) {
            int middle = (end + start) / 2;
            sort(elements, start, middle);
            sort(elements, middle + 1, end);
            merge(elements, start, middle, end);

        }

    }

    private void merge(int[] elements, int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = elements[start + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = elements[middle + 1 + i];
        }
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                elements[k] = L[i];
                i++;
            } else {
                elements[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            elements[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            elements[k] = R[j];
            j++;
            k++;
        }
    }
}

package com.tester.sort;

import static com.tester.sort.SortUtils.swap;


public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort thisInstance = new SelectionSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements);
        SortUtils.print(elements);
    }

    public void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < elements.length; j++) {
                int jValue = elements[j];
                int iValue = elements[min_index];
                if (jValue <= iValue) {
                    min_index = j;
                }
            }
            swap(elements, min_index, i);
        }
    }
}

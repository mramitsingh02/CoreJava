package com.tester.sort;

import java.util.Arrays;

import static com.tester.sort.SortUtils.swap;


public class QuickSort {
    public static void main(String[] args) {
        QuickSort thisInstance = new QuickSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements, 0, elements.length - 1);
        System.out.println(Arrays.toString(elements));
    }

    public void sort(int[] elements, int low, int high) {
        if (low < high) {
            int pi = partition(elements, low, high);
            sort(elements, low, pi - 1);
            sort(elements, pi + 1, high);
        }
    }

    private int partition(int[] elements, int low, int high) {
        int pivot = elements[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (elements[j] <= pivot) {
                i++;
                swap(elements, i, j);
            }
        }
        swap(elements, i + 1, high);

        return i + 1;
    }


}

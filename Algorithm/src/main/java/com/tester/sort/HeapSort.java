package com.tester.sort;

import java.util.Arrays;

import static com.tester.sort.SortUtils.swap;

public class HeapSort {
    public static void main(String[] args) {
        HeapSort thisInstance = new HeapSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements);
        System.out.println(Arrays.toString(elements));
    }

    public void sort(int[] elements) {
        int n = elements.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(elements, n, i);
        }
        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            swap(elements, 0, i);
            heapify(elements, i, 0);
        }
    }

    private void heapify(int[] elements, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && elements[left] > elements[largest]) {
            largest = left;
        }

        if (right < n && elements[right] > elements[largest]) {
            largest = right;
        }

        if (i != largest) {
            swap(elements, largest, i);
            heapify(elements, n, largest);
        }
    }


}

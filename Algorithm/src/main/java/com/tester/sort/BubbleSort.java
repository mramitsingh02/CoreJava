package com.tester.sort;

import static com.tester.sort.SortUtils.swap;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort thisInstance = new BubbleSort();
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements);
        SortUtils.print(elements);
    }

    public void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1; j++) {
                if (elements[i] < elements[j]) {
                    swap(elements, i, j);
                    System.out.print("Changes -> (" + i + ", " + j + ") :");
                    SortUtils.print(elements);
                }/* else {
                    System.out.print("No Changes -> (" + i + ", " + j + ") :");
                    SortUtils.print(elements);
                }*/
            }
        }
    }


}

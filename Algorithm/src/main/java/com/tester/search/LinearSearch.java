package com.tester.search;

import com.tester.sort.MergeSort;
import com.tester.sort.SortUtils;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch thisInstance = new LinearSearch();
        new MergeSort().sort(SortUtils.elements, 0, SortUtils.elements.length - 1);
        if (thisInstance.search(SortUtils.elements, 5)) {
            System.out.println("Item Found.");
        } else {
            System.out.println("Item Not Found.");
        }
    }

    public boolean search(int[] elements, int searchItem) {
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == searchItem) {
                return true;
            }
        }


        return false;

    }
}

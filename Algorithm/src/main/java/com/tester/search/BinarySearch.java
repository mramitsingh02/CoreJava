package com.tester.search;

import com.tester.sort.MergeSort;
import com.tester.sort.SortUtils;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch thisInstance = new BinarySearch();
        new MergeSort().sort(SortUtils.elements, 0, SortUtils.elements.length - 1);
        if (thisInstance.search(SortUtils.elements, 0, SortUtils.elements.length, 11)) {
            System.out.println("Item Found.");
        } else {
            System.out.println("Item Not Found.");
        }
    }

    public boolean search(int[] elements, int star, int end, int searchItem) {

        if (star >= 0) {
            int middle = (end - star) / 2;
            if (elements[middle] == searchItem) {
                return true;
            } else if (elements[middle] < searchItem) {
                return search(elements, middle + 1, end, searchItem);
            } else {
                return search(elements, star, middle, searchItem);
            }

        }
        return false;
    }
}

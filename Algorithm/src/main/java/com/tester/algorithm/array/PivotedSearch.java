package com.tester.algorithm.array;

import com.tester.sort.SortUtils;


public class PivotedSearch {
    public static void main(String[] args) {
        PivotedSearch thisInstance = new PivotedSearch();
        int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 5;
        SortUtils.print("Input :", elements);
        int keyIndex = thisInstance.pivotBinarySearch(elements, key);
        SortUtils.print("Output :", elements);
        if (keyIndex != -1) {
            System.out.format("Found key %d at %d index", key, keyIndex);
            System.out.println();
        } else {
            System.out.format("Not found %d.", key);
            System.out.println();
        }

    }

    //5) Search an element in a sorted and rotated array
    public int pivotBinarySearch(int[] elements, int key) {
        int length = elements.length - 1;
        int pivot = findPivot(elements, 0, length);
        if (pivot == -1) {
            return this.binarySearch(elements, 0, length, key);
        }

        if (elements[pivot] == key) {
            return pivot;
        } else if (elements[0] <= key) {
            return this.binarySearch(elements, 0, pivot, key);
        } else if (elements[pivot] > key)
            return this.binarySearch(elements, pivot, length, key);
        return -1;
    }

    private int binarySearch(int[] elements, int start, int end, int key) {
        if (end < start) {
            return -1;
        } else {
            int middle = (end + start) / 2;
            if (elements[middle] == key) {
                return middle;
            } else if (key > elements[middle]) {
                return binarySearch(elements, middle + 1, end, key);
            } else {
                return binarySearch(elements, start, middle - 1, key);
            }
        }
    }

    public int findPivot(int[] elements, int start, int end) {
        if (end < start) {
            return -1;
        }
        if (start == end) {
            return start;
        }
        int mid = (end + start) / 2;

        if (mid < end && elements[mid] > elements[mid + 1]) {
            return mid;
        }
        if (mid > start && elements[mid] < elements[mid - 1]) {
            return mid - 1;
        }

        if (elements[start] >= elements[mid]) {
            return findPivot(elements, start, mid - 1);
        }
        return findPivot(elements, mid + 1, end);

    }

}



package com.tester.algorithm.array;

import com.tester.sort.SortUtils;


public class FindSumOfPairExisted2 {
    public static void main(String[] args) {
        FindSumOfPairExisted2 thisInstance = new FindSumOfPairExisted2();
        int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        // int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 21;
        SortUtils.print("Input :", elements);
        boolean keyIndex = thisInstance.isSumOfPairExist(elements, key);
        SortUtils.print("Output :", elements);
        if (!keyIndex) {
            System.out.format("Pair of %d sum Not found in this array.", key);
            System.out.println();
        } else {
            System.out.format("Pair of %d sum Found in this array", key);
            System.out.println();
        }

    }

    private boolean isSumOfPairExist(int[] elements, int sumValue) {

        int low = 0;
        int high = elements.length - 1;
        int pivotPoint = findPivot(elements, low, high);
        int firstValueIndex = low;
        if (pivotPoint == -1) {
            return findSumPair(elements, low, high, firstValueIndex, sumValue);
        } else {
            firstValueIndex = elements[pivotPoint];
            return findSumPair(elements, pivotPoint, high, firstValueIndex, sumValue);


        }
    }

    private boolean findSumPair(int[] elements, int low, int high, int firstValueIndex, int sumValue) {
        int result = -1;
        if (low > high) {
            return false;
        } else if (firstValueIndex >= sumValue) {
            return false;
        } else {
            int secondValue = sumValue - elements[firstValueIndex];
            result = binarySearch(elements, low, high, secondValue);
            if (result == -1) {
                return findSumPair(elements, low + 1, high, firstValueIndex + 1, sumValue);
            } else {
                return true;
            }
        }
    }

    private int binarySearch(int[] elements, int low, int high, int secondValue) {

        if (high > low) {
            int mid = (low + high) / 2;
            if (elements[mid] == secondValue) {
                return mid;
            }

            if (elements[mid] > secondValue) {
                return binarySearch(elements, low, mid, secondValue);
            } else {
                return binarySearch(elements, mid + 1, high, secondValue);
            }
        }
        return -1;
    }

    private int findPivot(int[] elements, int low, int high) {

        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }
        int mid = (low + high) / 2;

        if (mid < high && elements[mid] > elements[mid + 1]) {
            return mid;
        }
        if (mid > low && elements[mid] < elements[mid - 1]) {
            return mid - 1;
        }
        if (elements[low] >= elements[mid]) {
            return findPivot(elements, low, mid - 1);
        } else {
            return findPivot(elements, mid + 1, high);
        }
    }

}



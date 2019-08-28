package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

class Pair {
    private String firstValue;
    private String secondValue;


    public Pair(String firstValue, String secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue='" + firstValue + '\'' +
                ", secondValue='" + secondValue + '\'' +
                '}';
    }
}

public class FindSumOfPairExisted {
    public static void main(String[] args) {
        FindSumOfPairExisted thisInstance = new FindSumOfPairExisted();
        int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        //int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 22;
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
        int pivotPoint = -1;
        for (int i = high - 1; i > 0; i--) {
            if (elements[i] < elements[i - 1]) {
                pivotPoint = i - 1;
            }
        }
        System.out.println("Pivot Point : " + pivotPoint);
        if (pivotPoint == -1) {
            return findSumPair(elements, low, high, sumValue);
        } else {
            low = (pivotPoint + low) / elements.length;
            high = pivotPoint;
            return findSumPair(elements, low, high, pivotPoint, sumValue);
        }
    }

    private boolean findSumPair(int[] elements, int low, int high, int sumValue) {
        while (low != high) {
            int firstValue = elements[low];
            int index = 0;
            for (index = 0; index < high; index++) {
                if ((firstValue + elements[index + 1]) == sumValue) {
                    return true;
                }
            }
            low++;
        }
        return false;
    }

    private boolean findSumPair(int[] elements, int low, int high, int pivotPoint, int sumValue) {
        while (low != high) {
            int firstValue = elements[low];
            int index = 0;
            for (index = 0; index < high; index++) {
                if ((firstValue + elements[index + 1]) == sumValue) {
                    return true;
                }
            }
            high = (pivotPoint + low) / elements.length;
        }
        return false;
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



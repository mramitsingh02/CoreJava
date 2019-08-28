package com.tester.algorithm.array;

public class FindTheMinimumElementInArray {
    public static void main(String[] args) {
        FindTheMinimumElementInArray thisInstance = new FindTheMinimumElementInArray();
        //int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int minimumElement = thisInstance.findMinimumElement(elements);
        int rotationTime = thisInstance.rotationTime(elements);

        System.out.println(rotationTime);
        System.out.println(minimumElement);
    }

    private int rotationTime(int[] elements) {
        int result = findPivot(elements, 0, elements.length - 1);
        if (result != -1) {
            return elements.length - result;
        }

        return 0;
    }

    public int findMinimumElement(int[] elements) {

        int result = -1;
        int low = 0;
        int high = elements.length - 1;
        result = findPivot(elements, low, high);
        if (result == -1)
            return elements[0];
        else
            return elements[result + 1];
    }

    private int findPivot(int[] elements, int low, int high) {

        if (high < low) {
            return -1;
        } else if (high == low) {
            return low;
        }
        int mid = (high + low) / 2;
        if (mid < high && elements[mid] > elements[mid + 1]) {
            return mid;
        } else if (mid > low && elements[mid] < elements[mid - 1]) {
            return mid - 1;
        }
        if (elements[low] >= elements[mid]) {
            return findPivot(elements, low, mid - 1);
        } else {
            return findPivot(elements, mid + 1, high);
        }
    }

}

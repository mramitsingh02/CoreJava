package com.tester.algorithm.array;

public class FindRotationCount {
    public static void main(String[] args) {
        FindRotationCount thisInstance = new FindRotationCount();
        int[] arrayVar = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int rotationPoint = thisInstance.countRotation2(arrayVar);
        System.out.println("Rotation Count : " + rotationPoint);
    }

    public int countRotation(int[] arrayVar) {
        int min_index = -1;
        int min = arrayVar[0];
        for (int i = 0; i < arrayVar.length; i++) {
            if (min > arrayVar[i]) {
                min = arrayVar[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public int countRotation2(int[] arrayVar) {
        int min_index = -1;
        int high = arrayVar.length - 1;
        int low = 0;
        min_index = findPivot(arrayVar, low, high);
        if (min_index == -1) {
            return countRotation(arrayVar);
        }

        return min_index + 1;
    }

    private int findPivot(int[] arrayVar, int low, int high) {
        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }
        int mid = (high + low) / 2;
        if (mid < high && arrayVar[mid] > arrayVar[mid + 1]) {
            return mid;
        }
        if (mid > low && arrayVar[mid] < arrayVar[mid - 1]) {
            return mid - 1;
        }
        if (arrayVar[mid] <= arrayVar[low])
            return findPivot(arrayVar, low, mid - 1);
        else
            return findPivot(arrayVar, mid + 1, high);
    }

}

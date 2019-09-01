package com.tester.algorithm.array;

import com.tester.algorithm.array.util.RotateStage;
import com.tester.sort.SortUtils;

//Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
public class FindMaximumValueOfSum {
    public static void main(String[] args) {
        FindMaximumValueOfSum thisInstance = new FindMaximumValueOfSum();
        int[] elements = {1, 20, 2, 10};//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rotationTimes = 2;
        int rotationPoint = thisInstance.maxValue(elements, rotationTimes, RotateStage.LEFT);
        SortUtils.print(elements);
        System.out.println("Max Value : " + rotationPoint);
        SortUtils.print(elements);

        int[] elements1 = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotationTimes = 9;
        int maxValue = thisInstance.maxValue(elements1, rotationTimes, RotateStage.RIGHT);
        SortUtils.print(elements1);
        System.out.println("Max Value : " + maxValue);
        SortUtils.print(elements1);
    }

    public int maxValue(int[] arrayVar, int rotationTimes, RotateStage rotateStage) {
        rotateArrayWithStage(arrayVar, rotationTimes, rotateStage);
        return findSum(arrayVar);
    }

    private int findSum(int[] elements) {
        int sum = 0;
        for (int i = elements.length - 1; i > 0; i--) {
            sum += i * elements[i];
        }
        return sum;
    }

    private void rotateArrayWithStage(int[] arrayVar, int rotationTimes, RotateStage rotateStage) {
        if (rotationTimes > 0) {
            if (RotateStage.LEFT.equals(rotateStage)) {
                shiftToLeft(arrayVar, rotationTimes);
            } else {
                shiftToRight(arrayVar, rotationTimes);
            }
        }
    }

    private void shiftToLeft(int[] arrayVar, int rotationTimes) {

        if (rotationTimes > 0 && nonEmpty(arrayVar)) {
            int backup = arrayVar[0];
            for (int i = 0; i < arrayVar.length - 1; i++) {
                arrayVar[i] = arrayVar[i + 1];
            }
            arrayVar[arrayVar.length - 1] = backup;
            shiftToLeft(arrayVar, rotationTimes - 1);
        }
    }

    private boolean nonEmpty(int[] arrayVar) {
        if (arrayVar != null && arrayVar.length > 0) {
            return true;
        }

        return false;
    }

    private void shiftToRight(int[] arrayVar, int rotationTimes) {
        if (rotationTimes > 0 && nonEmpty(arrayVar)) {
            int backup = arrayVar[arrayVar.length - 1];
            for (int i = arrayVar.length - 1; i > 0; i--) {
                arrayVar[i] = arrayVar[i - 1];
            }
            arrayVar[0] = backup;
            shiftToRight(arrayVar, rotationTimes - 1);
        }
    }


}

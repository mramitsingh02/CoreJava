package com.tester.algorithm.array;

import com.tester.algorithm.array.util.RotateStage;

//Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
public class FindMaximumOfSumValueForAllRotation {
    public static void main(String[] args) {
        FindMaximumOfSumValueForAllRotation thisInstance = new FindMaximumOfSumValueForAllRotation();
        int[] elements = {1, 20, 2, 10};//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxValue = thisInstance.sumValueForEachRotation(elements, RotateStage.RIGHT);
        System.out.println("Maximum Value : " + maxValue);

        int[] elements1 = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int maxValue1 = thisInstance.sumValueForEachRotation(elements1, RotateStage.RIGHT);
        System.out.println("Maximum Value : " + maxValue1);

    }

    public int sumValueForEachRotation(int[] arrayVar, RotateStage rotateStage) {
        int max = 0;

        for (int i = 0; i < arrayVar.length; i++) {
            rotateArrayWithStage(arrayVar, 1, rotateStage);
            int sumFor = findSum(arrayVar, arrayVar.length - 1);
            max = Math.max(max, sumFor);
            //System.out.printf("Array %s, Sum : %d.\n", Arrays.toString(arrayVar), sumFor);
        }
        return max;
    }

    public int maxValue(int[] arrayVar, int rotationTimes, RotateStage rotateStage) {
        rotateArrayWithStage(arrayVar, rotationTimes, rotateStage);
        return findSum(arrayVar);
    }

    private int findSum(int[] elements, int index) {
        if (index > 0) {
            return index * elements[index] + findSum(elements, index - 1);
        }
        return 0;
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

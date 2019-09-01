package com.tester.algorithm.array;

import com.tester.algorithm.array.util.RotateStage;
import com.tester.sort.SortUtils;
import org.junit.Assert;
import org.junit.Test;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class FindMaximumValueOfSumTest {

    FindMaximumValueOfSum thisInstance = new FindMaximumValueOfSum();

    @Test
    public void shouldGiveTheMaximumValueOfSumAfterRotation() {
        int[] elements = {1, 20, 2, 10};
        int rotationTimes = 2;
        int maxValue = thisInstance.maxValue(elements, rotationTimes, RotateStage.RIGHT);
        Assert.assertEquals(72, maxValue);
    }

    @Test
    public void shouldReturnZeroForEmptyArray() {
        int[] elements = {};
        int rotationTimes = 2;
        int maxValue = thisInstance.maxValue(elements, rotationTimes, RotateStage.RIGHT);
        Assert.assertEquals(0, maxValue);
    }

    @Test
    public void shouldCalculateTheSumOfNonRotatingArray() {
        int[] elements = {1, 2, 3};
        int rotationTimes = 0;
        int maxValue = thisInstance.maxValue(elements, rotationTimes, RotateStage.RIGHT);
        Assert.assertEquals(8, maxValue);
    }


    @Test
    public void shouldGiveTheMaximumValueOfSumAfterRotationNItems() {
        int[] elements = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotationTimes = 9;
        int maxValue = thisInstance.maxValue(elements, rotationTimes, RotateStage.RIGHT);
        SortUtils.print(elements);
        Assert.assertEquals(330, maxValue);
    }


    /*

    public int maxValue(int[] elements, int rotationTimes, RotateStage right) {
        if (RotateStage.LEFT.equals(right)) {
            return maxValue(elements, rotationTimes);
        }

        return maxValue1(elements, rotationTimes);
    }

    public int maxValue(int[] arrayVar, int rotationTimes) {

        rotateArray(arrayVar, rotationTimes);
        int sum = 0;
        for (int i = 0; i < arrayVar.length; i++) {
            sum += i * arrayVar[i];
        }


        return sum;
    }
*/

    /*public int maxValue1(int[] arrayVar, int rotationTimes) {

        rotateArray1(arrayVar, rotationTimes);
        int sum = 0;
        for (int i = arrayVar.length - 1; i > 0; i--) {
            sum += i * arrayVar[i];
        }


        return sum;
    }
*/


}
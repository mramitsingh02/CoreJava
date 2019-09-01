package com.tester.algorithm.array;

import com.tester.algorithm.array.util.RotateStage;
import com.tester.sort.SortUtils;
import org.junit.Assert;
import org.junit.Test;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class FindMaximumOfSumValueForAllRotationTest {


    private FindMaximumOfSumValueForAllRotation thisInstance = new FindMaximumOfSumValueForAllRotation();

    @Test
    public void shouldGiveTheMaximumValueOfSumAfterRotation() {
        int[] elements = {1, 20, 2, 10};
        int maxValue = thisInstance.sumValueForEachRotation(elements, RotateStage.RIGHT);
        Assert.assertEquals(72, maxValue);
    }

    @Test
    public void shouldReturnZeroForEmptyArray() {
        int[] elements = {};
        int maxValue = thisInstance.sumValueForEachRotation(elements, RotateStage.RIGHT);
        Assert.assertEquals(0, maxValue);
    }

    @Test
    public void shouldCalculateTheSumOfNonRotatingArray() {
        int[] elements = {1, 2, 3};
        int maxValue = thisInstance.sumValueForEachRotation(elements,  RotateStage.RIGHT);
        Assert.assertEquals(8, maxValue);
    }


    @Test
    public void shouldGiveTheMaximumValueOfSumAfterRotationNItems() {
        int[] elements = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotationTimes = 9;
        int maxValue = thisInstance.sumValueForEachRotation(elements, RotateStage.RIGHT);
        SortUtils.print(elements);
        Assert.assertEquals(330, maxValue);
    }


}
package com.tester.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class FindRotationCountTest {
    private FindRotationCount thisInstance = new FindRotationCount();

    @Test
    public void shouldFindTheNumberOfRotationCountInPivot() {
        int[] elements = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int min = thisInstance.countRotation(elements);
        Assert.assertEquals(6, min);

    }

    @Test
    public void shouldFindTheNumberOfRotationCount() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = thisInstance.countRotation(elements);
        Assert.assertEquals(-1, min);

    }


}
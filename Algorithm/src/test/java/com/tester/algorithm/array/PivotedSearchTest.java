package com.tester.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class PivotedSearchTest {
    PivotedSearch thisInstance = new PivotedSearch();


    @Test
    public void shouldFindTheIndexOfExistingElementInGivenArray() {
        int[] input = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        Assert.assertEquals(thisInstance.pivotBinarySearch(input, 3), 8);
    }


    @Test
    public void shouldFindTheIndexOfNotExistingElementInGivenArray() {
        int[] input = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        Assert.assertEquals(thisInstance.pivotBinarySearch(input, 12), -1);
    }
    @Test
    public void shouldFindTheElementInSortedArray() {
        int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertEquals(thisInstance.pivotBinarySearch(input, 6), 5);
    }
}
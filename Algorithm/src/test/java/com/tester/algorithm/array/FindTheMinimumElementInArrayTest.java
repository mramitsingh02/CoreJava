package com.tester.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class FindTheMinimumElementInArrayTest {
    FindTheMinimumElementInArray thisInstance = new FindTheMinimumElementInArray();

    @Test
    public void shouldFindMinimumElement(){
        int [] arrayVar = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int minimumElement = thisInstance.findMinimumElement(arrayVar);
        Assert.assertEquals(1, minimumElement);

    }    @Test
    public void shouldFindMinimumElementInLinearArray(){
       int [] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int minimumElement = thisInstance.findMinimumElement(elements);
        Assert.assertEquals(1, minimumElement);

    }
}
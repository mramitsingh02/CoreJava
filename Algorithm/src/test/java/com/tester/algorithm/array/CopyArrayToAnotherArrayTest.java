package com.tester.algorithm.array;

import com.tester.sort.SortUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class CopyArrayToAnotherArrayTest {

    @Test
    public void shouldCopyTheArray(){

        CopyArrayToAnotherArray thisInstance = new CopyArrayToAnotherArray();

        int[] copy = thisInstance.copy(SortUtils.elements);
        Assert.assertArrayEquals(SortUtils.elements, copy);

    }

}
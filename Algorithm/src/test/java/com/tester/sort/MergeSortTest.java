package com.tester.sort;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class MergeSortTest {
    private static int[] elements;
    private static int[] expected;
    MergeSort thisInstance = new MergeSort();

    @BeforeClass
    public static void setUp() {
        int length = 10000;
        Random random = new Random(1000);
        elements = new int[length];
        expected = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = random.nextInt();
            elements[i] = expected[i] = temp;
        }
        Arrays.sort(expected);
    }

    @Test
    public void shouldSortGivenInput() {
        int[] elements = {18, 9, 33, 4, 84, 32};
        int[] expected = {4, 9, 18, 32, 33, 84};
        thisInstance.sort(elements, 0, elements.length - 1);
        Assert.assertArrayEquals(expected, elements);
    }

    @Test(timeout = 100)
    public void shouldSortGiveLongInputWithGiveTimePeriod() {
        thisInstance.sort(elements, 0, elements.length - 1);
        Assert.assertArrayEquals(expected, elements);
    }


}
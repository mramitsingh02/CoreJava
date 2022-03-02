package com.tester.sort;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class BubbleSortTest {
    BubbleSort thisInstance = new BubbleSort();
    private static int[] elements;
    private static int[] expected;

    @Test
    public void shouldSortGivenInput() {
        int[] elements = {18, 9, 33, 4, 84, 32};
        int[] expected = {4, 9, 18, 32, 33, 84};
        thisInstance.sort(elements);
        Assert.assertArrayEquals(expected, elements);
    }

    @BeforeClass
    public static void setUp() {
        int length = 100;
        Random random = new Random(1000);
        elements = new int[length];
        expected = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = random.nextInt();
            elements[i] = expected[i] = temp;
        }
        Arrays.sort(expected);
    }

    @Test(timeout = 200)
    public void shouldSortGiveLongInputWithGiveTimePeriod() {
        thisInstance.sort(elements);
        Assert.assertArrayEquals(expected, elements);
    }


}
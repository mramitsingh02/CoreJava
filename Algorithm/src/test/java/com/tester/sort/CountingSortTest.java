package com.tester.sort;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class CountingSortTest {
    private static int[] elements;
    private static int[] expected;
    private static int range;
    CountingSort thisInstance = new CountingSort();

    @BeforeClass
    public static void setUp() {
        int length = 10000;
        Random random = new Random();
        elements = new int[length];
        expected = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = random.nextInt(999);
            elements[i] = expected[i] = temp;
        }
        Arrays.sort(expected);
        int minNumber = Arrays.stream(expected).min().getAsInt();
        int maxNumber = Arrays.stream(expected).max().getAsInt();
        range = (maxNumber - minNumber) + 1;

    }

    @Test
    public void shouldSortGivenInput() {
        int[] elements = SortUtils.elements;
        thisInstance.sort(elements, 122);
        Assert.assertArrayEquals(SortUtils.expected, elements);
    }

    @Test(timeout = 100)
    public void shouldSortGiveLongInputWithGiveTimePeriod() {
        thisInstance.sort(elements, range);
        Assert.assertArrayEquals(expected, elements);
    }


}
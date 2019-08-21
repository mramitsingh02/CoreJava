package com.tester.algorithm.array;

import com.tester.sort.SortUtils;
import org.junit.Test;

import static org.junit.Assert.*;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class Find3rdLargestNumberTest {
    Find3rdLargestNumber thisInstance = new Find3rdLargestNumber();
    @Test
    public void largestNumber() {
        int number = thisInstance.largestNumber(SortUtils.DUPLICATE_ELEMENTS, 3);
        assertEquals(9, number);
    }
}
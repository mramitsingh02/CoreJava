package com.tester.search;

import com.tester.sort.SortUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class LinearSearchTest {
    LinearSearch thisInstance = new LinearSearch();

    @Test
    public void shouldFindValueInGivenArrayForExistingNumber() {
        assertTrue(thisInstance.search(SortUtils.elements, 5));
    }

    @Test
    public void shouldNotFindValueInGivenArrayifNotExist() {
        assertFalse(thisInstance.search(SortUtils.elements, 3));
    }

}
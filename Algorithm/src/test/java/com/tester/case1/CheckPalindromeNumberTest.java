package com.tester.case1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckPalindromeNumberTest {
    CheckPalindromeNumber checkPalindromeNumber = new CheckPalindromeNumber();

    @Test
    public void shouldPassForZero() {
        Assert.assertTrue(checkPalindromeNumber.check(0));
    }

    @Test
    public void shouldPassForNegativeNumber() {
        Assert.assertTrue(checkPalindromeNumber.check(-12321));
    }


    @Test
    public void shouldPassForPalindromeNumber() {
        Assert.assertTrue(checkPalindromeNumber.check(12321));
    }

    @Test
    public void shouldFailForNonPalindromeNumber() {
        Assert.assertFalse(checkPalindromeNumber.check(1232));
    }

}
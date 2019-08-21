package com.tester.case1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckArmstrongNumberTest {
    CheckArmstrongNumber thisInstance = new CheckArmstrongNumber();
    @Test
    public void shouldCheckTheArmStrongForValideNumber() {
        Assert.assertTrue(thisInstance.check(153));
        Assert.assertTrue(thisInstance.check(371));
    }

    @Test
    public void shouldCheckTheArmStrongForNotValidNumber() {
        Assert.assertFalse(thisInstance.check(22));
    }

    @Test
    public void shouldCheckTheArmStrongForZero() {
        Assert.assertFalse(thisInstance.check(0));
    }

    @Test
    public void shouldCheckTheArmStrongForNegative() {
        Assert.assertFalse(thisInstance.check(-153));
    }


}
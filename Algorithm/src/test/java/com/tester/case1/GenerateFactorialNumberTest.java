package com.tester.case1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class GenerateFactorialNumberTest {
GenerateFactorialNumber generateFactorialNumber= new GenerateFactorialNumber();

    @Test
    public void shouldGenerateFactorialForPositiveNumber(){
        int value = generateFactorialNumber.factorial(5).intValue();
        int value1 = generateFactorialNumber.factorial(0).intValue();
        assertEquals(120, value);
        assertEquals(1, value1);
    }
    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionForNegativeNumberFactorialGeneration(){
        int value = generateFactorialNumber.factorial(-10).intValue();
    }

}
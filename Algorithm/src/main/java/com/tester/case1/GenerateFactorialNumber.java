package com.tester.case1;

import java.math.BigInteger;

public class GenerateFactorialNumber {
    public static void main(String[] args) {
        GenerateFactorialNumber factorialNumber = new GenerateFactorialNumber();
        BigInteger bigInteger = factorialNumber.factorial(10000);
        System.out.println(bigInteger.toString());


    }

    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new RuntimeException("Negative Number not allowed.");
        }
        if (number == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(number).multiply(factorial(number - 1));
        return result;
    }
}

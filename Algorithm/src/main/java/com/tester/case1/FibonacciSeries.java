package com.tester.case1;

import java.math.BigInteger;

public class FibonacciSeries {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 50; i++) {
            BigInteger fibonacci = fibonacci(i);
            System.out.print(i + "=(" + fibonacci.intValue() + ") ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time Diff : " + (endTime - startTime) + "ms.");

    }

    public static BigInteger fibonacci(int fNumber) {
        if (fNumber == 0) {
            return BigInteger.ZERO;
        } else if (fNumber == 1 || fNumber == 2) {
            return BigInteger.ONE;
        }

        return fibonacci(fNumber - 1).add(fibonacci(fNumber - 2));
    }

}

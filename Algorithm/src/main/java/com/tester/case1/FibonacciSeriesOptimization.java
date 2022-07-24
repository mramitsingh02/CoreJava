package com.tester.case1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSeriesOptimization {
    public static final Map<Integer, BigInteger> mapBigInteger = new HashMap<>();

    static {
        mapBigInteger.put(1, BigInteger.ONE);
        mapBigInteger.put(2, BigInteger.ONE);
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 50; i++) {
            BigInteger fibonacci = fibonacci(i);
            System.out.print( i+ "=("+fibonacci.toString() + ") ");
        }
        long endTime = System.currentTimeMillis();

        System.out.println();
        System.out.println("Time Diff : " + (endTime - startTime) + "ms.");

    }


    public static BigInteger fibonacci(int fNumber) {
        if (fNumber == 1 || fNumber == 2) {
            return mapBigInteger.get(fNumber);// if the fNumber is 1 or 2 then get from cache.
        }
        return getAndPut(fNumber - 1).add(getAndPut(fNumber - 2));
    }

    private static BigInteger getAndPut(int fNumber) {
        BigInteger number;
        //Get from the cache if present
        if ((number = mapBigInteger.get(fNumber)) != null) {
            return number;
        } else {
            // if not calculate & set in cache.
            number = fibonacci(fNumber);
            mapBigInteger.put(fNumber, number);
        }
        return number;
    }

}

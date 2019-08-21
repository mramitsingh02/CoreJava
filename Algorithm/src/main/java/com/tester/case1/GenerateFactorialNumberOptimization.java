package com.tester.case1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class GenerateFactorialNumberOptimization {


    Map<Integer, BigInteger> cacheMap = new HashMap<>();

    {
        cacheMap.put(0, BigInteger.ONE);
        cacheMap.put(1, BigInteger.ONE);
        cacheMap.put(2, BigInteger.TWO);
    }

    public static void main(String[] args) {
        GenerateFactorialNumberOptimization factorialNumber = new GenerateFactorialNumberOptimization();
        BigInteger bigInteger = factorialNumber.factorial(6);
        System.out.println(bigInteger.toString());


    }

    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new RuntimeException("Negative Number not allowed.");
        }
        return BigInteger.valueOf(number).multiply(getAndLoad(number - 1));
    }

    private BigInteger getAndLoad(int number) {
        if (cacheMap.containsKey(number)) {
            return cacheMap.get(number);
        } else {
            BigInteger factorial = factorial(number);
            cacheMap.put(number, factorial);
            return factorial;
        }
    }
}